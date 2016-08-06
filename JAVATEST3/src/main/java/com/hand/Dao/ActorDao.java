package com.hand.Dao;

import java.util.List;

import com.hand.Entity.Actor;

public interface ActorDao {
 public List<Actor> getActors(int pagesize,int pageindex);
}
