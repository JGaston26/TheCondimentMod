package org.justin.condiment.thecondimentmod.entity.animations;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class ModAnimationDefinitions {

	public static final AnimationDefinition ATTACK = AnimationDefinition.Builder.withLength(1.0416767f).looping()
.addAnimation("head",
					  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(10f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
								  new AnimationChannel(AnimationChannel.Targets.POSITION,
		new Keyframe(0.041676664f, KeyframeAnimations.posVec(0f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, 1f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 1.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0f, 1.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0f, 2.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 0.99f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("bone",
								  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, -22.5f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(1.31f, -5.12f, -7f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(1.39f, -20.12f, -7.36f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.degreeVec(2.46f, -38.04f, -11.6f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.46f, -38.04f, -11.6f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerrightarm",
								  new AnimationChannel(AnimationChannel.Targets.POSITION,
		new Keyframe(0.041676664f, KeyframeAnimations.posVec(0f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, 1f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 1.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0f, 1.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0f, 2.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 0.99f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerrightarm",
								  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, -22.5f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(1.31f, -5.12f, -7f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(1.39f, -20.12f, -7.36f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.degreeVec(2.46f, -38.04f, -11.6f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(0.5f, -20.82f, -2.63f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(3.29f, -10.32f, -17.8f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(0f, -18.33f, 0f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("upperrightarm",
								  new AnimationChannel(AnimationChannel.Targets.POSITION,
		new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, 0.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 1.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0f, 2.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0f, 2f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 1.25f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.posVec(0f, 0f, 0.5f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("upperrightarm",
								  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(1.09f, -31.13f, 6.37f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -30f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.degreeVec(1f, -21.13f, 6.57f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(1.1f, -13.5f, -0.82f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.degreeVec(1.17f, -23.49f, -1.03f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(1.15f, -21f, -0.98f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(1.7f, -13.44f, -3.39f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("upperleftarm",
								  new AnimationChannel(AnimationChannel.Targets.POSITION,
		new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, 0.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 1.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0f, 2.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0f, 2f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.posVec(0f, 0f, 1.25f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.posVec(0f, 0f, -0.25f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("upperleftarm",
								  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -18.33f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, -15.83f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(0f, -30f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375f, KeyframeAnimations.degreeVec(1f, -21.13f, 6.57f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(1.1f, -13.5f, -0.82f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.degreeVec(1.17f, -23.49f, -1.03f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(1.17f, -23.08f, -1.02f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(1.66f, -3.44f, -3.1f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
								  new AnimationChannel(AnimationChannel.Targets.POSITION,
		new Keyframe(0f, KeyframeAnimations.posVec(0.75f, -0.25f, -1.25f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.041676664f, KeyframeAnimations.posVec(-0.2f, -0.1f, -2.09f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.08343333f, KeyframeAnimations.posVec(0.5f, -0.25f, -1.5f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.20834334f, KeyframeAnimations.posVec(-0.75f, -0.25f, -0.76f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 0.2f, -0.41f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4583433f, KeyframeAnimations.posVec(0.75f, -0.02f, 0.34f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5834334f, KeyframeAnimations.posVec(0.25f, 0f, 0.24f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.posVec(0.19f, -0.12f, 0.12f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75f, KeyframeAnimations.posVec(-0.25f, -0.5f, -1.01f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.posVec(-0.38f, -0.5f, -1.26f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9583434f, KeyframeAnimations.posVec(-0.75f, 0f, -1.26f),
	AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
								  new AnimationChannel(AnimationChannel.Targets.ROTATION,
		new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 12.5f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(1.33f, 12.37f, -6.6f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.20834334f, KeyframeAnimations.degreeVec(1.3f, -2.63f, -6.95f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(1.95f, -7.06f, -10.32f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(1.95f, 6.93f, -9.84f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 7.5f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, 15f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75f, KeyframeAnimations.degreeVec(0f, 2.5f, 0f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.7916766f, KeyframeAnimations.degreeVec(-0.97f, 0.98f, -0.7f),
	AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, -20f, 0f),
	AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(1.375f).looping()
			.addAnimation("upperleftarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(0f, -4.93f, -17.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, 10.85f, -17.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, -2.41f, -17.5f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083433f, KeyframeAnimations.degreeVec(0f, 10f, -17.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("upperrightarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 10f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(0f, -2.5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, 15f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, -5f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083433f, KeyframeAnimations.degreeVec(0f, 5f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerrightarm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-2f, 0f, -1f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerrightarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 45f, 65f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(0f, 75f, 65f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.625f, KeyframeAnimations.degreeVec(0f, 25f, 65f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, 70f, 65f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083433f, KeyframeAnimations.degreeVec(0f, 30f, 65f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(1.75f, -3.25f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-220f, 62.5f, -115f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.2916767f, KeyframeAnimations.degreeVec(-249.31f, 71.5f, -146.63f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.625f, KeyframeAnimations.degreeVec(-206.17f, 47.7f, -98.31f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(-256.62f, 72.24f, -154.31f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2083433f, KeyframeAnimations.degreeVec(-205.03f, 45.44f, -96.74f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(0f)
			.addAnimation("lowerrightarm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(-2f, 0.5f, -0.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerrightarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(7.5f, 62.5f, 77.5f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0.75f, -2f, -1.75f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("lowerleftarm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-199.09f, 61.37f, -80.4f),
									AnimationChannel.Interpolations.LINEAR))).build();
}
