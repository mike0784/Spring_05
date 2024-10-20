package repository;

import models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    public List<UserEntity> findAll();

    public Optional<UserEntity> findById(Long id);

    public UserEntity save(UserEntity user);

    public void deleteById(Long id);

}
