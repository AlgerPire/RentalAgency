package com.example.rentalAgency.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "reservation_date_of_booking")
    private LocalDate dateOfBooking;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "reservation_rental_date")
    private LocalDate rentalDate;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "reservation_return_date")
    private LocalDate returnDate;

    @Column(name = "reservation_total_amount")
    private Integer totalAmount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;

    @OneToOne(fetch = FetchType.EAGER)
    private Employee employee;



}
