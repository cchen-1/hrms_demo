package web.service;

import java.util.List;

import web.entity.Recruit;

public interface RecruitService {

	// 获取所有Recruit实体
	public List<Recruit> getAllRecruits();

	// 传入一个Recruit实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addRecruit(Recruit recruit);

	// 传入一个Recruit实体，使表中与recruitId匹配的数据更新为传入Recruit实体的数据，并返回结果信息int（受影响行数）
	public int updateRecruit(Recruit recruit);

	// 通过recruitId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteRecruit(int recruitId);

}
