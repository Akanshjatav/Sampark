package com.Akansh.Sampark.Repository;

import com.Akansh.Sampark.Models.Notification;
import com.Akansh.Sampark.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifDAO extends JpaRepository<Notification, Long> {
}
