package com.portfolio.portfolioBackend.securityRepository;

import com.portfolio.portfolioBackend.securityModels.ERole;
import com.portfolio.portfolioBackend.securityModels.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}