package web.service;

import java.util.List;

import web.entity.Welfare;

public interface WelfareService {

	public Welfare findWelfareByName(String name);

	public List<Welfare> getWelfares();

	public int addWelfare(Welfare welfare);

	public int deleteWelfareById(int welfareId);

	public int updateWelfare(Welfare welfare);
}
