package sn.isi.adminapp.mapping;

import org.mapstruct.Mapper;
import sn.isi.adminapp.dto.AppRoles;
import sn.isi.adminapp.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    // passage du DTO a l'entites
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    // passage de l'entites au DTO
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
