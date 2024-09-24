package org.jsp.THExamen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.jsp.THExamen.Entity.User;

public interface userRepository extends JpaRepository<User, Integer> {
	
	

}
