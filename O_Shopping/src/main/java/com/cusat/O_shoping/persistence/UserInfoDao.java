package com.cusat.O_shoping.persistence;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cusat.O_shoping.model.UserInfo;
public interface UserInfoDao extends JpaRepository<UserInfo,BigInteger> {

}
