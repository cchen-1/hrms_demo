package web.service;

import java.util.List;

import web.entity.TalentPool;

public interface TalentPoolService {

	public TalentPool findTalentPoolById(int talentPoolId);

	public List<TalentPool> getTalentPools();

	public int addTalentPool(TalentPool talentPool);

	public int deleteTalentPoolById(int talentPoolId);

	public int updateTalentPool(TalentPool talentPool);

}
