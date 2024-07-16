package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.servicio.UsuarioServicio;
import org.springframework.security.core.Authentication;

@Controller
@RequestMapping("/")

public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index";
	}
    @GetMapping("/index/nuevo")
    public String crearUsuario(Model modelo){
        Usuario usuario = new Usuario();
        modelo.addAttribute("usuario", usuario);
        return "registro";
    }

	 @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/perfil")
    public String verPerfil(Model modelo, Authentication authentication) {
        Usuario usuario = (Usuario) authentication.getPrincipal();
        modelo.addAttribute("usuario", usuario);
        modelo.addAttribute("historialSubastas", usuario.getHistorialSubastas());
        return "perfil";
    }

    @PostMapping("/perfil/actualizar")
    public String actualizarPerfil(@ModelAttribute("usuario") Usuario usuarioActualizado, Authentication authentication) {
        Usuario usuario = (Usuario) authentication.getPrincipal();
        usuario.setNombre(usuarioActualizado.getNombre());
        usuario.setApellido(usuarioActualizado.getApellido());
        usuario.setDireccion(usuarioActualizado.getDireccion());
        usuario.setTelefono(usuarioActualizado.getTelefono());
        usuarioServicio.guardar(usuario);
        return "redirect:/perfil?exito";
    }
}
