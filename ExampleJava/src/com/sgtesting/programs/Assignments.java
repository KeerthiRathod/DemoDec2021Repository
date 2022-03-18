package com.sgtesting.programs;
class desktop {
	String harddrive;
	String storagespace;
	String displaysize;
	String resolution;
}

class laptop {
	String processor ;
    String memory;
    String hardDrive;
    String display ;
}

class mobile {
	String modlename;
	String brand;
	String capacity;
	String Battery;
}

public class Assignments {

	public static void main(String[] args) {
		desktop device=new desktop();
		device.harddrive="solidstatesilver";
		device.storagespace="2GB";
		device.displaysize="2.5inch";
		device.resolution="antiglare";	
		System.out.println("desktopfeatures:"+device.harddrive);
		System.out.println("desktopfeatures:"+device.storagespace);
		System.out.println("desktopfeatures:"+device.displaysize);
		System.out.println("desktopfeatures:"+device.resolution);
		
		laptop material=new laptop();
		material.processor="11th Generation Intel® Core™ i5";
	    material.memory="8GB,2x4GB";
	    material.hardDrive="512GB M.2 PCIe NVMe Solid State Drive";
	    material.display="15.6-inch FHD (1920 x 1080) Anti-glare LED Backlight Non-Touch Narrow Border WVA Display";
		System.out.println("laptop features:"+material.processor);
		System.out.println("laptop features:"+material.memory);
		System.out.println("laptop features:"+material.hardDrive);
		System.out.println("laptop features:"+material.display);
		
		mobile parts=new mobile();
		parts.modlename="Redmi 10 Prime";
		parts.brand="Redmi";
		parts.capacity="64GB Internal storage";
		parts.Battery="6000mAh battery with 18W ";
		System.out.println("mobile  features:"+parts.modlename);
		System.out.println("mobile  features:"+parts.brand);
		System.out.println("mobile  features:"+parts.capacity);
		System.out.println("mobile  features:"+parts.Battery);
		}
		

	}


