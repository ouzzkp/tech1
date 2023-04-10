package tech1.Core.Utilities.Auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech1.Core.Entities.User;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);

}



