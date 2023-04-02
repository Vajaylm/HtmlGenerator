package com.vajay.html.api;

public class HtmlBody extends HtmlElement {

	public HtmlBody(int indentSpaceCount) {
		super(indentSpaceCount, 1);
	}

	@Override
	protected String getTagName() {
		return "body";
	}

}
