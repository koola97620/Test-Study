package me.jdragon.atddtest.chapter01.dao;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import me.jdragon.atddtest.chapter01.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

/**
 * @author choijaeyong on 2020/02/13.
 * @project atddtest
 * @description
 */

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {

  Station save(Station station);

  List<Station> findAll();

  Optional<Station> findByName(String name);

  @Transactional
  @Modifying
  void deleteByName(String name);

}
