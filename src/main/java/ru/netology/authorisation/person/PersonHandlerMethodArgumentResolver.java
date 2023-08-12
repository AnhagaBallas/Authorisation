package ru.netology.authorisation.person;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class PersonHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(Person.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter,
                                  ModelAndViewContainer modelAndViewContainer,
                                  NativeWebRequest nativeWebRequest,
                                  WebDataBinderFactory webDataBinderFactory) throws Exception {
        String user = nativeWebRequest.getParameter("user");
        String password = nativeWebRequest.getParameter("password");

        if (isNotSet(user)) {
            user = " ";
        }

        if (isNotSet(password)) {
            password = " ";
        }

        return new Person(user, password);
    }

    private boolean isNotSet(String value) {
        return value == null;
    }
}
