package fmi.plovdiv.trvaelagency.repository;

import fmi.plovdiv.trvaelagency.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
