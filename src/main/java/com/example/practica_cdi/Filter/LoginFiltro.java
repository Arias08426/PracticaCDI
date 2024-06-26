package com.example.practica_cdi.Filter;

import com.example.practica_cdi.Service.Impl.LoginServiceSessionimpl;
import com.example.practica_cdi.Service.LoginService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebFilter({"/students"})//urls que deseamos aplique el filtro
//si queremos implementar varias pondriamos:
//@WebFilter({"/students", “/teachers”,”subjects”})
public class LoginFiltro implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain
            chain) throws IOException, ServletException {
        LoginService service = new LoginServiceSessionimpl();
        Optional<String> username = service.getUsername((HttpServletRequest)
                request);
        if (username.isPresent()) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse)response).sendError(HttpServletResponse.SC_UNAUTHORIZED,
                    "No estás autorizado para ingresar a esta página!");
        }
    }
}

