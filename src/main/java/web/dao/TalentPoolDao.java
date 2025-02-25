package web.dao;

import java.util.List;

import web.entity.TalentPool;

public interface TalentPoolDao {

	public TalentPool findTalentPoolById(int talentPoolId);

	public List<TalentPool> getTalentPools();

	public Integer addTalentPool(TalentPool talentPool);

	public Integer deleteTalentPoolById(int talentPoolId);

	public Integer updateTalentPool(TalentPool talentPool);

}
