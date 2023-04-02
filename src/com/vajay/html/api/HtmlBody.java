package com.vajay.html.api;

public class HtmlBody extends HtmlElement {

	public HtmlBody(int indentSpaceCount, int indentDepth) {
		super(indentSpaceCount, indentDepth);
	}

	@Override
	protected String getTagName() {
		return "body";
	}

}
