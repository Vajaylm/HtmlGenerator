package com.vajay.html.api;

public class HtmlTableRow extends HtmlElement {

	public HtmlTableRow() {
		super(null);
	}

	@Override
	protected String getTagName() {
		return "tr";
	}

}
