package dev.nampd.realnote.service.impl;

import dev.nampd.realnote.model.entity.Role;
import dev.nampd.realnote.repository.RoleRepository;
import dev.nampd.realnote.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public Role findRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}
