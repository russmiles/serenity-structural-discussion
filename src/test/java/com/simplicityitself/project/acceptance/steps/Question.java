package com.simplicityitself.project.acceptance.steps;

import com.simplicityitself.project.acceptance.Actor;

public interface Question<T> {
	public T answeredBy(Actor actor);
}
