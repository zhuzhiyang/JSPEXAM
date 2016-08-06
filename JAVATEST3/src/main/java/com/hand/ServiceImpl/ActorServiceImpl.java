package com.hand.ServiceImpl;

import java.util.List;

import com.hand.Dao.ActorDao;
import com.hand.DaoImpl.ActorDaoImpl;
import com.hand.Entity.Actor;
import com.hand.Service.ActorService;

public class ActorServiceImpl implements ActorService {
   ActorDao ad=new ActorDaoImpl();
	public List<Actor> getActors(int pagesize,int pageindex) {
		return ad.getActors(pagesize,pageindex);
	}

	public Actor findActorById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertActor(Actor a) {
		// TODO Auto-generated method stub

	}

	public void updateActor(Actor a) {
		// TODO Auto-generated method stub

	}

}
