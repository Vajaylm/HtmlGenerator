package com.vajay.html.api;

public class HtmlTableCell extends HtmlElement {

	public HtmlTableCell(String text) {
		super(text);
	}

	@Override
	protected String getTagName() {
		return "td";
	}

}
