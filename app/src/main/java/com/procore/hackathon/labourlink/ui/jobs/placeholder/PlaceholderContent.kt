package com.procore.hackathon.labourlink.ui.jobs.placeholder

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable
import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()


    init {
        addItem()
    }

    private fun addItem() {
        val item1 = PlaceholderItem(
            "1",
            "Plumber",
            "XYZ Plumbing Solutions",
            "Job type - Full-time",
            "Location - Mumbai",
            "Posted 2 hours ago",
            "Duration - 5 months",
            "Install, repair, and maintain pipes, fixtures, and plumbing systems in residential and commercial buildings. Diagnose plumbing issues, provide efficient solutions, and ensure all work meets industry codes and standards. A valid plumbing license and strong technical expertise are a must.",
            "- Install, maintain, and repair plumbing systems.\\n\\n- Troubleshoot and resolve plumbing issues, including leaks and blockages.\\n\\n- Maintain water supply systems and ensure proper functionality.\\n\\n- Ensure plumbing installations comply with local building codes.",
            "- Proven experience in plumbing.\\n\\n- Ability to work independently and follow detailed instructions.\\n\\n- Excellent problem-solving skills.\\n\\n- Ability to work with various plumbing tools and systems."
        )
        ITEMS.add(item1)

        val item2 = PlaceholderItem(
            "2",
            "Carpenter",
            "Timber Works Construction",
            "Job type - Contract",
            "Location - Bangalore",
            "Posted 3 hours ago",
            "Duration - 6 months",
            "Craft, install, and repair structures and fixtures such as doors, windows, and furniture. Ensure precise measurements and cuts, while adhering to safety standards and building codes. Experience in both residential and commercial carpentry is essential for this role.",
            "- Cut, shape, and install wooden materials for structures and furniture.\\n\\n- Install doors, windows, and cabinets.\\n\\n- Follow blueprints and building plans to ensure precise installations.\\n\\n- Perform maintenance and repairs on wooden structures.",
            "- Proven experience in carpentry.\\n\\n- Ability to read blueprints and follow building plans.\\n\\n- Skilled with woodworking tools and machinery.\\n\\n- Good physical strength and stamina."
        )
        ITEMS.add(item2)

        val item3 = PlaceholderItem(
            "3",
            "Electrician",
            "ABC Electrical Solutions",
            "Job type - Fixed",
            "Location - Pune",
            "Posted 2 hours ago",
            "Duration - 5 months",
            "Join our team as an experienced Electrician to handle the installation, maintenance, and repair of electrical systems in both residential and commercial buildings. Troubleshoot electrical issues, ensure compliance with safety codes, and conduct regular system inspections. A valid electrical license and strong problem-solving skills are essential.",
            "- Install, maintain, and repair electrical wiring and systems.\\n\\n- Inspect and test electrical systems to ensure they meet safety codes.\\n\\n- Provide routine maintenance and emergency repair services.\\n\\n- Ensure compliance with building codes and safety regulations.",
            "- Proven experience as an electrician.\\n\\n- Knowledge of electrical systems, wiring, and safety procedures.\\n\\n- Ability to read blueprints and technical diagrams.\\n\\n- Strong attention to detail and troubleshooting skills."
        )
        ITEMS.add(item3)

        val item4 = PlaceholderItem(
            "4",
            "Mason",
            "Stone and Brick Builders",
            "Job type - Full-time",
            "Location - Delhi",
            "Posted 4 hours ago",
            "Duration - 8 months",
            "Work with brick, stone, and concrete to construct durable structures, walls, and foundations. Responsibilities include mixing materials, laying bricks, and ensuring the strength and stability of the finished product. A solid understanding of masonry techniques and safety procedures is required.",
            "- Lay bricks, stones, and blocks for walls, foundations, and other masonry work.\\n\\n- Mix mortar and prepare materials for masonry tasks.\\n\\n- Follow blueprints and designs to ensure structural integrity.\\n\\n- Inspect and repair masonry work as needed.",
            "- Proven masonry experience.\\n\\n- Strong knowledge of construction materials and techniques.\\n\\n- Ability to read and interpret blueprints.\\n\\n- Attention to detail and safety awareness."
        )
        ITEMS.add(item4)

        val item5 = PlaceholderItem(
            "5",
            "Welder",
            "SteelWorks Industries",
            "Job type - Full-time",
            "Location - Chennai",
            "Posted 6 hours ago",
            "Duration - 4 months",
            "Fusing metals and constructing metal structures are key aspects of this Welder role. Work on a variety of projects requiring different welding techniques, from repairs to custom constructions. A thorough knowledge of welding processes, safety protocols, and the ability to read blueprints are essential.",
            "- Perform welding on metal parts and structures.\\n\\n- Operate welding equipment and tools to perform high-quality work.\\n\\n- Inspect and test welds for strength and accuracy.\\n\\n- Follow safety procedures and maintain a clean work area.",
            "- Proven welding experience, preferably in MIG, TIG, or Stick welding.\\n\\n- Ability to read and interpret blueprints and technical specifications.\\n\\n- Strong problem-solving and technical skills.\\n\\n- Ability to work in a fast-paced environment."
        )
        ITEMS.add(item5)

        val item6 = PlaceholderItem(
            "6",
            "Roofer",
            "TopRoof Solutions",
            "Job type - Full-time",
            "Location - Hyderabad",
            "Posted 1 day ago",
            "Duration - 7 months",
            "We are looking for an experienced roofer to install and repair roofs on residential and commercial buildings. The job requires working in all weather conditions to ensure the roof is structurally sound and leak-proof.",
            "- Install and repair roofs using a variety of materials (asphalt shingles, metal, etc.).\\n\\n- Inspect and assess existing roofs for repairs.\\n\\n- Apply protective coatings and sealants to extend the roof's life.\\n\\n- Ensure the roof meets safety codes and regulations.",
            "- Proven experience in roofing.\\n\\n- Ability to work at heights and lift heavy materials.\\n\\n- Good knowledge of roofing materials and installation techniques.\\n\\n- Safety-conscious and physically fit."
        )
        ITEMS.add(item6)

        val item7 = PlaceholderItem(
            "7",
            "Flooring Installer",
            "Perfect Floors",
            "Job type - Fixed",
            "Location - Gurgaon",
            "Posted 2 days ago",
            "Duration - 6 months",
            "Install and repair various types of flooring, including hardwood, carpet, and vinyl. Measure and cut flooring materials to fit designated spaces, ensuring high-quality finishes and proper installation. A strong understanding of flooring techniques and attention to detail are necessary.",
            "- Measure and cut flooring materials to fit.\\n\\n- Install flooring materials like tiles, carpets, hardwood, and laminate.\\n\\n- Ensure proper subfloor preparation before installation.\\n\\n- Handle the installation of trim and moldings as necessary.",
            "- Proven experience in flooring installation.\\n\\n- Ability to work with different flooring materials and tools.\\n\\n- Strong attention to detail and precision.\\n\\n- Good physical condition and ability to work on feet for extended hours."
        )
        ITEMS.add(item7)

        val item8 = PlaceholderItem(
            "8",
            "Painter",
            "ColorCraft Solutions",
            "Job type - Part-time",
            "Location - Mumbai",
            "Posted 5 hours ago",
            "Duration - 3 months",
            "Transform residential and commercial spaces by preparing and painting surfaces to a high standard. Responsibilities include surface preparation, priming, and applying various finishes. An eye for detail, knowledge of different paints, and the ability to advise clients on color choices are key to success in this role.",
            "- Prepare surfaces for painting (sanding, priming, etc.).\\n\\n- Apply paint using brushes, rollers, and spray equipment.\\n\\n- Ensure all paintwork is smooth and even, with no defects.\\n\\n- Clean brushes, rollers, and other equipment after use.",
            "- Proven painting experience in residential or commercial settings.\\n\\n- Ability to handle various paint types and equipment.\\n\\n- Strong attention to detail.\\n\\n- Ability to work independently and manage time efficiently."
        )
        ITEMS.add(item8)

        val item9 = PlaceholderItem(
            "9",
            "Heavy Equipment Operator",
            "BuildRight Construction",
            "Job type - Full-time",
            "Location - Bangalore",
            "Posted 1 day ago",
            "Duration - 9 months",
            "We are looking for a qualified heavy equipment operator to operate bulldozers, excavators, and cranes on our construction sites. The operator will be responsible for handling machinery in a safe and efficient manner.",
            "- Operate heavy machinery including bulldozers, cranes, and excavators.\\n\\n- Load and unload materials on construction sites.\\n\\n- Follow safety procedures and ensure proper maintenance of equipment.\\n\\n- Work with team members to ensure site efficiency and safety.",
            "- Proven experience as a heavy equipment operator.\\n\\n- Certification for operating heavy machinery.\\n\\n- Good communication skills and ability to work with a team.\\n\\n- Strong safety awareness and attention to detail."
        )
        ITEMS.add(item9)

        val item10 = PlaceholderItem(
            "10",
            "Demolition Worker",
            "Destruction Crew Inc.",
            "Job type - Temporary",
            "Location - Noida",
            "Posted 2 days ago",
            "Duration - 4 months",
            "We are looking for a demolition worker to safely tear down buildings and structures. The ideal candidate will have experience using various tools and equipment for demolition tasks.",
            "- Tear down walls, buildings, and structures using manual and power tools.\\n\\n- Safely remove materials such as concrete, wood, and steel.\\n\\n- Ensure all demolition work is performed in compliance with safety regulations.\\n\\n- Clean up and dispose of debris and materials after demolition.",
            "- Previous experience in demolition work.\\n\\n- Ability to use demolition tools and machinery safely.\\n\\n- Good physical fitness and ability to lift heavy materials.\\n\\n- Knowledge of safety procedures on demolition sites."
        )
        ITEMS.add(item10)

        val item11 = PlaceholderItem(
            "11",
            "Scaffolder",
            "Sky High Scaffolding",
            "Job type - Full-time",
            "Location - Kolkata",
            "Posted 3 hours ago",
            "Duration - 6 months",
            "We are looking for an experienced scaffolder to work on large-scale construction sites. The role involves assembling, dismantling, and maintaining scaffolding structures to ensure the safety of workers at height.",
            "- Assemble and disassemble scaffolding structures according to building plans and safety standards.\\n\\n- Inspect scaffolding regularly to ensure safety compliance.\\n\\n- Secure scaffolding to building structures, ensuring stability.\\n\\n- Assist with the transportation of scaffolding materials to job sites.",
            "- Proven experience as a scaffolder on construction sites.\\n\\n- Ability to work at heights and handle physical labor.\\n\\n- Strong understanding of safety standards and construction regulations.\\n\\n- Good physical stamina and teamwork skills."
        )
        ITEMS.add(item11)

        val item12 = PlaceholderItem(
            "12",
            "Landscaper",
            "GreenScape Landscaping",
            "Job type - Contract",
            "Location - Ahmedabad",
            "Posted 1 day ago",
            "Duration - 4 months",
            "We are looking for a skilled landscaper to maintain and design outdoor spaces for residential and commercial clients. The job includes planting, lawn care, and outdoor construction projects.",
            "- Design and install landscapes, including plants, trees, and hardscaping elements like patios and walkways.\\n\\n- Maintain lawns and garden beds, including trimming, weeding, and fertilizing.\\n\\n- Install irrigation systems and ensure proper maintenance.\\n\\n- Work with customers to develop landscaping plans according to their preferences.",
            "- Proven landscaping experience, including hardscaping and softscaping.\\n\\n- Knowledge of plants, trees, and lawn care techniques.\\n\\n- Ability to use landscaping tools and equipment.\\n\\n- Good physical stamina and attention to detail."
        )
        ITEMS.add(item12)

        val item13 = PlaceholderItem(
            "13",
            "Forklift Operator",
            "LogiMove Warehouse",
            "Job type - Full-time",
            "Location - Pune",
            "Posted 3 hours ago",
            "Duration - 7 months",
            "We are looking for a forklift operator to help with material handling in our warehouse. The role involves safely operating forklifts to move goods, load/unload deliveries, and maintain inventory.",
            "- Operate forklifts to move pallets and materials around the warehouse.\\n\\n- Load and unload trucks and containers.\\n\\n- Organize and store materials in designated locations.\\n\\n- Inspect and maintain forklifts to ensure safe operation.",
            "- Valid forklift operator certification.\\n\\n- Proven experience in a warehouse or distribution center.\\n\\n- Good physical condition and ability to lift heavy materials.\\n\\n- Attention to detail and safety-conscious."
        )
        ITEMS.add(item13)

        val item14 = PlaceholderItem(
            "14",
            "Concrete Finisher",
            "CementCraft Construction",
            "Job type - Full-time",
            "Location - Chennai",
            "Posted 2 days ago",
            "Duration - 8 months",
            "We are seeking a skilled concrete finisher to work on residential and commercial projects. The ideal candidate will have experience in finishing concrete surfaces for foundations, floors, and driveways.",
            "- Pour, smooth, and finish concrete surfaces, including foundations and slabs.\\n\\n- Level concrete using hand tools or power tools.\\n\\n- Apply finishing touches to concrete such as curing compounds and sealants.\\n\\n- Work with construction teams to ensure timely completion of projects.",
            "- Proven experience as a concrete finisher.\\n\\n- Knowledge of concrete mixing and finishing techniques.\\n\\n- Ability to use power tools like trowels and grinders.\\n\\n- Strong attention to detail and ability to meet deadlines."
        )
        ITEMS.add(item14)

        val item15 = PlaceholderItem(
            "15",
            "Security Guard",
            "SafeGuard Security Services",
            "Job type - Shift",
            "Location - Mumbai",
            "Posted 1 hour ago",
            "Duration - 5 months",
            "We are looking for a reliable security guard to join our team and maintain a safe and secure environment at our facilities. Responsibilities include patrolling, monitoring surveillance systems, and enforcing security protocols.",
            "- Patrol assigned areas to monitor for suspicious activities or safety hazards.\\n\\n- Respond to alarms and investigate disturbances.\\n\\n- Monitor security cameras and provide reports of any incidents.\\n\\n- Ensure doors and windows are properly secured at the end of shifts.",
            "- Previous security guard experience is preferred.\\n\\n- Ability to handle emergency situations and maintain composure.\\n\\n- Strong attention to detail and good communication skills.\\n\\n- Ability to work in shifts, including nights and weekends."
        )
        ITEMS.add(item15)

        val item16 = PlaceholderItem(
            "16",
            "Window Cleaner",
            "ClearView Cleaning",
            "Job type - Part-time",
            "Location - Bangalore",
            "Posted 3 hours ago",
            "Duration - 4 months",
            "We are seeking a window cleaner for residential and commercial buildings. The role involves cleaning windows at varying heights using appropriate safety measures and equipment.",
            "- Clean windows, glass, and mirrors in residential and commercial buildings.\\n\\n- Use ladders, scaffolding, and lifts for high-rise window cleaning.\\n\\n- Ensure all safety protocols are followed during cleaning tasks.\\n\\n- Maintain equipment and tools in good working condition.",
            "- Previous experience in window cleaning is a plus.\\n\\n- Ability to work at heights and use cleaning tools safely.\\n\\n- Strong attention to detail and excellent customer service skills.\\n\\n- Ability to work in varying weather conditions."
        )
        ITEMS.add(item16)

        val item17 = PlaceholderItem(
            "17",
            "Industrial Painter",
            "SteelCo Painting",
            "Job type - Full-time",
            "Location - Delhi",
            "Posted 1 day ago",
            "Duration - 6 months",
            "We are looking for an industrial painter to work on large-scale industrial projects. The role involves preparing surfaces and applying coatings to steel structures and machinery to protect them from corrosion.",
            "- Prepare surfaces by cleaning, sanding, and priming.\\n\\n- Apply coatings to steel structures, equipment, and machinery.\\n\\n- Ensure the work is finished to a high standard with smooth, durable coatings.\\n\\n- Follow health and safety regulations at all times.",
            "- Proven industrial painting experience.\\n\\n- Knowledge of industrial coatings, primers, and surface preparation techniques.\\n\\n- Ability to use spray guns and other painting equipment.\\n\\n- Strong attention to detail and safety-conscious."
        )
        ITEMS.add(item17)

        val item18 = PlaceholderItem(
            "18",
            "Forklift Mechanic",
            "LiftMasters Repairs",
            "Job type - Full-time",
            "Location - Chennai",
            "Posted 2 hours ago",
            "Duration - 7 months",
            "We are seeking a forklift mechanic to join our service team. The job involves maintaining and repairing forklifts, including diagnosing issues and performing preventative maintenance.",
            "- Perform maintenance and repairs on forklifts and other material handling equipment.\\n\\n- Troubleshoot mechanical, electrical, and hydraulic issues.\\n\\n- Perform regular inspections and replace parts as necessary.\\n\\n- Maintain accurate records of repairs and maintenance work.",
            "- Proven experience as a forklift mechanic.\\n\\n- Strong knowledge of forklift systems, including hydraulic and electrical.\\n\\n- Ability to diagnose and repair mechanical issues.\\n\\n- Valid driver’s license and forklift certification."
        )
        ITEMS.add(item18)

        val item19 = PlaceholderItem(
            "19",
            "HVAC Technician",
            "Climate Control Services",
            "Job type - Full-time",
            "Location - Hyderabad",
            "Posted 5 hours ago",
            "Duration - 6 months",
            "We are seeking an HVAC technician to install, maintain, and repair heating, ventilation, and air conditioning systems. You will work on residential and commercial units, ensuring optimal performance and energy efficiency.",
            "- Install, maintain, and repair HVAC systems in homes and businesses.\\n\\n- Troubleshoot and resolve HVAC issues related to heating, cooling, and ventilation.\\n\\n- Ensure systems are running efficiently and in compliance with regulations.\\n\\n- Provide customer support and guidance on system use and maintenance.",
            "- Proven experience in HVAC installation and maintenance.\\n\\n- Strong knowledge of HVAC systems, electrical wiring, and refrigerants.\\n\\n- Ability to troubleshoot HVAC systems efficiently.\\n\\n- Strong communication skills and customer service orientation."
        )
        ITEMS.add(item19)

        val item20 = PlaceholderItem(
            "20",
            "Exterior Painter",
            "PaintMasters Ltd.",
            "Job type - Contract",
            "Location - Kolkata",
            "Posted 1 day ago",
            "Duration - 3 months",
            "We are hiring an exterior painter for residential and commercial projects. The role involves preparing and painting exterior surfaces to enhance and protect the appearance of buildings.",
            "- Prepare exterior surfaces, including washing, sanding, and priming.\\n\\n- Apply exterior paints and coatings to buildings, fences, and other structures.\\n\\n- Work with various materials, including wood, metal, and concrete.\\n\\n- Ensure all work is completed according to safety standards.",
            "- Proven exterior painting experience.\\n\\n- Knowledge of different paints and coatings for exterior use.\\n\\n- Ability to work outdoors in varying weather conditions.\\n\\n- Strong attention to detail and ability to follow safety protocols."
        )
        ITEMS.add(item20)
    }


    /**
     * A placeholder item representing a piece of content.
     */
    @Parcelize
    data class PlaceholderItem(val id: String, val jobTitle: String, val company: String, val type: String,
                               val location: String, val time: String, val duration: String,
                               val description: String, val responsibilities: String,
                               val requirements: String): Parcelable {

    }
}