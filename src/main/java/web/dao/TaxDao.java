package web.dao;

import java.util.List;

import web.entity.Tax;

public interface TaxDao {
	public Tax findTaxById(int taxId);

	public List<Tax> getTaxs();

	public Integer addTax(Tax tax);

	public Integer deleteTaxById(int taxId);

	public Integer updateTax(Tax tax);
}
