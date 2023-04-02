package com.vajay.html.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HtmlElement {
	protected Map<String, String> properties;
	protected List<HtmlElement> childElements;
	protected int indentSpaceCount;
	protected int indentDepth;
	protected String text;

	{
		properties = new HashMap<>();
		childElements = new ArrayList<>();
		this.indentSpaceCount = 5;
		this.indentDepth = 1;
		this.text = null;
	}

	public HtmlElement(String text) {
		this.text = text;
	}

	public HtmlElement(int indentSpaceCount, int indentDepth) {
		this.indentSpaceCount = indentSpaceCount;
		this.indentDepth = indentDepth;
	}

	public HtmlElement(int indentSpaceCount, int indentDepth, String text) {
		this.indentSpaceCount = indentSpaceCount;
		this.indentDepth = indentDepth;
		this.text = text;
	}

	public void addProperty(String name, String value) {
		if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
			return;
		}

		this.properties.put(name, value);
	}

}
