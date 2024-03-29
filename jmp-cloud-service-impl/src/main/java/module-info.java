module jmp.cloud.service.impl {

    requires transitive jmp.service.api;

    requires jmp.dto;

    requires jmp.cmn.exceptions;

    uses com.epam.learn.jmp.service.api.Service;

    exports com.epam.learn.jmp.service.impl;

    provides com.epam.learn.jmp.service.api.Service with com.epam.learn.jmp.service.impl.ServiceImpl;

}