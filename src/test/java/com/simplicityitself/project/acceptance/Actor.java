package com.simplicityitself.project.acceptance;

import com.simplicityitself.project.acceptance.steps.Question;

public class Actor {
	public <T> T seesThat(Question<T> question) {
		return question.answeredBy(this);
	}
}
