package com.lxs.legou.security.dao;

import com.lxs.legou.core.dao.ICrudDao;
import com.lxs.legou.security.po.Role;
import com.lxs.legou.security.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RoleDao extends ICrudDao<Role> {

    /**
     * 删除用户角色关联
     *
     * @param id
     * @return
     */
    int deleteUserByRole(Long id);

    /**
     * 关联角色用户
     *
     * @param userId
     * @param roleId
     * @return
     */
    int insertUserAndRole(@Param("userId") Long userId, @Param("roleId") Long roleId);

    /**
     * 删除权限菜单关联
     *
     * @param id
     * @return
     */
    int deleteMenuByRole(Long id);

    /**
     * 关联角色和菜单
     *
     * @param menuId
     * @param roleId
     * @return
     */
    int insertMenuAndRole(@Param("menuId") Long menuId, @Param("roleId") Long roleId);

    /**
     * 查询角色的用户
     *
     * @param id
     * @return
     */
    List<User> selectUserByRole(Long id);

}
