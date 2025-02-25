package web.dao;

import java.util.List;

import web.entity.Welfare;

public interface WelfareDao {

	public Welfare findWelfareByName(String name); // 根据名字查，非ID

	public List<Welfare> getWelfares();

	public Integer addWelfare(Welfare welfare);

	public Integer deleteWelfareById(int welfareId);

	public Integer updateWelfare(Welfare welfare);
}
