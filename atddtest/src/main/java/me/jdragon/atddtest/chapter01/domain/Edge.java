package me.jdragon.atddtest.chapter01.domain;

import static javax.persistence.FetchType.LAZY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "edges")
public class Edge {	// 구간 (ex. A역 ↔︎ B역)

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne(fetch = LAZY)
  private Line line;

  private int elapsedTime;	// 소요시간(분)

  private int distance;		// 거리(km)

  // ???
  @OneToOne(fetch = LAZY)
  private Station sourceStation;

  @OneToOne(fetch = LAZY)
  private Station targetStation;

  // 이 구간에 2개 역을 등록
  public void setStations(Station sourceStation, Station targetStation) {
    this.sourceStation = sourceStation;
    this.targetStation = targetStation;
  }

  public void setLine(final Line line) {
    this.line = line;
  }
}
