package com.mars.mars_backend.Interface;


import com.mars.mars_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM  user",nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = "SELECT * FROM  user a  WHERE   a.user_id = ?1",nativeQuery = true)
    User searchUserByID(Long id);

    @Query(value = "SELECT * FROM  user a  WHERE   a.email = ?1",nativeQuery = true)
    User searchUserByEmail(String email);

    @Transactional
    @Modifying
    @Query(value="UPDATE user SET name = :name,email=:email,is_researcher=:isResearcher,user_type=:userType,institute=:institute,address=:address, image=:img  WHERE user_id= :id",nativeQuery = true)
    int updateUser(Long id, String name, String email, Boolean isResearcher,String userType,String institute,String address ,String img);

}
