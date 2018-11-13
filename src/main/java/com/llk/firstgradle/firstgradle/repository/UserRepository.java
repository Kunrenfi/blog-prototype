package com.llk.firstgradle.firstgradle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.llk.firstgradle.firstgradle.domain.User;

/*
 * User Repository 接口
 */
public interface UserRepository extends CrudRepository<User,Long> {

}
