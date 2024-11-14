package com.Akansh.Sampark.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Timestamp;
@Data
@Entity(name = "Notification")
@Table(name="notification")
public class Notification {

    @Id
    @SequenceGenerator(name = "notification_sequence", sequenceName = "notification_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notification_sequence")
    private long notifId;
    private Date date;
    private NotifType type;
    private String body;
    private Timestamp stamp;
    @ManyToOne
    @JoinColumn(name="UserID")
    private User user;




}

