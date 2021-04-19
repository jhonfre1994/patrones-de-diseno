package com.mycompany.strategy.impl;

import com.mycompany.strategy.interfaces.IEstrategia;

public abstract class AnalisisSimple implements IEstrategia {
	
	public void analizar() {
		iniciar();
		saltarZip();
		detener();
	}

	abstract void iniciar();

	abstract void saltarZip();

	abstract void detener();
}
