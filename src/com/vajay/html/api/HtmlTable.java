package com.vajay.html.api;

public class HtmlTable extends HtmlElement {

	public HtmlTable() {
		super(null);
	}

	@Override
	protected String getTagName() {
		return "table";
	}

}
