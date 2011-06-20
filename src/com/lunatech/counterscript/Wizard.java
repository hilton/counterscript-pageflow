package com.lunatech.counterscript;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.log.Log;

@Name("wizard")
@Scope(ScopeType.CONVERSATION)
public class Wizard implements Serializable {

	private static final long serialVersionUID = -199650583914569697L;

	private int step;

	@Logger
	private Log log;

	public int getStep() {
		return step;
	}

	public void cancel() {
		log.info("cancel()");
	}

	// Alternative way to start page-flow
	// @Begin(pageflow = "counterscript")
	public void start() {
		log.info("start()");
		step = 1;
	}

	public void proceed() {
		log.info("proceed()");
		step++;
	}
}
