package com.vajay.html.api;

public class HtmlHead extends HtmlElement {

	public HtmlHead(int indentSpaceCount) {
		super(indentSpaceCount, 1);
	}

	@Override
	protected String getTagName() {
		return "head";
	}

}
