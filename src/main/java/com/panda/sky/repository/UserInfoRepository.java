package com.panda.sky.repository;

import com.panda.sky.entity.TUserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * t_user_info repository
 * @author pcongda
 * @version
 */
public interface UserInfoRepository extends PagingAndSortingRepository<TUserInfo,Integer> {

}
