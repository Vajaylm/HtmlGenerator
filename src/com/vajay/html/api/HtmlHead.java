package com.vajay.html.api;

public class HtmlHead extends HtmlElement {

	public HtmlHead(int indentSpaceCount, int indentDepth) {
		super(indentSpaceCount, indentDepth);
	}

	@Override
	protected String getTagName() {
		return "head";
	}

}
