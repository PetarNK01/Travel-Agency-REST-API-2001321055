package fmi.plovdiv.trvaelagency.repository;

import fmi.plovdiv.trvaelagency.holiday.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}
