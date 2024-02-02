package com.ahrorovkspace.afkorhackathon.domain.profileInfo.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u000eH\u00c6\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0006H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u00060"}, d2 = {"Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/GetProfileInfoResp;", "", "about", "", "avatar", "company", "", "fullname", "is_verified", "", "location", "resume", "speciality", "user", "Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/User;", "worktime_end", "worktime_start", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/User;Ljava/lang/String;Ljava/lang/String;)V", "getAbout", "()Ljava/lang/String;", "getAvatar", "getCompany", "()I", "getFullname", "()Z", "getLocation", "getResume", "getSpeciality", "getUser", "()Lcom/ahrorovkspace/afkorhackathon/domain/profileInfo/model/User;", "getWorktime_end", "getWorktime_start", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class GetProfileInfoResp {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String about = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String avatar = null;
    private final int company = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fullname = null;
    private final boolean is_verified = false;
    private final int location = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resume = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String speciality = null;
    @org.jetbrains.annotations.NotNull
    private final com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.User user = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String worktime_end = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String worktime_start = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.GetProfileInfoResp copy(@org.jetbrains.annotations.NotNull
    java.lang.String about, @org.jetbrains.annotations.NotNull
    java.lang.String avatar, int company, @org.jetbrains.annotations.NotNull
    java.lang.String fullname, boolean is_verified, int location, @org.jetbrains.annotations.NotNull
    java.lang.String resume, @org.jetbrains.annotations.NotNull
    java.lang.String speciality, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.User user, @org.jetbrains.annotations.NotNull
    java.lang.String worktime_end, @org.jetbrains.annotations.NotNull
    java.lang.String worktime_start) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GetProfileInfoResp(@org.jetbrains.annotations.NotNull
    java.lang.String about, @org.jetbrains.annotations.NotNull
    java.lang.String avatar, int company, @org.jetbrains.annotations.NotNull
    java.lang.String fullname, boolean is_verified, int location, @org.jetbrains.annotations.NotNull
    java.lang.String resume, @org.jetbrains.annotations.NotNull
    java.lang.String speciality, @org.jetbrains.annotations.NotNull
    com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.User user, @org.jetbrains.annotations.NotNull
    java.lang.String worktime_end, @org.jetbrains.annotations.NotNull
    java.lang.String worktime_start) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAbout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAvatar() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCompany() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullname() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean is_verified() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getLocation() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSpeciality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.User component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ahrorovkspace.afkorhackathon.domain.profileInfo.model.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWorktime_end() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWorktime_start() {
        return null;
    }
}