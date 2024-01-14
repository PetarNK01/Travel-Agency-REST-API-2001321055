package fmi.plovdiv.trvaelagency.repository;

import fmi.plovdiv.trvaelagency.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
