package org.justin.condiment.thecondimentmod.entity.client;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class TheMayoMonsterModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart lowerleftarm;
	private final ModelPart lowerrightarm;
	private final ModelPart upperrightarm;
	private final ModelPart upperleftarm;
	private final ModelPart teeth;
	private final ModelPart head;

	public TheMayoMonsterModel(ModelPart root) {
		this.body = root.getChild("body");
		this.torso = root.getChild("body").getChild("torso");
		this.lowerleftarm = root.getChild("body").getChild("lowerleftarm");
		this.lowerrightarm = root.getChild("body").getChild("lowerrightarm");
		this.upperrightarm = root.getChild("body").getChild("upperrightarm");
		this.upperleftarm = root.getChild("body").getChild("upperleftarm");
		this.teeth = root.getChild("body").getChild("teeth");
		this.head = root.getChild("body").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 6.0F, -1.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-10.0F, 3.0F, 0.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(24, 31).addBox(-9.0F, -1.75F, 1.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(30, 15).addBox(-9.0F, 1.25F, 1.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -9.0F, -5.0F));

		PartDefinition lowerleftarm = body.addOrReplaceChild("lowerleftarm", CubeListBuilder.create(), PartPose.offset(-9.926F, -7.7464F, 3.771F));

		PartDefinition cube_r1 = lowerleftarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 28).addBox(-3.0F, -1.0F, -0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.25F, 0.0F, 0.9599F, 0.0436F));

		PartDefinition lowerrightarm = body.addOrReplaceChild("lowerrightarm", CubeListBuilder.create(), PartPose.offset(9.25F, -5.5F, 0.5F));

		PartDefinition cube_r2 = lowerrightarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 8).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.2253F, 0.1745F));

		PartDefinition upperrightarm = body.addOrReplaceChild("upperrightarm", CubeListBuilder.create(), PartPose.offset(7.5F, -6.0F, 0.0F));

		PartDefinition cube_r3 = upperrightarm.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 0).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition upperleftarm = body.addOrReplaceChild("upperleftarm", CubeListBuilder.create(), PartPose.offset(-4.0F, -7.5F, 0.0F));

		PartDefinition cube_r4 = upperleftarm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 4).addBox(-5.0F, -2.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, -0.1745F));

		PartDefinition teeth = body.addOrReplaceChild("teeth", CubeListBuilder.create(), PartPose.offset(0.0F, -10.75F, 4.0F));

		PartDefinition cube_r5 = teeth.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = teeth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = teeth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = teeth.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r9 = teeth.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r10 = teeth.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.0F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(0.25F, 1.5F, 4.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 4).addBox(-6.5F, 1.5F, 4.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -15.75F, -5.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.75F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(6, 41).addBox(1.0F, -1.1F, -1.0F, 0.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 4.0F, 7.75F, -0.0873F, -1.5708F, 0.0873F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 28).addBox(-7.0F, 3.0F, -1.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return body;
	}
}