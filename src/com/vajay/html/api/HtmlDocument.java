package com.vajay.html.api;

public class HtmlDocument {
	private HtmlHead head;
	private HtmlBody body;
	private int indentSpaceCount;

	public HtmlDocument(int indentSpaceCount) {
		this.indentSpaceCount = indentSpaceCount;
		
		int initialIndentDepth = 1;
		this.head = new HtmlHead(this.indentSpaceCount, initialIndentDepth);
		this.body = new HtmlBody(this.indentSpaceCount, initialIndentDepth);
	}

	public void addHeadElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.head.addChildElement(element);
	}

	public void addBodyElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.body.addChildElement(element);
	}

	public void removeHeadElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.head.removeChildElement(element);
	}

	public void removeBodyElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.body.removeChildElement(element);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("<!DOCTYPE html>");
		builder.append(System.lineSeparator());
		builder.append("<html>");
		builder.append(System.lineSeparator());
		builder.append(this.head.toString());
		builder.append(this.body.toString());
		builder.append("</html>");

		return builder.toString();
	}
}
