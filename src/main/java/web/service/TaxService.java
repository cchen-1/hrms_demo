package web.service;

import java.util.List;

import web.entity.Tax;

public interface TaxService {
	public Tax findTaxById(int taxId);

	public List<Tax> getTaxs();

	public int addTax(Tax tax);

	public int deleteTaxById(int taxId);

	public int updateTax(Tax tax);
}
