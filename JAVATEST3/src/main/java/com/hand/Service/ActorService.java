package com.hand.Service;

import java.util.List;

import com.hand.Entity.Actor;

public interface ActorService {
public List<Actor> getActors(int pagesize,int pageindex);
public Actor  findActorById();
public void insertActor(Actor a);
public void updateActor(Actor a);
}
