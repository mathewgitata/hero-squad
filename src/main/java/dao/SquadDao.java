package dao;

import models.Squad;

import java.util.List;

public interface SquadDao {
    boolean addSquad(Squad squad);
    List<Squad> findAllSquads();
    Squad findSquadBySlug(String slug);
}
