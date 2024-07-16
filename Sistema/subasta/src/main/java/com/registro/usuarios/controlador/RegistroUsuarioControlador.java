package com.registro.usuarios.controlador;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {

	private UsuarioServicio usuarioServicio;

	public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {
		return new UsuarioRegistroDTO();
	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {
		usuarioServicio.guardar(registroDTO);
		return "redirect:/registro?exito";
	}

	@GetMapping("/editar/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Usuario> usuario = usuarioServicio.findById(id);
        if (usuario.isPresent()) {
            model.addAttribute("usuario", usuario.get());
            return "editar-usuario";
        } else {
            return "redirect:/usuario";
        }
    }

    @PostMapping("/actualizar/{id}")
    public String updateUsuarios(@PathVariable Long id, @ModelAttribute Usuario usuarioDetails) {
        Optional<Usuario> optionalUsuario = usuarioServicio.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.setNombre(usuarioDetails.getNombre());
            usuario.setApellido(usuarioDetails.getApellido());
            usuario.setEmail(usuarioDetails.getEmail());
            
            // Aca tube que crear un UsuarioRegistroDTO a partir de los detalles del usuario actualizado ya que llamar a la clase no funciona ya que no es una variable sino una instancia
            UsuarioRegistroDTO registroDTO = new UsuarioRegistroDTO();
            registroDTO.setNombre(usuarioDetails.getNombre());
            registroDTO.setApellido(usuarioDetails.getApellido());
            registroDTO.setEmail(usuarioDetails.getEmail());

            usuarioServicio.guardar(registroDTO);
            return "redirect:/usuarios";
        } else {
            return "redirect:/usuarios";
        }
    }

	@GetMapping("/eliminar/{id}")
    public String deleteUsuarios(@PathVariable Long id) {
        usuarioServicio.deleteById(id);
        return "redirect:/usuarios";
    }
}
