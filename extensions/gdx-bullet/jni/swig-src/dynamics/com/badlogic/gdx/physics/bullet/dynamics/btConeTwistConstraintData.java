/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConeTwistConstraintData extends BulletBase {
	private long swigCPtr;
	
	protected btConeTwistConstraintData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConeTwistConstraintData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btConeTwistConstraintData(long cPtr, boolean cMemoryOwn) {
		this("btConeTwistConstraintData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btConeTwistConstraintData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btConeTwistConstraintData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintData value) {
    DynamicsJNI.btConeTwistConstraintData_typeConstraintData_set(swigCPtr, this, btTypedConstraintData.getCPtr(value), value);
  }

  public btTypedConstraintData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btConeTwistConstraintData_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintData(cPtr, false);
  }

  public void setRbAFrame(btTransformFloatData value) {
    DynamicsJNI.btConeTwistConstraintData_rbAFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbAFrame() {
    long cPtr = DynamicsJNI.btConeTwistConstraintData_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setRbBFrame(btTransformFloatData value) {
    DynamicsJNI.btConeTwistConstraintData_rbBFrame_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getRbBFrame() {
    long cPtr = DynamicsJNI.btConeTwistConstraintData_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setSwingSpan1(float value) {
    DynamicsJNI.btConeTwistConstraintData_swingSpan1_set(swigCPtr, this, value);
  }

  public float getSwingSpan1() {
    return DynamicsJNI.btConeTwistConstraintData_swingSpan1_get(swigCPtr, this);
  }

  public void setSwingSpan2(float value) {
    DynamicsJNI.btConeTwistConstraintData_swingSpan2_set(swigCPtr, this, value);
  }

  public float getSwingSpan2() {
    return DynamicsJNI.btConeTwistConstraintData_swingSpan2_get(swigCPtr, this);
  }

  public void setTwistSpan(float value) {
    DynamicsJNI.btConeTwistConstraintData_twistSpan_set(swigCPtr, this, value);
  }

  public float getTwistSpan() {
    return DynamicsJNI.btConeTwistConstraintData_twistSpan_get(swigCPtr, this);
  }

  public void setLimitSoftness(float value) {
    DynamicsJNI.btConeTwistConstraintData_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return DynamicsJNI.btConeTwistConstraintData_limitSoftness_get(swigCPtr, this);
  }

  public void setBiasFactor(float value) {
    DynamicsJNI.btConeTwistConstraintData_biasFactor_set(swigCPtr, this, value);
  }

  public float getBiasFactor() {
    return DynamicsJNI.btConeTwistConstraintData_biasFactor_get(swigCPtr, this);
  }

  public void setRelaxationFactor(float value) {
    DynamicsJNI.btConeTwistConstraintData_relaxationFactor_set(swigCPtr, this, value);
  }

  public float getRelaxationFactor() {
    return DynamicsJNI.btConeTwistConstraintData_relaxationFactor_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    DynamicsJNI.btConeTwistConstraintData_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return DynamicsJNI.btConeTwistConstraintData_damping_get(swigCPtr, this);
  }

  public void setPad(String value) {
    DynamicsJNI.btConeTwistConstraintData_pad_set(swigCPtr, this, value);
  }

  public String getPad() {
    return DynamicsJNI.btConeTwistConstraintData_pad_get(swigCPtr, this);
  }

  public btConeTwistConstraintData() {
    this(DynamicsJNI.new_btConeTwistConstraintData(), true);
  }

}
