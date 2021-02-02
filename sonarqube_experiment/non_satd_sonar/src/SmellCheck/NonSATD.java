public class NonSATD {

    public void WrapperMethod() {

        if (rect.bottom < getChildAt(0).getHeight()) {
            screenBottom -= fadingEdge;
        }

        if (elemDefs != null && elemDefs.containsKey(elemLocalName)) {
            delim = elemDefs.get(elemLocalName).getDelimiter();
            hasMultipleValues = elemDefs.get(elemLocalName).isHasMultipleValues();
        }

        if (controlledEnvArea.getParent().getParent().getParent() instanceof ScrolledForm) {
            ScrolledForm scrolledForm = (ScrolledForm) controlledEnvArea.getParent().getParent().getParent();
            scrolledForm.reflow(true);
        }

        if (event.getObjectName().matches("1[0-9]{3}")) {
            usersList.add(new VoipAccount(number, status));
            ((RemoteEventBus) eventBus).fireEvent(new AudioUsersStatusRemoteEvent(usersList));
        } else if (event.getObjectName().matches("2[0-9]{3}")) {
            supervisorsList.add(new VoipAccount(number, status));
            ((RemoteEventBus) eventBus).fireEvent(new AudioSupervisorStatusRemoteEvent(supervisorsList));
        }

        if (ctx.isCallerInRole(ACCESSLEVEL_NOACCESS)) return false;

        if (name.isEmpty()) {
            name = volume.substring(volume.lastIndexOf('/') + 1);
        }

        if (StringUtils.isEmpty(movie.getDataSource())) {
            LOGGER.error("no Datasource set");
            return;
        }

        if (percent != 0.0f) {
            weight = (int) Math.floor(weight + weight * (percent / 100.0f));
        }

        if (imovel.getInformacoesComplementares() != null) {
            consultarImovelActionForm.setInformacoesComplementares(imovel.getInformacoesComplementares());
        } else {
            consultarImovelActionForm.setInformacoesComplementares("");
        }

        if (sharepreferences == null) {
            sharepreferences = new NZoneSharePreferences(getNzoneClientComms().getSharePreferences());
            log.debug("Loaded prefererces are " + preferences.toString());
        }

        if (fdSubrs[i] != null && fonts[Font].PrivateSubrsOffset[i] >= 0) {
            OutputList.addLast(new SubrMarkerItem(fdSubrs[i], fdPrivateBase[i]));
            if (NewLSubrsIndex[i] != null)
                OutputList.addLast(new RangeItem(new RandomAccessFileOrArray(NewLSubrsIndex[i]), 0, NewLSubrsIndex[i].length));
        }

        if (symbol.isBlockScoped() && !symbol.hasBeenDeclared() && !identNode.isDeclaredHere() && isLocal(lc.getCurrentFunction(), symbol)) {
            newIdentNode = newIdentNode.markDead();
        }

        if (direction2 == null) {
            direction2 = new Coords(3);
        }

        if (isGreaterInput((Instance) rules.elementAt(i), inst) && !isGreaterOutput((Instance) rules.elementAt(i), inst)) {
            if (m_resolutionMode == RESOLUTION_CONSERVATIVE) {
                addr = false;
            }
            if (m_resolutionMode == RESOLUTION_RANDOM) {
                if (rand.nextBoolean()) {
                    addr = addr || true;
                    rules.removeElementAt(i);
                    i--;
                } else addr = false;
            }
            if (m_resolutionMode == RESOLUTION_NONE) {
                addr = false;
            }
            if (m_resolutionMode == RESOLUTION_AVERAGE) {
                if (print_msg) System.out.print(inst.toString() + " - " + ((Instance) rules.elementAt(i)).toString());
                inst = averageRule(inst, (Instance) rules.elementAt(i));
                System.out.println(" : Average : " + inst.toString());
                rules.removeElementAt(i);
                addr = true;
                i = 0;
            }
            continue;
        }

        if (participants == null) {
            participants = new RegisteredResources(null, this);
        }

        if (this.criteriaMet.containsKey("170.314 (b)(1)") && this.criteriaMet.containsKey("170.314 (b)(2)") && this.criteriaMet.containsKey("170.314 (h)(1)")) {
            this.counts.put("criteriaTocRequiredMet", 3);
            this.counts.put("criteriaTocRequired", 3);
            return true;
        }

        if (BluetoothUuid.isUuidPresent(uuids, BluetoothUuid.ObexObjectPush)) {
            if (mOppProfile == null) {
                if (DEBUG) Log.d(TAG, "Adding local OPP profile");
                mOppProfile = new OppProfile();
                mProfileNameMap.put(OppProfile.NAME, mOppProfile);
            }
        } else if (mOppProfile != null) {
            Log.w(TAG, "Warning: OPP profile was previously added but the UUID is now missing.");
        }

        if (!hasParent()) {
            return false;
        }

        if (getIntent() == null) {
            finish();
            return;
        }

        if (arg0.isUndefinedValue() || arg1.isUndefinedValue()) {
            result.setUndefinedValue();
            return (true);
        }

        if (appId == null || appId.isEmpty()) {
            incrementFailureCount(instrumentationKey);
            return new ProfileFetcherResult(null, ProfileFetcherResultTaskStatus.FAILED);
        }

        if (level == 1) {
            return modelRep.findModelByBrand(brand);
        }

        if ((initProperty == null) || readOnly) {
            return;
        }

        if (mDynamicUnknownTokenModel != null && mSymbolTable.symbolToID(token) < 0) {
            mDynamicUnknownTokenModel.train(token, count);
        }

        if (getPeer().internal()) {
            str += " i";
        }

        if (getFieldsReader() != null) {
            ramBytesUsed += getFieldsReader().ramBytesUsed();
        }

        if (!TextUtils.isEmpty(mBaseUrl)) {
            buildRestApiInjectorWithBaseUrl(mBaseUrl);
        }

        if (oppiaine.getKurssit().size() > 0) {
            addTeksti(docBase, messages.translate("docgen.kurssit.title", docBase.getKieli()), "h5");
            addKurssit(docBase, oppiaine.getKurssit());
        }

        if (dbCon.hasTableOrColumn(TABLE_CMS_PROJECTS, null)) {
            String updateProjectFlags = readQuery(QUERY_CMS_PROJECTS_UPDATE_PROJECT_FLAGS);
            dbCon.updateSqlStatement(updateProjectFlags, null, null);
        } else {
            System.out.println("table " + TABLE_CMS_PROJECTS + " does not exists");
        }

        if (castForLevelMap == null) {
            castForLevelMap = new HashMap<>(100);
        }

        if (keySet.contains(MentionsAnnotation.class)) {
            for (CoreMap mention : sentence.get(MentionsAnnotation.class)) {
                builder.addMentions(toProtoMention(mention));
            }
            keysToSerialize.remove(MentionsAnnotation.class);
            builder.setHasEntityMentionsAnnotation(true);
        } else {
            builder.setHasEntityMentionsAnnotation(false);
        }

        if (idLeiturista != null) {
            dadosArquivoLiberado = this.repositorioMicromedicao.temArquivoTextoDivididoLiberado(idLeiturista);
            if (dadosArquivoLiberado == null || dadosArquivoLiberado.length == 0) {
                dadosArquivoLiberado = this.repositorioMicromedicao.temArquivoTextoLiberado(idLeiturista);
            }
        }

        if (currentEvent.evaluateStep(interpolator)) {
            occuringEvents.add(currentEvent);
        }

        if (c != null) {
            connList.add(c);
        }

        if (statusMonitorActive) {
            statusMonitor.start();
        }

        if (!APIRegistry.perms.getUserPermissionProperty(ident, event.afterZone, ModuleProtection.ZONE_KNOCKBACK).equals(Zone.PERMISSION_FALSE)) {
            sendZoneDeniedMessage(event.getEntityPlayer());
            Vec3d center = event.afterPoint.toVec3();
            if (event.afterZone instanceof AreaZone) {
                center = ((AreaZone) event.afterZone).getArea().getCenter().toVec3();
                center = new Vec3d(center.xCoord, event.beforePoint.getY(), center.zCoord);
            }
            Vec3d delta = event.beforePoint.toVec3().subtract(center).normalize();
            WarpPoint target = new WarpPoint(event.beforePoint.getDimension(), event.beforePoint.getX() - delta.xCoord, event.beforePoint.getY() - delta.yCoord, event.beforePoint.getZ() - delta.zCoord, event.afterPoint.getPitch(), event.afterPoint.getYaw());
            TeleportHelper.doTeleport((EntityPlayerMP) event.getEntityPlayer(), target);
            event.setCanceled(true);
            return;
        }

        if (colecaoDados == null || colecaoDados.size() < quantidadeMaxima) {
            flagTerminou = true;
        }

        if (type == null) {
            if (logger.isLoggable(Level.WARNING)) {
                logger.warning("Type is NULL. Cannot find java Name for a NULL Type");
            }
            return new String[]{null, "SINGLE"};
        }

        if (clickTimer != null) {
            clickTimer.start();
        }

        if (step.executeMethod == Workflow.NULL_METHOD) {
            controller = this;
        }

        if (loadDataHost) {
            this.dataHosts = initDataHosts(configLoader);
            this.dataNodes = initDataNodes(configLoader);
        }

        if (uppStmt.startsWith("SELECT ")) {
            return true;
        }

        if (name.equals("alt")) {
            return AxisType.Height;
        }

        if (osceProxy.getOsceStatus() == OsceStatus.OSCE_CLOSED) {
            Log.info("Osce is in Closed Status, Role Edit Disabled.");
            oscePostSubView.getStandardizedRoleEdit().setVisible(false);
        }

        if (!(eq_s_b(1, "\u00F6"))) {
            return false;
        }

        if (dirName.getScheme().compareTo("file") == 0) {
            this.addStorageDir(new StorageDirectory(new File(dirName.getPath()), dirType, sharedEditsDirs.contains(dirName)));
        }

        if (nextConstraint != null && nextConstraint.permits(key)) {
            return true;
        }

        if (this.sslcontext == null) {
            this.sslcontext = createSSLContext();
        }

        if ((indicadorTipoFeriado.equals("1") && (nacionais == null || nacionais.size() == 0)) || (indicadorTipoFeriado.equals("2") && (municipais == null || municipais.size() == 0)) || (indicadorTipoFeriado.equals("3") && ((nacionais == null || nacionais.size() == 0) || (nacionais == null || nacionais.size() == 0)))) {
            throw new ControladorException("atencao.ano_origem_sem_feriados");
        }

        if (p1.numOccurrences != p2.numOccurrences) {
            return p2.numOccurrences - p1.numOccurrences;
        }

        if (!cb.hasRemaining()) {
            return true;
        }

        if (stepprog != null) {
            stepprog.beginStep(3, "Inform listeners.", LOG);
        }

        if (formats.keySet().contains(FLAGS) || formats.keySet().contains(ENUM)) {
            for (ResourceXmlAttrValue value : formats.values()) {
                value.writeToClass(sink);
            }
        }

        if (!CollectionUtils.isEmpty(newJobs)) {
            hudsonJobRepository.save(newJobs);
        }

        if (ResourceUtils.isInferred(t)) {
            triple.put("info", createInfo(ResourceUtils.getId(t)));
        } else {
            triple.put("info", "");
        }

        if (filterValues.literal instanceof Period) {
            Period period = (Period) filterValues.literal;
            Date start = period.getBeginning().getPosition().getDate();
            Date end = period.getEnding().getPosition().getDate();
            return ((FilterDelegate<?>) delegate).during(filterValues.propertyName, start, end);
        } else if (filterValues.literal instanceof DefaultPeriodDuration) {
            DefaultPeriodDuration duration = (DefaultPeriodDuration) filterValues.literal;
            return ((FilterDelegate<?>) delegate).relative(filterValues.propertyName, duration.getTimeInMillis());
        } else {
            throw new UnsupportedOperationException("Unsupported implementation of Period or PeriodDuration for During filter.");
        }

        if (args[i].equals("-demographics")) {
            demographics = true;
            continue;
        }

        if (!r_R1()) {
            return false;
        }

        if (psEncCtrl.sCmn.sigtype == Define.SIG_TYPE_VOICED) {
            lag = psEncCtrl.sCmn.pitchL[k];
        }

        if (entry.getValue().isOffline()) {
            filterSites.add(entry.getKey());
        }

        if (exam != null && op.equals(rsc.getMessage("button.clearExamPrefs"))) {
            sessionContext.checkPermission(exam, Right.ExaminationEditClearPreferences);
            Set s = exam.getPreferences();
            s.clear();
            exam.setPreferences(s);
            new ExamDAO().update(exam);
            op = "init";
            ChangeLog.addChange(null, sessionContext, exam, ChangeLog.Source.EXAM_EDIT, ChangeLog.Operation.CLEAR_PREF, exam.firstSubjectArea(), exam.firstDepartment());
            ActionRedirect redirect = new ActionRedirect(mapping.findForward("showDetail"));
            redirect.addParameter("examId", examId);
            return redirect;
        }

        if (checkForLeavingTouchModeAndConsume(event)) {
            return FINISH_HANDLED;
        }

        if (extraData != null && extraData instanceof Boolean) {
            boolean andValue = ((Boolean) extraData).booleanValue();
            if (andValue) {
                appliedTruth = truth && andValue;
            } else {
                appliedTruth = !truth;
            }
        }

        if (quantifiable.contains(currNerTag)) {
            if (collector.isEmpty()) {
                beforeIndex = i - 1;
            }
            collector.add(wi);
        }

        if (token == null) {
            return handlerResult;
        }

        if (ChoiceManager.lastDecision < 5) {
            Pattern pattern = Pattern.compile("You rent(|ed) the (.*?)!");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                Preferences.setString("_horsery", matcher.group(2));
                String message = "Chose the " + matcher.group(2);
                RequestLogger.printLine(message);
                RequestLogger.updateSessionLog(message);
            }
        } else if (ChoiceManager.lastDecision == 5) {
            Preferences.setString("_horsery", "");
            String message = "Returned your horse";
            RequestLogger.printLine(message);
            RequestLogger.updateSessionLog(message);
        }

        if (needCache && srcData != null) {
            cacheMgr.releaseCacheObject(srcData);
        }

        if (checkAnycast && effectiveAddressRoutingType == RoutingType.ANYCAST && addressSettings.isAutoCreateQueues()) {
            session.createQueue(simpleQueue, simpleQueue, routingType == null ? addressSettings.getDefaultQueueRoutingType() : routingType, null, false, true, true);
        }

        if (reader.getResult().length() > 6) {
            String parsed = reader.getResult().substring(reader.getResult().indexOf("REG_SZ") + 6).trim();
            if (parsed.length() > 1) {
                return parsed;
            }
        }

        if (shape != null) {
            label.setText("Line " + (shape.getRegion().getLineIndex(shape) + 1));
            label.pack();
        } else label.setText("no line set");

        if (h != p && HEAD.compareAndSet(this, h, p)) NEXT.setRelease(h, h);

        if (!firstColumn) {
            clipboardPlainText.append("\t");
        }

        if (ValidationUtils.getCoreValidationConstraints().containsKey(aType)) {
            vc.putAll(ValidationUtils.getCoreValidationConstraints().get(aType));
        }

        if (articleType != null) {
            Element elemArticleType = new Element("article-type", FEED_EXTENDED_PREFIX(), FEED_EXTENDED_NS());
            elemArticleType.setText(articleType);
            foreignMarkup.add(elemArticleType);
        }

        if (cacheUsuarioOpcoesSistema.get(usuarioLogado) == null) {
            cacheUsuarioOpcoesSistema.put(usuarioLogado, new HashMap<>());
        }

        if (!queue.offer(task, maxOfferTime.get(), TimeUnit.MILLISECONDS)) {
            String msg = "rejectedExecution callback thread timed out offering task to queue";
            LoggerFactory.getLogger(getClass()).warn(msg);
            throw new RejectedExecutionException(msg);
        }

        if (start < topIterator) {
            counter += quickSort(array, start, topIterator);
        }

        if (d.isEmpty()) {
            return false;
        }

        if ((this.source == null) && (imageList != null) && (imageList.size() > 0)) {
            List descriptors = super.getDescriptors(super.findDataChoice(this.choiceName), null);
            AddeImageDescriptor desc1 = (AddeImageDescriptor) descriptors.get(0);
            this.source = desc1.getSource();
            try {
                this.areaAdapter = new AreaAdapter(this.source, false);
                this.af = this.areaAdapter.getAreaFile();
                this.baseAnav = this.af.getNavigation();
                this.acs = (AREACoordinateSystem) this.areaAdapter.getCoordinateSystem();
                af = AreaFileFactory.getAreaFileInstance(this.source);
                AreaDirectoryList adl = new AreaDirectoryList(this.source);
                currentDirs = adl.getSortedDirs();
            } catch (Exception ew) {
            }
            allBandDirs = (Hashtable) getProperties().get("allBands");
            ArrayList oj = (ArrayList) getProperties().get("bandinfo");
            if (oj != null) {
                this.bandId = (BandInfo) oj.get(0);
            }
            AreaDirectory thisDir = desc1.getDirectory();
            this.descriptor = new AddeImageDescriptor(thisDir, null);
            init();
        }

        if (namespaceURI.length() == 0) {
            this.namespaceURI = EMPTY;
        } else {
            this.namespaceURI = namespaceURI.intern();
        }

        if (generator.getConfigUrl() == null) return new SubmoduleStatus(SubmoduleStatusType.UNINITIALIZED, path, id);

        if (!subject.startsWith("Nature:")) return false;

        if ((getKdcServerBean().getKrbEncryptionTypes().size() == 1) && (event.getChecked() == false)) {
            CommonUIUtils.openErrorDialog(Messages.getString("KerberosServerPage.AtLeastOneEncryptionTypeMustBeSelected"));
            encryptionTypesTableViewer.setChecked(event.getElement(), !event.getChecked());
            return;
        }

        if (fileSec != null && fileSec.getContent() != null && !fileSec.getContent().isEmpty()) {
            mets.getContent().add(fileSec);
        }

        if (!this.deleteQuery.isContentEmpty()) {
            DeleteObjectQuery rtDeleteQuery = (DeleteObjectQuery) this.deleteQuery.buildRuntimeQuery();
            this.deleteQuery.adjustRuntimeQuery(rtDeleteQuery);
            rtQueryManager.setDeleteQuery(rtDeleteQuery);
        }

        if (!usePartial()) {
            CloseReason cr = new CloseReason(CloseCodes.TOO_BIG, sm.getString("wsFrame.bufferTooSmall", Integer.valueOf(messageBufferBinary.capacity()), Long.valueOf(payloadLength)));
            throw new WsIOException(cr);
        }

        if (callContext != null && decoratorsAggregate != null) {
            List<JSONDecorator> ldecs = decoratorsAggregate.getDecorators();
            for (JSONDecorator d : ldecs) {
                d.before(m);
            }
            for (JSONDecorator d : ldecs) {
                if (d.apply(jsonObject, callContext)) {
                    d.decorate(jsonObject, m);
                }
            }
            for (JSONDecorator d : ldecs) {
                d.after();
            }
        }

        if (newObject instanceof EObject) {
            EObject newEObject = (EObject) newObject;
            if (TransformationHelper.isVirtual(newEObject)) {
                if (TransformationHelper.isSqlTable(newEObject) && !TransformationHelper.isXmlDocument(newEObject)) {
                    return true;
                } else if (TransformationHelper.isSqlProcedure(newEObject)) {
                    return true;
                }
            }
        }

        if (!handle.defaultVerifier().verify(co)) {
            throw new IOException("verify failed on " + co.fullName());
        }

        if (needToCallOnEntry) {
            instance.onEntry();
            needToCallOnEntry = false;
        }

        if (os.contains("win")) {
            config.addIcon("res/lib/icon16.png", Files.FileType.Internal);
        }

        if (debug) System.out.println("Token: " + token);

        if ((i == 1 && c.get(CoreAnnotations.TokenEndAnnotation.class) != null) || (i > 1 && !savedTokenEnds.isEmpty())) {
            savedTokenEnds.add(c.get(CoreAnnotations.TokenEndAnnotation.class));
        }

        if (tries > 3) {
            logTransactionRestart(commandName, e, tries);
        }

        if (msg instanceof TcpDiscoveryPingRequest) {
            if (!spi.isNodeStopping0()) {
                TcpDiscoveryPingRequest req = (TcpDiscoveryPingRequest) msg;
                if (log.isInfoEnabled())
                    log.info("Received ping request from the remote node " + "[rmtNodeId=" + msg.creatorNodeId() + ", rmtAddr=" + rmtAddr + ", rmtPort=" + sock.getPort() + "]");
                TcpDiscoveryPingResponse res = new TcpDiscoveryPingResponse(locNodeId);
                IgniteSpiOperationTimeoutHelper timeoutHelper = new IgniteSpiOperationTimeoutHelper(spi, true);
                if (req.clientNodeId() != null) {
                    ClientMessageWorker clientWorker = clientMsgWorkers.get(req.clientNodeId());
                    if (clientWorker != null) res.clientExists(clientWorker.ping(timeoutHelper));
                }
                spi.writeToSocket(sock, res, timeoutHelper.nextTimeoutChunk(spi.getSocketTimeout()));
                if (!(sock instanceof SSLSocket)) sock.shutdownOutput();
                if (log.isInfoEnabled())
                    log.info("Finished writing ping response " + "[rmtNodeId=" + msg.creatorNodeId() + ", rmtAddr=" + rmtAddr + ", rmtPort=" + sock.getPort() + "]");
            } else if (log.isDebugEnabled()) log.debug("Ignore ping request, node is stopping.");
            return;
        }

        if (n < 0) {
            return this.skip(count);
        }

        if (new File(themeFolder, CUSTOM_JS_FILENAME).exists()) {
            sb.append("<script type='text/javascript' src='").append(baseURI).append(CUSTOM_JS_FILENAME).append("'></script>\n");
        }

        if (account != null) accountService.setAccountActive(account);

        if (!matcher.matches(current)) {
            return false;
        }

        if (timerFired) {
            assertUtil.verbose("Foreground timer fired");
        } else {
            assertUtil.notInVerbose("Foreground timer fired");
        }

        if (endIndex == endTemp) {
            record.setIsPhrase(isPhrase);
            if (usePreviousStyleChecked) record.setUsePreviousStyle();
            return;
        }

        if (slotObject != null && slotObject.getHasStack()) {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
            if (slot < tile.getSizeInventory()) {
                if (!this.mergeItemStack(stackInSlot, tile.getSizeInventory(), 36 + tile.getSizeInventory(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(stackInSlot, 0, TileEntityCrafter.SIZE_INPUT, true)) {
                return ItemStack.EMPTY;
            }
            if (stackInSlot.getCount() == 0) {
                slotObject.putStack(ItemStack.EMPTY);
            } else {
                slotObject.onSlotChanged();
            }
            if (stackInSlot.getCount() == stack.getCount()) {
                return ItemStack.EMPTY;
            }
            slotObject.onTake(player, stackInSlot);
        }

        if (!(handle instanceof DataHandleInput)) {
            throw new IllegalArgumentException("Invalid data handle provided!");
        }

        if (this.oldValue == null && this.oldValueBytes == null) {
            if (!reentry.isInvalidOrRemoved()) {
                if (requireOldValue || areOldValuesEnabled() || getRegion() instanceof HARegion) {
                    @Retained Object ov;
                    if (ReferenceCountHelper.trackReferenceCounts()) {
                        ReferenceCountHelper.setReferenceCountOwner(new OldValueOwner());
                        ov = reentry.getValueRetain(owner, true);
                        ReferenceCountHelper.setReferenceCountOwner(null);
                    } else {
                        ov = reentry.getValueRetain(owner, true);
                    }
                    if (ov == null) {
                        ov = Token.NOT_AVAILABLE;
                    }
                    basicSetOldValue(ov);
                } else {
                    basicSetOldValue(Token.NOT_AVAILABLE);
                }
            }
        }

        if (!Pattern.compile("\\p{IsLu}").matcher("A").matches() || !Pattern.compile("\\p{Lu}").matcher("A").matches() || !Pattern.compile("\\p{gc=Lu}").matcher("A").matches() || !Pattern.compile("\\p{general_category=Lu}").matcher("A").matches() || !Pattern.compile("\\p{IsLatin}").matcher("B").matches() || !Pattern.compile("\\p{sc=Latin}").matcher("B").matches() || !Pattern.compile("\\p{script=Latin}").matcher("B").matches() || !Pattern.compile("\\p{InBasicLatin}").matcher("c").matches() || !Pattern.compile("\\p{blk=BasicLatin}").matcher("c").matches() || !Pattern.compile("\\p{block=BasicLatin}").matcher("c").matches())
            failCount++;

        if (tags1.size() != tags2.size()) {
            return false;
        }

        if (implementation.equals("local")) {
            builder.put("client", TestThreadGroups.NETTY_CLIENT_GROUP.get());
            builder.put("boss", TestThreadGroups.NETTY_BOSS_GROUP.get());
            builder.put("worker", TestThreadGroups.NETTY_CLIENT_GROUP.get());
        }

        if (plans.size() == 1) {
            return;
        }

        if (change.wasRemoved()) {
            for (WindowIcon i : change.getRemoved()) {
                titleBar.removeLeftIcon(i);
            }
        } else if (change.wasAdded()) {
            for (WindowIcon i : change.getAddedSubList()) {
                titleBar.addLeftIcon(i);
            }
        }

        if (role == ROLE.OWNING) {
            if (_referenceValue == null) {
                return null;
            }
            if (type == TYPE.ONE_TO_ONE || type == TYPE.MANY_TO_ONE) {
                BsonValue id = _referenceValue;
                if (id.isArray() && id.asArray().size() == 1) {
                    id = id.asArray().get(0);
                }
                return URLUtils.getUriWithDocId(context, db, targetCollection, id);
            } else {
                if (!_referenceValue.isArray()) {
                    throw new IllegalArgumentException("in resource " + dbName + "/" + collName + "/" + data.get("_id") + " the " + type.name() + " relationship ref-field " + this.referenceField + " should be an array, but it is " + _referenceValue);
                }
                List<BsonValue> bsonVals = _referenceValue.asArray().getValues();
                BsonValue[] ids = bsonVals.toArray(new BsonValue[bsonVals.size()]);
                return URLUtils.getUriWithFilterMany(context, db, targetCollection, ids);
            }
        } else {
            BsonValue id = data.get("_id");
            if (type == TYPE.ONE_TO_ONE || type == TYPE.ONE_TO_MANY) {
                return URLUtils.getUriWithFilterOne(context, db, targetCollection, referenceField, id);
            } else if (type == TYPE.MANY_TO_ONE || type == TYPE.MANY_TO_MANY) {
                return URLUtils.getUriWithFilterManyInverse(context, db, targetCollection, referenceField, id);
            }
        }

        if (newPrefix != null) {
            if (writePrefixList == null) {
                writePrefixList = new ArrayList<String>();
                writeNSList = new ArrayList<String>();
            }
            if (!writePrefixList.contains(newPrefix)) {
                writePrefixList.add(newPrefix);
                writeNSList.add(eNamespace);
            }
        }

        if (Instance.isMissingValue(m_recordCount)) {
            double baseCount = 0;
            for (ScoreDistribution s : m_scoreDistributions) {
                baseCount += s.getRecordCount();
            }
            for (ScoreDistribution s : m_scoreDistributions) {
                s.deriveConfidenceValue(baseCount);
            }
        }

        if (aPath == null && !singleRoot) {
            aResponse.appendContentString(xmlRoots);
            aResponse.setHeader("YES", "isRoots");
        } else {
            if (aPath == null) aPath = rootStrings[0];
            NSArray anArray = fileListForStartingPath(aPath, showFiles);
            if (anArray == null) {
                aResponse.appendContentString("ERROR");
            } else {
                _JavaMonitorCoder aCoder = new _JavaMonitorCoder();
                String anXMLString = null;
                anXMLString = aCoder.encodeRootObjectForKey(anArray, "pathArray");
                anXMLString = (anXMLString) + " \r\n";
                aResponse.appendContentString(anXMLString);
                aResponse.setHeader(aPath, "filepath");
            }
        }

        if (builder.initialEvent == null) {
            event = flow.initialEvent;
        } else {
            event = builder.initialEvent;
        }

        if (!(in_grouping_b(g_valid_LI, 99, 116))) {
            return false;
        }

        if (chineseCalendar.getTimeInMillis() != chineseCalendar2.getTimeInMillis()) {
            errln("time1: " + chineseCalendar.getTimeInMillis());
            errln("time2: " + chineseCalendar2.getTimeInMillis());
            errln("Lunar [MM/dd/y(G) HH:mm:ss] " + dateFormat.format(chineseCalendar));
            errln("**PROBLEM Grego [MM/dd/y(G) HH:mm:ss] " + simpleDateFormat.format(gregorianCalendar));
            errln("Grego [MM/dd/y(G) HH:mm:ss] " + simpleDateFormat.format(gregorianCalendar));
            errln("Lunar [MM/dd/y(G) HH:mm:ss] " + dateFormat.format(chineseCalendar2));
        }

        if (originalColspan > 1) {
            css.append(" imxt-colspan-");
            css.append(originalColspan);
        }

        if (end - start + 1 < minLen) {
            minLen = end - start + 1;
            res = s.substring(start, end + 1);
        }

        if (!raw.isCurrent('\'')) return null;

        if ((mask & ALL) != mask) throw new IllegalArgumentException("invalid actions mask");

        if (offerCanBeReclaimedFromUnusedResources) {
            LOG.trace("Able to reclaim offer {} from unused resources in OfferHolder from host {}. cpu: {}, mem: {}, disk: {}", offer.getId().getValue(), offer.getHostname(), MesosUtils.getNumCpus(offer), MesosUtils.getMemory(offer), MesosUtils.getDisk(offer));
            currentResources = MesosUtils.subtractResources(currentResources, offer.getResourcesList());
        }

        if (percentualConvergenciaRepavimentacao != null) {
            if (metragem.add(metragem.multiply(percentualConvergenciaRepavimentacao).divide(new BigDecimal(100))).compareTo(metragemRetono) >= 0 && metragem.subtract(metragem.multiply(percentualConvergenciaRepavimentacao).divide(new BigDecimal(100))).compareTo(metragemRetono) <= 0) {
                indicadorAceiteComCalculoPercentualConvergencia = 1;
            } else {
                indicadorAceiteComCalculoPercentualConvergencia = 2;
            }
        }

        if (!entriesToUnset.containsKey(originalEntry.getKey())) {
            conf.set(originalEntry.getKey(), originalEntry.getValue());
        }

        if (!msg.hasComponent(GroupComponent.class) || direction == Messages.DIRECTION_IN) {
            details.append('\n');
            if (direction == Messages.DIRECTION_OUT) details.append(res.getString(R.string.to_address_label));
            else details.append(res.getString(R.string.from_label));
            String displayName = (decodedName != null) ? decodedName + "\n<" + decodedPeer + ">" : decodedPeer;
            details.append(displayName);
        }

        if (env.getMaximum(0) < env.getMinimum(0)) return new ReferencedEnvelope(env.getCoordinateReferenceSystem());

        if (!FPIntSet.isCompleted(status)) {
            return index;
        }

        if ((arg.equals("-fr") || arg.equals("--followRedirect")) && largs.size() > 1) {
            final String b = largs.get(1);
            largs.remove(0);
            largs.remove(0);
            downloaderSettings.add(new Func1<Object, HttpDownloader>() {
                @Override
                public Object apply(HttpDownloader downloader) {
                    downloader.setFollowRedirect(b.equalsIgnoreCase("true"));
                    return null;
                }
            });
            requestSettings.add(new Func1<Object, HttpRequest>() {
                @Override
                public Object apply(HttpRequest req) {
                    req.setFollowRedirect(b.equalsIgnoreCase("true"));
                    return null;
                }
            });
            continue;
        }

        if (te != null) {
            return targetTagName != null && targetTagName.equals(tn);
        }

        if (!observerLookup.containsKey(observerIdentifier)) {
            throw new IllegalStateException("The specified observer identifier does not exist.");
        }

        if (builder.getTokenType() != expectedToken) {
            PsiBuilder.Marker unexpectedTokensMarker = builder.mark();
            while (!builder.eof() && builder.getTokenType() != expectedToken && !RECOVERY_SET.contains(builder.getTokenType())) {
                builder.advanceLexer();
            }
            recordLeafTokenError(expectedToken, unexpectedTokensMarker);
        }

        if (inoutLine == null) {
            inoutLine = new DeliveryLineCandidate(candidate, sched, completeStatus);
            inoutLine.setQtyToDeliver(deliver);
            inoutLines.add(inoutLine);
            candidates.addLine(inoutLine);
        } else {
            final BigDecimal inoutLineQtyOld = inoutLine.getQtyToDeliver();
            final BigDecimal inoutLineQtyNew = inoutLineQtyOld.add(deliver);
            inoutLine.setQtyToDeliver(inoutLineQtyNew);
        }

        if (!force) {
            result = cache.get(lessResourceReference, skinReference, colorThemeReference);
            if (result != null) {
                if (lessContext.isHtmlExport() && useVelocity && this instanceof DefaultLESSCompiler) {
                    compiler.compute(lessResourceReference, includeSkinStyle, true, false, skin);
                }
                return cloneResult(result);
            }
        }

        if (fContentHandler != null) {
            fContentHandler.endDocument();
        }

        if (!exiting) {
            sourceOpenLock.lock();
            try {
                FactoryInputStream.InjectorStreamSource.inject(FactoryInputStream.InjectorStreamSource.DefautlInjectorKey, is);
                tracker.open(source);
            } finally {
                sourceOpenLock.unlock();
            }
            TaskDataSource stream = tracker.init(source);
            if (stream != null) {
                SourceWrapper wrapper = new SourceWrapper(nextWrapperId.incrementAndGet(), stream, source);
                wrapperList.add(wrapper);
                peekerService.submit(new Peeker(wrapper));
                initialized = true;
            }
        }

        if (value instanceof Calendar) {
            value = ((Calendar) value).getTime();
        }

        if (getBlock().isProcedureDeclBlock() && (parent == null || !(parent instanceof FactoryManager))) {
            this.collapseLabel = new ProcedureCollapseLabel(workspace, blockID);
            this.add(collapseLabel);
        } else if (getBlock().isAbstractionBlock() && (parent == null || !(parent instanceof FactoryManager))) {
            this.collapseLabel = new AbstractionBlockCollapseLabel(workspace, blockID);
            this.add(collapseLabel);
        }

        if (!leftLigands[0].getLigandAtom().equals(x)) conformation = conformation.invert();

        if (startsAggregatorQueue != null) {
            startsAggregatorQueue.offer(AggregatorUtil.createConfigChangeRequestRecord(rulesConfigurationChangeRequest, resolvedParameters));
        }

        if (account.hashCode() != updatingAccount.hashCode()) {
            updatingAccount.clearMetadata();
            for (final SchemaType key : account.getMetadataKeys()) {
                updatingAccount.setMetadataValue(key, account.getMetadataValue(key));
            }
        }

        if (!foundFeatures) {
            Double2D vecOther = collideCircle.getPosition().subtract(vertices[curFeat]);
            double proj = vecOther.dot(edges[curFeat]);
            Double2D edgePoint = vertices[curFeat].add(edges[curFeat].multiply(proj));
            if (testVR(vertices[curFeat], normals[curFeat], edges[curFeat], collideCircle.getPosition(), true) && testVR(vertices[nextFeat], edges[curFeat].multiply(-1), normals[curFeat], collideCircle.getPosition(), true)) {
                foundFeatures = true;
                pair.closestFeature1 = new Integer(curFeat);
                dist = collideCircle.getPosition().subtract(edgePoint).length();
                if (reversed) {
                    pair.colPoint1 = edgePoint.subtract(collidePoly.getPosition());
                    pair.colPoint2 = edgePoint.subtract(collideCircle.getPosition());
                    pair.normal = new Double2D(-normals[curFeat].x, -normals[curFeat].y);
                } else {
                    pair.colPoint2 = edgePoint.subtract(collidePoly.getPosition());
                    pair.colPoint1 = edgePoint.subtract(collideCircle.getPosition());
                    pair.normal = normals[curFeat];
                }
            }
        }

        if (httpServletRequest.getParameter("limparForm") != null || httpServletRequest.getAttribute("limparForm") != null) {
            form.setFoneTipo("");
            form.setIndicadorFonePadrao("1");
            form.setDdd("");
            form.setNumeroTelefone("");
            form.setRamal("");
        }

        if (selectedVelocityPanel != null && selectedVelocityPanel != velocityPanel)
            selectedVelocityPanel.setVisible(false);

        if (this.editData != null) {
        }

        if (isCluster(oName)) {
            String targetName = getName(oName);
            if (targetName != null) {
                result.addAllInstances(MbeanService.getInstance().getInstances(targetName));
            }
        }

        if (m.getNumExplainedKO() >= filter) {
            edges.addAll(m.getEdges());
            File f = writeSubmodel(m, filename, cnt);
            output.addModel(f);
            cnt++;
        }

        if (m_client.sendEMail(activity.getAD_User_ID(), subject, message, pdf)) counter++;

        if (Utils.getIntersection(SUPPORTED_PARAM_ANNOTATIONS, Collections.unmodifiableSet(new HashSet(Arrays.asList(annotations)))) > 1) {
            throw new IllegalArgumentException(String.format("Must have exactly one annotation from %s for parameter %d in method %s", SUPPORTED_PARAM_ANNOTATIONS, i, method));
        }

        if (createColoVariantsForService) {
            coloServiceName = D2Utils.addSuffixToBaseName(serviceName, colo);
        }

        if (buildServer.getBuildServerVersion().isV1()) {
            buildQualities = TeamBuildCache.getInstance(buildServer, teamProject).getBuildQualities(false);
        } else {
            final String[] temp = TeamBuildCache.getInstance(buildServer, teamProject).getBuildQualities(false);
            buildQualities = new String[temp.length + 1];
            buildQualities[0] = "";
            System.arraycopy(temp, 0, buildQualities, 1, temp.length);
        }

        if (sourcesSize != 0) {
            deletedInsns.add(insn);
        }

        if (consentTierstatus.getConsentTier().getId().longValue() == consentTierID) {
            consentTierstatus.setStatus(Constants.WITHDRAWN);
            updateSpecimensInSCG(scg, oldscg, consentTierID, withdrawOption, dao, sessionDataBean);
        }

        if (isPermanentTransition) syncToSystem(true);

        if (localEP == null) throw new KNXIllegalArgumentException("no local endpoint specified");

        if (radius == COLLINEARS || radius == 0) {
            return controlPoints;
        }

        if (!Logger.getRootLogger().getAllAppenders().hasMoreElements()) {
            BasicConfigurator.configure();
        }

        if (beg >= 1 && layout.charAt(beg - 1) == '-') --beg;

        if (record instanceof MissingCellDummyRecord) {
            MissingCellDummyRecord mc = (MissingCellDummyRecord) record;
            curCol = mc.getColumn();
            curNum = Double.NaN;
        }

        if (state != null) state.domGenerator = null;

        if (LogManagerInModuleTest.class.getModule().isNamed()) {
            throw new RuntimeException("Unexpected named module for " + LogManagerInModuleTest.class + ": " + LogManagerInModuleTest.class.getModule().getName());
        }

        if (!nodeService.hasAspect(nodeRef, ASPECT_SCHEDULED)) {
            nodeService.addAspect(nodeRef, ASPECT_SCHEDULED, null);
        }

        if (!assignedCardinality.contains(roleField)) {
            try {
                Map<String, TopicIF> params = new HashMap<String, TopicIF>();
                params.put("TT", tt);
                params.put("AT", at);
                params.put("RT", rt);
                qr = qp.execute("select $C from on:has-cardinality(%TT% : on:topic-type, %AT% : on:field, %RT% : on:role-type, $C : on:cardinality)?", params, dc);
                if (qr.next()) {
                    TopicIF card = (TopicIF) qr.getValue(0);
                    AssociationIF a6 = builder.makeAssociation(getTopic(topicmap, base_on, "has-cardinality"));
                    builder.makeAssociationRole(a6, getTopic(topicmap, base_on, "field-definition"), roleField);
                    builder.makeAssociationRole(a6, getTopic(topicmap, base_on, "cardinality"), card);
                    assignedCardinality.add(roleField);
                }
            } finally {
                if (qr != null) qr.close();
            }
        }

        if (maxResults > 0) {
            if (subjects.size() >= maxResults) break;
        }

        if (lastEntity != null && lastEntity.equals(entity)) {
            ChatLineSeparator chatLineSeparator = new ChatLineSeparator(contentComposite, name, color, time);
            chatLineSeparator.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            chatLineSeparator.setData(entity);
        } else {
            ChatLinePartnerChangeSeparator chatPartnerChangeLine = new ChatLinePartnerChangeSeparator(contentComposite, name, color, time);
            chatPartnerChangeLine.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            chatPartnerChangeLine.setData(entity);
        }

        if (specificConfig != null) {
            batchSize = specificConfig.getBatchSize();
            intervalMilis = specificConfig.getIntervalMilis();
            intervalOperations = specificConfig.getIntervalOperations();
            channelType = specificConfig.getChannelType();
        }

        if (getQuantidadeColiformesTotaisAnalisadas() != null && !getQuantidadeColiformesTotaisAnalisadas().equals("")) {
            qualidadeAgua.setQuantidadeColiformesTotaisAnalisadas(new Integer(getQuantidadeColiformesTotaisAnalisadas()));
        }

        if (listDir == null) {
            return retset;
        }

        if (filter.getIDs().size() == 0) {
            return Filter.EXCLUDE;
        }

        if (parent == null) {
            sourceNode = processNode(source, rootNetwork, null);
            targetNode = processNode(target, rootNetwork, null);
            edge = rootNetwork.addEdge(sourceNode, targetNode, true);
        } else {
            sourceNode = processNode(source, rootNetwork, parent.getSubNetwork());
            targetNode = processNode(target, rootNetwork, parent.getSubNetwork());
            edge = parent.getSubNetwork().addEdge(sourceNode, targetNode, true);
        }

        if (newMaintainable == null) {
            throw new ValidationException("Maintainable object from Maintenance Document '" + maintenanceDocument.getDocumentTitle() + "' is null, unable to proceed.");
        }

        if (Math.random() > 0.25) {
            xForm.addVariation(1, VariationFuncList.getVariationFuncInstance(Math.random() < 0.5 ? "polar" : "polar2", true));
        } else {
            xForm.addVariation(1, VariationFuncList.getVariationFuncInstance(VariationFuncList.getRandomVariationname(), true));
        }

        if (msgPattern == null) {
            msgPattern = new MessagePattern();
        }

        if (newRange.start != oldRange.start || newRange.length != oldRange.length) {
            sortMon.cancel();
        }

        if (random == null) {
            random = this.random;
        }

        if (indicadorUso != null && !indicadorUso.trim().equals("")) {
            peloMenosUmParametroInformado = true;
            filtroTabelaAuxiliarAbreviada.adicionarParametro(new ParametroSimples(FiltroTabelaAuxiliarAbreviada.INDICADORUSO, indicadorUso));
        }

        if (object.yellowAverageWaitingTime != null) {
            fieldCount++;
            jacksonSerializer.writeStringField("yellowAverageWaitingTime", object.yellowAverageWaitingTime);
        }

        if (cnt - tailoff() < 32) {
            Object[] newTail = new Object[tail.length + 1];
            System.arraycopy(tail, 0, newTail, 0, tail.length);
            newTail[tail.length] = val;
            return new PersistentVector(meta(), cnt + 1, shift, root, newTail);
        }

        if (args.length > 2) {
            FilteredIssueLister client = new FilteredIssueLister(args[0], args[1]);
            try {
                if (args[2].equalsIgnoreCase("ancestors")) {
                    if (args.length == 2) {
                        System.err.println("Missing version argument.");
                        System.exit(1);
                    }
                    client.printAncestors(args[3]);
                } else if (args[2].equalsIgnoreCase("releases")) {
                    client.printReleases();
                } else {
                    if (args.length < 4) {
                        System.err.println("Missing argument(s).");
                        System.exit(1);
                    }
                    String[] overriddenAncestry = null;
                    if (args.length > 5) {
                        overriddenAncestry = args[5].split(",");
                        if (args[0].equalsIgnoreCase("ignore")) {
                            overriddenAncestry = new String[0];
                        } else if (args[0].equalsIgnoreCase("derive")) {
                            overriddenAncestry = null;
                        }
                    }
                    client.prepareReleaseNotes(args[2], Long.parseLong(args[3]), args[4], overriddenAncestry);
                }
            } finally {
                client.destroy();
            }
        } else {
            System.err.println(USAGE);
        }

        if (!agent.receivedDuccState) {
            agent.receivedDuccState = true;
        }

        if (!isFullYear()) {
            for (BibliographicPeriod range : ranges) {
                if (equals(range.getStartEdge()) || equals(range.getEndEdge())) {
                    if (log.isDebug2()) log.debug2(DEBUG_HEADER + "result is true.");
                    return true;
                }
            }
            if (log.isDebug2()) log.debug2(DEBUG_HEADER + "result is false.");
            return false;
        }

        if (type == Types.VARCHAR || type == Types.LONGVARCHAR || type == Types.CHAR || type == Types.CLOB || type == Types.NVARCHAR) {
            return (matchString(item));
        } else if (type == Types.BIGINT) {
            return Caster.toString(Caster.toLongValue(item.getValue()));
        } else if (type == Types.INTEGER || type == Types.SMALLINT || type == Types.TINYINT) {
            return Caster.toString(Caster.toIntValue(item.getValue()));
        } else if (type == Types.DECIMAL || type == Types.NUMERIC || type == Types.DOUBLE || type == Types.FLOAT) {
            return (Caster.toString(Caster.toDoubleValue(item.getValue())));
        } else if (type == Types.TIME) {
            return new TimeImpl(DateCaster.toDateAdvanced(item.getValue(), null)).castToString();
        } else if (type == Types.DATE) {
            return new DateImpl(DateCaster.toDateAdvanced(item.getValue(), null)).castToString();
        } else if (type == Types.TIMESTAMP) {
            return DateCaster.toDateAdvanced(item.getValue(), null).castToString();
        } else {
            return Caster.toString(item.getValue());
        }

        if (instantiateJoinpoint == null) {
            if (beanInfo == null) throw new StartException(PojoLogger.ROOT_LOGGER.missingBeanInfo(beanConfig));
            Constructor ctor = (types.length == 0) ? beanInfo.getConstructor() : beanInfo.findConstructor(types);
            ConstructorJoinpoint constructorJoinpoint = new ConstructorJoinpoint(ctor);
            constructorJoinpoint.setParameters(parameters);
            instantiateJoinpoint = constructorJoinpoint;
        }

        if (qMeQuestionDetail.getAnswerOptionList() != null && qMeQuestionDetail.getAnswerOptionList().size() > 0) {
            List<QMeAnswerOption> answerOptionList = qMeQuestionDetail.getAnswerOptionList();
            for (QMeAnswerOption answerOption : answerOptionList) {
                saveAnswerOption(question.getQuestionID(), answerOption, userId);
            }
        }

        if (!projectLocationURIset && storeReferredProjectLocationURI) {
            URI locationuri = null;
            try {
                locationuri = org.eclipse.core.runtime.URIUtil.fromString(location);
                if (locationuri.getScheme() == null || locationuri.getScheme().length() <= 1) {
                    Path locationPath = new Path(location);
                    locationuri = org.eclipse.core.runtime.URIUtil.fromString("file:/" + locationPath.toString());
                }
            } catch (URISyntaxException e) {
                ErrorReporter.logExceptionStackTrace(e);
                return false;
            }
            IPath path = new Path(projectFile);
            path = path.removeLastSegments(1);
            URI projecturi = URIUtil.toURI(path);
            URI result = org.eclipse.core.runtime.URIUtil.makeRelative(locationuri, projecturi);
            element.setAttribute(ProjectFormatConstants.REFERENCED_PROJECT_LOCATION_ATTRIBUTE, result.toString());
        }

        if (unitIndex >= size) {
            return 0;
        }

        if (eventLogStatus == null) {
            log().warn("Cannot receive eventLogStatus.");
        } else {
            if (log().isDebugEnabled()) {
                log().debug("poll: eventLogStatus: " + eventLogStatus);
            }
            eventLogStatusTxt = resolveDellStatus(eventLogStatus.toInt());
        }

        if (!includeFailoverOnly && connection.isFailoverOnly()) continue;

        if (delivery.ack() != null) {
            delivery.ack().apply(Undelivered$.MODULE$, delivery.uow());
        }

        if (this.hasUserRole(userId, requestInCaptureExceptionRoleProperty.getLongValue())) {
            LOG.info("Usuario tiene rol de excepcion de tramites en proceso");
            hasUserRequestInProcess = false;
        } else {
            if (this.getActiveRequestInCapture(userId) == 0) {
                LOG.info("el usuario no tiene tramites en proceso");
                hasUserRequestInProcess = false;
            }
        }

        if (index < parameter.index) {
            return -1;
        }

        if (otherFakeDS) {
            fakeRd2.assertReceivedUpdates(otherFakeDsGenId == DEFAULT_GENID ? nSentUpdates : 0);
        }

        if (br.containsHTML("Video is Unavailable")) {
            throw new PluginException(LinkStatus.ERROR_FILE_NOT_FOUND);
        } else if (server_issues) {
            downloadLink.getLinkStatus().setStatusText("Linktype not yet supported");
            downloadLink.setName(filename + default_Extension);
            return AvailableStatus.TRUE;
        }

        if (httpServletRequest.getParameter("menu") != null && !httpServletRequest.getParameter("menu").equals("")) {
            form.setTipoPesquisa(ConstantesSistema.TIPO_PESQUISA_INICIAL.toString());
            form.setIndicadorComandoSimulado(ConstantesSistema.TODOS.toString());
            if (httpServletRequest.getParameter("menu").equals("sim")) {
                form.setPopup(ConstantesSistema.NAO.toString());
                sessao.setAttribute("popup", ConstantesSistema.NAO.toString());
            } else if (httpServletRequest.getParameter("menu").equals("ok")) {
                form.setPopup(ConstantesSistema.SIM.toString());
                sessao.setAttribute("popup", ConstantesSistema.SIM.toString());
            }
        }

        if (!(ae instanceof Mech) && !(ae instanceof Protomech)) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "Only mechs and protomechs can be grappled");
        }

        if (report.hasError() || cms.existsResource(fileOneName) || OpenCms.getModuleManager().hasModule(moduleName)) {
            fail("it should be possible to delete a module containing a file locked by the same user");
        }

        if (teammate.getCarriedItem() == weapon) {
            ((TeammateEquipment) teammate.getCombatEquipment()).update(teammate);
            break;
        }

        if (tranformType.equals(SqlTransformationAspect.Types.SELECT)) {
            sb.append(IndexConstants.RECORD_TYPE.SELECT_TRANSFORM);
        } else if (tranformType.equals(SqlTransformationAspect.Types.INSERT)) {
            sb.append(IndexConstants.RECORD_TYPE.INSERT_TRANSFORM);
        } else if (tranformType.equals(SqlTransformationAspect.Types.UPDATE)) {
            sb.append(IndexConstants.RECORD_TYPE.UPDATE_TRANSFORM);
        } else if (tranformType.equals(SqlTransformationAspect.Types.DELETE)) {
            sb.append(IndexConstants.RECORD_TYPE.DELETE_TRANSFORM);
        } else if (tranformType.equals(SqlTransformationAspect.Types.PROCEDURE)) {
            sb.append(IndexConstants.RECORD_TYPE.PROC_TRANSFORM);
        } else if (tranformType.equals(SqlTransformationAspect.Types.MAPPING)) {
            sb.append(IndexConstants.RECORD_TYPE.MAPPING_TRANSFORM);
        }

        if (FolderConfig.getSendDocumentToExtern()) {
            for (IdentityWrapper toValue : toValues) {
                Identity id = toValue.getIdentity();
                if (!MailHelper.isValidEmailAddress(id.getUser().getProperty(UserConstants.EMAIL, null)) && !securityManager.isIdentityVisible(id)) {
                    invalidTos.add(id);
                }
            }
        } else {
            for (IdentityWrapper toValue : toValues) {
                Identity id = toValue.getIdentity();
                if (!securityManager.isIdentityVisible(id)) {
                    invalidTos.add(id);
                }
            }
        }

        if (args.length != 1) {
            System.err.println("\nUsage: java LoadDataFromArffFile <file|URL>\n");
            System.exit(1);
        }

        if (propertyElement.hasAttribute("fileURL")) {
            String fileURL = propertyElement.getAttribute("fileURL");
            if (PropertyRefResolver.containsProperty(fileURL)) {
                unresolvedUrls.add(fileURL);
                continue;
            }
            instantiateGraphParametersFile(graph.getGraphParameters(), fileURL);
        } else if (propertyElement.hasAttribute("name")) {
            String name = propertyElement.getAttribute("name");
            if (isValidGraphParameterName(name)) {
                graph.getGraphParameters().addGraphParameter(name, propertyElement.getAttribute("value"));
            }
        } else {
            throwXMLConfigurationException("Invalid property definition :" + propertyElement);
        }

        if (installedDirectoryTargetFile.exists() || uninstalledDirectoryTargetFile.exists()) {
            Set<App> registeredApps = appManager.getApps();
            App conflictingApp = null;
            File registeredAppFile;
            for (App registeredApp : registeredApps) {
                registeredAppFile = registeredApp.getAppFile();
                if (registeredAppFile != null && registeredAppFile.getName().equalsIgnoreCase(appFile.getName())) {
                    conflictingApp = registeredApp;
                }
            }
            if (conflictingApp != null) {
                if (this.getAppName().equalsIgnoreCase(conflictingApp.getAppName())) {
                    if (appFile.getParentFile().getCanonicalPath().equals(uninstalledAppsPath)) {
                    } else if (conflictingApp.getStatus() == AppStatus.UNINSTALLED) {
                    } else {
                    }
                } else {
                    Collection<String> directoryPaths = new LinkedList<String>();
                    directoryPaths.add(installedAppsPath);
                    directoryPaths.add(uninstalledAppsPath);
                    copyDestinationFileName = suggestFileName(directoryPaths, appFile.getName());
                }
            }
        }

        if (response instanceof ResultMessage) return (ResultMessage) response;

        if (inputEndWithCommaStr != null && inputEndWithCommaStr.length() > 0)
            inputEndWithCommaCS = ScriptEngineUtil.compileScript(inputEndWithCommaStr);

        if (StringUtils.isBlank(url)) {
            return url;
        }

        if (checkModules && ref.module != null) {
            if (ref.module != fnModule && !moduleGraph.dependsOn(ref.module, fnModule)) {
                isRemovable = false;
                checkModules = false;
            }
        }

        if (listOfPears.size() < 2) {
            logErrorMessage(PEAR_MERGER + " error: " + "input PEAR files not specified");
            return false;
        } else {
            __pearFiles = new File[listOfPears.size()];
            listOfPears.toArray(__pearFiles);
        }

        if (element.isContentOf(content))
            throw ContentExceptionFactory.createContentException(focus, content, ContentException.DESIGN_EXCEPTION_RECURSIVE);

        if (addProxyContextPath) {
            String proxyContextPath = ServerConfiguration.getInstance().getFirstProperty(IdentityCoreConstants.PROXY_CONTEXT_PATH);
            if (StringUtils.isNotBlank(proxyContextPath)) {
                if (proxyContextPath.trim().charAt(0) != '/') {
                    serverUrl.append("/").append(proxyContextPath.trim());
                } else {
                    serverUrl.append(proxyContextPath.trim());
                }
            }
        }

        if (payAppDocNumbers.isEmpty()) {
            return payApps;
        }

        if (endValidTime.isBefore(issueInstant)) {
            endValidTime = issueInstant.plusMinutes(5);
        }

        if (item == null) {
            return Response.status(Status.BAD_REQUEST).build();
        }

        if (fDocumentTypeIndex != -1) {
            boolean found = false;
            int node = fDeferredDocumentImpl.getLastChild(fDocumentTypeIndex, false);
            while (node != -1) {
                short nodeType = fDeferredDocumentImpl.getNodeType(node, false);
                if (nodeType == Node.ENTITY_NODE) {
                    String nodeName = fDeferredDocumentImpl.getNodeName(node, false);
                    if (nodeName.equals(name)) {
                        found = true;
                        break;
                    }
                }
                node = fDeferredDocumentImpl.getRealPrevSibling(node, false);
            }
            if (!found) {
                int entityIndex = fDeferredDocumentImpl.createDeferredEntity(name, null, null, null, fBaseURIStack.peek());
                fDeferredDocumentImpl.appendChild(fDocumentTypeIndex, entityIndex);
            }
        }

        if (movie.getArtworkFilename(MediaFileType.POSTER).isEmpty()) {
            for (MediaFile mf : mfs) {
                if (mf.getType().equals(MediaFileType.GRAPHIC)) {
                    LOGGER.debug("| parsing unknown graphic " + mf.getFilename());
                    List<MediaFile> vid = movie.getMediaFiles(MediaFileType.VIDEO);
                    if (vid != null && !vid.isEmpty()) {
                        String vfilename = vid.get(0).getFilename();
                        if (FilenameUtils.getBaseName(vfilename).equals(FilenameUtils.getBaseName(mf.getFilename())) || FilenameUtils.getBaseName(Utils.cleanStackingMarkers(vfilename)).trim().equals(FilenameUtils.getBaseName(mf.getFilename())) || movie.getTitle().equals(FilenameUtils.getBaseName(mf.getFilename()))) {
                            mf.setType(MediaFileType.POSTER);
                            movie.addToMediaFiles(mf);
                        }
                    }
                }
            }
        }

        if (this.notifierMap.containsKey(wave.waveType())) {
            final WaveSubscription ws = this.notifierMap.get(wave.waveType());
            wave.setWaveHandlers(ws.getWaveHandlers().stream().filter(wh -> wh.check(wave)).collect(Collectors.toList()));
            for (final WaveHandler waveHandler : new ArrayList<>(wave.getWaveHandlers())) {
                waveHandler.handle(wave);
            }
        } else {
            LOGGER.warn(NO_WAVE_LISTENER, wave.waveType().toString());
            if (CoreParameters.DEVELOPER_MODE.get()) {
                this.unprocessedWaveHandler.manageUnprocessedWave(NO_WAVE_LISTENER.getText(wave.waveType().toString()), wave);
            }
        }

        if (one.MASTER) {
            Assert.assertEquals("should be: AAA", "AAA", one.city);
        } else if (one.customer_id == 3) {
            Assert.assertEquals("should has output details", "city: 1.0", one.MATCHING_DISTANCES);
        } else {
            Assert.assertEquals("should has output details", "city:1.0", one.MATCHING_DISTANCES);
        }

        if (oc == null && LOG.isTraceEnabled()) {
            LOG.trace("Close called without any rows processed");
        }

        if (rhs.kind() == Kind.GET_CLASS) {
            return String.format("%s.isInstance(%s)", lhs.source(), rhs.value());
        }

        if (eq.size() == 1) return Collections.singleton(ts);

        if (distance <= 0) {
            log.debug("Distance is " + distance + ", found solution");
            Map<String, Object> new_model = getConcreteValues(variables);
            setConcreteValues(variables, initialValues);
            SolverResult satResult = SolverResult.newSAT(new_model);
            return satResult;
        } else {
            setConcreteValues(variables, initialValues);
            log.debug("Returning null, search was not successful");
            SolverResult unsatResult = SolverResult.newUNSAT();
            return unsatResult;
        }

        if (!Check.isEmpty(accountDimension.getAlias(), true)) {
            acct.setAlias(accountDimension.getAlias().trim());
        }

        if (vm.getLastHostId() != null) {
            HostVO lastHost = hostDao.findByIdIncludingRemoved(vm.getLastHostId());
            if (lastHost.getStatus() == com.cloud.host.Status.Up && !lastHost.isInMaintenanceStates())
                return lastHost.getId();
        }

        if (!BaseSqoopTestCase.isOnPhysicalCluster()) {
            conf.set(CommonArgs.FS_DEFAULT_NAME, CommonArgs.LOCAL_FS);
        }

        if (tab_tabla.eliminar()) {
            aut_clientes.actualizar();
            aut_clientes.setSize(75);
            utilitario.addUpdate("aut_clientes");
            limpiar();
        }

        if (encoding != null && encoding.equals("deflate")) {
            is = new BufferedInputStream(new InflaterInputStream(is), 1000);
            if (showCompress) System.out.printf("deflate %s%n", urlString);
        } else if (encoding != null && encoding.equals("gzip")) {
            is = new BufferedInputStream(new GZIPInputStream(is), 1000);
            if (showCompress) System.out.printf("gzip %s%n", urlString);
        } else {
            if (showCompress) System.out.printf("none %s%n", urlString);
        }

        if (conf.containsKey(PropertyKey.S3A_ACCESS_KEY) && conf.containsKey(PropertyKey.S3A_SECRET_KEY)) {
            return new StaticCredentialsProvider(new BasicAWSCredentials(conf.getValue(PropertyKey.S3A_ACCESS_KEY), conf.getValue(PropertyKey.S3A_SECRET_KEY)));
        }

        if (!(rootId.split("/").length > 3) && (filename.split("/").length < 2) && filename.endsWith(".zip")) {
            return filename;
        }

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:partner.soap.sforce.com");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Gender", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Gender", xmlWriter);
            }
        }

        if (InterfaceWrapperHelper.isValueChanged(ppOrder, I_PP_Order.COLUMNNAME_M_Warehouse_ID) || InterfaceWrapperHelper.isValueChanged(ppOrder, I_PP_Order.COLUMNNAME_M_Locator_ID) || InterfaceWrapperHelper.isValueChanged(ppOrder, I_PP_Order.COLUMNNAME_AD_Org_ID)) {
            ppOrderBL.updateBOMOrderLinesWarehouseAndLocator(ppOrder);
        }

        if (line != null) logger.debug("updatedata, line = " + line.getId());

        if (foldersOnly && !child.isDirectory()) {
            continue;
        }

        if (password != null) {
            Arrays.fill(password, (char) 0);
        }

        if (targetGroup != null) {
            for (TableName table : tables) {
                if (master.getAssignmentManager().isTableDisabled(table)) {
                    LOG.debug("Skipping move regions because the table" + table + " is disabled.");
                    continue;
                }
                for (RegionInfo region : master.getAssignmentManager().getRegionStates().getRegionsOfTable(table)) {
                    LOG.info("Moving region " + region.getShortNameToLog() + " to RSGroup " + targetGroup);
                    master.getAssignmentManager().move(region);
                }
            }
        }

        if (MicroWriter.writeToFile(getAsDocument(sFullContextPath), new File(aBaseDir, CXMLSitemap.SITEMAP_ENTRY_FILENAME), aXWS).isFailure()) {
            s_aLogger.error("Failed to write " + CXMLSitemap.SITEMAP_ENTRY_FILENAME + " file!");
            return ESuccess.FAILURE;
        }

        if (isDeclaration) {
            PerlVariableCompletionUtil.fillWithUnresolvedVars((PerlVariableNameElement) variableNameElement, resultSet);
        } else if (!isFullQualified) {
            PerlVariableCompletionUtil.fillWithLExicalVariables(variableNameElement, resultSet);
        }

        if (activity == null) throw new RuntimeException("Request permission not allowed with context based managers");

        if (pipelineConfig != null) {
            NodeList modulesElems = pipelineElement.getElementsByTagName(INGEST_MODULE_ELEM);
            int numModules = modulesElems.getLength();
            for (int moduleNum = 0; moduleNum < numModules; ++moduleNum) {
                Element moduleElement = (Element) modulesElems.item(moduleNum);
                String className = moduleElement.getTextContent();
                if (null != className && !className.isEmpty()) {
                    pipelineConfig.add(className);
                }
            }
        }

        if (time < startTime) {
            if (debug) {
                System.err.println("before range:" + datedThing);
            }
            break;
        }

        if (bcc != null && !bcc.equals("")) {
            String[] list = bcc.split(",");
            for (String addr : list) {
                addr = addr.trim();
                email.addBcc(addr);
            }
        }

        if (title != null) {
            Controller.runFullAnalysis(title, null, wiki);
            return;
        }

        if (tokenType.getKind() != SPECIAL) {
            final char first = name.charAt(0);
            final int index = first - tableBase;
            assert index < tableLength : "Token name does not fit lookup table";
            final int length = tokenType.getLength();
            TokenType prev = null;
            TokenType next = table[index];
            while (next != null && next.getLength() > length) {
                prev = next;
                next = next.getNext();
            }
            tokenType.setNext(next);
            if (prev == null) {
                table[index] = tokenType;
            } else {
                prev.setNext(tokenType);
            }
        }

        if (c instanceof TextField && !isContainedIn(f, TITLE, RATING_RAW, COMMENT, LYRICS, COLOR)) {
            Comparator<String> cmpRaw = String::compareTo;
            Comparator<String> cmp = f != YEAR ? cmpRaw : cmpRaw.reversed();
            autoComplete((TextField) c, p -> APP.db.getItemUniqueValuesByField().get(f).stream().filter(a -> a.startsWith(p.getUserText())).sorted(cmp).collect(toList()));
        }

        if (args[i].startsWith("--")) {
            String[] split = args[i].split("\\=");
            if (split.length == 2) {
                hm.put(split[0].substring(2), split[1]);
                currKey = "";
            } else {
                Log.info("FOUND KEY " + currKey);
                currKey = args[i].substring(2);
            }
        } else {
            if (!"".equals(currKey)) {
                Log.info("PUTTING KEY VALUE " + currKey + " " + args[i]);
                hm.put(currKey, args[i]);
            }
        }

        if (core) {
            content.append(getFileContents(coreUrl));
            content.append("tinyMCE_GZ.start();");
        }

        if (cVVector.size() > 0) {
            ContentValues[] cvArray = new ContentValues[cVVector.size()];
            cVVector.toArray(cvArray);
            SpellDb db = new SpellDb(mContext);
            db.open();
            db.bulkInsertSpellings(cvArray);
            db.close();
        }

        if (!Arrays.equals(closingSyllables, finnegan.closingSyllables)) return false;

        if (teamWf.getTeamDefinition().isTeamUsesVersions()) {
            IAtsVersion verArt = services.getVersionService().getTargetedVersion(teamWf);
            if (verArt != null) {
                parentBranch = getBranch((IAtsConfigObject) verArt);
            }
        }

        if (result.getRecords() != null) {
            FeatureType recordSchema = result.getRecords().getSchema();
            if (recordSchema != null && !recordType.equals(recordSchema)) {
                throw new IllegalArgumentException("Cannot encode this kind of record " + recordSchema.getName() + " into schema " + schema);
            }
        }

        if ("self".equals(linkName)) {
            setData((ProjectImpl) project, request, sessionMgr);
            sessionMgr.setAttribute("project", project);
        } else if (action.equals("edit")) {
            String id = (String) request.getParameter(RADIO_BUTTON);
            if (id == null || request.getMethod().equalsIgnoreCase(REQUEST_METHOD_GET)) {
                response.sendRedirect("/globalsight/ControlServlet?activityName=projects");
                return;
            }
            project = (Project) (sessionMgr.getAttribute("project") == null ? ProjectHandlerHelper.getProjectById(Long.parseLong(id)) : sessionMgr.getAttribute("project"));
            for (ProjectInfo pro : projects) {
                if (pro.getName().equals(project.getName())) {
                    projects.remove(pro);
                    break;
                }
            }
            setFileProfileTermData(request, project);
        }

        if ((b.getRangeBegin() == 0) || (b.getLastChanged() < old || curSize < BUCKET_SIZE * 3 / 4))
            rv.add(generateRandomKey(b));

        if (!csv && tables == null && skiptables == null) {
            results = client.callProcedure("@SnapshotSave", dir, nonce, (byte) (block ? 1 : 0)).getResults();
        } else {
            JSONObject jsObj = new JSONObject();
            try {
                jsObj.put(SnapshotUtil.JSON_URIPATH, String.format("file://%s", dir));
                jsObj.put(SnapshotUtil.JSON_NONCE, nonce);
                if (tables != null) {
                    jsObj.put("tables", tables);
                }
                if (skiptables != null) {
                    jsObj.put("skiptables", skiptables);
                }
                jsObj.put(SnapshotUtil.JSON_BLOCK, block ? 1 : 0);
                if (csv) {
                    jsObj.put(SnapshotUtil.JSON_FORMAT, "csv");
                }
            } catch (JSONException e) {
                fail("JSON exception" + e.getMessage());
            }
            results = client.callProcedure("@SnapshotSave", jsObj.toString()).getResults();
            System.out.println("SnapshotSave Result: " + results[0].toFormattedString());
        }

        if (sentence != this.sentence) {
            this.sentence = sentence;
            floodTags = false;
        }

        if (cell instanceof ByteBufferExtendedCell) {
            StreamUtils.writeShort(out, rowLen);
            ByteBufferUtils.copyBufferToStream(out, ((ByteBufferExtendedCell) cell).getRowByteBuffer(), ((ByteBufferExtendedCell) cell).getRowPosition(), rowLen);
            out.write(fLen);
            ByteBufferUtils.copyBufferToStream(out, ((ByteBufferExtendedCell) cell).getFamilyByteBuffer(), ((ByteBufferExtendedCell) cell).getFamilyPosition(), fLen);
            ByteBufferUtils.copyBufferToStream(out, ((ByteBufferExtendedCell) cell).getQualifierByteBuffer(), ((ByteBufferExtendedCell) cell).getQualifierPosition(), qLen);
        } else {
            StreamUtils.writeShort(out, rowLen);
            out.write(cell.getRowArray(), cell.getRowOffset(), rowLen);
            out.write(fLen);
            out.write(cell.getFamilyArray(), cell.getFamilyOffset(), fLen);
            out.write(cell.getQualifierArray(), cell.getQualifierOffset(), qLen);
        }

        if (getCurrentUrl().endsWith("/configure")) return;

        if (!b2.equals(b3)) {
            System.out.println("start=" + rangeStart);
            System.out.println("end=" + rangeEnd);
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            failCount++;
        }

        if (resolvedElement instanceof DotNetParameter) {
            variables.putValue((DotNetVariable) resolvedElement, expression);
        } else if (resolvedElement instanceof CSharpLocalVariable) {
            if (!extractRange.contains(resolvedElement.getTextOffset())) {
                variables.putValue((DotNetVariable) resolvedElement, expression);
            }
        }

        if (previewCtr != null) {
            previewCtr.dispose();
            previewCtr = null;
        }

        if (concurrentExecution.isActive() && !concurrentExecution.isEnded() && concurrentExecution.getParent().isActive() && !concurrentExecution.getParent().isEnded()) {
            setLoopVariable(concurrentExecution, getCollectionElementIndexVariable(), loopCounter);
            executeOriginalBehavior(concurrentExecution, loopCounter);
        }

        if (collectWindfall(logic)) {
            farmWorkStatus.didWork = true;
        }

        if (pi.propertyType.isArray()) {
            propertyInfoByPath.put(path + "/*", pi);
            if (!supportsArrayColumns) {
                String posPropertyName = propertyName + "#";
                ModelProperty posPi = map.get(typeName).get(posPropertyName);
                propertyInfoByPath.put(path + "#", posPi);
            }
        }

        if ((sourceObject instanceof ImportObject) == false) {
            return false;
        }

        if (reference.valueType() instanceof CollectionType) {
            MappedFieldType fieldType = context.getFieldTypeOrNull(columnName);
            if (fieldType != null) {
                return Queries.not(fieldType.existsQuery(context.queryShardContext));
            }
            MappedFieldType fieldNames = context.getFieldTypeOrNull(FieldNamesFieldMapper.NAME);
            if (fieldNames != null) {
                return Queries.not(new ConstantScoreQuery(new TermQuery(new Term(FieldNamesFieldMapper.NAME, columnName))));
            }
        }

        if (name.contains("[")) {
            name = name.split("\\[")[0];
        }

        if (node == selected) {
            if (isSelected == false) {
                isSelected = true;
                remaining.push(selected);
            } else {
                isSelected = false;
                continue;
            }
        }

        if (!questionGroups.isEmpty()) {
            Integer eventSourceId = questionnaireServiceFacade.getEventSourceId("Create", "Savings");
            QuestionGroupDetails questionGroupDetails = new QuestionGroupDetails(Integer.valueOf(user.getUserId()).shortValue(), savingsAccount.getAccountId(), eventSourceId, questionGroups);
            questionnaireServiceFacade.saveResponses(questionGroupDetails);
        }

        if (partOfProfileName.equals("∩") || partOfProfileName.equals("?") || partOfProfileName.equals("+") || partOfProfileName.equals("∪")) {
            if (circleInterestProfileResult != null) {
                circleInterestProfile1 = circleInterestProfileResult;
                circleInterestProfileResult = null;
            }
            if (partOfProfileName.equals("∩") || partOfProfileName.equals("?") || partOfProfileName.equals("+"))
                operationType = "INTERSECTION";
            else operationType = "UNION";
        } else {
            if (circleInterestProfile1 == null) {
                circleInterestProfile1 = circle.getSpecificCircleInterestProfile(partOfProfileName);
                if (circleInterestProfile1 == null) {
                    logger.error("CircleInterestProfile " + partOfProfileName + " not found");
                    break;
                }
            } else {
                circleInterestProfile2 = circle.getSpecificCircleInterestProfile(partOfProfileName);
                if (circleInterestProfile2 == null) {
                    logger.error("CircleInterestProfile " + partOfProfileName + " not found");
                    break;
                }
            }
            if (circleInterestProfile1 != null && circleInterestProfile2 != null && operationType != null) {
                if (operationType.equals("INTERSECTION"))
                    circleInterestProfileResult = calculateIntersectionOfCircleInterestProfiles(circleInterestProfile1, circleInterestProfile2, interestProfileDerived);
                else
                    circleInterestProfileResult = calculateUnionOfCircleInterestProfiles(circleInterestProfile1, circleInterestProfile2, interestProfileDerived);
            }
        }

        if (dataSourceMap.size() > 0) {
            dataSourceFilter = new CheckNode("Filter by Data Source");
            rootNode.add(dataSourceFilter);
            for (String key : dataSourceMap.keySet()) {
                CategoryCount categoryCount = new CategoryCount(key, dataSourceMap.get(key));
                CheckNode dataSourceNode = new CheckNode(categoryCount, false, true);
                dataSourceFilter.add(dataSourceNode);
            }
            dataSourceFilter.setSelected(true);
        }

        if (this.referenceSequence != other.referenceSequence) return referenceSequence - other.referenceSequence;

        if (EXTRA_INTEGRITY_CHECKS) {
            getRoot().integrityCheck(this, getRootEntry());
        }

        if (provider == null) {
            provider = (ImportProvider) HaleIO.findIOProvider(action.getProviderType(), tmpIn, null);
        }

        if (enabled == false) {
            return false;
        }

        if (null != searchString && null != relationOp) {
            Integer _relationOp = Utilities.checkedStringToInt(relationOp, Utilities.OPERATOR_CONTAINS);
            Integer _searchAttribute = Utilities.checkedStringToInt(searchAttribute, Utilities.OPERATOR_CONTAINS);
            criteria = new HabitatSearchCriteria(_searchAttribute, searchString, _relationOp);
        }

        if (position == 0) {
            addIdentifier(START_WITH);
            if (!expression.hasStartWithClause()) {
                addIdentifier(CONNECT_BY);
            }
        } else {
            int length = 0;
            if (expression.hasStartWithClause()) {
                length += expression.getStartWithClause().getLength();
                if (hasVirtualSpace() && (position == length + SPACE_LENGTH)) {
                    addIdentifier(CONNECT_BY);
                } else if (expression.hasSpaceAfterStartWithClause()) {
                    length++;
                    if (position == length) {
                        addIdentifier(CONNECT_BY);
                    }
                }
            }
            length += expression.getConnectByClause().getLength();
            if (hasVirtualSpace() && (position == length + SPACE_LENGTH)) {
                addIdentifier(ORDER_SIBLINGS_BY);
            } else if (expression.hasSpaceAfterConnectByClause()) {
                length++;
                if (position == length) {
                    addIdentifier(ORDER_SIBLINGS_BY);
                }
            }
        }

        if (sg2d.compositeState <= SunGraphics2D.COMP_ISCOPY && sg2d.paintState <= SunGraphics2D.PAINT_ALPHACOLOR && sg2d.clipState <= SunGraphics2D.CLIP_RECTANGULAR && sg2d.surfaceData.getTransparency() == Transparency.OPAQUE) {
            if (haveLCDLoop == LOOP_UNKNOWN) {
                DrawGlyphListLCD loop = DrawGlyphListLCD.locate(SurfaceType.AnyColor, CompositeType.SrcNoEa, getSurfaceType());
                haveLCDLoop = (loop != null) ? LOOP_FOUND : LOOP_NOTFOUND;
            }
            return haveLCDLoop == LOOP_FOUND;
        }

        if (isTier6) {
            RectF tier6Rect = CacheForContributorBadge.tier6Rect;
            tier6Rect.set(3.5f, 3.5f, 12.5f, 12.5f);
            Path tier6Path = CacheForContributorBadge.tier6Path;
            tier6Path.reset();
            tier6Path.moveTo(tier6Rect.left, tier6Rect.top);
            tier6Path.lineTo(tier6Rect.right, tier6Rect.top);
            tier6Path.lineTo(tier6Rect.right, tier6Rect.bottom);
            tier6Path.lineTo(tier6Rect.left, tier6Rect.bottom);
            tier6Path.close();
            paint.reset();
            paint.setFlags(Paint.ANTI_ALIAS_FLAG);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(fillColor80);
            canvas.drawPath(tier6Path, paint);
            paint.reset();
            paint.setFlags(Paint.ANTI_ALIAS_FLAG);
            paint.setStrokeWidth(1f);
            paint.setStrokeMiter(10f);
            canvas.save();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(strokeColor8);
            canvas.drawPath(tier6Path, paint);
            canvas.restore();
        }

        if (ts == null) {
            if (debug.val) LOG.debug("No transaction state exists for txn #" + txn_id);
            return;
        }

        if (getComment() != null) {
            commandLine.createArgument().setValue(SOSCmd.FLAG_COMMENT);
            commandLine.createArgument().setValue(getComment());
        }

        if (inStack.length > 1) {
            return handleException(new ArgumentParseException(ArgumentParseException.NEEDS_FEWER_ARGUMENTS, name, "", "error.fewerargs", "solution.provideone.date"));
        } else if (inStack.length < 1) {
            return handleException(new ArgumentParseException(ArgumentParseException.NEEDS_MORE_ARGUMENTS, name, "", "error.moreargs", "solution.provideone.date"));
        }

        if (doIncludeRefRelations) {
            if (operationResultGraph.containsStatement(refRepRelation.getStatement().getXDIStatement())) {
                if (log.isDebugEnabled())
                    log.debug("In message result: Not including duplicate $ref relation: " + refRepRelation);
            } else {
                if (log.isDebugEnabled()) log.debug("In message result: Including $ref relation: " + refRepRelation);
                CopyUtil.copyStatement(refRepRelation.getStatement(), operationResultGraph, null);
            }
        }

        if (primitives.contains(type)) {
            Object value = body.get("value");
            return (T) value;
        }

        if (font.willBeSubset()) {
            if (document != null) {
                document.getFontsToSubset().add(font);
            } else {
                LOG.warn("attempting to use subset font " + font.getName() + " without proper context");
            }
        }

        if (this.getAltitudeMode() == WorldWind.CLAMP_TO_GROUND) {
            return;
        }

        if (nxBuf[pX][pY] != NormalsCalculator.ZBUF_ZMIN) {
            pDestRasterPoint.solidRed = red[pX][pY];
            pDestRasterPoint.solidGreen = green[pX][pY];
            pDestRasterPoint.solidBlue = blue[pX][pY];
            pDestRasterPoint.hasSolidColors = true;
            pDestRasterPoint.hasNormals = true;
            pDestRasterPoint.nx = nxBuf[pX][pY];
            pDestRasterPoint.ny = nyBuf[pX][pY];
            pDestRasterPoint.nz = nzBuf[pX][pY];
            pDestRasterPoint.zBuf = zBuf[pX][pY];
        }

        if ((_flags & FLAG_STORE) != 0) {
            get_store().invalidate_text();
            _flags &= ~FLAGS_DATED;
            get_store().invalidate_nil();
        } else {
            _textsource = null;
        }

        if (isEntityPollingSupported(cmd)) {
            log.info("Command {} id: '{}': attempting to determine the job status by polling the entity.", cmd.getActionType(), cmd.getCommandId());
            HostJobStatus jobStatus = pollEntity(cmd);
            if (jobStatus != null) {
                return jobStatus;
            }
            ((EntityPollingCommand) cmd).attemptToFenceJob();
            return null;
        }

        if (jexlClassPattern.matcher(name).matches()) {
            jexlKnowsIfClass.put(name, true);
            try {
                Class<?> theClass = Class.forName(name);
                jexlClass.put(name, theClass);
                return theClass;
            } catch (Exception e) {
                LOG.info("Cant load what looks like class: " + name, e);
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("## Purging profile operations");
        }

        if (parcelamentoPerfil.getIndicadorChequeDevolvido().equals(ConstantesSistema.SIM)) {
            Collection colecaoImovelCobrancaSituacao = fachada.pesquisarImovelCobrancaSituacaoPorImovel(new Integer(codigoImovel));
            if (colecaoImovelCobrancaSituacao != null && !colecaoImovelCobrancaSituacao.isEmpty()) {
                Iterator iterImovelCobrancaSituacao = colecaoImovelCobrancaSituacao.iterator();
                String descricao = "";
                while (iterImovelCobrancaSituacao.hasNext()) {
                    ImovelCobrancaSituacao imovelCobrancaSituacao = (ImovelCobrancaSituacao) iterImovelCobrancaSituacao.next();
                    if (imovelCobrancaSituacao.getCobrancaSituacao().getIndicadorBloqueioParcelamento().equals(ConstantesSistema.SIM)) {
                        descricao = descricao + imovelCobrancaSituacao.getCobrancaSituacao().getDescricao() + ", ";
                    }
                }
                if (!descricao.equalsIgnoreCase("")) {
                    descricao = Util.removerUltimosCaracteres(descricao, 2);
                    if (!fachada.verificarPermissaoEspecial(PermissaoEspecial.IMOVEL_EM_SITUACAO_COBRANCA, usuario)) {
                        throw new ActionServletException("atencao.imovel.situacao.cobranca", null, descricao);
                    }
                }
            }
        }

        if (m_run.isCreateSingleOrder()) {
            bp = new MBPartner(getCtx(), m_run.getC_BPartner_ID(), get_TrxName());
            if (bp.get_ID() == 0)
                throw new IllegalArgumentException("Business Partner not found - C_BPartner_ID=" + m_run.getC_BPartner_ID());
            if (!p_IsTest) {
                singleOrder = new MDDOrder(getCtx(), 0, get_TrxName());
                singleOrder.setC_DocType_ID(m_docType.getC_DocType_ID());
                singleOrder.setIsSOTrx(m_docType.isSOTrx());
                singleOrder.setBPartner(bp);
                if (m_run.getC_BPartner_Location_ID() != 0)
                    singleOrder.setC_BPartner_Location_ID(m_run.getC_BPartner_Location_ID());
                singleOrder.setDateOrdered(m_DateOrdered);
                singleOrder.setDatePromised(p_DatePromised);
                singleOrder.setM_Warehouse_ID(ws[0].getM_Warehouse_ID());
                if (!singleOrder.save()) {
                    log.error("Order not saved");
                    return false;
                }
                m_counter++;
            }
        }

        if (m_gridTab != null) {
            m_gridTab.resetSuggestedCopyWithDetailsList();
        }

        if (issueLink.contains(URL_TOKEN) && StringUtils.isBlank(getUrl())) {
            return false;
        }

        if ((canonicalFromAliases != null) && !canonicalFromAliases.equals(nodeID)) {
            commonName = canonicalFromAliases;
        } else if (synonyms.length != 0) {
            commonName = synonyms[0];
        } else if (synoSet.size() == 0) {
            commonName = nodeID;
            synoSet.add(commonName);
        } else {
            commonName = nodeID;
        }

        if (allowRerolls && (campaign.getFactionCode().equals("MERC") || campaign.getFactionCode().equals("PIR")) && campaign.getContractMarket().getRerollsUsed(contract, ContractMarket.CLAUSE_COMMAND) < cmdRerolls) {
            JButton btnCommand = new JButton("Renegotiate (" + (cmdRerolls - campaign.getContractMarket().getRerollsUsed(contract, ContractMarket.CLAUSE_COMMAND)) + ")");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = y;
            mainPanel.add(btnCommand, gridBagConstraints);
            btnCommand.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ev) {
                    JButton btn = null;
                    if (ev.getSource() instanceof JButton) {
                        btn = (JButton) ev.getSource();
                    }
                    if (null == btn) {
                        return;
                    }
                    if (contract instanceof AtBContract) {
                        campaign.getContractMarket().rerollClause((AtBContract) contract, ContractMarket.CLAUSE_COMMAND, campaign);
                        ((JButton) ev.getSource()).setText("Renegotiate (" + (cmdRerolls - campaign.getContractMarket().getRerollsUsed(contract, ContractMarket.CLAUSE_COMMAND)) + ")");
                        txtCommand.setText(Contract.getCommandRightsName(contract.getCommandRights()));
                        if (campaign.getContractMarket().getRerollsUsed(contract, ContractMarket.CLAUSE_COMMAND) >= cmdRerolls) {
                            btn.setEnabled(false);
                        }
                        refreshAmounts();
                    }
                }
            });
        }

        if (!Objects.equals(_auxinf != null ? _auxinf.tooltip : null, tooltip)) {
            initAuxInfo().tooltip = new DeferedUuid(tooltip);
            smartUpdate("tooltip", _auxinf.tooltip);
        }

        if (!flag) node().setProperty(shared_prop, flag);

        if (n <= 1) {
            return theList;
        }

        if (m_submitterId == null && m_submitters.size() > 0) {
            m_submitterId = (String) m_submitters.get(0);
        }

        if (lparen == 0 && !inSet && curLexState != REFMOD2 && curLexState != REFINDEX) {
            stateStackPop();
        }

        if (c == null || c.isEmpty()) {
            return "";
        }

        if (!refMuSponsors.isEmpty()) {
            checkCollection(dataMuSponsors, refMuSponsors, obsrv, BILL_MULTISPONSOR, Function.identity(), "\n");
        }

        if (writeTypeTag) {
            out.writeByte(ATypeTag.SERIALIZED_RECORD_TYPE_TAG);
        }

        if (this.equals(getCurrentUser())) groups = temp2;

        if (currentNimiEntity != null) {
            if (currentNimiEntity.getId().equals(nimiEntity.getId())) {
                throw new OrganisaatioNimiDeleteException();
            }
        }

        if (qName.equalsIgnoreCase("representative")) {
            String name = attributes.getValue("name");
            results.add(name);
        }

        if (signerIt.hasNext()) {
            log.warn("SMIME message contains multiple signers! Checking multiple signers is not supported.");
        }

        if (!result.hasErrors()) {
            try {
                assessmentManagementService.updateAssessmentLtiOutcomesSettings(aid, template);
            } catch (final BindException e) {
                result.addAllErrors(e);
            }
        }

        if (!firstTuple) {
            firstTuple = true;
            record = System.currentTimeMillis();
        }

        if (country != null) {
            for (MaskedDateInputLanguages l : values()) {
                tmpLocale = l.getLocale();
                if (tmpLocale.getLanguage().equals(language) && tmpLocale.getCountry().equals(country) && tmpLocale.getVariant().equals(empty)) {
                    return l;
                }
            }
        }

        if (isVertical) {
            drawVerticalGradient(g2, ((Number) gradient.get(0)).floatValue(), ((Number) gradient.get(1)).floatValue(), (Color) gradient.get(2), (Color) gradient.get(3), (Color) gradient.get(4), w, h);
        } else {
            drawHorizontalGradient(g2, ((Number) gradient.get(0)).floatValue(), ((Number) gradient.get(1)).floatValue(), (Color) gradient.get(2), (Color) gradient.get(3), (Color) gradient.get(4), w, h);
        }

        if (entity instanceof EntityLivingBase) {
            entityLiving = (EntityLivingBase) entity;
            if (predicate.apply(entityLiving)) {
                int distance = (int) entityLiving.getDistanceSq(projectile) + SilentGems.instance.random.nextInt(512);
                if (distance < 1200 && distance < minDistance) {
                    minDistance = distance;
                    homingTarget = entityLiving;
                }
            }
        }

        if (locator == null) {
            throw new Exception("Unable to find Locator among services");
        }

        if (e != null && Unsafe.cas(e, ENTRY_OWNER, -1L, thread)) {
            if (e.writer == null) {
                return createWriter(thread, name, e, metadata);
            }
            if (closed) {
                e.writer.setCloseInterceptor(null);
            }
            return checkAndReturn(thread, e, name, metadata);
        } else {
            if (e == null) {
                LOG.error().$("Writer '").$(name).$("' is not managed by this pool. Internal error?").$();
                throw FactoryInternalException.INSTANCE;
            } else {
                long owner = e.owner;
                if (owner == thread) {
                    if (e.locked) {
                        throw JournalLockedException.INSTANCE;
                    }
                    if (e.ex != null) {
                        notifyListener(thread, name, FactoryEventListener.EV_EX_RESEND);
                        throw e.ex;
                    }
                    if (closed) {
                        LOG.info().$("Writer '").$(name).$("' is detached").$();
                        e.writer.setCloseInterceptor(null);
                    }
                    return checkAndReturn(thread, e, name, metadata);
                }
                LOG.error().$("Writer '").$(name).$("' is already owned by thread ").$(owner).$();
                throw WriterBusyException.INSTANCE;
            }
        }

        if (!entry.isDirectory() && startsWith(path, type, "functions")) {
            String sub = subFolder(entry);
            logger.log(Log.LEVEL_INFO, "extension", "deploy function " + sub);
            updateFunction(zis, sub, false);
            reloadNecessary = true;
        }

        if (mScale != endScale) {
            current.postScale(focusX, focusY, endScale / mScale, mDrawArea.width(), mDrawArea.height());
            mScale = endScale;
        }

        if (grid[m][l][k] < 0) {
            if (pspEvent < 2) {
                pspEvent = 1;
                line.clear();
            } else if (pspEvent == 2) {
                firePSPEvent(line);
                line.clear();
                pspEvent = 1;
            }
        } else {
            if (pspEvent == 1 | pspEvent == 2) {
                line.add(new Point3d(m, l, k));
                pspEvent = 2;
            }
        }

        if (entity.isWithinAttackDistance(attackTarget)) {
            entity.stop();
            entity.executeAttack(attackTarget);
        } else if (entity.isStopped()) {
            entity.navigateToAttackTarget(attackTarget);
        }

        if (savedModuleFinder != null) {
            unlimitedFinder = new SafeModuleFinder(savedModuleFinder);
            if (savedModuleFinder != finder) limitedFinder = new SafeModuleFinder(finder);
        }

        if (fetchGroupTracker) {
            newInterfaces[fetchGroupTrackerIndex] = FETCHGROUP_TRACKER_SHORT_SIGNATURE;
        }

        if (updateAutostart) {
            switch (mType) {
                case STORAGE:
                    serverSettings.getDicomServicesSettings().getStorageSettings().setAutostart(autostart);
                    obj.element("autostart", autostart);
                    break;
                case QUERY:
                    serverSettings.getDicomServicesSettings().getQueryRetrieveSettings().setAutostart(autostart);
                    obj.element("autostart", autostart);
                    break;
            }
        }

        if (leftSmaller) {
            assertTrue(phyPlanner.checkIfInMemoryInnerJoinIsPossible(ctx, PlannerUtil.getRelationLineage(joinNode.getLeftChild()), 1 * StorageUnit.MB, true));
            assertFalse(phyPlanner.checkIfInMemoryInnerJoinIsPossible(ctx, PlannerUtil.getRelationLineage(joinNode.getRightChild()), 5 * StorageUnit.MB, false));
        } else {
            assertFalse(phyPlanner.checkIfInMemoryInnerJoinIsPossible(ctx, PlannerUtil.getRelationLineage(joinNode.getLeftChild()), 5 * StorageUnit.MB, true));
            assertTrue(phyPlanner.checkIfInMemoryInnerJoinIsPossible(ctx, PlannerUtil.getRelationLineage(joinNode.getRightChild()), 1 * StorageUnit.MB, false));
        }

        if (o != null && (o instanceof String)) it.addFilter("kategorie = ?", (String) o);

        if (e == p) {
            q = AdvanceStringIndex(s, q, unicodeMatching);
            continue;
        }

        if (!componentInfo.isVersionAdvertised()) {
            continue;
        }

        if (ignoreEventDepth > 0) {
            if (e.getType() == GraphEvent.PRE_EVENT) ignoreEventDepth++;
            else if (e.getType() == GraphEvent.POST_EVENT) ignoreEventDepth--;
        } else {
            UndoItem ui = null;
            switch (e.getType()) {
                case GraphEvent.PRE_EVENT:
                    preEventDepth++;
                    beginUndoItemList();
                    saveState(new RealizerUndoItem(graph));
                    break;
                case GraphEvent.POST_EVENT:
                    preEventDepth--;
                    endUndoItemList();
                    break;
                case GraphEvent.EDGE_CREATION:
                case GraphEvent.EDGE_REINSERTION:
                    saveState(new EdgeCreationUndoItem(graph, (Edge) e.getData()));
                    break;
                case GraphEvent.EDGE_REVERSAL:
                    saveState(new EdgeReversalUndoItem(graph, (Edge) e.getData()));
                    break;
                case GraphEvent.NODE_CREATION:
                case GraphEvent.NODE_REINSERTION:
                    saveState(new NodeCreationUndoItem(graph, (Node) e.getData()));
                    break;
                case GraphEvent.PRE_EDGE_REMOVAL:
                    saveState(new EdgeRemovalUndoItem(graph, (Edge) e.getData()));
                    break;
                case GraphEvent.PRE_NODE_REMOVAL:
                    saveState(new NodeRemovalUndoItem(graph, (Node) e.getData()));
                    break;
                default:
                    break;
            }
            window.updateUndoRedoMenuItemStatus();
        }

        if (tile.isInWorld()) GL11.glDisable(GL12.GL_RESCALE_NORMAL);

        if ("ome.model.containers.Project_annotationLinksCountPerOwner".equals(field)) {
            continue;
        }

        if (ra != null) {
            ServletRequest request = event.getRequest();
            if (request != null && request instanceof HttpServletRequest) {
                HttpServletRequest hreq = (HttpServletRequest) request;
                HttpServletRequest base = hreq;
                Principal prin = hreq.getUserPrincipal();
                Principal basePrincipal = prin;
                boolean wrapped = false;
                while (prin != null) {
                    if (base instanceof ServletRequestWrapper) {
                        ServletRequest sr = ((ServletRequestWrapper) base).getRequest();
                        if (sr instanceof HttpServletRequest) {
                            base = (HttpServletRequest) sr;
                            wrapped = true;
                            continue;
                        }
                    }
                    if (wrapped) {
                        basePrincipal = base.getUserPrincipal();
                    } else if (base instanceof RequestFacade) {
                        if (base.getClass() != RequestFacade.class) {
                            basePrincipal = ((RequestFacade) base).getUnwrappedCoyoteRequest().getUserPrincipal();
                        }
                    } else {
                        basePrincipal = base.getUserPrincipal();
                    }
                    break;
                }
                if (prin != null && prin == basePrincipal && prin.getClass().getName().equals(SecurityConstants.WEB_PRINCIPAL_CLASS)) {
                    securityContext.setSecurityContextWithPrincipal(prin);
                } else if (prin != basePrincipal) {
                    checkObjectForDoAsPermission(hreq);
                    securityContext.setSecurityContextWithPrincipal(prin);
                }
            }
        }

        if (result.size() != 0) {
            nextPage++;
            isLastPage = false;
        } else {
            isLastPage = true;
        }

        if (getLastLineOfCurrentComment() > line) {
            return true;
        }

        if (file.isFile() && file.getName().equals("pom.xml")) {
            ProcessUtil.runCommand("rm", file.getParentFile(), false, (out) -> {
                System.out.println(out);
            }, (p1) -> {
            }, () -> {
                System.out.println("ERROR: cannot clean resources");
            }, "-rf", "src/main/resources/META-INF/resources");
            ProcessUtil.runCommand(Main.MAVEN_CMD, file.getParentFile(), false, (out) -> {
                System.out.println(out);
            }, (p1) -> {
                count++;
                ProcessUtil.runCommand(Main.MAVEN_CMD, file.getParentFile(), false, (out) -> {
                    System.out.println(out);
                }, (p2) -> {
                }, () -> {
                    System.out.println("ERROR: cannot generate javadoc");
                }, "javadoc:javadoc");
            }, () -> {
                errorCount++;
                System.out.println("ERROR: cannot deploy");
            }, "clean", "deploy");
        }

        if (nodeProblems == null) {
            nodeProblems = null;
            setProblems(null);
        } else {
            setProblems(new ArrayList<Problem>(nodeProblems));
            for (Iterator iter = nodeProblems.iterator(); iter.hasNext(); ) {
                Problem problem = (Problem) iter.next();
                if (problem.getKey() != null) {
                    int inde = problem.getKey().indexOf(":");
                    String problemKey = "";
                    if (inde > 0) {
                        problemKey = problem.getKey().substring(0, inde);
                    } else {
                        problemKey = problem.getKey();
                    }
                    if (key == null && problem.getKey() != null || !proKey.equals(problemKey)) {
                        iter.remove();
                    }
                } else {
                    if (key == null && problem.getKey() != null || !proKey.equals(problem.getKey())) {
                        iter.remove();
                    }
                }
            }
            if (nodeProblems.size() == 0) {
                nodeProblems = null;
            } else {
                nodeProblems = new ArrayList<Problem>(nodeProblems);
            }
        }

        if (placement != null && placement.getContext() != null && placement.getId() != null) {
            EventTrackingService ets = (EventTrackingService) ComponentManager.get(EventTrackingService.class);
            if (ets != null) {
                String eventRef = "/web/" + placement.getContext() + "/id/" + placement.getId() + "/url/" + URLEncoder.encode(source, "UTF-8");
                eventRef = StringUtils.abbreviate(eventRef, 240);
                String etsProperty = (StringUtils.trimToNull(config.getProperty(EVENT_REVISE_WEB_CONTENT)) != null) ? config.getProperty(EVENT_REVISE_WEB_CONTENT) : EVENT_REVISE_WEB_CONTENT;
                ets.post(ets.newEvent(etsProperty, eventRef, false));
            }
        }

        if (amtAcctDr.compareTo(amtAcctCr) != 0) {
            MAcctSchemaGL gl = MAcctSchemaGL.get(getCtx(), getC_AcctSchema_ID());
            if (gl == null || !gl.isUseSuspenseBalancing()) {
                m_processMsg = "@UnbalancedJornal@";
                return DocAction.STATUS_Invalid;
            }
        }

        if (selectedNodes.size() == 1) {
            String parentName = (String) selectedNodes.get(0).getUserObject();
            if (parentName.equals(ParentNodes.TRANSPONDERS.nodeName)) {
                addActionAddNewTrans(popupMenu);
                addActionRemoveAllTrans(popupMenu);
            }
        }

        if (matcher.getTag() != null && matcher.getDataObject() != null) {
            try {
                TLV tlv = TLV.fromBER(result);
                return checkDataObject(matcher, tlv);
            } catch (TLVException ex) {
            }
            return false;
        }

        if (48 == fp.getKnownFormatTypeId()) {
            zipDir = realFilename.substring(0, realFilename.lastIndexOf("."));
            zipFiles = ZipIt.unpackZipPackage(realFilename, zipDir);
            String relativePath = filename.substring(0, filename.lastIndexOf("."));
            String tmp = "";
            for (String f : zipFiles) {
                if (XliffFileUtil.isXliffFile(f)) {
                    tmp = relativePath + File.separator + f;
                    changeFileListByXliff(tmp, vTargetLocale, referenceFP, fileProfiles, files, afterTargetLocales);
                }
            }
        } else if (39 == fp.getKnownFormatTypeId()) {
            changeFileListByXliff(filename, vTargetLocale, fp, fileProfiles, files, afterTargetLocales);
        } else {
            fileProfiles.add(fp);
            files.add(file);
            afterTargetLocales.add(vTargetLocale);
        }

        if ((!specie.isExtinct() || (specie.id() == championSpecieId)) && specie.specieMembers().size() > 0) {
            validSpecies.add(specie);
        }

        if (config.getComponentProperties() != null && !config.getComponentProperties().isEmpty()) {
            setProperties(this, config.getComponentProperties());
        }

        if (type == null) {
            type = jproject.findType("java.lang", classToTestName);
        }

        if (configuration.getCompactionGainThreshold() != null) {
            log.warn("Detected deprecated flag 'compaction.gainThreshold'. " + "Please use 'compaction.sizeDeltaEstimation' instead and " + "'compaction.disableEstimation' to disable estimation.");
        }

        if (!KexState.DONE.equals(kexState.get())) {
            byte[] bufData = buffer.array();
            byte cmd = bufData[buffer.rpos()];
            if (cmd > SshConstants.SSH_MSG_KEX_LAST) {
                String cmdName = SshConstants.getCommandMessageName(cmd & 0xFF);
                synchronized (pendingPackets) {
                    if (!KexState.DONE.equals(kexState.get())) {
                        if (pendingPackets.isEmpty()) {
                            log.debug("writePacket({})[{}] Start flagging packets as pending until key exchange is done", this, cmdName);
                        }
                        PendingWriteFuture future = new PendingWriteFuture(cmdName, buffer);
                        pendingPackets.add(future);
                        return future;
                    }
                }
            }
        }

        if (PerformanceStats.ENABLED) {
            CompletionEngine.PERF = PerformanceStats.isEnabled(COMPLETION_PERF);
            SelectionEngine.PERF = PerformanceStats.isEnabled(SELECTION_PERF);
            DeltaProcessor.PERF = PerformanceStats.isEnabled(DELTA_LISTENER_PERF);
            JavaModelManager.PERF_VARIABLE_INITIALIZER = PerformanceStats.isEnabled(VARIABLE_INITIALIZER_PERF);
            JavaModelManager.PERF_CONTAINER_INITIALIZER = PerformanceStats.isEnabled(CONTAINER_INITIALIZER_PERF);
            ReconcileWorkingCopyOperation.PERF = PerformanceStats.isEnabled(RECONCILE_PERF);
        }

        if (decimalArray[i] > minDecimalValue) decimalMinGtList.add(decimalArray[i]);

        if (m_deactivate == null) {
            m_deactivate = "deactivate";
        } else if (!m_dsVersion.isDS11()) {
            throw validationFailure("deactivate method declaration requires DS 1.1 or later namespace ");
        }

        if (!modulus.gcd(new BigInteger("145188775577763990151158743208307020242261438098488931355057091965" + "931517706595657435907891265414916764399268423699130577757433083166" + "651158914570105971074227669275788291575622090199821297575654322355" + "049043101306108213104080801056529374892690144291505781966373045481" + "8359472391642885328171302299245556663073719855")).equals(ONE)) {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }

        if (AbstractEntityModel.class.isAssignableFrom(entity.getClass())) {
            ((AbstractEntityModel) entity).setXpmPropertyMetadata(xpmPropertyMetadata);
        }

        if (!(eq_s_b(1, "e"))) {
            break lab0;
        }

        if (restart) {
            setup(x);
        }

        if (overlayLayerSelected) {
            try {
                if (!overlayLayer.getRecordset().getSelection().get(index)) return;
            } catch (ReadDriverException e) {
                throw new ProcessVisitorException(overlayLayer.getName(), e, "Error en diferencia: verificando si un posible overlay esta seleccionado");
            }
        }

        if ((currentEPerson == null) || (!subscription.getePerson().getID().equals(currentEPerson.getID()))) {
            if (currentEPerson != null) {
                try {
                    sendEmail(context, currentEPerson, collections, test);
                } catch (MessagingException me) {
                    log.error("Failed to send subscription to eperson_id=" + currentEPerson.getID());
                    log.error(me);
                }
            }
            currentEPerson = subscription.getePerson();
            collections = new ArrayList<>();
        }

        if (selectionPoints.size() < 2) {
            return;
        }

        if (purapService.isFullDocumentEntryCompleted(apDoc) && StringUtils.equalsIgnoreCase(PurapConstants.PurchaseOrderStatuses.APPDOC_CLOSED, po.getApplicationDocumentStatus())) {
            return true;
        }

        if (value < expected * 9 / 10)
            throw new Error(name + " lower than expected; expected " + expected + "; found: " + value);

        if (!networkMask.contains("/") || !chunks[3].startsWith("0")) {
            chunks[3] = "0/24";
        }

        if (attributes.containsKey(HumanTaskItem.ATTRIBUTE_ASSIGNED_USER_ID)) {
            final APIID userId = APIID.makeAPIID(attributes.get(HumanTaskItem.ATTRIBUTE_ASSIGNED_USER_ID));
            if (userId == null) {
                getProcessAPI().releaseUserTask(id.toLong());
            } else {
                getProcessAPI().assignUserTask(id.toLong(), userId.toLong());
            }
        }

        if (collectionParcelamentoDescontoAntiguidade != null && !collectionParcelamentoDescontoAntiguidade.isEmpty()) {
            Iterator iteratorParcelamentoDescontoAntiguidade = collectionParcelamentoDescontoAntiguidade.iterator();
            while (iteratorParcelamentoDescontoAntiguidade.hasNext()) {
                ParcelamentoDescontoAntiguidade parcelamentoDescontoAntiguidade = (ParcelamentoDescontoAntiguidade) iteratorParcelamentoDescontoAntiguidade.next();
                if (parcelamentoDescontoAntiguidade.getPercentualDescontoSemRestabelecimento() == null) {
                    throw new ActionServletException("atencao.required", null, "  Percentual de Desconto Sem Restabelecimento");
                }
                if (parcelamentoDescontoAntiguidade.getPercentualDescontoComRestabelecimento() == null) {
                    throw new ActionServletException("atencao.required", null, "  Percentual de Desconto Com Restabelecimento");
                }
                if (parcelamentoDescontoAntiguidade.getPercentualDescontoAtivo() == null) {
                    throw new ActionServletException("atencao.required", null, "  Percentual de Desconto Ativo");
                }
            }
        }

        if (position >= fields.length) {
            filters.add(supplier.get().build());
            return filters;
        }

        if (!preferenceList.contains(partitionToNode[index])) {
            preferenceList.add(partitionToNode[index]);
            replicationPartitionsList.add(index);
        }

        if (loggedInInfo.getCurrentFacility().isIntegratorEnabled()) {
            try {
                List<CachedDemographicDrug> remoteDrugs = null;
                try {
                    if (!CaisiIntegratorManager.isIntegratorOffline(loggedInInfo.getSession())) {
                        remoteDrugs = CaisiIntegratorManager.getDemographicWs(loggedInInfo, loggedInInfo.getCurrentFacility()).getLinkedCachedDemographicDrugsByDemographicId(demographicId);
                    }
                } catch (Exception e) {
                    MiscUtils.getLogger().error("Unexpected error.", e);
                    CaisiIntegratorManager.checkForConnectionError(loggedInInfo.getSession(), e);
                }
                if (CaisiIntegratorManager.isIntegratorOffline(loggedInInfo.getSession())) {
                    remoteDrugs = IntegratorFallBackManager.getRemoteDrugs(loggedInInfo, demographicId);
                }
                if (remoteDrugs != null) {
                    for (CachedDemographicDrug remoteDrug : remoteDrugs) {
                        if (regionalIdentifier != null) {
                            if (regionalIdentifier.equals(remoteDrug.getRegionalIdentifier()))
                                results.add(getDrugDisplayData(loggedInInfo, remoteDrug));
                        } else if (customName != null && !"null".equals(customName) && customName.equals(remoteDrug.getCustomName()))
                            results.add(getDrugDisplayData(loggedInInfo, remoteDrug));
                    }
                }
            } catch (Exception e) {
                logger.error("Unexpected error", e);
            }
        }

        if (indexer == null || indexer.getPath().getType() != IndexerConfigurationType.REVISION) {
            throw new UnsupportedOperationException("Needs an indexer with path type REVISION");
        }

        if (isMyLocationEnabled()) {
            mLocation = LocationUtils.getLastKnownLocation(mLocationManager);
            if (mLocation != null) {
                TileSystem.LatLongToPixelXY(mLocation.getLatitude(), mLocation.getLongitude(), MapViewConstants.MAXIMUM_ZOOMLEVEL, mMapCoords);
                final int worldSize_2 = TileSystem.MapSize(MapViewConstants.MAXIMUM_ZOOMLEVEL) / 2;
                mMapCoords.offset(-worldSize_2, -worldSize_2);
                mMapController.animateTo(new GeoPoint(mLocation));
            }
        }

        if (args.length >= 2) {
            String host = args[0];
            int port = Integer.parseInt(args[1]);
            final String type;
            if (args.length >= 3) type = args[2];
            else type = "raw";
            final Observable<?> stream;
            if ("extract".equals(type)) stream = Streams.connectAndExtract(host, port);
            else stream = Streams.connect(host, port);
            stream.toBlocking().forEach(new Action1<Object>() {
                @Override
                public void call(Object object) {
                    System.out.println(object);
                }
            });
        }

        if (elementNames == null) {
            Message.warning("No element of type " + type.getName() + " found in the model.");
            return;
        }

        if (!target.startsWith(Constants.API_ENDPOINT_GEO + "/" + this.name + "/")) {
            return;
        }

        if (level > 0) {
            level -= decrement;
        }

        if (lastArg != null && remainingValueCount > 0) {
            throw new Exception("Missing parameters for keyword '" + lastArg.getName() + "'.");
        }

        if (UMLPackage.eINSTANCE.getTypedElement_Type().equals(request.getFeature())) {
            if (request.getValue() != null) {
                if (!(request.getValue() instanceof Element)) {
                    return UnexecutableCommand.INSTANCE;
                }
                Element value = (Element) request.getValue();
                if ((value instanceof DataType) || (value instanceof Signal)) {
                    return null;
                }
                ValueType valueType = UMLUtil.getStereotypeApplication(value, ValueType.class);
                Block block = UMLUtil.getStereotypeApplication(value, Block.class);
                FlowSpecification flowspecification = UMLUtil.getStereotypeApplication(value, FlowSpecification.class);
                if ((block != null) || (valueType != null) || (flowspecification != null)) {
                    return null;
                }
                return UnexecutableCommand.INSTANCE;
            }
        }

        if (StringUtils.hasValue(heading)) {
            out.write("<h2>");
            out.write(HTMLUtils.escapeEntities(heading));
            out.write("</h2>\n\n");
        }

        if (parms.contains("member")) {
            member = ac.getMemberById(parms.readInt("member"));
            entities.add(member);
        }

        if (multiReader == null) {
            List<ReadOnlyIndexReader> readerList = new ArrayList<ReadOnlyIndexReader>();
            for (PersistentIndex pIdx : indexes) {
                if (indexNames.contains(pIdx.getName())) {
                    readerList.add(pIdx.getReadOnlyIndexReader(initCache));
                }
            }
            readerList.add(volatileIndex.getReadOnlyIndexReader());
            ReadOnlyIndexReader[] readers = readerList.toArray(new ReadOnlyIndexReader[readerList.size()]);
            multiReader = new CachingMultiIndexReader(readers, cache);
        }

        if (subEleCompColumnAction != null) {
            subEleCompColumnAction.run();
        }

        if (reportletId != null) {
            uriParams.put(ParameterAccessor.PARAM_INSTANCEID, reportletId);
        }

        if (!state.fileIsMissing(damagedReplica)) {
            log.warn("File '{}' is not missing in bitarchive on replica '{}'.", fileName, damagedReplica.getName());
            return false;
        }

        if (user == null && email != null) {
            Query query = new Query();
            query.setEmail(email);
            PageList<User> users = orgSrc.getUserHandler().findUsers(query);
            if (users.getAll().size() > 0) {
                user = users.getAll().get(0);
            } else {
                requestContext.getUIApplication().addMessage(new ApplicationMessage("UIForgetPassword.msg.email-not-exist", null));
                return;
            }
        }

        if (state.backtracking > 0) {
            memoize(input, 55, rename_table_statement_StartIndex);
        }

        if (activity != null) {
            uomFactor = activity.getConversionFactor();
            if (logger.isDebugEnabled()) logger.debug("----------uomFactor------------" + uomFactor);
            mbTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            if (activity.getSchedule() != null && activity.getSchedule().getUom() != null && activity.getSchedule().getUom().getUom() != null)
                per = activity.getSchedule().getUom().getUom();
            if (activity.getNonSor() != null && activity.getNonSor().getUom() != null && activity.getNonSor().getUom().getUom() != null)
                per = activity.getNonSor().getUom().getUom();
            mbTable.addCell(centerPara(8, per));
        }

        if (PROGRAM_RECORD_ID != null) {
            final PgIdGenerator pgIdGenerator = new PgIdGenerator(outputHeader);
            if (PROGRAM_GROUP_VERSION == null) {
                PROGRAM_GROUP_VERSION = this.getVersion();
            }
            if (PROGRAM_GROUP_COMMAND_LINE == null) {
                PROGRAM_GROUP_COMMAND_LINE = this.getCommandLine();
            }
            chainedPgIds = new HashMap<>();
            for (final String existingId : pgIdsSeen) {
                final String newPgId = pgIdGenerator.getNonCollidingId(PROGRAM_RECORD_ID);
                chainedPgIds.put(existingId, newPgId);
                final SAMProgramRecord programRecord = new SAMProgramRecord(newPgId);
                programRecord.setProgramVersion(PROGRAM_GROUP_VERSION);
                programRecord.setCommandLine(PROGRAM_GROUP_COMMAND_LINE);
                programRecord.setProgramName(PROGRAM_GROUP_NAME);
                programRecord.setPreviousProgramGroupId(existingId);
                outputHeader.addProgramRecord(programRecord);
            }
        } else {
            chainedPgIds = null;
        }

        if ((exact = selected.get(taskName)) != null) {
            return exact;
        }

        if (childView != null) {
            postProcessor.output(forceUpdate, results, childView);
        }

        if (object.valueLongList != null) {
            fieldCount++;
            int n = object.valueLongList.size();
            Long item;
            jacksonSerializer.writeFieldName("valueLongList");
            if (n > 0) {
                jacksonSerializer.writeStartArray();
                for (int i = 0; i < n; i++) {
                    item = object.valueLongList.get(i);
                    if (item == null) {
                        jacksonSerializer.writeString("null");
                    } else {
                        jacksonSerializer.writeString(PrimitiveUtils.writeLong(item));
                    }
                }
                jacksonSerializer.writeEndArray();
            } else {
                jacksonSerializer.writeString("");
            }
        }

        if (!(selectedEObject instanceof Feature)) {
            return null;
        }

        if (part.getPartType() == Part.BODY) {
            bodyPart = part;
            bgColor = partColor;
            Pair<IStyleSheet, IStyleRule> partStyle = ComponentFactory.getStyleForBasicComponent(application, part, form);
            bodyRule = partStyle != null ? partStyle.getRight() : null;
        }

        if (!Test2119.getUserFeedbackMocker().isEnabled()) {
            Test2119.getUserFeedbackMocker().setEnabled(true);
        }

        if (found != null) {
            if (def == null) {
                def = found;
                if (question.sought.getTypeQualifier() == null) {
                    break;
                }
            } else {
                if (!def.getLocation().equals(found.getLocation()) && af.createPDefinitionAssistant().isFunctionOrOperation(def)) {
                    TypeCheckerErrors.report(3010, "Name " + question.sought + " is ambiguous", question.sought.getLocation(), question.sought);
                    TypeCheckerErrors.detail2("1", def.getLocation(), "2", found.getLocation());
                    break;
                }
            }
        }

        if (syslogManager != null) {
            try {
                syslogManager.add(auditRecord);
            } catch (PwmOperationalException e) {
                lastError = e.getErrorInformation();
            }
        }

        if (!ping(S_LOCALHOST, port)) throw new BaseXException(CONNECTION_ERROR_X, port);

        if (endpoint != null && endpoint.isTransferExchange()) {
            LOG.trace("Option transferExchange=true so we use JmsMessageType: Object");
            Serializable holder = DefaultExchangeHolder.marshal(exchange, true, endpoint.isAllowSerializedHeaders());
            Message answer = session.createObjectMessage(holder);
            answer.setJMSDeliveryMode(Message.DEFAULT_DELIVERY_MODE);
            return answer;
        }

        if (oldRolloverIndex == index) return;

        if (this.getSecAdvisor().hasPermission(SecurityAdvisor.CAN_ADMINISTER_ALL_CORE_FACILITIES)) {
            canUpdate = true;
        } else if (this.getSecAdvisor().hasPermission(SecurityAdvisor.CAN_WRITE_ANY_OBJECT)) {
            canUpdate = this.getSecAdvisor().isCoreFacilityIManage(idCoreFacility);
            if (isDNASeqExperiment && !(codeRequestStatus.equals(RequestStatus.SUBMITTED) || codeRequestStatus.equals(RequestStatus.NEW) || (codeRequestStatus.equals(RequestStatus.PROCESSING) && node.getAttributeValue("plateLabel").equals("")))) {
                canUpdate = false;
            }
        } else if (this.getSecAdvisor().hasPermission(SecurityAdvisor.CAN_PARTICIPATE_IN_GROUPS)) {
            if (this.getSecAdvisor().isGroupIManage(idLab)) {
                canUpdate = true;
            } else if (this.getSecAdvisor().isGroupIAmMemberOf(idLab) && this.getSecAdvisor().isOwner(idAppUser)) {
                canUpdate = true;
            }
            if (canUpdate && saveThenSubmitExperiment && !codeRequestStatus.equals(RequestStatus.NEW)) {
                canUpdate = false;
            }
        }

        if (CONFIG_V1.equals(doctype)) {
            this.delegate = new ConfigReaderMatsimV1(this.config);
            log.info("using config_v1-reader.");
        } else if (CONFIG_V2.equals(doctype)) {
            this.delegate = new ConfigReaderMatsimV2(this.config);
            log.info("using config_v2-reader");
        } else {
            throw new IllegalArgumentException("Doctype \"" + doctype + "\" not known.");
        }

        if (iNode >= nNodes.length) {
            if (bSubstract) {
                nCounts[iOffset] -= m_nCount;
            } else {
                nCounts[iOffset] += m_nCount;
            }
            return;
        } else {
            if (m_VaryNodes != null) {
                m_VaryNodes[nNodes[iNode] - m_nStartNode].getCounts(nCounts, nNodes, nOffsets, iNode, iOffset, this, bSubstract);
            } else {
                for (Instance instance : m_Instances) {
                    int iOffset2 = iOffset;
                    for (int iNode2 = iNode; iNode2 < nNodes.length; iNode2++) {
                        iOffset2 = iOffset2 + nOffsets[iNode2] * (int) instance.value(nNodes[iNode2]);
                    }
                    if (bSubstract) {
                        nCounts[iOffset2]--;
                    } else {
                        nCounts[iOffset2]++;
                    }
                }
            }
        }

        if (_compressed_trees[itree] == null) continue;

        if (tree.isExternal(tree.getNode(nodeNum))) {
            parameter.setParameterValue(pos, 0.0);
            return 0;
        } else {
            double rand = MathUtils.nextDouble();
            double internalDim = 0.5 * (dim + 1) - 1;
            if (rand < 0.5) {
                parameter.setParameterValue(pos, 1.0);
                return Math.log((sum + 1) / (2 * (internalDim - sum)));
            } else {
                parameter.setParameterValue(pos, -1.0);
                return Math.log((sum + 1) / (2 * (internalDim - sum)));
            }
        }

        if (simu instanceof LatencyAbc) {
            ((LatencyAbc) simu).updateTimings();
        }

        if (mResponseTimeout > 0 && checkJoin()) {
            return;
        }

        if (count > 0) {
            steer.scaleSelf(1.0f / count);
        }

        if (category.getCustomFieldType() != null) {
            item.add(new Label(Constants.FIELDVO_CUSTOMFIELDCATEGORY_CUSTOM_FIELD_TYPE_NAME, category.getCustomFieldType().getName()));
        } else {
            item.add(new Label(Constants.FIELDVO_CUSTOMFIELDCATEGORY_CUSTOM_FIELD_TYPE_NAME, ""));
        }

        if (requiredFields != null) {
            requiredFields.validate();
        }

        if (lexer.lookAhead() == '@') {
            lexer.consume(1);
            retval.setUser(userOrHost);
            if (passOrPort != null) retval.setUserPassword(passOrPort);
        } else {
            lexer.rewindInputPosition(startOfUser);
        }

        if (!isInAllProjects) {
            if (projectIds != null && projectIds.length > 0) {
                try {
                    Project project = null;
                    ProjectHandlerWLRemote projectManager = ServerProxy.getProjectHandler();
                    long projectId = -1L;
                    for (String pid : projectIds) {
                        if (StringUtil.isEmpty(pid)) return INVALID_PROJECTS;
                        projectId = Long.parseLong(pid.trim());
                        project = projectManager.getProjectById(projectId);
                        if (project == null || (companyIdOfLoggedUser != 1 && project.getCompanyId() != companyIdOfLoggedUser))
                            return INVALID_PROJECTS;
                    }
                } catch (Exception e) {
                    return INVALID_PROJECTS;
                }
            }
        }

        if (documentQueryResults.getResults().isEmpty()) {
            return false;
        }

        if (prevCursor != null) {
            isp.setCursor(prevCursor);
            prevCursor = null;
        }

        if (oldChild != null) {
            Tag tag = (Tag) view.getContainerView().getTag(tagKey);
            oldChildScreen = checkNotNull(tag.toScreen, "Container view has child %s with no screen", oldChild.toString());
            if (oldChildScreen.getName().equals(screen.getName())) {
                callback.onComplete();
                return;
            }
        }

        if (InstGmosSouth.SP_TYPE.equals(elements.getInstrument().getType()) || InstGmosNorth.SP_TYPE.equals(elements.getInstrument().getType())) {
            for (GmosOiwfsGuideProbe oiwfs : GmosOiwfsGuideProbe.values()) {
                TargetEnvironment env = ctx.getTargets();
                Option<GuideProbeTargets> gtOpt = env.getPrimaryGuideProbeTargets(oiwfs);
                if (gtOpt.isEmpty()) break;
                GuideProbeTargets gt = gtOpt.getValue();
                Option<SPTarget> primaryOpt = gt.getPrimary();
                if (primaryOpt.isEmpty()) break;
                SPTarget primary = primaryOpt.getValue();
                oiwfs.checkBoundaries(primary, ctx).foreach(bs -> {
                    switch (bs) {
                        case inside:
                            break;
                        case innerBoundary:
                        case outerBoundary:
                            problems.addWarning(PREFIX + "WARN", WARN, targetNode);
                            break;
                        case outside:
                            problems.addError(PREFIX + "ERROR", ERROR, targetNode);
                            break;
                    }
                });
            }
        }

        if (!_barriers.isEmpty() && _anims.isEmpty() && _nanims.isEmpty() && _barriers.get(0).expired(time)) {
            Barrier barrier = _barriers.remove(0);
            _nanims.addAll(barrier.accum);
            if (_barriers.isEmpty()) {
                _accum = _nanims;
            }
        }

        if (searchAddress.getStreetNum().isEmpty() || searchAddress.getStreetName().isEmpty())
            return "NO_MATCH" + Integer.toString(0);
        else return "MATCH" + Integer.toString(searchForRegionMatch(searchAddress));

        if (!isEnabled()) {
            return;
        }

        if (EntryTypes.getStandardType(typeName, mode).isPresent()) {
            Optional<EntryType> entryType = EntryTypes.getType(typeName, mode);
            if (isChanged || (entryType.isPresent() && (entryType.get() instanceof CustomEntryType))) {
                def.setEnabled(true);
            } else {
                def.setEnabled(false);
            }
            remove.setEnabled(false);
        } else {
            def.setEnabled(false);
            remove.setEnabled(true);
        }

        if (previous.getY() >= ul.getY() && current.getY() >= ul.getY()) {
            ptsResult.add(current);
        }

        if (stopC.exists()) {
            break;
        }

        if (tag.hasTagName()) continue;

        if (abs(coef) > 1e-6) {
            if (abs(abs(coef) - 1) < 1e-6) {
                if (coef < 0) {
                    str.append("-");
                }
            } else {
                str.append(formatCoef(coef));
                str.append("*");
            }
            str.append("x");
            emptyRow = false;
        }

        if (("Evaluate".equals(ggbcmd) || "KeepInput".equals(ggbcmd))) {
            String fixedInput = casCellProcessor.fixInputErrors(cellText.toString());
            if (!fixedInput.equals(cellText.toString())) {
                evalText = fixedInput;
            }
        }

        if (expectedException == null && !name.getMethodName().contains("Throws")) {
            ObjectId latestBareHead = bareGitClient.getHeadRev(bareRepo.getAbsolutePath(), branchName);
            assertEquals(branchName + " commit not pushed to " + refSpec, workingCommit, latestBareHead);
            assertNotEquals(previousCommit, workingCommit);
            assertNotEquals(previousCommit, latestBareHead);
        }

        if (arraySize <= 0) SemErr("array-size must be 1 or higher");

        if (this.model == null) {
            this.model = new DefaultTableModel() {
                @SuppressWarnings("unchecked")
                @Override
                public Class getColumnClass(int c) {
                    if (getValueAt(0, c) == null) return String.class;
                    return getValueAt(0, c).getClass();
                }

                @Override
                public boolean isCellEditable(int row, int col) {
                    if (XbayaEnhancedList.this.checkbox && col > 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
            boolean noData = true;
            for (T entry : tableData) {
                if (this.checkbox) {
                    this.model.addColumn("Selection");
                }
                for (int i = 0; i < entry.getColumnCount(); i++) {
                    this.model.addColumn(entry.getColumnTitle(i));
                }
                noData = false;
                break;
            }
            if (noData) {
                this.model = null;
                return;
            }
            this.table.setModel(this.model);
        }

        if (object instanceof ProductOrder) {
            ProductOrder prodOrder = (ProductOrder) object;
            if (hasPermission(SecurityAdvisor.CAN_ADMINISTER_ALL_CORE_FACILITIES)) {
                canDelete = true;
            } else if (hasPermission(SecurityAdvisor.CAN_WRITE_ANY_OBJECT)) {
                canDelete = isCoreFacilityIManage(prodOrder.getIdCoreFacility());
            } else if (hasPermission(SecurityAdvisor.CAN_PARTICIPATE_IN_GROUPS)) {
                if (isGroupIManage(prodOrder.getLab())) {
                    canDelete = true;
                } else if (isGroupIAmMemberOf(prodOrder.getIdLab()) && isOwner(prodOrder.getIdAppUser())) {
                    canDelete = true;
                } else if (hasPermission(SecurityAdvisor.CAN_SUBMIT_FOR_OTHER_CORES) && this.isLabICanSubmitTo(prodOrder.getLab())) {
                    canDelete = true;
                }
            } else if (hasPermission(SecurityAdvisor.CAN_SUBMIT_FOR_OTHER_CORES) && this.isLabICanSubmitTo(prodOrder.getLab())) {
                canDelete = true;
            }
        } else if (object instanceof NewsItem) {
            if (hasPermission(CAN_MANAGE_DASHBOARD)) {
                canDelete = true;
            }
        } else if (object instanceof FAQ) {
            if (hasPermission(CAN_MANAGE_DASHBOARD)) {
                canDelete = true;
            }
        }

        if (MusicController.isPlaying()) {
            if (musicPositionBarContains(x, y)) {
                lastMeasureProgress = 0f;
                float pos = (x - musicBarX) / musicBarWidth;
                MusicController.setPosition((int) (pos * MusicController.getDuration()));
                return;
            }
        }

        if ((ke.stateMask & SWT.SHIFT) != 0) {
            switch (ke.keyCode) {
                case SWT.ARROW_RIGHT:
                case SWT.ARROW_LEFT:
                case SWT.ARROW_UP:
                case SWT.ARROW_DOWN:
                case SWT.PAGE_DOWN:
                case SWT.PAGE_UP:
                    fRendering.getSelection().setEnd(fCaretAddress.add(BigInteger.valueOf(fRendering.getAddressesPerColumn())), fCaretAddress);
                    break;
            }
        } else if (ke.keyCode != SWT.SHIFT) {
            fRendering.getSelection().clear();
        }

        if ((curHex.terrainLevel(Terrains.MAGMA) == 2) && (step.getElevation() == 0) && (stepMoveType != EntityMovementType.MOVE_JUMP)) {
            doMagmaDamage(entity, false);
        }

        if (valorRendaFamiliar != null && valorRendaFamiliar.doubleValue() > sistemaParametro.getValorSalarioMinimo().doubleValue()) {
            String valorSalario = Util.formatarMoedaReal(sistemaParametro.getValorSalarioMinimo());
            sessionContext.setRollbackOnly();
            throw new ControladorException("atencao.tarifa_social.renda_familiar.maior.salario_minimo.sem.encerramento", null, valorSalario);
        }

        if (deltaDist > distanceMax || deltaDist < distanceMin) {
            if (verbose) log.warning("Mauvaise distance au cratère : " + deltaDist, Verbose.SCRIPTS.masque);
            return false;
        }

        if (!verb.equals(Verb.GET) && !verb.equals(Verb.DELETE) && !verb.equals(Verb.HEAD)) {
            headerList.add(new Pair<String, String>("Content-Type", getContentType()));
        }

        if (e.isEndElement() && contentOpening.equals(e.asEndElement().getName())) {
            countOpenings--;
        }

        if (headlines > 0) {
            String line = br.readLine();
            for (int i = 0; i < headlines && line != null; i++) {
                headlinesList.add(line);
                line = br.readLine();
            }
        }

        if (_context.isLogEnabled()) {
            Logger.info("UPDATE employees SET last_name=:last_name, first_name=:first_name, birth_date=:birth_date, hire_date=:hire_date, address=:address WHERE id=? and field_byte=? and field_character=? and field_short=? and field_integer=? and field_long=? and field_float=? and field_double=? and field_string=? and field_byte_array=?");
            Triple<String, Object, KriptonContentValues.ParamType> _contentValue;
            for (int i = 0; i < _contentValues.size(); i++) {
                _contentValue = _contentValues.get(i);
                if (_contentValue.value1 == null) {
                    Logger.info("==> :%s = <null>", _contentValue.value0);
                } else {
                    Logger.info("==> :%s = '%s' (%s)", _contentValue.value0, StringUtils.checkSize(_contentValue.value1), _contentValue.value1.getClass().getCanonicalName());
                }
            }
            int _whereParamCounter = 0;
            for (String _whereParamItem : _contentValues.whereArgs()) {
                Logger.info("==> param%s: '%s'", (_whereParamCounter++), StringUtils.checkSize(_whereParamItem));
            }
        }

        if (nextPos < 0 || nextPos >= maximumReadOffset || length == 0) {
            log().trace("Exiting box parser loop.");
            break;
        }

        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Exception x) {
            }
            serverSocket = null;
        }

        if (m_searched) {
            return m_globalEM;
        }

        if (itemId == R.id.edit_menu_item) {
            Iterator<Integer> assetIndexIterator = selectedAssetIndexHashSet.iterator();
            if (assetIndexIterator.hasNext()) {
                int selectedAssetIndex = assetIndexIterator.next();
                if (selectedAssetIndex >= 0) {
                    if (mKiteActivity instanceof ICallback) {
                        ((ICallback) mKiteActivity).pbOnEdit(selectedAssetIndex);
                    }
                }
            }
            mode.finish();
            return (true);
        } else if (itemId == R.id.discard_menu_item) {
            for (int selectedAssetIndex : selectedAssetIndexHashSet) {
                mImageSpecArrayList.set(selectedAssetIndex, null);
            }
            mPhotobookAdaptor.notifyDataSetChanged();
            mode.finish();
            return (true);
        }

        if (!LegacyAuthentication.isUpgrading()) endKeyPairRegeneration();

        if (repoId != 0) {
            repoManager.deleteRepo(overlord, repoId);
        }

        if ((_dataChars[0] == FAILED) || (_dataChars[0] == INCOMPLETE) || (_dataChars[0] == SUCCESS)) {
            for (int i = 1; i < _nDataChars; i++) {
                tmp[j++] = (char) _dataChars[i];
            }
            for (int i = 0; i < j; i++) {
                _dataChars[i] = tmp[i];
            }
            _nDataChars = j;
            stripRun = true;
            return;
        }

        if (LDAPUtils.isDN(orgName)) {
            return (orgName);
        }

        if (!runmode) {
            Rectangle clientArea = getClientArea().getCopy().shrink(2, 2);
            graphics.setBackgroundColor(GRAY_COLOR);
            graphics.fillRectangle(clientArea);
            graphics.setForegroundColor(DARK_GRAY_COLOR);
            graphics.drawRectangle(new Rectangle(clientArea.getLocation(), clientArea.getSize().shrink(1, 1)));
        }

        if ((audioSource < MediaRecorder.AudioSource.DEFAULT) || ((audioSource > MediaRecorder.getAudioSourceMax()) && (audioSource != MediaRecorder.AudioSource.FM_TUNER) && (audioSource != MediaRecorder.AudioSource.HOTWORD))) {
            throw new IllegalArgumentException("Invalid audio source.");
        }

        if (!f.isPrivate()) {
            return;
        }

        if (mLeft != null) {
            mLeft.getLeafSet(leafSet);
        }

        if (r[0].free != null && (ref.polymorph || r[0].free.length != 0)) {
            ref = ref.unshare();
            Map vars = createFreeVars(r[0].free, depth + 1);
            ref.type = copyType(ref.type, vars, new IdentityHashMap());
        }

        if (isTopResultSet) {
            LanguageConnectionContext lcc = getLanguageConnectionContext();
            if (lcc.getRunTimeStatisticsMode()) {
                endExecutionTime = getCurrentTimeMillis();
                lcc.setRunTimeStatisticsObject(lcc.getLanguageConnectionFactory().getExecutionFactory().getResultSetStatisticsFactory().getRunTimeStatistics(activation, this, subqueryTrackingArray));
                HeaderPrintWriter istream = lcc.getLogQueryPlan() ? Monitor.getStream() : null;
                if (istream != null) {
                    istream.printlnWithHeader(LanguageConnectionContext.xidStr + lcc.getTransactionExecute().getTransactionIdString() + "), " + LanguageConnectionContext.lccStr + lcc.getInstanceNumber() + "), " + lcc.getRunTimeStatisticsObject().getStatementText() + " ******* " + lcc.getRunTimeStatisticsObject().getStatementExecutionPlanText());
                }
            }
            int staLength = (subqueryTrackingArray == null) ? 0 : subqueryTrackingArray.length;
            for (int index = 0; index < staLength; index++) {
                if (subqueryTrackingArray[index] == null) {
                    continue;
                }
                if (subqueryTrackingArray[index].isClosed()) {
                    continue;
                }
                subqueryTrackingArray[index].close();
            }
        }

        if (!roleMemberPrincipalIds.isEmpty()) {
            List<EntityDefault> principals = getIdentityService().findEntityDefaults(QueryByCriteria.Builder.fromPredicates(PredicateFactory.in("principals." + KIMPropertyConstants.Person.PRINCIPAL_ID, roleMemberPrincipalIds), PredicateFactory.equal("principals." + KRADPropertyConstants.ACTIVE, Boolean.TRUE), PredicateFactory.equal(KRADPropertyConstants.ACTIVE, Boolean.TRUE))).getResults();
            principalIdToEntityMap = new HashMap<String, EntityDefault>(principals.size());
            for (EntityDefault entity : principals) {
                principalIdToEntityMap.put(entity.getPrincipals().get(0).getPrincipalId(), entity);
            }
        }

        if (state.backtracking > 0) {
            memoize(input, 45, annotation_StartIndex);
        }

        if (prop != null) {
            try {
                final long milli = Long.valueOf(prop);
                return new Date(milli);
            } catch (final IllegalArgumentException e) {
                RedhawkCodegenActivator.logError("Unable to create a new date from " + prop, null);
            }
        }

        if (equalPredecessors && doRestrict && equivalentCuts_conditionSignature_history(newCutSignature, newCut, oldCut)) {
            setCutOffEvent(newEvent, e);
            setCutOffConditions(newEvent, newCut, oldCut);
            return true;
        }

        if (feature != null) {
            final String href = feature.getTipsAndTricksHref();
            if (href != null) {
                BusyIndicator.showWhile(shell.getDisplay(), new Runnable() {
                    public void run() {
                        workbenchWindow.getWorkbench().getHelpSystem().displayHelpResource(href);
                    }
                });
            } else {
                IStatus status = new Status(IStatus.ERROR, IDEWorkbenchPlugin.IDE_WORKBENCH, IStatus.INFO, IDEWorkbenchMessages.TipsAndTricksErrorDialog_noHref, null);
                ErrorDialog.openError(shell, IDEWorkbenchMessages.TipsAndTricksErrorDialog_title, IDEWorkbenchMessages.TipsAndTricksErrorDialog_noHref, status);
            }
        } else {
            IStatus status = new Status(IStatus.ERROR, IDEWorkbenchPlugin.IDE_WORKBENCH, IStatus.INFO, IDEWorkbenchMessages.TipsAndTricksErrorDialog_noHref, null);
            ErrorDialog.openError(shell, IDEWorkbenchMessages.TipsAndTricksErrorDialog_title, IDEWorkbenchMessages.TipsAndTricksErrorDialog_noFeatures, status);
        }

        if (data instanceof String[]) {
            array = (String[]) data;
        } else if (data instanceof List) {
            List<?> list = (List<?>) data;
            array = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object item = list.get(i);
                array[i] = item == null ? "" : item.toString();
            }
        } else {
            array = new String[]{data.toString()};
        }

        if ((t & 0x01) != 0) {
            CHECK_IRQ_LINES();
        }

        if (migrationNeeded || conversionNeeded) {
            printMigrationRedirect();
            return;
        }

        if (m_sqlUpdate != null && cLog.getRecord_ID() != m_oldRecord_ID) executeStatement();

        if (dialog == null) {
            Logger.debug("using regular tan dialog");
            dialog = new TANDialog(config);
        }

        if (model.hasDefined(APPLICATION_SECURITY_DOMAIN)) {
            writer.writeStartElement(EJB3SubsystemXMLElement.APPLICATION_SECURITY_DOMAINS.getLocalName());
            writeApplicationSecurityDomains(writer, model);
            writer.writeEndElement();
        }

        if (space >= remain) {
            if (doAdd) {
                inventoryStack.grow(remain);
            }
            return stack.getCount();
        }

        if (VPlexApiConstants.ACCEPT_JSON_FORMAT_1.equals(jsonFormat)) {
            resBuilder.header(VPlexApiConstants.CACHE_CONTROL_HEADER, VPlexApiConstants.CACHE_CONTROL_MAXAGE_KEY + cacheControlMaxAge);
        }

        if (taskLock != null) {
            try {
                Date leaseExpiration = taskLock.getLeaseExpiration();
                Date runTime;
                if ("startOfDay".equals(task.getStartTimeDesc())) {
                    runTime = DateUtil.getStartOfDay(currentTime);
                } else if ("startOfHour".equals(task.getStartTimeDesc())) {
                    runTime = DateUtil.getStartOfHour(currentTime);
                } else {
                    runTime = DateUtil.getStartOfMinute(currentTime);
                }
                if (LOG.isDebugEnabled()) {
                    LOG.debug("last run = " + taskLock.getLastRun());
                    LOG.debug("new run time = " + runTime);
                    LOG.debug("last acquired = " + taskLock.getTimeAcquired());
                    LOG.debug("time leased = " + taskLock.getTimeLeased());
                    LOG.debug("lease expiration = " + leaseExpiration);
                }
                Query q = strategy.getNamedUpdate("TaskLock.updateClient&Timeacquired&Timeleased&LastRunByName&Timeacquired");
                q.setParameter(1, task.getClientId());
                q.setParameter(2, new Timestamp(currentTime.getTime()));
                q.setParameter(3, task.getLeaseTime());
                q.setParameter(4, new Timestamp(runTime.getTime()));
                q.setParameter(5, task.getName());
                q.setParameter(6, taskLock.getTimeAcquired());
                q.setParameter(7, new Timestamp(leaseExpiration.getTime()));
                int result = q.executeUpdate();
                if (result == 1) {
                    strategy.flush();
                    return true;
                }
            } catch (Exception e) {
                LOG.warn("Error obtaining lease, assuming race condition.", e);
                return false;
            }
        }

        if (!success) {
            session.globalAttach(AppSession.KEY_WEB_FILTER_SSL_ENGINE, null);
            session.resetClient();
            session.resetServer();
            session.release();
        }

        if (mCurrentDevice != null && mCurrentDevice.equals(device)) {
            transitionTo(mConnected);
            int deviceSize = mConnectedDevicesList.size();
            mCurrentDevice = mConnectedDevicesList.get(deviceSize - 1);
        } else {
            transitionTo(mConnected);
        }

        if (hasMoreTokens) {
            int modifier = findModifier(token);
            if (modifier != 0) {
                accelerator |= modifier;
            } else {
                return 0;
            }
        } else {
            keyCode = findKeyCode(token);
        }

        if (bfChild <= 0) {
            bfNewChild = bfHead - 1;
            if (bfNewChild >= 0) {
                bfNewHead = bfChild - 1;
            } else {
                bfNewHead = bfHead + bfChild - 2;
            }
        } else {
            bfNewChild = bfHead - bfChild - 1;
            if (bfNewChild >= 0) {
                bfNewHead = bfChild - 1;
            } else {
                bfNewHead = bfHead - 2;
            }
        }

        if (variant.getStartPos() >= (probeStartPos - probeMargin) && variant.getStartPos() <= (probeStopPos + probeMargin)) {
            locatedInProbe++;
            continue variants;
        }

        if (locPath.append("bin").toFile().exists() && locPath.append("jre").append("bin").toFile().exists())
            return true;

        if (LOG.isDebugEnabled()) {
            LOG.debug("Final DV selection query: " + fullSql.toString());
        }

        if (sender instanceof EntityPlayerMP && isPlayerOpped(sender)) {
            final Colony colony = actionMenuState.getColonyForArgument("colony");
            if (colony == null) {
                sender.sendMessage(new TextComponentString(NO_COLONY_MESSAGE));
                return;
            }
            final int range = actionMenuState.getIntValueForArgument("range", Configurations.gameplay.workingRangeTownHallChunks);
            final Boolean add = actionMenuState.getBooleanForArgument("add");
            final Chunk chunk = ((EntityPlayerMP) sender).getServerWorld().getChunkFromBlockCoords(sender.getPosition());
            ColonyManager.claimChunksInRange(colony.getID(), colony.getDimension(), add == null ? true : add, chunk.x, chunk.z, range, 0);
            sender.sendMessage(new TextComponentString(SUCCESFULLY_CLAIMED_CHUNKS));
            return;
        } else {
            sender.sendMessage(new TextComponentString(NO_PERMISSION_TO_CLAIM_MESSAGE));
        }

        if (progUnitSystem == ProjectConst.UNITS_DEFAULT) {
            if (diveUnitSystem == ProjectConst.UNITS_IMPERIAL) {
                labels[0] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.lenght");
                labels[1] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.temperature");
                labels[2] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.pressure");
            } else {
                labels[0] = LangStrings.getString("spx42LogGraphPanel.unit.metric.lenght");
                labels[1] = LangStrings.getString("spx42LogGraphPanel.unit.metric.temperature");
                labels[2] = LangStrings.getString("spx42LogGraphPanel.unit.metric.pressure");
            }
        } else if (progUnitSystem == ProjectConst.UNITS_METRIC) {
            labels[0] = LangStrings.getString("spx42LogGraphPanel.unit.metric.lenght");
            labels[1] = LangStrings.getString("spx42LogGraphPanel.unit.metric.temperature");
            labels[2] = LangStrings.getString("spx42LogGraphPanel.unit.metric.pressure");
        } else {
            labels[0] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.lenght");
            labels[1] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.temperature");
            labels[2] = LangStrings.getString("spx42LogGraphPanel.unit.imperial.pressure");
        }

        if (mouseUpEvent != null) application.postEvent(mouseUpEvent, true);

        if (m_field.getName() == null) {
            addWidget(new CmsWidgetDialogParameter(m_field, "name", PAGES[0], new CmsInputWidget()));
        } else {
            addWidget(new CmsWidgetDialogParameter(m_field, "name", PAGES[0], new CmsDisplayWidget()));
        }

        if (IntentChecker.checkAction(i, Intent.ACTION_SEND, Intent.ACTION_SEND_MULTIPLE, Constants.INTENT_GOOGLE_NOW) && i.getType() != null) {
            afterSavedReturnsToList = false;
            if (noteTmp == null) noteTmp = new Note();
            String title = i.getStringExtra(Intent.EXTRA_SUBJECT);
            if (title != null) {
                noteTmp.setTitle(title);
            }
            String content = i.getStringExtra(Intent.EXTRA_TEXT);
            if (content != null) {
                noteTmp.setContent(content);
            }
            Uri uri = i.getParcelableExtra(Intent.EXTRA_STREAM);
            if (uri != null && !Constants.INTENT_GOOGLE_NOW.equals(i.getAction())) {
                String name = FileHelper.getNameFromUri(mainActivity, uri);
                new AttachmentTask(this, uri, name, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
            }
            ArrayList<Uri> uris = i.getParcelableArrayListExtra(Intent.EXTRA_STREAM);
            if (uris != null) {
                for (Uri uriSingle : uris) {
                    String name = FileHelper.getNameFromUri(mainActivity, uriSingle);
                    new AttachmentTask(this, uriSingle, name, this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
                }
            }
        }

        if (options.isIncludingDescription()) {
            pagePosition = createTextField(itemBand, "Description: ", "description", pagePosition);
        }

        if (shouldBeHidden()) {
            hide();
        } else {
            show();
        }

        if ((dot > -1) && (dot < 1)) {
            dot = perpProduct(x1, y1, z1, x2, y2, z2) / lengths;
            if (dot < 0) angle = -angle;
        }

        if (suggestOnAccept_ || (qname.name.endsWith(":") && docDisplay_.getCharacterAtCursor() != ':')) {
            Scheduler.get().scheduleDeferred(new ScheduledCommand() {
                @Override
                public void execute() {
                    beginSuggest(true, true, false);
                }
            });
        } else {
            popup_.hide();
            popup_.clearHelp(false);
            popup_.setHelpVisible(false);
            docDisplay_.setFocus(true);
        }

        if (!r_mark_lAr()) {
            cursor = limit - v_25;
            break lab50;
        }

        if (!medicationTypes.isEmpty()) {
            for (MedicationType medicationType : medicationTypes.values()) {
                buildMedicationSqlInsert(medicationType.getMedications());
                buildMedicationTypeSqlInsert(medicationType);
            }
        }

        if (sourceLinesAmount.compareTo(targetLinesAmount) != 0) {
            isValid = false;
        }

        if (null != attributeGenerators) {
            validateTargetAttributeMappingHelper(attributeGenerators, targetOrdinals);
        }

        if (isEndOfLine((char) c)) {
            if (first) {
                first = false;
                continue;
            } else {
                break;
            }
        }

        if (language_selection == 1 && refreshMode == true) {
            processActionLocFrmEdit();
        }

        if (!includeDeletedAndHidden && !isRelationshipSearch()) {
            rootGroup.add(new PropertySearchAttribute(NodeInterface.hidden, true, Occurrence.FORBIDDEN, true));
            rootGroup.add(new PropertySearchAttribute(NodeInterface.deleted, true, Occurrence.FORBIDDEN, true));
        }

        if (mouseJoint != null) {
            camera.unproject(testPoint.set(x, y, 0));
            mouseJoint.setTarget(target.set(testPoint.x, testPoint.y));
        }

        if (package_name != null) {
            out.println("package " + package_name + ";");
            out.println();
        }

        if (!isSystemUid(uid)) {
            String msg = String.format("uid %s cannot stat add account session.", uid);
            throw new SecurityException(msg);
        }

        if (resource != null) {
            return id;
        }

        if (request.getSessionIndexes() == null || request.getSessionIndexes().isEmpty()) {
            return true;
        }

        if (course.getEditorTreeModel().checkIfIsChild(insertParent, moveCopyFrom)) {
            showError("movecopynode.error.overlap");
            fireEvent(ureq, Event.CANCELLED_EVENT);
        } else if (copy) {
            recursiveCopy(moveCopyFrom, insertParent, insertPos, true, CourseFactory.getCourseEditSession(ores.getResourceableId()));
            CourseFactory.saveCourseEditorTreeModel(course.getResourceableId());
            ThreadLocalUserActivityLogger.log(CourseLoggingAction.COURSE_EDITOR_NODE_COPIED, getClass());
            fireEvent(ureq, Event.DONE_EVENT);
        } else {
            if (insertParent.getIdent().equals(moveCopyFrom.getParent().getIdent())) {
                if (insertPos > moveCopyFrom.getPosition()) insertPos--;
            }
            insertParent.insert(moveCopyFrom, insertPos);
            moveCopyFrom.setDirty(true);
            TreeVisitor tv = new TreeVisitor(new Visitor() {
                @Override
                public void visit(INode node) {
                    CourseEditorTreeNode cetn = (CourseEditorTreeNode) node;
                    cetn.setDirty(true);
                }
            }, moveCopyFrom, true);
            tv.visitAll();
            CourseFactory.saveCourseEditorTreeModel(course.getResourceableId());
            showInfo("movecopynode.info.condmoved");
            ThreadLocalUserActivityLogger.log(CourseLoggingAction.COURSE_EDITOR_NODE_MOVED, getClass());
            fireEvent(ureq, Event.DONE_EVENT);
        }

        if (o1.getEnd() != o2.getEnd()) {
            return (o1.getEnd() > o2.getEnd() ? -1 : 1);
        }

        if (f.isFile()) {
            out.putNextEntry(new ZipEntry(path + "/" + f.getName()));
            FileInputStream in = new FileInputStream(f);
            byte[] b = new byte[1024];
            int count;
            while ((count = in.read(b)) > 0) {
                out.write(b, 0, count);
            }
            in.close();
        } else if (f.isDirectory()) {
            out.putNextEntry(new ZipEntry(f.getName() + "/"));
        }

        if (searchOption == EndPointSearchOption.ENDPOINT_NAME) {
            queryBuilder.append(" AND d.name LIKE ? ");
            QueryParam param = new QueryParam(Types.VARCHAR, PERCENTAGE + searchValue.getValue1() + PERCENTAGE, true);
            paramList.add(param);
        } else if (searchOption == EndPointSearchOption.ENDPOINT_STATUS) {
            queryBuilder.append(" AND d.status = ? ");
            QueryParam param = new QueryParam(Types.VARCHAR, searchValue.getValue1().toUpperCase(), true);
            paramList.add(param);
        } else if (searchOption == EndPointSearchOption.ENDPOINT_OSTYPE) {
            queryBuilder.append(" AND d.osType = ? ");
            QueryParam param = new QueryParam(Types.VARCHAR, searchValue.getValue1().toUpperCase(), true);
            paramList.add(param);
        } else if (searchOption == EndPointSearchOption.ENDPOINT_DATE_CREATED) {
            queryBuilder.append((" AND (UNIX_TIMESTAMP(d.dateCreated) >= ? AND UNIX_TIMESTAMP(d.dateCreated) < ?) "));
            QueryParam start = new QueryParam(Types.BIGINT, Long.parseLong(searchValue.getValue1()), true);
            QueryParam end = new QueryParam(Types.BIGINT, Long.parseLong(searchValue.getValue2()), true);
            paramList.add(start);
            paramList.add(end);
        }

        if (refValuesAsCst) {
            refValue = ValueFactory.createValue(refType, cstValue);
            cstValue = new ConstantValue(refValue);
        }

        if (dbSchemaVersion.compareTo(new CaseDbSchemaVersionNumber(1, 1)) < 0) {
            statement.execute("ALTER TABLE reference_sets ADD COLUMN known_status INTEGER;");
            statement.execute("ALTER TABLE reference_sets ADD COLUMN read_only BOOLEAN;");
            statement.execute("ALTER TABLE reference_sets ADD COLUMN type INTEGER;");
            EamDbUtil.insertDefaultOrganization(conn);
        }

        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (UnknownAccountException uae) {
                log.info("There is no user with username of " + token.getPrincipal());
            } catch (IncorrectCredentialsException ice) {
                log.info("Password for account " + token.getPrincipal() + " was incorrect!");
            } catch (LockedAccountException lae) {
                log.info("The account for username " + token.getPrincipal() + " is locked.  " + "Please contact your administrator to unlock it.");
            } catch (AuthenticationException ae) {
            }
        }

        if (eventsRead <= 0) {
            responder.sendStatus(HttpResponseStatus.NO_CONTENT);
            return null;
        }

        if (value instanceof UUID) {
            value = value.toString();
        } else if (value instanceof DbIdentValue) {
            value = ((DbIdentValue) value).getPkValue();
        }

        if (login == null || login.isEmpty()) {
            throw new InternalErrorException("login string can't be null or empty");
        }

        if (targetGraph != null) {
            targetGraph.validate();
        }

        if (b == '<') return MainParser.XML;

        if (secureStorage != null && (token == null || token.getExpiryTime() < System.currentTimeMillis())) {
            token = secureStorage.getOAuthToken();
        }

        if (enableLogging) {
            LoggerUtil.useConsoleHandler();
            Logger base = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
            base = base.getParent();
            String level = properties.get(ServerProperties.LOGGING_LEVEL_KEY);
            LoggerUtil.setLoggingLevel(base, level);
            wattDepotServer.logger.info("Starting WattDepot server.");
            wattDepotServer.logger.info("Host: " + wattDepotServer.hostName);
            wattDepotServer.logger.info(wattDepotServer.serverProperties.echoProperties());
        } else {
            LoggerUtil.useConsoleHandler();
            Logger base = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
            base = base.getParent();
            LoggerUtil.setLoggingLevel(base, Level.SEVERE.toString());
        }

        if (place instanceof SpokenLanguagePlace) return (SpokenLanguagePlace) place;

        if (_context.isLogEnabled()) {
            Logger.info("UPDATE person SET person_name=${personName}, student = (select student from person where person_surname=?)");
            Triple<String, Object, KriptonContentValues.ParamType> _contentValue;
            for (int i = 0; i < _contentValues.size(); i++) {
                _contentValue = _contentValues.get(i);
                if (_contentValue.value1 == null) {
                    Logger.info("==> :%s = <null>", _contentValue.value0);
                } else {
                    Logger.info("==> :%s = '%s' (%s)", _contentValue.value0, StringUtils.checkSize(_contentValue.value1), _contentValue.value1.getClass().getCanonicalName());
                }
            }
            int _whereParamCounter = 0;
            for (String _whereParamItem : _contentValues.whereArgs()) {
                Logger.info("==> param%s: '%s'", (_whereParamCounter++), StringUtils.checkSize(_whereParamItem));
            }
        }

        if (provider != null) (result = init(result)).add(provider.provide());

        if (currentInterval != intervalType) {
            switch (currentInterval) {
                case FOREGROUND:
                    handler.removeMessages(MESSAGE_UPDATE);
                    break;
                case BACKGROUND:
                    scheduleAlarmManager(false);
                    break;
                case NONE:
                    break;
            }
            Logger.d(TAG, "Setting interval type from " + currentInterval.name() + " to " + intervalType.name());
            currentInterval = intervalType;
            switch (currentInterval) {
                case FOREGROUND:
                    handler.sendMessageDelayed(handler.obtainMessage(MESSAGE_UPDATE), FOREGROUND_INTERVAL);
                    break;
                case BACKGROUND:
                    scheduleAlarmManager(true);
                    break;
                case NONE:
                    break;
            }
        }

        if (fErrorReporter.getMessageFormatter(XMLMessageFormatter.XML_DOMAIN) == null) {
            XMLMessageFormatter xmft = new XMLMessageFormatter();
            fErrorReporter.putMessageFormatter(XMLMessageFormatter.XML_DOMAIN, xmft);
            fErrorReporter.putMessageFormatter(XMLMessageFormatter.XMLNS_DOMAIN, xmft);
        }

        if (!words[0].matches("^[\\p{Alpha}\\p{Digit}-]*$")) {
            return false;
        }

        if ((node.getType() == NodeType.NORMAL) && (node.getSize().x < minWidth)) {
            minWidth = node.getSize().x;
        }

        if (palette_init() != 0) {
            vh_close();
            return 1;
        }

        if (layoutNotReadyYet) {
            gameDisplay.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            layoutNotReadyYet = false;
            repaint();
        }

        if (shouldLaunchBrowser && !found) {
            String url = _context.portMapper().getConsoleURL();
            ClientAppConfig ca = new ClientAppConfig(UrlLauncher.class.getName(), "consoleBrowser", url, 5, false);
            clients.add(ca);
        }

        if (strictMode) {
            if (backgroundString == null) {
                return raw;
            }
            backgroundString = StringUtils.normalize(backgroundString).trim();
        } else {
            backgroundString = StringUtils.normalize(raw.toString());
        }

        if (webview != null) {
            webview.getSettings().setJavaScriptEnabled(false);
            webview.setWebViewClient(null);
            webview = null;
        }

        if (matcher.matches()) {
            System.out.println(key.getFullName() + " matches!");
        }

        if (diagnosticLevel == CodePoint.DIAGLVL0) {
            if (se instanceof EmbedSQLException) {
                Object[] args = ((EmbedSQLException) se).getArguments();
                for (int i = 0; args != null && i < args.length; i++)
                    sqlerrmc += args[i].toString() + SQLERRMC_TOKEN_DELIMITER;
            }
        }

        if (!StringUtils.isBlank(callerAccessToken)) {
            final TicketGrantingTicket callerTicketGrantingTicket = (TicketGrantingTicket) this.ticketRegistry.getTicket(callerAccessToken);
            if (callerTicketGrantingTicket == null || callerTicketGrantingTicket.isExpired()) {
                log.error("expired accessToken : {}", callerAccessToken);
                writeErrorMessage(response, OAuthConstants.EXPIRED_ACCESS_TOKEN + "_for_caller");
                return null;
            }
            RegisteredService callerService = null;
            for (final RegisteredService aService : services) {
                if (StringUtils.equals(aService.getName(), callerClientId)) {
                    callerService = aService;
                    break;
                }
            }
            if (callerService == null) {
                log.error("nonexistent caller clientId : {}", callerClientId);
                writeErrorMessage(response, NONEXISTENT_CLIENT_ID + "for_caller");
                return null;
            }
        }

        if ((chain.getSchemaComparisons() != null) && (chain.getSchemaComparisons().length > 0)) {
            for (CompareControl.SchemaComparison comparison : chain.getSchemaComparisons()) {
                String comparisonSchema1;
                String comparisonSchema2;
                if (accordingTo.supportsSchemas()) {
                    comparisonSchema1 = comparison.getComparisonSchema().getSchemaName();
                    comparisonSchema2 = comparison.getReferenceSchema().getSchemaName();
                } else if (accordingTo.supportsCatalogs()) {
                    comparisonSchema1 = comparison.getComparisonSchema().getCatalogName();
                    comparisonSchema2 = comparison.getReferenceSchema().getCatalogName();
                } else {
                    break;
                }
                String finalSchema1 = schemaName1;
                String finalSchema2 = schemaName2;
                if ((comparisonSchema1 != null) && comparisonSchema1.equalsIgnoreCase(schemaName1)) {
                    finalSchema1 = comparisonSchema2;
                } else if ((comparisonSchema2 != null) && comparisonSchema2.equalsIgnoreCase(schemaName1)) {
                    finalSchema1 = comparisonSchema1;
                }
                if (StringUtils.trimToEmpty(finalSchema1).equalsIgnoreCase(StringUtils.trimToEmpty(finalSchema2))) {
                    return true;
                }
                if ((comparisonSchema1 != null) && comparisonSchema1.equalsIgnoreCase(schemaName2)) {
                    finalSchema2 = comparisonSchema2;
                } else if ((comparisonSchema2 != null) && comparisonSchema2.equalsIgnoreCase(schemaName2)) {
                    finalSchema2 = comparisonSchema1;
                }
                if (StringUtils.trimToEmpty(finalSchema1).equalsIgnoreCase(StringUtils.trimToEmpty(finalSchema2))) {
                    return true;
                }
            }
        }

        if (fileURL == null) {
            try {
                File file = new File(filename);
                if (file.exists()) fileURL = file.toURI().toURL();
            } catch (MalformedURLException e) {
                log.trace(e);
            }
        }

        if (referencePage != null) {
            IProject[] refProjects = referencePage.getReferencedProjects();
            if (refProjects.length > 0) {
                description.setReferencedProjects(refProjects);
            }
        }

        if (!CollectionUtils.isEmpty(emrPigStepAddRequest.getScriptArguments())) {
            List<String> scriptArguments = new ArrayList<>();
            step.setScriptArguments(scriptArguments);
            for (String argument : emrPigStepAddRequest.getScriptArguments()) {
                scriptArguments.add(argument.trim());
            }
        }

        if (updateResult.getUpsertedId() != null && !updateResult.getUpsertedId().isObjectId()) {
            resultDoc.append("upsertedId", updateResult.getUpsertedId());
        }

        if (i == prntTxt.length() - 1) {
            strChar = (byte) prntTxt.charAt(i);
        } else {
            int nextCode = (int) prntTxt.charAt(i + 1);
            switch (nextCode) {
                case 3784:
                case 3785:
                case 3786:
                case 3787:
                case 3788:
                case 3789:
                    switch (nextCode) {
                        case 3784:
                            switch (code) {
                                case 3761:
                                    strChar = (byte) 132;
                                    break;
                                case 3764:
                                    strChar = (byte) 133;
                                    break;
                                case 3765:
                                    strChar = (byte) 134;
                                    break;
                                case 3766:
                                    strChar = (byte) 135;
                                    break;
                                case 3767:
                                    strChar = (byte) 136;
                                    break;
                            }
                            break;
                        case 3785:
                            switch (code) {
                                case 3761:
                                    strChar = (byte) 152;
                                    break;
                                case 3764:
                                    strChar = (byte) 153;
                                    break;
                                case 3765:
                                    strChar = (byte) 154;
                                    break;
                                case 3766:
                                    strChar = (byte) 155;
                                    break;
                                case 3767:
                                    strChar = (byte) 156;
                                    break;
                            }
                            break;
                    }
                    i += 1;
                    break;
                default:
                    strChar = (byte) prntTxt.charAt(i);
                    break;
            }
        }

        if (ObjectUtils.isNull(poDocument.getAssignedUserPrincipalId())) {
            valid = false;
            errorMap.putError(PurapPropertyConstants.ASSIGNED_USER_PRINCIPAL_NAME, PurapKeyConstants.ERROR_NONEXIST_ASSIGNED_USER);
        }

        if (settings.equals(lastSettings)) return true;

        if (isConstant) {
            if (isDelete) {
                compiler.report(t.makeError(getprop, CONST_PROPERTY_DELETED, propertyName));
                return;
            }
            ObjectType oType = objectType;
            while (oType != null) {
                if (oType.hasReferenceName()) {
                    if (initializedConstantProperties.containsEntry(oType.getReferenceName(), propertyName)) {
                        compiler.report(t.makeError(getprop, CONST_PROPERTY_REASSIGNED_VALUE, propertyName));
                        break;
                    }
                }
                oType = oType.getImplicitPrototype();
            }
            Preconditions.checkState(objectType.hasReferenceName());
            initializedConstantProperties.put(objectType.getReferenceName(), propertyName);
            if (objectType.isInstanceType()) {
                ObjectType prototype = objectType.getImplicitPrototype();
                if (prototype != null) {
                    if (prototype.hasProperty(propertyName) && prototype.hasReferenceName()) {
                        initializedConstantProperties.put(prototype.getReferenceName(), propertyName);
                    }
                }
            }
        }

        if (exp.isJoined()) {
            executeJoin(exp);
            return;
        }

        if ((codigoDigitadoEnterSetorComercial != null && !codigoDigitadoEnterSetorComercial.toString().trim().equalsIgnoreCase("")) && (idDigitadoEnterLocalidade != null && !idDigitadoEnterLocalidade.toString().trim().equalsIgnoreCase(""))) {
            FiltroSetorComercial filtroSetorComercial = new FiltroSetorComercial();
            if (idDigitadoEnterLocalidade != null && !idDigitadoEnterLocalidade.toString().trim().equalsIgnoreCase("")) {
                filtroSetorComercial.adicionarParametro(new ParametroSimples(FiltroSetorComercial.ID_LOCALIDADE, new Integer(idDigitadoEnterLocalidade)));
            }
            filtroSetorComercial.adicionarParametro(new ParametroSimples(FiltroSetorComercial.CODIGO_SETOR_COMERCIAL, new Integer(codigoDigitadoEnterSetorComercial)));
            Collection<SetorComercial> setorComerciais = fachada.pesquisar(filtroSetorComercial, SetorComercial.class.getName());
            if (setorComerciais == null || setorComerciais.isEmpty()) {
                httpServletRequest.setAttribute("nomeCampo", "codigoSetorComercial");
                throw new ActionServletException("atencao.setor_comercial_nao_existe");
            }
        }

        if (peer.getPeerName().equals(peer.getPeerName(0))) {
            String pathString = m_conf.get(CONF_CENTER_OUT_PATH);
            if (pathString != null) {
                final SequenceFile.Writer dataWriter = SequenceFile.createWriter(FileSystem.get(m_conf), m_conf, new Path(pathString), PipesVectorWritable.class, NullWritable.class, CompressionType.NONE);
                final NullWritable value = NullWritable.get();
                for (DoubleVector center : m_centers_cpu) {
                    dataWriter.append(new PipesVectorWritable(center), value);
                }
                dataWriter.close();
            }
        }

        if (details.contains("Find the pastor in his church.")) {
            Preferences.setString("lttQuestName", "Haunted Boneyard");
            Preferences.setInteger("lttQuestDifficulty", 2);
            return "step1";
        }

        if (name.equals("DISPATCH_REPORT")) return new SkipField("DISPATCH REPORT", true);

        if (!findDispatchOp) {
            List<Feature> endpointFeatures = ((JaxWsClientEndpointImpl) client.getEndpoint()).getFeatures();
            List<Feature> allFeatures;
            if (client.getBus().getFeatures() != null) {
                allFeatures = new ArrayList<>(endpointFeatures.size() + client.getBus().getFeatures().size());
                allFeatures.addAll(endpointFeatures);
                allFeatures.addAll(client.getBus().getFeatures());
            } else {
                allFeatures = endpointFeatures;
            }
            for (Feature feature : allFeatures) {
                if (feature instanceof WSAddressingFeature) {
                    findDispatchOp = true;
                }
            }
        }

        if (lastBullet[i] != '.') {
            buffer.append("</li>").append(closeList.get(new Character(lastBullet[i]))).append("\n");
        }

        if (lineNo < 0) {
            props.put(IMarker.LOCATION, problem.getAttribute(IProblem.LOCATION));
        }

        if (StringUtils.isNotBlank(shortVdcId) && (VdcUtil.getVdcUrn(shortVdcId) == null)) {
            throw APIException.badRequests.badVdcId(shortVdcId);
        }

        if (((_runCount + i) % 17) == 0 && !peer.isCompleted()) coordinator.sendPeers(peer);

        if (this.getEngines().isEmpty()) {
            this.getEngines().add(new NotificationEngineCfg(EmailEngine.class, new CfgParameter("mail.host", "127.0.0.1"), new CfgParameter("mail.user", ""), new CfgParameter("mail.password", ""), new CfgParameter("from", "bergamot@localhost")));
        }

        if (filePath.toLowerCase().endsWith(".docx") || filePath.toLowerCase().endsWith(".pptx") || filePath.toLowerCase().endsWith(".xlsx")) {
            File uploadFile = new File(fileStr);
            POITextExtractor extractor = ExtractorFactory.createExtractor(uploadFile);
            String content = extractor.getText();
            bytes = content.getBytes();
        } else {
            File file = new File(fileStr);
            InputStream is = new FileInputStream(file);
            bytes = new byte[(int) file.length()];
            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }
            is.close();
        }

        if (isGenerator) {
            operationLocal = firstFreeLocal++;
            localsMax = firstFreeLocal;
            cfw.addALoad(thisObjLocal);
            generatorStateLocal = firstFreeLocal++;
            localsMax = firstFreeLocal;
            cfw.add(ByteCode.CHECKCAST, OptRuntime.GeneratorState.CLASS_NAME);
            cfw.add(ByteCode.DUP);
            cfw.addAStore(generatorStateLocal);
            cfw.add(ByteCode.GETFIELD, OptRuntime.GeneratorState.CLASS_NAME, OptRuntime.GeneratorState.thisObj_NAME, OptRuntime.GeneratorState.thisObj_TYPE);
            cfw.addAStore(thisObjLocal);
            if (epilogueLabel == -1) {
                epilogueLabel = cfw.acquireLabel();
            }
            List<Node> targets = ((FunctionNode) scriptOrFn).getResumptionPoints();
            if (targets != null) {
                generateGetGeneratorResumptionPoint();
                generatorSwitch = cfw.addTableSwitch(0, targets.size() + GENERATOR_START);
                generateCheckForThrowOrClose(-1, false, GENERATOR_START);
            }
        }

        if (default_ID != null && default_ID.equals(list[i].getID())) selected = true;

        if (durationminutes < 10) {
            durationformat = "0" + durationminutes;
        } else {
            durationformat = "" + durationminutes;
        }

        if (analyzer != null && !isDartPatchUri(remoteUri)) {
            final String path = analyzer.getAbsolutePath(remoteUri);
            if (path != null) {
                return LocalFileSystem.getInstance().findFileByPath(path);
            }
        }

        if (enableDelay) {
            setDismissDelayTimer();
        }

        if (p_job.getState().equals(Job.IMPORTFAILED) || p_reimportAsUnextracted) {
            msgBody.append(bundle.getString(p_reimportAsUnextracted ? "msg_import_correction_source_pages" : "msg_import_fail_source_pages"));
            msgBody.append(":\r\n\r\n");
            Collection sourcePages = p_job.getSourcePages();
            for (Iterator spi = sourcePages.iterator(); spi.hasNext(); ) {
                SourcePage sp = (SourcePage) spi.next();
                if (sp.getRequest().getType() < 0) {
                    msgBody.append(bundle.getString("lb_source_page"));
                    msgBody.append(": ");
                    msgBody.append(sp.getExternalPageId());
                    msgBody.append("\r\n   ");
                    msgBody.append(bundle.getString("lb_failed_due_to"));
                    msgBody.append(": ");
                    msgBody.append(sp.getRequest().getException().getLocalizedMessage());
                    msgBody.append("\r\n");
                }
            }
        }

        if (_isCtrl) {
            switch (keycode) {
                case Input.Keys.D:
                case Input.Keys.PLUS:
                    _map.animator().animateZoom(500, 2, 0, 0);
                    _map.updateMap(false);
                    return true;
                case Input.Keys.A:
                case Input.Keys.MINUS:
                    _map.animator().animateZoom(500, 0.5, 0, 0);
                    _map.updateMap(false);
                    return true;
            }
        }

        if (checkable) {
            table.setSelectionModel(selectionModel, DefaultSelectionEventManager.<Attribute>createCheckboxManager(0));
            table.addCheckBoxColumn();
        }

        if (instruction.getOpcode().equals("ack")) handleAck(instruction);

        if (varUpper.equals("E")) {
            return Math.E;
        }

        if (descriptor.isBackendPrincipal()) {
            Element backend = (Element) appendChild(mapElementNode, RuntimeTagNames.BACKEND_PRINCIPAL);
            setAttribute(backend, RuntimeTagNames.USER_NAME, (String) descriptor.getAttributeValue(MapElement.BACKEND_PRINCIPAL, Principal.USER_NAME));
            setAttribute(backend, RuntimeTagNames.PASSWORD, (String) descriptor.getAttributeValue(MapElement.BACKEND_PRINCIPAL, Principal.PASSWORD));
            setAttribute(backend, RuntimeTagNames.CREDENTIAL, (String) descriptor.getAttributeValue(MapElement.BACKEND_PRINCIPAL, Principal.CREDENTIAL));
        }

        if (start.isInt() && end.isInt()) {
            long startV = start.getInt();
            long endV = end.getInt();
            if (increment.isInt()) {
                long incrV = increment.getInt();
                iterCount = Math.max(0, (endV - startV + incrV) / incrV);
            } else {
                iterCount = iterCountUnknownIncr(startV, endV);
            }
        } else if (start.isFloat() && end.isFloat()) {
            double startV = start.getFloat();
            double endV = end.getFloat();
            if (increment.isFloat()) {
                double incrV = increment.getFloat();
                iterCount = Math.max(0, (long) Math.floor((endV - startV + incrV) / incrV));
            } else {
                iterCount = iterCountUnknownIncr(startV, endV);
            }
        }

        if (!scanXML(inFile)) {
            err.println(ts.l("doSendChanges.badScan"));
            finishedErrStream = true;
            return false;
        }

        if (min_x != null) {
            Domain y_domain = new Domain(y, min_x, null);
            bnd.getDomain(y).intersect(y_domain);
        }

        if (secRef.containsReference()) {
            LOG.debug("STR: Reference");
            Reference reference = secRef.getReference();
            return STRParserUtil.getTokenElement(doc, wsDocInfo, null, reference.getURI(), reference.getValueType());
        } else if (secRef.containsX509Data() || secRef.containsX509IssuerSerial()) {
            LOG.debug("STR: IssuerSerial");
            X509Certificate[] certs = secRef.getX509IssuerSerial(wsDocInfo.getCrypto());
            if (certs == null || certs.length == 0 || certs[0] == null) {
                throw new WSSecurityException(WSSecurityException.ErrorCode.FAILED_CHECK);
            }
            return createBSTX509(doc, certs[0], secRef.getElement(), secRef.getKeyIdentifierEncodingType());
        } else if (secRef.containsKeyIdentifier()) {
            LOG.debug("STR: KeyIdentifier");
            if (WSConstants.WSS_SAML_KI_VALUE_TYPE.equals(secRef.getKeyIdentifierValueType()) || WSConstants.WSS_SAML2_KI_VALUE_TYPE.equals(secRef.getKeyIdentifierValueType())) {
                return STRParserUtil.getTokenElement(doc, wsDocInfo, null, secRef.getKeyIdentifierValue(), secRef.getKeyIdentifierValueType());
            } else {
                X509Certificate[] certs = secRef.getKeyIdentifier(wsDocInfo.getCrypto());
                if (certs == null || certs.length == 0 || certs[0] == null) {
                    throw new WSSecurityException(WSSecurityException.ErrorCode.FAILED_CHECK);
                }
                return createBSTX509(doc, certs[0], secRef.getElement());
            }
        }

        if ((continueLabel != null) && (increments != null)) {
            LoopingFlowContext loopContext = new LoopingFlowContext(flowContext, this, null, null, scope);
            for (int i = 0, count = increments.length; i < count; i++) {
                actionInfo = increments[i].analyseCode(scope, loopContext, actionInfo);
            }
            loopContext.complainOnFinalAssignmentsInLoop(scope, actionInfo);
        }

        if (state.action != State.ACTION_CREATE && empty) continue;

        if (addtoken && needId()) {
            String[] arr = url.split("\\?");
            if (arr.length == 1) {
                url += "?" + pageContext.getURLToken();
            } else if (arr.length > 1) {
                url = arr[0] + "?" + pageContext.getURLToken();
                for (int i = 1; i < arr.length; i++) url += "&" + arr[i];
            }
            url = ReqRspUtil.encodeRedirectURLEL(rsp, url);
        }

        if (this.configService.getBooleanProperty("yamj3.delete.orphan.certification", true)) {
            try {
                this.commonStorageService.deleteOrphanCertifications();
            } catch (Exception ex) {
                LOG.warn("Failed to delete orphan certifications", ex);
            }
        }

        if (C == null || C.isZERO() || F == null || F.size() == 0) {
            throw new IllegalArgumentException("C must be nonzero and F must be nonempty");
        }

        if ((foundMods & searchMods) == searchMods) {
            System.out.format("%-8s [ synthetic=%-5b enum_constant=%-5b ]%n", f.getName(), f.isSynthetic(), f.isEnumConstant());
            found = true;
        }

        if (actorJID != null && actorJID.toString().length() > 0) {
            Element frag = kickPresence.getChildElement("x", "http://jabber.org/protocol/muc#user");
            Element actor = frag.element("item").addElement("actor");
            actor.addAttribute("jid", actorJID.toBareJID());
            if (nick != null) {
                actor.addAttribute("nick", nick);
            }
        }

        if (server.getPagingManager().getPageStore(PagingTest.ADDRESS).isPaging()) {
            break;
        }

        if (this.currentElement instanceof RecoveredModule) {
            this.lastCheckPoint = siName.sourceEnd + 1;
            this.currentElement = this.currentElement.add(ref, 0);
            this.lastIgnoredToken = -1;
        }

        if (tool == currentTool) {
            toolbar.clearSelection();
            unselect();
        } else {
            try {
                select(tool);
                propertiesBar.select(toolUI.getPropertiesBar(tool));
            } catch (UnselectToolException unselectToolException) {
                toolbar.clearSelection();
                unselect();
            }
        }

        if (readonly) ((ReadOnlyTopicMap) topicmap).setTransaction(this);
        else ((TopicMap) topicmap).setTransaction(this);

        if (value instanceof ColorRGBA) {
            ColorRGBA c = (ColorRGBA) value;
            vec4.set(c.r, c.g, c.b, c.a);
        } else if (value instanceof Vector4f) {
            vec4.set((Vector4f) value);
        } else {
            Quaternion q = (Quaternion) value;
            vec4.set(q.getX(), q.getY(), q.getZ(), q.getW());
        }

        if (assistant != null) contentAssistAction = createContentAssistAction(sourceViewer);

        if (index + 1 < childCount) {
            arraycopy(children, index + 1, newChildren, index, childCount - index - 1);
            if (newChildren.length >= childCount) {
                newChildren[childCount - 1] = null;
            }
        }

        if (_customIdResolver != null) {
            return _customIdResolver;
        }

        if (ringing.length() > 0) {
            List<Long> givenRingingIds = toLongList(ringing);
            List<CallUser> stoppedRingingUsers = new ArrayList<>();
            List<CallUser> startedRingingUsers = new ArrayList<>();
            for (CallUser cUser : call.getRingingUsers()) {
                final long userId = cUser.getUser().getIdLong();
                if (!givenRingingIds.contains(userId)) {
                    ((CallUserImpl) cUser).setRinging(false);
                    stoppedRingingUsers.add(cUser);
                } else {
                    givenRingingIds.remove(userId);
                }
            }
            for (long userId : givenRingingIds) {
                CallUserImpl cUser = (CallUserImpl) call.getCallUserMap().get(userId);
                cUser.setRinging(true);
                startedRingingUsers.add(cUser);
            }
            if (stoppedRingingUsers.size() > 0 || startedRingingUsers.size() > 0) {
                api.getEventManager().handle(new CallUpdateRingingUsersEvent(api, responseNumber, call, stoppedRingingUsers, startedRingingUsers));
            }
        }

        if (bc.state.equals(EXPLODING)) {
            updateBlowUpBug(entity, deltaTime);
        }

        if (object.getText() != null) {
            fieldCount++;
            jacksonSerializer.writeStringField("text", object.getText());
        }

        if (!normalized.startsWith("/")) normalized = "/" + normalized;

        if (currentChar == '\r') {
            lineNumber++;
            if (isEOLSignificant) {
                lastCr = true;
                peekChar = -2;
                ttype = TT_EOL;
                return ttype;
            }
            currentChar = read();
            if (currentChar == '\n') {
                currentChar = read();
            }
        } else if (currentChar == '\n') {
            lineNumber++;
            if (isEOLSignificant) {
                peekChar = -2;
                ttype = TT_EOL;
                return ttype;
            }
            currentChar = read();
        } else {
            currentChar = read();
        }

        if (ve == null) {
            ve = new VelocityEngine();
            tempDir = Files.createTempDir();
            tempDir.deleteOnExit();
            ve.setProperty("file.resource.loader.path", tempDir.getAbsolutePath());
            ve.init();
        }

        if (key == null || lists == null) throw new NullPointerException("key cannot be null.");

        if (axes.length != axisIndices.length) {
            throw new IllegalArgumentException("The number of selected dimension doesn't conforms with the kernel size.");
        }

        if (!isAccessible) {
            final String principalName = currentUser.getPrincipalName();
            final String[] chartErrorParams = new String[]{getDataDictionaryService().getAttributeLabel(accountingLineForValidation.getClass(), KFSPropertyConstants.CHART_OF_ACCOUNTS_CODE), accountingLineForValidation.getChartOfAccountsCode(), principalName};
            GlobalVariables.getMessageMap().putError(KFSPropertyConstants.CHART_OF_ACCOUNTS_CODE, convertEventToMessage(event), chartErrorParams);
            final String[] accountErrorParams = new String[]{getDataDictionaryService().getAttributeLabel(accountingLineForValidation.getClass(), KFSPropertyConstants.ACCOUNT_NUMBER), accountingLineForValidation.getAccountNumber(), principalName};
            GlobalVariables.getMessageMap().putError(KFSPropertyConstants.ACCOUNT_NUMBER, convertEventToMessage(event), accountErrorParams);
        }

        if (pageCount > 0 && page != pageCount - 1) {
            menu.addItem(this.listSet.nextPageArrow(), clickRight -> {
                if (!clickRight.getPlayer().isOnline()) {
                    return;
                }
                final Player clicker = clickRight.getPlayer();
                clicker.closeInventory();
                clicker.playSound(clicker.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.75f);
                this.openListMenu(clicker, prot, page + 1);
            });
        } else {
            menu.addEmptyItem();
        }

        if (tikaConfig == null) {
            tikaConfig = context.get(TikaConfig.class);
            if (tikaConfig == null) {
                tikaConfig = TikaConfig.getDefaultConfig();
            }
        }

        if ((b & 0xc0) != 0x80) return false;

        if (data.isProtected(folder)) {
            return cannotModifyRepository(tree);
        } else {
            return FINISH_FOR_ME;
        }

        if (element instanceof SClassDefinition) {
            return getClassDefinitionLabel((SClassDefinition) element, flags);
        }

        if (command == RefreshType.REFRESH) {
            SleepIQCloudHandler cloudHandler = (SleepIQCloudHandler) getBridge().getHandler();
            cloudHandler.refreshBedStatus();
        }

        if (!ActionUtils.containAllMandotory(providerRequestItem.getActions(), myRequestItem.getActions())) {
            LOG.info("At least one mandatory requested actions is not available in the provided action list");
            return false;
        }

        if (dirList.isEmpty()) {
            output.setReal(0.0);
        } else {
            Histogram1d<Integer> hist = histOp.calculate(dirList);
            double std = stdOp.calculate(hist).getRealDouble();
            output.setReal(1 / std);
        }

        if (isJmsTransacted() && !(messagingSource.isXaEnabledForSure() && JtaUtil.inTransaction())) {
            session.commit();
            log.debug(getLogPrefix() + "committing (send) transaction");
        }

        if (val.numberLength > 32) {
            return ((val.sign > 0) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
        }

        if (file.mkdir()) {
            return true;
        } else if (!file.getParentFile().canWrite()) {
            throw new FileAccessException(path + ERR_PERMISSION_DENIED);
        } else {
            throw new FileNotFoundException(path.getParentDirectory() + ERR_NOT_A_DIRECTORY);
        }

        if (log.isDebug3() && fud.redirectUrls != null) {
            log.debug3("FUD: " + fud.toString());
        }

        if (cols.size() > 0) {
            while (tcm.getColumnCount() > 0) tcm.removeColumn(tcm.getColumn(0));
            for (TableColumn col : cols) tcm.addColumn(col);
        }

        if (traits.traits.get(t) instanceof TraitSlotConst) {
            TraitSlotConst tsc = (TraitSlotConst) traits.traits.get(t);
            if (tsc.name_index == multinameIndex) {
                ret.add(new ConstVarNameMultinameUsage(this, multinameIndex, scriptIndex, classIndex, t, traitsType, traits, parentTraitIndex));
            }
            if (tsc.type_index == multinameIndex) {
                ret.add(new ConstVarTypeMultinameUsage(this, multinameIndex, scriptIndex, classIndex, t, traitsType, traits, parentTraitIndex));
            }
        }

        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                List<Integer> curPath = new ArrayList<Integer>(path);
                resSet.add(curPath);
            }
        }

        if (Character.isDigit(firstChar) || firstChar == '-') {
            return parseLineNumber(arg);
        } else if (firstChar == '#') {
            Map<String, Object> args = new HashMap<String, Object>();
            args.put("token", arg);
            throw new ParseException(getLocalizationManager().getLocalizedTextString("expectedLineNumber", args), 0);
        } else {
            int[] moduleAndLine = parseFunctionName(module, arg, true);
            return moduleAndLine[1];
        }

        if (configuration == null) {
            configuration = new JCADataSourceConfiguration();
        }

        if (readOnly) throw new CertificateParsingException("cannot over-write existing certificate");

        if (testList.size() == 0) {
            Set testNames = testProvider.getAllTestCmdNames();
            Iterator iter = testNames.iterator();
            while (iter.hasNext()) testList.add((String) iter.next());
        }

        if (PartyManager.checkPartyExistence(player, newPartyName)) {
            return true;
        }

        if (testLevel.length() == 0) throw new NullPointerException();

        if (messageAdded) {
            Set<LogLevel> levels = this.messageMap.keySet();
            for (LogLevel level : levels) {
                JEditorPane MessagePane = addTab(level);
                StringBuffer sb = createMessages(level);
                MessagePane.setContentType("text/html");
                MessagePane.setText(sb.toString());
            }
            messageAdded = false;
        }

        if (o.getSample() != null) {
            SampleService ps = BeanFactory.getSampleServiceBean();
            Sample sample = (Sample) testIfNull(ps.findByID(o.getSample().getSampleId()));
            o.setSample(sample);
        }

        if (getConfigBool(SwitchboardConstants.UPNP_ENABLED, false)) {
            new OneTimeBusyThread("UPnP.addPortMappings") {
                @Override
                public boolean jobImpl() throws Exception {
                    UPnP.addPortMappings();
                    return true;
                }
            }.start();
        }

        if (random.nextDouble() < nonMoveProb && pastAction != ACTIONS.ACTION_USE && pastAction != ACTIONS.ACTION_NIL) {
            StateObservation tempState = stateObs.copy();
            tempState.advance(pastAction);
            if (tempState.getAvatarPosition().equals(stateObs.getAvatarPosition()) && tempState.getAvatarOrientation().equals(stateObs.getAvatarOrientation())) {
                moves = 0;
                nilMoves = 0;
                currentState = DECIDE_ACTION;
            }
        }

        if (logFactory.databaseEncrypted()) {
            scan.readFully(data, 0, recordLength);
            int len = logFactory.decrypt(data, 0, recordLength, data, 0);
            if (SanityManager.DEBUG) SanityManager.ASSERT(len == recordLength);
            input.setLimit(0, len);
        } else {
            if (groupmask == 0 && tranId == null) {
                scan.readFully(data, 0, recordLength);
                input.setLimit(0, recordLength);
            } else {
                readAmount = (recordLength > peekAmount) ? peekAmount : recordLength;
                scan.readFully(data, 0, readAmount);
                input.setLimit(0, readAmount);
            }
        }

        if (num >= this.indexEntriesPerSegment && offset == 0) {
            for (; offset <= this.lastIndexEntryOffset; offset += this.indexEntrySize) {
                final long pointer = currentIndexSegment.getLong(offset) & POINTER_MASK;
                this.recordBuffer.setReadPosition(pointer);
                this.serializer.copy(this.recordBuffer, output);
            }
            num -= this.indexEntriesPerSegment;
        } else {
            for (; num > 0 && offset <= this.lastIndexEntryOffset; num--, offset += this.indexEntrySize) {
                final long pointer = currentIndexSegment.getLong(offset) & POINTER_MASK;
                this.recordBuffer.setReadPosition(pointer);
                this.serializer.copy(this.recordBuffer, output);
            }
        }

        if (fs == null) return;

        if (requestMap == null) {
            if (throwRequestHandlerExceptionOnMissingLocalRequest)
                throw new RequestHandlerException(requestMissingErrorMessage);
            else throw new RequestHandlerExceptionAllowExternalRequests();
        }

        if (scan != null) {
            scan.validate();
        }

        if (i == ((BYTES_IN_ROW + 1) / 2) - 1) {
            r[j++] = '-';
        } else {
            r[j++] = ' ';
        }

        if (batchSize != null) {
            item.setAttribute(BATCH_SIZE, batchSize + "");
        }

        if (versionInfo.contains("version \"" + javaVersion + "\"")) {
            return null;
        }

        if (hasThrowable()) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(getThrowable().toString()).build();
        }

        if (ObjectUtils.isBlank(x)) {
            return ObjectUtils.isBlank(y);
        } else if (ObjectUtils.isBlank(y)) {
            return ObjectUtils.isBlank(x);
        }

        if (processEngineConfiguration.getHistoryLevel().getId() > ProcessEngineConfigurationImpl.HISTORYLEVEL_NONE) {
            List<HistoricActivityInstance> onlySubProcessInstances = historyService.createHistoricActivityInstanceQuery().activityType("subProcess").list();
            assertEquals(4, onlySubProcessInstances.size());
            List<HistoricActivityInstance> historicInstances = historyService.createHistoricActivityInstanceQuery().activityType("subProcess").list();
            assertEquals(4, historicInstances.size());
            for (HistoricActivityInstance hai : historicInstances) {
                assertNotNull(hai.getStartTime());
                assertNotNull(hai.getEndTime());
            }
            historicInstances = historyService.createHistoricActivityInstanceQuery().activityType("userTask").list();
            assertEquals(8, historicInstances.size());
            for (HistoricActivityInstance hai : historicInstances) {
                assertNotNull(hai.getStartTime());
                assertNotNull(hai.getEndTime());
            }
        }

        if ((i & (Machine.gfx[0].color_granularity - 1)) == 0) {
            colortable[Machine.drv.gfxdecodeinfo[0].color_codes_start + i] = 0;
        }

        if (!authorizeUser(user, null, enteredUsername, connEnv, requestCtx)) {
            return;
        }

        if (br.containsHTML("(Sie haben ein Limit fuer Downloaden ausgeschoepft|You used up your limit|Please try in|You have reached your download time limit)")) {
            String wait = br.getRegex("html_download_api-limit_interval\">(\\d+)</span>").getMatch(0);
            if (wait != null) {
                throw new PluginException(LinkStatus.ERROR_IP_BLOCKED, Integer.parseInt(wait) * 1000l);
            }
            wait = br.getRegex(">Try in (\\d+) minutes or use GOLD account").getMatch(0);
            if (wait != null) {
                throw new PluginException(LinkStatus.ERROR_IP_BLOCKED, (Integer.parseInt(wait) + 1) * 60 * 1000l);
            }
            wait = br.getRegex(">Try in (\\d+) seconds or use GOLD account").getMatch(0);
            if (wait != null) {
                throw new PluginException(LinkStatus.ERROR_IP_BLOCKED, Integer.parseInt(wait) * 1000l);
            }
            throw new PluginException(LinkStatus.ERROR_IP_BLOCKED, 30 * 60 * 1000l);
        }

        if (!entity.getNowWaitingLatch().await(TIMEOUT, TimeUnit.MILLISECONDS)) {
            result.set("took too long for waitabit to be waiting");
            return;
        }

        if (this.myIdsCondition != null) {
            innerWhereClause = "WHERE ".concat(innerWhereClause).concat(" AND (" + this.myIdsCondition + ")");
        } else {
            innerWhereClause = "WHERE ".concat(innerWhereClause);
        }

        if (toRefresh != null && !toRefresh.isDisposed()) {
            autHierarchy.refreshComponent(toRefresh);
        }

        if (resourceContent.getExternalLocation() != null) {
            try {
                return Response.temporaryRedirect(resourceContent.getExternalLocation().toURI()).build();
            } catch (URISyntaxException e) {
                throw new WebApplicationException(Status.INTERNAL_SERVER_ERROR);
            }
        }

        if ((addr & 0xF800) == 0) {
            ram[addr & 0x7FF] = (byte) data;
            return;
        }

        if (!contains(previous) && parent != null) {
            cellAdded(cell);
        } else if (parent == null) {
            cellRemoved(cell);
        }

        if (firstLoad) {
            firstLoad = false;
            currentBottom = ORIGINAL;
        } else {
            System.out.println("Reloading");
            newLogLoaded = true;
        }

        if (this.converters.isEmpty()) {
            JRDesignElement designElement;
            if (RenderedImage.class.isAssignableFrom(valueClass)) {
                designElement = createImageElement(templateDesign, columnName);
                addElement(detailBand, designElement, detailPosX, detailPosY, columnWidth, detailHeight, columnDetailStyle);
            } else {
                JRDesignTextField textField = createTextField(columnName);
                addElement(detailBand, textField, detailPosX, detailPosY, columnWidth, detailHeight, columnDetailStyle);
            }
        } else {
            JRDesignElement imageElement = createImageElement(templateDesign, columnName);
            JRDesignExpression printWhenExpression = new JRDesignExpression();
            printWhenExpression.setText("new Boolean($F{" + columnName + "}.getClass().equals(java.awt.image.BufferedImage.class))");
            imageElement.setPrintWhenExpression(printWhenExpression);
            addElement(detailBand, imageElement, detailPosX, detailPosY, columnWidth, detailHeight, columnDetailStyle);
            JRDesignTextField textField = createTextField(columnName);
            printWhenExpression = new JRDesignExpression();
            printWhenExpression.setText("new Boolean(!$F{" + columnName + "}.getClass().equals(java.awt.image.BufferedImage.class))");
            textField.setPrintWhenExpression(printWhenExpression);
            addElement(detailBand, textField, detailPosX, detailPosY, columnWidth, detailHeight, columnDetailStyle);
        }

        if (it.hasNext()) {
            return it.next();
        }

        if (propToolkit != null) System.setProperty("awt.toolkit", propToolkit);

        if (VM.UseEpilogueYieldPoints) {
            for (Enumeration<BasicBlock> e = ir.getBasicBlocks(); e.hasMoreElements(); ) {
                BasicBlock block = e.nextElement();
                if (block.hasReturn() || block.hasAthrowInst()) {
                    prependYield(block, YIELDPOINT_EPILOGUE, INSTRUMENTATION_BCI, ir.getGc().getInlineSequence());
                }
            }
        }

        if (form != null && form.getAddresses() != null) {
            Map<String, String> countries = retrieveIsoCountries();
            for (AddressForm addressForm : form.getAddresses()) {
                addressForm.setCountryName(countries.get(addressForm.getIso2Country().getValue().name()));
            }
        }

        if (newChangeStart <= storedClientStart && newChangeEnd > storedClientStart) {
            int numberOfStoredChangeSymbolsToRemove = newChangeEnd - storedClientStart;
            CharSequence adjustedText = storedText.subSequence(numberOfStoredChangeSymbolsToRemove, storedText.length());
            changeEntry.change = new TextChangeImpl(adjustedText, changeEntry.change.getStart(), changeEntry.change.getEnd());
            changeEntry.clientStartOffset += changeDiff + numberOfStoredChangeSymbolsToRemove;
            newChangeEnd -= numberOfStoredChangeSymbolsToRemove;
            insertionIndex = i;
            continue;
        }

        if (!currFieldValue.equals(fieldValue)) {
            modifiedFields modifiedField = new modifiedFields();
            modifiedField.setFieldId(fieldId);
            modifiedField.setProgramPatientId(clientId);
            modifiedField.setSystemUserId(systemUserId);
            modifiedField.setOldFieldValue(currFieldValue);
            modifiedField.setNewFieldValue(fieldValue);
            sessionFactory.getCurrentSession().save(modifiedField);
        }

        if (runningThreads.isEmpty()) {
            state = ExplorationProcessState.COMPLETED;
            threadPool.shutdown();
            synchronized (terminationSnycObject) {
                terminationSnycObject.notify();
                logger.info("Exploration terminated.");
            }
        }

        if (elementName == null || elementName.isEmpty()) {
            if (type.equals(ElementSetType.BRIEF)) {
                return new BriefRecordType(identifier, title, litType, bboxes);
            }
            if (type.equals(ElementSetType.SUMMARY)) {
                return new SummaryRecordType(identifier, title, litType, bboxes, keywords, format, modified, _abstract);
            } else {
                return fullResult;
            }
        } else {
            final RecordType result = new RecordType();
            for (QName qn : elementName) {
                try {
                    final Method getter = ReflectionUtilities.getGetterFromName(qn.getLocalPart(), RecordType.class);
                    final Object param = ReflectionUtilities.invokeMethod(fullResult, getter);
                    Method setter = null;
                    if (param != null) {
                        setter = ReflectionUtilities.getSetterFromName(qn.getLocalPart(), param.getClass(), RecordType.class);
                    }
                    if (setter != null) {
                        ReflectionUtilities.invokeMethod(setter, result, param);
                    } else {
                        if (param != null) {
                            LOGGER.warning("No setter have been found for attribute " + qn.getLocalPart() + " of type " + param.getClass() + " in the class RecordType");
                        }
                    }
                } catch (IllegalArgumentException ex) {
                    LOGGER.warning("illegal argument exception while invoking the method get" + StringUtilities.firstToUpper(qn.getLocalPart()) + " in the RecordType class");
                }
            }
            return result;
        }

        if (!(symbol.isVisible(feature))) return false;

        if (cause != null) {
            cause.printStackTraceAsCause(writer, trace);
        }

        if (entity instanceof TileEntityWire) return TransportConnectionState.TRANSPORT;

        if (m_weightByDistance) {
            tempDist = new double[m_stored[0]];
            for (j = 0, distNorm = 0; j < m_stored[0]; j++) {
                tempDist[j] = m_karray[0][j][0];
                distNorm += m_weightsByRank[j];
            }
            tempSorted = Utils.sort(tempDist);
        }

        if (rangeVariableDeclaration != null) {
            children.add(rangeVariableDeclaration);
        }

        if (transferStatusCallbackListener != null && transferControlBlock.getTransferOptions().isIntraFileStatusCallbacks() && !transferControlBlock.isCancelled()) {
            ConnectionProgressStatusListener intraFileStatusListener = DefaultIntraFileProgressCallbackListener.instanceSettingTransferOptions(TransferType.GET, irodsFileLength, transferControlBlock, transferStatusCallbackListener, transferControlBlock.getTransferOptions());
            ConnectionProgressStatus status = ConnectionProgressStatus.instanceForSend(irodsFileLength);
            intraFileStatusListener.finalConnectionProgressStatusCallback(status);
        }

        if (configCfg == null) {
            initializeConfig();
        }

        if (e.getSource() instanceof JstringField || e.getSource() instanceof JnumberField || e.getSource() instanceof JfloatField) {
            OkButton.doClick();
        }

        if (actionMenuItemMap.containsKey(action)) return false;

        if (log.isDebugEnabled()) {
            log.debug(String.format("Delegating cluster status event message: %s", type));
        }

        if (left != null) {
            while (left != expr) {
                left = (ELInvocationExpression) left.getParent();
                if (left != expr) {
                    ELSegmentImpl segment = new ELSegmentImpl(left.getLastToken());
                    segment.setResolved(true);
                    resolution.addSegment(segment);
                    resolution.setLastResolvedToken(left);
                    return resolution;
                } else {
                    resolveLastSegment(file, (ELInvocationExpression) operand, resolvedVariables, resolution, returnEqualedVariablesOnly);
                    break;
                }
            }
        } else {
            ELSegmentImpl segment = new ELSegmentImpl(expr.getFirstToken());
            resolution.addSegment(segment);
        }

        if (databaseFields.size() > 0) {
            meta.setFieldDatabase(databaseFields.toArray(new String[databaseFields.size()]));
            meta.setFieldStream(streamFields.toArray(new String[streamFields.size()]));
        }

        if (collection == null) {
            return null;
        }

        if (data == null) return false;

        if (pixelsPerLine == vw) {
            ((ShortBuffer) buffer).put(data, offs, vw * vh);
        } else {
            for (int r = 0; r < vh; r++) {
                ((ShortBuffer) buffer).put(data, offs, vw);
                offs += vw;
            }
        }

        if (null != this.getCtxImageUrl() && null != survey.getImageId()) {
            ImageResource resource = (ImageResource) resourceManager.loadResource(survey.getImageId());
            if (null != this.getImageDimension() && null != resource.getImagePath(this.getImageDimension())) {
                this.pageContext.setAttribute(this.getCtxImageUrl(), resource.getImagePath(this.getImageDimension()));
            } else {
                this.pageContext.setAttribute(this.getCtxImageUrl(), resource.getImagePath("0"));
            }
        }

        if (!doesNotExists) {
            String baseName = ancestorDirectoryNamesBaseNamePair.second;
            doesNotExists = currentDirectory.findFile(baseName) == null;
        }

        if (opSystem.contains("win")) {
            isWindows = true;
        } else if (opSystem.contains("mac")) {
            isOsX = true;
        } else if (opSystem.contains("linux")) {
            isLinux = true;
        } else {
            System.out.println("Your OS is not currently supported.");
            return;
        }

        if (isModule(file)) {
            jsonFragment = buildModelsJson(jsonFragment);
            Iterator<String> keysIterator = jsonFragment.keys();
            while (keysIterator.hasNext()) {
                String propertyName = keysIterator.next();
                output.put(propertyName, jsonFragment.get(propertyName));
            }
        } else {
            String modelId = jsonFragment.optString("id");
            if (StringUtility.isNullOrEmpty(modelId)) {
                modelId = toPropertyName(file);
                LOG.error("JSON model file '{}' is missing mandatory property 'id'. Using file location as id: {}", file, modelId);
            }
            output.put(modelId, jsonFragment);
        }

        if (localizedFiles == null || localizedFiles.length == 0) return null;

        if (charsetString == null || charsetString.isEmpty()) {
            charset = B2CConverter.ISO_8859_1;
        } else if ("UTF-8".equalsIgnoreCase(charsetString)) {
            charset = B2CConverter.UTF_8;
        } else {
            throw new IllegalArgumentException(sm.getString("basicAuthenticator.invalidCharset"));
        }

        if (freeBytes < diskThresholdSettings.getFreeBytesThresholdLow().getBytes()) {
            if (skipLowTresholdChecks == false) {
                if (logger.isDebugEnabled()) {
                    logger.debug("less than the required {} free bytes threshold ({} bytes free) on node {}, preventing allocation", diskThresholdSettings.getFreeBytesThresholdLow(), freeBytes, node.nodeId());
                }
                return allocation.decision(Decision.NO, NAME, "the node is above the low watermark cluster setting [%s=%s], having less than the minimum required [%s] free " + "space, actual free: [%s]", CLUSTER_ROUTING_ALLOCATION_LOW_DISK_WATERMARK_SETTING.getKey(), diskThresholdSettings.getLowWatermarkRaw(), diskThresholdSettings.getFreeBytesThresholdLow(), new ByteSizeValue(freeBytes));
            } else if (freeBytes > diskThresholdSettings.getFreeBytesThresholdHigh().getBytes()) {
                if (logger.isDebugEnabled()) {
                    logger.debug("less than the required {} free bytes threshold ({} bytes free) on node {}, " + "but allowing allocation because primary has never been allocated", diskThresholdSettings.getFreeBytesThresholdLow(), freeBytes, node.nodeId());
                }
                return allocation.decision(Decision.YES, NAME, "the node is above the low watermark, but less than the high watermark, and this primary shard has " + "never been allocated before");
            } else {
                if (logger.isDebugEnabled()) {
                    logger.debug("less than the required {} free bytes threshold ({} bytes free) on node {}, " + "preventing allocation even though primary has never been allocated", diskThresholdSettings.getFreeBytesThresholdHigh(), freeBytes, node.nodeId());
                }
                return allocation.decision(Decision.NO, NAME, "the node is above the high watermark cluster setting [%s=%s], having less than the minimum required [%s] free " + "space, actual free: [%s]", CLUSTER_ROUTING_ALLOCATION_HIGH_DISK_WATERMARK_SETTING.getKey(), diskThresholdSettings.getHighWatermarkRaw(), diskThresholdSettings.getFreeBytesThresholdHigh(), new ByteSizeValue(freeBytes));
            }
        }

        if (t.numChildren() != 1) {
            return true;
        }

        if (onlyOnePatient) {
            bottomPanel.setVisible(false);
        }

        if (isSyncOnly) {
            optionMap.put(CommandLineOptionConstants.WSDL2JavaConstants.CODEGEN_SYNC_ONLY_OPTION, new CommandLineOption(CommandLineOptionConstants.WSDL2JavaConstants.CODEGEN_SYNC_ONLY_OPTION, new String[0]));
        }

        if (m_DataBaseConnection.getUpperCase()) {
            m_idColumn = m_idColumn.toUpperCase();
        }

        if (c == '\n') {
            readingEndSequence = false;
            c = scanner.read();
            if (c == '%') {
                nextHeaderBuffer.setLength(0);
                readingEndSequence = true;
            } else if (c == ICharacterScanner.EOF) {
                break;
            } else {
                fBuffer.append((char) c);
                continue;
            }
        }

        if (unitSentence.getUnits().size() != originalSentLength[i]) {
            LOGGER.error("testSimulatedProcess() - unexpected sentence length for original sentence: " + unitSentence.getUnits().size() + "<->" + originalSentLength[i]);
            allOK = false;
        }

        if (packageNameForClass(javaType) != null) {
            setEntityPackageName(packageNameForClass(javaType));
        }

        if (!(inputTokens instanceof RandomAccess)) {
            inputTokens = ImmutableList.copyOf(inputTokens);
        }

        if (!errorMessages.isEmpty()) {
            dataReportService.writeToReport(reportDataStream, importedAgencyStagingData, errorMessages, reportHelper);
        }

        if (isReversed != null) {
            scan.setReversed(isReversed);
        }

        if (states.get(1) != null && statesOld.get(1) == null) {
            states.get(1).startViolationHere();
        }

        if (!srdfOpRequiresReadWriteChange(op)) {
            s_logger.info("Op doesn't require read-iiiiiihange: " + op);
            return readWriteVolumes;
        }

        if (tx != null) {
            TXStateInterface realtx = ((TXStateProxyImpl) tx).getRealDeal(null, null);
            if (realtx instanceof TXState) {
                return 11;
            }
        }

        if (line.toLowerCase().contains("ccn")) {
            check = true;
            Log.fine("ContentExplorer found CCN VLC plugin, enabling play option");
        }

        if (ITaskWithDeadline.class.isAssignableFrom(taskClass)) {
            ITaskWithDeadline taskWithDeadline = (ITaskWithDeadline) resultTask;
            try {
                Calendar deadline = taskMetadata.getDeadline();
                if (deadline != null) {
                    taskWithDeadline.setDeadline(deadline.getTime());
                } else {
                }
            } catch (XmlValueOutOfRangeException e) {
            }
        }

        if (jacksonParser.currentToken() == JsonToken.START_ARRAY) {
            ArrayList<Double> collection = new ArrayList<>();
            Double item = null;
            while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jacksonParser.currentToken() == JsonToken.VALUE_NULL) {
                    item = null;
                } else {
                    item = jacksonParser.getDoubleValue();
                }
                collection.add(item);
            }
            instance.valueDoubleArray = CollectionUtils.asDoubleArray(collection);
        }

        if (!dataDone && (appOut1.limit() == appIn2.position()) && (appOut2.limit() == appIn1.position())) {
            checkTransfer(appOut1, appIn2);
            checkTransfer(appOut2, appIn1);
            System.out.println("Try changing modes...");
            try {
                ssle2.setUseClientMode(false);
                throw new RuntimeException("setUseClientMode():  " + "Didn't catch the exception properly");
            } catch (IllegalArgumentException e) {
                System.out.println("Caught the correct exception.");
            }
            return;
        }

        if (economiaPopupActionForm.getNumeroIptu() != null && !economiaPopupActionForm.getNumeroIptu().equals("")) {
            fachada.verificarExistenciaIPTU(colecaoImovelEconomiasModificadas, imovel, economiaPopupActionForm.getNumeroIptu(), imovelEconomia.getUltimaAlteracao());
            imovelEconomia.setNumeroIptu(Util.formatarIPTU(economiaPopupActionForm.getNumeroIptu()));
        } else {
            imovelEconomia.setNumeroIptu(null);
        }

        if (input.length > 0) {
            cr = new CheckResult(CheckResult.TYPE_RESULT_OK, BaseMessages.getString(PKG, "ValueMapperMeta.CheckResult.ReceivingInfoFromOtherSteps"), stepMeta);
            remarks.add(cr);
        } else {
            cr = new CheckResult(CheckResult.TYPE_RESULT_ERROR, BaseMessages.getString(PKG, "ValueMapperMeta.CheckResult.NotReceivingInfoFromOtherSteps"), stepMeta);
            remarks.add(cr);
        }

        if (filterString.indexOf(VCFConstants.FILTER_CODE_SEPARATOR) == -1) fFields.add(filterString);
        else fFields.addAll(Arrays.asList(filterString.split(VCFConstants.FILTER_CODE_SEPARATOR)));

        if (History.getToken().startsWith(TopicFilteredResultsAndDetailsPresenter.HISTORY_TOKEN + ";" + Constants.CREATE_PATH_SEGMENT_PREFIX_WO_SEMICOLON)) {
            return;
        }

        if (wait == 0) {
            break;
        }

        if (!create && !HttpSessionWrapper.hasSession(this.servletContext.getServletContextName(), session)) {
            return null;
        }

        if (calendarModule.isEnableGroupCalendar()) {
            SearchBusinessGroupParams groupParams = new SearchBusinessGroupParams(identity, true, false);
            groupParams.addTools(CollaborationTools.TOOL_CALENDAR);
            List<BusinessGroup> ownerGroups = businessGroupService.findBusinessGroups(groupParams, null, 0, -1);
            addCalendars(ownerGroups, true, false, calendars, configMap);
            SearchBusinessGroupParams groupParams2 = new SearchBusinessGroupParams(identity, false, true);
            groupParams2.addTools(CollaborationTools.TOOL_CALENDAR);
            List<BusinessGroup> attendedGroups = businessGroupService.findBusinessGroups(groupParams2, null, 0, -1);
            attendedGroups.removeAll(ownerGroups);
            addCalendars(attendedGroups, false, true, calendars, configMap);
        }

        if (fExceptions.size() > 0) throw (AssertionFailedError) fExceptions.get(0);

        if (!pDepConfig.isDefaultConfig()) {
            final String pubSuffix = pDepConfig.getName();
            setAppendix(pubSuffix + '-' + getAppendix());
        }

        if (downloadLink.getBooleanProperty("offline", false))
            throw new PluginException(LinkStatus.ERROR_FILE_NOT_FOUND);

        if (!r.isScopeTrialRead() && r.isReadTrial()) {
            aclService.createAclwithPermissions(trial, l.getUsername(), new PermissionHibernate[]{PermissionHibernate.READ}, r.getName());
        }

        if (selectedHost == null || socket == null) {
            cancelRequest();
        }

        if (lines.size() == 1 && "".equals(lines.get(0))) {
            return new String[0];
        }

        if (updatedInstanceUIDs != null && updatedInstanceUIDs.size() > 0) {
            List<ArchiveInstanceLocator> locators = locate(extractUIDsFromInstanceIds(updatedInstanceUIDs));
            scheduleStore(callingAE, iocmTargetAETs, locators, extDevicesAETs);
            String[] nonIOCMAETs = cfg.getNoneIocmDestinations();
            LOG.debug("NoneIocmDestinations from IOCMConfig:{}", Arrays.toString(nonIOCMAETs));
            if (nonIOCMAETs != null && nonIOCMAETs.length > 0) {
                scheduleStore(callingAE, nonIOCMAETs, locators, extDevicesAETs);
            }
        }

        if (content_type == null) resp.setBody(body);
        else resp.setBody(content_type, body);

        if (object.users != null) {
            fieldCount++;
            int n = object.users.size();
            User item;
            jacksonSerializer.writeFieldName("users");
            if (n > 0) {
                jacksonSerializer.writeStartArray();
                for (int i = 0; i < n; i++) {
                    item = object.users.get(i);
                    if (item == null) {
                        jacksonSerializer.writeString("null");
                    } else {
                        if (userBindMap.serializeOnJacksonAsString(item, jacksonSerializer) == 0) {
                            jacksonSerializer.writeNullField("users");
                        }
                    }
                }
                jacksonSerializer.writeEndArray();
            } else {
                jacksonSerializer.writeString("");
            }
        }

        if (!this.filter || this.days == null) return false;

        if (you instanceof Faction) {
            if (me instanceof Faction && mperm.has((Faction) me, fYou)) return true;
            if (me instanceof MPlayer && mperm.has((MPlayer) me, fYou, false)) return true;
        }

        if (server == null) {
            server = new NetworkServerControl(InetAddress.getByName(host), portNumber);
            if (!this.tracingDirectory.trim().equals("")) {
                server.setTraceDirectory(this.tracingDirectory);
            }
        }

        if (workspace == null) {
            return getCatalog().getLayerGroupByName(layerGroupName);
        }

        if (StrgUtils.compareVersion(v, "2.9.3") < 0) {
            LOGGER.info("Performing upgrade tasks to version 2.9.3");
            Path uiProp = Paths.get(Settings.getInstance().getSettingsFolder(), "tmm_ui.prop");
            if (Files.exists(uiProp)) {
                try {
                    FileUtils.moveFile(uiProp.toFile(), new File(Settings.getInstance().getSettingsFolder(), "tmm.prop"));
                } catch (Exception ignored) {
                }
            }
        }

        if (oidcResource.statusCode == 304) {
            return new OidcDiscoveryCachedResource(timeNow, cached);
        } else {
            return new OidcDiscoveryCachedResource(timeNow, Option.of(oidcResource.lastModifiedHeader), Option.of(oidcResource.etagHeader), ImmutableList.copyOf(oidcResource.certs), url, new String(oidcResource.content, StandardCharsets.UTF_8));
        }

        if (!(annotatedType instanceof AnnotatedParameterizedType)) {
            return Collections.emptySet();
        }

        if (core.isReadOnly()) {
            dumpTestInstances();
            return;
        }

        if (pageData.get("required").equals("true")) {
            if (pageData.get("completed").equals("false")) {
                prerequisiteApplies = true;
            }
        }

        if (string.startsWith("::")) {
            globalScope = true;
            string = string.substring(2);
        }

        if (cursor == null) {
            throw new SQLException("Can not query uri " + uri);
        }

        if (k.supportsNormalizedKey()) {
            if (i == 0) {
                inverted = k.invertNormalizedKey();
            } else if (k.invertNormalizedKey() != inverted) {
                break;
            }
            nKeys++;
            final int len = k.getNormalizeKeyLen();
            if (len < 0) {
                throw new RuntimeException("Comparator " + k.getClass().getName() + " specifies an invalid length for the normalized key: " + len);
            }
            this.normalizedKeyLengths[i] = len;
            nKeyLen += len;
            if (nKeyLen < 0) {
                nKeyLen = Integer.MAX_VALUE;
                break;
            }
        } else {
            break;
        }

        if (text != null)
            this.text.setTextColor(Color.argb(0x99, Color.red(textColor), Color.green(textColor), Color.blue(textColor)));

        if (ruleString.contains("Head")) {
            stopIndex = ruleString.indexOf("Head");
        } else if (ruleString.contains("Chorus")) {
            stopIndex = ruleString.indexOf("Chorus");
            String rest = ruleString.substring(stopIndex);
            int firstSpaceIndex = rest.indexOf(" ");
        }

        if (!Objects.equals(attr.isUnique(), updatedAttr.isUnique())) {
            updateUnique(entityType, attr, updatedAttr);
        }

        if (inputMeasure != null) {
            counter.initialize(createMeasureInInitContext(10));
        } else {
            counter.initialize(createNoMeasureInInitContext());
        }

        if (parser != null) {
            return parser;
        }

        if (result == 0) {
            if (!one.getTargetLocale().equals(two.getTargetLocale())) {
                if (one.getTargetLocale().equals(m_targetLocale)) {
                    result = -1;
                } else if (two.getTargetLocale().equals(m_targetLocale)) {
                    result = 1;
                }
            }
            if (result == 0) {
                Timestamp dateOne = one.getTimestamp();
                Timestamp dateTwo = two.getTimestamp();
                if (dateOne.after(dateTwo)) {
                    result = -1;
                } else if (dateOne.before(dateTwo)) {
                    result = 1;
                }
            }
        }

        if (uncachedGlyphs != null) {
            uploadGlyphs(entries, uncachedGlyphs, glyphList, null);
        }

        if (result.getEtag() != null) {
            ResponseHelper.injectEtagHeader(exchange, result.getEtag());
        }

        if ((FDCScheduleTaskInfo) oldIdNewTaskMap.get(dependInfo.getDependTask().getId().toString()) != null)
            dependInfo.setDependTask((FDCScheduleTaskInfo) oldIdNewTaskMap.get(dependInfo.getDependTask().getId().toString()));

        if (cDeleteTempDir != null) {
            cDeleteTempDir.delete();
        }

        if (secondOfMinute == 60) {
            secondOfMinute = 59;
            offset -= 1;
        }

        if (PAYMENTRULE_Cash.equals(getPaymentRule()) && !fromPOS) {
            MCash cash;
            final int posId = Env.getContextAsInt(getCtx(), Env.POS_ID);
            if (posId != 0) {
                final MPOS pos = new MPOS(getCtx(), posId, get_TrxName());
                final int cashBookId = pos.getC_CashBook_ID();
                cash = MCash.get(getCtx(), cashBookId, getDateInvoiced(), get_TrxName());
            } else {
                cash = MCash.get(getCtx(), getAD_Org_ID(), getDateInvoiced(), getC_Currency_ID(), get_TrxName());
            }
            if (cash == null || cash.get_ID() == 0) {
                m_processMsg = "@NoCashBook@";
                return IDocument.STATUS_Invalid;
            }
            final MCashLine cl = new MCashLine(cash);
            cl.setInvoice(this);
            if (!cl.save(get_TrxName())) {
                m_processMsg = "Could not save Cash Journal Line";
                return IDocument.STATUS_Invalid;
            }
            info.append("@C_Cash_ID@: " + cash.getName() + " #" + cl.getLine());
            setC_CashLine_ID(cl.getC_CashLine_ID());
        }

        if (section == null) {
            return null;
        }

        if (line.contains("/7-1/")) {
            if (Validator.isNull(secondaryHeader)) {
                if (headers.get(0).contains(primaryHeader)) {
                    validURL = true;
                }
            } else {
                if (headers.get(0).contains(primaryHeader) && headers.get(1).contains(secondaryHeader)) {
                    validURL = true;
                }
            }
        } else if (checkLegacyLinks && (line.contains("/7-0/") || line.contains("/6-2/"))) {
            String ldnUrl = extractLdnUrl(line, in.getLineNumber(), article);
            validURL = isLdnUrlValid(ldnUrl, article, in.getLineNumber());
        } else {
            validURL = true;
        }

        if (mbr.x1 >= x1s[partitionID] && mbr.x2 <= x2s[partitionID] && mbr.y1 >= y1s[partitionID] && mbr.y2 <= y2s[partitionID])
            return 0;

        if (lastUidState.containsKey(uid) && lastUidState.get(uid) >= updateDate) {
            return;
        }

        if (hasMouseDirection()) {
            mouse3DDirection = new Coords(4);
        } else {
            mouse3DDirection = null;
        }

        if (checkLF(start)) {
            return;
        }

        if (!StringUtils.isEmpty(defaultRealm)) {
            setRules.remove(createDefaultRealmRule(defaultRealm, !caseInsensitiveUser));
            setRules.add(createDefaultRealmRule(defaultRealm, caseInsensitiveUser));
        }

        if (wtype.getAmmoType() == AmmoType.T_AC_ROTARY) {
            weaponHeat *= 6;
        }

        if (offset != 0 && offset == cps1_game_config.mult_result_lo) {
            return (cps1_output.READ_WORD(cps1_game_config.mult_factor1) * cps1_output.READ_WORD(cps1_game_config.mult_factor2)) & 0xffff;
        }

        if (tree.toString().startsWith("<*nullchk*>")) {
            Node expr = scan(tree.getExpression(), p);
            result = extendWithNode(new NullChkNode(tree, expr));
            break;
        }

        if (!r_adjective()) {
            return false;
        }

        if ((wildcardIsLocal && addr.isAnyLocalAddress()) || addr.isLoopbackAddress()) {
            return true;
        }

        if (type == null) {
            LOGGER.debug("Parsing error, field 'type' is missing in the subscription");
            throw new Exception("Parsing error, field 'type' is missing in the subscription");
        }

        if ((classname.toLowerCase().startsWith("html")) && (GuiClassData.classtypeContainsClassType(typeclass, "PushButton"))) {
            Log.debug("GCI: No children sought for HTML PushButtons");
            return;
        }

        if (!logContents.contains("at org.slc.sli.ingestion.util.LogUtilTest.testLogUtil(LogUtilTest.java:56)") || !logContents.contains("at org.slc.sli.ingestion.util.LogUtilTest.testLogUtil(LogUtilTest.java:53)") || !p.matcher(logContents).matches() || !logContents.contains("at org.slc.sli.ingestion.util.LogUtilTest.testLogUtil(LogUtilTest.java:50)")) {
            return false;
        }

        if (!CompoundServiceProvider.isAllowedCombination(field.getKey(), source)) {
            throw new IllegalArgumentException(String.format("Not allowed combination. Key %s and Source %s", field.getKey(), source));
        }

        if (lutMap != null) {
            if (lutMap.containsKey(array_name)) {
                origName = array_name;
                String mappedName = array_name.substring(0, array_name.length() - 3);
                logger.debug("Key: " + array_name + " mapped to: " + mappedName);
                return mappedName;
            }
        }

        if (ConnectorsUtil.getResourceByName(domain.getResources(), ResourceAdapterConfig.class, raName) == null) {
            report.setMessage(localStrings.getLocalString("delete.resource.adapter.config.notfound", "Resource-Adapter-Config for {0} does not exist.", raName));
            report.setActionExitCode(ActionReport.ExitCode.FAILURE);
            return;
        }

        if (info instanceof CoverageInfo) {
            CoverageInfo coverageInfo = ((CoverageInfo) info);
            MetadataMap metadata = coverageInfo.getMetadata();
            boolean directDownloadEnabled = false;
            DirectDownloadSettings settings = DirectDownloadSettings.getSettingsFromMetadata(metadata, GeoServerExtensions.bean(GeoServer.class).getService(CSWInfo.class));
            if (settings != null) {
                directDownloadEnabled = settings.isDirectDownloadEnabled();
            }
            if (directDownloadEnabled) {
                String typeName = recordDescriptor.getFeatureType().getName().getLocalPart();
                customizer = FeatureCustomizer.getCustomizer(typeName);
                if (customizer == null) {
                    if (LOGGER.isLoggable(Level.WARNING)) {
                        LOGGER.warning("No Mapping customizer have been found for " + typeName + ". Mapping customizations will not be made");
                    }
                }
            }
        }

        if (mHasData) {
            mNodeLabels = new String[N];
            mEdgeLabels = new String[pNetwork.getNumEdges()];
            mNodePositions = new double[N][2];
            mVisualStyle = pNetwork.getVisualStyle();
            mZoom = pNetwork.getZoom();
            mCenterX = pNetwork.getCenterX();
            mCenterY = pNetwork.getCenterY();
            mWidth = pNetwork.getWidth();
            mHeight = pNetwork.getHeight();
        }

        if (SingleSourcePlugin.getUIHelper().getUI().equals(UI.RAP)) {
            setEnabled(false);
        }

        if (compress) {
            PFZIPOutputStream zipOut = new PFZIPOutputStream(byteOut);
            targetOut = zipOut;
        } else {
            targetOut = byteOut;
        }

        if (createDoc) {
            final IFolder libFolder = project.getFolder(new Path("doc"));
            if (!libFolder.exists()) {
                libFolder.create(true, true, monitor);
            }
        }

        if (p_M_ShipperTransportation_ID <= 0) {
            throw new FillMandatoryException(I_M_ShipperTransportation.COLUMNNAME_M_ShipperTransportation_ID);
        }

        if (persona instanceof MysticAdept) {
            MysticAdept ma = (MysticAdept) persona;
            assertEquals(1, ma.getBoundFoki().size());
            assertTrue(ma.getBoundFoki().get(0).getFokus().equals(magieFokus));
        } else fail();

        if (boundsRuntime != null) {
            logger.log(ILogger.INFORMATION, Messages.getString("ChartReportItemPresentationImpl.log.getSizeStart"));
            final Size sz = new Size();
            sz.setWidth((float) boundsRuntime.getWidth());
            sz.setHeight((float) boundsRuntime.getHeight());
            sz.setUnit(Size.UNITS_PT);
            logger.log(ILogger.INFORMATION, Messages.getString("ChartReportItemPresentationImpl.log.getSizeEnd"));
            return sz;
        }

        if (id == null) {
            throw new Exception("Parameter (type:" + IdIncasso.class.getName() + ") 'id' is null");
        }

        if (!moveInto) {
            newParent = treeModel.getParent(toNode);
            index = newParent.getChildren().indexOf(toNode) + 1;
        } else {
            newParent = toNode;
            index = 0;
        }

        if (m_criteria.equals(SORTED_BY_DEFAULT)) {
            int s1 = ((Assignment) o1).getPosition();
            int s2 = ((Assignment) o2).getPosition();
            if (s1 == s2) {
                Instant t1 = ((Assignment) o1).getDueDate();
                Instant t2 = ((Assignment) o2).getDueDate();
                if (t1 == null) {
                    result = -1;
                } else if (t2 == null) {
                    result = 1;
                } else {
                    if (t1.equals(t2)) {
                        t1 = ((Assignment) o1).getDateCreated();
                        t2 = ((Assignment) o2).getDateCreated();
                    }
                    if (t1.isBefore(t2)) {
                        result = 1;
                    } else {
                        result = -1;
                    }
                }
            } else if (s1 == 0 && s2 > 0) {
                result = 1;
            } else if (s2 == 0 && s1 > 0) {
                result = -1;
            } else {
                result = (s1 < s2) ? -1 : 1;
            }
        }

        if (pofilterTest.equals("accelerators") && translationFile.getPath().contains("/ja/")) bugIds.add("860084");

        if (request.doc() != null) {
            termVectorsByField = generateTermVectorsFromDoc(indexShard, request);
            if (topLevelFields == null) {
                topLevelFields = termVectorsByField;
            }
            termVectorsResponse.setArtificial(true);
            termVectorsResponse.setExists(true);
        } else if (docIdAndVersion != null) {
            termVectorsByField = docIdAndVersion.reader.getTermVectors(docIdAndVersion.docId);
            Set<String> selectedFields = request.selectedFields();
            if (selectedFields == null && request.perFieldAnalyzer() != null) {
                selectedFields = getFieldsToGenerate(request.perFieldAnalyzer(), termVectorsByField);
            }
            if (selectedFields != null) {
                termVectorsByField = addGeneratedTermVectors(indexShard, get, termVectorsByField, request, selectedFields);
            }
            termVectorsResponse.setDocVersion(docIdAndVersion.version);
            termVectorsResponse.setExists(true);
        } else {
            termVectorsResponse.setExists(false);
        }

        if (priority <= 0 || priority > 0x7FFFFFFFL) {
            throw new IllegalArgumentException("Priority must be between 0 and (2^31 - 1)");
        }

        if (urlString == null) {
            urlString = nextName;
        } else {
            urlString = "";
        }

        if (!replyWithMetaData) {
            writeReply(clientMessage, serverConnection);
        }

        if (object == null) {
            return false;
        }

        if (lastFrameNumber == CaptureCallback.NO_FRAMES_CAPTURED) {
            final CaptureCallbackHolder holder;
            int index = mCaptureCallbackMap.indexOfKey(requestId);
            holder = (index >= 0) ? mCaptureCallbackMap.valueAt(index) : null;
            if (holder != null) {
                mCaptureCallbackMap.removeAt(index);
                if (DEBUG) {
                    Log.v(TAG, String.format("remove holder for requestId %d, " + "because lastFrame is %d.", requestId, lastFrameNumber));
                }
            }
            if (holder != null) {
                if (DEBUG) {
                    Log.v(TAG, "immediately trigger onCaptureSequenceAborted because" + " request did not reach HAL");
                }
                Runnable resultDispatch = new Runnable() {
                    @Override
                    public void run() {
                        if (!CameraDeviceImpl.this.isClosed()) {
                            if (DEBUG) {
                                Log.d(TAG, String.format("early trigger sequence complete for request %d", requestId));
                            }
                            holder.getCallback().onCaptureSequenceAborted(CameraDeviceImpl.this, requestId);
                        }
                    }
                };
                holder.getHandler().post(resultDispatch);
            } else {
                Log.w(TAG, String.format("did not register callback to request %d", requestId));
            }
        } else {
            mRequestLastFrameNumbersList.add(new RequestLastFrameNumbersHolder(requestId, lastFrameNumber));
            checkAndFireSequenceComplete();
        }

        if (result.getStatus().equals("Success") && result.getNullTestPValue() == null) {
            if (result.getpValue() <= AbstractGenotypePhenotypeService.P_VALUE_THRESHOLD) {
                assert (result.getSignificant());
            } else {
                assert (!result.getSignificant());
            }
        }

        if (needsWaitAfterOutputConsumable()) {
            if (attemptId == outputConsumableAttempt && attemptState == TaskAttemptStateInternal.SUCCEEDED) {
                if (outputConsumableAttemptSuccessSent) {
                    return;
                }
            }
        }

        if (nextSibling != null) {
            nextSibling.act();
        }

        if (isCalloutActive() || value == null) return "";

        if (states.containsKey(clusterId) && states.get(clusterId).containsKey(serviceName) && states.get(clusterId).get(serviceName).equals(serviceState)) {
            continue;
        }

        if (acd != null) {
            String proxyOn = acd.lookupValue("proxy_start");
            if (!(proxyOn != null && Boolean.parseBoolean(proxyOn))) {
                return null;
            }
            String proxyRulesFileName = acd.lookupValue("proxy_rules");
            log.info("proxy_rules:" + proxyRulesFileName);
            if (proxyRulesFileName != null) {
                String fullFileName = ApplicationConfigManager.SINGLETON.concatWithEnvVar("conf", proxyRulesFileName);
                log.info("proxy rules filename:" + fullFileName);
                File file = new File(fullFileName);
                if (file.exists()) {
                    log.info("proxy rules filename:" + fullFileName + " exists");
                    try {
                        String json = IOUtil.inputStreamToString(new FileInputStream(file), true);
                        List<InetFilterRule> filters = GSONUtil.fromJSONs(json, Base64Type.DEFAULT, InetFilterRule.class);
                        ifrm.setAll(filters);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    log.info("proxy rules filename:" + fullFileName + "do not exit");
                }
            }
            String proxyPort = acd.lookupValue("proxy_port");
            if (!SharedStringUtil.isEmpty(proxyPort)) {
                try {
                    port = Integer.parseInt(proxyPort);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return null;
        }

        if ((obj = sendCommand("test open 512 1 100 float")) != null) {
            handle = ((Integer) obj).intValue();
        }

        if (saveAnswer()) {
            String feedback;
            try {
                feedback = QuizWidget.this.quiz.getCurrentQuestion().getFeedback(prefs.getString(PrefsActivity.PREF_LANGUAGE, Locale.getDefault().getLanguage()));
                if (!feedback.equals("") && quiz.getShowFeedback() == Quiz.SHOW_FEEDBACK_ALWAYS && !QuizWidget.this.quiz.getCurrentQuestion().getFeedbackDisplayed()) {
                    InputMethodManager imm = (InputMethodManager) QuizWidget.super.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    showFeedback(feedback);
                } else if (QuizWidget.this.quiz.hasNext()) {
                    QuizWidget.this.quiz.moveNext();
                    showQuestion();
                } else {
                    showResults();
                }
            } catch (InvalidQuizException e) {
                e.printStackTrace();
            }
        } else {
            CharSequence text = QuizWidget.super.getActivity().getString(R.string.widget_quiz_noanswergiven);
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(QuizWidget.super.getActivity(), text, duration);
            toast.show();
        }

        if (getNamedGroup() != null) {
            if (isDefault() != false) {
                throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: NamedGroup and Default", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Default", this);
            }
            if (getValue(LEVEL) != null) {
                throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: NamedGroup and Level", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "Level", this);
            }
            if (isNone() != false) {
                throw new org.netbeans.modules.schema2beans.ValidateException("mutually exclusive properties: NamedGroup and None", org.netbeans.modules.schema2beans.ValidateException.FailureType.MUTUALLY_EXCLUSIVE, "None", this);
            }
        }

        if (_factory != null) _factory.recycle(this);

        if (left == right && leftOffset == rightOffset && leftLen == rightLen) {
            return true;
        }

        if (ex.isBanked() && ex.getAddress() == 0x6000 && IMemoryDomain.NAME_CPU.equals(ex.getDomainName())) {
            ex.getProperties().put(MemoryEntryInfo.FILENAME, fileName);
            ex.getProperties().put(MemoryEntryInfo.CLASS, StdMultiBankedMemoryEntry.class);
            ex.getProperties().put(MemoryEntryInfo.OFFSET, fileOffset);
            fetchMD5(module, ex, false);
            found = true;
            info = ex;
            break;
        }

        if (!projectManager.getCurrentProject().getLabel().equals(obj.getProjectLabel())) {
            return false;
        }

        if (!locationUnitConfig.hasPlacementConfig()) {
            throw new NotAvailableException("locationconfig.placementconfig");
        }

        if (keyParameter != null) {
            hashCipher.init(true, keyParameter);
            mainCipher.init(forEncryption, keyParameter);
            KtopInput = null;
        } else if (oldForEncryption != forEncryption) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }

        if (_openedTooltip != null) {
            _openedTooltip.hideNow();
        }

        if ("Catalogue".equalsIgnoreCase(type)) return new CatalogueDocumentParser(this);

        if (left == 0) {
            return 1;
        }

        if (classNames == null || classNames.length == 0 || byteCodes == null || classNames.length != byteCodes.length || referencedClassNames == null || protectionDomain == null)
            throw new IllegalArgumentException();

        if (rateLimiter.isEventOk()) {
            rateLimiter.event();
            message = icpFactory.makeMessage(packet);
            if (logger.isDebug3()) {
                StringBuffer sb = new StringBuffer();
                sb.append("Received the following message: ");
                sb.append(message.toString());
                sb.append(" from ");
                sb.append(message.getUdpAddress());
                sb.append(':');
                sb.append(message.getUdpPort());
                logger.debug3(sb.toString());
            }
            processMessage(message);
        } else {
            logger.debug2("lockssRun: rate limiter");
        }

        if (timeBegin == null && timeEnd == null) {
            timeEnd = new Date();
            timeBegin = new Date(timeEnd.getTime() - period);
            logger.debug("No begin or end is specified, use now as end and now-period as begin.");
        } else if (timeEnd == null) {
            timeEnd = new Date(timeBegin.getTime() + period);
            logger.debug("No end is specified, use begin + period as end.");
        } else if (timeBegin == null) {
            timeBegin = new Date(timeEnd.getTime() - period);
            logger.debug("No begin is specified, use end-period as begin");
        } else if (timeEnd.before(timeBegin)) {
            throw new ServletException("The end is before the begin.");
        }

        if (dlo == null && droppedObject instanceof Dictionary) {
            return true;
        }

        if (perms.get(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED && perms.get(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED && perms.get(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            OpenDialog();
        } else {
            Toast.makeText(AddEmergencyRoomActivity.this, "Some Permission is Denied", Toast.LENGTH_SHORT).show();
        }

        if (pushIf(State.StrSL, State.None, State.Round, State.Square, State.Curly)) {
            return;
        }

        if (checkpoint == null) {
            checkpoint = new OffsetCheckpoint(new File(baseDir, CHECKPOINT_FILE_NAME));
        }

        if (selection instanceof SelectionTourData) {
            final SelectionTourData tourDataSelection = (SelectionTourData) selection;
            tourDataSelection.setSliderValueIndex(_currentLeftSliderValueIndex, _currentRightSliderValueIndex);
        }

        if (extendedIntfSymbolsIgnore.contains(name) || oneInSet(extendedIntfSymbolsIgnore, aliases)) {
            LOG.log(INFO, getASTLocusTag(symbol), "Ignore Intf ignore (one): {0}", symbol);
            return true;
        }

        if (DoubleUtil.isGreater(sp.getDistanceAbs(), this.getDistanceAbs())) {
            return -1;
        }

        if (!stdOut.getParentFile().exists()) {
            stdOut.getParentFile().mkdirs();
        } else {
            stdOut.deleteOnExit();
            stdErr.deleteOnExit();
        }

        if (idOrganismList != null && idOrganismList.size() > 0) {
            this.addLogicalOperator();
            searchText.append(" " + DataTrackIndexHelper.ID_ORGANISM + ":(");
            boolean firstTime = false;
            for (Integer i : idOrganismList) {
                if (!firstTime) {
                    searchText.append(" ");
                }
                firstTime = false;
                searchText.append(i.toString());
            }
            searchText.append(")");
        }

        if (ddrRecord != null) {
            ddrRecord.setTotalCost(totalCost);
            ddrRecord.createOrUpdate();
        }

        if (replication > 1) {
            total_nbits *= replication;
            total_nbytesCDM *= replication;
        }

        if ((localTokens != null) && (localTokens.size() > 0))
            pat.setCoordinates(BoundingBoxCalculator.calculate(localTokens));

        if ("DROP".equals(getCas().getCurrentView().getDocumentText())) {
            return new FinalStep(true);
        }

        if (withRange) {
            if (unsigned) {
                if (min.compareTo(BigInteger.ZERO) == 1) {
                    invalidValues.add(min.subtract(BigInteger.ONE).toString());
                }
                if ((is32Bit && (max.compareTo(MAX_4_BYTE_UNSIGNED_INT) != 0)) || (!is32Bit && !uint64 && (max.compareTo(MAX_UNSIGNED_LONG) != 0)) || (uint64 && (max.compareTo(MAX_UNSIGNED_LONG_64) != 0))) {
                    invalidValues.add(max.add(BigInteger.ONE).toString());
                }
            } else {
                if ((is32Bit && min.compareTo(MIN_4_BYTE_INT) != 0) || (!is32Bit && min.compareTo(MIN_LONG) != 0)) {
                    invalidValues.add(min.subtract(BigInteger.ONE).toString());
                }
                if ((is32Bit && (max.compareTo(MAX_4_BYTE_INT) != 0)) || (!is32Bit && (max.compareTo(MAX_LONG) != 0))) {
                    invalidValues.add(max.add(BigInteger.ONE).toString());
                }
            }
        }

        if (op.equals(rsc.getMessage("button.updateSetting"))) {
            ActionMessages errors = frm.validate(mapping, request);
            if (errors.size() > 0) {
                saveErrors(request, errors);
                frm.setOp("Edit");
            } else {
                sessionContext.getUser().setProperty(frm.getKey(), frm.getValue());
            }
        }

        if ((glpe.getUniversityFiscalPeriodCode() == null) || (glpe.getUniversityFiscalYear() == null)) {
            UniversityDate ud = universityDateService.getCurrentUniversityDate();
            glpe.setUniversityFiscalYear(ud.getUniversityFiscalYear());
            glpe.setUniversityFiscalPeriodCode(ud.getUniversityFiscalAccountingPeriod());
        }

        if (!hasPermission(userManager, user, Type.ADMIN)) {
            params.remove(ExecutionOptions.FLOW_PRIORITY);
            params.remove(ExecutionOptions.USE_EXECUTOR);
        } else {
            validateIntegerParam(params, ExecutionOptions.FLOW_PRIORITY);
            validateIntegerParam(params, ExecutionOptions.USE_EXECUTOR);
        }

        if (graphicTrajectory && !graphicTrajectoryAll) buffer.addSupprimable(current);

        if (formatBuffer.isEmpty()) {
            formatBuffer.add(rtf);
        } else {
            int lastIndex = formatBuffer.size() - 1;
            final RichTextFormat lastRtf = formatBuffer.get(lastIndex);
            if (lastRtf.getPosition() == rtf.getPosition()) {
                formatBuffer.set(lastIndex, rtf);
            } else if (lastRtf.getFont().equals(rtf.getFont()) == false) {
                formatBuffer.add(rtf);
            }
        }

        if ((fontFamily != null) || (fontSize != -1) || (fontStyle != -1) || (fontWeight != -1)) {
            setFontRecursive(htmlC, ui, fontFamily, fontSize, fontStyle, fontWeight, selector);
        }

        if (beans == null || beans.isEmpty()) {
            return Optional.empty();
        }

        if (name.equals(ImageMosaicFormat.INTERPOLATION.getName())) {
            final Object value = param.getValue();
            if (value == null) return;
            interpolation = (Interpolation) value;
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.fine("Requested interpolation: " + interpolation);
            }
            return;
        }

        if (pofilterTest.equals("newlines") && (translationFile.getPath().contains("/te/"))) {
            bugIds.add("888010");
        }

        if (message.getChangeType() == ChangeType.DELETE) {
            continue;
        }

        if (!settings.getProperty(PluginSettings.ENABLE_PERMISSION_CHECK)) {
            return false;
        }

        if (param.primary()) {
            bw.write(PRIMARY_ELEMENT);
            bw.write(": true");
            bw.newLine();
        }

        if (wb.getNumberOfSheets() == 0) {
            wb.createSheet("Overview");
        }

        if (dx > size / 2) {
            p.x += size - dx;
        } else {
            p.x -= dx;
        }

        if (oi instanceof ListObjectInspector) {
            ListObjectInspector loi = (ListObjectInspector) oi;
            initAvroObjectInspector(loi.getListElementObjectInspector());
            return;
        }

        if (startAdjusting) startAdjusting = false;

        if (maxDataLengthThroughIPC > 0) {
            config.setBoolean(IS_MAX_IPC_DATA_SET_BY_USER, true);
            config.setInt(EXCEED_IPC_DATA_LIMIT, exceedDataLimit);
            int payloadSize;
            payloadSize = (((maxDataLengthThroughIPC * 1024 * 1024) + (exceedDataLimit * 1024 * 1024)) / NO_OF_VERTICES);
            String payload = RandomStringUtils.randomAlphanumeric(payloadSize);
            config.set(IPC_PAYLOAD, payload);
        }

        if (isType(sym) && (sitesym == null || !sitesym.kind.matches(KindSelector.TYP_PCK))) {
            tree.type = check(tree.selected, pt(), sitesym == null ? KindSelector.VAL : sitesym.kind.toSelector(), new ResultInfo(KindSelector.TYP_PCK, pt()));
        }

        if (pointsToSet.extremaOfSetBits(ll, ur)) {
            for (int i = ll.x; i <= ur.x; i++) {
                for (int j = ll.y; j <= ur.y; j++) {
                    if (pointsToSet.get(i, j) != 0) {
                        grid.set(i, j, v);
                    }
                }
            }
        }

        if (propDefns.isEmpty()) {
            return new IPropertyDescriptor[0];
        }

        if (node instanceof IterationNode) {
            ((IterationNode) node).acceptForStepFunction(this);
        }

        if (crs != null && isCRSFlip(crs)) counterClockWise = !counterClockWise;

        if (cc == null) {
            serverUrl = UrlSupport.DEFAULT_BASE_URL;
        } else {
            String ccServerUrl = cc.getBundleContext().getProperty("org.opencastproject.server.url");
            logger.info("configured server url is {}", ccServerUrl);
            if (ccServerUrl == null) {
                serverUrl = UrlSupport.DEFAULT_BASE_URL;
            } else {
                serverUrl = ccServerUrl;
            }
            serviceUrl = (String) cc.getProperties().get(RestConstants.SERVICE_PATH_PROPERTY);
        }

        if (oldDiagonalSSt != -1) {
            MatrixMultiplication(matrixVt1AV1, matrixWinv1, matrixCalc2);
            index = 31;
            for (mask = 1; mask != 0; mask *= 2) {
                matrixCalc2[index] ^= mask;
                index--;
            }
            MatrixMultiplication(matrixWinv2, matrixCalc2, matrixCalc1);
            MatrixMultiplication(matrixCalc1, matrixCalcParenD, matrixF);
            MatrMultBySSt(matrixF, newDiagonalSSt, matrixF);
        }

        if (getType() == HANDLER_TYPE.SP) return;

        if (mapHolders.size() == 2) {
            for (MapHolder mh : mapHolders) {
                if (mh.getMapHolderEmbedded().getStringMap().size() != mh.getId() + 1) {
                    errorMsg += "Wrong getMapHolderEmbedded().getStringMap().size() " + mh.getMapHolderEmbedded().getStringMap().size() + "; expected " + Integer.toString(mh.getId() + 1) + "\n";
                }
                if (mh.getStringMap().size() != mh.getId() + 1) {
                    errorMsg += "Wrong getStringMap().size() " + mh.getStringMap().size() + "; expected " + Integer.toString(mh.getId() + 1) + "\n";
                }
            }
        } else {
            errorMsg += "Wrong mapHolders size";
        }

        if (sHomeCommunityId == null || sHomeCommunityId.length() <= 0) {
            return null;
        }

        if (getContainer().getCurrentPage() == mainPage) {
            if (mainPage.canFinishEarly()) {
                IWizard wizard = mainPage.getSelectedNode().getWizard();
                wizard.setContainer(getContainer());
                return wizard.performFinish();
            }
        }

        if (getStop()) {
            break;
        }

        if ((webMethod != null) && webMethod.exclude()) {
            return true;
        }

        if (nextPatterns.size() == 0) {
            morphemeList.add(new jp.go.nict.langrid.service_1_2.morphologicalanalysis.Morpheme(m.getWord(), m.getLemma(), m.getPartOfSpeech().getExpression()));
            return false;
        }

        if (child instanceof DestructionOccurrenceSpecificationEditPart) {
            EObject destructionOccurence = ((GraphicalEditPart) child).resolveSemanticElement();
            EObject lifeline = lifelineEditPart.resolveSemanticElement();
            if (destructionOccurence instanceof DestructionOccurrenceSpecification && lifeline instanceof Lifeline) {
                for (InteractionFragment occurence : ((Lifeline) lifeline).getCoveredBys()) {
                    if (occurence instanceof DestructionOccurrenceSpecification) {
                        DestructionOccurrenceSpecification currentOccurence = ((DestructionOccurrenceSpecification) occurence);
                        if (destructionOccurence.equals(currentOccurence)) {
                            Rectangle bounds = getAbsoluteBounds((GraphicalEditPart) child);
                            if (!occurrences.containsKey(bounds.getCenter())) {
                                occurrences.put(bounds.getCenter(), new ArrayList<OccurrenceSpecification>(2));
                            }
                            occurrences.get(bounds.getCenter()).add((OccurrenceSpecification) occurence);
                            break;
                        }
                    }
                }
            }
        }

        if (raw == null || (raw instanceof Integer && raw.intValue() == Integer.MIN_VALUE) || (raw instanceof Float && ((Float) raw).isNaN()))
            continue;

        if (writable instanceof BSONWritable) {
            doc = ((BSONWritable) writable).getDoc();
        } else {
            throw new SerDeException(format("%srequires a BSONWritable object, not%s", getClass(), writable.getClass()));
        }

        if (dbProps == null) dbProps = getCachedDbProperties(tc);

        if (end != null && appointment.getStart().after(end)) break;

        if (lastWasBreak > 0) return Math.max(maxWidth, currentRun == null ? 0 : currentRun.length() + pendingIndent);

        if (!st.hasMoreTokens()) {
            break;
        }

        if (debug) log.debug("registering subject [" + webUser.getUsername() + "]");

        if (getRevisionGraph().hasReference(getReferenceIdentifier())) {
            logger.error("The reference name '" + getReferenceIdentifier() + "' is for the graph '" + getRevisionGraph().getGraphName() + "' already in use.");
            throw new IdentifierAlreadyExistsException("The reference name '" + getReferenceIdentifier() + "' is for the graph '" + getRevisionGraph().getGraphName() + "' already in use.");
        }

        if (o1 == o2) {
            return 0;
        }

        if (left instanceof PropertyName && right instanceof PropertyName) {
            throw new IllegalArgumentException("Implicit inner joint predicates not supported");
        }

        if ("Update Note".equals(op)) {
            ActionMessages errors = myForm.validate(mapping, request);
            if (errors.size() > 0) {
                saveErrors(request, errors);
                mapping.findForward("showSolutions");
            } else {
                SolutionBean solutionBean = myForm.getSolutionBean();
                if (solutionBean != null) {
                    Transaction tx = null;
                    try {
                        SolutionDAO dao = new SolutionDAO();
                        org.hibernate.Session hibSession = dao.getSession();
                        if (hibSession.getTransaction() == null || !hibSession.getTransaction().isActive())
                            tx = hibSession.beginTransaction();
                        Solution solution = dao.get(solutionBean.getUniqueId(), hibSession);
                        sessionContext.checkPermission(solution, Right.TimetablesSolutionChangeNote);
                        String note = myForm.getNote();
                        if (note != null && note.length() > 1000) note = note.substring(0, 1000);
                        solutionBean.setNote(note);
                        solution.setNote(note);
                        dao.saveOrUpdate(solution, hibSession);
                        if (tx != null) tx.commit();
                    } catch (Exception e) {
                        if (tx != null) tx.rollback();
                        Debug.error(e);
                    }
                }
            }
        }

        if (CollectionUtils.isNotEmpty(paramList.getPatientTelecom())) {
            for (PRPAMT201306UV02PatientTelecom telcom : paramList.getPatientTelecom()) {
                if (telcom != null) {
                    for (TELExplicit newTelcom : telcom.getValue()) {
                        person.getTelecom().add(newTelcom);
                    }
                }
            }
        }

        if (retval.getStderr() != null) {
            sql.append("stderr = ?, ");
            params.add(retval.getStderr());
        }

        if ((layout.supportsNodeAttributes().size() > 0) || (layout.supportsEdgeAttributes().size() > 0)) {
            super.add(new DynamicLayoutMenu(layout, enableMenuItem, appMgr, tm));
        } else if (layout.supportsSelectedOnly() && someSelected) {
            super.add(new DynamicLayoutMenu(layout, enableMenuItem, appMgr, tm));
        } else {
            super.add(new StaticLayoutMenu(layout, enableMenuItem, appMgr, tm));
        }

        if (style == null) {
            style = getDefaultVisualStyle();
            network2VisualStyleMap.put(nv, style);
        }

        if (!windowLevel) {
            minSlider = new Scrollbar(Scrollbar.HORIZONTAL, sliderRange / 2, 1, 0, sliderRange);
            c.gridy = y++;
            c.insets = new Insets(2, 10, 0, 10);
            gridbag.setConstraints(minSlider, c);
            add(minSlider);
            minSlider.addAdjustmentListener(this);
            minSlider.addKeyListener(ij);
            minSlider.setUnitIncrement(1);
            minSlider.setFocusable(false);
            addLabel("Minimum", null);
        }

        if (!properties.hasProperty(BEZIER_CURVENESS)) {
            properties.putValue(BEZIER_CURVENESS, defaultBezierCurviness);
        }

        if (Utils.isMonkeyRunning()) {
            return false;
        }

        if (tryBlock.getType() == Token.BLOCK && !tryBlock.hasChildren() && !hasFinally) {
            return tryBlock;
        }

        if (this.currentOperationName == null || this.currentOperationName.length() == 0) {
            String message = ENTER_OPERATION_MESSAGE;
            return new Status(IStatus.ERROR, WebServicePlugin.PLUGIN_ID, 0, message, null);
        }

        if (events.size() > 0 && LocalRegistry.isEnrolled(context)) {
            String user = LocalRegistry.getUsername(context);
            String deviceId = LocalRegistry.getDeviceId(context);
            JSONArray jsonArray = new JSONArray();
            for (Event event : events) {
                event.setOwner(user);
                event.setDeviceId(deviceId);
                jsonArray.put(new JSONObject().put("event", event.getEvent()));
            }
            MQTTTransportHandler mqttTransportHandler = AndroidSenseMQTTHandler.getInstance(context);
            if (!mqttTransportHandler.isConnected()) {
                mqttTransportHandler.connect();
            }
            String topic = LocalRegistry.getTenantDomain(context) + "/" + SenseConstants.DEVICE_TYPE + "/" + deviceId + "/data";
            mqttTransportHandler.publishDeviceData(user, deviceId, jsonArray.toString(), topic);
        }

        if (thumbnail.isPresent()) {
            thumbnail.get().close();
        }

        if (scalar.isEmpty()) {
            return new ScalarAnalysis(scalar, true, false, false, true, true, false);
        }

        if (!isThemeInstalled(jetpackSite, themeId)) {
            ThemeModel themeToInstall = new ThemeModel();
            themeToInstall.setThemeId(themeId);
            installTheme(jetpackSite, themeToInstall);
            assertTrue(isThemeInstalled(jetpackSite, themeId));
        }

        if (!it.hasNext()) {
            throw new RuntimeException("Transition timeline is empty!");
        } else {
            previous = current = it.next();
        }

        if (binProps.length != UProperty.BINARY_LIMIT) {
            throw new ICUException("binProps.length!=UProperty.BINARY_LIMIT");
        }

        if (left >= right) {
            if (right >= numedges) {
                break;
            }
            y = edgelist[right].getCurve().getYTop();
            if (y > yrange[0]) {
                finalizeSubCurves(subcurves, chains);
            }
            yrange[0] = y;
        }

        if (sb.length() > 0) {
            Toast.makeText(spinnerStatus.getContext(), sb.toString(), Toast.LENGTH_LONG).show();
            valid = false;
        }

        if (c == null) {
            try {
                c = pcl.loadClass(name);
            } catch (Throwable t) {
                ExceptionUtil.rethrowIfNecessary(t);
                c = findClass(name);
            }
        }

        if (isSubmersibleSubsAllowed(data) && !units.isEmpty() && units.stream().allMatch(Matches.unitIsSub())) {
            if (MoveValidator.enemyDestroyerOnPath(route, player, data)) {
                return result.setErrorReturnResult("Cannot move submarines under destroyers");
            }
        }

        if (Double.compare(this.imageScale, that.imageScale) != 0) return false;

        if (CUSTOM_SCREEN_ROTATION && screenRotationAnimation != null && screenRotationAnimation.hasScreenshot()) {
            if (screenRotationAnimation.setRotationInTransaction(rotation, mFxSession, MAX_ANIMATION_DURATION, mTransitionAnimationScale, displayInfo.logicalWidth, displayInfo.logicalHeight)) {
                scheduleAnimationLocked();
            }
        }

        if (keys[idx] == null) {
            keys[idx] = key;
            values[idx] = value;
            ++items;
            return;
        } else if (keys[idx] == REMOVED) {
            bucket = idx;
        } else if (keys[idx] == key) {
            values[idx] = value;
            return;
        }

        if (ReportStatus.EXPIRED.equals(metaInfo.getStatus()) || existingReportDirIdx++ < offset) {
            continue;
        }

        if (context.enableDepth() == false) {
            println("Can't open the depthMap, maybe the camera is not connected!");
            exit();
            return;
        }

        if (input.length > 0) {
            cr = new CheckResult(CheckResult.TYPE_RESULT_ERROR, BaseMessages.getString(PKG, "LDAPOutputMeta.CheckResult.NoInputExpected"), stepMeta);
        } else {
            cr = new CheckResult(CheckResult.TYPE_RESULT_OK, BaseMessages.getString(PKG, "LDAPOutputMeta.CheckResult.NoInput"), stepMeta);
        }

        if (is_first_step) {
            goal_calls++;
            if (goal.test(gs)) {
                goal_hits++;
                return SCORE_MATE;
            }
        }

        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }

        if (!isTmx) {
            writeTmMatch(osd, jobId, unit);
            writeTerminology(osd, unit);
        }

        if (activeHttp == null) {
            if (checkHttpChannel() == null) {
                return;
            }
        }

        if (e.getX() > p1.getX() && e.getX() < p2.getX() && e.getY() < p1.getY() && e.getY() > (p1.getX() - PX_SELEC)) {
            setCursor(shearXImg);
            setActiveTool(true);
            cornerActive[3] = true;
            return true;
        }

        if (user == null || !user.isAuthentic()) {
            response.add("Unauthorized user!");
            return;
        }

        if (kylinKafkaDependency != null) {
            kylinKafkaDependency = kylinKafkaDependency.replace(":", ",");
            logger.trace("Kafka Dependencies: " + kylinKafkaDependency);
            StringUtil.appendWithSeparator(kylinDependency, kylinKafkaDependency);
        } else {
            logger.debug("No Kafka dependency jar set in the environment, will find them from classpath:");
            try {
                String kafkaClientJarPath = ClassUtil.findContainingJar(Class.forName("org.apache.kafka.clients.consumer.KafkaConsumer"));
                StringUtil.appendWithSeparator(kylinDependency, kafkaClientJarPath);
                logger.debug("kafka jar file: " + kafkaClientJarPath);
            } catch (ClassNotFoundException e) {
                logger.debug("Not found kafka client jar from classpath, it is optional for normal build: " + e);
            }
        }

        if (pattern.equals(DEFAULT_FILTER_TEXT)) {
            searchPattern.setPattern("");
        } else {
            searchPattern.setPattern("*" + pattern);
        }

        if (messages.size() == 0) {
            _sendFirstMessageWhenPosted = true;
        } else {
            Message message = messages.get(0);
            message.send();
            if (message.parameterTypes[0] == File.class) {
                Log.d("debug", "Ludomuse - LudoMuse - Message à base d'un file trop style c'est une grand ligne pour prendre de la place est resortir dans le caca qu'est le debug");
            } else {
                armTimeOut();
            }
        }

        if (columnName == null || (columnName = columnName.trim()).equals("")) {
            throw new SQLException(resBundle.handleGetObject("cachedrowsetimpl.matchcols2").toString());
        } else {
            strMatchColumns.set(0, columnName);
        }

        if (low < 0.f || high < 0.f || signal < 0.f) {
            throw new OperatorException("Negative wavelengths");
        }

        if (!mcastUtils.isLeader(mcastIp)) {
            log.trace("Skip {} due to lack of leadership", mcastIp);
            return;
        }

        if (properties.containsKey(name.toLowerCase(Locale.ENGLISH))) {
            return super.getStringProperty(name);
        }

        if (!initialized_) {
            JsArray<RObject> environmentList = session_.getSessionInfo().getEnvironmentState().environmentList();
            if (environmentList == null || environmentList.length() == 0) {
                refreshViewIfEnabled();
            } else {
                setViewFromEnvironmentList(environmentList);
            }
            initialized_ = true;
        }

        if (!(from instanceof Rule) || !(to instanceof Rule)) {
            return ImmutableMultimap.of();
        }

        if (N < 2) return;

        if (p.getType().isDataType() && !p.getType().isChangeSummaryType()) {
            boolean isSet1 = dataObject1.isSet(p);
            boolean isSet2 = dataObject2.isSet(p);
            if (!isSet1 && !isSet2) {
                return true;
            }
            if (isSet1 && isSet2) {
                Object aProperty1 = dataObject1.get(p);
                Object aProperty2 = dataObject2.get(p);
                if (null == aProperty1) {
                    return aProperty2 == null;
                }
                if (null == aProperty2) {
                    return false;
                }
                return aProperty1.equals(aProperty2);
            }
            return false;
        }

        if (x > node.range.getStartPoint() && x < node.range.getEndPoint()) {
            return true;
        }

        if (includeSyncSettings && b1.size() != b2.size()) {
            return false;
        }

        if (commandLine.hasOption("failover")) {
            return new ServerOptionsProcessorResponse(new FailoverHS2InstanceExecutor(commandLine.getOptionValue("failover")));
        }

        if (in == null) return DEFAULT_OUTPUT_FORMATS;

        if (socketBindingManager != null) {
            if (useUnmanagedBindings) {
                SocketBindingManager.UnnamedBindingRegistry registry = socketBindingManager.getUnnamedRegistry();
                if (bindAddress != null) {
                    final InetSocketAddress boundAddress = serverManagement.getLocalAddress(InetSocketAddress.class);
                    basicManagedBinding = ManagedBinding.Factory.createSimpleManagedBinding("management-http", boundAddress, null);
                    registry.registerBinding(basicManagedBinding);
                }
                if (secureBindAddress != null) {
                    final InetSocketAddress boundAddress = serverManagement.getSecureLocalAddress(InetSocketAddress.class);
                    secureManagedBinding = ManagedBinding.Factory.createSimpleManagedBinding("management-https", boundAddress, null);
                    registry.registerBinding(secureManagedBinding);
                }
            } else {
                SocketBindingManager.NamedManagedBindingRegistry registry = socketBindingManager.getNamedRegistry();
                if (basicBinding != null) {
                    final InetSocketAddress boundAddress = serverManagement.getLocalAddress(InetSocketAddress.class);
                    basicManagedBinding = ManagedBinding.Factory.createSimpleManagedBinding(basicBinding.getName(), boundAddress, null);
                    registry.registerBinding(basicManagedBinding);
                }
                if (secureBinding != null) {
                    final InetSocketAddress boundAddress = serverManagement.getSecureLocalAddress(InetSocketAddress.class);
                    secureManagedBinding = ManagedBinding.Factory.createSimpleManagedBinding(secureBinding.getName(), boundAddress, null);
                    registry.registerBinding(secureManagedBinding);
                }
            }
        }

        if (isValid(topHalf.getType())) {
            topHalf.setData((byte) (topHalf.getData() ^ 0x4));
        }

        if (newInst.classValue() == predictedExemplar.classValue()) {
            predictedExemplar.incrPositiveCount();
        } else {
            predictedExemplar.incrNegativeCount();
            if (predictedExemplar.holds(newInst)) {
                prune(predictedExemplar, newInst);
            }
        }

        if ((xoffs & 7) > 3) xoffs = (xoffs + 7) & ~7;
        else xoffs = xoffs & ~7;

        if (rdioItems != null && !rdioItems.isEmpty()) {
            finalList.add(rdioItems.get(0));
            rdioItems.remove(0);
        }

        if (offset >= v.size()) {
            v.setSize(offset + 1);
        }

        if (p == null) {
            conf.removeAttribute(ATTR_PROJECT_NAME);
        } else {
            conf.setAttribute(ATTR_PROJECT_NAME, p.getName());
        }

        if (ski != null) {
            int rOps = pollWrapper.getEventOps(i);
            if (selectedKeys.contains(ski)) {
                if (ski.channel.translateAndSetReadyOps(rOps, ski)) {
                    numKeysUpdated++;
                }
            } else {
                ski.channel.translateAndSetReadyOps(rOps, ski);
                if ((ski.nioReadyOps() & ski.nioInterestOps()) != 0) {
                    selectedKeys.add(ski);
                    numKeysUpdated++;
                }
            }
        }

        if (!getProjectDefinitionMD5().equals(CollectEarthUtils.getMd5FromFolder(projectFolder)) && validateProjectDefinitionFile(projectPropertiesFile)) {
            localPropertiesService.removeModelVersionName();
            Properties projectProperties = getProjectProperties(projectPropertiesFile);
            applyPropertiesToCollectEarth(projectProperties, projectFolder);
            addToProjectList(projectFolder);
            setProjectDefinitionMD5(projectFolder);
            moveSaikuQueriesToRepository(projectFolder, (String) projectProperties.get("survey_name"));
            success = true;
        }

        if (l_i >= lp_i) {
            pi.put(it, id);
        }

        if (!this.isPostProcessing()) {
            ModelUpdateUtil.handlePrecedentUpdate(getBookSeries(), new RefImpl(this.getBookName(), newname, index));
            ModelUpdateUtil.handlePrecedentUpdate(getBookSeries(), new RefImpl(this.getBookName(), oldname, index));
        }

        if (!block.getStatements().isEmpty()) {
            Parameter[] params = getCallAndMethHeadParameters();
            ClassNode returnType = ClassHelper.DYNAMIC_TYPE;
            if (!returnParameters.isEmpty()) {
                returnType = inferredReturnTypes.get(0);
                if (returnType.equals(VariableScope.OBJECT_CLASS_NODE)) {
                    returnType = ClassHelper.DYNAMIC_TYPE;
                }
            }
            newMethod = new MethodNode(newMethodName, 0, returnType, params, null, block);
            checkStaticModifier();
        }

        if (ttl.Ns().Id_is_ctg()) {
            wiki.Ctg__catpage_mgr().Write_catpage(tmp_bfr, page);
            if (from_html_db)
                page.Db().Html().Html_bry_(Bry_.Add(page.Db().Html().Html_bry(), tmp_bfr.To_bry_and_clear()));
            else page.Html_data().Catpage_data_(tmp_bfr.To_bry_and_clear());
        }

        if ((operation == FolderOperation.MOVE && !messagingController.isMoveCapable(message)) || (operation == FolderOperation.COPY && !messagingController.isCopyCapable(message))) {
            final Toast toast = Toast.makeText(getActivity(), R.string.move_copy_cannot_copy_unsynced_message, Toast.LENGTH_LONG);
            toast.show();
            return false;
        }

        if (network.getNodeCount() == 0) {
            return;
        }

        if (handlers != null) {
            for (Enumeration handlersIterator = handlers.keys(); handlersIterator.hasMoreElements(); ) {
                String subElement = (String) handlersIterator.nextElement();
                if (element.getQName().equals(subElement)) {
                    recordNodeMapping(element.getQName(), handlers.get(subElement));
                    return false;
                }
            }
        }

        if (key.equals(LibraryConstants.LONGITUDE)) {
            String longitudeString = String.valueOf(longitude);
            value = longitudeString;
            jsonObject.put(TAG_VALUE, longitudeString);
        }

        if (started) {
            promptDelivery();
        }

        if (p != 0) {
            int q = geometric.parity() * p;
            if (q > 0) {
                for (int i : centres) {
                    next[i] = current[i] * ANTICLOCKWISE;
                }
            } else if (q < 0) {
                for (int i : centres) {
                    next[i] = current[i] * CLOCKWISE;
                }
            }
            return true;
        }

        if ((!changeSet.isNew()) && descriptor.usesVersionLocking()) {
            if ((session.getCommandManager() != null) && (session.getCommandManager().getCommandConverter() != null)) {
                changeSet.rebuildWriteLockValueFromUserFormat(descriptor, session);
            }
            int difference = descriptor.getOptimisticLockingPolicy().getVersionDifference(changeSet.getInitialWriteLockValue(), original, changeSet.getId(), session);
            if (difference < 0) {
                session.log(SessionLog.FINEST, SessionLog.PROPAGATION, "change_from_remote_server_older_than_current_version", changeSet.getClassName(), changeSet.getId());
                return original;
            } else if (difference > 0) {
                session.log(SessionLog.FINEST, SessionLog.PROPAGATION, "current_version_much_older_than_change_from_remote_server", changeSet.getClassName(), changeSet.getId());
                session.getIdentityMapAccessorInstance().invalidateObject(changeSet.getId(), localClassType);
                return original;
            }
        }

        if (credentials == null) {
            credentials = userService.getUserCredentialsByOpenId(username);
            if (credentials == null) {
                throw new UsernameNotFoundException("Username does not exist");
            }
        }

        if (cardView == null) {
            cardView = (IMapView<E>) searchCard(view, cardId);
        }

        if (crs != null) {
            Set<ReferenceIdentifier> ids = crs.getIdentifiers();
            if (ids != null && ids.size() > 0) {
                NamedIdentifier namedIdent = (NamedIdentifier) ids.iterator().next();
                String csStr = namedIdent.getCodeSpace().toUpperCase();
                if (csStr.equals("EPSG")) {
                    jsonWriter.key("crs");
                    jsonWriter.object();
                    jsonWriter.key("type").value(csStr);
                    jsonWriter.key("properties");
                    jsonWriter.object();
                    jsonWriter.key("code");
                    jsonWriter.value(namedIdent.getCode());
                    jsonWriter.endObject();
                    jsonWriter.endObject();
                }
            }
        }

        if (str3.equals("GAP") && c0.equals("G") && c2.equals("G")) {
            return TacticalLines.PZ;
        }

        if (newEditor != null) {
            final IEditorInput newInput = newEditor.getEditorInput();
            if (newInput != null) {
                if (newInput instanceof FileEditorInput) {
                    final IFile projectFile = ((FileEditorInput) newInput).getFile();
                    final IFeatureProject newProject = CorePlugin.getFeatureProject(projectFile);
                    if ((newProject != null) && !newProject.equals(featureProject)) {
                        setFeatureProject(newProject);
                        isNew = true;
                    }
                }
                final Object[] expandedElements = tree.getExpandedElements();
                tree.setInput(newInput);
                updateTree();
                if ((expandedElements.length > 0) && !isNew) {
                    tree.setExpandedElements(expandedElements);
                } else {
                    tree.expandAll();
                }
            }
        }

        if (!multi_bin) {
            return Compute.getExpectedDamage(cgame, atk, false);
        }

        if (preInsertions.length < codeLength) {
            preInsertions = new Instruction[codeLength];
            replacements = new Instruction[codeLength];
            postInsertions = new Instruction[codeLength];
            deleted = new boolean[codeLength];
        } else {
            Arrays.fill(preInsertions, 0, codeLength, null);
            Arrays.fill(replacements, 0, codeLength, null);
            Arrays.fill(postInsertions, 0, codeLength, null);
            Arrays.fill(deleted, 0, codeLength, false);
        }

        if (operatorType == XMLEXISTS_OP) {
            setType(new DataTypeDescriptor(TypeId.BOOLEAN_ID, true));
        } else {
            setType(DataTypeDescriptor.getBuiltInDataTypeDescriptor(JDBC40Translation.SQLXML));
        }

        if (parent.hasPlug()) {
            return LinkFinderUtil.connectBlocks(child, Block.getBlock(parent.getPlugBlockID()));
        }

        if (entity == null || entity.getCustomerOption().getMerchantStore().getId().intValue() != store.getId().intValue()) {
            resp.setStatusMessage(messages.getMessage("message.unauthorized", locale));
            resp.setStatus(AjaxResponse.RESPONSE_STATUS_FAIURE);
        } else {
            customerOptionSetService.delete(entity);
            resp.setStatus(AjaxResponse.RESPONSE_OPERATION_COMPLETED);
        }

        if (metaAxisService != null) {
            this.setAxisService(ActivateUtils.findService(axisConfig, metaAxisService.getClassName(), metaAxisService.getQNameAsString(), metaAxisService.getExtraName()));
        }

        if (this.isRoot == null) this.isRoot = new SQLLongint();

        if (seLatex) {
            textBottom = boxTop + (boxHeight - selectedDimension.getHeight()) / 2;
        } else {
            textBottom = alignTextToBottom(g2, boxTop, boxHeight, selectedText);
        }

        if (p.values[ip] > maxValue) maxValue = p.values[ip];

        if (node.isRecursive()) {
            return new OverlayImageIcon(img, PLUGIN.getImage(RECURSIVE), OverlayImageIcon.TOP_RIGHT).getImage();
        }

        if (pipelineConfigBean.notifyOnStates != null && !pipelineConfigBean.notifyOnStates.isEmpty() && pipelineConfigBean.webhookConfigs != null && !pipelineConfigBean.webhookConfigs.isEmpty()) {
            WebHookNotifier webHookNotifier = new WebHookNotifier(pipelineId, pipelineTitle, rev, pipelineConfigBean, runtimeInfo, runtimeParameters);
            eventListenerManager.addStateEventListener(webHookNotifier);
        }

        if (sliderFileSystem.isFile(dependencyLibTarGzip) && !args.overwrite) {
            println(String.format("Dependency libs are already uploaded to %s. Use %s " + "if you want to re-upload", dependencyLibTarGzip.toUri(), Arguments.ARG_OVERWRITE));
            return EXIT_SUCCESS;
        }

        if (schedule == null || schedule.isEmpty()) {
            schedule = "auto";
        }

        if (imovelAtualizacaoCadastral.getIdFonteAbastecimento() != null && !imovelAtualizacaoCadastral.getIdFonteAbastecimento().equals("")) {
            arquivoTextoRegistroTipoImovel.append(Util.adicionarZerosEsquedaNumero(2, imovelAtualizacaoCadastral.getIdFonteAbastecimento().toString()));
        } else {
            arquivoTextoRegistroTipoImovel.append("00");
        }

        if (!SOCMessage.isSingleLineAndSafe(n)) throw new IllegalArgumentException("n");

        if (strand != null && strand.equals(si.getStrand()) == false) {
            continue;
        }

        if (parent != null) return new DeltaVisit(parent);

        if (nextId == null) {
            nextId = srManager.flowObjectiveService.allocateNextId();
        }

        if (warningArea == null) {
            return null;
        }

        if (newGroup == null) {
            return null;
        }

        if (photo != null && photo.trim().length() > 0) {
            Element element = vCard.addElement("PHOTO");
            element.addElement("TYPE").setText("image/jpeg");
            element.addElement("BINVAL").setText(photo.trim());
        }

        if (tCExecution == null || object == null) {
            return new MessageEvent(MessageEventEnum.ACTION_FAILED_TYPE);
        }

        if (str == null) {
            testAssert();
        } else {
            a = str;
        }

        if (actualRoles.contains(allowed)) {
            allow = true;
        }

        if (lines[i].getC_SalesRegion_ID() != 0)
            sql.append(" AND h.C_BPartner_Location_ID IN " + "(SELECT C_BPartner_Location_ID FROM C_BPartner_Location WHERE C_SalesRegion_ID=").append(lines[i].getC_SalesRegion_ID()).append(")");

        if (!isLinked(portsContainer, modelPorts)) {
            return true;
        }

        if (Configurations.isClustered(cacheManager.getCacheManagerConfiguration())) {
            defineTopologyCacheConfig(cacheManager);
            if (log.isDebugEnabled())
                log.debugf("Externally facing address is %s:%d", configuration.proxyHost(), configuration.proxyPort());
            addSelfToTopologyView(cacheManager);
        }

        if (c == '\'') parse(ctx, '\'', false);

        if (b.intLen == 1) {
            rem.copyValue(this);
            rem.divideOneWord(b.value[b.offset], quotient);
            return;
        }

        if (camConfig.getRoiProvider() != null) {
            final IROIListener roiListener = new IROIListener.Stub() {
                @Override
                public void roiChanged(ROIEvent evt) {
                    updateServerRois();
                }
            };
            plottingSystem.addRegionListener(new IRegionListener.Stub() {
                @Override
                public void regionsRemoved(RegionEvent evt) {
                    evt.getRegions().stream().forEach(region -> region.removeROIListener(roiListener));
                    updateServerRois();
                }

                @Override
                public void regionRemoved(RegionEvent evt) {
                    evt.getRegion().removeROIListener(roiListener);
                    updateServerRois();
                }

                @Override
                public void regionAdded(RegionEvent evt) {
                    evt.getRegion().addROIListener(roiListener);
                    updateServerRois();
                }

                @Override
                public void regionNameChanged(RegionEvent evt, String oldName) {
                    updateServerRois();
                }
            });
        }

        if (split.length != 2) {
            String message = "Start and End dates are required.";
            LOG.debug(INTERVAL_INVALID.logFormat(apiIntervalQuery, message));
            throw new BadApiRequestException(INTERVAL_INVALID.format(apiIntervalQuery, message));
        }

        if (req.getIssuerDN() != null) {
            String dn = certificateStoreSession.getCADnFromRequest(req);
            if (doLog) {
                ca = caSession.getCA(admin, dn.hashCode());
            } else {
                ca = caSession.getCANoLog(admin, dn.hashCode());
            }
            if (ca == null) {
                if (req.getUsername() != null) {
                    ca = getCAFromUsername(admin, req, doLog);
                    if (log.isDebugEnabled()) {
                        log.debug("Using CA from username: " + req.getUsername());
                    }
                } else {
                    String msg = intres.getLocalizedMessage("createcert.canotfoundissuerusername", dn, "null");
                    throw new CADoesntExistsException(msg);
                }
            }
            if (log.isDebugEnabled()) {
                log.debug("Using CA (from issuerDN) with id: " + ca.getCAId() + " and DN: " + ca.getSubjectDN());
            }
        } else if (req.getUsername() != null) {
            ca = getCAFromUsername(admin, req, doLog);
            if (log.isDebugEnabled()) {
                log.debug("Using CA from username: " + req.getUsername());
            }
        } else {
            throw new CADoesntExistsException(intres.getLocalizedMessage("createcert.canotfoundissuerusername", req.getIssuerDN(), req.getUsername()));
        }

        if (state == GameState.READY) {
            updateKarten(delta);
        }

        if (valorDebitoTotalAtualizadoImovel.compareTo(new BigDecimal("0.00")) == -1) {
            throw new ActionServletException("atencao.imovel.sem.debitos", null, codigoImovel);
        }

        if ((errPage = loadReportData(p_tempFile, p_fileName, taskId, p_reportName)) != null) {
            CATEGORY.error("UploadApi.loadReportData(): " + "Unable to load the upload-file.");
            return errPage;
        }

        if (minutesSinceLastSuccess == -1) {
            String configName = diagnosticsName.replaceAll(INVALID_PROPERTIES_REGEX, "_");
            minutesSinceLastSuccess = GrouperWsConfig.retrieveConfig().propertyValueInt("ws.diagnostic.minutesSinceLastSuccess." + configName, defaultMinutesSinceLastSuccess);
        }

        if (archiveURIs.length == 0) {
            final String msg = MessageFormat.format(logger.getResourceBundle().getString("appclient.noClientsInGroup"), groupFacadeURI);
            throw new UserError(msg);
        }

        if (!bcDocument.isBudgetableDocument()) {
            bcDocument.setCleanupModeActionForceCheck(Boolean.TRUE);
        }

        if (certificateName == null) {
            throw new ApiException("Missing the required parameter 'certificateName' when calling purgeDeletedCertificate(Async)");
        }

        if (!DbUtils.hasColumn(connection, TABLE_NAME, ATTACK)) {
            DbUtils.executeAndClose(connection.prepareStatement("ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + ATTACK + " VARCHAR(32768) DEFAULT ''"));
        }

        if (formLines.size() > 0) {
            for (i = 0; i < formLines.size(); i++) {
                result.append("\n" + ((FormLine) formLines.elementAt(i)).toXML());
            }
        }

        if (of.getBooleanStatus() && of.getIndexStatus() != 0) {
            inner += "  INNER JOIN arr_repis_status rs ON rs.id = rm.id_repis_status \n";
            and += "    AND rs.id = " + Integer.valueOf(of.getListaStatus().get(of.getIndexStatus()).getDescription()) + " \n";
        }

        if (_prerequisites != null) {
            for (Argument dep : _prerequisites)
                if (!dep.valid()) {
                    record._disabledReason = "Not all prerequisite arguments have been supplied: " + dep._name;
                    record._value = null;
                    return;
                }
        }

        if (visitor.isVisitingParentFirst()) {
            visitor.visit(this, sashModel);
        }

        if (atCheck.hasFlag(AmmoType.F_PROTOMECH) && !(entity instanceof Protomech)) {
            continue;
        }

        if (LeftRelay1 != null) {
            LeftRelay1.on();
        }

        if (settings.getConverter().isConvertible(itemIterator.keyType())) {
            writeSimple(currentIndent, ITEM, new StringBuilder(), Object.class, key);
        } else if (key instanceof Bean) {
            writeBean(currentIndent, ITEM, new StringBuilder(), itemIterator.keyType(), (Bean) key);
        } else {
            try {
                writeSimple(currentIndent, ITEM, new StringBuilder(), Object.class, key);
            } catch (RuntimeException ex) {
                throw new IllegalArgumentException("Unable to write map as declared key type is neither a bean nor a simple type: " + itemIterator.keyType().getName(), ex);
            }
        }

        if (ancestor == null) {
            ancestor = moduleConfig.findForwardConfig(ancestorName);
            if (ancestor != null) {
                actionConfig = null;
            }
        }

        if (isVerbose) {
            System.out.println("The following MediaFilters are enabled: ");
            Iterator<String> i = filterFormats.keySet().iterator();
            while (i.hasNext()) {
                String filterName = i.next();
                System.out.println("Full Filter Name: " + filterName);
                String pluginName = null;
                if (filterName.contains(MediaFilterService.FILTER_PLUGIN_SEPARATOR)) {
                    String[] fields = filterName.split(MediaFilterService.FILTER_PLUGIN_SEPARATOR);
                    filterName = fields[0];
                    pluginName = fields[1];
                }
                System.out.println(filterName + (pluginName != null ? " (Plugin: " + pluginName + ")" : ""));
            }
        }

        if (definitions.size() == 1 || allDefinitionsEquivalent(definitions)) {
            if (!argsMayHaveSideEffects(callNode)) {
                Node returned = returnedExpression(firstDefinition);
                if (returned != null) {
                    if (isPropertyTree(returned)) {
                        logger.fine("Inlining property accessor: " + callName);
                        inlinePropertyReturn(parent, callNode, returned);
                    } else if (NodeUtil.isLiteralValue(returned, false) && !NodeUtil.mayHaveSideEffects(callNode.getFirstChild(), compiler)) {
                        logger.fine("Inlining constant accessor: " + callName);
                        inlineConstReturn(parent, callNode, returned);
                    }
                } else if (isEmptyMethod(firstDefinition) && !NodeUtil.mayHaveSideEffects(callNode.getFirstChild(), compiler)) {
                    logger.fine("Inlining empty method: " + callName);
                    inlineEmptyMethod(t, parent, callNode);
                }
            }
        } else {
            logger.fine("Method '" + callName + "' has conflicting definitions.");
        }

        if (e instanceof TransactionException) {
            if (e.getMessage().indexOf("not active") > -1) {
                return new InactiveTransactionException((TransactionException) e);
            }
            if (e.getMessage().indexOf("wrong") > -1) {
                return new InvalidTransactionUsageException((TransactionException) e);
            }
            return new TransactionDataAccessException((TransactionException) e);
        }

        if (!dummyNodeQueue.isEmpty()) {
            smartForConsecutiveDummyNodeRun(dummyNodeQueue, labelDummiesInQueue, topGroup, false, defaultSide);
        }

        if (soTerm.equals("SO:0001833")) {
            return String.format("%-15s", "V_region");
        }

        if (isPhpTypeEqual(phpNamedElement.getType(), (PhpClass) phpNamed)) {
            continue;
        }

        if (objIdsOfNewTerm.contains(oldTermObj.getObjId())) {
            if (replaceFreeTerm) {
                dao.makeTransient(oldTermObj);
                numProcessedObj++;
            }
        } else {
            SearchtermObj newTermObj = oldTermObj;
            if (!replaceFreeTerm) {
                newTermObj = new SearchtermObj();
                newTermObj.setLine(oldTermObj.getLine());
                newTermObj.setObjId(oldTermObj.getObjId());
            }
            newTermObj.setSearchtermId(newSnsTermValue.getId());
            newTermObj.setSearchtermValue(newSnsTermValue);
            dao.makePersistent(newTermObj);
            objIdsOfNewTerm.add(newTermObj.getObjId());
            numProcessedObj++;
        }

        if (muted) {
            fail("There was some sound coming from muted: '" + testeeName + "'");
        }

        if (!isDisplay) break;

        if (this.getEntityWorld().isRemote) {
            this.projectileScale = this.dataManager.get(SCALE);
        }

        if (readerFileSelector.getSelected().length() > 0) {
            if (collectionReaderPanel.isModified()) {
                CasProcessorConfigurationParameterSettings crSettings = CpeDescriptorFactory.produceCasProcessorConfigurationParameterSettings();
                currentCpeDesc.getAllCollectionCollectionReaders()[0].setConfigurationParameterSettings(crSettings);
                createParameterOverrides(crSettings, collectionReaderPanel);
            } else {
                currentCpeDesc.getAllCollectionCollectionReaders()[0].setConfigurationParameterSettings(null);
            }
        }

        if (myDefVarList.size() > 0) {
            for (MathDefVariableDec variableDec : myDefVarList) {
                sb.append(variableDec.asString(indentSize + innerIndentInc, innerIndentInc));
                sb.append("\n");
            }
        }

        if (thread.status == PSP_THREAD_WAITING) {
            if (thread.wait.waitTimeoutAction != null) {
                Scheduler.getInstance().addAction(thread.wait.microTimeTimeout, thread.wait.waitTimeoutAction);
            }
            if (thread.waitType == PSP_WAIT_NONE) {
                log.warn("changeThreadState thread '" + thread.name + "' => PSP_THREAD_WAITING. waitType should NOT be PSP_WAIT_NONE. caller:" + getCallingFunction());
            }
        } else if (thread.isStopped()) {
            if (thread.name.equals(rootThreadName) || thread.name.equals("SceModmgrStart") || thread.name.equals("SceModmgrStop")) {
                thread.doDelete = true;
            }
            if (thread.doDelete) {
                if (thread.doDeleteAction == null) {
                    thread.doDeleteAction = new DeleteThreadAction(thread);
                    Scheduler.getInstance().addAction(0, thread.doDeleteAction);
                }
            }
            onThreadStopped(thread);
        } else if (thread.isReady()) {
            addToReadyThreads(thread, addReadyThreadsFirst);
            thread.waitType = PSP_WAIT_NONE;
            thread.wait.waitTimeoutAction = null;
            thread.wait.waitStateChecker = null;
            thread.wait.onUnblockAction = null;
            thread.doCallbacks = false;
        } else if (thread.isRunning()) {
            if (thread.waitType != PSP_WAIT_NONE && !isIdleThread(thread)) {
                log.error(String.format("changeThreadState thread %s => PSP_THREAD_RUNNING. waitType should be PSP_WAIT_NONE. caller: %s", thread, getCallingFunction()));
            }
        }

        if (out > offset) {
            fBuffer[0] = (byte) b0;
            fOffset = 1;
            return out - offset;
        }

        if (!pair.bndAt[0].isInRing() || pair.bndAt[1].isInRing() || pair.bndAt[2].isInRing()) return false;

        if (children.size() > 0) {
            Element child = children.get(0);
            caption = child.getInnerText();
            command = getCommand(widget, element, widgetId);
        }

        if (proj.getId().equals(topProj.getId())) {
            continue;
        }

        if (this instanceof ComponentProvider) {
            ((ComponentProvider) this).components().stream().filter(component -> component instanceof Updater).forEach(component -> ((Updater) component).update(deltaTime));
        }

        if (fixedValues.length == randomVarInfo.size()) {
            pti.iterate(possibleWorld, getValue(fixedValues));
        } else {
            Set<RandomVariable> freeVariables = SetOps.difference(this.randomVarInfo.keySet(), possibleWorld.keySet());
            Map<RandomVariable, RVInfo> freeVarInfo = new LinkedHashMap<RandomVariable, RVInfo>();
            for (RandomVariable fv : freeVariables) {
                freeVarInfo.put(fv, new RVInfo(fv));
            }
            int[] freeRadixValues = createRadixs(freeVarInfo);
            MixedRadixNumber freeMRN = new MixedRadixNumber(0, freeRadixValues);
            Object fval = null;
            do {
                for (RVInfo freeRVI : freeVarInfo.values()) {
                    fval = freeRVI.getDomainValueAt(freeMRN.getCurrentNumeralValue(freeRVI.getRadixIdx()));
                    possibleWorld.put(freeRVI.getVariable(), fval);
                    tableRadixValues[randomVarInfo.get(freeRVI.getVariable()).getRadixIdx()] = freeRVI.getIdxForDomain(fval);
                }
                pti.iterate(possibleWorld, values[(int) tableMRN.getCurrentValueFor(tableRadixValues)]);
            } while (freeMRN.increment());
        }

        if (version == 4) {
            final StringBuilder str = new StringBuilder();
            str.append(unsignedByteToShort(ref[0]) / 256.0);
            str.append(unsignedByteToShort(ref[1]) / 65536.0);
            str.append(unsignedByteToShort(ref[2]) / 16777216.0);
            str.append(unsignedByteToShort(ref[3]) / 4294967296.0);
            return str.toString();
        }

        if (value.isWeighted()) {
            OlcValSortMethodEnum secondarySortMethod = value.getSortMethod();
            if (secondarySortMethod != null) {
                secondarySortMethodComboViewer.setSelection(new StructuredSelection(secondarySortMethod));
            } else {
                secondarySortMethodComboViewer.setSelection(new StructuredSelection(NONE_OPTION));
            }
        } else {
            secondarySortMethodComboViewer.setSelection(new StructuredSelection(NONE_OPTION));
            secondarySortMethodComboViewer.getControl().setEnabled(false);
        }

        if (nativeProcs != null) {
            int[] pids = Process.getPidsForCommands(nativeProcs);
            if (pids != null) {
                for (int pid : pids) {
                    if (DEBUG_ANR) Slog.d(TAG, "Collecting stacks for native pid " + pid);
                    final long sime = SystemClock.elapsedRealtime();
                    Debug.dumpNativeBacktraceToFile(pid, tracesPath);
                    if (DEBUG_ANR)
                        Slog.d(TAG, "Done with native pid " + pid + " in " + (SystemClock.elapsedRealtime() - sime) + "ms");
                }
            }
        }

        if (this.executionObserver.isCanceled()) {
            throw new InterruptedException();
        }

        if (header != null) {
            header.validate();
        }

        if (i != 0) res[i++] = emptyRow(7);

        if (type instanceof ParameterizedType) {
            final ParameterizedType generic = (ParameterizedType) type;
            if (generic.getActualTypeArguments().length > 0) {
                findTypesIn(type, types);
                for (final Type genType : generic.getActualTypeArguments()) {
                    addType(genType, types);
                }
            }
        }

        if (useOfficialYouTubePlayer(context)) {
            launchOfficialYouTubePlayer(youTubeVideo.getId(), context);
        } else {
            launchCustomYouTubePlayer(youTubeVideo, context);
        }

        if (outputType == null) {
            outputType = ServletUtil.getOutputType(request, searchManager.config().defaultOutputType());
        }

        if (this.currentStep != null && this.currentStep.getAction().equals("#question#")) {
            activeState.setBackStatus(true);
        }

        if (!incomingStarted) {
            Thread.sleep(DUMMY_SOURCE_OPENING_PERIOD);
        } else {
            Thread.sleep(DUMMY_SOURCE_PERIOD);
        }

        if (clientId != null) {
            if (!hasAccessToRegistrar(clientId, user.getUserId())) {
                logger.infofmt("Registrar Console access revoked: %s", clientId);
                session.invalidate();
                return false;
            }
            logger.infofmt("Associating user %s with given registrar %s.", user.getUserId(), clientId);
            return true;
        }

        if (object.valueMapEnumByte != null) {
            for (Map.Entry<EnumType, Byte> item : object.valueMapEnumByte.entrySet()) {
                xmlSerializer.writeStartElement("valueMapEnumByte");
                xmlSerializer.writeStartElement("key");
                xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(item.getKey().toString()));
                xmlSerializer.writeEndElement();
                if (item.getValue() == null) {
                    xmlSerializer.writeEmptyElement("value");
                } else {
                    if (item.getValue() != null) {
                        xmlSerializer.writeStartElement("value");
                        xmlSerializer.writeInt(item.getValue());
                        xmlSerializer.writeEndElement();
                    }
                }
                xmlSerializer.writeEndElement();
            }
        }

        if (anchorExpr instanceof CastExpression) {
            CastExpression cast = (CastExpression) anchorExpr;
            if (RoleTypeBinding.isRoleWithExplicitAnchor(cast.resolvedType))
                anchorBinding = ((RoleTypeBinding) cast.resolvedType)._teamAnchor;
            else anchorExpr = ((CastExpression) anchorExpr).expression;
        }

        if (slot.getHasStack() == false) {
            this.drawTexturedModalRect(x + slot.xPos, y + slot.yPos, u, v, 16, 16);
        }

        if (bounds.intersects(other.getBounds())) {
            if (other instanceof Vehicle) {
                Vehicle otherVehicle = (Vehicle) other;
                return this.vehicleBB.intersects(otherVehicle.vehicleBB);
            } else {
                return this.vehicleBB.intersects(other.getBounds());
            }
        }

        if (!TIMEOUT_ACTION.equals(intent.getAction())) return;

        if (replicaCount == 0) {
            rebalanceStorageSimple(storageNumber, fairBucketsPerNode, underloadedOwners, overloadedOwners);
        } else {
            rebalanceStorageWithReplicas(storageNumber, fairBucketsPerNode, underloadedOwners, overloadedOwners);
        }

        if (numLinked == 0) {
            showUnanchored(req, resp, errors, null);
        } else {
            showUnanchored(req, resp, errors, numLinked + ((numLinked == 1) ? " absence " : " absences ") + "linked.");
        }

        if (localFile == null) {
            long removeBefore = System.currentTimeMillis() - 1000L * ConfigurationEntry.MAX_FILEINFO_DELETED_AGE_SECONDS.getValueInt(getController());
            if (remoteFile.getModifiedDate().getTime() > removeBefore) {
                if (isFine()) {
                    logFine("Taking over deletion file info: " + remoteFile.toDetailString());
                }
                remoteFile = correctFolderInfo(remoteFile);
                store(getMySelf(), remoteFile);
                localFile = getFile(remoteFile);
                removedFiles.add(localFile);
            }
            return;
        }

        if (value instanceof StreamCache) {
            ((StreamCache) value).reset();
        }

        if (admin.isTableEnabled(TABLENAME)) {
            admin.disableTable(TABLENAME);
        }

        if (nonEmpty(line.getGroupOfLines())) {
            writer.write("  <groupsOfLines>\n");
            for (GroupOfLine groupOfLine : line.getGroupOfLines()) {
                writer.write("    <GroupOfLines version=\"" + groupOfLine.getObjectVersion() + "\" id=\"" + modelTranslator.netexId(groupOfLine) + "\"> \n");
                if (isSet(groupOfLine.getName()))
                    writer.write("      <Name>" + toXml(groupOfLine.getName()) + "</Name>\n");
                if (isSet(groupOfLine.getComment()))
                    writer.write("      <Description>" + toXml(groupOfLine.getComment()) + "</Description>\n");
                writer.write("    </GroupOfLines>\n");
            }
            writer.write("  </groupsOfLines>\n");
        }

        if (!dt.equals(binTok)) {
            throw new RuntimeException("Delegation token in job is not same as the token passed in file:" + " tokenInFile=[" + binTok + "], dt=[" + dt + "].");
        }

        if (response.getKeySize() != 0) {
            StaxUtil.writeStartElement(this.writer, WSTrustConstants.PREFIX, WSTrustConstants.KEY_SIZE, WSTrustConstants.BASE_NAMESPACE);
            StaxUtil.writeCharacters(this.writer, Long.toString(response.getKeySize()));
            StaxUtil.writeEndElement(this.writer);
        }

        if (op != null) image = op.filter(image, null);

        if (!(tarray instanceof TypedArrayObject)) {
            throw newTypeError(cx, Messages.Key.SIMDInvalidObject, descriptor.name() + method, Type.of(tarray).toString());
        }

        if (types.size() > 0) {
            for (Iterator<String> i = types.keySet().iterator(); i.hasNext(); ) {
                BibtexEntryType type = types.get(i.next());
                if (type instanceof CustomEntryType) {
                    CustomEntryType tp = (CustomEntryType) type;
                    tp.save(fw);
                    fw.write(Globals.NEWLINE);
                }
            }
        }

        if (direction == DESCENDING) rc = -rc;

        if (0 < end_time && end_time < now) {
            return mtime < end_time;
        }

        if (this.enabledInterfaces.isEmpty() && monitorTask != null) {
            logger.info("monitor() :: No enabled wifi interfaces - shutting down monitor thread");
            stopThread.set(true);
            monitorTask.cancel(true);
            monitorTask = null;
        }

        if ((dist1[0] * dist1[1] > 0.0) && (dist1[0] * dist1[2] > 0.0)) {
            return false;
        }

        if (this.input.getDimension() >= 2) {
            return;
        }

        if (width > totalMainWidth) {
            offsetX = 0;
        } else {
            offsetX = Math.min(totalMainWidth - width, offsetX);
        }

        if (!callbackDone.get() && !readDone && rc == BKException.Code.OK) {
            readCount.incrementAndGet();
            byte[] data = entry.getEntry();
            synchronized (lh) {
                lh.length = entry.getLength() - (long) data.length;
                if (entry.getEntryId() != lh.lastAddPushed + 1) {
                    LOG.error("Unexpected to recovery add entry {} as entry {} for ledger {}.", entry.getEntryId(), (lh.lastAddPushed + 1), lh.getId());
                    rc = BKException.Code.UnexpectedConditionException;
                }
            }
            if (BKException.Code.OK == rc) {
                lh.asyncRecoveryAddEntry(data, 0, data.length, this, null);
                if (entry.getEntryId() == endEntryToRead) {
                    doRecoveryRead();
                }
                return;
            }
        }

        if (!AuthzResolver.isAuthorized(sess, Role.FACILITYADMIN, facility) && !AuthzResolver.isAuthorized(sess, Role.ENGINE)) {
            throw new PrivilegeException(sess, "getAssignedServices");
        }

        if (this.isHarmfulFor(caster, target)) if (getSpell().getSave() != null) {
            SavingThrowEffect st = new SavingThrowEffect(caster, getSpell().getSave(), target);
            st.setTargetNumber(getSpell().getDC(caster));
            st.setDescriptors(getSpell().getDescriptors());
            st.check();
            if (st.isEvaded()) {
                evadedEffect(caster, target, point, ar);
                return SpellActionEffect.EVADED;
            }
            if (st.success()) {
                return partialEffect(caster, target, point, ar);
            }
            if (st.failed()) {
                return fullEffect(caster, target, point, ar);
            }
            return INVALID;
        }

        if (this.queueStack == null) return new HashSet<NewsDB.Record>().iterator();

        if (state > stateLength) {
            throw new AuthLoginException(bundleName, "invalidState", new Object[]{new Integer(state)});
        }

        if (!outputGenerated(outputJTaggerFilename)) {
            continue;
        }

        if (nondeterministicAlts.contains(altI)) {
            if (configuration.semanticContext != SemanticContext.EMPTY_SEMANTIC_CONTEXT) {
                Set<SemanticContext> predSet = altToSetOfContextsMap.get(altI);
                predSet.add(configuration.semanticContext);
            } else {
                nondetAltsWithUncoveredConfiguration.add(altI);
            }
        }

        if (!constraints.permits(SIGNATURE_PRIMITIVE_SET, currSigAlg, currSigAlgParams)) {
            throw new CertPathValidatorException("Algorithm constraints check failed: " + currSigAlg, null, null, -1, BasicReason.ALGORITHM_CONSTRAINED);
        }

        if (authorityXdiEntity != null) {
            ReadOnlyIterator<CloudName> cloudNameIterator = new NotNullIterator<CloudName>(new MappingCloudNameIterator(new MappingRelationTargetXDIAddressIterator(authorityXdiEntity.getContextNode().getRelations(XDIDictionaryConstants.XDI_ADD_IS_REF))));
            this.cloudNames = new IteratorArrayMaker<CloudName>(cloudNameIterator).array(CloudName.class);
        }

        if (Settings.enableWorldGuardRestrictions) {
            if (!WorldGuardHandler.isShopAllowed(creationData.creator, creationData.spawnLocation)) {
                Utils.sendMessage(creationData.creator, Settings.msgShopCreateFail);
                return null;
            }
        }

        if (colecaoRendaTipo == null || colecaoRendaTipo.isEmpty()) {
            throw new ActionServletException("atencao.naocadastrado", null, "tipo de renda");
        }

        if (record != null) {
            if (!this.valueExists(record.getAvd()) && !this.valueExists(record.getSign())) {
                if (this.valueExists(record.getOpd()) || this.valueExists(record.getDatum()) || this.valueExists(record.getAvsNavn()) || this.valueExists(record.getMotNavn()) || this.valueExists(record.getStatus())) {
                } else {
                    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "avd", "systema.skat.admin.sadimport.list.error.null.avdOrSign");
                }
            }
        }

        if (replacedString.contains(TemplateManagerConstants.TEMPLATED_ELEMENT_PATTERN_PREFIX)) {
            throw new TemplateManagerHelperException("No matching replacement found for the value - " + StringUtils.substringBetween(replacedString, TemplateManagerConstants.TEMPLATED_ELEMENT_PATTERN_PREFIX, TemplateManagerConstants.TEMPLATED_ELEMENT_PATTERN_SUFFIX));
        }

        if (SaveReportUtilities.saveReport(context, activeContext, target)) {
            try {
                report.setAttribute(ReportDesignerBoot.DESIGNER_NAMESPACE, ReportDesignerBoot.LAST_FILENAME, attPath);
                final ResourceManager resourceManager = report.getResourceManager();
                final Resource bundleResource = resourceManager.createDirectly(target, DocumentBundle.class);
                final DocumentBundle bundle = (DocumentBundle) bundleResource.getResource();
                final ResourceKey bundleKey = bundle.getBundleKey();
                report.setDefinitionSource(bundleKey);
                report.setContentBase(bundleKey);
                report.setResourceManager(bundle.getResourceManager());
                activeContext.resetChangeTracker();
            } catch (ResourceException e) {
                UncaughtExceptionsModel.getInstance().addException(e);
            }
            return true;
        }

        if (expressions.length <= 0) return "";

        if (BuildUtils.isPrimitive(fld.getTypeName())) {
            mv.visitLdcInsn(Type.getType(BuildUtils.getTypeDescriptor(BuildUtils.box(fld.getTypeName()))));
        } else {
            mv.visitLdcInsn(Type.getType(Type.getDescriptor(fld.getType())));
        }

        if (sistemaParametro != null && sistemaParametro.getIndicadorControleBloqueioSenhaAnterior() != null && sistemaParametro.getIndicadorControleBloqueioSenhaAnterior().compareTo(new Integer(1)) == 0) {
            this.validarBloqueiSenhasAnteriores(usuarioLogado, novaSenha);
        }

        if (peerFd != null) {
            try {
                Os.write(peerFd, ackSignal, 0, 1);
            } catch (Exception e) {
                if (MORE_DEBUG) {
                    Slog.d(TAG, "Exception writing ack: " + e.getMessage());
                }
            }
            try {
                Os.close(peerFd);
            } catch (ErrnoException e) {
                if (MORE_DEBUG) {
                    Slog.d(TAG, "Exception closing socket: " + e.getMessage());
                }
            }
        }

        if (devX < 0 || isPrevInvalid) {
            isPrevInvalid = false;
            graphYPrev = graphY;
            devXPrev = devX;
            devYPrev = devY;
            prevValueIndex = valueIndex;
            valueIndexFirstPoint = valueIndex;
            continue;
        }

        if (sqlConnection != null) {
            if (this.getQueryTimeout() >= 0) {
                sqlConnection.setQueryTimeout(this.getQueryTimeout());
            }
            if (this.getMaxRows() >= 0) {
                sqlConnection.setMaxRows(this.getMaxRows());
            }
            if (this.getReadOnly()) {
                sqlConnection.setReadOnly(true);
            }
        }

        if (view.getElement() instanceof DStylizable) {
            layoutData.setSiriusStyle(EcoreUtil.copy(((DStylizable) view.getElement()).getStyle()));
        }

        if (initialDocsCount == 0) {
            createIndex(nodes, new String[]{SD_TYPE, SD_MAX_REV_TIME_IN_SECS}, new boolean[]{true, true}, false, true);
        } else if (!hasIndex(nodes, SD_TYPE, SD_MAX_REV_TIME_IN_SECS)) {
            if (!builder.getReadOnlyMode()) {
                LOG.warn("Detected an upgrade from Oak version <= 1.6. For optimal " + "Revision GC performance it is recommended to create a " + "sparse compound index for the 'nodes' collection on " + "{_sdType:1, _sdMaxRevTime:1}.");
            }
        }

        if (recordId != poRecordId) {
            return true;
        }

        if (!(o instanceof String)) {
            final CyLayoutAlgorithm newLayout = (CyLayoutAlgorithm) o;
            CyLayoutContext context = newLayout.createLayoutContext();
            TaskFactory provisioner = factoryProvisioner.createFor(wrapWithContext(newLayout, context));
            if (!provisioner.isReady()) {
                throw new IllegalArgumentException("Layout is not fully configured");
            }
            JPanel tunablePanel = taskManager.getConfiguration(provisioner, context);
            if (tunablePanel == null) {
                JOptionPane.showMessageDialog(LayoutSettingsDialog.this, "Can not change setting for this algorithm, because tunable info is not avialable!", "Warning", JOptionPane.WARNING_MESSAGE);
                algorithmPanel.removeAll();
            } else {
                algorithmPanel.removeAll();
                algorithmPanel.add(tunablePanel);
            }
            currentLayout = provisioner;
            LayoutSettingsDialog.this.pack();
        }

        if (isRunWithSecurityManager()) {
            JAXPPolicyManager policyManager = JAXPPolicyManager.getJAXPPolicyManager(true);
            String userdir = getSystemProperty("user.dir");
            policyManager.addPermission(new FilePermission(userdir + "/-", "read,write,delete"));
            String testSrc = System.getProperty("test.src");
            if (testSrc.endsWith("ptests")) testSrc = testSrc.substring(0, testSrc.length() - 7);
            policyManager.addPermission(new FilePermission(testSrc + "/-", "read"));
            policyManager.addPermission(new FilePermission(userdir, "read"));
        }

        if (null != s) {
            l = singletonList(s);
        } else {
            l = emptyList();
        }

        if ((!endpoint.hasUserSpecifiedProtocolBinding()) && (userSpecifiedBinding != null) && (userSpecifiedBinding.length() != 0)) {
            endpoint.setProtocolBinding(userSpecifiedBinding);
        }

        if (Constants.MSSQLSERVER_DATABASE.equals(DAOConfigFactory.getInstance().getDAOFactory(Constants.APPLICATION_NAME).getDataBaseType())) {
            sql.append(Constants.MSSQLSERVER_QRY_DT_CONVERSION_FOR_BARCODE_APPEND_STR);
        }

        if (genomeSequenceFile == null) {
            if (!read.getSpliceConnections().isEmpty()) {
                return true;
            }
        }

        if (numberOfErrors > 0) {
            this.handleProvisioningFailure(numberOfManagementMachines, numberOfErrors, firstCreationException, createdManagementMachines);
        }

        if (httpServletRequest.getParameter("pesquisarUnidadeAtual") != null) {
            retorno = actionMapping.findForward("pesquisarUnidadeAtual");
        }

        if ((bigInt.bitLength() % 8) == 0) {
            startSrc = 1;
            len--;
        }

        if (resource.getMetaModelType() == EMFMetaModelType.Profile) {
            ((EMFTechnologyContextManager) technologyContextManager).registerProfile(resource);
        } else {
            ((EMFTechnologyContextManager) technologyContextManager).registerMetaModel(resource);
        }

        if (query.getDescription() != null) {
            and(EventIndexSchema.DESCRIPTION, query.getDescription(), true);
        }

        if (workbench.saveAll(shellProvider, dialog, filter, confirm)) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
            if (window != null) {
                IWorkbenchPage page = window.getActivePage();
                if (page != null) {
                    IEditorPart[] dirtyEditors = page.getDirtyEditors();
                    if (filter == null) {
                        return (dirtyEditors.length == 0);
                    }
                    for (IEditorPart part : dirtyEditors) {
                        if (filter.select(null, new IWorkbenchPart[]{part})) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        if (tgtCount == 0) {
            return fromIndex;
        }

        if (Services.get(ITourInstanceDAO.class).hasDeliveryDays(tourInstance)) {
            return false;
        }

        if (msgs == null) throw new IOException("got null from read()");

        if ((exception.getMessage() != null)) {
            StringBuffer sb = new StringBuffer(exception.getMessage().length());
            OwsUtils.dumpExceptionMessages(exception, sb, false);
            if (verbose) {
                ByteArrayOutputStream stackTrace = null;
                try {
                    stackTrace = new ByteArrayOutputStream();
                    exception.printStackTrace(new PrintStream(stackTrace));
                    sb.append("\nDetails:\n");
                    sb.append(new String(stackTrace.toByteArray()));
                } finally {
                    IOUtils.closeQuietly(stackTrace);
                }
            }
            json.value(sb.toString());
        }

        if (hierarchicalQueryClause != null) {
            children.add(hierarchicalQueryClause);
        }

        if (MERGETYPE == UNDEFINED) {
            throw new RuntimeException("MERGETYPE UNDEFINED");
        }

        if (error == null) {
            error = e;
        } else {
            e.addSuppressed(error);
            error = e;
        }

        if (index == (filename.length() - 1)) {
            return "";
        }

        if (!returnInOuts.isEmpty()) {
            refreshSelectedHUKeys();
        }

        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }

        if (replicated) {
            InetSocketAddress localReplAddr = (InetSocketAddress) volumeManager.getDBStatus().get("replication.control.address");
            assert (localReplAddr != null);
            dmap.addData(KeyValuePair.newBuilder().setKey("babudbReplAddr").setValue(localReplAddr.getAddress().getHostAddress() + ":" + localReplAddr.getPort()).build());
        }

        if (role.equals(Roles.SENDER)) {
            Message testMessage = TestUtils.createTestMessageOfSize(session, messageSize);
            for (int i = 0; i < this.numMessages; i++) {
                producer.send(testMessage);
                messageCount++;
            }
        }

        if (interactQueries != null && !interactQueries.isEmpty()) {
            initInteraction(true, interactQueries, requestMsg);
        }

        if (r1.length() != r2.length()) {
            throw new TwosComplementSumException();
        }

        if (str.startsWith("\ufeff")) {
            return str.substring(1);
        }

        if (dot < 0.9f) {
            float theta = FastMath.acos(dot);
            float invSinTheta = 1f / FastMath.sin(theta);
            scale0 = FastMath.sin((1 - t) * theta) * invSinTheta;
            scale1 = FastMath.sin((t * theta)) * invSinTheta;
            store.x = (scale0 * q1.x) + (scale1 * q2.x);
            store.y = (scale0 * q1.y) + (scale1 * q2.y);
            store.z = (scale0 * q1.z) + (scale1 * q2.z);
            store.w = (scale0 * q1.w) + (scale1 * q2.w);
        } else {
            store.x = (scale0 * q1.x) + (scale1 * q2.x);
            store.y = (scale0 * q1.y) + (scale1 * q2.y);
            store.z = (scale0 * q1.z) + (scale1 * q2.z);
            store.w = (scale0 * q1.w) + (scale1 * q2.w);
            store.normalizeLocal();
        }

        if (!((BaseStatement) oidStatement).executeWithFlags(QueryExecutor.QUERY_SUPPRESS_BEGIN)) {
            throw new PSQLException(GT.tr("No results were returned by the query."), PSQLState.NO_DATA);
        }

        if (proc.hasAttribute("codelet")) {
            if (!codelets.containsKey(proc)) {
                setCodeletAttribute(proc);
            }
            setCallsiteAttribute(call, getGroupLabel(), getCodeletLabel(proc));
        }

        if (model.logDisplayTableView == null || model.logDisplayTableView.isDisposed()) {
            return;
        }

        if (!inputStream.readNextSentence(vocab)) break;

        if (!sort.equals(AgentSortField.CTIME)) {
            sql.append(", ").append(AgentSortField.CTIME.getSortString("a")).append(" DESC");
        }

        if (result != null) {
            if (pageInfo.dictionaryValueReader == null || !pageInfo.dictionaryValueReader.isDefined()) {
                oprReadState.pageReadPos += (result.getTotalLength() + 4 * result.getNumNonNullValues());
            }
            oprReadState.numPageFieldsProcessed += result.getNumValues();
            oprReadState.batchFieldIndex += result.getNumValues();
        }

        if (activeIcon == null) {
            ProgressIcons.removeProgressIcons(node);
            iconController.addIcon(node, progressIcons[0], 0);
        } else {
            final int iActiveIcon = Integer.parseInt(activeIcon.substring(0, activeIcon.length() - 1));
            if (up) {
                switch (iActiveIcon) {
                    case 0:
                        iconController.addIcon(node, progressIcons[1], 0);
                        break;
                    case 25:
                        iconController.addIcon(node, progressIcons[2], 0);
                        break;
                    case 50:
                        iconController.addIcon(node, progressIcons[3], 0);
                        break;
                    case 75:
                        iconController.addIcon(node, progressIcons[4], 0);
                        if (!progUtil.hasOKIcon(node)) {
                            iconController.addIcon(node, OKIcon, 0);
                        }
                        break;
                    case 100:
                        iconController.addIcon(node, progressIcons[4], 0);
                        iconController.addIcon(node, OKIcon, 0);
                        break;
                    default:
                        break;
                }
            } else {
                switch (iActiveIcon) {
                    case 25:
                        iconController.addIcon(node, progressIcons[0], 0);
                        break;
                    case 50:
                        iconController.addIcon(node, progressIcons[1], 0);
                        break;
                    case 75:
                        iconController.addIcon(node, progressIcons[2], 0);
                        break;
                    case 100:
                        iconController.addIcon(node, progressIcons[3], 0);
                        break;
                    case 0:
                    default:
                        break;
                }
            }
        }

        if (getMaxChance(SecondaryAbility.BLEED) < 1) {
            reason.add("Skills.Swords.Bleed.ChanceMax should be at least 1!");
        }

        if (editor instanceof DTableEditor) {
            try {
                DialectUIManager.INSTANCE.export(dTable, session, absoluteImagePath, new ExportFormat(ExportDocumentFormat.CSV, null), new NullProgressMonitor(), false);
            } catch (CoreException e) {
                fail(e.getMessage());
            }
        } else {
            fail("The editor is not an instance of DTable Editor");
        }

        if (vplexVolumeURIs.isEmpty()) {
            log.info("No volumes specified consistency group.");
            return waitFor;
        }

        if (mFanartCache.inCache(track.getTrackArtistMBID(), String.valueOf(url.hashCode()))) {
            continue;
        }

        if (dataMap.get(uri) != null && !dataMap.get(uri).toString().isEmpty()) {
            doubleSpinner.setValue(Double.parseDouble(dataMap.get(uri).toString()));
        } else {
            doubleSpinner.setValue(0);
        }

        if (icms != null && !icms.equalsIgnoreCase("")) {
            localidadeInserir.setCodigoICMS(Integer.parseInt(icms));
        }

        if (lineOffset < offset) {
            final int len = offset - lineOffset;
            lineText = lineText.substring(len);
            lineOffset += len;
            lineLength -= len;
        }

        if (illuminatedPositions.contains(c)) {
            return ILLUMINATED_LIGHT;
        }

        if (Modifier.isPrivate(f.getModifiers())) {
            if (addPrivate) fields.add(f);
        } else if (Modifier.isStatic(f.getModifiers())) {
            if (addStatic) fields.add(f);
        } else if (f.getName().equals("parent")) {
            if (addParent) fields.add(f);
        } else if (f.getType().getCanonicalName().startsWith(BdsNodeFactory.get().packageName())) {
            if (addNode) fields.add(f);
        } else if (f.getType().isPrimitive() || (f.getType() == String.class)) {
            if (addPrimitive) fields.add(f);
        } else if (f.getType().isArray()) {
            if (addArray) fields.add(f);
        } else if (!f.getType().isPrimitive()) {
            if (addClass) fields.add(f);
        }

        if ((fontSize != null) && (fontSize.trim().length() == 0)) {
            fontSize = null;
        }

        if (zipFile != null) {
            zipFile.close();
            zipFile = null;
        }

        if (config instanceof ConfigServerImpl) {
            pw = PasswordImpl.readFromXML(luceeConfiguration, salt, true);
            if (pw != null) ((ConfigServerImpl) config).setDefaultPassword(pw);
        }

        if ((getInputFormat().attribute(m_AttIndex.getIndex()).numValues() < 2) && (!m_UseMissing)) {
            throw new Exception("Adding noise is not possible:" + "Chosen attribute has less than two values.");
        }

        if (!(ae instanceof Mech)) {
            return new ToHitData(TargetRoll.IMPOSSIBLE, "Only mechs can brush off swarming infantry or iNarc Pods");
        }

        if ("UpperBoundary".equals(name.getLocalPart())) {
            return between.getUpperBoundary();
        }

        if (mustMatchDst) {
            if (offsetInterval.containsWallTime(wallTimeSeconds)) {
                if (this.isDst == -1 || offsetInterval.getIsDst() == this.isDst) {
                    int totalOffsetSeconds = offsetInterval.getTotalOffsetSeconds();
                    int returnValue = checkedSubtract(wallTimeSeconds, totalOffsetSeconds);
                    copyFieldsFromCalendar();
                    this.isDst = offsetInterval.getIsDst();
                    this.gmtOffsetSeconds = totalOffsetSeconds;
                    return returnValue;
                }
            }
        } else {
            if (isDst != offsetInterval.getIsDst()) {
                final int isDstToFind = isDst;
                Integer returnValue = tryOffsetAdjustments(zoneInfo, wallTimeSeconds, offsetInterval, currentTransitionIndex, isDstToFind);
                if (returnValue != null) {
                    return returnValue;
                }
            }
        }

        if (!value) {
            try {
                provider.lock(this);
                if (!super.setReadOnly()) throw new IOException("can't set resource read-only");
            } catch (IOException ioe) {
                return false;
            } finally {
                provider.unlock(this);
            }
            return true;
        }

        if (startKeyValue == null) {
            left_of_start = 0;
        } else {
            SearchParameters sp = new SearchParameters(startKeyValue, ((startSearchOperator == ScanController.GE) ? SearchParameters.POSITION_LEFT_OF_PARTIAL_KEY_MATCH : SearchParameters.POSITION_RIGHT_OF_PARTIAL_KEY_MATCH), template, this, true);
            control_row = ControlRow.get(this, BTree.ROOTPAGEID).search(sp);
            control_row.release();
            control_row = null;
            left_of_start = sp.left_fraction;
        }

        if (ImageJAnalyticsTracker.unknownStatus()) ImageJAnalyticsTracker.showDialog(TITLE, true);

        if (expectedEventsLeft.size() > 0) {
            for (DebuggerEventData.DebugEventData eventData : expectedEventsLeft) {
                if (!isMissedEventAllowed(eventData.eventClass)) {
                    setSuccess(false);
                    log.complain("Expected event was not generated: " + eventData);
                }
            }
        }

        if (lastClickedx != -10000000 && lastClickedy != -10000000) {
            if (lastClickedx >= guiLeft + 42 && lastClickedx < right - 42 && lastClickedy >= bottom - 30 && lastClickedy < bottom - 13) {
                editsearch = true;
                if (searchinput1.equals("0") && searchinput2.length() == 0) {
                    searchinput1 = "";
                }
                lastClickedx = -10000000;
                lastClickedy = -10000000;
                if (lastClickedk == 1) {
                    searchinput1 = "0";
                    searchinput2 = "";
                }
            } else {
                editsearch = false;
                if (searchinput1.length() == 0 && searchinput2.length() == 0) {
                    searchinput1 = "0";
                }
            }
        }

        if (q.getSelect().size() != 1) {
            throw new IllegalArgumentException("Query must return a single column");
        }

        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            MyLocalComponentMetadata decoratedComp = new MyLocalComponentMetadata((BeanMetadata) component);
            decoratedComp.setCacheReturnValues(Boolean.parseBoolean(attr.getValue()));
            return decoratedComp;
        } else if (node instanceof Element) {
            Element element = (Element) node;
            MyLocalComponentMetadata decoratedComp = (MyLocalComponentMetadata) component;
            decoratedComp.setOperation(element.getAttribute("name"));
            return decoratedComp;
        } else {
            throw new RuntimeException("Unhandled node: " + node);
        }

        if (AmmoType.T_NA == weaponType.getAmmoType()) {
            continue;
        }

        if (outFileName != null) outFile = new File(trackFile.getParentFile(), outFileName);

        if (!regex.matcher(tmp[1]).matches()) {
            continue;
        }

        if (spvPointage.getCentre() == null) {
            Combobox combobox = (Combobox) ctx.getBindContext().getComponent().query("#p_centre");
            combobox.setErrorMessage(String.format("Le centre est obligatoire"));
            addErrorMessage(ctx, String.format("[Pointage du %s] Le centre est obligatoire", stringJourDebut));
        }

        if (!characterDAO.hasCharacter(characterName)) {
            admin.sendPrivateText("No player with that name.");
            TransactionPool.get().commit(transaction);
            return;
        }

        if (log.isTraceEnabled()) {
            log.trace("ObjectStateUtils:findOperation(axisCfg): [" + opClassName + "]   [" + opQName.toString() + "]  returning  [null]");
        }

        if (endTag > -1 && endTag + 1 < str.length()) {
            ret.append(str.substring(endTag + 1));
        }

        if (result == null) {
            SOAPEnvelope envelope = messageContext.getEnvelope();
            SOAPFault soapFault;
            SOAPBody soapBody;
            if (envelope != null && (soapBody = envelope.getBody()) != null) {
                if ((soapFault = soapBody.getFault()) != null) {
                    return new AxisFault(soapFault, messageContext);
                }
                if (messageContext.isDoingREST() && soapBody.getFirstElement() != null) {
                    AxisFault fault = new AxisFault(soapBody.getFirstElement().toString());
                    fault.setDetail(soapBody.getFirstElement());
                    return fault;
                }
                if ((messageContext.getProperty(Constants.Configuration.MESSAGE_TYPE) != null) && messageContext.getProperty(Constants.Configuration.MESSAGE_TYPE).equals(HTTPConstants.MEDIA_TYPE_APPLICATION_XML)) {
                    if (soapBody.getFirstElement() != null) {
                        AxisFault fault = new AxisFault(soapBody.getFirstElement().toString());
                        fault.setDetail(soapBody.getFirstElement());
                        return fault;
                    } else {
                        return new AxisFault("application/xml type error received.");
                    }
                }
            }
            throw new IllegalArgumentException("The MessageContext does not have an associated SOAPFault.");
        }

        if (branchDecisioner == 0) {
            return BranchWithinBranchReference.createEntryCallEventForBranch(userSessionIndex, operationId, 0, 0, entryCallSequenceModel, entryTime + 2, listOfbranchTransitionCounterInterior);
        } else if (branchDecisioner == 1) {
            return BranchWithinBranchReference.createEntryCallEventForBranch(userSessionIndex, operationId, 1, 3, entryCallSequenceModel, entryTime + 2, listOfbranchTransitionCounterInterior);
        } else if (branchDecisioner == 2) {
            return BranchWithinBranchReference.createEntryCallEventForBranch(userSessionIndex, operationId, 2, 4, entryCallSequenceModel, entryTime + 2, listOfbranchTransitionCounterInterior);
        } else {
            return entryTime + 2;
        }

        if (idLab != null) {
            this.addWhereOrAnd();
            queryBuf.append(" project.idLab =");
            queryBuf.append(idLab);
        }

        if (storeType != null) {
            pluginOptions.selectPlugin(storeType);
        } else {
            String defaultStore = existingProps.getProperty(DataStorePluginOptions.DEFAULT_PROPERTY_NAMESPACE);
            if (defaultStore != null) {
                try {
                    if (pluginOptions.load(existingProps, DataStorePluginOptions.getStoreNamespace(defaultStore))) {
                        this.storeType = pluginOptions.getType();
                    }
                } catch (ParameterException pe) {
                    LOGGER.warn("Couldn't load default store: " + defaultStore, pe);
                }
            }
        }

        if (props[0] != null) {
            exportMultivalProps = isExportedProp(props[0], elem);
            isSet = true;
        } else {
            if (props[1] != null) {
                exportMultivalProps = isExportedProp(props[1], elem);
                if (!exportMultivalProps && exportInvalidXmlNames) {
                    isSet = true;
                }
            }
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
            root_0 = (GrammarAST) adaptor.nil();
            {
                adaptor.addChild(root_0, (GrammarAST) adaptor.create(ID, RULE_REF160));
            }
            retval.tree = root_0;
        }

        if (operable != null && operable != this) operable.clearCache();

        if (idFuncionario != null && !idFuncionario.trim().equals("")) {
            FiltroFuncionario filtroFuncionario = new FiltroFuncionario();
            filtroFuncionario.adicionarParametro(new ParametroSimples(FiltroFuncionario.ID, idFuncionario));
            Collection colecaoFuncionario = fachada.pesquisar(filtroFuncionario, Funcionario.class.getName());
            if (colecaoFuncionario == null || colecaoFuncionario.isEmpty()) {
                throw new ActionServletException("atencao.pesquisa_inexistente", null, "Funcion�rio");
            } else {
                peloMenosUmParametroInformado = true;
            }
        }

        if (pluginClassName != null) {
            log.info("Initializing authentication plugin: " + pluginClassName);
            authenticationPlugin = new SecurityPluginHolder<>(readVersion(authenticationConfig), getResourceLoader().newInstance(pluginClassName, AuthenticationPlugin.class, null, new Class[]{CoreContainer.class}, new Object[]{this}));
        }

        if (fileSnapshot.isRoot() && fileSnapshot.getType() == FileType.Directory) {
            return new IgnoredPathFileSnapshot(fileSnapshot.getContent());
        }

        if (toTypeVariable == null) {
            return false;
        }

        if ((i < 0) || (i > rowSpec.length))
            throw new IllegalArgumentException("Parameter i is invalid.  i = " + i + ".  Valid range is [0, " + rowSpec.length + "].");

        if (isAdjustingSlider) {
            isAdjustingSlider = false;
            adjustSlider(x, y);
        }

        if (!this.getMyPolly().roles().canAccess(executer, this)) {
            throw new InsufficientRightsException(this);
        }

        if (!imageUrl.contains("gravatar.com")) {
            return PhotonUtils.getPhotonImageUrl(imageUrl, avatarSz, avatarSz);
        }

        if (certs.length > 0) {
            this.certList.setSelectedIndex(0);
            this.sPane.getVerticalScrollBar().setValue(0);
        }

        if (fwTO.revoked()) {
            StringBuilder sb = new StringBuilder();
            sb.append(fwTO.getSrcIp()).append(":reverted:0:0:0:0:").append(fwTO.getId()).append(":");
            String fwRuleEntry = sb.toString();
            toAdd.add(fwRuleEntry);
            continue;
        }

        if (!spells) {
            if ((!startDate.isEmpty() || !endDate.isEmpty()) && checkTimerepresentationIsInterval()) {
                if (startOpen || endOpen) {
                    report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_node_open_interval", id), Issue.Level.WARNING));
                }
                try {
                    node.addInterval(startDate, endDate);
                } catch (Exception e) {
                    report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_node_timeinterval_parseerror", id), Issue.Level.SEVERE));
                }
            } else if (!intervals.isEmpty() && checkTimerepresentationIsInterval()) {
                try {
                    node.addIntervals(intervals);
                } catch (Exception e) {
                    report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_node_timeintervals_parseerror", id), Issue.Level.SEVERE));
                }
            } else if (!timestamp.isEmpty() && checkTimerepresentationIsTimestamp()) {
                try {
                    node.addTimestamp(timestamp);
                } catch (Exception e) {
                    report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_node_timestamp_parseerror", id), Issue.Level.SEVERE));
                }
            } else if (!timestamps.isEmpty() && checkTimerepresentationIsTimestamp()) {
                try {
                    node.addTimestamps(timestamps);
                } catch (Exception e) {
                    report.logIssue(new Issue(NbBundle.getMessage(ImporterGEXF.class, "importerGEXF_error_node_timestamps_parseerror", id), Issue.Level.SEVERE));
                }
            }
        }

        if (ls.isEmpty() || ls.equals("0")) {
            continue;
        }

        if (recipient instanceof String) {
            String s = ((String) recipient).trim();
            s = URISupport.normalizeUri(s);
            return EndpointHelper.resolveExchangePatternFromUrl(s);
        }

        if (weight > other.weight) {
            return -1;
        } else if (weight < other.weight) {
            return 1;
        }

        if (includeModelInPath) {
            String modelName = getModelName(object);
            if (modelName != null) {
                path = new Path(modelName).append(path);
            }
        }

        if (options.errorlog != null) {
            fclose(options.errorlog);
        }

        if (m_Ignored.contains(c)) list = (HashSet) m_Ignored.get(c);
        else list = new HashSet();

        if (StringUtil.isEmpty(storage, true)) return "";

        if (k1.size() != k2.size()) {
            return k1.size() - k2.size();
        }

        if (type.equals("variableStep")) parseVariableStepWigFile();
        else if (type.equals("fixedStep")) {
            graphStyle = 1;
            parseFixedStepWigFile();
        } else if (type.equals("bedGraph")) {
            graphStyle = 1;
            parseBedGraphFile();
        } else USeqUtilities.printExit("Not implemented " + type);

        if (terminal != null) {
            if (CoreBundleActivator.getTraceHandler().isSlotEnabled(0, ITraceIds.TRACE_TERMINALS_LAUNCHER)) {
                CoreBundleActivator.getTraceHandler().trace("Terminal context created: id='" + terminal.getID() + "', PTY type='" + terminal.getPtyType() + "'", 0, ITraceIds.TRACE_TERMINALS_LAUNCHER, IStatus.INFO, getClass());
            }
            terminalContext = terminal;
            if (getStreamsListener() instanceof ITerminalsContextAwareListener) {
                ((ITerminalsContextAwareListener) getStreamsListener()).setTerminalsContext(terminal);
            }
            if (getTerminalsListener() instanceof ITerminalsContextAwareListener) {
                ((ITerminalsContextAwareListener) getTerminalsListener()).setTerminalsContext(terminal);
            }
            TerminalsStateChangeEvent event = createRemoteTerminalsStateChangeEvent(terminal);
            if (event != null) EventManager.getInstance().fireEvent(event);
        }

        if (days == 0 && hours == 0 && minutes == 0) {
            timeDuration = String.format(durationSecondsFormat, seconds);
        } else if (days == 0 && hours == 0) {
            timeDuration = String.format(durationMinutesSecondsFormat, minutes, seconds);
        } else if (days == 0) {
            timeDuration = String.format(durationHoursMinutesSecondsFormat, hours, minutes, seconds);
        } else {
            timeDuration = String.format(durationDaysHoursMinutesSecondsFormat, days, hours, minutes, seconds);
        }

        if (parent instanceof WaterBody) bodyToSurfaceImporter.doImport(waterBoundarySurfaceId, parentId);

        if (eval.isGeoElement() && n.getLabel() == null && !myNode.getOperation().equals(Operation.ELEMENT_OF) && !myNode.getOperation().equals(Operation.IF_ELSE)) {
            switch (myNode.getOperation()) {
                case $VAR_COL:
                case $VAR_ROW:
                case $VAR_ROW_COL:
                    dollarLabelFound = true;
                    break;
                default:
                    GeoElement[] ret = {(GeoElement) eval};
                    return ret;
            }
        }

        if (initializeXFormsDocument)
            produceOutput(pipelineContext, outputName, externalContext, htmlLogger, stage2CacheableState, containingDocument[0], xmlReceiver);

        if (!processCmdLineArgs(args)) {
            printUsageMessage();
            return;
        }

        if (StringUtils.trimToNull(config.getZWayProtocol()) == null) {
            config.setZWayProtocol("http");
        }

        if (StringUtils.isNotBlank(database)) {
            try {
                if (!Hive.get(getSession(sessionid).getHiveConf()).databaseExists(database)) {
                    closeSession(sessionid);
                    log.info("Closed session " + sessionid.getPublicId().toString() + " as db " + database + " does not exist");
                    throw new NotFoundException("Database " + database + " does not exist");
                }
            } catch (Exception e) {
                if (!(e instanceof NotFoundException)) {
                    try {
                        closeSession(sessionid);
                    } catch (LensException e2) {
                        log.error("Error closing session " + sessionid.getPublicId().toString(), e2);
                    }
                    log.error("Error in checking if database exists " + database, e);
                    throw new LensException("Error in checking if database exists" + database, e);
                } else {
                    throw (NotFoundException) e;
                }
            }
            getSession(sessionid).setCurrentDatabase(database);
            log.info("Set database to " + database + " for session " + sessionid.getPublicId());
        }

        if (contentCounter > X509ExtensionUtil.V1_CONTENT_LIMIT) {
            String cause = i18n.tr("Too many content sets for certificate {0}. A newer " + "client may be available to address this problem. " + "See knowledge database https://access.redhat.com/knowledge/node/129003 for more " + "information.", pool.getProductName());
            throw new CertificateSizeException(cause);
        }

        if (proxyBase != null && proxyBase.trim().length() > 0) {
            baseURL.setLength(0);
            baseURL.append(proxyBase);
        }

        if (Platform.getInstance().isPlatform(NotesPlatform.NOTES_PLATFORM)) {
            async = false;
        }

        if ("true".equals(this.filterByDate)) {
            values = EntityUtil.filterByDate(values, true);
        } else if (!"false".equals(this.filterByDate)) {
            ModelEntity modelEntity = delegator.getModelEntity(this.entityName);
            if (modelEntity != null && modelEntity.isField("fromDate") && modelEntity.isField("thruDate")) {
                values = EntityUtil.filterByDate(values, true);
            }
        }

        if (this.isReallyInLava()) {
            this.setOnFireFromLava();
        }

        if (!isValid()) {
            throw new IllegalStateException("The service registration is no longer valid.");
        }

        if (showPassword) {
            passwordText.setEchoChar('\0');
        } else {
            passwordText.setEchoChar('\u2022');
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
            root_0 = (CommonTree) adaptor.nil();
            if (gtype == COMBINED_GRAMMAR && Character.isUpperCase(((rule_scope) rule_stack.peek()).name.charAt(0))) {
                {
                    CommonTree root_1 = (CommonTree) adaptor.nil();
                    root_1 = (CommonTree) adaptor.becomeRoot((CommonTree) adaptor.create(SYNPRED, "=>"), root_1);
                    adaptor.addChild(root_1, stream_block.nextTree());
                    adaptor.addChild(root_0, root_1);
                }
            } else {
                adaptor.addChild(root_0, (CommonTree) adaptor.create(SYN_SEMPRED, "SYN_SEMPRED"));
            }
            retval.tree = root_0;
        }

        if (file.isDirectory()) {
            file = toJar(file);
        }

        if (wms != null) {
            if (WMSInterpolation.Nearest.equals(wms.getInterpolation())) {
                hintsMap.put(JAI.KEY_INTERPOLATION, NN_INTERPOLATION);
                hintsMap.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
            } else if (WMSInterpolation.Bilinear.equals(wms.getInterpolation())) {
                hintsMap.put(JAI.KEY_INTERPOLATION, BIL_INTERPOLATION);
                hintsMap.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            } else if (WMSInterpolation.Bicubic.equals(wms.getInterpolation())) {
                hintsMap.put(JAI.KEY_INTERPOLATION, BIC_INTERPOLATION);
                hintsMap.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            }
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }

        if (curPhaseStart == null) {
            if (initialPhase != cur.getPhaseType()) {
                continue;
            }
            curPhaseStart = initialPhaseStartDate;
        }

        if (eventObject.getLevel().toInt() < Level.INFO.toInt()) {
            return;
        }

        if (System.getProperty("AsyncLogger.WaitStrategy") == null) {
            System.setProperty("AsyncLogger.WaitStrategy", "Yield");
        }

        if (blobStore != null) {
            String cacheProviderClass = gwcConfig.getCacheProviderClass();
            if (!blobStore.getCacheProviders().containsKey(cacheProviderClass)) {
                gwcConfig.setCacheProviderClass(GuavaCacheProvider.class.toString());
                configPersister.save(gwcConfig);
                if (LOGGER.isLoggable(Level.FINEST)) {
                    LOGGER.finest("Unable to find: " + cacheProviderClass + ", used default configuration");
                }
            }
            blobStore.setChanged(gwcConfig, true);
            CacheProvider cache = blobStore.getCache();
            addLayersToNotCache(cache, gwcConfig);
        }

        if (tokenIdx == surfaceEnd) {
            int begin = tokens.get(surfaceBegin).getBegin();
            int end = tokens.get(surfaceEnd).getEnd();
            SurfaceForm surfaceForm = new SurfaceForm(aJCas, begin, end);
            surfaceForm.setValue(surfaceString);
            surfaceForm.addToIndexes();
            surfaceBegin = -1;
            surfaceEnd = -1;
            surfaceString = null;
        }

        if (filter == null || txPtr == null) {
            return MessageFilter.Result.ACCEPT;
        }

        if (!isDocument && changeType.isNewOrChange() && changeType.isAfter()) {
            createMissingInvoiceCandidates(model);
        }

        if (this.getMajorVersion() >= 11) {
            if (!buf.getSQL().contains(" ORDER BY ")) {
                buf.append(" ORDER BY 1 ");
            }
            buf.append(" OFFSET ").append(Long.toString(start)).append(" ROWS ").append(" FETCH NEXT ").append(Long.toString(end - start)).append(" ROWS ONLY ");
        } else {
            super.appendSelectRange(buf, start, end, subselect);
        }

        if (!(valueA.equals(valueB))) {
            Double doubleA = null, doubleB = null;
            if (valueA instanceof Number) {
                doubleA = ((Number) valueA).doubleValue();
            } else if (valueA instanceof String) {
                doubleA = Double.valueOf((String) valueA);
            } else {
                return false;
            }
            if (valueB instanceof Number) {
                doubleB = ((Number) valueB).doubleValue();
            } else if (valueB instanceof String) {
                doubleB = Double.valueOf((String) valueB);
            } else {
                return false;
            }
            if (!doubleA.equals(doubleB)) {
                return false;
            }
        }

        if (distance < 0) {
            return retVal.elements();
        }

        if (source.getSubAggregations().size() == 0) {
            bestCaps.add(getTopEqualCaps(localCaps));
        } else {
            source.getSubAggregations().forEach(sub -> doFindBestJobs(sub, localCaps, bestCaps));
        }

        if (this.state == null || !this.state.equals(state)) {
            this.state = state;
        } else {
            return;
        }

        if (isDescendant(key, resourcePath)) {
            ActiveLock l = locks.get(key);
            if (l.isDeep() || (key.equals(getParentPath(resourcePath)) && !resource.isCollection())) {
                throw new DavException(DavServletResponse.SC_LOCKED, "Resource '" + resource.getResourcePath() + "' already inherits a lock by its collection.");
            }
        } else if (isDescendant(resourcePath, key)) {
            if (lockInfo.isDeep() || isInternalMember(resource, key)) {
                throw new DavException(DavServletResponse.SC_CONFLICT, "Resource '" + resource.getResourcePath() + "' cannot be locked due to a lock present on the member resource '" + key + "'.");
            }
        }

        if (isStatic() && outerClass == null) {
            env.error(where, "static.class", this);
            this.modifiers &= ~M_STATIC;
        }

        if (e.character == SWT.CR) {
            TableItem row = cursor.getRow();
            int column = cursor.getColumn();
            row.setText(column, text.getText());
            text.dispose();
        }

        if (visibility != getVisibility() && visibility == View.INVISIBLE) {
            reset(false);
        }

        if (!data.createNewSheet && meta.getAppendEmpty() > 0 && appendingToSheet) {
            for (int i = 0; i < meta.getAppendEmpty(); i++) {
                openLine();
                if (!data.shiftExistingCells || meta.isAppendLines()) {
                    data.posY++;
                }
            }
        }

        if (null != serviceTemplate.getTopologyTemplate()) {
            this.LOG.debug("Process the Node Templates inside of the Topology Template.");
            for (final TEntityTemplate template : serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate()) {
                if (template instanceof TNodeTemplate) {
                    final TNodeTemplate nodeTemplate = (TNodeTemplate) template;
                    if (null != nodeTemplate.getPolicies()) {
                        this.createAndStorePolicies(csarID, new QName(serviceTemplateID.getNamespaceURI(), nodeTemplate.getId()), nodeTemplate.getPolicies().getPolicy());
                    }
                }
            }
        }

        if (task.getAction() == FTPTask.MK_DIR) {
            RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
            final FTPClient lftp = ftp;
            executeRetryable(h, new Retryable() {
                public void execute() throws IOException {
                    makeRemoteDir(lftp, task.getRemotedir());
                }
            }, task.getRemotedir());
        } else if (task.getAction() == FTPTask.SITE_CMD) {
            RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
            final FTPClient lftp = ftp;
            executeRetryable(h, new Retryable() {
                public void execute() throws IOException {
                    doSiteCommand(lftp, task.getSiteCommand());
                }
            }, "Site Command: " + task.getSiteCommand());
        } else {
            if (task.getRemotedir() != null) {
                task.log("changing the remote directory", Project.MSG_VERBOSE);
                ftp.changeWorkingDirectory(task.getRemotedir());
                if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                    throw new BuildException("could not change remote " + "directory: " + ftp.getReplyString());
                }
            }
            if (task.isNewer() && task.isTimeDiffAuto()) {
                task.setTimeDiffMillis(getTimeDiff(ftp));
            }
            task.log(FTPTask.ACTION_STRS[task.getAction()] + " " + FTPTask.ACTION_TARGET_STRS[task.getAction()]);
            transferFiles(ftp);
        }

        if (this.database.verifyPermissions(sessionID, projectUUID)) {
            returnData.put("date", this.database.getVersionDate(versionUUID));
            returnData.put("status", "OK");
        } else {
            returnData.put("status", "ACCESS_DENIED");
        }

        if (handleViewIntents(getIntent())) {
            finish();
            return;
        }

        if (!isPlanar) {
            resultPlus.setZ(imagePlus.getZ());
            resultPlus.setSlice(imagePlus.getCurrentSlice());
        }

        if (e <= 9) {
            exponent = new char[]{expSign, '0', (char) (e + '0')};
        } else if (e <= 99) {
            exponent = new char[]{expSign, (char) (e / 10 + '0'), (char) (e % 10 + '0')};
        } else {
            char hiExpChar = (char) (e / 100 + '0');
            e %= 100;
            exponent = new char[]{expSign, hiExpChar, (char) (e / 10 + '0'), (char) (e % 10 + '0')};
        }

        if (!valDocEx) throw new Exception("Documentation processing " + "should have thrown and error");

        if (principalAmount != null && !(principalAmount.compareTo(BigDecimal.ZERO) == 0)) {
            totalDebitAmount = totalDebitAmount.add(principalAmount);
            this.helper.createCreditJournalEntryOrReversalForLoan(office, currencyCode, ACCRUAL_ACCOUNTS_FOR_LOAN.LOAN_PORTFOLIO, loanProductId, paymentTypeId, loanId, transactionId, transactionDate, principalAmount, isReversal);
            if (writeOff) {
                this.helper.createDebitJournalEntryOrReversalForLoan(office, currencyCode, ACCRUAL_ACCOUNTS_FOR_LOAN.PRINCIPAL_WRITTEN_OFF.getValue(), loanProductId, paymentTypeId, loanId, transactionId, transactionDate, principalAmount, isReversal);
            }
        }

        if (newLine != null) {
            ViewLifecycle.getHelper().applyDefaultValuesForCollectionLine(collectionGroup, newLine);
        }

        if (mLanguageOnSpacebarFormatType == LanguageOnSpacebarUtils.FORMAT_TYPE_FULL_LOCALE) {
            final String fullText = subtype.getFullDisplayName();
            if (fitsTextIntoWidth(width, fullText, paint)) {
                return fullText;
            }
        }

        if (reserveStyle) {
            Iterator<SColumn> columns = sheet.getColumnIterator();
            while (columns.hasNext()) {
                SColumn column = columns.next();
                if (cellProcessed.contains(column.getIndex())) {
                    continue;
                }
                if (column.getCellStyle(true) != null) {
                    SCell cell = sheet.getCell(r, column.getIndex());
                    ReservedCell rcell = new ReservedCell(cell.getColumnIndex());
                    reservedRow.addCell(rcell);
                    SCellStyle style = cell.getCellStyle(true);
                    rcell.setStyle(style);
                }
            }
        }

        if (notification instanceof SourcedNotification && ((SourcedNotification) notification).getSource() instanceof NewModelWizard) {
            return;
        }

        if (nicModel instanceof BondNetworkInterfaceModel) {
            panel = new BondPanel((BondNetworkInterfaceModel) nicModel, style);
            table.setWidget(0, 0, panel);
        } else {
            panel = new NicPanel<>(nicModel, style);
            table.setWidget(0, 0, panel);
        }

        if (key.equals(Attribute.BOOT_PASSWORD)) {
            AccessFactory af = ((TransactionManager) tc).getAccessManager();
            RawStoreFactory rsf = (RawStoreFactory) findServiceModule(af, RawStoreFactory.MODULE);
            serviceProperties.remove(Attribute.BOOT_PASSWORD);
            value = rsf.changeBootPassword(serviceProperties, value);
            serviceProperties.put(RawStoreFactory.ENCRYPTED_KEY, value);
            return true;
        } else {
            return false;
        }

        if (nodeLevels == null) makeProperHierarchy();

        if (payment == null || payment.getPaymentType().getCollectionType() != PaymentCollectionType.PAYMENT_SERVICE_PROVIDER) {
            return;
        }

        if (Timeout.class.isAssignableFrom(periodic.getEvent().getClass())) {
            Timeout timeout = (Timeout) periodic.getEvent();
            try {
                periodic.setEvent((Timeout) timeout.clone());
            } catch (CloneNotSupportedException ex) {
                LOG.error("{}timeout is not clonable - kompics internal error", logPrefix);
                System.exit(1);
            }
            LOG.debug("{}triggered [periodic] timeout:{}<{}>", new Object[]{logPrefix, timeout.getClass().getName(), timeout.getTimeoutId()});
            trigger(timeout, timer);
        }

        if (moFieldFkBizPartnerIdentityTypeId.getKeyAsIntArray()[0] == SDataConstantsSys.BPSS_TP_BP_IDY_PER) {
            moBizPartner.setBizPartner(moFieldLastName.getString() + ", " + moFieldFirstName.getString());
            moBizPartner.setFirstname(moFieldFirstName.getString());
            moBizPartner.setLastname(moFieldLastName.getString());
            moBizPartner.setAlternativeId(moFieldAlternativeId.getString());
        } else {
            moBizPartner.setBizPartner(moFieldBizPartner.getString());
            moBizPartner.setFirstname("");
            moBizPartner.setLastname("");
            moBizPartner.setAlternativeId("");
        }

        if (t2.getClass() != WildcardTreePattern.class) {
            if (adaptor.getType(t1) != t2.getType()) {
                return false;
            }
            if (t2.hasTextArg && !adaptor.getText(t1).equals(t2.getText())) {
                return false;
            }
        }

        if (maskArray.rank() != 2 || input.size(0) != maskArray.size(0) || input.size(2) != maskArray.size(1)) {
            throw new IllegalStateException("With 3d (time series) input with shape [minibatch, size, sequenceLength]=" + Arrays.toString(input.shape()) + ", expected 2d mask array with shape [minibatch, sequenceLength]." + " Got mask with shape: " + Arrays.toString(maskArray.shape()));
        }

        if (importId != null) {
            long timestampFromImport = -1L;
            if (UUIDUtils.isTimeBased(importId)) {
                timestampFromImport = UUIDUtils.getTimestampInMicros(importId);
            } else if (properties.get(PROPERTY_CREATED) != null) {
                timestampFromImport = getLong(properties.get(PROPERTY_CREATED)) * 1000;
            }
            if (timestampFromImport >= 0) {
                timestamp = timestampFromImport;
            }
        }

        if (type != 0 || fixHeaderField != 0) {
            return false;
        }

        if (mConnections.isEmpty()) {
            return;
        }

        if (results != null && results.length > 0) {
            if (results[0] instanceof IQueryResultSet && ((IQueryResultSet) results[0]).isBeforeFirst()) {
                ((IQueryResultSet) results[0]).next();
            }
            text = String.valueOf(results[0].evaluate(text));
        } else {
            text = String.valueOf(context.evaluate(text));
        }

        if (this.facetMap != null) {
            obj.facetMap = (Map) ((PresentationObjectComponentFacetMap) this.facetMap).clone();
            ((PresentationObjectComponentFacetMap) obj.facetMap).setComponent(obj);
            for (Iterator<String> iter = getFacets().keySet().iterator(); iter.hasNext(); ) {
                String key = iter.next();
                UIComponent component = getFacet(key);
                PresentationObject newObject = null;
                if (component instanceof Script) {
                    Object clone = ((Script) component).clone();
                    if (clone instanceof Script) {
                        newObject = (Script) clone;
                    }
                } else if (component instanceof PresentationObject) {
                    PresentationObject po = (PresentationObject) component;
                    newObject = (PresentationObject) po.clonePermissionChecked(iwc, askForPermission);
                }
                if (newObject != null) {
                    newObject.setParentObject(obj);
                    newObject.setLocation(this.getLocation());
                    obj.getFacets().put(key, newObject);
                }
            }
        }

        if (injectedObjects != null && (selection.length == injectedObjects.length)) {
            boolean allEqual = false;
            final Iterator<Object> currentObjects = Lists.newArrayList(injectedObjects).iterator();
            for (Object o : selection) {
                allEqual |= Iterators.contains(currentObjects, o);
            }
            if (allEqual) {
                return false;
            }
        }

        if (s.length() == 0) {
            WordFinder.getEditorThing(hEditor, new WordFinder.EditorThingHandler() {
                @Override
                public void handle(final EditorThing thing) {
                    if (thing != null && thing.getThing() != null) {
                        String name = thing.getThing().getName();
                        addExpression(hEditor, name);
                    } else {
                        String s = WordFinder.findWord(hEditor.getDocument(), sel.getOffset());
                        if (s.length() > 0) {
                            addExpression(hEditor, s);
                        }
                    }
                }
            });
        } else {
            addExpression(hEditor, s);
        }

        if (highestQueueWithAppsNowRunnable != null) {
            gatherPossiblyRunnableAppLists(highestQueueWithAppsNowRunnable, appsNowMaybeRunnable);
        }

        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
            return (false);
        } else return (true);

        if (ifdpos[0] + 4 > nextSpace) {
            nextSpace = ifdpos[0] + 4;
        }

        if (!jdbcFragments[2].equalsIgnoreCase("thin")) {
            throw new JdbcOracleThinConnectionParsingError(String.format("The Oracle \"thin\" JDBC driver is not being used.\n" + "The third item in the colon-separated JDBC URL must " + "be \"thin\", not \"%s\".", jdbcFragments[2]));
        }

        if (accessPermissions == 0) {
            SigUtils.setMDPPermission(document, signature, 2);
        }

        if (state.backtracking > 0) {
            memoize(input, 111, conditionalOrExpression_StartIndex);
        }

        if (strs[2] != null) {
            writer.writeBoolean(TYPE_REVERSE_ORDER, true);
        }

        if (cmd == null || id == null) {
            return null;
        }

        if (years != null && years.compareTo(maxintAsBigInteger) == 1) {
            throw new UnsupportedOperationException(DatatypeMessageFormatter.formatMessage(null, "TooLarge", new Object[]{this.getClass().getName() + "#compare(Duration duration)" + DatatypeConstants.YEARS.toString(), years.toString()}));
        }

        if (abstractPrimary.size() > 0) {
            abstractResult = StringUtils.join(abstractPrimary, ", ");
        } else {
            if (abstractText.size() > 0) {
                abstractResult = StringUtils.join(abstractText, ", ");
            }
        }

        if (accessToken != null) {
            return accessToken.isExpired() ? INVALID_TOKEN : new TokenState(tokenId);
        }

        if (lhs.whenElapsed < rhs.whenElapsed) {
            return -1;
        } else if (lhs.whenElapsed > rhs.whenElapsed) {
            return 1;
        }

        if (classFileOffset + 2 >= bCodeStream.length) {
            resizeByteArray();
        }

        if (columnLongListRealmList != null) {
            return columnLongListRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.columnLongListIndex, RealmFieldType.INTEGER_LIST);
            columnLongListRealmList = new RealmList<java.lang.Long>(java.lang.Long.class, osList, proxyState.getRealm$realm());
            return columnLongListRealmList;
        }

        if ((type & VERTICAL) != 0) {
            int value = kernel.getXOrigin();
            for (int x = width; --x >= 0; ) {
                for (int y = height; --y >= 0; ) {
                    sumV += value * kernel.getElement(x, y);
                }
                value--;
            }
        }

        if (reqPathAuthenticators != null && !reqPathAuthenticators.isEmpty() && currentStep == 0) {
            FrameworkUtils.getRequestPathBasedSequenceHandler().handle(request, response, context);
        }

        if ((soloTable.isCellSelected(row, THEME_COLUMN)) && (getValueAt(row, THEME_COLUMN) != null) && (getValueAt(row, LENGTH_COLUMN) == null)) {
            addLength(row, col, row);
        }

        if (this.currentElement instanceof RecoveredProvidesStatement) {
            this.lastIgnoredToken = -1;
            this.currentElement = this.currentElement.parent;
            this.restartRecovery = true;
        }

        if (number == 0) return "CERO";

        if (survey.getScheduledDate() != null) {
            CustomTextView schedule = (CustomTextView) rowView.findViewById(R.id.schedule);
            schedule.setText(sdf.format(survey.getScheduledDate()));
        }

        if (exp instanceof VarExp) {
            retVal = true;
        } else if (exp instanceof DotExp) {
            DotExp dotExp = (DotExp) exp;
            List<Exp> dotExpList = dotExp.getSegments();
            retVal = containsReplaceableExp(dotExpList.get(dotExpList.size() - 1));
        } else if (exp instanceof VCVarExp) {
            retVal = containsReplaceableExp(((VCVarExp) exp).getExp());
        }

        if (base_partition != HStoreConstants.NULL_PARTITION_ID && hstore_conf.site.exec_db2_redirects) {
            if (debug.val)
                LOG.debug(String.format("Using embedded base partition from %s request " + "[basePartition=%d]", catalog_proc.getName(), base_partition));
        } else if (this.isSysProc[procId]) {
            if (catalog_proc.getSinglepartition() && catalog_proc.getEverysite() == false && catalog_proc.getPartitionparameter() >= 0) {
                if (debug.val)
                    LOG.debug(String.format("Using PartitionEstimator for %s request", catalog_proc.getName()));
                try {
                    base_partition = this.p_estimator.getBasePartition(catalog_proc, procParams.toArray(), false);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else {
                if (debug.val)
                    LOG.debug(String.format("Using random local partition for %s request", catalog_proc.getName()));
                base_partition = HStoreConstants.NULL_PARTITION_ID;
            }
        } else if (hstore_conf.site.exec_force_localexecution == false) {
            if (procParams.size() < this.expectedParams[procId]) {
                if (debug.val)
                    LOG.warn(String.format("Not enough parameters for %s. Not calculating base partition", catalog_proc.getName()));
            } else {
                if (debug.val)
                    LOG.debug(String.format("Using PartitionEstimator for %s request", catalog_proc.getName()));
                try {
                    base_partition = this.p_estimator.getBasePartition(catalog_proc, procParams.toArray(), false);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        if (item.getFieldName().equals("localidadeInicial") && !item.getString().equals("")) {
            helper.setLocalidadeInicial(item.getString());
            this.pesquisarLocalidade("origem", httpServletRequest);
        }

        if (LayoutSettingsDialog.defaultLayout != null) {
            algorithmSelector.setSelectedItem(defaultLayout);
        }

        if (info.get(ReportDesignHandle.BIDI_ORIENTATION_PROP) instanceof ReportDesignHandle) {
            String newOrientation = ((ReportDesignHandle) info.get(ReportDesignHandle.BIDI_ORIENTATION_PROP)).getBidiOrientation();
            UIUtil.processOrientationChange(newOrientation, getViewer());
            invalidate = true;
        }

        if (!new File(voiceFilePath).exists()) {
            if (!mUpdating.containsKey(voicePath) || !mUpdating.get(voicePath)) {
                mUpdating.put(voicePath, true);
                AsyncHttpClient client = new AsyncHttpClient();
                client.get(voicePath, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        if (statusCode == 200) {
                            BufferedOutputStream bos = null;
                            try {
                                File f = new File(voiceFilePath).getParentFile();
                                if (!f.exists()) {
                                    f.mkdirs();
                                }
                                bos = new BufferedOutputStream(new FileOutputStream(voiceFilePath));
                                bos.write(responseBody);
                                bos.flush();
                                voicePath = voiceFilePath;
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            } finally {
                                mUpdating.put(voicePath, false);
                                if (bos != null) {
                                    try {
                                        bos.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                        mUpdating.put(voicePath, false);
                    }
                });
            }
        } else {
            voicePath = voiceFilePath;
        }

        if (oldValue == null) {
            return aliquot;
        }

        if (clearTransactionRequest != null) {
            FilterReturnCode rc = handleClearTransaction(request, this.service.getState(request), clearTransactionRequest, context);
            return rc;
        }

        if (subDirLoadOrder != null) {
            for (String pattern : subDirLoadOrder) {
                List<File> matchedFiles = matchFiles(subDirFiles, pattern);
                matchedFiles.removeAll(endFiles);
                matchedFiles.removeAll(orderedFiles);
                orderedFiles.addAll(matchedFiles);
            }
        }

        if (!batchParams.isEmpty()) {
            for (Map<String, Object> map : batchParams.values()) {
                List<ParameterSetOperation> params = new ArrayList<ParameterSetOperation>();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    ParameterSetOperation param = new ParameterSetOperation();
                    param.setArgs(new Object[]{entry.getKey(), entry.getValue()});
                    param.setMethod(DUMMY_METHOD);
                    params.add(param);
                }
                queryInfo.getParametersList().add(params);
            }
        } else {
            List<ParameterSetOperation> params = new ArrayList<ParameterSetOperation>();
            for (Map.Entry<String, Object> entry : queryArgs.entrySet()) {
                ParameterSetOperation param = new ParameterSetOperation();
                param.setArgs(new Object[]{entry.getKey(), entry.getValue()});
                param.setMethod(DUMMY_METHOD);
                params.add(param);
            }
            queryInfo.getParametersList().add(params);
        }

        if (response.getStatus() == null) {
            response.setStatus(Status.SUCCESS_OK);
        }

        if ((index = line.indexOf("</REUTERS")) == -1) {
            buffer.append(line).append(' ');
        } else {
            Matcher matcher = EXTRACTION_PATTERN.matcher(buffer);
            while (matcher.find()) {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    if (matcher.group(i) != null) {
                        outBuffer.append(matcher.group(i));
                    }
                }
                outBuffer.append(LINE_SEPARATOR).append(LINE_SEPARATOR);
            }
            String out = outBuffer.toString();
            for (int i = 0; i < META_CHARS_SERIALIZATIONS.length; i++) {
                out = out.replaceAll(META_CHARS_SERIALIZATIONS[i], META_CHARS[i]);
            }
            File outFile = new File(outputDir, sgmFile.getName() + "-" + (docNumber++) + ".txt");
            FileWriter writer = new FileWriter(outFile);
            writer.write(out);
            writer.close();
            outBuffer.setLength(0);
            buffer.setLength(0);
        }

        if ((root.getOutDegree(minNodeInx - 1) != -1) || (root.getOutDegree(0) != -1) || (root.getOutDegree(101) != -1))
            throw new IllegalStateException("not out degree -1");

        if (event.getAuthor().getId().equals(event.getJDA().getSelfUser().getId())) return;

        if (status.getInterpreterThreadState() != null) {
            handler.setInterpreterState(status.getInterpreterThreadState());
        }

        if (dateMatcher.matches()) {
            this.pattern = this.DATE_PATTERN;
            this.matcher = dateMatcher;
        } else if (timeMatcher.matches()) {
            this.pattern = this.TIME_PATTERN;
            this.matcher = timeMatcher;
        } else if (weekDateMatcher.matches()) {
            this.pattern = this.WEEK_DATE_PATTERN;
            this.matcher = weekDateMatcher;
        } else if (weekTimeMatcher.matches()) {
            this.pattern = this.WEEK_TIME_PATTERN;
            this.matcher = weekTimeMatcher;
        } else if (seasonMatcher.matches()) {
            this.pattern = this.SEASON_PATTERN;
            this.matcher = seasonMatcher;
        } else if (partOfYearMatcher.matches()) {
            this.pattern = this.PART_OF_YEAR_PATTERN;
            this.matcher = partOfYearMatcher;
        } else if (referenceMatcher.matches()) {
            this.pattern = this.REFERENCE_PATTERN;
            this.matcher = referenceMatcher;
        }

        if (GrouperInstallerUtils.length(diskStoreDifferences) > 0) {
            hasMerging = true;
            Element existingExampleDiskStoreElement = (Element) existingExampleDocumentElement.getElementsByTagName("diskStore").item(0);
            for (String attributeName : diskStoreDifferences.keySet()) {
                String attributeValue = diskStoreDifferences.get(attributeName);
                existingExampleDiskStoreElement.setAttribute(attributeName, attributeValue);
            }
        }

        if (!wsAttributeDefSaveResults.tallyResults(TX_TYPE, THE_SUMMARY, clientVersion)) {
            grouperTransaction.rollback(GrouperRollbackType.ROLLBACK_NOW);
        }

        if (((fBase.fFacetsDefined & FACET_FRACTIONDIGITS) != 0) && !((fFacetsDefined & FACET_FRACTIONDIGITS) != 0)) {
            fFacetsDefined |= FACET_FRACTIONDIGITS;
            fFractionDigits = fBase.fFractionDigits;
            fractionDigitsAnnotation = fBase.fractionDigitsAnnotation;
        }

        if (getStructureIdentifier() != null) {
            return getStructureIdentifier().getIdentifier();
        }

        if (input != null) {
            viewer.setInput(input);
        }

        if (!runnable.isExecuteAsync()) {
            runnable.run(finId, finTitle, connector, finData, callback);
        } else {
            DisplayUtil.safeAsyncExec(new Runnable() {
                @Override
                public void run() {
                    runnable.run(finId, finTitle, connector, finData, callback);
                }
            });
        }

        if (!(eq_s_b(1, "\u00D1"))) {
            return false;
        }

        if (idRotaFinal != null && !idRotaFinal.equals("")) {
            parametros.put("rotaFinalDescricao", idRotaFinal.toString());
        }

        if (effortArray[0].equals("SOF")) {
            boolean correctForTheFirstTime = true;
            boolean mastered = false;
            for (i = 1; i < goBackTill; i++) {
                if (effortArray[i].equals("SOF")) correctForTheFirstTime = false;
            }
            if (correctForTheFirstTime == true) {
                topicState = "correctForTheFirstTime";
                if (effortArray[1].equals("SHINT")) topicState = "correctForTheFirstTime_goodHelpUsage";
            } else {
                if (masteryArray[0] >= masteryThreshold) {
                    System.out.println("mastered" + masteryArray[0]);
                    if (masteryArray[1] >= masteryThreshold) {
                        topicState = "inMastery";
                    } else {
                        if (masteredTimes == 1) topicState = "justMastered";
                        else if (masteredTimes > 1) topicState = "reMastered";
                    }
                } else {
                    topicState = "inProgress";
                    if (effortArray[1].equals("SHINT")) topicState = "inProgress_goodHelpUsage";
                }
            }
        } else if (masteryArray[0] >= masteryThreshold) topicState = "inMastery";
        else if (effortArray[0].equals("SHINT")) {
            topicState = "SHINT";
        } else if (effortArray[0].equals("ATT")) {
            if (problemDifficult == true) topicState = "ATT_hardProblem";
        } else if (effortArray[0].equals("GUESS") || effortArray[0].equals("BOTTOMOUT")) {
            checkIfProblematicLearningTrend(conn);
        } else if (effortArray[0].equals("GIVEUP")) {
            topicState = "GIVEUP";
            checkIfProblematicLearningTrend(conn);
        } else if (effortArray[0].equals("NOTR")) {
            topicState = "NOTR";
            checkIfProblematicLearningTrend(conn);
        }

        if (cursor == null) {
            cursor = StendhalCursor.WALK;
            StaticGameLayers layers = ground.getClient().getStaticGameLayers();
            if ((layers.getCollisionDetection() != null) && layers.getCollisionDetection().collides((int) point2.getX(), (int) point2.getY())) {
                cursor = StendhalCursor.STOP;
            } else if (ground.calculateZoneChangeDirection(point2) != null) {
                cursor = StendhalCursor.WALK_BORDER;
            }
        }

        if (InstanceWriter.class.isAssignableFrom(providerType)) {
            return getFactory("instanceFile");
        } else {
            return getFactory("file");
        }

        if (record.getParameter().getAbbreviation().endsWith("hr") && !record.getParameter().getAbbreviation().endsWith("1hr")) {
            return new GridRecord[]{};
        }

        if (mymodel != null) {
            mymodel.delete_xval_models();
            mymodel.delete_best_model();
            mymodel.delete();
        }

        if (selector.getCriterion(Type.TUNNEL_ID) != null && (selector.getCriterion(Type.ETH_DST) != null || selector.getCriterion(Type.ETH_SRC) != null)) {
            forTable = MAC_TABLE;
            return reassemblyFlowRule(ruleBuilder, tb, transition, forTable);
        }

        if (this.configuration.getOutCharEncoding() == Configuration.ASCII && (c > 126 || (c < ' ' && c != '\t'))) {
            if (!this.configuration.numEntities) {
                entity = EntityTable.getDefaultEntityTable().entityName((short) c);
                if (entity != null) {
                    entity = "&" + entity + ";";
                } else {
                    entity = "&#" + c + ";";
                }
            } else {
                entity = "&#" + c + ";";
            }
            for (int i = 0; i < entity.length(); i++) {
                addC(entity.charAt(i), linelen++);
            }
            return;
        }

        if (logger.isDebugEnabled()) {
            logger.debug(String.format("(%s) SLTM sent, try number = %d", link.getName(), tryCount));
        }

        if (endType == EndType.CLOSED_LINE || endType == EndType.CLOSED_POLYGON) {
            while (highI > 0 && path.get(0) == path.get(highI)) {
                highI--;
            }
        }

        if (FacebookUtils.isLinkedForRead(this)) {
            btnFacebook.setText("Sign OUT of Facebook");
        } else {
            btnFacebook.setText("Sign IN to Facebook");
        }

        if (builtInTypes.contains(typedef.getName())) {
            return Status.CANCEL_STATUS;
        }

        if (closedByChild) {
            throw new AlreadyClosedException("this IndexReader cannot be used anymore as one of its child readers was closed");
        }

        if (!NameValidationUtils.isValidQueueName(queueName)) {
            virtualHost.getQueueRegistry().unregisterQueue(new AMQShortString(queueName));
            String queueTypeIndicator;
            if (durable) {
                queueTypeIndicator = "Subscription ID: ";
                _logger.info("Durable. Mapping to: " + arguments.containsKey(queueName) + " " + arguments.containsValue(queueName));
            } else {
                queueTypeIndicator = "Queue name: ";
            }
            throw new AMQSecurityException(queueTypeIndicator + NameValidationUtils.getNameWithoutTenantDomain(queueName) + " cannot contain any of following symbols ~!@#;%^*()+={}|<>\"', and space. " + "\" / \" can only use as the tenant separator\n");
        }

        if (sppIdentifier != null) {
            SPPBizLogic sppBizLogic = new SPPBizLogic();
            SpecimenProcessingProcedure spp = sppBizLogic.getSPPById(sppIdentifier);
            Map<Action, Long> contextRecordIdMap = sppBizLogic.generateContextRecordIdMap(spp);
            request.setAttribute(Constants.CONTEXT_RECORD_MAP, contextRecordIdMap);
            TreeSet<Action> actionList = new TreeSet<Action>(new SPPActionComparator());
            actionList.addAll(spp.getActionCollection());
            request.setAttribute("actionColl", actionList);
            Boolean isCaCoreGenerated = sppBizLogic.isCaCoreGenerated(actionList);
            if (!isCaCoreGenerated) {
                request.setAttribute("isCaCoreGenerated", true);
            }
            return mapping.findForward(Constants.PAGE_OF_DEF_VALUE_FOR_SPP);
        }

        if (!approachingTagAtom) {
            s.skipBytes(atomSize - ATOM_HEADER_SIZE);
        } else {
            if (onMetaAtom) {
                s.skipBytes(4);
            }
            if (onTagAtom) {
                if (atomName.equals("name")) {
                    s.skipBytes(4);
                    tagName = new String(readIntoBuffer(s, atomSize - (ATOM_HEADER_SIZE + 4)));
                } else if (atomName.equals("data")) {
                    s.skipBytes(8);
                    tagName = (tagName == null ? fourAtom : tagName);
                    byte[] tagBuffer = readIntoBuffer(s, atomSize - (ATOM_HEADER_SIZE + 8));
                    if (ALLOWED_TAGS.contains(tagName)) {
                        String tagValue = (BINARY_TAGS.contains(tagName) ? String.format("%d", b2be32(tagBuffer, 0)) : new String(tagBuffer, "UTF-8"));
                        if (PRINT_DEBUG) {
                            System.out.println(String.format("parsed tag '%s': '%s'\n", tagName, tagValue));
                        }
                        addTagEntry(tags, tagName.toUpperCase(), tagValue);
                    }
                    tagName = null;
                }
            }
        }

        if (!producto.getCodigo().equals("")) {
            Producto productoDuplicado = this.getProductoPorCodigo(producto.getCodigo(), producto.getEmpresa());
            if (operacion.equals(TipoDeOperacion.ACTUALIZACION) && productoDuplicado != null && productoDuplicado.getId_Producto() != producto.getId_Producto()) {
                throw new BusinessServiceException(ResourceBundle.getBundle("Mensajes").getString("mensaje_producto_duplicado_codigo"));
            }
            if (operacion.equals(TipoDeOperacion.ALTA) && productoDuplicado != null && !producto.getCodigo().equals("")) {
                throw new BusinessServiceException(ResourceBundle.getBundle("Mensajes").getString("mensaje_producto_duplicado_codigo"));
            }
        }

        if (this.hasFilterInfo) {
            this.filterInfo = new FilterRoutingInfo();
            InternalDataSerializer.invokeFromData(this.filterInfo, in);
        }

        if (isUnfiltered(testNodeRef)) {
            continue;
        }

        if (mainPrefs.getBoolean(Motion.GYROSCOPE, true)) {
            if (null != mgr.getDefaultSensor(Sensor.TYPE_GYROSCOPE)) {
                sensors.add(mgr.getDefaultSensor(Sensor.TYPE_GYROSCOPE));
            }
        }

        if (result.matches("https?://[^/]*scnlog.(?:eu|me)/.+")) {
            continue;
        }

        if (childEntries.size() == 0) {
            categories = new PropertySheetCategory[0];
            return;
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            final double scale = this.getResources().getDisplayMetrics().density;
            checkDont.setPadding(checkDont.getPaddingLeft() + (int) (40.0f * scale + 0.5f), checkDont.getPaddingTop(), checkDont.getPaddingRight(), checkDont.getPaddingBottom());
        }

        if (action.equals("batman_cave_rnd")) {
            location = "Bat-Research and Bat-Development";
        } else if (action.equals("batman_cave_car")) {
            location = "The Bat-Sedan";
        } else if (action.equals("batman_downtown_hospital")) {
            location = "Gotpork Memorial Hospital";
        } else if (action.equals("batman_downtown_car")) {
            location = "The Bat-Sedan";
        } else if (action.equals("batman_park_car")) {
            location = "The Bat-Sedan";
        } else if (action.equals("batman_slums_car")) {
            location = "The Bat-Sedan";
        } else if (action.equals("batman_industrial_car")) {
            location = "The Bat-Sedan";
        } else {
            return false;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            Bundle widgetOptions = appWidgetManager.getAppWidgetOptions(appWidgetId);
            int[] sizePortrait = {widgetOptions.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_WIDTH), widgetOptions.getInt(AppWidgetManager.OPTION_APPWIDGET_MAX_HEIGHT)};
            int[] sizeLandscape = {widgetOptions.getInt(AppWidgetManager.OPTION_APPWIDGET_MAX_WIDTH), widgetOptions.getInt(AppWidgetManager.OPTION_APPWIDGET_MIN_HEIGHT)};
            mustFitWithinDp[0] = Math.min(sizePortrait[0], sizeLandscape[0]);
            mustFitWithinDp[1] = Math.min(sizePortrait[1], sizeLandscape[1]);
        }

        if (currentConfig.getSoundOn() == 1) {
            individualsWarningsOnCheckBox.setSelected(true);
        } else {
            individualsWarningsOnCheckBox.setSelected(false);
        }

        if (price == null || price.signum() <= 0) {
            return null;
        }

        if (BYTE_TO_SERDESER.size() != serdesers.length) {
            throw new RuntimeException("Incorrect number of serdesers.");
        }

        if (optionCounter == null) {
            continue;
        }

        if (callConfig.getEncoding() == null || callConfig.getEncoding().length() == 0) {
            callConfig.setEncoding("UTF-8");
        }

        if ((ln = n.getLength3()) == 0.0) {
            d = RC.dot3(axis);
            D = RC.subtract3(axis.multiply3(d));
            d = D.getLength3();
            tVals[0] = Double.NEGATIVE_INFINITY;
            tVals[1] = Double.POSITIVE_INFINITY;
            return d <= radius;
        }

        if (this.futures.isEmpty()) {
            setSuccess0();
        }

        if (req.hasTag(VOID)) {
            expStmtExpected = true;
            return TreeInfo.isExpressionStatement(expr);
        } else {
            return super.compatible(found, req, warn);
        }

        if (sql == null && compare(EXECUTE_BATCH, name)) {
            sql = "batch";
        }

        if (item.spanX < 0 || item.spanY < 0) throw new RuntimeException("Improper spans found");

        if (cm.getInteractivity() == null) {
            Interactivity interactivity = InteractivityImpl.create();
            interactivity.eAdapters().addAll(cm.eAdapters());
            cm.setInteractivity(interactivity);
        }

        if (p_format == 23) {
            ((Extractor) result).setMSOfficeDocFilterId(filterId);
        }

        if (jacksonParser.currentToken() == JsonToken.START_ARRAY) {
            ArrayList<Long> collection = new ArrayList<>();
            Long item = null;
            while (jacksonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jacksonParser.currentToken() == JsonToken.VALUE_NULL) {
                    item = null;
                } else {
                    item = jacksonParser.getLongValue();
                }
                collection.add(item);
            }
            instance.setValueLongTypeArray(CollectionUtils.asLongTypeArray(collection));
        }

        if ((fromDate.length() > 0) && (fromDttm == null)) {
            if (!fromDate.startsWith("-")) {
                fromDttm = DateUtil.parse(fromDate);
            }
        }

        if (!(assert_code instanceof Codes.Return)) {
            this.iterateCode(assert_code, function);
        }

        if (NullChecker.isNotNullish(url)) {
            LOG.debug("getEndPointFromConnectionManagerByAdapterAPILevel:" + url);
            if (msg == null) {
                LOG.error("Message was null");
            } else if (assertion == null) {
                LOG.error("assertion was null");
            } else {
                RespondingGatewayCrossGatewayQueryRequestType request = new RespondingGatewayCrossGatewayQueryRequestType();
                request.setAdhocQueryRequest(msg);
                request.setAssertion(assertion);
                ServicePortDescriptor<AdapterDocQueryPortType> portDescriptor = getServicePortDescriptor(NhincConstants.ADAPTER_API_LEVEL.LEVEL_a0);
                CONNECTClient<AdapterDocQueryPortType> client = CONNECTClientFactory.getInstance().getCONNECTClientUnsecured(portDescriptor, url, assertion);
                response = (AdhocQueryResponse) client.invokePort(AdapterDocQueryPortType.class, "respondingGatewayCrossGatewayQuery", request);
            }
        } else {
            LOG.error("Failed to call the web service (" + NhincConstants.ADAPTER_DOC_QUERY_SERVICE_NAME + ").  The URL is null.");
        }

        if (aggAttr1 == null) {
            throw new IllegalArgumentException("Aggregation requires at least one isAggregatable attribute");
        }

        if (SqlGenerator.sqlGeneratorClass == null) {
            log.info("databaseName=" + conn.getMetaData().getDatabaseProductName() + "," + conn.getMetaData().getDatabaseProductVersion());
            log.info("driver=" + conn.getMetaData().getDriverName() + "," + conn.getMetaData().getDriverVersion() + "," + conn.getMetaData().getDriverMajorVersion() + "," + conn.getMetaData().getDriverMinorVersion());
            SqlGenerator.sqlGeneratorClass = (Class<SqlGenerator>) SqlGenerator.getSqlGeneratorClass(conn.getMetaData().getDatabaseProductName());
        }

        if (mHelper == null) {
            stop(true);
            return;
        }

        if (!serviceTypeSet.contains(serviceDescription.getType())) {
            serviceTypeSet.add(serviceDescription.getType());
            try {
                Object serviceData = Services.invokeServiceMethod(serviceDescription.getType(), ServicePattern.PROVIDER, serviceTempus, data1);
                serviceTempusServiceTypeObservableMap.get(serviceTempus).get(serviceDescription.getType()).notifyObservers(serviceData);
            } catch (CouldNotPerformException ex) {
                logger.debug("Could not notify state update for service[" + serviceDescription.getType() + "] because this service is not supported by this remote controller.", ex);
            }
        }

        if (!isMultiNodes()) {
            IBrandingService brandingService = (IBrandingService) GlobalServiceRegister.getDefault().getService(IBrandingService.class);
            boolean allowVerchange = brandingService.getBrandingConfiguration().isAllowChengeVersion();
            if (allowVerchange) {
                createJobVersionGroup(pageComposite);
            } else {
                selectedJobVersion = "0.1";
            }
        }

        if (!val.isVariable()) return val;
        else if (handleVar == VAR_PATH && !(val instanceof Path)) return newPath(val, val.getMetaData());
        else if (handleVar == VAR_ERROR) throw parseException(EX_USER, "unexpected-var", new Object[]{node.text}, null);
        else return val;

        if (lastLsfId != null && !exportedIds.contains(lastLsfId)) {
            processAttributes(row, unionPathCollection, newPathCollection, lastLsfPath);
            processParent(pathToIdMap, idToParentPathMap, idToResultElementMap, so);
            makeRecord();
        }

        if (!values.containsKey(key)) {
            T object = unscoped.get();
            values.put(key, object);
        }

        if (isCheckedOut(node) && !node.getPath().endsWith("_pwc")) {
            if (isPwc) {
                cancelCheckout(getRepository(), node);
            } else {
                throw new CmisStorageException("Cannot delete checked out document: " + node.getId());
            }
        } else if (allVersions) {
            String path = node.getPath();
            String[] versions = getRepository().getVersions(path);
            if (versions != null) {
                for (String version : versions) {
                    int beginIndex = version.indexOf(":") + 1;
                    int endIndex = version.length();
                    String versionNumber = version.substring(beginIndex, endIndex);
                    long snapshotId = Long.parseLong(versionNumber);
                    getRepository().removeVersionHistory(path, snapshotId);
                }
            }
            getRepository().delete(path);
        } else {
            String resourcePath = node.getPath();
            String permanentPath = node.getPermanentPath();
            int beginIndex = permanentPath.indexOf(":") + 1;
            int endIndex = permanentPath.length();
            String versionNumber = permanentPath.substring(beginIndex, endIndex);
            long snapshotId = Long.parseLong(versionNumber);
            getRepository().removeVersionHistory(resourcePath, snapshotId);
        }

        if (isNew()) {
            return true;
        }

        if (contentHandler != null) {
            connection = new ContentControlUrlConnection(connection, contentHandler, entityTypeToken);
        }

        if (param.getValueDescriptor() != null) {
            Value sample = param.getValueDescriptor().getSampleData();
            String displayValue = toDisplayValue(sample);
            if (displayValue != null) {
                example.put(param.getName(), displayValue);
            }
            Value defaultValue = param.getValueDescriptor().getDefaultValue();
            displayValue = toDisplayValue(defaultValue);
            if (displayValue != null) {
                defaults.put(param.getName(), displayValue);
            }
        }

        if (json.isJsonPrimitive()) {
            return EnumJsonSerializer.toEnum(json.getAsString(), enumClass);
        } else {
            throw new RuntimeException("Unexpected JSON type: " + json.getClass());
        }

        if (CREATE_VIRTUAL_BAND) {
            final String tag = ifg.sourceMaster.date;
            ReaderUtils.createVirtualIntensityBand(targetProduct, targetBandI, targetBandQ, ("_" + tag));
            ReaderUtils.createVirtualPhaseBand(targetProduct, targetBandI, targetBandQ, ("_" + tag));
        }

        if (clonedDescriptor.hasPreDeleteMappings()) {
            getDescriptor().addPreDeleteMapping(this);
        }

        if (information != null) setInformation(information.information, information.subjectArea);
        else setInformation(null, null);

        if (fToken == STPSymbols.TokenTILDE) {
            return true;
        }

        if (numrows == -1) {
            line = line.replaceAll(delimiter + delimiter, delimiter + "NaN" + delimiter);
            line = line.replaceAll(delimiter + delimiter, delimiter + "NaN" + delimiter);
            if (line.endsWith(delimiter)) line += "NaN";
            if (arecolnames) {
                String[] cols = line.split(delimiter);
                for (int i = 0; i < colIndexes.length; i++) newcolnames.add(cols[colIndexes[i]]);
                if (arerownames) newcolnames.remove(0);
            } else numrows++;
        }

        if (!validEntry) {
            return new ResponseMessage(ResponseMessage.Type.danger, "duplicateInformation", null);
        }

        if (input.getProtocol().equals("file")) {
            return newFile(ConfigImplUtil.urlToFile(input), options);
        } else {
            return new ParseableURL(input, options);
        }

        if (enterpriseBean instanceof SessionBeanType) {
            final SessionBeanType sessionBean = (SessionBeanType) enterpriseBean;
            final WebServiceSecurityType webServiceSecurityType = sessionBean.getWebServiceSecurity();
            if (webServiceSecurityType != null) {
                if (webServiceSecurityType.getRealmName() != null) {
                    deployment.addProperty("webservice.security.realm", webServiceSecurityType.getRealmName());
                }
                if (webServiceSecurityType.getSecurityRealmName() != null) {
                    deployment.addProperty("webservice.security.securityRealm", webServiceSecurityType.getSecurityRealmName());
                }
                if (webServiceSecurityType.getTransportGuarantee() != null) {
                    deployment.addProperty("webservice.security.transportGarantee", webServiceSecurityType.getTransportGuarantee().value());
                } else {
                    deployment.addProperty("webservice.security.transportGarantee", "NONE");
                }
                if (webServiceSecurityType.getAuthMethod() != null) {
                    deployment.addProperty("webservice.security.authMethod", webServiceSecurityType.getAuthMethod().value());
                } else {
                    deployment.addProperty("webservice.security.authMethod", "NONE");
                }
                deployment.getProperties().putAll(webServiceSecurityType.getProperties());
            }
            if (sessionBean.getWebServiceAddress() != null) {
                deployment.getProperties().put("openejb.webservice.deployment.address", sessionBean.getWebServiceAddress());
            }
        }

        if (!(getAccountState().isLoanActiveInGoodStanding() || getAccountState().isLoanActiveInBadStanding() || getAccountState().isLoanClosedObligationsMet())) {
            logger.debug("State is not active hence adjustment is not possible");
            return false;
        }

        if (chainedTable[i] == key) {
            return (TimerImpl) chainedTable[i + 1];
        }

        if (random.nextInt(1000) == 0) {
            outOfOrderCount++;
            theEvent = new OutOfOrder(new TerminalInfo(termIds[i]));
            System.out.println("Generated an Checkin followed by " + theEvent.getType() + " event for terminal " + theEvent.getTerm().getId());
        } else if (random.nextBoolean()) {
            completedCount++;
            theEvent = new Completed(new TerminalInfo(termIds[i]));
        } else {
            cancelledCount++;
            theEvent = new Cancelled(new TerminalInfo(termIds[i]));
        }

        if (CHECK_ALL_PARSE) {
            SourceElementParser parser = new SourceElementParser(new TestSourceElementRequestor(), new DefaultProblemFactory(Locale.getDefault()), new CompilerOptions(getCompilerOptions()), false, true);
            ICompilationUnit sourceUnit = new CompilationUnit(source, testName, null);
            CompilationResult compilationResult = new CompilationResult(sourceUnit, 0, 0, 0);
            CompilationUnitDeclaration computedUnit = parser.dietParse(sourceUnit, compilationResult);
            String computedUnitToString = computedUnit.toString();
            if (!expectedDietUnitToString.equals(computedUnitToString)) {
                System.out.println(Util.displayString(computedUnitToString));
            }
            assertEquals("Invalid source element diet structure" + testName, expectedDietUnitToString, computedUnitToString);
        }

        if (!name.matches("\\A[\\.\\w]+\\z")) {
            return false;
        }

        if (BuildConfig.DEBUG) {
            Log.d(TAG, "create uddf-file: <" + uddfFileName + ">");
        }

        if (revise != null) {
            return Hotels_.book(id, booking);
        } else if (confirm != null) {
            booking.create();
            flash.setSuccess("Thank you, " + login.getUserName() + ", your confimation number for " + hotel.name + " is " + booking.id);
            return Application_.index();
        } else {
            return Hotels_.confirmBooking(id, booking).with(PropertyType.REDIRECT_AFTER_ACTION, false);
        }

        if (!this.requestor.isIgnored(CompletionProposal.TYPE_REF) && (this.assistNodeInJavadoc & CompletionOnJavadoc.ONLY_INLINE_TAG) == 0) {
            InternalCompletionProposal proposal = (InternalCompletionProposal) CompletionProposal.create(CompletionProposal.TYPE_REF, this.actualCompletionPosition - this.offset);
            proposal.nameLookup = this.nameEnvironment.nameLookup;
            proposal.completionEngine = this;
            proposal.setDeclarationSignature(packageName);
            proposal.setSignature(createNonGenericTypeSignature(packageName, typeName));
            proposal.setPackageName(packageName);
            proposal.setTypeName(typeName);
            proposal.setCompletion(completionName);
            proposal.setFlags(modifiers);
            proposal.setReplaceRange(this.startPosition - this.offset, this.endPosition - this.offset);
            proposal.setTokenRange(this.tokenStart - this.offset, this.tokenEnd - this.offset);
            proposal.setRelevance(relevance);
            proposal.setAccessibility(accessibility);
            this.requestor.accept(proposal);
            if (DEBUG) {
                this.printDebug(proposal);
            }
        }

        if (mode == Mode.PARTIAL1 || mode == Mode.COMPLETE) {
            processOptions(parameters);
            this.wordOI = HiveUtils.asStringOI(parameters[0]);
            this.valueOI = HiveUtils.asDoubleCompatibleOI(parameters[1]);
            this.labelOI = HiveUtils.asIntegerOI(parameters[2]);
            this.lambdaOI = HiveUtils.asDoubleCompatibleOI(parameters[3]);
        } else {
            StructObjectInspector soi = (StructObjectInspector) parameters[0];
            this.internalMergeOI = soi;
            this.wcListField = soi.getStructFieldRef("wcList");
            this.lambdaMapField = soi.getStructFieldRef("lambdaMap");
            this.topicsOptionField = soi.getStructFieldRef("topics");
            this.alphaOptionField = soi.getStructFieldRef("alpha");
            this.deltaOptionField = soi.getStructFieldRef("delta");
            this.wcListElemOI = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
            this.wcListOI = ObjectInspectorFactory.getStandardListObjectInspector(wcListElemOI);
            this.lambdaMapKeyOI = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
            this.lambdaMapValueElemOI = PrimitiveObjectInspectorFactory.javaStringObjectInspector;
            this.lambdaMapValueOI = ObjectInspectorFactory.getStandardListObjectInspector(lambdaMapValueElemOI);
            this.lambdaMapOI = ObjectInspectorFactory.getStandardMapObjectInspector(lambdaMapKeyOI, lambdaMapValueOI);
        }

        if ((this.chordOFEditText.length() > 0) && (this.tangentEditText.length() > 0)) {
            return true;
        }

        if (!c.isNull(3)) completed = c.getLong(3);

        if (DEBUG) System.out.println(position + "\t\tinvokespecial: java.lang.AssertionError.<init>()V");

        if (REL_TYPE_EXPLETIVE.equals(link.getReferenceRelation())) {
            coreferencesLayer.addRelation(ref, REL_TYPE_EXPLETIVE);
            continue;
        }

        if (!entry.isDirectory() && startsWith(path, type, "tlds") && StringUtil.endsWithIgnoreCase(path, ".tld")) {
            log.info("extension", "deploy tld " + fileName);
            ConfigWebAdmin.updateTLD(config, zis, fileName, false);
            tlds.add(fileName);
        }

        if (r.isVM) {
            String bootScript = d.getPostBootScript();
            try {
                if (bootScript != null) {
                    logger.debug("scriptMap: " + scriptMap + ", ipaddr_index: " + ipaddr_index);
                    bootScript = ScriptConstructor.constructScript(d.getPostBootScript(), scriptMap, ipaddr_index);
                    if (bootScript != null) {
                        logger.debug("unit.instance.config=\n" + bootScript);
                        r.reservation.setConfigurationProperty("unit.instance.config", bootScript);
                        d.setPostBootScript(bootScript);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }

        if (data == null) {
            return;
        }

        if (getRangeCount() > 0) {
            int range0 = (int) (cellHeight() * getRangeZoneHeightFraction());
            double spacing = (cellHeight() - range0) / (getRangeCount() * 2.0);
            _rangeZoneBoundaries[0] = (int) (range0 - spacing / 2.0);
            for (int i = 1; i <= getRangeCount(); ++i) {
                _rangeZoneBoundaries[i] = (int) (_rangeZoneBoundaries[i - 1] + 2 * spacing);
            }
        }

        if (colorConflict) {
            return;
        }

        if (!r.isCandidate()) {
            String lastMod = new Date(r.getLastModifiedDate()).toString();
            HtmlRenderer.formDirEntry(sb, request, r.getName(), lastMod);
        }

        if (!reductionTree.edgeSet().isEmpty()) {
            ReductionTreeExporter treeExporter = new ReductionTreeDotExporter();
            stepModel.add("reductionTrees", treeExporter.output(reductionTree));
        }

        if (match.contains("vk.com")) {
            linkMap.put(match, true);
        } else {
            finalLinks.add(this.createDownloadlink(match));
        }

        if (!spieler.getDwzData().getCsvZPS().equals("")) {
            mySQLDWZDataDAO.updateDWZ(spieler.getDwzData());
        }

        if (UnsafeKt.tryUpdate(env)) {
            if (logger.isInfoEnabled()) {
                logger.info((force ? "Env force-updated at " : "Env updated at ") + env.getLocation());
            }
            return Long.MIN_VALUE;
        }

        if (whereClauseSqlGenerators == null || whereClauseSqlGenerators.isEmpty()) {
            return;
        }

        if ((revision != null) && (btime != null)) {
            System.out.printf("Revision    %s\n", revision);
            System.out.printf("Build time  %s\n", btime);
        }

        if (yPos >= top && yPos <= (top + height)) {
            element.getStyle().setBorderColor("white");
        } else {
            element.getStyle().clearBorderColor();
        }

        if (isCreation || securityContext.isReadable(newNode, factoryProfile.includeDeletedAndHidden(), factoryProfile.publicOnly())) {
            return newNode;
        }

        if (1 != streamExpressions.size()) {
            throw new IOException(String.format(Locale.ROOT, "Invalid expression %s - expecting a single stream but found %d", expression, streamExpressions.size()));
        }

        if (SicsCore.getDefaultProxy().isConnected()) {
            handleSicsConnect();
        }

        if (field.getName().equalsIgnoreCase("log") || field.getName().equalsIgnoreCase("logger")) {
            continue;
        }

        if ((FunctionalVector3D.dotProduct(q1x, q1y, q1z, q1x, q1y, q1z) > (rr * e1 * e1)) && (FunctionalVector3D.dotProduct(q1x, q1y, q1z, qcx, qcy, qcz) > 0.)) {
            return false;
        }

        if (dependencyException != null) {
            throw dependencyException;
        }

        if (request.getParameter("text") != null) return "text/plain;charset=UTF-8";

        if (e.character == ' ' && lastMove != null) {
            Point real = lastMove;
            hideToolTips();
            StepMeta stepMeta = transMeta.getStep(real.x, real.y, iconsize);
            if (stepMeta != null) {
                inputOutputFields(stepMeta, false);
            }
        }

        if (previouslyCommitted <= getCommitted()) {
            throw new RuntimeException("Heap was not shrinked.");
        }

        if (serProps instanceof Map) {
            properties = newCopyOnWriteLinkedHashMap((Map<String, String>) serProps);
            return;
        }

        if (!reposition(scan_position, false)) {
            throw StandardException.newException(SQLState.AM_RECORD_NOT_FOUND, new Long(err_containerid), new Long(scan_position.current_rh.getId()));
        }

        if (!ServerProfileStore.getViewer(connector.getCvid()).getPermissions().getFlag(Perm.server.network.create_listener)) {
            connector.write(Message.newBuilder().setId(m.getId()).setRsOutcome(Outcome.newBuilder().setResult(false).setComment("Insufficient permissions")).build());
            return;
        }

        if (webDesc.getRunAsIdentity() != null) {
            continue;
        }

        if (fLast != BACKSLASH && fLast != BACKSLASH_CR && fLast != BACKSLASH_BACKSLASH) {
            return postFix(fState);
        }

        if (parameters != null) {
            for (TermParameterBo param : parameters) {
                parametersMap.put(param.getName(), param.getValue());
            }
        }

        if (newField.inheritedFrom_ != null) continue;

        if (firstVisibleItemPosition == 0 && -headerViewHeight < paddingTop) {
            if (paddingTop - headerViewHeight > 0 && currentState == DOWN_PULL_REFRESH) {
                Log.i(TAG, "松开刷新");
                currentState = RELEASE_REFRESH;
                refreshHeaderView();
            } else if (paddingTop - headerViewHeight < 0 && currentState == RELEASE_REFRESH) {
                Log.i(TAG, "下拉刷新");
                currentState = DOWN_PULL_REFRESH;
                refreshHeaderView();
            }
            headerView.setPadding(0, -headerViewHeight + diff, 0, 0);
            return true;
        }

        if (operationsLogger.isLoggable(Level.FINER)) {
            operationsLogger.entering(MultiLogManager.class.getName(), "invalidate");
        }

        if (i == 0 && !(stuff.get(0) && !stuff.get(1))) {
            continue;
        } else if (i == 1 && !(stuff.get(0) && stuff.get(1))) {
            continue;
        } else if (i == 2 && stuff.get(0)) {
            continue;
        }

        if (n.getAttributeValue("lastCycleStatus") != null && !n.getAttributeValue("lastCycleStatus").equals("")) {
            String status = n.getAttributeValue("lastCycleStatus");
            if (status.equals(Constants.STATUS_COMPLETED)) {
                sequenceLaneInfo.setSeqRunLastCycleCompleted("Y");
                sequenceLaneInfo.setSeqRunLastCycleFailed("N");
            } else if (status.equals(Constants.STATUS_TERMINATED)) {
                sequenceLaneInfo.setSeqRunLastCycleCompleted("N");
                sequenceLaneInfo.setSeqRunLastCycleFailed("Y");
            }
        } else {
            sequenceLaneInfo.setSeqRunLastCycleCompleted("N");
            sequenceLaneInfo.setSeqRunLastCycleFailed("N");
        }

        if (preTemplateProcess(template, model)) {
            try {
                ResourceResponse response = PortletActionContext.getResourceResponse();
                response.setContentType(pContentType);
                template.process(model, response.getWriter());
            } finally {
                postTemplateProcess(template, model);
            }
        }

        if ((dir[0] != 0 && (pos[0] >= width || pos[0] < 0)) || (dir[1] != 0 && (pos[1] >= height || pos[1] < 0)) || (dir[2] != 0 && (pos[2] >= depth || pos[2] < 0))) {
            return false;
        }

        if (parametrosComandoNegativacaoHelper.getValoMaximoDebito() != null) {
            form.setValoMaximoDebito(parametrosComandoNegativacaoHelper.getValoMaximoDebito().toString());
        }

        if (optimizerTrace) {
            tracer().trace(OptimizerFlag.STARTED, 0, 0, 0.0, null);
        }

        if (becameUntracked) {
            m_customizer.removedService(reference, null);
        } else {
            if (mustCallAdded) {
                m_customizer.addedService(reference);
            }
        }

        if (entry.getKey().equals(s)) {
            output.add(entry.getKey());
        }

        if (permis.isRead()) permissions.add(ExtendedPermission.READ);

        if (value instanceof StringInstance) {
            assertTrue("value is instance of String", value instanceof StringInstance);
            StringInstance stringValue = (StringInstance) value;
            stringValue.setValue("newValue");
        } else if (value instanceof BooleanInstance) {
            BooleanInstance realValue = (BooleanInstance) value;
            realValue.setValue(true);
        }

        if (!this.absolute(start - 1)) {
            return list;
        }

        if (data[0] == 0x04 && data[1] == data.length - 2 && (data[2] == 0x02 || data[2] == 0x03)) {
            int qLength = new X9IntegerConverter().getByteLength(curve);
            if (qLength >= data.length - 3) {
                try {
                    key = (ASN1OctetString) ASN1Primitive.fromByteArray(data);
                } catch (IOException ex) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }

        if (isDefault) {
            if (vp == BasicVisualLexicon.NODE_VISIBLE) applyVisualProperty((VisualProperty) vp, vp.getDefault());
            else
                graphView.nodeViewDefaultSupport.setViewDefault((VisualProperty) vp, graphView.m_nodeDetails.getDefaultValue(vp));
        }

        if (source == null) return;

        if (mutable) {
            function().allocator.declareVar(variable.getName(), type);
        } else {
            function().allocator.declareVal(variable.getName(), type);
        }

        if (Config.getBoolean("CUSTOM_PLOTS_ENABLED")) tempConfig.createCustomPlotsFromConfig();

        if (!isPSPTask(node)) assignClientIDsToChildrenOf(node);

        if (oldEntry == null) {
            if (newActivityEndTime == Double.POSITIVE_INFINITY) {
            } else {
                activityEndsList.add(new AgentEntry(agent, newActivityEndTime));
                internalInterface.registerAdditionalAgentOnLink(agent);
                ((org.matsim.core.mobsim.qsim.AgentCounter) internalInterface.getMobsim().getAgentCounter()).incLiving();
            }
        } else if (newActivityEndTime == Double.POSITIVE_INFINITY) {
            unregisterAgentAtActivityLocation(agent);
            internalInterface.getMobsim().getAgentCounter().decLiving();
        } else {
            activityEndsList.add(new AgentEntry(agent, newActivityEndTime));
        }

        if (prevMaxHeight != currentMaxHeight) {
            result.add(new int[]{buildingPoint.x, currentMaxHeight});
            prevMaxHeight = currentMaxHeight;
        }

        if (visitor instanceof NearestVisitor) {
            return handleNearestVisitor(query, visitor);
        } else {
            Connection cx = getDataStore().getConnection(getState());
            try {
                Object result = getDataStore().getAggregateValue(visitor, getSchema(), query, cx);
                return result != null;
            } finally {
                getDataStore().releaseConnection(cx, getState());
            }
        }

        if (json_obj.has("icon") && !json_obj.isNull("icon")) {
            t.setIcon(json_obj.getString("icon"));
        }

        if (StringUtils.isEmpty(reportNumber)) {
            return MessageBuilder.buildMessage(EffortKeyConstants.ERROR_REPORT_NUMBER_MISSING, null).getMessage();
        }

        if (pageInfo.getBuffer() == 0 && !pageInfo.isAutoFlush()) err.jspError(n, "jsp.error.page.badCombo");

        if (isClosed()) throw new IllegalStateException("Serial connection is not open; cannot 'discardAll()'.");

        if (Endpoint.DOCTYPE.equals(requestedDocumentModel.getType())) {
            addWdsl(requestedDocumentModel, wsdlFactory, wsdls);
        } else {
            DocumentModelList serviceModels = docService.getChildren(session, requestedDocumentModel.getRef(), Endpoint.DOCTYPE);
            for (DocumentModel documentModel : serviceModels) {
                addWdsl(documentModel, wsdlFactory, wsdls);
            }
        }

        if (match == null) return;

        if (result) {
            break;
        }

        if (c.getSuperclass() != null) {
            register(ReflectionUtilities.getFullName(c.getSuperclass()));
        }

        if (style.contains(ICustomAppearance.DISP_DERIVE)) {
            if (property.isDerived()) {
                buffer.append("/");
            }
        }

        if (line == -1) {
            return new Position(-1, 0);
        }

        if (command != null && command.canExecute()) {
            command.execute();
        }

        if (!isComponent && !isDataFormat && !isLanguage) {
            return;
        }

        if (UML_ADAPTER_FACTORY_CLASS_NAME.equals(af.getClass().getName())) {
            umlAdapterFactory = af;
        } else if (af.getClass().equals(EcoreItemProviderAdapterFactory.class)) {
            ecoreAdapterFactory = af;
        }

        if (c == null) {
            if (name.startsWith(BSH_PACKAGE)) try {
                c = Interpreter.class.getClassLoader().loadClass(name);
            } catch (ClassNotFoundException e) {
            }
        }

        if (mValue < mMinValue) {
            mValue = mMinValue;
            return true;
        }

        if (!allowsNewProduct) {
            newWarn = conSelected(data);
            setPolygonLocked(true);
        } else {
            CurrentWarnings cw = CurrentWarnings.getInstance(warngenLayer.getLocalizedSite());
            newWarn = cw.getNewestByTracking(data.getEtn(), data.getPhen() + "." + data.getSig());
            updatePolygon(newWarn);
            warngenLayer.setOldWarningPolygon(newWarn);
            setTimesFromFollowup(newWarn.getStartTime().getTime(), newWarn.getEndTime().getTime());
            try {
                warngenLayer.createPolygonFromRecord(newWarn);
                fromTrack.setEnabled(false);
                warngenLayer.getStormTrackState().editable = true;
                refreshDisplay();
            } catch (VizException e) {
                statusHandler.handle(Priority.PROBLEM, "Error creating polygon from the record\n", e);
            }
        }

        if (mDrawerLayoutDelegate != null) {
            getMenuInflater().inflate(R.menu.thread_go, menu);
        }

        if (sz >= 100000) {
            return sz + 100000;
        }

        if (props.containsValue("ding") == false) return;

        if (e instanceof CoreException) {
            if (isExceptionMessageFormatted(e.getLocalizedMessage())) {
                throw (CoreException) e;
            }
            normalizeStatus(step, id, context, data, ((CoreException) e).getStatus());
        } else {
            normalizeStatus(step, id, context, data, StatusHelper.getStatus(e));
        }

        if (!newRev.isEmpty()) {
            for (DBIDIter nriter = newRev.iter(); nriter.valid(); nriter.advance()) {
                for (DBIDIter niter2 = newRev.iter(); niter2.valid(); niter2.advance()) {
                    if (DBIDUtil.compare(nriter, niter2) < 0) {
                        addpair(flag, nriter, niter2);
                        counter++;
                    }
                }
                for (DBIDIter niter2 = oldRev.iter(); niter2.valid(); niter2.advance()) {
                    if (DBIDUtil.equal(nriter, niter2)) {
                        continue;
                    }
                    addpair(flag, nriter, niter2);
                    counter++;
                }
            }
        }

        if ("hidden".equals(group)) {
            continue;
        }

        if (!catchIndexOf && !newIndexOf && !ifIndexOf && !whileIndexOf && !returnIndexOf) {
            int start = m.start();
            int end = m.end();
            String methodName = statement.substring(lineNumberSavePoint, end);
            lineNumberCnt += getLineNumberCnt(methodName);
            lineNumberSavePoint = end + 1;
            BlockDVO blockAndDeleteList = getBlockAndDeleteList(lineNumberCnt);
            if (blockAndDeleteList == null) {
                blockAndDeleteList = getBlock(lineNumberCnt, 0);
                lineNumberSavePoint = lineNumberSavePoint - 1;
            }
            LOGGER.debug(String.format(" lineNumberCnt : %d linNuberSavePoint : %d ", lineNumberCnt, lineNumberSavePoint));
            int startLine = blockAndDeleteList.getStartindex();
            int endLine = blockAndDeleteList.getEndindex();
            LOGGER.debug(String.format("startLine : %d  endLine %d \n", startLine, endLine));
            List<String> subList = this.inspectorSourceMeta.getSourceCodeList().subList(startLine - 1, endLine);
            String sourceCode = getString(subList);
            methodList.add(new SourceAnalysisDVO(group.replaceAll("\\{", "").trim(), start, end, startLine, endLine, this.inspectorSourceMeta.getFileName(), sourceCode));
        }

        if (date.getMonthString() != null) {
            String month = date.getMonthString().trim();
            int n = 0;
            while (n < 12) {
                Matcher ma = months[n].matcher(month);
                if (ma.find()) {
                    date.setMonth(n + 1);
                    break;
                }
                n++;
            }
        }

        if (i + 1 < args.length) {
            i++;
            String[] vals = args[i].split(":");
            try {
                SimpleConfig.setCongestionEvaluationInterval(Double.parseDouble(vals[0]));
                SimpleConfig.setCongestionToleranceThreshold(Double.parseDouble(vals[1]));
            } catch (Exception e) {
                System.err.println("Could not parse congestion config '" + args[i] + "' : " + e.getMessage());
            }
        }

        if (child != null) {
            return I18n.bind(WorkspaceCommandsI18n.cannotImportWouldCreateDuplicate, objName, kType.getType());
        }

        if (_ctTourId == ctTourId.longValue() && _comparedTourItem instanceof TVICatalogComparedTour) {
            return;
        }

        if (roll < toHit.getValue()) {
            r = new Report(4035);
            r.subject = ae.getId();
            addReport(r);
            if (ae instanceof LandAirMech && ae.isAirborneVTOLorWIGE()) {
                game.addControlRoll(new PilotingRollData(ae.getId(), 0, "missed punch attack"));
            }
            if (targetInBuilding && (bldg != null)) {
                if (damage > 0) {
                    Vector<Report> buildingReport = damageBuilding(bldg, damage, target.getPosition());
                    for (Report report : buildingReport) {
                        report.subject = ae.getId();
                    }
                    addReport(buildingReport);
                }
            }
            return;
        }

        if (event.isCanceled()) {
            entityPlayer.connection.sendPacket(new SPacketBlockChange(world, pos));
            TileEntity tileentity = world.getTileEntity(pos);
            if (tileentity != null) {
                Packet<?> pkt = tileentity.getUpdatePacket();
                if (pkt != null) {
                    entityPlayer.connection.sendPacket(pkt);
                }
            }
        }

        if (nc.getSummary() != null) {
            if (nc.getHasName()) {
                columns.put(nc.getName(), new Integer(current));
            } else {
                columns.put(Integer.toString(current), new Integer(current));
            }
        }

        if (u.nomStatus != null && u.nomStatus.length > 0 && (nub.nomStatus.isEmpty() || currSrc.nomenclator)) {
            nub.nomStatus = Sets.newHashSet(u.nomStatus);
        }

        if (qtyCUsPerTU > 0) {
            lutuProducer.addCUPerTU(cuProduct, BigDecimal.valueOf(qtyCUsPerTU), cuUOM);
        }

        if (row.length != this.width) {
            throw new IllegalArgumentException("The number of columns of a row being added to the dataset hat so equal the number of columns in the dataset.");
        }

        if (component == null) {
            throw new IllegalArgumentException("Parameter component cannot be null.");
        } else if (constraint == null) {
            throw new IllegalArgumentException("Parameter constraint cannot be null.");
        }

        if (isINDDAndInx(p_params)) {
            xml = AdobeHelper.recoverLineBreak(xml);
        }

        if (newSLD == null) {
            SLDPlugin.log("SLD Import returned null", null);
            throw (IOException) new IOException("SLD import returned null");
        }

        if (currentLock != null) {
            throw new IOException("Session '" + key + "' is already locked.");
        }

        if (fields[0].equals("HomeAltitude")) {
            lastAlti = Integer.parseInt(fields[1]);
        }

        if (flagXML) {
            if (flagQuote) {
                if (c == '"') {
                    sb.append(c);
                } else {
                    attributeSB.append(c);
                }
            } else {
                if (c == '"') {
                    if (attributeSB != null && attributeSB.length() > 0) {
                        String str = attributeSB.toString();
                        str = str.replaceAll("&lt;", "&amp;lt;");
                        str = str.replaceAll("&quot;", "&amp;quot;");
                        sb.append(str);
                        attributeSB = new StringBuffer();
                    }
                    sb.append(c);
                } else {
                    sb.append(c);
                }
            }
        } else {
            sb.append(c);
        }

        if (true) {
            Octahedron octa = new Octahedron(0.2 * vs);
            double vs2 = vs / 2;
            for (int i = 0; i < pcount; i++) {
                printf("coord:(%5.2f,%5.2f,%5.2f)mm att:(%5.2f,%5.2f,%5.2f) \n", pnt[0][i] / MM, pnt[1][i] / MM, pnt[2][i] / MM, pnt[3][i], pnt[4][i], pnt[5][i]);
                octa.setCenter(pnt[0][i], pnt[1][i], pnt[2][i]);
                octa.getTriangles(stl);
            }
        }

        if (shouldLinkAutomatically) {
            operation.setCreateLinks(true);
            operation.copyResources(sources, target);
        } else {
            boolean allSourceAreLinksOrVirtualFolders = true;
            for (int i = 0; i < sources.length; i++) {
                if (!sources[i].isVirtual() && !sources[i].isLinked()) {
                    allSourceAreLinksOrVirtualFolders = false;
                    break;
                }
            }
            if (!allSourceAreLinksOrVirtualFolders) {
                final IPreferenceStore store = IDEWorkbenchPlugin.getDefault().getPreferenceStore();
                final String dndPreference = store.getString(target.isVirtual() ? IDEInternalPreferences.IMPORT_FILES_AND_FOLDERS_VIRTUAL_FOLDER_MODE : IDEInternalPreferences.IMPORT_FILES_AND_FOLDERS_MODE);
                if (dndPreference.equals(IDEInternalPreferences.IMPORT_FILES_AND_FOLDERS_MODE_PROMPT)) {
                    final ImportTypeDialog dialog = new ImportTypeDialog(getShell(), dropAdapter.getCurrentOperation(), sources, target);
                    dialog.setResource(target);
                    if (dialog.open() == Window.OK) {
                        if (dialog.getSelection() == ImportTypeDialog.IMPORT_VIRTUAL_FOLDERS_AND_LINKS)
                            operation.setVirtualFolders(true);
                        if (dialog.getSelection() == ImportTypeDialog.IMPORT_LINK) operation.setCreateLinks(true);
                        if (dialog.getVariable() != null) operation.setRelativeVariable(dialog.getVariable());
                        operation.copyResources(sources, target);
                    } else return problems;
                } else operation.copyResources(sources, target);
            } else operation.copyResources(sources, target);
        }

        if (element.getProperty(CoreOptions.PORT_CONSTRAINTS).isOrderFixed()) {
            ECollections.sort(element.getPorts(), (Comparator<ElkPort>) comparator);
        }

        if ((config.getAutoBalanceLevel() == 0) || spawn.getSystemManager().isQuiesced() || spawn.getHostFailWorker().queuedHosts().size() > 0) {
            return false;
        }

        if (params.has("output")) {
            result.writeAsCsv(params.get("output"), "\n", "|");
            env.execute("TPCH Query 3 Example");
        } else {
            System.out.println("Printing result to stdout. Use --output to specify output path.");
            result.print();
        }

        if (trigger == '.') trigger = '#';

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(date);
        }

        if (targetRaw instanceof SipContentDirectory) {
            SipContentDirectory target = (SipContentDirectory) targetRaw;
            if (source instanceof SipContentDirectory)
                target.getTreeNode().add(((SipContentDirectory) source).getTreeNode());
            if (source instanceof SipContentFile) target.getTreeNode().add(source.getPath());
        }

        if (isShutdown()) return;

        if (d.getResourceType() != null) {
            r.units = d.getResourceType().getCount();
            r.type = d.getResourceType().getResourceType();
        }

        if (!nameList.contains(ITSEnum.EZSCRUM_STORY_RELATION)) {
            checker.execute(new EZSCRUM_STORY_RELATION_TABLE().getCreatTableInstruction());
            System.out.println("System Create new Table: " + ITSEnum.EZSCRUM_STORY_RELATION);
        }

        if (verbose) {
            logger.debug("aligning {} against {}", name1, name2);
        }

        if (_resultClass == Object[].class) {
            if (result.length > _aliases.length) {
                Object[] trim = new Object[_aliases.length];
                System.arraycopy(result, 0, trim, 0, trim.length);
                return trim;
            }
            return result;
        }

        if (jer == null) {
            actual = null;
        } else {
            actual = record.getJobEntryResult().getResult() == null ? null : Boolean.valueOf(record.getJobEntryResult().getResult().getResult());
        }

        if (position == 1) {
            head = head.next;
        } else {
            Node t = head;
            int currPos = 2;
            while ((currPos < position) && (t.next != null)) {
                t = t.next;
                currPos++;
            }
            if (t.next != null) t.next = t.next.next;
            else return 0;
        }

        if (map == null) {
            buildMap();
        }

        if (ModuleHelper.isEnabled(ForestryModuleUids.FOOD)) {
            ItemRegistryFood foodItems = ModuleFood.getItems();
            RecipeUtil.addRecipe("honeyed_slice", new ItemStack(foodItems.honeyedSlice, 4), "###", "#X#", "###", '#', items.honeyDrop, 'X', Items.BREAD);
            RecipeUtil.addRecipe("honey_pot", foodItems.honeyPot, "# #", " X ", "# #", '#', items.honeyDrop, 'X', fluidItems.waxCapsuleEmpty);
            RecipeUtil.addRecipe("ambrosia", foodItems.ambrosia, "#Y#", "XXX", "###", '#', items.honeydew, 'X', items.royalJelly, 'Y', fluidItems.waxCapsuleEmpty);
        }

        if (replacement != null) {
            replaceNodeWith(callNode, replacement);
        } else if (parent.isExprResult()) {
            NodeUtil.deleteNode(parent, compiler);
        } else {
            checkState(parent.isComma());
            Node rhs = checkNotNull(callNode.getNext());
            compiler.reportChangeToEnclosingScope(parent);
            parent.replaceWith(rhs.detach());
        }

        if (parameterName.isEmpty()) {
            throw new AnnotationValidationException(MessageFormat.format("The @Extension -> @Parameter -> " + "name annotated in class {0} is null or empty.", extensionClassFullName));
        } else if (!PARAMETER_NAME_PATTERN.matcher(parameterName).find()) {
            throw new AnnotationValidationException(MessageFormat.format("The @Extension -> @Parameter -> " + "name {0} annotated in class {1} is not in proper format ''abc.def.ghi''.", parameterName, extensionClassFullName));
        }

        if (group == null) {
            return enabled;
        }

        if (primaryOnly && !desc.isPrimary()) {
            continue;
        }

        if (o == null) {
            has_next = 1;
            next = null;
        } else if (o instanceof IdentityIF) {
            try {
                o = txn.getObject((IdentityIF) o, acceptDeleted);
                if (o == null) {
                    _next();
                } else {
                    has_next = 1;
                    next = (E) o;
                }
            } catch (Throwable t) {
                has_next = -1;
                next = null;
            }
        } else {
            has_next = 1;
            next = (E) o;
        }

        if (popup == null) buildPopupMenu();

        if (group.hasOutgoingConstraints() && group.incomingConstraintsCount == 0) {
            if (activeGroups == null) {
                activeGroups = Lists.newArrayList();
            }
            activeGroups.add(group);
        }

        if (children.get(0).getNodeBits() == null) {
            nodeBits = new BitSet(network.getNodeCount());
        } else {
            CyFilter n = children.get(0);
            BitSet tmpBitSet = (BitSet) n.getNodeBits().clone();
            if ((n instanceof CompositeFilter) && (compositeNotTab.get(n).booleanValue() == true)) {
                tmpBitSet.flip(0, network.getNodeCount());
            }
            nodeBits = tmpBitSet;
        }

        if (address != null) return waitSocketInjector(address);
        else return null;

        if (line.isEmpty() || line.charAt(0) == '#') {
            continue;
        }

        if (cassandraRule.getCluster() != null) {
            this.session = cassandraRule.getSession();
        } else {
            cassandraRule.before(session -> {
                KeyspaceRule.this.session = cassandraRule.getSession();
                return null;
            });
        }

        if (cp.getGeoPos() != null) {
            if (!nodeService.hasAspect(companyPropertiesNodeRef, ContentModel.ASPECT_GEOGRAPHIC)) {
                nodeService.addAspect(companyPropertiesNodeRef, ContentModel.ASPECT_GEOGRAPHIC, null);
            }
            nodeService.setProperty(companyPropertiesNodeRef, ContentModel.PROP_LATITUDE, cp.getGeoPos().getLatitude());
            nodeService.setProperty(companyPropertiesNodeRef, ContentModel.PROP_LONGITUDE, cp.getGeoPos().getLongitude());
        }

        if (Util.isEmpty(cluster.getCondition()) && (!cluster.getTemplateBooleanValue())) {
            report.logError("You must provide a condition for the cluster " + cluster.getName());
        }

        if (qsize > 0) {
            Log.i(TAG, "Task queue size: " + qsize + " on queue: " + queueId);
        }

        if (!isSpecialContainer && capabilityService.getCapability("Delete").evaluate(nodeRef) == AccessDecisionVoter.ACCESS_GRANTED) {
            allowableOperations.add(Nodes.OP_DELETE);
        }

        if (!m_KeyColumns[0].endsWith("_ID")) {
            return true;
        }

        if (role == GbRole.TA) {
            final List<PermissionDefinition> defs = getPermissionsForUser(userUuid);
            if (defs.isEmpty()) {
                return true;
            }
            for (final PermissionDefinition def : defs) {
                if (StringUtils.equalsIgnoreCase(def.getFunction(), GraderPermission.VIEW_COURSE_GRADE.toString())) {
                    return true;
                }
            }
            return false;
        }

        if (ZooClassDef.class.isAssignableFrom(cls.getClass())) {
            long oid = in.readLong();
            Object obj = hollowForOid(oid, (ZooClassDef) cls);
            return obj;
        }

        if ((int) offset.getX() == -intervalHorizontal || (int) offset.getX() == intervalHorizontal) {
            mover.moveLocationX(extrp, vx);
        }

        if (penalize && ignorednoise > 0) {
            penalty = (rel.size() - ignorednoise) / (double) rel.size();
        }

        if (results == null && this.exception == null) {
            int length = in.readInt();
            resultBytes = new byte[length];
            in.readFully(resultBytes);
        }

        if (tableScriptValidators != null) s_cacheTableEvent.put(multiKey, tableScriptValidators);

        if (minPos != minPos) {
            valid = 0;
            continue;
        }

        if (confirmQuit()) {
            try {
                firePropertyChange(CYTOSCAPE_EXIT, null, "now");
            } catch (Exception e) {
                System.out.println("Errors on close, closed anyways.");
            }
            System.out.println("Cytoscape Exiting....");
            System.exit(returnVal);
        } else {
            return;
        }

        if (instance == null) {
            log.info("[MongoTenantDbSingleton::getInstance] refresh singleton instanceNull=" + (instance == null));
            instance = new MongoTenantDbSingleton();
            anno_init = Calendar.getInstance().get(Calendar.YEAR);
            mese_init = Calendar.getInstance().get(Calendar.MONTH);
            giorno_init = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        }

        if (leaderWidth == 0) return this.makeEllipse(x, y, majorRadius, minorRadius, slices);

        if (!SystemManager.serverHasFeature(server.getId(), "ftr_agent_smith")) {
            throw new PermissionCheckFailureException();
        }

        if (!isLenient || startXRefOffset == 0) {
            return true;
        }

        if (getByModuleIdUserId(moduleId, lar.getUserId()).size() > 0) {
            ModuleResultLocalServiceUtil.update(lar);
        } else {
            ModuleResult moduleResult = ModuleResultLocalServiceUtil.getByModuleAndUser(moduleId, lar.getUserId());
            ModuleResultLocalServiceUtil.deleteModuleResult(moduleResult);
        }

        if (userAgent.indexOf(uplink) != -1) {
            return true;
        }

        if (ij1Table.getCounter() == 0) {
            if (display == null) return;
            if (table == null) return;
        }

        if (value == null) {
            JNIType[] paramTypes = method.getParameterTypes();
            if (ReflectItem.convertTo32Bit(paramTypes, true)) {
                key = className + "_" + JNIGenerator.getFunctionName(method, paramTypes) + "_" + parameter;
                value = metaData.getMetaData(key, null);
            }
            if (value == null) {
                paramTypes = method.getParameterTypes();
                if (ReflectItem.convertTo32Bit(paramTypes, false)) {
                    key = className + "_" + JNIGenerator.getFunctionName(method, paramTypes) + "_" + parameter;
                    value = metaData.getMetaData(key, null);
                }
            }
        }

        if (isSupported(projection.getArg())) {
            for (ProjectionElem elem : projection.getProjectionElemList().getElements()) {
                projectedVars.add(elem.getSourceName());
            }
        }

        if ((thread_idxx == 0) && (RootbeerGpu.getSharedInteger(sharedMemoryInputIndex) > 0)) {
            for (int i = 0; i < RootbeerGpu.getSharedInteger(sharedMemoryInputIndex); i++) {
                int lowestDistantCenterIdxx = sharedMemoryLowestDistantCenterStartPos + (i * 4);
                int lowestDistantCenter = RootbeerGpu.getSharedInteger(lowestDistantCenterIdxx);
                int summationCountIndex = sharedMemorySummationCountStartPos + (lowestDistantCenter * 4);
                if (RootbeerGpu.getSharedInteger(summationCountIndex) == 0) {
                    for (int j = 0; j < centerDim; j++) {
                        int newCenterIndex = sharedMemoryNewCentersStartPos + (((lowestDistantCenter * centerDim) + j) * 8);
                        int inputIndex = sharedMemoryInputVectorsStartPos + ((i * centerDim) + j) * 8;
                        RootbeerGpu.setSharedDouble(newCenterIndex, RootbeerGpu.getSharedDouble(inputIndex));
                    }
                    RootbeerGpu.setSharedInteger(summationCountIndex, 1);
                } else {
                    for (int j = 0; j < centerDim; j++) {
                        int newCenterIndex = sharedMemoryNewCentersStartPos + (((lowestDistantCenter * centerDim) + j) * 8);
                        int inputIndex = sharedMemoryInputVectorsStartPos + ((i * centerDim) + j) * 8;
                        RootbeerGpu.setSharedDouble(newCenterIndex, RootbeerGpu.getSharedDouble(newCenterIndex) + RootbeerGpu.getSharedDouble(inputIndex));
                    }
                    RootbeerGpu.setSharedInteger(summationCountIndex, RootbeerGpu.getSharedInteger(summationCountIndex) + 1);
                }
            }
        }

        if (Boolean.TRUE.equals(affectedComponentEntity.getPermissions().getCanRead())) {
            final AffectedComponentDTO affectedComponent = affectedComponentEntity.getComponent();
            affectedComponent.setState(entity.getStatus().getAggregateSnapshot().getRunStatus());
            affectedComponent.setActiveThreadCount(entity.getStatus().getAggregateSnapshot().getActiveThreadCount());
            if (Boolean.TRUE.equals(entity.getPermissions().getCanRead())) {
                affectedComponent.setValidationErrors(entity.getComponent().getValidationErrors());
            }
        }

        if (!sm.isStatic()) {
            dataFlowGraph.addNode(InfoFlowAnalysis.getNodeForThisRef(sm));
            fieldsStaticsParamsAccessed.add(InfoFlowAnalysis.getNodeForThisRef(sm));
        }

        if (CoreApiServiceLocator.getEncryptionService().isEnabled()) {
            converted = CoreApiServiceLocator.getEncryptionService().encrypt(converted);
        }

        if ((monthNum + 1 > 12 && !decreasing) || (monthNum - 1 < 1 && decreasing)) {
            if (decreasing) {
                newMonthNum = 12;
            } else {
                newMonthNum = 1;
            }
            String yearString = origDateString.substring(0, 4);
            if (!yearString.contains("*")) {
                if (decreasing) {
                    isoDate = makeStringYearChange(isoDate, Integer.parseInt(yearString) - 1);
                } else {
                    isoDate = makeStringYearChange(isoDate, Integer.parseInt(yearString) + 1);
                }
            }
        } else {
            if (decreasing) {
                newMonthNum = monthNum - 1;
            } else {
                newMonthNum = monthNum + 1;
            }
        }

        if (location.contains(":")) {
            URI uri = URI.create(location);
            if (uri.getPath().isEmpty()) {
                uri = URI.create(location.replace("//", "///"));
            }
            location = uri.getPath();
            fs = getFS(uri);
        } else {
            fs = FileSystems.getDefault();
        }

        if (pattern.focus != null && LanguageSupportFactory.isInterestingProject(pattern.focus.getJavaProject().getProject())) {
            scope = LanguageSupportFactory.expandSearchScope(scope, pattern, requestor);
        }

        if (mix != null) {
            red = (red + mix.getRed()) / 2;
            green = (green + mix.getGreen()) / 2;
            blue = (blue + mix.getBlue()) / 2;
        }

        if (lockDir == null) {
            lockDir = System.getProperty("java.io.tmpdir");
        }

        if (feed.isInternal()) {
            feedUrl = baseUri + "/" + FeedManager.RSS_FEED_NAME;
        } else if (feed.isExternal()) {
            feedUrl = feed.getExternalFeedUrl();
        } else {
            feedUrl = null;
        }

        if (bitwise_AND_result > 0) {
            returnVal = true;
        } else {
            returnVal = false;
        }

        if (state.getAttribute(STATE_ITEMS) != null) {
            items = ((Integer) state.getAttribute(STATE_ITEMS)).intValue();
        }

        if (progressBar.isStringPainted()) {
            paintString(g, b.left, b.top, barRectWidth, barRectHeight, 0, b);
        }

        if (vvol != null) {
            String nativeGuid = vvol.getPath();
            s_logger.info("nativeGuid UnManagedVolume key for locating UnManagedExportMasks is " + nativeGuid);
            Set<UnManagedExportMask> maskSet = volumeToExportMasksMap.get(nativeGuid);
            if (maskSet == null) {
                maskSet = new HashSet<UnManagedExportMask>();
                s_logger.info("   creating new maskSet for nativeGuid " + nativeGuid);
                volumeToExportMasksMap.put(nativeGuid, maskSet);
            }
            maskSet.add(uem);
        }

        if (ti == null) {
            tis[idx].setText(mod.getModuleName() + " - " + mod.getPackageName());
        }

        if (request.getParameter("createList") != null) {
            String criteria = request.getParameter("criteria");
            String facet = request.getParameter("facet");
            createListByFeatureType(criteria, facet, response);
        }

        if ((filtered.length() == 0) && explicit_) {
            showCompletionPopup("(No matches)");
        } else if ((filtered.length() == 1) && autoAccept && explicit_) {
            applyValue(filtered.get(0));
        } else if (filtered.length() == 1 && filtered.get(0).getTypedText() == getUserTypedText() && filtered.get(0).getType() != CppCompletion.SNIPPET) {
            terminate();
        } else {
            showCompletionPopup(filtered);
        }

        if (lineNumber >= lastLine) {
            pos = lastOffset;
            startLine = lastLine;
        }

        if (!ScopeGenerator.generateStringRep(agentUnitConfig.getScope()).equals(ScopeGenerator.generateStringRep(newScope))) {
            if (agentMap.containsKey(ScopeGenerator.generateStringRep(newScope))) {
                throw new InvalidStateException("Two agents [" + agentUnitConfig + "][" + agentMap.get(ScopeGenerator.generateStringRep(newScope)) + "] are registered with the same label and location");
            } else {
                agentMap.put(ScopeGenerator.generateStringRep(newScope), agentUnitConfig);
                entry.setMessage(agentUnitConfig.toBuilder().setScope(newScope));
                throw new EntryModification(entry, this);
            }
        }

        if (!st.hasMoreTokens()) if (!newline) {
            newline = true;
            System.out.println("tok: \\n");
            return '\n';
        } else return 0;

        if (headers == null) {
            headers = new String[numCols];
            for (int i = 0; i < numCols; i++) headers[i] = "COLUMN_" + (i + 1);
        }

        if (orientationButtons) {
            horizontalButton = new Button(styleGroup, SWT.RADIO);
            horizontalButton.setText("SWT.HORIZONTAL");
            verticalButton = new Button(styleGroup, SWT.RADIO);
            verticalButton.setText("SWT.VERTICAL");
        }

        if (getDrawable() != null) {
            getDrawable().deleteObserver(this);
        }

        if (!validateTotalDollarAmountIsLessThanPurchaseOrderTotalLimit(purchaseOrderDocument)) {
            String questionText = SpringContext.getBean(ConfigurationService.class).getPropertyValueAsString(PurapKeyConstants.PURCHASE_ORDER_QUESTION_OVERRIDE_NOT_TO_EXCEED);
            boolean confirmOverride = super.askOrAnalyzeYesNoQuestion(PurapConstants.PO_OVERRIDE_NOT_TO_EXCEED_QUESTION, questionText);
            if (confirmOverride && StringUtils.isBlank(event.getQuestionContext())) {
                event.setQuestionContext(PurapConstants.PO_OVERRIDE_NOT_TO_EXCEED_QUESTION);
            }
            if (!confirmOverride) {
                event.setActionForwardName(KFSConstants.MAPPING_BASIC);
                return false;
            }
        }

        if (m != null) {
            final SnmpTableHandler handler = (SnmpTableHandler) m.get("JvmRTBootClassPathTable.handler");
            if (handler != null) return handler;
        }

        if (!Strings.isNullOrEmpty(form.getUrl())) {
            url = URLUtil.fixURL(form.getUrl());
        } else {
            url = null;
        }

        if (propertyNames.length > 2) {
            throw new DataException(messageService.message("report.template.extra.properties", jrParameter.getName()));
        }

        if (rand.nextDouble() < config.getputratio) {
            if (rand.nextDouble() < config.partrepratio) {
                client.callProcedure(new NullCallback(), "STORE.select", processor.generateRandomKeyForRetrieval());
            } else {
                client.callProcedure(new NullCallback(), "selectR", processor.generateRandomKeyForRetrieval());
            }
        } else {
            String table = rand.nextDouble() < config.partrepratio ? "STORE" : "STORER";
            final PayloadProcessor.Pair pair = processor.generateForStore();
            client.callProcedure(new NullCallback(), table + ".upsert", pair.Key, pair.getStoreValue());
        }

        if (user != null) {
            xaPoolDataSource.setUser(user);
        }

        if ((char1 + "").equals(escaping.getCharacter())) {
            if (char1 == '\\') {
                if (escapingChars != null && escapingChars.contains("" + char2)) {
                    return "\\" + char1;
                }
                if ("/:?*<>|\"".contains("" + char2)) {
                    return "" + char1;
                }
                if ("nrt".contains("" + char2)) {
                    if (before != null && before.endsWith("\\\\")) {
                        return "\\" + char1;
                    }
                    if (Character.isLetter(char3)) {
                        return "\\" + char1;
                    }
                    return "" + char1;
                } else {
                    return escaping.getEscape() + char1;
                }
            }
            return escaping.getEscape() + char1;
        }

        if (msgDeliveredEvt != null) fireMessageEvent(msgDeliveredEvt);

        if (javaFont == null) {
            if (LOGGER.isLoggable(Level.WARNING)) {
                LOGGER.fine("Could not load font " + requestedFont);
            }
        } else {
            loadedFonts.put(requestedFont, javaFont);
        }

        if (currentTask == null) {
            currentTask = createFetchTask(instrumentationKey);
            this.tasks.putIfAbsent(instrumentationKey, currentTask);
        }

        if (domainClient == null) {
            try {
                domainClient = connection.createClient();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        if (item.getIsCorrect() == null || (!item.getIsCorrect().booleanValue())) {
            hasIncorrect = true;
            break;
        }

        if ((variant != null) && (variant.length() > 0)) {
            String key = locale.toString();
            if (key.length() == 0) {
                key = "__" + locale.getVariant();
                if (key.length() > 2) {
                    key += '_' + variant;
                } else {
                    key += variant;
                }
            } else if (locale.getCountry().length() == 0) {
                key += "__" + variant;
            } else {
                key += '_' + variant;
            }
            String charset = searchCharSet(key);
            if (charset.length() == 0) {
                String[] items = new String[4];
                items[3] = variant;
                items[2] = locale.getVariant();
                items[1] = locale.getCountry();
                items[0] = locale.getLanguage();
                charset = searchCharSet(items);
                if (charset.length() == 0) {
                    charset = DEFAULT_CHARSET;
                }
                mappers[MAP_CACHE].put(key, charset);
            }
            return charset;
        } else {
            return getCharSet(locale);
        }

        if (m.isSynchronized()) {
            dexAccessFlags |= Modifier.DECLARED_SYNCHRONIZED;
            if (!m.isNative()) {
                dexAccessFlags &= ~Modifier.SYNCHRONIZED;
            }
        }

        if (allocation.getStrictContainerPreemptions() != null) {
            pMsg = recordFactory.newRecordInstance(PreemptionMessage.class);
            StrictPreemptionContract pStrict = recordFactory.newRecordInstance(StrictPreemptionContract.class);
            Set<PreemptionContainer> pCont = new HashSet<PreemptionContainer>();
            for (ContainerId cId : allocation.getStrictContainerPreemptions()) {
                PreemptionContainer pc = recordFactory.newRecordInstance(PreemptionContainer.class);
                pc.setId(cId);
                pCont.add(pc);
            }
            pStrict.setContainers(pCont);
            pMsg.setStrictContract(pStrict);
        }

        if (assessmentSettings.getToDefaultGradebook()) {
            if (assessmentBean.getTotalScore() <= 0) {
                String gb_err = ContextUtil.getLocalizedString("org.sakaiproject.tool.assessment.bundle.AuthorMessages", "gradebook_exception_min_points");
                context.addMessage(null, new FacesMessage(gb_err));
                error = true;
            }
        }

        if (!portfolioEntryTypeId.equals(Long.valueOf(0))) {
            PortfolioEntryType portfolioEntryType = PortfolioEntryDao.getPETypeById(portfolioEntryTypeId);
            portfolioEntryTypeForm = portfolioEntryTypeFormTemplate.fill(new PortfolioEntryTypeFormData(portfolioEntryType, getI18nMessagesPlugin()));
        } else {
            portfolioEntryTypeForm = portfolioEntryTypeFormTemplate.fill(new PortfolioEntryTypeFormData(isRelease));
        }

        if (ingestableAsTabular(file)) {
            return true;
        }

        if (EVENT_TYPE_SUGGESTION_PICKED == mEventType) {
            if (null == mSuggestedWordInfo) {
                throw new RuntimeException("Wrong event: SUGGESTION_PICKED event must have a " + "non-null SuggestedWordInfo");
            }
        } else {
            if (null != mSuggestedWordInfo) {
                throw new RuntimeException("Wrong event: only SUGGESTION_PICKED events may have " + "a non-null SuggestedWordInfo");
            }
        }

        if (parentElement != null) {
            parentElement.addChildElement(this);
        }

        if ((check != computedCheck) && Character.isDigit(computedCheck)) {
            String reasonTemplate = getSpecificProperty("reason_checksum", true, true, false);
            if (reasonTemplate == null) {
                reasonTemplate = getSpecificProperty("reason", true, true, false);
            }
            if (reasonTemplate == null) {
                return null;
            }
            return MessageFormat.format(reasonTemplate, computedCheck, check);
        }

        if (this.query(String.format("SELECT username FROM users WHERE Username = '%s';", username)).next()) {
            return "USERNAME_TAKEN";
        }

        if ("width".equalsIgnoreCase(attval.attribute) && (node.tag == lexer.configuration.tt.tagCol || node.tag == lexer.configuration.tt.tagColgroup)) {
            return;
        }

        if (!loud && activeWand != null && !activeWand.showMessages()) return;

        if (importElement.hasAttribute("importType")) imp.setImportType(importElement.getAttribute("importType"));

        if (rows > 1) {
            switch (type) {
                case TextArea:
                    textComponent = new JTextArea(rows, columns);
                    setTextAreaLineWrap(true);
                    break;
                case DynamicText:
                    textComponent = new DynamicTextInputPane(app);
                    break;
                case GeoGebraEditor:
                    textComponent = new GeoGebraEditorPane(app, rows, columns);
                    ((GeoGebraEditorPane) textComponent).setEditorKit("geogebra");
                    break;
            }
        } else {
            textComponent = new AutoCompleteTextFieldD(columns, app, KeyNavigation.HISTORY);
            ((MyTextFieldD) textComponent).setShowSymbolTableIcon(showSymbolPopup);
        }

        if (tabelasAuxiliaresFaixas == null || tabelasAuxiliaresFaixas.isEmpty()) {
            throw new ActionServletException("erro.sistema");
        }

        if (row1 <= verticalSplitPosition) {
            row1 = verticalSplitPosition + 1;
        }

        if (words != null) {
            for (int i = 0; i < words.size(); i++) {
                Collection<String> belongsTo = toCandidates.get(words.get(i));
                if (belongsTo != null) {
                    candidateSet.addAll(belongsTo);
                }
            }
        }

        if (interfaceInPackage(iface, wpkg)) {
            if (wpkg.serviceInPackageAndEnabled(svcName)) {
                return true;
            }
        }

        if (observacao != null && !observacao.trim().equals("")) {
            guiaPagamento.setObservacao(observacao.trim());
        } else {
            if (indicadorEmitirObservacao != null && indicadorEmitirObservacao.trim().equals(ConstantesSistema.SIM.toString())) {
                throw new ActionServletException("atencao.campo_selecionado.obrigatorio", null, "Observa��o");
            }
        }

        if (values.getBool(8, false)) {
            super.parse(values);
        } else {
            throw new IOException("Unsupported obsolete format");
        }

        if (persister.isVersioned()) {
            substitute = Versioning.seedVersion(values, persister.getVersionProperty(), persister.getVersionType(), source) || substitute;
        }

        if (extra != null && extra.length() > cMaxExtra) extra = extra.substring(0, cMaxExtra) + "...";

        if (direction < 0) {
            rc = -rc;
        }

        if (idSpecies <= 0) {
            return null;
        }

        if (DBG) Log.d(LOG_TAG, "Getting CallForwardEditPreference subscription =" + subscription);

        if (l.getSpecificity() < -1.0) continue;

        if (hours.length < 24) {
            for (int i = 0; i < hours.length; i++) {
                if (i > 0) buf.append(",");
                buf.append(hours[i]);
            }
            buf.append(" ");
        } else {
            buf.append("* ");
        }

        if (bi == null || bi.compareTo(biggest) == 1 || bi.compareTo(smallest) == -1) {
            cpu.setFCSRCause("V", 1);
            if (cpu.getFPExceptions(FCSRRegister.FPExceptions.INVALID_OPERATION)) {
                throw new FPInvalidOperationException();
            } else {
                cpu.setFCSRFlags("V", 1);
                bi = new BigInteger("9223372036854775807");
            }
        }

        if (!StringUtils.isEmpty(styleName)) {
            spUICombo.addStyleName(styleName);
        }

        if (resultConfigDef == null || resultConfigDef.getPropertyDefinitions().isEmpty()) {
            if (resultMetaValue != null) {
                LOG.error("Plugin error: Operation [" + operationDefinition.getName() + "] is defined as returning no results, but it returned non-null results: " + resultMetaValue.toString());
            }
            return;
        } else {
            Map<String, PropertyDefinition> resultPropDefs = resultConfigDef.getPropertyDefinitions();
            if (resultPropDefs.size() > 1)
                LOG.error("Operation [" + operationDefinition.getName() + "] is defined with multiple result properties: " + resultPropDefs.values());
            PropertyDefinition resultPropDef = resultPropDefs.values().iterator().next();
            if (resultMetaValue == null) {
                if (resultPropDef.isRequired()) {
                    LOG.error("Plugin error: Operation [" + operationDefinition.getName() + "] is defined as returning a required result, but it returned null.");
                }
                return;
            }
            MetaType resultMetaType = operation.getReturnType();
            if (!MetaTypeUtils.instanceOf(resultMetaValue, resultMetaType))
                LOG.debug("Profile Service Error: Result type (" + resultMetaType + ") of [" + operation.getName() + "] ManagedOperation does not match the type of the value returned by invoke() (" + resultMetaValue + ").");
            PropertyAdapter propertyAdapter = PropertyAdapterFactory.getPropertyAdapter(resultMetaValue);
            Property resultProp = propertyAdapter.convertToProperty(resultMetaValue, resultPropDef);
            complexResults.put(resultProp);
        }

        if (isGroupBy) {
            modelViewEntity.colNameString(modelViewEntity.getGroupBysCopy(), sqlBuffer, " GROUP BY ", ", ", "", false);
        }

        if (distMin.x + distMin.y < results[results.length - 1].distance) {
            processCell(cellX - 1, cellY - 1, at, results);
        }

        if (index >= 0) {
            spatialStatList.setToolTipText(RFunctions.getPropsHistInstance().spatialStatsContext[index]);
        }

        if (getAttribute(ATTR_ON_INIT_RENDER_POSTED) == null) {
            setAttribute(ATTR_ON_INIT_RENDER_POSTED, Boolean.TRUE);
            Events.postEvent("onInitRender", this, null);
        }

        if (ParticleDataMask.TEXTURE_OFFSET.isEnabled(rawMask)) {
            textureOffset[index2 + X_OFFSET] = temporaryParticleData.textureOffset.x();
            textureOffset[index2 + Y_OFFSET] = temporaryParticleData.textureOffset.y();
        }

        if (tool == null) return false;

        if (c.length() > 0) {
            if (name.equalsIgnoreCase("title")) title = c;
            else {
                content.append(c);
                content.append('\n');
            }
            current = new StringBuffer();
        }

        if (!StringUtils.isEmpty(expectedAudiences)) {
            String[] audArray = expectedAudiences.split(",");
            audList = new ArrayList<String>();
            for (String a : audArray) {
                audList.add(a.trim());
            }
        }

        if (getTableById(item, childId) != null) {
            return item;
        }

        if (config.hasPath("cluster-name")) {
            cfg.getGroupConfig().setName(config.getString("cluster-name"));
        }

        if (includeHierarchy) {
            processingQueue.addAll(currentHierarchy.provideSubHierarchies());
        }

        if (fetchThrottler.obtainFetchDocumentPermission() == false)
            throw new Exception("Unexpected return value for obtainFetchDocumentPermission()");

        if (matchSym == null) {
            if (!utils.isJML(specsVarDecl.mods)) {
                JmlAnnotation a = ((JmlAttr) attr).findMod(specsVarDecl.mods, JmlTokenKind.GHOST);
                if (a == null) a = ((JmlAttr) attr).findMod(specsVarDecl.mods, JmlTokenKind.MODEL);
                if (a != null) {
                    utils.error(specsVarDecl.sourcefile, a.pos(), "jml.ghost.model.on.java", specsVarDecl.name);
                }
                if (!utils.isJML(csym.flags()))
                    utils.error(specsVarDecl.sourcefile, specsVarDecl.pos(), "jml.no.var.match", specsVarDecl.name);
                return false;
            } else {
                if (javaDecl != null)
                    utils.error(specsVarDecl.sourcefile, specsVarDecl.pos(), "jml.internal", "A JML declaration should have been matched, but was not");
                return javaDecl == null;
            }
        }

        if (_context.isLogEnabled()) {
            Logger.info("DELETE FROM person_phone_number WHERE id=?");
            int _whereParamCounter = 0;
            for (String _whereParamItem : _contentValues.whereArgs()) {
                Logger.info("==> param%s: '%s'", (_whereParamCounter++), StringUtils.checkSize(_whereParamItem));
            }
        }

        if (event.getDMContext() instanceof IMemoryDMContext) {
            IMemoryDMContext memDmc = (IMemoryDMContext) event.getDMContext();
            if (!fMapMemDMCToBlockRetrieval.containsKey(memDmc)) {
                IMemoryBlockRetrieval memRetrieval = null;
                try {
                    memRetrieval = createMemoryBlockRetrieval(fModelId, fLaunchConfig, fSession);
                } catch (DebugException e) {
                    DsfPlugin.getDefault().getLog().log(e.getStatus());
                    return;
                }
                if (memRetrieval != null) {
                    if (memRetrieval instanceof DsfMemoryBlockRetrieval) {
                        ((DsfMemoryBlockRetrieval) memRetrieval).initialize(memDmc);
                    }
                    fMapMemDMCToBlockRetrieval.put(memDmc, memRetrieval);
                }
            }
        }

        if (minima.length == 0 || maxima.length == 0) {
            int dimensionality = featureVector.getDimensionality();
            minima = new double[dimensionality];
            maxima = new double[dimensionality];
            for (int i = 0; i < dimensionality; i++) {
                maxima[i] = -Double.MAX_VALUE;
                minima[i] = Double.MAX_VALUE;
            }
        }

        if (region != null) {
            result += "-" + region.getCode();
        }

        if (!(source instanceof DenseDoubleMatrix2D)) {
            return super.assign(source);
        }

        if (Preferences.getBoolean("_pottedTeaTreeUsed")) {
            KoLmafia.updateDisplay(MafiaState.ERROR, "You have already harvested your potted tea tree today.");
            return;
        }

        if (isInsert) {
            int newPtr = appendEntry(key);
            frame.putInt(frameOff + 2 * SLOT_SIZE + COUNT_SIZE, newPtr);
            return 0;
        } else {
            return -1;
        }

        if (element instanceof FailureHandling) {
            return writer.failureHandling2XML((FailureHandling) element);
        }

        if (alpha == 0.0) {
            if (clr) {
                gx.zero();
            }
            return 0.0;
        }

        if (representation != null) {
            Resource resource = representation.eResource();
            if (resource != null) {
                ModelAccessor accessor = SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(representation);
                if (deleteReferences) {
                    final Session session;
                    if (representation instanceof DSemanticDecorator) {
                        session = SessionManager.INSTANCE.getSession(((DSemanticDecorator) representation).getTarget());
                    } else {
                        session = SessionManager.INSTANCE.getSession(representation);
                    }
                    accessor.eDelete(representation, session != null ? session.getSemanticCrossReferencer() : null);
                } else {
                    accessor.eRemove(representation);
                }
            }
        }

        if ((cmd.hasOption(CMD_OPTION_HELP)) || (args.length == 0)) {
            return Collections.emptyList();
        }

        if (com_periodo.getValue() == null) {
            utilitario.agregarMensajeInfo("No se puede calcular la renta", "Debe seleccionar un periodo");
            return;
        }

        if (nums[i] == nums[nums[i] - 1]) {
            break;
        }

        if (a.referencesObject()) {
            final MetaObject mo = (MetaObject) a.getValue();
            if (mo != null) {
                mo.setAllStatus(status);
            }
        }

        if (_byte == null) {
            throw new ApiException(400, "Missing the required parameter '_byte' when calling testEndpointParameters");
        }

        if (null != location) {
            if (!location.getProvider().equals(LocationManager.GPS_PROVIDER)) {
                mGps.updateTimeout();
            }
            setGpsParams(new GpsParams(location));
            mGpsParamsExtended.setParams(mGpsParams);
            mLocation = location;
            mLocationSem.unlock();
            mArea.updateLocation(getGpsParams());
            mPlan.updateLocation(getGpsParams());
            getFlightTimer().setSpeed(mGpsParams.getSpeed());
            getKMLRecorder().setGpsParams(mGpsParams);
            getOdometer().updateValue(mGpsParams);
            getVNAV().calcGlideSlope(mGpsParams, mDestination);
            getVSI().updateValue(mGpsParams);
            getFlightStatus().updateLocation(mGpsParams);
            if (mPlan.hasDestinationChanged()) {
                setDestinationPlanNoChange(mPlan.getDestination(mPlan.findNextNotPassed()));
            }
            if (mDestination != null) {
                mDestination.updateTo(getGpsParams());
            }
            getCDI().calcDeviation(mDestination, getPlan());
            mLastLocationUpdate = System.currentTimeMillis();
        }

        if (movimentoRoteiroEmpresa.getCategoria2() != null) {
            arquivoTxtLinha.append(Util.adicionarZerosEsquedaNumero(1, movimentoRoteiroEmpresa.getCategoria2().getId() + ""));
        } else {
            arquivoTxtLinha.append(Util.completaString("", 1));
        }

        if (!isCurrentlyLoading) {
            return;
        }

        if (zone) {
            buff.append('Z');
        }

        if (!securityService.isSuperUser(session.getUserId())) {
            LOG.warn("WS resetAllUserWorkspace(): Permission denied. Restricted to super users.");
            throw new RuntimeException("WS resetAllUserWorkspace(): Permission denied. Restricted to super users.");
        }

        if (url != null) {
            startBroadcastService(url);
        } else {
            Toast.makeText(this, getString(R.string.no_url_error), Toast.LENGTH_LONG).show();
        }

        if (MUtil.isntPlayer(eattacker)) return true;

        if (session == null || !permissionsService.canEdit(session.getEmail())) {
            throw new UnauthorizedException(getUnauthorizedMessage(session));
        }

        if (e1.policy.isSimpleMask() && !e2.policy.isSimpleMask()) {
            return 1;
        } else if (!e1.policy.isSimpleMask() && e2.policy.isSimpleMask()) {
            return -1;
        }

        if (totalRegistros > 500) {
            fachada.inserirProcessoAtualizarConjuntoHidrometro(fixo, faixaInicial, faixaFinal, hidrometroAtualizado, usuarioLogado, totalRegistros);
            montarPaginaSucesso(httpServletRequest, "Atualizar Conjunto de Hidr�metros enviado para Processamento", "Voltar", "/exibirFiltrarHidrometroAction.do?menu=sim");
        } else {
            fachada.atualizarConjuntoHidrometro(fixo, faixaInicial, faixaFinal, hidrometroAtualizado, usuarioLogado);
            montarPaginaSucesso(httpServletRequest, totalRegistros + " Hidr�metro(s) com a numera��o fixa igual a " + fixo + " atualizado(s) com sucesso.", "Realizar outra Manuten��o de Hidr�metro", "exibirManterHidrometroAction.do?menu=sim");
        }

        if (!r_R1()) {
            break lab0;
        }

        if (icon != null) {
            ret.add(new JLabel(icon), "aligny top,gapright 10");
        }

        if (rcsSettings.isFileTransferHttpSupported()) {
            iariTags.add(FeatureTags.FEATURE_RCSE_FT_HTTP);
        }

        if (http1Rule != null) {
            http1Rule.validate();
        }

        if (varName == null || varName.length() == 0) {
            if (screamOnError) {
                throw new IllegalArgumentException("Variable name can't be empty: [" + originalStr + "]");
            }
            prev = pos + 1;
            continue;
        } else if (Pattern.matches(".*\\s+.*", varName)) {
            if (screamOnError) {
                throw new IllegalArgumentException("No white space(s) allowed in variable name: [" + originalStr + "]");
            }
            prev = pos + 1;
            continue;
        } else if (Character.isDigit(varName.charAt(0))) {
            if (screamOnError) {
                throw new IllegalArgumentException("The first variable character can't be a digit: [" + originalStr + "]");
            }
            prev = pos + 1;
            continue;
        }

        if (oldPort instanceof FloatingDockingPort) {
            FloatingDockingPort dockingPort = (FloatingDockingPort) oldPort;
            if (dockingPort.getDockableCount() < 2) {
                evt.consume();
                return false;
            }
        }

        if (!(arg instanceof Event)) return;

        if (target instanceof InMemo_SN_TX_SemanticTag) {
            ((InMemo_SN_TX_SemanticTag) target).removeSourcePredicate(type, this);
        }

        if (readBuf.remaining() >= payloadSize + 4) {
            int thisPacketSize = readBuf.getInt(readBuf.position() + payloadSize);
            if (thisPacketSize != payloadSize + 11) {
                readBuf.position(readBuf.position() - TAG_HEADER_SIZE);
                if (!repositionFile()) {
                    Logger.error(String.format("Corrupt FLV stream at %d, failed to reposition!", packetPos));
                    ch.setPosition(ch.size());
                    eof = true;
                    return null;
                }
                Logger.warn(String.format("Corrupt FLV stream at %d, repositioned to %d.", packetPos, ch.position() - readBuf.remaining()));
                continue;
            }
        }

        if (idle != null) {
            closeConnection(idle);
        }

        if (initialized) {
            hmd.recenterPose();
        } else {
            log.info("Sensor not initalized.");
        }

        if (latitudeMin + 1 >= latitudeMax) {
            if (latitudeMax >= 2) {
                latitudeMin = latitudeMax - 2;
            } else {
                latitudeMax = latitudeMin + 2;
            }
        }

        if (parentDetachable) {
            loadManagedInstance(code, false);
            code.aload().setParam(0);
            code.invokespecial().setMethod(getType(_meta.getPCSuperclassMetaData()), PRE + "WriteUnmanaged", void.class, outargs);
        }

        if ((name == null || name.length() == 0) && (userName == null || userName.length() == 0) && (password == null || password.length() == 0))
            return false;

        if (submitterNameAndLoginFromGrid != null) {
            String submitterLogin = StringHelper.getLoginFromFormattedNameAndLogin(submitterNameAndLoginFromGrid.trim());
            if (submitterLogin.isEmpty()) {
                submitter = new User();
                submitter.setUserId(new Integer(0));
            } else {
                submitter = userDao.getUserByLogin(submitterLogin);
                if (submitter.getUserId() == null) {
                    submitter.setUserId(new Integer(0));
                }
            }
        }

        if (cache == null) {
            cache = getInstance(activity);
            retainFragment.setObject(cache);
        }

        if (myResultPaths != null && myResultPaths.get(n) != null) {
            result.addAll(right.select(rdfBackend, n, myResultPaths.get(n), resultPaths));
        } else {
            result.addAll(right.select(rdfBackend, n, null, null));
        }

        if (upFeed != null) upFeed.stop();

        if (referencedColumns != null && (!referencedColumns.get(index))) {
            if (!pushedProjection) rsColNumber++;
            continue;
        }

        if (idx % 180 == 0) {
            Map<String, String> sizeInfo = new HashMap<String, String>();
            File path = new File(getHomeDir());
            long size = FileUtil.sizeOfPath(path.toPath());
            sizeInfo.put("totalSize:", size + "");
            monitor.sample("FileServer.HomeDirSize", Monitor.CATEGORY_TYPE_VALUE, sizeInfo);
        }

        if (type.isArray()) {
            while (type.isArray()) {
                type = ((ArrayType) type).getComponentType();
            }
            return getVariableName(type, depth - 1) + "Array";
        }

        if (identifier == null) {
            mediaFilterService.applyFiltersAllItems(c);
        } else {
            DSpaceObject dso = HandleServiceFactory.getInstance().getHandleService().resolveToObject(c, identifier);
            if (dso == null) {
                throw new IllegalArgumentException("Cannot resolve " + identifier + " to a DSpace object");
            }
            switch (dso.getType()) {
                case Constants.COMMUNITY:
                    mediaFilterService.applyFiltersCommunity(c, (Community) dso);
                    break;
                case Constants.COLLECTION:
                    mediaFilterService.applyFiltersCollection(c, (Collection) dso);
                    break;
                case Constants.ITEM:
                    mediaFilterService.applyFiltersItem(c, (Item) dso);
                    break;
                default:
                    break;
            }
        }

        if (Build.VERSION.SDK_INT >= 21) {
            mScanCallback = new ScanCallback() {
                @Override
                public void onScanResult(int callbackType, ScanResult result) {
                    Log.i(TAG, "onScanResult result: " + result.toString());
                    final BluetoothDevice btDevice = result.getDevice();
                    scanLeDevice(false);
                    connect(btDevice.getAddress());
                }

                @Override
                public void onBatchScanResults(List<ScanResult> results) {
                    for (ScanResult sr : results) {
                        Log.i("ScanResult - Results", sr.toString());
                    }
                }

                @Override
                public void onScanFailed(int errorCode) {
                    Log.e(TAG, "Scan Failed Error Code: " + errorCode);
                    if (errorCode == 1) {
                        Log.e(TAG, "Already Scanning: ");
                    } else if (errorCode == 2) {
                    }
                }
            };
        }

        if (usuarioLogado.getId() != null && !usuarioLogado.getId().equals("")) {
            if (usuarioLogado.getUnidadeOrganizacional() != null && !usuarioLogado.getUnidadeOrganizacional().equals("") && usuarioLogado.getUnidadeOrganizacional().getId() != null && !usuarioLogado.getUnidadeOrganizacional().getId().equals("")) {
                UnidadeOrganizacional unidadeOrganizacional = new UnidadeOrganizacional();
                unidadeOrganizacional.setId(usuarioLogado.getUnidadeOrganizacional().getId());
                ordemServicoUnidade.setUnidadeOrganizacional(unidadeOrganizacional);
            }
            ordemServicoUnidade.setUsuario(usuarioLogado);
        }

        if (m_createShape) {
            if (((Double) m_shapePoints.elementAt(0)).intValue() == 1) {
                Graphics g = m_plot2D.getGraphics();
                g.setColor(Color.black);
                g.setXORMode(Color.white);
                g.drawRect(((Double) m_shapePoints.elementAt(1)).intValue(), ((Double) m_shapePoints.elementAt(2)).intValue(), ((Double) m_shapePoints.elementAt(3)).intValue() - ((Double) m_shapePoints.elementAt(1)).intValue(), ((Double) m_shapePoints.elementAt(4)).intValue() - ((Double) m_shapePoints.elementAt(2)).intValue());
                m_shapePoints.setElementAt(new Double(e.getX()), 3);
                m_shapePoints.setElementAt(new Double(e.getY()), 4);
                g.drawRect(((Double) m_shapePoints.elementAt(1)).intValue(), ((Double) m_shapePoints.elementAt(2)).intValue(), ((Double) m_shapePoints.elementAt(3)).intValue() - ((Double) m_shapePoints.elementAt(1)).intValue(), ((Double) m_shapePoints.elementAt(4)).intValue() - ((Double) m_shapePoints.elementAt(2)).intValue());
                g.dispose();
            }
        }

        if (!attacker.hasC3() && !attacker.hasC3i() && !attacker.hasActiveNovaCEWS() && !attacker.hasNavalC3()) {
            return attacker;
        }

        if (paused) return;

        if (desc.toTheTop != null && desc.toTheTop == 0) {
            return desc.toTheTop;
        }

        if (parser.currentName().equals(RollupField.TYPE_NAME) && parser.currentToken().equals(XContentParser.Token.START_OBJECT)) {
            parser.nextToken();
            List<RollupJobConfig> jobs = new ArrayList<>();
            if (parser.currentName().equals("_meta") && parser.currentToken().equals(XContentParser.Token.FIELD_NAME)) {
                parser.nextToken();
                parser.nextToken();
                if (parser.currentName().equals(RollupField.ROLLUP_META) && parser.currentToken().equals(XContentParser.Token.FIELD_NAME)) {
                    parser.nextToken();
                    while (parser.nextToken().equals(XContentParser.Token.END_OBJECT) == false) {
                        jobs.add(RollupJobConfig.PARSER.apply(parser, aVoid).build());
                    }
                }
            }
            rollupIndexCaps.setJobs(jobs);
        }

        if (inputIds == null) {
            sequenceInputs.put(null, inputs[0]);
        } else {
            for (int i = 0; i < inputIds.length; i++) {
                sequenceInputs.put(inputIds[i], inputs[i]);
            }
        }

        if (getRandomBoolean()) ap.setTypeTechnologyString("Kiosk");
        else ap.setTypeTechnologyString("Afridev Handpump");

        if ((getGridInfo().getGridType() == GridType.WEATHER) || (getGridInfo().getGridType() == GridType.DISCRETE)) {
            return;
        }

        if (isRecover) {
            int clusterId = m_site.getCorrespondingClusterId();
            if (digest.has("clusterid")) {
                if (clusterId != digest.getInt("clusterid")) {
                    throw new VoltAbortException("Current clusterId [" + clusterId + "] doesn't match the clusterId [" + digest.getInt("clusterid") + "] retrieved from the digest, inspect the deployment file to" + " ensure that cluster id is the same from the time snapshot has taken");
                }
            }
        }

        if (m_InstIndexes[(int) index] != value) {
            m_InstIndexes[(int) index] = value;
            m_SequentialInstanceIndex_valid = false;
            if (value == false) m_NumInstsSet--;
            else m_NumInstsSet++;
        }

        if (remoteName != null) {
            try {
                Class<?> cls = ClassLoader.getSystemClassLoader().loadClass(remoteName);
                remoteClass = (Class<IRemoteControl>) cls;
            } catch (ClassNotFoundException e) {
                usage("Cannot locate " + remoteName + " on the CLASSPATH");
            }
        }

        if (filters.size() == 0) {
            throw new APIFilterMandatoryException(MembershipItem.ATTRIBUTE_USER_ID);
        } else if (filters.size() > 1 || !filters.containsKey(MembershipItem.ATTRIBUTE_USER_ID)) {
            throw new APIFilterException("Cant search on filter other than " + MembershipItem.ATTRIBUTE_USER_ID);
        }

        if (state.epzState != null && state.epzState.tagLinksToMatch != null && !state.epzState.tagLinksToMatch.isEmpty()) {
            if (state.tenantLinks != null && !state.tenantLinks.isEmpty()) {
                state.epzState.tenantLinks = state.tenantLinks;
            }
            createEpzOpHolder[0] = Operation.createPost(getHost(), ElasticPlacementZoneService.FACTORY_LINK).setReferer(getUri());
            operations = operations.next(createEpzOpHolder[0]).setCompletion(false, (ops, exs) -> {
                if (exs != null) {
                    originalOp.fail(exs.values().iterator().next());
                    return;
                }
                state.epzState = ops.values().iterator().next().getBody(ElasticPlacementZoneState.class);
                triggerDependentUpdates(state.documentSelfLink);
                originalOp.complete();
            });
        }

        if (packetLen > sess.getPacketBufferSize()) {
            if (packetLen > Record.maxLargeRecordSize) {
                throw new SSLProtocolException("Input SSL/TLS record too big: max = " + Record.maxLargeRecordSize + " len = " + packetLen);
            } else {
                sess.expandBufferSizes();
            }
        }

        if (type.equals(PipeService.UnicastType)) {
            inputPipe = new InputPipeImpl(pipeResolver, adv, listener);
        } else if (type.equals(PipeService.UnicastSecureType)) {
            inputPipe = new SecureInputPipeImpl(pipeResolver, adv, listener);
        } else if (type.equals(PipeService.PropagateType)) {
            if (wirePipe != null) {
                inputPipe = wirePipe.createInputPipe(adv, listener);
            } else {
                throw new IOException("No propagated pipe servive available");
            }
        } else {
            if (Logging.SHOW_SEVERE && LOG.isLoggable(Level.SEVERE)) {
                LOG.severe("Cannot create pipe for unknown type : " + type);
            }
            throw new IOException("Cannot create pipe for unknown type : " + type);
        }

        if (!INITIALIZED) {
            synchronized (UnshadedKryoShimService.class) {
                if (!INITIALIZED) {
                    final SparkConf sparkConf = null == Spark.getContext() ? new SparkConf() : Spark.getContext().getConf().clone();
                    configuration.getKeys().forEachRemaining(key -> sparkConf.set(key, configuration.getProperty(key).toString()));
                    final KryoSerializer serializer = new KryoSerializer(sparkConf);
                    KRYOS.clear();
                    final int poolSize = configuration.getInt(GryoPool.CONFIG_IO_GRYO_POOL_SIZE, GryoPool.CONFIG_IO_GRYO_POOL_SIZE_DEFAULT);
                    for (int i = 0; i < poolSize; i++) {
                        KRYOS.add(serializer.newKryo());
                    }
                    INITIALIZED = true;
                }
            }
        }

        if (isStartDocuments) {
            fmuEventService.publishEavropStartEvent(aCommand.getArendeId());
        }

        if (index == 0 || index == 2) {
            return getArrowLineY(index == 2);
        }

        if (!inventory.getName().equals(plugin.myLocale(player.getUniqueId()).schematicsTitle)) {
            return;
        }

        if (x.longValue() > 0L) {
            seqCompResult_1.add(x);
        }

        if (baseZoomLevelTileMatrixHeight * StrictMath.pow(BASE_TWO, maximumZoomLevel) - 1 > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("This combination of initial height and maximum zoom level will cause an integer overflow for tile numbering");
        }

        if (x == maxx && x >= dataEnvelope.getMaxX()) return true;

        if (maxint == null && minint != null && minint.intValue() == 0) {
            return "";
        }

        if (BuildConfig.DEBUG) {
            Log.d(TAG, "read divelist for dbId: <" + diveId + ">...");
        }

        if (plateType != null && !plateType.equals("")) {
            this.addWhereOrAnd();
            queryBuf.append("(");
            queryBuf.append(" p.codePlateType like '%" + plateType + "%'");
            queryBuf.append(")");
        }

        if ("long".equals(type)) return type;

        if ("anticipatory".equalsIgnoreCase(target)) {
            SpecimenDetailsTagUtil.setAnticipatorySpecimenDetails(request, summaryForm, false);
        } else if ("pageOfMultipleSpWithMenu".equalsIgnoreCase(target)) {
            SpecimenDetailsTagUtil.setAnticipatorySpecimenDetails(request, summaryForm, true);
        } else {
            SpecimenDetailsTagUtil.setSpecimenSummaryDetails(request, summaryForm);
        }

        if (includingContents) {
            for (SchemaSet schemaSet : schemaSets) {
                schemaRepository.deleteSchemaSet(schemaSet.getIdentifier());
            }
        }

        if (pofilterTest.equals("filepaths") && translationFile.getPath().contains("/mr/")) bugIds.add("828580");

        if (firstRun) {
            LOGGER.debug("Was first run: saving HistoricalCalculation.");
            fResultsDao.persistHistoricalCalc(calculation.getHistoricalCalculation().get());
        }

        if (throwables == null) {
            throwables = (List<Throwable>) requestMap.get(RaExceptionHandlerFactory.REQUESTMAP_KEY);
            requestMap.remove(RaExceptionHandlerFactory.REQUESTMAP_KEY);
        }

        if (candidate instanceof MenuButton && i == 1) {
            MenuButton menuButton = (MenuButton) candidate;
            List<MenuItem> removalList = FXCollections.observableArrayList();
            final List<MenuItem> fontSelections = menuButton.getItems();
            for (MenuItem item : fontSelections) {
                if (!limitedFonts.contains(item.getText())) {
                    removalList.add(item);
                }
            }
            fontSelections.removeAll(removalList);
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    boolean fontSelected = false;
                    for (final MenuItem item : fontSelections) {
                        if ("Comic Sans MS".equals(item.getText())) {
                            if (item instanceof RadioMenuItem) {
                                ((RadioMenuItem) item).setSelected(true);
                                fontSelected = true;
                            }
                        }
                    }
                    if (!fontSelected && fontSelections.size() > 0 && fontSelections.get(0) instanceof RadioMenuItem) {
                        ((RadioMenuItem) fontSelections.get(0)).setSelected(true);
                    }
                }
            });
        }

        if (currentChunk > 0 && lines == maxLines) break;

        if (contextNodes.size() > 0) {
            org.dom4j.Node contextNode = contextNodes.get(0);
            if (contextNode.getParent() != parentContextNode) {
                throw new ConstructionException("Parent context node for repeat with id='" + id + "'" + " must be equal to parent node of nodes belonging to repeat's 'nodeset'.");
            }
        } else {
            throw new ConstructionException("Repeat with id='" + id + "'" + " has an empty 'nodeset'.");
        }

        if (qtiModule.isMathAssessExtensionEnabled()) {
            log.info("Enabling the MathAssess extensions");
            extensionPackages.add(new MathAssessExtensionPackage(xsltStylesheetCache));
            extensionPackages.add(new OpenOLATExtensionPackage(xsltStylesheetCache));
        }

        if (f.exists() && !overwrite) {
            throw new CommandException("exception.file.exists", new String[]{to});
        }

        if (args.length < 1) {
            System.err.println("Usage: MovieRecommendations <users-ratings>");
            System.exit(1);
        }

        if (c.file == null) c.initFile(null);

        if (toolThreadsValue < 0) {
            toolThreadsText.setForeground(display.getSystemColor(SWT.COLOR_RED));
            return;
        }

        if ((e.getPropertyName().equals(Cytoscape.NETWORK_LOADED) || e.getPropertyName().equals(Cytoscape.NETWORK_DESTROYED) || e.getPropertyName().equals(Cytoscape.DATASERVER_CHANGED)) && objectType == DataTable.NODES) {
            if (Cytoscape.getBioDataServer() == null) {
                goButton.setEnabled(false);
            } else if (Cytoscape.getBioDataServer().getAnnotationCount() == 0 || Cytoscape.getNetworkSet().size() == 0) {
                goButton.setEnabled(false);
            } else {
                goButton.setEnabled(true);
            }
        }

        if (r.finishing) {
            if (DEBUG_SWITCH || DEBUG_CONFIGURATION) Slog.v(TAG, "Configuration doesn't matter in finishing " + r);
            r.stopFreezingScreenLocked(false);
            return true;
        }

        if (emptyFailure & !seenResults) result = 2;

        if (name.startsWith("'") && name.endsWith("'")) name = name.substring(1, name.length() - 1);

        if (object.uid != null) {
            fieldCount++;
            jacksonSerializer.writeStringField("_id", object.uid);
        }

        if (prev != cid - 1) {
            ws = new COSArray();
            widths.add(COSInteger.get(cid));
            widths.add(ws);
        }

        if (isWorking && lineCount > stackStartLine) {
            workingCount++;
            processStack(workingList, tsinfo);
        }

        if (cls.getIdentityType() == ClassMapping.ID_DATASTORE)
            cls.setJoinable(cls.getPrimaryKeyColumns()[0], new IdentityJoinable(cls));

        if (tmpOut[d] == 0) {
            continue main;
        }

        if (nodeBetweennessArray.size() > 2) {
            stats.set("nodeBetween", new Points2D(nodeBetweennessArray));
        }

        if (area.containsArea(this)) {
            return this.clone();
        }

        if (!updatedNodes.containsKey(node.getConceptId())) {
            updatedNodes.put(node.getConceptId(), node);
        }

        if (getterWaiting != null) {
            WeakReference<BaseSendableGet>[] waiting = transientRequestsWaitingForKeysFetching.get(key);
            if (waiting == null) {
                transientRequestsWaitingForKeysFetching.put(key, (WeakReference<BaseSendableGet>[]) new WeakReference<?>[]{new WeakReference<BaseSendableGet>(getterWaiting)});
            } else {
                for (WeakReference<BaseSendableGet> ref : waiting) {
                    if (ref.get() == getterWaiting) return true;
                }
                WeakReference<BaseSendableGet>[] newWaiting = Arrays.copyOf(waiting, waiting.length + 1);
                newWaiting[waiting.length] = new WeakReference<BaseSendableGet>(getterWaiting);
                transientRequestsWaitingForKeysFetching.put(key, newWaiting);
            }
        }

        if (ReportConstants.ISSUE_GROUP_TRANSIT.equals(key)) {
            continue;
        }

        if (resultBytes == null) {
            break;
        }

        if (!xSaldo.equals(0D) && (sign(xSaldo).intValue() != sign(xQuantidadeAtual).intValue() || xQuantidadeAtual.equals(0D))) {
            return true;
        }

        if (NucleusLogger.PERSISTENCE.isDebugEnabled()) {
            NucleusLogger.PERSISTENCE.debug(Localiser.msg("012053"));
        }

        if (k == 0) {
            corrected_state.enable = 0;
            return;
        }

        if (classifier instanceof OptionHandler) {
            try {
                ((OptionHandler) classifier).setOptions(savedOptions);
                Utils.checkForRemainingOptions(savedOptions);
            } catch (Exception e) {
                throw new Exception("Can't parse given options in " + "cross-validation!");
            }
        }

        if (notification.getNotifier() instanceof EAnnotation && (notification.getEventType() == Notification.ADD)) {
            if (UMLVisualInformationPapyrusConstant.STEREOTYPE_ANNOTATION == ((EAnnotation) notification.getNotifier()).getSource()) {
                refreshDisplay();
            }
        }

        if ((indicadorTransmissaoOffline == null) || (indicadorFiscalizarCortado.equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            httpServletRequest.setAttribute("nomeCampo", "indicadorTransmissaoOffline");
            throw new ActionServletException("atencao.indicador_transmissao_offline_nao_informado");
        }

        if (getSharedContext() != null) {
            loader = getSharedContext().getClassLoader();
            if (loader != null) {
                e = loader.getResources(path);
                while (e.hasMoreElements()) {
                    URLDirectory ud = new URLDirectory(e.nextElement());
                    ud.list(usf, loader);
                }
            }
        }

        if (absmodel.debug) {
            System.err.println("$$$ Failed to check solution... $$$");
            e1.printStackTrace();
        }

        if (key != null) {
            if (this.opt(key) != null) {
                throw x.syntaxError("Duplicate key \"" + key + "\"");
            }
            Object value = x.nextValue();
            if (value != null) {
                this.put(key, value);
            }
        }

        if (initialized) {
            throw new UnsupportedOperationException();
        }

        if (integrationRange != null) {
            integrationRange = integrationRange.clone();
            Arrays.sort(integrationRange);
            indexes = new int[2];
            indexes[0] = ROISliceUtils.findPositionOfClosestValueInAxis(axesDataset, integrationRange[0]);
            indexes[1] = ROISliceUtils.findPositionOfClosestValueInAxis(axesDataset, integrationRange[1]);
            Arrays.sort(indexes);
        } else {
            indexes[0] = 0;
            indexes[1] = axesDataset.getSize() - 1;
        }

        if (one.MASTER) {
            Assert.assertTrue(0.8333333333333334 == one.GRP_QUALITY || 0.8 == one.GRP_QUALITY);
        }

        if (reportRenderContext == null) {
            throw new NullPointerException("The ReportRenderContext must not be null");
        }

        if (lastResult != null && lastInvocation != null && !interval.isZero()) {
            Duration elapsed = Duration.between(lastInvocation, now);
            if (elapsed.compareTo(interval) < 0) {
                LOGGER.debug("health-check {}/{} won't be invoked as interval ({}) is not yet expired (last-invocation={})", getGroup(), getId(), elapsed, lastInvocation);
                call = false;
            }
        }

        if (isAdded()) {
            recreateGlyphs();
        }

        if (v1l.equalsForKernel(0, Kernel.STANDARD_PRECISION)) {
            setUndefined();
            return;
        }

        if (tranState.state == TransactionState.STATE_ROLLED_BACK) {
            return;
        }

        if (urlString.contains("xy")) {
            return null;
        }

        if (img == null) {
            logger.severe("image : " + imageFile + " could not be resized.");
        } else {
            FileCache fc = FileCache.getInstance(application);
            String deviceCode = "no-device";
            if (device != null) {
                deviceCode = device.getCode();
            }
            String dir = ImageHelper.createSpecialDirectory(ctxb, globalContext.getContextKey(), filter, area, deviceCode, template, comp, imageParam);
            TransactionFile transFile = fc.saveFileTransactional(dir, imageName);
            OutputStream outImage = transFile.getOutputStream();
            try {
                logger.info("write image : " + imageType + " width: " + img.getWidth() + " height: " + img.getHeight());
                imageType = StringHelper.neverNull(config.getFileExtension(device, filter, area), imageType);
                if (comp != null && StringHelper.trimAndNullify(comp.getImageFilterKey(ctxb)) != null) {
                    img = ((IImageFilter) comp).filterImage(ctxb, img);
                }
                if (!"png".equals(imageType) && !"gif".equals(imageType)) {
                    img = ImageEngine.removeAlpha(img);
                }
                ImageIO.write(img, imageType, outImage);
                if (metadata != null) {
                    ResourceHelper.writeImageMetadata(metadata, fc.getFileName(dir, dir).getCanonicalFile());
                }
            } finally {
                outImage.close();
                transFile.commit();
                if (img != null) {
                    img.flush();
                }
            }
        }

        if (!enversService.isEnabled()) {
            log.debug("Skipping Envers listener registrations : EnversService disabled");
            return;
        }

        if (info.getStatus() == ProtocolStatus.OK) {
            local.sendData(info.getReturnData());
            return rsfFuture.completed(local);
        } else {
            invLogger.error("response({}) -> statusFailed, bindID ={}, status ={}.", requestID, bindID, local.getStatus());
            return rsfFuture.failed(new RsfException(local.getStatus(), "status."));
        }

        if (isPreAllocated) {
            for (MemorySegment seg : segments) {
                memoryPool.returnSegmentToPool(seg);
            }
        } else {
            for (MemorySegment seg : segments) {
                seg.free();
            }
            numNonAllocatedPages += segments.size();
        }

        if (DEBUG) {
            log.info("CleanXML: processed tag:  " + tag);
        }

        if (currentRegion == null) {
            final Collection<IRegion> regions = getPlottingSystem().getRegions();
            if (regions != null) {
                for (IRegion iRegion : regions) {
                    if (!iRegion.isUserRegion()) continue;
                    if (monitor.isCanceled()) return Status.CANCEL_STATUS;
                    createProfile(image, iRegion, iRegion.getROI(), registeredTraces.containsKey(iRegion.getName()), isDrag, monitor);
                }
            } else {
                registeredTraces.clear();
                profilePlottingSystem.clear();
            }
        } else {
            if (monitor.isCanceled()) return Status.CANCEL_STATUS;
            createProfile(image, currentRegion, currentROI != null ? currentROI : currentRegion.getROI(), true, isDrag, monitor);
        }

        if (request.getUrl().toString().equals(view.getUrl())) {
            didReceiveError = true;
            switch (errorResponse.getStatusCode()) {
                case HttpStatus.FORBIDDEN:
                case HttpStatus.UNAUTHORIZED:
                case HttpStatus.NOT_FOUND:
                    EdxCookieManager.getSharedInstance(getContext()).tryToRefreshSessionCookie();
                    break;
                default:
                    hideLoadingProgress();
                    break;
            }
            pageIsLoaded = false;
            showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
        }

        if (t.checkTag(t.id)) {
            addIdentifier(map, t.id, index);
        }

        if (this.base64 != null) {
            JSONObject file = new JSONObject();
            file.put("-base64", this.base64);
            task.put("file", file);
            addPhoneTag(task, client);
        }

        if (!allowResume()) {
            sendUnexpectedError();
            return;
        }

        if (u.parsedName.isIndetermined()) {
            throw new IgnoreSourceUsageException("Ignore indetermined name", u.scientificName);
        }

        if (!calculators.contains(this.currentCalculator)) {
            this.currentCalculator = null;
        }

        if (memBlockInfo == null) {
            ReplicaInfo diskBlockInfo = new FinalizedReplica(blockId, diskFile.length(), diskGS, vol, diskFile.getParentFile());
            volumeMap.add(bpid, diskBlockInfo);
            final DataBlockScanner blockScanner = datanode.getBlockScanner();
            if (blockScanner != null) {
                blockScanner.addBlock(new ExtendedBlock(bpid, diskBlockInfo));
            }
            LOG.warn("Added missing block to memory " + diskBlockInfo);
            return;
        }

        if (d.indexOf('=') >= 0) d = d.substring(0, d.indexOf('=')).trim();

        if (dryRun) {
            return;
        }

        if (isMultipart) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024 * 1024 * 10);
            factory.setRepository(new File(tempPath));
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            upload.setSizeMax(maxSize);
            List<FileItem> items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            if (items != null && items.size() > 0) {
                Iterator<FileItem> iter = items.iterator();
                List<FileItem> list = new ArrayList<FileItem>();
                Map<String, String> fields = new HashMap<String, String>();
                while (iter.hasNext()) {
                    FileItem item = iter.next();
                    if (item.isFormField()) {
                        String name = item.getFieldName();
                        String value = item.getString();
                        fields.put(name, value);
                    } else {
                        list.add(item);
                    }
                }
                map.put(FORM_FIELDS, fields);
                map.put(FILE_FIELDS, list);
            }
        }

        if (gul()) {
        }

        if (best == -1) {
            best = n;
            continue;
        }

        if (available == 0) {
            return new ForegroundBackgroundAllocation(0L, 0L);
        }

        if (WebloggerRuntimeConfig.isSiteWideWeblog(pageRequest.getWeblogHandle())) {
            return false;
        }

        if (isCurrentNodeIncluded() && !replacement.getVersion().equals(artifact.getVersion())) {
            managedVersions.put(getRangeId(replacement), artifact.getVersion());
        }

        if (list.size() > 0) {
            if (getArguments().getString(ARG_CHART_5).equalsIgnoreCase("")) {
                pieChart.setCenterText(getString(R.string.na));
            } else {
                pieChart.setCenterText(getArguments().getString(ARG_CHART_5));
            }
        }

        if (!requestUrl.getScheme().startsWith("http")) {
            LOGD(TAG, "Will not handle " + requestUrl);
            return null;
        }

        if (probesets.containsKey(probeset)) {
            HashMap<String, HashMap> phm = (HashMap<String, HashMap>) probesets.get(probeset);
            HashMap<String, Double> val = new HashMap<String, Double>();
            val.put("herit", herit);
            val.put("dabg", dabg);
            phm.put(tissue, val);
        } else {
            HashMap<String, HashMap> phm = new HashMap<String, HashMap>();
            HashMap<String, Double> val = new HashMap<String, Double>();
            val.put("herit", herit);
            val.put("dabg", dabg);
            phm.put(tissue, val);
            probesets.put(probeset, phm);
        }

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
        }

        if (label == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'label' was not present! Struct: " + toString());
        }

        if (object.pap != null) {
            fieldCount++;
            jacksonSerializer.writeFieldName("pap");
            if (papBindMap.serializeOnJacksonAsString(object.pap, jacksonSerializer) == 0) {
                jacksonSerializer.writeNullField("pap");
            }
        }

        if (par != null) {
            it.remove();
            tempSet.add(par);
            boolean addNodeForSettingXBit = !mPegasusConfiguration.jobSetupForWorkerNodeExecution(job);
            if (ft.isTransferringExecutableFile() && addNodeForSettingXBit) {
                String xBitJobName = (String) mSetupMap.get(key);
                if (key == null) {
                    throw new RuntimeException("Internal Pegasus Error while " + "constructing balanced cluster stagein jobs");
                }
                this.addRelation(xBitJobName, jobName);
            }
        } else {
            boolean contains = stageInMap.containsKey(siteHandle);
            if (!contains) {
                bundle = bundleValue.determine(implementation, job, mTXJobsPerLevelMap.get(job.getLevel()));
            }
            PoolTransfer pt = (contains) ? (PoolTransfer) stageInMap.get(siteHandle) : new PoolTransfer(siteHandle, localTransfer, bundle);
            if (!contains) {
                stageInMap.put(siteHandle, pt);
            }
            TransferContainer siTC = pt.addTransfer(ft, level, type);
            String newJobName = siTC.getTXName();
            if (ft.isTransferringExecutableFile()) {
                stageInExecJobs.add(newJobName);
                stagedExecutableFiles.add(ft);
                mLogger.log("Entered " + key + "->" + implementation.getSetXBitJobName(job.getName(), staged), LogManager.DEBUG_MESSAGE_LEVEL);
                mSetupMap.put(key, implementation.getSetXBitJobName(job.getName(), staged));
            }
            mFileTable.put(key, newJobName);
            tempSet.add(newJobName);
        }

        if (newSelection.size() > 1 && !isMultiSelect()) {
            ITableRow first = newSelection.first();
            newSelection.clear();
            newSelection.add(first);
        }

        if (EnableProcessor.getEnabledCapabilities(session).contains(ImapConstants.SUPPORTS_QRESYNC)) {
            fetch.setUid(true);
        }

        if (ruleTypeKey.equals("SuperClassInheritanceConvention")) {
            ruleTypeKey = "InheritanceConvention";
        }

        if (part != null) {
            activePage.hideView(part);
        }

        if ((elementIndex == 3) && (el.getAttribute("OriginalRequestID").equals(id) || el.getAttribute("RequestID").equals(id) || el.getAttribute("ResponseID").equals(id))) {
            els[3] = el;
        } else if ((elementIndex == 4) && (el.getAttribute("AssertionID").equals(id))) {
            els[4] = el;
        } else if ((elementIndex == 5) && (el.getAttribute("RequestID").equals(id) || el.getAttribute("ResponseID").equals(id))) {
            els[5] = el;
        }

        if (object.valueBigDecimalList != null) {
            int n = object.valueBigDecimalList.size();
            BigDecimal item;
            for (int i = 0; i < n; i++) {
                item = object.valueBigDecimalList.get(i);
                if (item == null) {
                    xmlSerializer.writeEmptyElement("valueBigDecimalList");
                } else {
                    xmlSerializer.writeStartElement("valueBigDecimalList");
                    xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(BigDecimalUtils.write(item)));
                    xmlSerializer.writeEndElement();
                }
            }
            if (n == 0) {
                xmlSerializer.writeStartElement("valueBigDecimalList");
                xmlSerializer.writeAttribute("emptyCollection", "true");
                xmlSerializer.writeEndElement();
            }
        }

        if (buildParams.explicitPolicyRequired()) {
            explicitPolicy = 0;
        } else {
            explicitPolicy = (maxPathLen == -1) ? maxPathLen : maxPathLen + 2;
        }

        if (c.hasMarker(Marker.Valley)) continue;

        if ((cfg == null) || !cfg.getBoolean(AUDIO_CONFIG_DISABLED_PROP, false)) {
            audioConfigurationForm = new LazyConfigurationForm(AudioConfigurationPanel.class.getName(), getClass().getClassLoader(), "plugin.mediaconfig.AUDIO_ICON", "impl.neomedia.configform.AUDIO", 3);
            bundleContext.registerService(ConfigurationForm.class.getName(), audioConfigurationForm, mediaProps);
            if (audioDeviceConfigurationPropertyChangeListener == null) {
                getNotificationService();
                audioDeviceConfigurationPropertyChangeListener = new AudioDeviceConfigurationListener(audioConfigurationForm);
                mediaServiceImpl.getDeviceConfiguration().addPropertyChangeListener(audioDeviceConfigurationPropertyChangeListener);
            }
        }

        if (member.getFailureCount() >= MIN_BACKOFF_FAILURE_COUNT) {
            if (System.currentTimeMillis() - member.getFailureTime() > Math.min(heartbeatInterval * Math.pow(2, member.getFailureCount()), MAX_HEARTBEAT_WAIT)) {
                sendAppendRequest(member, buildAppendEmptyRequest(member));
            }
        } else if (member.getConfigTerm() < raft.getTerm() || member.getConfigIndex() < raft.getCluster().getConfiguration().index()) {
            if (member.canConfigure()) {
                sendConfigureRequest(member, buildConfigureRequest(member));
            } else if (member.canHeartbeat()) {
                sendAppendRequest(member, buildAppendEmptyRequest(member));
            }
        } else if (member.getMember().getType() == RaftMember.Type.ACTIVE || member.getMember().getType() == RaftMember.Type.PROMOTABLE || member.getMember().getType() == RaftMember.Type.PASSIVE) {
            Snapshot snapshot = raft.getSnapshotStore().getCurrentSnapshot();
            if (snapshot != null && member.getSnapshotIndex() < snapshot.index() && snapshot.index() >= member.getLogReader().getCurrentIndex()) {
                if (!member.canInstall()) {
                    return;
                }
                log.debug("Replicating snapshot {} to {}", snapshot.index(), member.getMember().memberId());
                sendInstallRequest(member, buildInstallRequest(member, snapshot));
            } else if (member.canAppend()) {
                sendAppendRequest(member, buildAppendRequest(member, -1));
            }
        } else if (member.canAppend()) {
            sendAppendRequest(member, buildAppendRequest(member, -1));
        }

        if (p == null) p = s;
        else if ((n = s.next) == null) break;
        else if (s == n) p = null;
        else p.casNext(s, n);

        if (stopPort > 0) new StopServer().start();

        if (record != null) {
            if (!this.valueExists(record.getAvd()) && !this.valueExists(record.getSign())) {
                if (this.valueExists(record.getOpd()) || this.valueExists(record.getStatus()) || this.valueExists(record.getForenklad()) || this.valueExists(record.getForenklad()) || this.valueExists(record.getGodsNr()) || this.valueExists(record.getDatumFr()) || this.valueExists(record.getMrnNr()) || this.valueExists(record.getDatum())) {
                } else {
                    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "avd", "systema.ncts.import.list.error.null.avdOrSign");
                }
            }
        }

        if (cacheEntity != null && cacheMode == CacheMode.DEFAULT) {
            HttpHeaders responseHeaders = cacheEntity.getResponseHeaders();
            if (responseHeaders != null) {
                String eTag = responseHeaders.get(HttpHeaders.HEAD_KEY_E_TAG);
                if (eTag != null) request.headers(HttpHeaders.HEAD_KEY_IF_NONE_MATCH, eTag);
                long lastModified = HttpHeaders.getLastModified(responseHeaders.get(HttpHeaders.HEAD_KEY_LAST_MODIFIED));
                if (lastModified > 0)
                    request.headers(HttpHeaders.HEAD_KEY_IF_MODIFIED_SINCE, HttpHeaders.formatMillisToGMT(lastModified));
            }
        }

        if (postOpDirAttr == null) {
            try {
                postOpDirAttr = Nfs3Utils.getFileAttr(dfsClient, dirFileIdPath, iug);
            } catch (IOException e1) {
                LOG.info("Can't get postOpDirAttr for " + dirFileIdPath);
            }
        }

        if ((i != 0) && (!localMin[i].equals(localMax[i - 1]))) {
            localMin[i] = localMax[i - 1];
        }

        if (earlyOutput) {
            outputCurrentBatch();
            return AggOutcome.RETURN_OUTCOME;
        }

        if (m_fullColumnName == null) {
            m_fullColumnName = fullColumnName;
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.getTree() : null);
            root_0 = (Object) adaptor.nil();
            {
                {
                    Object root_1 = (Object) adaptor.nil();
                    root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(QANYTHING, "QANYTHING"), root_1);
                    adaptor.addChild(root_1, stream_STAR.nextNode());
                    adaptor.addChild(root_0, root_1);
                }
            }
            retval.tree = root_0;
        }

        if (ch == 'g') {
            digits[8]++;
        }

        if (this.entityManagerFactory != null) {
            EntityManager entityManager = this.entityManagerThreadLocal.get();
            if (entityManager != null) {
                entityManager.getTransaction().commit();
                entityManager.close();
            }
            this.entityManagerThreadLocal.remove();
            identityManager = null;
        }

        if (footer != null && y < -footer.getHeight()) {
            if (footerState == PullState.PULLED) {
                y_off = y_off - footer.getHeight();
            }
            if (footerState == PullState.NORMAL) {
                y_off = y_off + footer.getHeight();
            }
            if (y_off < (scrollPanel.getMaxScrollY() - footer.getStateSwitchPosition()) && footerState != PullState.PULLED) {
                footerState = PullState.PULLED;
                scrollPanel.setMaxScrollY(scrollPanel.getMaxScrollY() - footer.getHeight());
                if (footerPullhandler != null) {
                    footerPullhandler.onPullStateChanged(footer, footerState);
                }
            } else {
                if (y_off > (scrollPanel.getMaxScrollY() - footer.getStateSwitchPosition()) && footerState != PullState.NORMAL) {
                    footerState = PullState.NORMAL;
                    scrollPanel.setMaxScrollY(scrollPanel.getMaxScrollY() + footer.getHeight());
                    if (footerPullhandler != null) {
                        footerPullhandler.onPullStateChanged(footer, footerState);
                    }
                }
            }
            footer.onScroll(y_off - scrollPanel.getMaxScrollY());
        }

        if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null) {
            IPerspectiveDescriptor perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective();
            String perspectiveId = perspective.getId();
            if (perspectiveId.startsWith("uk.ac.gda.devices.hplc")) {
                return true;
            }
            return false;
        }

        if (resultClassName != null) {
            resultClass = resolveClassDeclaration(resultClassName);
            resultClassName = null;
        }

        if (way.hasTag("wheelchair")) {
            applyLabel(Node.WHEELCHAIR, Label.fromTag(way.getTag("wheelchair")), tree);
        }

        if (options.containsKey(ORG)) {
            String id = options.get(ORG);
            retval.put(ORG_ID, id);
        } else {
            retval.put(ORG_ID, OrgFactory.getSatelliteOrg().getId().toString());
        }

        if (index != null && address != null) {
            index.addSource(p.getFileId(), p.getSource(), Time.currentTime());
            tracker.write(new Kad2PublishRes(p.getFileId(), 1), address);
        } else {
            log.trace("[node] not indexed source ip {} port {} portTcp {} size {}", p.getSource());
        }

        if (_toolTip != null) {
            _toolTip.hide();
        }

        if (ajaxRequestResolver.isAjax(context)) {
            logger.info("AJAX request detected -> returning the appropriate action");
            RedirectAction action = redirectActionBuilder.redirect(context);
            cleanRequestedUrl(context);
            return ajaxRequestResolver.buildAjaxResponse(action.getLocation(), context);
        }

        if (_cols != null) {
            ColumnIO io = getColumnIO();
            for (int i = 0; i < _cols.length; i++) {
                if (io.isInsertable(i, false)) _cols[i].setFlag(Column.FLAG_DIRECT_INSERT, true);
                if (io.isUpdatable(i, false)) _cols[i].setFlag(Column.FLAG_DIRECT_UPDATE, true);
            }
        }

        if (sortColumn.equals("tpooled_sysuid")) {
            compare = new Integer(tpooled1.getTpooled_sysuid()).compareTo(new Integer(tpooled2.getTpooled_sysuid()));
        } else if (sortColumn.equals("tpooled_sampleid")) {
            compare = new Integer(tpooled1.getTpooled_sampleid()).compareTo(new Integer(tpooled2.getTpooled_sampleid()));
        } else if (sortColumn.equals("tpooled_extractid")) {
            compare = new Integer(tpooled1.getTpooled_extractid()).compareTo(new Integer(tpooled2.getTpooled_extractid()));
        } else if (sortColumn.equals("tpooled_subid")) {
            compare = new Integer(tpooled1.getTpooled_subid()).compareTo(new Integer(tpooled2.getTpooled_subid()));
        } else if (sortColumn.equals("tpooled_del_status")) {
            compare = tpooled1.getTpooled_del_status().compareTo(tpooled2.getTpooled_del_status());
        } else if (sortColumn.equals("tpooled_user")) {
            compare = tpooled1.getTpooled_user().compareTo(tpooled2.getTpooled_user());
        } else if (sortColumn.equals("tpooled_last_change")) {
            compare = tpooled1.getTpooled_last_change().compareTo(tpooled2.getTpooled_last_change());
        }

        if (list.size() == 0) {
            list.add(0, new double[]{0, 0, 0});
        }

        if (!xmlStream.getLocalName().equals("curveMember")) {
            String msg = "Error in 'gml:Ring' element. Expected a 'gml:curveMember' element.";
            throw new XMLParsingException(xmlStream, msg);
        }

        if (isAdded()) {
            reloadEvents(false);
        }

        if (declMapper.get(member) == null && !member.isStatic()) {
            Set<SetVariable> recvVars = undefinedStorageMembers.get(member);
            if (recvVars == null) {
                recvVars = new HashSet<>();
                undefinedStorageMembers.put(member, recvVars);
            }
            recvVars.add(getVariable(memberRef.getReference()));
        }

        if (USeqUtilities.POSITION_SCORE_INT_FLOAT.matcher(fileType).matches()) {
            for (int i = 1; i < numberPositions; i++) {
                sortedPositionScores[i] = new PositionScore(sortedPositionScores[i - 1].position + dis.readInt(), dis.readFloat());
            }
        } else if (USeqUtilities.POSITION_SCORE_SHORT_FLOAT.matcher(fileType).matches()) {
            for (int i = 1; i < numberPositions; i++) {
                sortedPositionScores[i] = new PositionScore(sortedPositionScores[i - 1].position + dis.readShort() + 32768, dis.readFloat());
            }
        } else {
            throw new IOException("Incorrect file type for creating a PositionScore[] -> '" + fileType + "' in " + binaryFile + "\n");
        }

        if (oldPos > newPos[0]) {
            loopCount++;
            log.debug("Loop count " + loopCount);
        }

        if (DEBUG) {
            System.out.println(t.getID());
            System.out.println("input: " + hex.transliterate(text.toString()) + ", " + toString(run));
        }

        if (afm != null) {
            if (afm.getCapHeight() != null) {
                returnFont.setCapHeight(afm.getCapHeight().intValue());
            }
            if (afm.getXHeight() != null) {
                returnFont.setXHeight(afm.getXHeight().intValue());
            }
            if (afm.getAscender() != null) {
                returnFont.setAscender(afm.getAscender().intValue());
            }
            if (afm.getDescender() != null) {
                returnFont.setDescender(afm.getDescender().intValue());
            }
            returnFont.setFontBBox(afm.getFontBBoxAsIntArray());
            if (afm.getStdVW() != null) {
                returnFont.setStemV(afm.getStdVW().intValue());
            } else {
                returnFont.setStemV(80);
            }
            returnFont.setItalicAngle((int) afm.getWritingDirectionMetrics(0).getItalicAngle());
        } else {
            returnFont.setFontBBox(pfm.getFontBBox());
            returnFont.setStemV(pfm.getStemV());
            returnFont.setItalicAngle(pfm.getItalicAngle());
        }

        if (mPostedOpenRunnable != null) {
            return false;
        }

        if (prop.isReadOnly()) {
            continue;
        }

        if (matchNonArticle(title, lang1)) {
            continue;
        }

        if (!(this.getModel().getForm().getChild(index) instanceof GroupDef) || ((GroupDef) this.getModel().getForm().getChild(index)).isRepeat()) {
            return false;
        }

        if ((captchaText != null) && (captchaText.trim().length() > 0)) {
            facesContextHelper.addGlobalInfoMessage(facesContext, "you-entered-the-correct-text-verification-code");
        } else {
            if (requiredChecked) {
                UIViewRoot uiViewRoot = facesContext.getViewRoot();
                Captcha captcha = (Captcha) uiViewRoot.findComponent(":f1:simpleCaptcha");
                if (captcha.isRequired()) {
                    facesContextHelper.addGlobalUnexpectedErrorMessage();
                } else {
                    String maxChallenges = PropsUtil.get(PropsKeys.CAPTCHA_MAX_CHALLENGES);
                    facesContextHelper.addGlobalInfoMessage(facesContext, "the-captcha-is-no-longer-enabled-since-the-user-entered-a-correct-value-x-times", maxChallenges);
                }
            } else {
                facesContextHelper.addGlobalInfoMessage(facesContext, "no-value-was-entered-for-the-non-required-captcha");
            }
        }

        if (!canValidate(context)) {
            return;
        }

        if (value instanceof Long) return (Long) value;

        if ((this instanceof ObjectType) && (((ObjectType) this).referencesInterfaceExact())) {
            if ((T instanceof ObjectType) && (((ObjectType) T).referencesClassExact())) {
                if (T.equals(Type.OBJECT)) {
                    return true;
                }
            }
            if ((T instanceof ObjectType) && (((ObjectType) T).referencesInterfaceExact())) {
                if (this.equals(T)) {
                    return true;
                }
                if (Repository.implementationOf(((ObjectType) this).getClassName(), ((ObjectType) T).getClassName())) {
                    return true;
                }
            }
        }

        if (!txtSilkLibLocation.isValid()) {
            throw new DPUConfigException(ctx.tr("SilkLinkerVaadinDialog.tfSilkLibLocation.validator.error"));
        }

        if (includeSystemDefault) choices.add(USE_DEFAULT_VERSION);

        if (newValue) {
            LOG.info("Adding value: " + value + " to field: " + field + " for URI " + doc.getFieldValue(SolrFields.SOLR_URL));
            doc.addField(field, operation);
        } else {
            LOG.debug("Skipping addition of existing field value: " + value + " to field: " + field);
        }

        if (targetRank == null) {
            targetScore = null;
        } else {
            if (targetRank == 0) {
                targetScore = Integer.MAX_VALUE;
            } else {
                try {
                    targetScore = (int) getTrust(treeOwner, target).getValue();
                } catch (NotTrustedException e) {
                    targetScore = 0;
                    for (Trust receivedTrust : getReceivedTrusts(target)) {
                        final Identity truster = receivedTrust.getTruster();
                        final Integer trusterRank = rankValues.get(truster.getID());
                        final int capacity = computeCapacity(treeOwner, truster, trusterRank != null ? trusterRank : -1);
                        targetScore += (receivedTrust.getValue() * capacity) / 100;
                    }
                }
            }
        }

        if (replicatedMapDataSerializableFactory != null && field != null) {
            field.set(null, replicatedMapDataSerializableFactory);
        }

        if (op.opNum() == 7) {
            if (op.y() != null && op.y().isScalar()) {
                Nd4j.getExecutioner().commit();
                op.setY(Nd4j.valueArrayOf(op.x().shape(), op.y().getDouble(0)));
                Nd4j.getExecutioner().commit();
            }
        }

        if (interfaceList.contains(intKey) && curInterface.getStatus().equals("unmanaged")) {
            manageInterfacesList.add(curInterface.getAddress());
        } else if (!interfaceList.contains(intKey) && curInterface.getStatus().equals("managed")) {
            unmanageInterfacesList.add(curInterface.getAddress());
        }

        if (target instanceof TabularCube) {
            TabularCube targetCube = (TabularCube) target;
            Cube sourceCube = (Cube) source;
            Module sourceRoot = sourceCube.getRoot();
            DesignElement group = source.getReferenceProperty(sourceRoot, ICubeModel.DEFAULT_MEASURE_GROUP_PROP);
            if (group != null) {
                int index = group.getIndex(sourceCube.getRoot());
                assert index > -1;
                targetCube.setDefaultMeasureGroup(index);
            }
        } else if (target instanceof Dimension) {
            Dimension targetDimension = (Dimension) target;
            Dimension sourceDimension = (Dimension) source;
            ModelUtil.duplicateDefaultHierarchy(targetDimension, sourceDimension);
        }

        if (kEvent.getLocation() != null) {
            vEventProperties.add(new Location(kEvent.getLocation()));
        }

        if (isMessageSizeValidationEnabled) {
            context.setAttribute(NhttpConstants.MESSAGE_SIZE_VALIDATION_SUM, 0);
        }

        if ((tmpbitmap2 = osd_create_bitmap(64 * 8, 64 * 8)) == null) {
            char_dirty = null;
            text_dirty = null;
            bg_dirty = null;
            fg_dirty = null;
            osd_free_bitmap(tmpbitmap);
            return 1;
        }

        if (introspector.isElement(element)) {
            if (asXmlStreamWriter(exchange)) {
                XMLStreamWriter writer = typeConverter.convertTo(XMLStreamWriter.class, exchange, stream);
                if (needFiltering(exchange)) {
                    writer = new FilteringXmlStreamWriter(writer, charset);
                }
                if (xmlStreamWriterWrapper != null) {
                    writer = xmlStreamWriterWrapper.wrapWriter(writer);
                }
                marshaller.marshal(element, writer);
            } else {
                marshaller.marshal(element, stream);
            }
            return;
        } else if (objectFactory && element != null) {
            Method objectFactoryMethod = JaxbHelper.getJaxbElementFactoryMethod(camelContext, element.getClass());
            if (objectFactoryMethod != null) {
                try {
                    Object instance = objectFactoryMethod.getDeclaringClass().newInstance();
                    if (instance != null) {
                        Object toMarshall = objectFactoryMethod.invoke(instance, element);
                        if (asXmlStreamWriter(exchange)) {
                            XMLStreamWriter writer = typeConverter.convertTo(XMLStreamWriter.class, exchange, stream);
                            if (needFiltering(exchange)) {
                                writer = new FilteringXmlStreamWriter(writer, charset);
                            }
                            if (xmlStreamWriterWrapper != null) {
                                writer = xmlStreamWriterWrapper.wrapWriter(writer);
                            }
                            marshaller.marshal(toMarshall, writer);
                        } else {
                            marshaller.marshal(toMarshall, stream);
                        }
                        return;
                    }
                } catch (Exception e) {
                    LOG.debug("Unable to create JAXBElement object for type " + element.getClass() + " due to " + e.getMessage(), e);
                }
            }
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
            RewriteRuleSubtreeStream stream_b = new RewriteRuleSubtreeStream(adaptor, "rule b", b != null ? b.tree : null);
            root_0 = (GrammarAST) adaptor.nil();
            {
                {
                    GrammarAST root_1 = (GrammarAST) adaptor.nil();
                    root_1 = (GrammarAST) adaptor.becomeRoot((GrammarAST) adaptor.create(POSITIVE_CLOSURE, (b != null ? ((Token) b.start) : null), "+"), root_1);
                    adaptor.addChild(root_1, stream_b.nextTree());
                    adaptor.addChild(root_0, root_1);
                }
            }
            retval.tree = root_0;
        }

        if ("__doc__".equals(referencedName)) {
            addDocReference(ret, qualifier, qualifierType);
        }

        if (mediaLocation != null && !(mediaLocation.trim()).equals("")) {
            File repositoryPathDir = new File(repositoryPath);
            mediaLocation = repositoryPathDir.getCanonicalPath() + "/" + mediaLocation;
            File mediaFile = new File(mediaLocation);
            if (mediaFile.getCanonicalPath().equals(mediaLocation)) {
                File mediaDir = mediaFile.getParentFile();
                if (!mediaDir.exists()) mediaDir.mkdirs();
                mediaIsValid = writeToFile(req, mediaLocation);
            } else {
                log.debug("****Error in file paths " + mediaFile.getCanonicalPath() + " is not equal to " + mediaLocation);
                mediaIsValid = false;
            }
        }

        if (mTopViewIndex == -1) {
            return i;
        } else if (i == childCount - 1) {
            return mTopViewIndex;
        } else if (i < mTopViewIndex) {
            return i;
        } else {
            return i + 1;
        }

        if (mPmToken > 0) {
            if (MORE_DEBUG) Slog.v(TAG, "finishing PM token " + mPmToken);
            try {
                mPackageManagerBinder.finishPackageInstall(mPmToken, mDidLaunch);
            } catch (RemoteException e) {
            }
        } else {
            mBackupHandler.sendEmptyMessageDelayed(MSG_RESTORE_TIMEOUT, TIMEOUT_RESTORE_INTERVAL);
        }

        if (domainObject instanceof Stateful) {
            Stateful stateful = (Stateful) domainObject;
            stateful.setStateOf(stateTransitionClass, this.getToState());
        }

        if (path.length() > 1 && path.charAt(path.length() - 1) == '/') path = path.substring(0, path.length() - 1);

        if (keepUncompressedBuf && uncompressedDirectBufLen > 0) return false;

        if (spoolAndExpiryThread != null) {
            spoolAndExpiryThread.interrupt();
            spoolAndExpiryThread.join();
        }

        if (Platform.OS_LINUX.equals(Platform.getOS())) {
            if (runCommand("sensible-browser", uri)) return;
            if (runCommand("kde-open", uri)) return;
            if (runCommand("gnome-open", uri)) return;
            if (runCommand("xdg-open", uri)) return;
        }

        if (item.getAttribute("multimediaUrl") != null) {
            eventTrackingService.post(eventTrackingService.newEvent("lessonbuilder.read", "/lessonbuilder/item/" + item.getId(), false));
            res.sendRedirect(item.getAttribute("multimediaUrl"));
            return;
        }

        if (jobMeta.getCreatedUser() == null || jobMeta.getCreatedUser().equals("-")) {
            jobMeta.setCreatedDate(new Date());
            if (rep.getUserInfo() != null) {
                jobMeta.setCreatedUser(rep.getUserInfo().getLogin());
            } else {
                jobMeta.setCreatedUser(null);
            }
        }

        if (editable) {
            final Menu menu = new Menu(parent.getShell());
            MenuItem item1 = new MenuItem(menu, SWT.NONE);
            item1.setText(Resources.getMessage("ViewDataInput.0"));
            item1.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(final SelectionEvent arg0) {
                    controller.actionMenuEditFindReplace();
                }
            });
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseUp(MouseEvent arg0) {
                    if (model != null && model.getSelectedAttribute() != null && model.getInputConfig() != null && model.getInputConfig().getInput() != null && model.getInputConfig().getInput().getHandle() != null) {
                        menu.setEnabled(true);
                    } else {
                        menu.setEnabled(false);
                    }
                    if (arg0.button == 3 && menu.isEnabled()) {
                        Point display = table.toDisplay(arg0.x, arg0.y);
                        menu.setLocation(display.x, display.y);
                        menu.setVisible(true);
                    }
                }
            });
        }

        if (expressionElement.hasAttribute("expressionLanguage")) {
            expression.setExpressionLanguage(expressionElement.getAttribute("expressionLanguage"));
        } else {
            expression.unsetExpressionLanguage();
        }

        if (!digest.factTable.equalsIgnoreCase(this.getFactTable())) return false;

        if (Math.random() < 0.25) {
            XFormTransformService.rotate(xForm, 360.0 * Math.random(), false);
        }

        if (am.isAnnotationPresent(DenyAll.class)) {
            configuration.register(new OAuth2AuthenticationFilter(sessionProvider, configProvider, new String[]{}));
            configuration.register(new OAuth2AuthorizationFilter());
            return;
        }

        if (!(Util.isEmpty(requestedSeries) || "none".equals(requestedSeries))) {
            for (int i = 1; i < series.length; i++) {
                Series<T> optional = series[i];
                if (requestedSeries.contains(optional.name)) {
                    jenny.writeStartObject();
                    jenny.writeFieldName("title");
                    jenny.writeString(optional.title);
                    jenny.writeFieldName("colour");
                    jenny.writeString(optional.colour);
                    jenny.writeFieldName("y");
                    jenny.writeStartArray();
                    for (T reading : readings) {
                        jenny.writeObject(optional.accessor.apply(reading));
                    }
                    jenny.writeEndArray();
                    jenny.writeEndObject();
                }
            }
        }

        if (CollectionsExt.findAll(Arrays.asList(params), Object.class).size() == params.length) {
            return "";
        }

        if (db.data != null && db.data.length < w) {
            db.data = null;
        }

        if (ifNode.getNext() != null) {
            Node newDestBlock = IR.block().srcref(ifNode);
            if (destBlock == null) {
                ifNode.addChildToBack(newDestBlock);
            } else if (destBlock.isEmpty()) {
                ifNode.replaceChild(destBlock, newDestBlock);
            } else if (destBlock.isBlock()) {
                newDestBlock = destBlock;
            } else {
                ifNode.replaceChild(destBlock, newDestBlock);
                newDestBlock.addChildToBack(destBlock);
            }
            moveAllFollowing(ifNode, ifNode.getParent(), newDestBlock);
        }

        if (request instanceof IMultipartWebRequest) {
            final FileItem item = ((IMultipartWebRequest) request).getFile(getInputName());
            if (item != null && item.getSize() > 0) {
                if (overriddenFileUpload == null) {
                    overriddenFileUpload = new ServoyFileUpload(item);
                }
                return overriddenFileUpload;
            }
        }

        if (reference.startsWith(REFERENCE_ROOT)) {
            String id = null;
            String[] parts = StringUtil.split(reference, Entity.SEPARATOR);
            if (parts.length > 2) {
                id = parts[2];
            }
            ref.set(APPLICATION_ID, null, id, null, null);
            return true;
        }

        if (assessmentName == null || (assessmentName.trim()).equals("")) {
            String nameEmpty_err = ContextUtil.getLocalizedString("org.sakaiproject.tool.assessment.bundle.AssessmentSettingsMessages", "assessmentName_empty");
            context.addMessage(null, new FacesMessage(nameEmpty_err));
            error = true;
        } else {
            assessmentName = TextFormat.convertPlaintextToFormattedTextNoHighUnicode(log, assessmentName.trim());
            if (!assessmentService.publishedAssessmentTitleIsUnique(assessmentSettings.getAssessmentId().toString(), assessmentName)) {
                String nameUnique_err = ContextUtil.getLocalizedString("org.sakaiproject.tool.assessment.bundle.AssessmentSettingsMessages", "assessmentName_error");
                context.addMessage(null, new FacesMessage(nameUnique_err));
                error = true;
            }
        }

        if (bundles == null || bundles.length == 0) {
            logger.log("No resources to deploy");
            return;
        }

        if (object.dataURL != null) {
            fieldCount++;
            jacksonSerializer.writeBinaryField("dataURL", TypeAdapterUtils.toData(UrlByteArrayTypeAdapter.class, object.dataURL));
        }

        if (row_span._isEntireRange && col_span._isEntireRange) {
            return new Mat(this);
        } else if (row_span._isEntireRange) {
            return cols(col_span._first, col_span._last);
        } else if (col_span._isEntireRange) {
            return rows(row_span._first, row_span._last);
        } else {
            return submat(row_span._first, col_span._first, row_span._last, col_span._last);
        }

        if (widgetColumnSize != null) {
            getWidget().addStyleName(widgetColumnSize.getCssName());
        }

        if (!isEmptyTag && !usePhForNode) {
            if (isEmbeddable) {
                outputExtractedStuff("<ept i=\"" + bptIndex + "\">&lt;/" + name + "&gt;", isTranslatable, isPreserveWS);
                if (combinWR) {
                    Node wrNode = p_node.getParentNode();
                    String wrNodeName = wrNode.getNodeName();
                    outputExtractedStuff("&lt;/" + wrNodeName + "&gt;", isTranslatable, isPreserveWS);
                } else if (phConsolidationCount > 0) {
                    Node parentNode = p_node;
                    if (m_isIdmlXml) {
                        domNodeVisitor(parentNode.getNextSibling(), extracts, isTranslatable, switchesExtraction);
                    }
                    String parentNodeName = null;
                    for (int i = 0; i < phConsolidationCount; i++) {
                        parentNode = parentNode.getParentNode();
                        parentNodeName = parentNode.getNodeName();
                        outputExtractedStuff("&lt;/" + parentNodeName + "&gt;", isTranslatable, isPreserveWS);
                    }
                }
                outputExtractedStuff("</ept>", isTranslatable, isPreserveWS);
            } else {
                outputSkeleton("</" + name + ">");
                if (phTrimCount > 0) {
                    Node parentNode = p_node;
                    String parentNodeName = null;
                    for (int i = 0; i < phTrimCount; i++) {
                        parentNode = parentNode.getParentNode();
                        parentNodeName = parentNode.getNodeName();
                        outputSkeleton("</" + parentNodeName + ">");
                    }
                }
            }
        }

        if (first.booleanValue()) {
            result.setValue(listElementValue);
            first.setValue(false);
        } else {
            Operation.operate(Operation.OpKind_ADDITION_OP, result, listElementValue, result, objectPool);
        }

        if (fileAccess.equals(RENAME)) {
            String completeExtension = EXTENSION_SEPARATOR + imageExtension.toLowerCase();
            int extensionIndex = pic.getName().toLowerCase().lastIndexOf(completeExtension);
            String fileName = pic.getName().substring(0, extensionIndex);
            for (int i = 1; pic.exists(); i++) {
                pic = new File(pic.getParent(), fileName + "_" + i + completeExtension);
            }
        }

        if (oldEntry != null && oldBackupIn != null && oldBackupOut != null) {
            long oldFileSize = oldEntry.getSize();
            if (oldFileSize != -1 && oldFileSize != file.length()) {
                copyZipEntry(oldIn, oldBackupOut, oldEntry);
                wroteEntryToOldBackup(filename);
            } else {
                oldIn = oldBackupIn;
            }
        }

        if (result == 0.0) Assert.assertEquals(testResult[i], result, 0.0001);
        else {
            Assert.assertTrue(result != 0.0);
            Assert.assertEquals(testResult[i], result, 0.7);
        }

        if (object.valueMapStringInteger != null) {
            xmlSerializer.writeStartElement("valueMapStringInteger");
            for (Map.Entry<String, Integer> item : object.valueMapStringInteger.entrySet()) {
                xmlSerializer.writeStartElement("item");
                if (item.getKey() != null) {
                    xmlSerializer.writeStartElement("key");
                    xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(item.getKey()));
                    xmlSerializer.writeEndElement();
                }
                if (item.getValue() == null) {
                    xmlSerializer.writeEmptyElement("value");
                } else {
                    if (item.getValue() != null) {
                        xmlSerializer.writeStartElement("value");
                        xmlSerializer.writeInt(item.getValue());
                        xmlSerializer.writeEndElement();
                    }
                }
                xmlSerializer.writeEndElement();
            }
            xmlSerializer.writeEndElement();
        }

        if (ranking.isIdle()) {
            if (idleRU == null) {
                idleRU = candidate;
            }
        } else {
            if (selectedRU == null) {
                selectedRU = candidate;
                selectedRanking = ranking;
                minLoadPercentage = loadPercentage;
            } else {
                if ((unboundedRanks ? ranking.compareMessageRateTo(selectedRanking) : ranking.compareTo(selectedRanking)) < 0) {
                    minLoadPercentage = loadPercentage;
                    selectedRU = candidate;
                    selectedRanking = ranking;
                }
            }
        }

        if (evt.getSource() instanceof MovieSet || evt.getSource() instanceof Movie) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) nodeMap.get(evt.getSource());
            if (node != null) {
                DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
                int index = parent.getIndex(node);
                TreeModelEvent event = new TreeModelEvent(this, parent.getPath(), new int[]{index}, new Object[]{node});
                for (TreeModelListener listener : listeners) {
                    listener.treeNodesChanged(event);
                }
            }
        }

        if (property == null) {
            data = dataSet.getValue(dataSet.getRowid(), colName);
        } else {
            data = dataSet.getValue(dataSet.getRowid(), colName, property);
        }

        if (isTerminal(tree, idx, "extends")) {
            idx++;
            classNameParent = tree.getChild(idx++).getText();
        }

        if ((pn > -1) && (pn < pp1)) {
            pn = input.indexOf(I_CmsMacroResolver.MACRO_DELIMITER, pp1);
        }

        if (id[l - 1] == PAD) {
            octetCount -= (id[l - 2] == PAD) ? 2 : 1;
        }

        if (contents != null) {
            RTFHTMLHandler handler = new RTFHTMLHandler();
            try {
                RTFParser.parse(contents.toString(), handler);
                textEditor.insert(handler.toHTML());
                return;
            } catch (Exception e1) {
            }
        } else {
            HTMLTransfer htmlTransfer = HTMLTransfer.getInstance();
            contents = cb.getContents(htmlTransfer);
            if (contents != null) {
                textEditor.insert(contents.toString());
                return;
            }
        }

        if (_engine != null) _engine.close();

        if (startDate != null) {
            fromSpec = AccuRevScmProviderRepository.formatTimeSpec(startDate);
        } else if (fromSpec == null) {
            fromSpec = "1";
        }

        if (toThrow != null) {
            throw toThrow;
        }

        if (resourceAsStream != null) {
            try {
                resourceAsStream.close();
            } catch (final IOException ignored) {
            }
        }

        if (left == right) {
            return true;
        }

        if (rightClick) {
        } else {
            ((GuiManagerW) app.getGuiManager()).removePopup();
        }

        if (e.getPropertyName().equals("State") && ((Integer) e.getNewValue()) == CvValue.READ || e.getPropertyName().equals("State") && ((Integer) e.getNewValue()) == CvValue.EDITED) {
            setFileDirty(true);
        }

        if (eyeXSpeed != null) {
            eyeX.setVelocity(eyeXSpeed);
        }

        if (store.getBoolean("init.done.for." + init.getCanonicalName())) return;

        if (genomicBoundary.isPartOfBoundary(previousGenomicBoundary)) {
            gboit.remove();
        }

        if (rootFeature == null) {
            if (other.rootFeature != null) {
                return false;
            }
        } else if (!rootFeature.equals(other.rootFeature)) {
            return false;
        }

        if (event.getDirection() == BlockFace.UP) return;

        if (enforceSecureEndpoint && !original.isHttps() && credential != null) {
            throw new PlainTextPasswordException();
        }

        if (!rootEm.isConnectionMember(importEntity, APP_IMPORT_CONNECTION, fileImport)) {
            return null;
        }

        if (rule != null && rule.isActive() && rule.getRuleType().equals(MRule.RULETYPE_JSR223ScriptingAPIs) && rule.getEventType().equals(MRule.EVENTTYPE_ModelValidatorTableEvent)) {
            String error;
            try {
                ScriptEngine engine = rule.getScriptEngine();
                MRule.setContext(engine, po.getCtx(), 0);
                engine.put(MRule.ARGUMENTS_PREFIX + "Ctx", po.getCtx());
                engine.put(MRule.ARGUMENTS_PREFIX + "PO", po);
                engine.put(MRule.ARGUMENTS_PREFIX + "Type", changeType);
                engine.put(MRule.ARGUMENTS_PREFIX + "Event", ModelValidator.tableEventValidators[changeType]);
                Object retval = engine.eval(rule.getScript());
                error = (retval == null ? "" : retval.toString());
            } catch (Exception e) {
                throw new AdempiereException(e);
            }
            if (error != null && error.length() > 0) throw new AdempiereException(error);
        }

        if (commit && commitAfterLock()) {
            rollback = false;
            return commitAsync().chain(new CX1<IgniteInternalFuture<IgniteInternalTx>, T>() {
                @Override
                public T applyx(IgniteInternalFuture<IgniteInternalTx> f) throws IgniteCheckedException {
                    f.get();
                    return r;
                }
            });
        }

        if (element.tag == this.configuration.tt.tagGS) {
            return false;
        }

        if (c == '"') {
            if (input.charAt(i + 1) == '"') {
                sb.append(c);
                i++;
            } else {
                values.add(sb.toString());
                state = PG_OBJECT_AFTER_VALUE;
            }
        } else if (c == '\\') {
            if (input.charAt(i + 1) == '\\') {
                sb.append(c);
                i++;
            } else {
                sb.append(c);
            }
        } else {
            sb.append(c);
        }

        if (contentLeft < MIN_MARGIN) {
            contentLeft = MIN_MARGIN;
        }

        if (ch == '<' && nc == '/') depth--;

        if (params.containsKey(PARAM_PLAN)) {
            PlanEntity plan = (PlanEntity) params.get(PARAM_PLAN);
            JsonObject jsonPlan = new JsonObject();
            jsonPlan.put("id", plan.getId());
            jsonPlan.put("name", plan.getName());
            jsonPlan.put("security", plan.getSecurity());
            content.put("plan", jsonPlan);
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
            root_0 = adaptor.nil();
            {
                {
                    Object root_1 = adaptor.nil();
                    root_1 = adaptor.becomeRoot(adaptor.create(FORMAL_PARAMETER_LIST, "FORMAL_PARAMETER_LIST"), root_1);
                    adaptor.addChild(root_1, stream_parameter_array.nextTree());
                    adaptor.addChild(root_0, root_1);
                }
            }
            retval.tree = root_0;
        }

        if (distance != Double.MAX_VALUE) {
            distance = Math.sqrt(distance);
            if (pData.isDebugActive(type)) {
                outputDebugFail(player, boulder, distance);
            }
            final double vl = addVL(player, distance, data, cc);
            cancel = executeActions(player, vl, distance, getActions(cc)).willCancel();
        } else {
            cooldown(player, data, cc);
        }

        if (item instanceof TestPlan) {
            return getProperBranch(tree.getTree(item));
        }

        if (sample_list != null) {
            sample_list = null;
        }

        if ("true".equals(options.objectForKey("evalScripts"))) {
            options.removeObjectForKey("evalScripts");
        }

        if (variableName != null && !variableName.isEmpty()) {
            writer.addVariableAttribute(var, new Attribute(NetCDFUtilities.LONG_NAME, variableName));
        }

        if (getFlag(flags, JavaElementLabels.M_PRE_RETURNTYPE) && !method.isConstructor() && !isInitializer) {
            appendTypeBindingLabel(method.getReturnType(), flags);
            fBuffer.append(' ');
        }

        if (!temporaryFile.delete()) {
            fail("Could not delete file:" + temporaryFile.getAbsolutePath());
        }

        if (!inRange(toKey) && !(!toEnd && m.compare(toKey, hi) == 0 && !hiInclusive && !inclusive))
            throw new IllegalArgumentException("toKey out of range");

        if (state.equals(Job.EXPORT_FAIL) || curJob.containsFailedWorkflow() || state.equals(Job.IMPORTFAILED)) {
            textType = "warningText";
        }

        if (object.address != null) {
            xmlSerializer.writeStartElement("address");
            xmlSerializer.writeCharacters(StringEscapeUtils.escapeXml10(object.address));
            xmlSerializer.writeEndElement();
        }

        if (event.getPin() == pin) {
            pinMonitoredState = event.getState();
        }

        if (tcpChilds.hasMoreElements()) {
            param = tcpChilds.nextElement();
            Attribute typeAttr = param.getAttribute("type");
            if (!TCPAdv.getAdvertisementType().equals(typeAttr.getValue())) {
                throw new IllegalArgumentException("transport adv is not a " + TCPAdv.getAdvertisementType());
            }
            if (tcpChilds.hasMoreElements()) {
                throw new IllegalArgumentException("Multiple transport advs detected for " + assignedID);
            }
        } else {
            throw new IllegalArgumentException(TransportAdvertisement.getAdvertisementType() + " could not be located.");
        }

        if (old != null) {
            if (defaultDisplayMode != null) {
                setDisplayMode(defaultDisplayMode);
                defaultDisplayMode = null;
            }
            WWindowPeer peer = AWTAccessor.getComponentAccessor().getPeer(old);
            if (peer != null) {
                peer.setFullScreenExclusiveModeState(false);
                synchronized (peer) {
                    exitFullScreenExclusive(screen, peer);
                }
            }
            removeFSWindowListener(old);
        }

        if (vme.getMediaReferenceList() != null) {
            for (MediaReference media : vme.getMediaReferenceList()) {
                media.setVme(vme);
            }
        }

        if (NotificationSettings.KEY_THRESHOLD.equals(key)) {
            new NotificationThresholdDialogFragment().show(((AppCompatActivity) getActivity()).getSupportFragmentManager(), "notification-threshold");
            return true;
        }

        if (maxSim < pnew) {
            if (rands[i++] < pnew) {
                ArrayList<double[]> newcluster = new ArrayList<double[]>();
                clusterVec.add(newcluster);
                ArrayList<String> newidxs = new ArrayList<String>();
                clusterIdx.add(newidxs);
                maxIdx = ncluster;
                ncluster++;
                pnew = 1.00 / (double) (1 + ncluster);
            }
        }

        if (categoryRows.size() > 1) {
            rows.add(new SimpleRow(IOOTableRow.ROW_STYLE_HEADER, category.getTitle()));
            rows.addAll(categoryRows);
        }

        if (idxOffset + ClassSize.CELL_CHUNK_MAP_ENTRY > chunkCreator.getChunkSize()) {
            idxChunk = chunkCreator.getChunk(CompactingMemStore.IndexType.CHUNK_MAP);
            idxBuffer = idxChunk.getData();
            idxOffset = ChunkCreator.SIZEOF_CHUNK_HEADER;
            chunkArray[chunkArrayIdx++] = idxChunk;
        }

        if (vec.isString()) {
            final BufferedString conStr = new BufferedString(str);
            for (int i = 0; i < chk._len; i++) cres.addNum(str_op(chk.atStr(vstr, i), conStr));
        } else if (vec.isCategorical()) {
            final double d = (double) ArrayUtils.find(vec.domain(), str);
            for (int i = 0; i < chk._len; i++) cres.addNum(op(chk.atd(i), d));
        } else {
            final double d = op(1, 2);
            for (int i = 0; i < chk._len; i++) cres.addNum(d);
        }

        if (xmlDefinitions == null) {
            xmlDefinitions = new XmlDefinitionsSet();
        }

        if (authDOM != null) {
            SerializeSupport.writeNode(authDOM, outputStream);
        }

        if (contentType != null) {
            if (charset != null && !isXML(contentType)) contentType = contentType + "; charset=" + charset;
            action.log.trace("Content-Type for response: " + contentType);
            action.response.setContentType(contentType);
        }

        if (validationPart.isHasError()) {
            this.logModel.setStatus(Status.ERROR);
        }

        if (oldValues != null) {
            for (Object obj : oldValues) {
                cbTag.getModel().setCheck(obj);
            }
        }

        if (locations.size() > _maxFilesPerRequest) {
            Collection<URI> subset = new ArrayList<>(_maxFilesPerRequest);
            Iterator<URI> iterator = locations.iterator();
            for (int i = 0; i < _maxFilesPerRequest; i++) {
                subset.add(iterator.next());
            }
            locations = subset;
        }

        if (!saveOrCancelTest()) {
            return;
        }

        if (this.videoUri.isRelative()) return true;

        if (newRootTree.isNil()) {
            int nc = newRootTree.getChildCount();
            if (nc == 1) newRootTree = (Tree) newRootTree.getChild(0);
            else if (nc > 1) {
                throw new RuntimeException("more than one node as root (todo: make exception hierarchy)");
            }
        }

        if (!options.getSyncKontoauszuege() && !options.getSyncSaldo()) continue;

        if (node.getChildCount() == 1) {
            return tableName;
        }

        if (loginsDao == null) throw new IllegalArgumentException();

        if (version == null) {
            Package aPackage = VersionUtil.class.getPackage();
            if (aPackage != null) {
                version = aPackage.getImplementationVersion();
                if (version == null) {
                    version = aPackage.getSpecificationVersion();
                }
            }
        }

        if (instance == null) {
            instance = new StyledPopupMenuUI(StyleUtil.getStyle());
        }

        if (ex.getErrorCode() == 2627 && "23000".equals(ex.getSQLState())) {
            return true;
        }

        if (vpTree == null) {
            List<DataPoint> points = new ArrayList<>();
            for (String word : vocabCache.words()) {
                points.add(new DataPoint(vocabCache.indexOf(word), lookupTable.vector(word)));
            }
            vpTree = new VPTree(points);
        }

        if (!isAllowableBaseType(key, baseType, content, repositoryId)) return false;

        if (evaluationContext instanceof IEvaluationContext) {
            IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
            activeFocusControl = iEvaluationContext.getVariable(ACTIVE_FOCUS_VARIABLE_KEY);
            activeShell = iEvaluationContext.getVariable(ACTIVE_SHELL_VARIABLE_KEY);
        }

        if (mapDate < 1200000000000L) {
            return new FileOpenResult("invalid map date: " + mapDate);
        }

        if (baseDirectory != null && templateRelativePath != null) {
            File templateFile = new File(baseDirectory.getAbsolutePath() + File.separator + templateRelativePath);
            return readFromFile(templateFile, lineFrom, lineTo);
        }

        if (signInQuery != null && signInQuery.length() > 0) {
            sb.append('&').append(signInQuery);
        }

        if (!n.isArrowFunction()) {
            visitFunctionNode(n, parent);
        }

        if (block instanceof BlockFluidBase) {
            BlockFluidBase blockFluid = (BlockFluidBase) block;
            Item item = Item.getItemFromBlock(block);
            ModelBakery.registerItemVariants(item);
            ModelResourceLocation fluidLocation = new ModelResourceLocation(blockFluid.group.filename + ":fluid", blockFluid.getFluid().getName());
            ModelLoader.setCustomMeshDefinition(item, itemStack -> fluidLocation);
            ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
                @Override
                protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                    return fluidLocation;
                }
            });
            return;
        }

        if (runmode) {
            addMouseListener(new MouseListener.Stub() {
                @Override
                public void mousePressed(MouseEvent me) {
                    if (!hasFocus()) requestFocus();
                    me.consume();
                }
            });
            addFocusListener(new FocusListener() {
                public void focusGained(FocusEvent fe) {
                    if (colorFocused == null) {
                        setBorder(null);
                    } else {
                        setBorder(new LineBorder(colorFocused, thickness));
                    }
                }

                public void focusLost(FocusEvent fe) {
                    if (color == null) {
                        setBorder(null);
                    } else {
                        setBorder(new LineBorder(color, thickness));
                    }
                }
            });
            addKeyListener(new KeyListener.Stub() {
                @Override
                public void keyPressed(KeyEvent ke) {
                    if (ke.keycode == SWT.ARROW_UP) {
                        if (isDecimal) {
                            fireIncrementDecimalListeners(positionIndex);
                        } else {
                            fireIncrementIntegerListeners(integerDigits - positionIndex - 1);
                        }
                    } else if (ke.keycode == SWT.ARROW_DOWN) {
                        if (isDecimal) {
                            fireDecrementDecimalListeners(positionIndex);
                        } else {
                            fireDecrementIntegerListeners(integerDigits - positionIndex - 1);
                        }
                    } else if (ke.keycode == SWT.ARROW_LEFT && left != null) {
                        left.requestFocus();
                    } else if (ke.keycode == SWT.ARROW_RIGHT && right != null) {
                        right.requestFocus();
                    }
                }
            });
        }

        if (dataTable.getChildren().size() == mMaximumColumnsInDataTable) {
            break;
        }

        if (intoBasement) {
            Building bldg = game.getBoard().getBuildingAt(fallPos);
            BasementType bsmnt = bldg.getBasement(fallPos);
            if ((bsmnt != BasementType.NONE) && (bsmnt != BasementType.ONE_DEEP_NORMALINFONLY) && (entity.getElevation() == 0) && (bldg.getBasementCollapsed(fallPos) == true)) {
                if (fallHex.depth(true) == 0) {
                    logError(METHOD_NAME, "Entity " + entity.getDisplayName() + " is falling into a depth " + fallHex.depth(true) + " basement -- not allowed!!");
                    return vPhaseReport;
                }
                damageHeight = bsmnt.getDepth();
                newElevation = newElevation - damageHeight;
                handlingBasement = true;
                if (entity instanceof Mech) {
                    if ((bsmnt == BasementType.TWO_DEEP_FEET) || (bsmnt == BasementType.ONE_DEEP_FEET)) {
                        damageTable = ToHitData.HIT_KICK;
                    } else if ((bsmnt == BasementType.TWO_DEEP_HEAD) || (bsmnt == BasementType.ONE_DEEP_HEAD)) {
                        damageTable = ToHitData.HIT_PUNCH;
                    } else {
                        damageTable = ToHitData.HIT_NORMAL;
                    }
                }
            }
        }

        if (cursor <= limit_backward) {
            return false;
        }

        if (decorable.getType().isAssignableTo(Widget.class)) {
            initStmts.add(invokeStatic(StyleBindingsRegistry.class, "get").invoke("addElementBinding", Refs.get("instance"), decorable.getAnnotation(), nestedCall(valueAccessor).invoke("getElement")));
        } else if (decorable.getType().isAnnotationPresent(Templated.class)) {
            initStmts.add(invokeStatic(StyleBindingsRegistry.class, "get").invoke("addElementBinding", Refs.get("instance"), decorable.getAnnotation(), Stmt.invokeStatic(TemplateWidgetMapper.class, "get", valueAccessor).invoke("getElement")));
        } else if (decorable.getType().isAssignableTo(com.google.gwt.dom.client.Element.class) || RebindUtil.isNativeJsType(decorable.getType()) || RebindUtil.isElementalIface(decorable.getType())) {
            initStmts.add(invokeStatic(StyleBindingsRegistry.class, "get").invoke("addElementBinding", Refs.get("instance"), decorable.getAnnotation(), invokeStatic(TemplateUtil.class, "asDeprecatedElement", valueAccessor)));
        } else {
            throw new RuntimeException("Unrecognized type, " + decorable.getType().getFullyQualifiedName() + ", with style binding " + decorable.getAnnotation().annotationType().getName());
        }

        if (left.evaluate(context)) {
            if (right.evaluate(context)) {
                return true;
            }
        }

        if (type1 == type2) {
            return 0;
        }

        if (!channel.isOpen() || closed) {
            future.cancel(false);
            return;
        }

        if (useDefaultRules) {
            activeRules.addAll(defaultRules);
        }

        if (index < 1) {
            continue;
        }

        if (memory_allocate_ext() == 0) {
            return 0;
        }

        if (isClosed || theResults.isClosed()) {
            if (!isClosed) {
                closeCurrentStream();
                markClosed();
            }
            if (theResults.isKilled()) {
                throw newSQLException(SQLState.LANG_CANCELLATION_EXCEPTION);
            }
            if (theResults.isTimedout()) {
                throw newSQLException(SQLState.LANG_STATEMENT_CANCELLED_OR_TIMED_OUT);
            }
            throw newSQLException(SQLState.LANG_RESULT_SET_NOT_OPEN, operation);
        }

        if (step.getType() == MoveStepType.RAM) {
            if (entity.canRam()) {
                Targetable target = step.getTarget(game);
                RamAttackAction raa = new RamAttackAction(entity.getId(), target.getTargetType(), target.getTargetId(), target.getPosition());
                entity.setRamming(true);
                game.addRam(raa);
                ram = raa;
            } else {
                sendServerChat("Illegal ram!! I don't think " + entity.getDisplayName() + " should be allowed to charge," + " but the client of " + entity.getOwner().getName() + " disagrees.");
                sendServerChat("Please make sure " + entity.getOwner().getName() + " is running MegaMek " + MegaMek.VERSION + ", or if that is already the case, submit a bug report at https://github.com/MegaMek/megamek/issues");
                return;
            }
            break;
        }

        if (dynamoLocal.isRunning()) {
            dynamoLocal.stop();
        }

        if (emptyArray(fields)) {
            if (emptyArray(defaultFields)) {
                String defaultSearchField = request.getParams().get(CommonParams.DF);
                fields = null == defaultSearchField ? new String[]{} : new String[]{defaultSearchField};
            } else {
                fields = defaultFields;
            }
        } else {
            Set<String> expandedFields = new LinkedHashSet<String>();
            Collection<String> storedHighlightFieldNames = request.getSearcher().getDocFetcher().getStoredHighlightFieldNames();
            for (String field : fields) {
                expandWildcardsInHighlightFields(expandedFields, storedHighlightFieldNames, SolrPluginUtils.split(field));
            }
            fields = expandedFields.toArray(new String[]{});
        }

        if (fieldTo != null) fieldTo.restoreValue();

        if (retVal && (tmpQ1.countRows() == tmpQ1.countColumns())) {
            tmpThis = tmpQ1;
            tmpThat = tmpQ1.multiply(tmpConjugatedQ1).multiply(tmpQ1);
            retVal &= tmpThis.equals(tmpThat, context);
        }

        if (rand.nextDouble() < mutationProbability)
            newProbabilityVectorVal = newProbabilityVectorVal * (1d - mutationShift) + (rand.nextBoolean() ? mutationShift : 0d);

        if (mSensorManager != null && handler != null && mGravity != null) {
            mSensorManager.unregisterListener(this, mGravity);
            mSensorManager.unregisterListener(this);
            if (processSensors != null) handler.removeCallbacks(processSensors);
            handler.removeCallbacksAndMessages(null);
            isHandlerLive = false;
        }

        if (getBooleanProperty("generate.singleLevelFetchEager")) {
            defaultConfiguration.setString("default.fetchStrategy", "lazy");
        }

        if (flatParsed.size() == 1) {
            return this.synthesizeUnaryExpression(flatParsed.get(0));
        }

        if (jaxb.getProfiles() != null) {
            for (ProfileType m : jaxb.getProfiles().getProfile()) {
                CertprofileEntry en = new CertprofileEntry(new NameId(null, m.getName()), expandConf(m.getType()), getValue(m.getConf(), zipFile));
                addProfile(en);
            }
        }

        if (Globals.prefs.getBoolean(JabRefPreferences.AUTO_ASSIGN_GROUP)) {
            final List<BibEntry> entries = Collections.singletonList(addedEntryEvent.getBibEntry());
            Globals.stateManager.getSelectedGroup(bibDatabaseContext).forEach(selectedGroup -> selectedGroup.addEntriesToGroup(entries));
        }

        if (beforeInitPlaceholder != null) {
            setHTMLImpl(beforeInitPlaceholder.getInnerHTML());
            setEnabledImpl(isEnabled());
            beforeInitPlaceholder = null;
        }

        if (!mergedVertices.contains(vertex)) {
            final Set<V> neighbors = this.adjacentVerticesOf(vertex);
            neighbors.add(vertex);
            for (final V neighbor : neighbors) {
                if (!neighbor.equals(vertex)) {
                    final Set<V> nextNeighbors = this.adjacentVerticesOf(neighbor);
                    nextNeighbors.add(neighbor);
                    if (neighbors.size() == nextNeighbors.size()) {
                        if (neighbors.containsAll(nextNeighbors)) {
                            vertex.setWeight(vertex.getWeight() + neighbor.getWeight());
                            mergedVertices.add(neighbor);
                            mergeList.add(new VerticesPair(vertex, neighbor));
                        }
                    }
                }
            }
            this.graph.removeAllVertices(mergedVertices);
        }

        if (shouldRegisterFonts) {
            graphicEnv.registerFont(f);
        }

        if (StringUtilities.isEmpty(msg)) {
            if (!this.btnOk.isEnabled()) {
                this.btnOk.setEnabled(true);
            }
            if (this.imageLabel.getImage() != null) {
                this.imageLabel.setImage(null);
            }
            this.imageLabel.setImage(getInfoImage());
            msg = Util.getString(PREFIX + "message");
        } else {
            if (this.btnOk.isEnabled()) {
                this.btnOk.setEnabled(false);
            }
            this.imageLabel.setImage(getErrorImage());
        }

        if (jacksonParser.currentToken() == JsonToken.START_OBJECT) {
            instance.columnBean = bean84ABindMap.parseOnJackson(jacksonParser);
        }

        if (flowNode instanceof FlowElementsContainer) {
            for (FlowElement nestedFlowElement : ((FlowElementsContainer) flowNode).getFlowElements()) {
                if (nestedFlowElement instanceof FlowNode) {
                    drawActivity(processDiagramCanvas, bpmnModel, (FlowNode) nestedFlowElement, highLightedActivities, highLightedFlows);
                }
            }
        }

        if (Nd4j.dataType() != DataBuffer.Type.FLOAT) logger.warn("FLOAT gemm called");

        if (bonus == null) return;

        if (context.isReset()) {
            buffer.putByte(255);
            buffer.putA(255);
        } else {
            buffer.putByte(context.getLocalX());
            buffer.putA(context.getLocalY());
        }

        if (state.backtracking == 0) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
            root_0 = (CommonTree) adaptor.nil();
            {
                adaptor.addChild(root_0, (CommonTree) adaptor.create(ARGLIST, "ARGLIST"));
            }
            retval.tree = root_0;
        }

        if (caseStudyData.get("end_date") != null) {
            temporalCaseStudy.setEndDate(dateFormat.parse(caseStudyData.get("end_date")));
        }

        if (mDescription instanceof AnalysisEngineDescription && ((AnalysisEngineDescription) mDescription).isPrimitive()) {
            try {
                md.resolveImports();
            } catch (InvalidXMLException e1) {
                throw new ResourceInitializationException(e1);
            }
        }

        if (firstSeenVersion != null) {
            if (!firstSeenVersion.equals(platform.getVersion())) {
                logger.log(Level.WARNING, "Multiple ports of WorldEdit are installed but they report different versions ({0} and {1}). " + "If these two versions are truly different, then you may run into unexpected crashes and errors.", new Object[]{firstSeenVersion, platform.getVersion()});
            }
        } else {
            firstSeenVersion = platform.getVersion();
        }

        if (erroneousUpload != null) {
            throw new MojoExecutionException("Error while uploading " + erroneousUpload);
        }

        if (getFailures().isEmpty()) {
            jobMonitor.setFinished(JobRunState.FINISHED_SUCCESSFULLY, null);
        } else {
            jobMonitor.setFinished(JobRunState.FINISHED_WITH_ERROR, null);
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("NAS Download: Request correctly sended start polling the result from server (max 1 hour)");
        }

        if (historyQuery.getSourceId() != null) {
            statement.setString(paramIndex, historyQuery.getSourceId());
        }

        if (range.isAllTime()) {
            if (log.isDebug2()) log.debug2(DEBUG_HEADER + "result = " + tdbAus);
            return tdbAus;
        }

        if (m_threads.get(getKey()) != null) {
            if (abortExisting) {
                if (LOG.isDebugEnabled()) {
                    LOG.debug(Messages.get().getBundle().key(Messages.LOG_PROGRESS_INTERRUPT_THREAD_1, getKey()));
                }
                Thread thread = m_threads.get(getKey());
                thread.interrupt();
            } else {
                throw new CmsIllegalStateException(Messages.get().container(Messages.ERR_PROGRESS_START_THREAD_EXISTS_0));
            }
        }

        if (currentUser.isSuperUser()) {
            return true;
        }

        if (exprFlags != null) {
            if (!exprFlags.isConstant()) return expr;
            String flags = exprFlags.getConstant().asString();
            if (!"i".equals(flags)) return expr;
            caseInsensitive = true;
        }

        if (isEmpty(firstTag.getNonTaggedText())) {
            remainder.taggingText = firstTag.getTaggedText();
        }

        if (!mayHaveSideEffects(thenBody) && elseBody != null) {
            n.removeChild(elseBody);
            n.replaceChild(thenBody, elseBody);
            Node notCond = new Node(Token.NOT);
            n.replaceChild(cond, notCond);
            compiler.reportChangeToEnclosingScope(n);
            notCond.addChildToFront(cond);
            cond = notCond;
            thenBody = cond.getNext();
            elseBody = null;
        }

        if (SpecManagementService.class.getName().equals(command.getService())) {
            handler = specManagementService;
        } else if (RuntimeManagementService.class.getName().equals(command.getService())) {
            handler = runtimeManagementService;
        } else if (RuleCapabilitiesService.class.getName().equals(command.getService())) {
            handler = ruleCapabilitiesService;
        } else {
            throw new IllegalStateException("Unable to find handler for " + command.getService() + " service");
        }

        if (config.statistics().get()) {
            server.addBean(new ConnectorStatistics());
        }

        if (observedMeasurement instanceof Range) {
            rangeLog.add(currentNumber, (EstimatedMeasurement<Range>) estimatedMeasurement);
            measType = "RANGE";
            stationName = ((EstimatedMeasurement<Range>) estimatedMeasurement).getObservedMeasurement().getStation().getBaseFrame().getName();
        } else if (observedMeasurement instanceof RangeRate) {
            rangeRateLog.add(currentNumber, (EstimatedMeasurement<RangeRate>) estimatedMeasurement);
            measType = "RANGE_RATE";
            stationName = ((EstimatedMeasurement<RangeRate>) estimatedMeasurement).getObservedMeasurement().getStation().getBaseFrame().getName();
        } else if (observedMeasurement instanceof AngularAzEl) {
            azimuthLog.add(currentNumber, (EstimatedMeasurement<AngularAzEl>) estimatedMeasurement);
            elevationLog.add(currentNumber, (EstimatedMeasurement<AngularAzEl>) estimatedMeasurement);
            measType = "AZ_EL";
            stationName = ((EstimatedMeasurement<AngularAzEl>) estimatedMeasurement).getObservedMeasurement().getStation().getBaseFrame().getName();
        } else if (observedMeasurement instanceof PV) {
            positionLog.add(currentNumber, (EstimatedMeasurement<PV>) estimatedMeasurement);
            velocityLog.add(currentNumber, (EstimatedMeasurement<PV>) estimatedMeasurement);
            measType = "PV";
        }

        if (payloads.size() == 0) {
            holder.mTitle.setText(getTitle());
            Drawable drawable = DrawableUtils.getSelectableBackgroundCompat(Color.WHITE, Color.parseColor("#dddddd"), DrawableUtils.getColorControlHighlight(context));
            DrawableUtils.setBackgroundCompat(holder.itemView, drawable);
            DrawableUtils.setBackgroundCompat(holder.frontView, drawable);
        } else {
            Log.d(this.getClass().getSimpleName(), "ExpandableHeaderItem Payload " + payloads);
        }

        if (outputSGR.isEnabled() && outputSGR.isSelected()) {
            useSmoothing.setEnabled(true);
        } else {
            useSmoothing.setEnabled(false);
        }

        if (authzConf.get(HadoopGroupResourceAuthorizationProvider.USE_NEW_GROUPS) == null) {
            authzConf.setBoolean(HadoopGroupResourceAuthorizationProvider.USE_NEW_GROUPS, true);
        }

        if (packet instanceof GlobalOrderReliableAsyncKeptDiscardedOrderedPacket)
            packet = ((GlobalOrderReliableAsyncKeptDiscardedOrderedPacket) packet).getBeforeFilterPacket();

        if (buf.getData() instanceof byte[]) {
            data = (byte[]) buf.getData();
        }

        if (random.nextFloat() > 0.03f) {
            return;
        }

        if (mService.isPowerStandbyOrTransient() || !mService.getPowerManager().isScreenOn()) {
            mService.wakeUp();
        }

        if (unavailable.get()) {
            throw new QuasarFilterUnavailable("No TRL available past the startup delay");
        }

        if (!validateConnectedLuns(vds, getParameters().getLunIds())) {
            return new Pair<>(Boolean.FALSE, resultMap);
        }

        if (null != fileSystemChars.get(SupportedNtpFileSystemInformation.getFileSystemInformation(SupportedNtpFileSystemInformation.PROVISIONED_CAPACITY.toString()))) {
            StringSet provisionedCapacity = new StringSet();
            String totalCapacity = fileSystemChars.get(SupportedNtpFileSystemInformation.getFileSystemInformation(SupportedNtpFileSystemInformation.PROVISIONED_CAPACITY.toString()));
            String snapShotReserveBlocks = fileSystemChars.get(SupportedNtpFileSystemInformation.getFileSystemInformation(SupportedNtpFileSystemInformation.SNAPSHOT_BLOCKS_RESERVED.toString()));
            String fsProvisionedCapacity = Long.toString(Long.parseLong(totalCapacity) + (Long.parseLong(snapShotReserveBlocks) * BYTESCONVERTER));
            provisionedCapacity.add(fsProvisionedCapacity);
            unManagedFileSystemInformation.put(SupportedFileSystemInformation.PROVISIONED_CAPACITY.toString(), provisionedCapacity);
        }

        if (DashboardType.Product.equals(dashboard.getType())) {
            return;
        }

        if (loc == null) {
            loc = Locale.getDefault();
            if (log.isDebugEnabled()) {
                log.debug("setContextLocale(Locale), using default locale");
            }
        } else if (!Locale.getDefault().getLanguage().equals("en") && loc.getLanguage().equals("en") && !loc.toString().equals(DEBUG_LOCALE)) {
            loc = new Locale("");
            if (log.isDebugEnabled()) {
                log.debug("setContextLocale(Locale), Tweak for English");
            }
        }

        if (mention.appositions != null) {
            for (Mention m : mention.appositions) {
                builder.addAppositions(m.mentionID);
            }
        }

        if (rawValue != null) {
            setPropertyValue(solrDocument, property, new TypedValue(rawValue), locale);
            ListItem valueInfo = knownValues.get(rawValue);
            if (valueInfo != null && valueInfo.getValue() != null && !valueInfo.getValue().equals(rawValue)) {
                setPropertyValue(solrDocument, property, new TypedValue(valueInfo.getValue(), TypedValue.TEXT), locale);
            }
        }

        if (1.0 * nonzero_num / (pos - nextCheckPos + 1) >= 0.95) nextCheckPos = pos;

        if (that.maxLatitude.degrees > this.maxLatitude.degrees) return false;

        if (page.getTitle() != null) {
            builder.append("\n");
            builder.append(page.getTitle());
        }

        if (row >= m_sort.size()) {
            return null;
        }

        if (type instanceof TurtleContent || type instanceof PredicateObjectSentenceList || type instanceof ObjectList) {
            return traverseChildrenSkipping(node, result);
        }

        if (listPageClass == null) {
            throw new NullListPageClassException();
        }

        if (StringUtils.isEmpty(mod)) {
            mod = "0000";
        }

        if (numeroSequencialArquivo != null) {
            parametros.put("sequencial", numeroSequencialArquivo);
        } else {
            parametros.put("sequencial", "");
        }

        if (App.loginManager.isDefaultUser(author)) {
            return true;
        }

        if (dest != null || overwrite == true) {
            if (dest.isDirectory()) {
                final String fname = res.getId();
                dest = new File(dest, fname);
            }
            FileOutputStream os;
            os = new FileOutputStream(dest);
            ((ExtendedResource) res).getContentIntoAStream(os);
        } else {
            final String msg = "Dest binary file " + ((dest != null) ? (dest.getAbsolutePath() + " ") : "") + "exists. Use " + "overwrite property to overwrite file.";
            if (failonerror) {
                throw (new BuildException(msg));
            } else {
                log(msg, Project.MSG_ERR);
            }
        }

        if (!MPerm.getPermStatus().has(msender, faction, true)) return;

        if (vpool.getType().equalsIgnoreCase(Type.block.name())) {
            qosSpecification = QosService.getQos(vpool.getId(), _dbClient);
        }

        if (loop.size() < 4) {
            throw new IllegalArgumentException(excpMsgPrf + "a polygon ring must contain at least 4 points " + "(including repeated closing vertex)");
        }

        if (expectOutgoing != null) {
            if (expectOutgoing.isSameLocation(x, y, z, yaw, pitch)) {
                if (!expectIncoming.isEmpty()) {
                    final Iterator<CountableLocation> it = expectIncoming.iterator();
                    while (it.hasNext()) {
                        final CountableLocation ref = it.next();
                        if (time < ref.time) {
                            ref.time = time;
                        } else if (time - maxAge > ref.time) {
                            it.remove();
                        } else {
                            break;
                        }
                    }
                    if (!expectIncoming.isEmpty()) {
                        final CountableLocation last = expectIncoming.getLast();
                        if (last.isSameLocation(x, y, z, yaw, pitch)) {
                            last.time = time;
                            last.count++;
                            last.teleportId = teleportId;
                            res = last;
                        }
                    }
                }
                if (res == null) {
                    res = new CountableLocation(x, y, z, yaw, pitch, 1, time, teleportId);
                    expectIncoming.addLast(res);
                    if (expectIncoming.size() > maxQueueSize) {
                        expectIncoming.removeFirst();
                    }
                }
            }
            expectOutgoing = null;
        }

        if (ppt.var_infos.length == 0) return;

        if (activityIntent.hasExtra(ChooseLockGenericFragment.EXTRA_CHOOSE_LOCK_GENERIC_EXTRAS)) {
            intent.putExtras(activityIntent.getBundleExtra(ChooseLockGenericFragment.EXTRA_CHOOSE_LOCK_GENERIC_EXTRAS));
        }

        if (mode == Mode.COLUMN) {
            area.adjustFromPlanarizedFacing(EnumFacing.EAST, amount, EnumFacing.UP, EnumFacing.EAST);
            area.writeToNBT(modeTag);
            return;
        }

        if (selectResult(event.useItemInHand(), !useInteractedBlock)) {
            ItemType type = ItemTable.instance().getItem(holding.getType());
            if (holding.getType() != Material.AIR && type.getContext().isBlockApplicable()) {
                type.rightClickBlock(player, clicked, face, holding, clickedLoc, slot);
            }
        }

        if (xmlExportMain.isIncludeComments()) {
            HibernateSession.callbackHibernateSession(GrouperTransactionType.READONLY_NEW, AuditControl.WILL_NOT_AUDIT, new HibernateHandler() {
                public Object callback(HibernateHandlerBean hibernateHandlerBean) throws GrouperDAOException {
                    try {
                        writer.write("\n    <!-- ");
                        XmlExportUtils.toStringAttributeDefNameSet(writer, attributeDefNameSet, false);
                        writer.write(" -->\n");
                        return null;
                    } catch (IOException ioe) {
                        throw new RuntimeException(ioe);
                    }
                }
            });
        }

        if (!MODEL_FILE_FOLDER.canRead()) {
            MODEL_FILE_FOLDER = new File(ClassLoader.getSystemResource("testFeatureModels").getPath());
        }

        if (values != null && values.length > 0) {
            Multimap<String, Object> valueMap = HashMultimap.create(1, values.length);
            for (Object value : values) {
                Pair<String, Object> useValue = skipChoice(name.getLocalPart(), value, reporter);
                if (useValue != null) valueMap.put(useValue.getFirst(), useValue.getSecond());
            }
            for (String propName : valueMap.keySet()) {
                Collection<Object> realValues = valueMap.get(propName);
                jsonGen.writeFieldName(propName);
                if (realValues.size() == 1) streamWritePropertyValue(realValues.iterator().next(), reporter);
                else {
                    jsonGen.writeStartArray();
                    for (Object obj : realValues) streamWritePropertyValue(obj, reporter);
                    jsonGen.writeEndArray();
                }
            }
        }

        if (className.charAt(0) == '[') {
            int arrayDimension = className.lastIndexOf('[') + 1;
            String componentClassName = className.substring(arrayDimension, className.length());
            type = loadClass(componentClassName, classLoader);
            int dim[] = new int[arrayDimension];
            java.util.Arrays.fill(dim, 0);
            return Array.newInstance(type, dim).getClass();
        }

        if (cacti_on && Math.random() * 30.0 < speed) {
            double left_x = maxdist * (width - centre) / height;
            double right_x = maxdist * (0 - centre) / height;
            double x = left_x + Math.random() * (right_x - left_x);
            double clat = lat + (maxdist - cardist) * Math.cos(heading) - x * Math.sin(heading);
            double clon = lon + (maxdist - cardist) * Math.sin(heading) + x * Math.cos(heading);
            cacti.add(new EastNorth(clon, clat));
            chop = true;
        }

        if (!ts.tooLarge()) {
            ts.loadAllTiles(false);
        }

        if (!teste) {
            httppost = new HttpPost("http://sindical.rtools.com.br:7076/webservice/cliente/" + reg.getChaveCliente() + "/pesquisar_boleto");
        } else {
            httppost = new HttpPost("http://192.168.1.108:8084/webservice/cliente/" + reg.getChaveCliente() + "/pesquisar_boleto");
        }

        if (isolatedTestRun) {
            cartChanged = false;
        }

        if (entityPos.equals(pos.add(0, 1, 0))) {
            return true;
        }

        if (fMissing != null) {
            result.addAll(fMissing);
        }

        if (byteReceiver.dealWithBytes(inputStream) == false) byteReceiver.finishUp();

        if (null == value) {
            if (null != valueOther) {
                if (field.getType() == FTDateTime) {
                    long lValue = dateObjectToLong(valueOther);
                    if (lValue > 0) {
                        Log.d(TAG, value + "<->" + valueOther);
                        return false;
                    }
                } else {
                    Log.d(TAG, value + "<->" + valueOther);
                    return false;
                }
            }
        } else if (null == valueOther) {
            Log.d(TAG, value + "<->" + valueOther);
            return false;
        } else {
            if (field.getType() == GeoConstants.FTInteger) {
                if (!checkIntegerEqual(value, valueOther)) {
                    Log.d(TAG, value + "<->" + valueOther);
                    return false;
                }
            } else if (field.getType() == GeoConstants.FTReal) {
                if (!checkRealEqual(value, valueOther)) {
                    Log.d(TAG, value + "<->" + valueOther);
                    return false;
                }
            } else if (field.getType() == GeoConstants.FTDate || field.getType() == GeoConstants.FTTime || field.getType() == GeoConstants.FTDateTime) {
                if (!checkDateEqual(value, valueOther)) {
                    Log.d(TAG, value + "<->" + valueOther);
                    return false;
                }
            } else if (!value.equals(valueOther)) {
                Log.d(TAG, value + "<->" + valueOther);
                return false;
            }
        }

        if (out.exists() && !out.delete()) {
            throw new IOException("Could not reset file");
        }

        if (value instanceof Enum) {
            return ENUM;
        }

        if (image != null) {
            lblPicture.setText("Wird neu skaliert...");
            lstFotos.setEnabled(false);
        }

        if (ObjectHelper.isNotEmpty(username)) {
            AuthorizationPolicy authPolicy = new AuthorizationPolicy();
            authPolicy.setUserName(username);
            authPolicy.setPassword(password);
            if (factoryBean.getProperties() == null) {
                factoryBean.setProperties(new HashMap<String, Object>());
            }
            factoryBean.getProperties().put(AuthorizationPolicy.class.getName(), authPolicy);
        }

        if (compressedDirectBufLen <= 0) {
            if (userBufLen <= 0) {
                return true;
            } else {
                setInputFromSavedData();
            }
        }

        if (useIntegratedSecurityCheck != null) {
            Boolean useIntegratedSecurity = useIntegratedSecurityCheck.isChecked();
            meta.getAttributes().put(MSSQLServerNativeDatabaseMeta.ATTRIBUTE_USE_INTEGRATED_SECURITY, useIntegratedSecurity != null ? useIntegratedSecurity.toString() : "false");
        }

        if (dir1.length() > dir2.length()) {
            return 1;
        } else if (dir1.length() < dir2.length()) {
            return -1;
        }

        if (ch == ',' || i + 1 == len) {
            try {
                parts[partCount++] = Integer.parseInt(buf.toString());
                buf.setLength(0);
            } catch (NumberFormatException ex) {
                throw new FileTransferException("Malformed PASV reply: " + reply);
            }
        }

        if (result == 0.0) Assert.assertEquals(testResult[i], result, 0.0001);
        else {
            Assert.assertTrue(result != 0.0);
            Assert.assertEquals(testResult[i], result, 0.03);
        }

        if (primitive instanceof String) {
            return (String) primitive;
        } else if (primitive instanceof Calendar) {
            return DatatypeConverter.printDateTime((Calendar) primitive);
        } else if (primitive instanceof byte[]) {
            return DatatypeConverter.printBase64Binary((byte[]) primitive);
        } else {
            return primitive.toString();
        }

        if (dkconfig_ppt_perc != 100) {
            ppt_max_name = setup_ppt_perc(decl_files, dkconfig_ppt_perc);
            System.out.println("Max ppt name = " + ppt_max_name);
        }

        if (name_of_block_to_exec_next == null) {
            Util.logger_assert("Error in _NonAtomicActiveEvent.  Should not receive the " + "beginning of a sequence message without some " + "instruction for what to do next.");
        }

        if (baseName.startsWith("com.foo.Xml")) {
            System.out.println("\treturns " + XMLCONTROL);
            return XMLCONTROL;
        }

        if (this.isReceiver) {
            return true;
        }

        if (i < numExt - 1) {
            correlationID = reader.readDssHeader();
            int codePoint = reader.readLengthAndCodePoint(true);
        }

        if (previousState.getType() != Material.AIR) {
            Events.fireToCancel(event, new BreakBlockEvent(event, create(event.getPlayer()), previousState.getLocation(), previousState.getType()));
        }

        if (red == temp2) {
            red += inc;
            red %= 256;
        } else if (green == temp2) {
            green += inc;
            green %= 256;
        } else if (blue == temp2) {
            blue += inc;
            blue %= 256;
        }

        if ((physician != null) && (!physician.isEmpty())) {
            result = addExtraQueryParam(result, "(PerformingPhysicianName:(" + physician + ") OR ReferringPhysicianName:(" + physician + "))");
        }

        if (mFragment.shouldShowPrice()) {
            mFragment.updateTotalPrices(TradeFragment.BOTH);
        }

        if (GROUP_NAME.equals(trigger.getKey().getGroup())) {
            String contextId = trigger.getJobDataMap().getString(CONTEXT_ID);
            if (contextId == null) {
                log.warn("One of our triggers ({}) didn't have a context ID", trigger.getKey());
            } else {
                dao.remove(trigger.getJobKey().getName(), contextId);
            }
        }

        if (channel.getEnablement() != Enablement.Passive) {
            if (enabling_channel != null)
                throw new Exception(String.format("Group '%s': " + "Cannot add enabling channel '%s', " + "already enabled by '%s'", name, channel.getName(), enabling_channel.getName()));
            enabling_channel = channel;
        }

        if (FacebookUtils.isLinkedForWrite(this)) {
            String graphPath = "me/links";
            Map<String, Object> postData = new HashMap<String, Object>();
            postData.put("message", "A message to post");
            postData.put("link", "http://getsocialize.com");
            postData.put("name", "Socialize SDK!");
            FacebookUtils.post(this, graphPath, postData, new SocialNetworkPostListener() {
                @Override
                public void onNetworkError(Activity context, SocialNetwork network, Exception error) {
                }

                @Override
                public void onCancel() {
                }

                @Override
                public void onAfterPost(Activity parent, SocialNetwork socialNetwork, JSONObject responseObject) {
                }
            });
        } else {
        }

        if (v.size() > 0) {
            try {
                headerAcceptDelay = Long.parseLong(v.get(0)) * 1000;
            } catch (NumberFormatException e) {
                log.error("Unable to ingest the value of the " + HttpHeaders.ASYNC_ACCEPT + " header. msg: " + e.getMessage());
                headerAcceptDelay = -1;
            }
        }

        if (!FluidRegistry.isFluidRegistered("oil")) {
            fluidOil = FluidFactory.createNewFluid("oil", new ResourceLocation(assetDir, "blockFluidOil.sill"), new ResourceLocation(assetDir, "blockFluidOil.flowing"));
            fluidOil.setDensity(800);
            fluidOil.setViscosity(10000);
            FluidRegistry.registerFluid(fluidOil);
        } else fluidOil = FluidRegistry.getFluid("oil");

        if (!account.equals(postInfo.ownerAccount)) {
            online = false;
            postInfo.ownerAccount = account;
            loginWithSelectedAccount();
        }

        if (tool.getItem().canHarvestBlock(state, tool)) {
            return speed;
        }

        if (kind == ElevationWayPointKind.Highlighted) {
            drawSphere(g, Color.WHITE, c, pnt.x, pnt.y, BIG_WPT_RADIUS);
            drawLabel(ElevationHelper.getTimeText(wpt), pnt.x, pnt.y - g.getFontMetrics().getHeight() - 5, g);
            drawLabel(ElevationHelper.getElevationText(wpt), pnt.x, pnt.y + g.getFontMetrics().getHeight() + 5, g);
        }

        if (!StringUtils.isBlank(headerTitle)) {
            final String format = getFormat(maxNameWidth);
            print(writer, MESSAGE_INDENT, String.format(format, headerTitle));
            print(writer, MESSAGE_INDENT, String.format(format, getHeaderDelimiter(maxNameWidth)));
        }

        if (parentRegion != null && parentRegion.getUpstreamRegion() != null) {
            int[] upstreamDims = new int[]{calculateInputWidth()};
            params.setInputDimensions(upstreamDims);
            connections.setInputDimensions(upstreamDims);
        } else if (parentRegion != null && parentNetwork != null && parentRegion.equals(parentNetwork.getSensorRegion()) && encoder == null && spatialPooler != null) {
            Layer<?> curr = this;
            while ((curr = curr.getPrevious()) != null) {
                if (curr.getEncoder() != null) {
                    int[] dims = (int[]) curr.getParameters().get(KEY.INPUT_DIMENSIONS);
                    params.setInputDimensions(dims);
                    connections.setInputDimensions(dims);
                }
            }
        }

        if (getMode() == ProgrammingMode.DIRECTBYTEMODE) {
            m = SRCPMessage.getWriteDirectCV(_bus, _cv, _val);
        } else {
            m = SRCPMessage.getWriteRegister(_bus, registerFromCV(_cv), _val);
        }

        if (checkAppArgs(commandArguments.size() - 1, 1)) {
            final String zkConnectString = commandArguments.get(1);
            final ZooKeeper zkClient = new ZooKeeper(zkConnectString, 5000, null);
            new BrokerWatcher(zkClient, arguments);
            while (true) ;
        }

        if (element instanceof ProcessesTreeNode) {
            ProcessesTreeNode node = (ProcessesTreeNode) element;
            if (!node.childrenQueried || node.childrenQueryRunning) {
                hasChildren = true;
            } else if (node.childrenQueried) {
                hasChildren = node.children.size() > 0;
            }
        }

        if (rootURL.isEmpty() || authToken.isEmpty()) {
            logger.warn("parameter \"" + TOKEN_PARAM + "\" and \"" + GITBUCKET_URL_PARAM + "\" are required");
            return;
        }

        if (state.action == State.ACTION_OPEN_TREE && !supportsIsChild) continue;

        if (op != null && op.equals("reload")) {
            if (reloadCause != null && reloadCause.equals("subjectArea")) {
                int index = Integer.parseInt(reloadId);
                Debug.debug("subj area changed ... " + reloadId + " - " + frm.getSubjectArea(index));
                frm.setCourseNbr(index, Preference.BLANK_PREF_VALUE);
                frm.setItype(index, Preference.BLANK_PREF_VALUE);
                frm.setClassNumber(index, Preference.BLANK_PREF_VALUE);
            }
            if (reloadCause != null && reloadCause.equals("moveUp")) {
                int index = Integer.parseInt(reloadId);
                Debug.debug("moving up ... " + reloadId);
                frm.swap(index, index - 1);
            }
            if (reloadCause != null && reloadCause.equals("moveDown")) {
                int index = Integer.parseInt(reloadId);
                Debug.debug("moving down ... " + reloadId);
                frm.swap(index, index + 1);
            }
        }

        if (!getUsers().isEmpty()) {
            StringBuilder usersToken = new StringBuilder("# JBoss application-users.properties file generated by CARGO\n");
            for (User user : getUsers()) {
                usersToken.append(WildFlyUserUtils.generateUserPasswordLine(user, "ApplicationRealm"));
            }
            getFileHandler().writeTextFile(getFileHandler().append(getHome(), "/configuration/application-users.properties"), usersToken.toString(), "UTF-8");
        }

        if (isLocationEnabled()) {
            EventData data = EventData.getInstance();
            switch (msg.what) {
                case LocationConstants.UPDATE_ADDRESS:
                    Address address = (Address) msg.obj;
                    data.getVenue().setLatitude(address.getLatitude());
                    data.getVenue().setLongitude(address.getLongitude());
                    data.getVenue().setAddress(formatAddress(address));
                    break;
                default:
                    Location location = (Location) msg.obj;
                    if (location != null) {
                        data.getVenue().setLatitude(location.getLatitude());
                        data.getVenue().setLongitude(location.getLongitude());
                    }
                    break;
            }
        }

        if (startDateOpt.isPresent() && endDateOpt.isPresent()) {
            if (periodToStartOpt.isPresent() || tenorOpt.isPresent()) {
                throw new IllegalArgumentException("Swap trade had invalid combination of fields. When these fields are found " + ImmutableList.of(CONVENTION_FIELD, START_DATE_FIELD, END_DATE_FIELD) + " then these fields must not be present " + ImmutableList.of(PERIOD_TO_START_FIELD, TENOR_FIELD));
            }
            LocalDate startDate = startDateOpt.get();
            LocalDate endDate = endDateOpt.get();
            SwapTrade trade = createSwap(info, conventionStr, startDate, endDate, buySell, notional, fixedRate, fxRateOpt);
            return adjustTrade(trade, rollCnvOpt, stubCnvOpt, firstRegStartDateOpt, lastRegEndDateOpt, dateCnv, dateCalOpt);
        }

        if (!getRawHeader().equals(ModTypeConstants.BASEGAME) && !getRawHeader().equals(ModTypeConstants.TESTPATCH)) {
            JLabel reasonLabel = new JLabel("Reason for this task");
            reasonLabel.setFont(reasonLabel.getFont().deriveFont(14f));
            gbc.gridy++;
            jobPanel.add(reasonLabel, gbc);
            String reason = "";
            if (getRawRequirementText() != null) {
                reason = getRawRequirementText();
            }
            requirementLabel = new JTextField(reason);
            requirementLabel.setUI(new HintTextFieldUI("Specify a reason this job exists in the mod, e.g. fixes stuff in X"));
            gbc.gridy++;
            jobPanel.add(requirementLabel, gbc);
        }

        if (!data.hasPermission(Permissions.SMARTMOVING_SLIDING, player)) {
            smartMoving += "§0§1§6§f§f";
        }

        if (onlyNonExistent) {
            if (result.isEmpty()) {
                Tag tagEntity = new Tag();
                tagEntity.setTitle(tag);
                this.save(tagEntity);
                list.add(convertToDocument(tagEntity));
            }
        } else {
            if (!result.isEmpty()) list.add(result.get(0));
            else logger.info("findTagsByTagList: Skipping unknown tag " + tag);
        }

        if (protocolClassName == null || protocolClassName.equals("hci.gnomex.model.FeatureExtractionProtocol")) {
            Element featureExtractionProtocols = new Element("Protocols");
            featureExtractionProtocols.setAttribute("label", "Feature Extraction Protocol");
            featureExtractionProtocols.setAttribute("protocolClassName", FeatureExtractionProtocol.class.getName());
            root.addContent(featureExtractionProtocols);
            l = sess.createQuery("select fe from FeatureExtractionProtocol fe order by fe.featureExtractionProtocol").list();
            if (!l.isEmpty()) {
                Iterator iter = l.iterator();
                while (iter.hasNext()) {
                    FeatureExtractionProtocol fep = (FeatureExtractionProtocol) iter.next();
                    addFeatureExtractProtocolNode(fep, featureExtractionProtocols);
                }
            }
        }

        if (getConfig().isSetAnonymous()) {
            if (getConfig().getAnonymous().equals(AnonymousTypeConfig.PROHIBITED)) {
                return AnonymousTypeConfig.PROHIBITED.toString();
            } else if (getConfig().getAnonymous().equals(AnonymousTypeConfig.REQUIRED)) {
                return AnonymousTypeConfig.REQUIRED.toString();
            }
        }

        if (this.onGround && !this.getEntityWorld().isRemote && this.isMoving()) {
            if (this.hasAttackTarget()) {
                if (this.rand.nextInt(5) == 0) this.leap(6.0F, 0.6D, this.getAttackTarget());
            } else {
                if (this.rand.nextInt(25) == 0) this.leap(1.0D, 1.0D);
            }
        }

        if ((setName == null) || (setName.length() == 0)) {
            System.out.println("common data set under: " + outputPath + "/all.train");
        } else {
            System.out.println("common data set under: " + outputPath + "/all." + setName);
        }

        if (this.ignoredUserNamePatterns != null) {
            for (final Pattern ignoredUserNamePattern : this.ignoredUserNamePatterns) {
                if (ignoredUserNamePattern.matcher(userName).matches()) {
                    return false;
                }
            }
        }

        if (!WebloggerConfig.getBooleanProperty("groupblogging.enabled")) {
            addError("inviteMember.disabled");
            return SUCCESS;
        }

        if (contains) {
            continue;
        }

        if (bankCOAList.contains(coa)) return true;

        if (paramTypes != null && paramTypes.length == 1 && paramTypes[0] == int.class) {
            if (indexedGetter == null || methodName.startsWith(PREFIX_GET) || (methodName.startsWith(PREFIX_IS) && !indexedGetter.getName().startsWith(PREFIX_GET))) {
                indexedGetter = getter;
            }
        }

        if (adapter.isAssignableFrom(IWorkbenchAdapter.class)) {
            return new WorkbenchAdapter() {
                @Override
                public String getLabel(Object object) {
                    return getName();
                }
            };
        }

        if (asset.getBookValue().compareTo(KualiDecimal.ZERO) < 0) {
            putFieldError(CamsPropertyConstants.Asset.BOOK_VALUE, CamsKeyConstants.Asset.ERROR_INVALID_BOOKVALUE_AMOUNT);
            return false;
        }

        if (t instanceof java.lang.NoClassDefFoundError) {
            System.err.println("Unable to load a class definition, maybe the classpath is not accessible");
        }

        if (modifyContext.getModItems().isEmpty()) {
            return;
        }

        if (serverNode.getType() == UserNodeType.INMEMORY_DATASOURCES) {
            serverNode.children = SolutionExplorerListContentProvider.createInMemTables(((MemServer) serverNode.getRealObject()).getServoyProject(), includeModules);
        } else {
            IServerInternal server = (IServerInternal) serverNode.getRealObject();
            PlatformSimpleUserNode storedProceduresDataSources = new PlatformSimpleUserNode(Messages.TreeStrings_procedures, UserNodeType.PROCEDURES, null, "This node list the stored procedures of server that have this property enabled (see server editor)", server, uiActivator.loadImageFromBundle("function.png"));
            storedProceduresDataSources.parent = serverNode;
            ArrayList<SimpleUserNode> list = new ArrayList<SimpleUserNode>();
            list.add(storedProceduresDataSources);
            serverNode.children = SolutionExplorerListContentProvider.createTables(server, type, list);
        }

        if (fetch.hasFetchInnerJoin(field.getFullName(false))) outer = false;

        if (MainDao.checkSchema(schemaName)) {
            String msg = Utils.getBundleString("CreateExampleSchemaTask.project") + schemaName + Utils.getBundleString("CreateExampleSchemaTask.overwrite_it");
            int res = Utils.showYesNoDialog(mainFrame, msg, Utils.getBundleString("CreateExampleSchemaTask.create_example"));
            if (res != JOptionPane.YES_OPTION) return null;
            MainDao.deleteSchema(schemaName);
        }

        if (lePanel != null) {
            for (int i = 0; i < (mBlockEntries.size() - 1); i++) {
                LayoutBlock lBlock = InstanceManager.getDefault(LayoutBlockManager.class).getByUserName(getBlockBySequenceNumber(i).getUserName());
                if (lBlock == null) {
                    log.error("Layout Block " + getBlockBySequenceNumber(i).getUserName() + " not found.  Paths not checked.");
                } else {
                    lBlock.updatePathsUsingPanel(lePanel);
                }
            }
        }

        if (viewHolder.getItemViewType() != 1 && viewHolder.getItemViewType() != 8) {
            Info dat = data.get(position);
            InfoDataViewHolder Indicador = (InfoDataViewHolder) viewHolder;
            Indicador.TitleInfoTxt.setText(dat.getTitle());
            Indicador.ContentInfodata.setText(dat.getContent());
        } else {
            Info dat = data.get(position);
            MapViewHolder Indicador = (MapViewHolder) viewHolder;
            Indicador.mapaShow.setBuiltInZoomControls(true);
            Indicador.mapaShow.setMultiTouchControls(true);
            Indicador.mapaShow.setClickable(false);
            Indicador.mapaShow.getController().setZoom(14);
            Indicador.mapaShow.getController().setCenter(new GeoPoint(-25.2961407, -57.6309129));
        }

        if (fNamespaces != null) {
            Iterator<Namespace> it = fNamespaces.iterator();
            Namespace ns;
            while (it.hasNext()) {
                ns = it.next();
                startElement.append(" ");
                startElement.append(ns.toString());
            }
        }

        if (secretResolver != null && secretResolver.isInitialized() && secretResolver.isTokenProtected(PROTOCOL_HANDLER_USERNAME_ALIAS)) {
            protocolHandlerAdminUser = secretResolver.resolve(PROTOCOL_HANDLER_USERNAME_ALIAS);
            if (log.isDebugEnabled()) {
                log.debug("Loaded TaskEngine's protocol handler username from secure vault");
            }
        } else {
            if (authentication.getUsername() != null) {
                this.protocolHandlerAdminUser = authentication.getUsername();
            }
        }

        if (treeBox.getFacet("template") != null) {
            final String encodedTemplate = StringHtmlEncoder.encodeComponentWithSurroundingDiv(context, treeBox.getFacet("template"));
            if (treeBoxModelType == TreeBoxModelType.OBJECTS) {
                options.append("\n    template: '" + encodedTemplate + "',");
            } else {
                options.append("\n    templates: ['" + encodedTemplate + "'],");
            }
        } else if (treeBoxModelType == TreeBoxModelType.NODES) {
            options.append("\n    templates: ['" + TreeRenderer.DEFAULT_NODES_TEMPLATE + "'],");
        } else if (treeBoxModelType == TreeBoxModelType.OBJECTS) {
            options.append("\n    template: '" + DEFAULT_SINGLE_LINE_OF_TEXT_TEMPLATE + "',");
        }

        if (size < 2) {
            return;
        }

        if (dir < 0) theTime.t5 = dir * amax + root / 2;
        else theTime.t5 = dir * amax - root / 2;

        if (!b.getMetrics().getNames().contains(m.getName()) && !b.getMetrics().get(m.getName()).getNodeValues().getNames().contains(n.getName())) {
            table.addBlankRow(tableDescrArray.length - 1, b.getTimestamp());
        } else {
            AggregatedValue[] values = tempBatch.getMetrics().get(m.getName()).getNodeValues().get(n.getName()).getValues();
            for (int i = 0; i < values.length; i++) {
                double[] selectedValuesArray = TexUtils.selectValuesFromNodeValueList(values[i], config);
                table.addRow(selectedValuesArray, i);
            }
        }

        if (metadata.getMinJavaVersion() != null) {
            final JavaSpecVersion runtimeVersion = new JavaSpecVersion(System.getProperty("java.specification.version"));
            if (metadata.getMinJavaVersion().isNewerThan(runtimeVersion)) {
                Log.warn("Ignoring plugin '{}': requires Java specification version {}. Openfire is currently running in Java {}.", canonicalName, metadata.getMinJavaVersion(), System.getProperty("java.specification.version"));
                failureToLoadCount.put(canonicalName, Integer.MAX_VALUE);
                return false;
            }
        }

        if (colecaoDivisaoEsgoto == null || colecaoDivisaoEsgoto.isEmpty()) {
            throw new ActionServletException("atencao.pesquisa.nenhumresultado", null, "DivisaoEsgoto");
        } else {
            httpServletRequest.setAttribute("colecaoDivisaoEsgoto", colecaoDivisaoEsgoto);
            DivisaoEsgoto divisaoEsgoto = new DivisaoEsgoto();
            divisaoEsgoto = (DivisaoEsgoto) Util.retonarObjetoDeColecao(colecaoDivisaoEsgoto);
            String idRegistroAtualizacao = divisaoEsgoto.getId().toString();
            sessao.setAttribute("idRegistroAtualizacao", idRegistroAtualizacao);
        }

        if (exists(algorithm, hash)) {
            return new InputStreamSupplier() {
                public InputStream get() {
                    InputStream is = getInputStreamMatchingHash(algorithm, hash);
                    return is;
                }
            };
        }

        if (any instanceof Element) {
            Element valueElement = (Element) any;
            if (valueElement.hasChildNodes()) {
                NodeList children = valueElement.getChildNodes();
                for (int i = 0; i < children.getLength(); ++i) {
                    Node child = children.item(i);
                    if (child.getNodeType() == Node.ELEMENT_NODE) {
                        DomReader reader = new DomReader((Element) child);
                        return this.xstream.unmarshal(reader);
                    }
                }
            } else {
                value = null;
            }
        }

        if (!toDrop.isEmpty()) {
            for (ItemStack s : toDrop) {
                UtilItemStack.dropItemStackInWorld(this.getWorld(), this.getPos().up(), s);
            }
        }

        if (modelID == null) {
            modelID = accessModelID;
            Operation op = (Operation) setOpNode.getProperty(NodeConstants.Info.SET_OPERATION);
            if (!CapabilitiesUtil.supportsSetOp(accessModelID, op, metadata, capFinder)) {
                return false;
            }
            if (multiSource && op != Operation.UNION) {
                return false;
            }
        } else if (!CapabilitiesUtil.isSameConnector(modelID, accessModelID, metadata, capFinder)) {
            return false;
        }

        if (req.getCliVersion() != CliVersion.getVersion()) {
            String reason = "Incompatible CLI request using version " + req.getCliVersion() + " while DUCC expects version " + CliVersion.getVersion();
            logger.warn(methodName, null, action + " rejected. " + reason);
            req.setReply(makeResponse(false, reason, action, -1));
            return false;
        }

        if (args.length > 0) {
            String[] arg = new String[args.length - 1];
            for (int i = 1; i < args.length; i++) {
                arg[i - 1] = args[i];
            }
            if (runApp(args[0], arg)) {
                return;
            }
        }

        if (searchResult == null || searchResult.getAsJsonObject() == null) {
            Logger.error("Null searrch result" + track.rdio_id);
            try {
                Logger.info("Deleted track");
                return null;
            } catch (Exception e) {
                Logger.info("" + e.getMessage());
            } finally {
                return null;
            }
        }

        if (hasInferredReturnType(falseExpression)) {
            typeOfFalse = falseExpression.getNodeMetaData(StaticTypesMarker.INFERRED_RETURN_TYPE);
        }

        if (partSales.getSalesType() == AppConstants.SALES_TYPE_EXECHANGE) {
            if (items.get(i).getItemType().equals(AppConstants.ITEM_TYPE_RETURNED)) {
                continue;
            }
        }

        if (CLogMgt.isLevelFiner()) {
            List<MemoryPoolMXBean> list = ManagementFactory.getMemoryPoolMXBeans();
            Iterator<MemoryPoolMXBean> it = list.iterator();
            while (it.hasNext()) {
                MemoryPoolMXBean pool = (MemoryPoolMXBean) it.next();
            }
        } else {
            MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
        }

        if (folder.exists()) {
            folder.delete();
        }

        if (c == '\r') {
            c = inStream.read();
            if ((c != '\n') && (c != -1)) inStream.unread(c);
        }

        if (l.modules_dir != null && l.modules_dir.equals(file.getAbsoluteFile().getParentFile().getAbsolutePath())) {
            _logger.info("... skipping module: " + file.getName());
            return true;
        }

        if (metadataType.getType() == MetadataType.MetadataTypeEnum.OTHER) {
            metadataType.setOtherType(descObjMetadata.getMetadataType());
        }

        if (first) {
            first = false;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (l == 0) {
            if (unit == 0) uwidth = udist / (double) (numstrips[l] + 16);
            else uwidth = udist / (double) numstrips[l];
            xshift = -uwidth;
            yshift = 0.0;
        }

        if (form.getApproved()) {
            requestParams.put(OAuth2Utils.USER_OAUTH_APPROVAL, "true");
            approvalParams.put(OAuth2Utils.USER_OAUTH_APPROVAL, "true");
        } else {
            requestParams.put(OAuth2Utils.USER_OAUTH_APPROVAL, "false");
            approvalParams.put(OAuth2Utils.USER_OAUTH_APPROVAL, "false");
        }

        if (customer.getId() == null || customer.getId() == 0) {
            password = UserReset.generateRandomString();
            String encodedPassword = passwordEncoder.encodePassword(password, null);
            customer.setEncodedPassword(encodedPassword);
        }

        if (selected == CYCOMMAND_TITLE) {
            executeCyCommandFile();
            return;
        }

        if (FST.targetHasArcs(arc) && !seen.get((int) node)) {
            seen.set((int) node);
            fst.readFirstRealTargetArc(node, arc, reader);
            while (true) {
                queue.add(new FST.Arc<T>().copyFrom(arc));
                if (arc.isLast()) {
                    break;
                } else {
                    fst.readNextRealArc(arc, reader);
                }
            }
        }

        if (!PojoUtil.isEmpty(peerReview.getGroupId())) {
            form.setGroupId(Text.valueOf(peerReview.getGroupId()));
        }

        if (descricao == null || descricao.equalsIgnoreCase("")) {
            throw new ActionServletException("atencao.required", null, "Descri��o");
        }

        if (size == data.length) {
            grow();
        }

        if (projectFileIndex.isInLibrarySource(file)) {
            if (fileTimeStamp > coverageTimeStamp) {
                showEditorWarningMessage(CodeInsightBundle.message("coverage.data.outdated"));
                return;
            }
            oldToNewLineMapping = null;
        } else {
            oldToNewLineMapping = getOldToNewLineMapping(coverageTimeStamp, editorBean);
            if (oldToNewLineMapping == null) {
                if (fileTimeStamp > coverageTimeStamp && classesArePresentInCoverageData(data, qualifiedNames)) {
                    showEditorWarningMessage(CodeInsightBundle.message("coverage.data.outdated"));
                    return;
                }
            }
        }

        if (currGasList.getDiluent2() == idx) {
            (diluent2Map.get(idx)).setSelected(true);
        }

        if (ix != 0 && !iter.hasNext()) {
            row.put(StatusTable.ROW_SEPARATOR, "");
        }

        if (thingAlreadyExists(protocol, address)) {
            LOG.info("A thing with protocol \"{}\" and address \"{}\" already exists in the environment. Autodiscovery exits without changes", protocol, address);
            return null;
        }

        if (highlightedTabComposite != null) {
            highlightedTabComposite.setHighlighted(false);
        }

        if (!prevBCI) {
            i = -i;
            continue;
        }

        if (NUL == cb) {
            state = HEADER_VALUE_SUFFIX;
        } else if (SP == cb || HT == cb) {
            state = HEADER_VALUE_PREFIX;
        } else if (CR == cb) {
            httpMessage.addHeader(header);
            state = hasEntity(httpMessage) ? ENTITY : END;
            slide(1);
        } else {
            httpMessage.addHeader(header);
            state = HEADER_NAME;
        }

        if (this.overlayBitmap1 != null) {
            this.overlayBitmap1.recycle();
            this.overlayBitmap1 = null;
        }

        if (child instanceof IMCGraphicalEditPart) {
            mapping.getProperty(CONNECTIONS).add((IMCGraphicalEditPart) child);
        }

        if (needsSetupChunkExecuted() && !isSetupChunkScope(event.getScope())) {
            List<ChunkExecUnit> chunks = new ArrayList<ChunkExecUnit>();
            chunks.add(new ChunkExecUnit(getSetupChunkScope(), NotebookQueueUnit.EXEC_MODE_BATCH));
            chunks.add(new ChunkExecUnit(event.getScope(), event.getRange(), NotebookQueueUnit.EXEC_MODE_SINGLE, event.getExecScope()));
            queue_.executeChunks("Run Chunks", chunks);
        } else {
            queue_.executeChunk(new ChunkExecUnit(event.getScope(), event.getRange(), NotebookQueueUnit.EXEC_MODE_SINGLE, event.getExecScope()));
        }

        if (preview) {
            preview = false;
            parent.reset();
        }

        if (selfCreated) {
            this.owner = MainApplication.userPrimary;
        } else {
            Iterator<String> iter = this.muc.getOccupants();
            this.owner = MainApplication.userPrimary;
            while (iter.hasNext()) {
                Occupant o = muc.getOccupant(iter.next());
                String role = o.getRole();
                if (role.equals("moderator")) {
                    this.owner = User.getAllNicknames().get(o.getNick());
                    break;
                }
            }
        }

        if (doEdit) {
            this.editor.setInput(selection.toList());
        } else {
            this.editor.clear();
        }

        if (getErrorState().isIoAllowed()) {
            try {
                getInputBuffer().endRequest();
            } catch (IOException e) {
                setErrorState(ErrorState.CLOSE_NOW, e);
            } catch (Throwable t) {
                ExceptionUtils.handleThrowable(t);
                response.setStatus(500);
                setErrorState(ErrorState.CLOSE_NOW, t);
                getLog().error(sm.getString("http11processor.request.finish"), t);
            }
        }

        if (srcX >= row.length * 2) {
            if (deltaX != 0 || deltaY != 0) {
                srcX = deltaX;
                if (deltaY != srcY) {
                    srcY = deltaY;
                    break;
                }
                deltaX = 0;
                deltaY = 0;
            } else if (srcY == -1) {
                break;
            } else {
                srcX = 0;
                srcY++;
                break;
            }
        }

        if (tmp[0] == -1) {
            ok = false;
        } else {
            p[index++] = new Entry(tmp[0], true);
            p[index++] = new Entry(tmp[1], false);
        }

        if (isSubSettings) {
            setTheme(R.style.Theme_SubSettings);
        }

        if (!validatePin(delegator, cardNumber, pinNumber)) {
            return ServiceUtil.returnError(UtilProperties.getMessage(resourceError, "AccountingGiftCerticateNumberPinNotValid", locale));
        }

        if (Global.printing) {
            create_player(bgp.nh);
        }

        if (e.getType() == TableModelEvent.UPDATE) {
            if (e.getFirstRow() >= 0) {
                setModified(true);
            }
        }

        if (cm == null) cm = createDefaultColumnModel();

        if (BootLaunchConfigurationDelegate.supportsAnsiConsoleOutput()) {
            jvmArgsSections.add(new DelegatingLaunchConfigurationTabSection(this, model.ansiConsoleOutput, new CheckboxSection(this, model.ansiConsoleOutput, "ANSI console output")));
        }

        if (!passwordMatchesSaved(currentPw, PBKDF2_HASH_ROUNDS)) {
            return false;
        }

        if (!UmsatzTree.class.equals(objectType)) return null;

        if (((m_backupCategories.size() == 0) && (size() != 0)) || !(containsAll(m_backupCategories))) {
            ((CmsSearchParameters) peer).setSearchPage(1);
        }

        if (accessOrder) {
            p.chainForward = n;
            n.chainBackward = p;
            m.chainForward = null;
            m.chainBackward = tail;
            tail.chainForward = m;
            tail = m;
        }

        if (!(entity instanceof EntityCreatureBase)) {
            if (!this.extendedPlayer.player.getEntityWorld().isRemote) {
                this.extendedPlayer.player.sendMessage(new TextComponentString(I18n.translateToLocal("message.beastiary.unknown")));
            }
            return false;
        }

        if (random.nextInt(200) == 0) {
            removeCount += list.size();
            list.clear();
            list2.clear();
        }

        if (path.startsWith(javaHome)) {
            output.accept("excluding system resource: " + path);
            continue;
        }

        if (portfolioEntry.lastPortfolioEntryReport.id.equals(portfolioEntryReport.id)) {
            portfolioEntry.lastPortfolioEntryReport = PortfolioEntryReportDao.getPEReportAsLastByPE(id);
            portfolioEntry.save();
        }

        if (host.lastIndexOf('*') > 0) {
            throw new IllegalArgumentException("invalid host wildcard specification");
        } else if (host.startsWith("*")) {
            wildcard = true;
            if (host.equals("*")) {
                cname = "";
            } else if (host.startsWith("*.")) {
                cname = host.substring(1).toLowerCase();
            } else {
                throw new IllegalArgumentException("invalid host wildcard specification");
            }
            return;
        } else {
            if (host.length() > 0) {
                char ch = host.charAt(0);
                if (ch == ':' || Character.digit(ch, 16) != -1) {
                    byte ip[] = IPAddressUtil.textToNumericFormatV4(host);
                    if (ip == null) {
                        ip = IPAddressUtil.textToNumericFormatV6(host);
                    }
                    if (ip != null) {
                        try {
                            addresses = new InetAddress[]{InetAddress.getByAddress(ip)};
                            init_with_ip = true;
                        } catch (UnknownHostException uhe) {
                            invalid = true;
                        }
                    }
                }
            }
        }

        if (message instanceof Throwable) {
            exchange.setException((Throwable) message);
        } else {
            exchange.getIn().setBody(message);
        }

        if (recordTimer != null) recordTimer.cancel();

        if (!pulsarService.getBrokerService().getAuthorizationService().canLookup(topicName, role, authenticationData)) {
            log.warn("[{}] Role {} is not allowed to lookup topic", topicName, role);
            throw new RestException(Status.UNAUTHORIZED, "Don't have permission to connect to this namespace");
        }

        if (startTime != null) {
            startTime = new Date(startTime.getTime());
        }

        if (commandLineOptions.hasOption(k)) {
            final Option o = commandLineOptions.getOption(k);
            final String argument = "--" + o.getLongOpt();
            if (!o.hasArg()) {
                final Boolean flag = Boolean.parseBoolean(v);
                if (flag) {
                    args.add(argument);
                }
            } else if (!o.hasArgs()) {
                args.add(argument);
                args.add(v);
            } else {
                throw new IllegalArgumentException("Option '" + o + "' is not supported yet.");
            }
        }

        if (Objects.equals(FieldValues.MISSING_VALUE, value)) {
            return null;
        }

        if (curParam == null) {
            return false;
        }

        if (showIndexColumns != WorkspaceSettings.getInstance().isShowIndexColumns()) {
            showIndexColumns = WorkspaceSettings.getInstance().isShowIndexColumns();
            final TreeModel model = getModel();
            if (model instanceof AbstractReportDataTreeModel) {
                final AbstractReportDataTreeModel realModel = (AbstractReportDataTreeModel) model;
                realModel.fireTreeDataChanged();
                restoreState();
            }
        }

        if (line.hasOption("s")) {
            startupConfig.setSession(line.getOptionValue("s"));
        } else {
            if (line.hasOption("N")) startupConfig.setNetworks(line.getOptionValues("N"));
            if (line.hasOption("V")) startupConfig.setVizMapProps(line.getOptionValues("V"));
        }

        if ((ch == ' ') || (ch == '\t')) {
            continue;
        }

        if (type instanceof XSSimpleTypeDecl) {
            if (ancestorNS.equals(SchemaSymbols.URI_SCHEMAFORSCHEMA) && ancestorName.equals(SchemaSymbols.ATTVAL_ANYTYPE)) {
                ancestorName = SchemaSymbols.ATTVAL_ANYSIMPLETYPE;
            }
            return ((XSSimpleTypeDecl) type).isDOMDerivedFrom(ancestorNS, ancestorName, derivationMethod);
        } else {
            if (((XSComplexTypeDecl) type).getDerivationMethod() != XSConstants.DERIVATION_RESTRICTION) {
                return false;
            }
        }

        if (resourceName.equals(managedSchemaResourceName)) {
            log.info("On upgrading to managed schema, did not rename non-managed schema " + resourceName + " because it's the same as the managed schema's name.");
        } else {
            ZkSolrResourceLoader zkLoader = (ZkSolrResourceLoader) loader;
            final String nonManagedSchemaPath = zkLoader.getConfigSetZkPath() + "/" + resourceName;
            try {
                ZkController zkController = zkLoader.getZkController();
                ZkCmdExecutor zkCmdExecutor = new ZkCmdExecutor(zkController.getClientTimeout());
                if (zkController.pathExists(nonManagedSchemaPath)) {
                    byte[] bytes = zkController.getZkClient().getData(nonManagedSchemaPath, null, null, true);
                    final String upgradedSchemaPath = nonManagedSchemaPath + UPGRADED_SCHEMA_EXTENSION;
                    zkCmdExecutor.ensureExists(upgradedSchemaPath, zkController.getZkClient());
                    zkController.getZkClient().setData(upgradedSchemaPath, bytes, true);
                    zkController.getZkClient().delete(nonManagedSchemaPath, -1, true);
                    schema.setResourceName(managedSchemaResourceName);
                    log.info("After upgrading to managed schema in ZooKeeper, renamed the non-managed schema " + nonManagedSchemaPath + " to " + upgradedSchemaPath);
                } else {
                    log.info("After upgrading to managed schema in ZooKeeper, the non-managed schema " + nonManagedSchemaPath + " no longer exists.");
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                final String msg = "Error persisting managed schema resource " + managedSchemaResourceName;
                log.warn(msg, e);
            }
        }

        if (data.size() == 1) {
            this.setPartName(_myTitle + " - " + data.get(0).getName());
        } else {
            this.setPartName(_myTitle + " - multiple datasets");
        }

        if (inactive.status().active()) {
            throw new IllegalStateException("Upgrade already active");
        }

        if (arg0.equals(OBJECT_INTERNAL_NAME) || arg1.equals(OBJECT_INTERNAL_NAME)) {
            return OBJECT_INTERNAL_NAME;
        }

        if (settingsVO.getCommunicationEnabled()) {
            if (settingsVO.getSmsEnabled()) {
                count = dbSession.executeUpdate(UPDATE_SMS_PARAMS, settingsVO.getSmsGatewayType().getGatewayTypeValue(), settingsVO.getSmsGatewayUsername(), settingsVO.getSmsGatewayPassword(), settingsVO.getSmsGatewaySource(), settingsVO.getUpdatedStamp(), settingsVO.getUpdatedBy(), communityId);
            }
            if (settingsVO.getEmailEnabled()) {
                count = dbSession.executeUpdate(UPDATE_EMAIL_PARAMS, settingsVO.getEmailGatewayType().getGatewayTypeValue(), settingsVO.getEmailServerUsername(), settingsVO.getEmailServerPassword(), settingsVO.getEmailServer(), settingsVO.getEmailServerPort(), settingsVO.getUpdatedStamp(), settingsVO.getUpdatedBy(), communityId);
            }
        } else if (settingsVO.getCommunicationEnabled() == false) {
            count = dbSession.executeUpdate(DISABLE_SMS_AND_EMAIL, settingsVO.getUpdatedStamp(), settingsVO.getUpdatedBy(), communityId);
        }

        if (possibleValues != null && !possibleValues.isEmpty() && possibleValues.get(0) instanceof NamedThing) {
            setPossibleNamedThingValues((List<NamedThing>) possibleValues);
        } else {
            super.setPossibleValues(possibleValues);
        }

        if (fifoSysStatesMap.containsKey(fsmStates)) {
            ObsFifoSysState ret = fifoSysStatesMap.get(fsmStates);
            if (!ret.getChannelStates().equals(channelStates)) {
                assert ret.getChannelStates().equals(channelStates);
            }
            return ret;
        }

        if (delList != null) {
            for (PacketQueueEntry entry : delList) {
                packets.remove(entry);
                removed(entry);
            }
        }

        if (call.getOperator().getKind() == SqlKind.OVER) {
            return null;
        }

        if (page != null) {
            if (exclusiveLatchNodes) {
                page.releaseWriteLatch(isPageDirty);
            } else {
                page.releaseReadLatch();
            }
            bufferCache.unpin(page);
        }

        if (!RequestUtils.isDev(request)) {
            response.setStatus(403);
        }

        if (root == null) {
            return null;
        }

        if (complexText) {
            if (wrapWord) {
                assertEquals("Line-Count", 2, count);
            } else {
                assertEquals("Line-Count", 5, count);
            }
        } else {
            if (wrapWord) {
                assertEquals("Line-Count", 4, count);
            } else {
                assertEquals("Line-Count", 1, count);
            }
        }

        if (!newTypes.isEmpty()) {
            checkboxPanel.add(new JLabel(Localization.lang("Currently unknown") + ":"));
            for (EntryType type : newTypes) {
                JCheckBox box = new JCheckBox(type.getName(), true);
                checkboxPanel.add(box);
                typeCheckBoxMap.put(type, box);
            }
        }

        if (find_among_b(a_1, 2) == 0) {
            limit_backward = v_3;
            return false;
        }

        if (data1 == -1) {
            data1 = readUnsigned();
        }

        if (efetuarLigacaoAguaComInstalacaoHidrometroActionForm.getLeituraInstalacao() != null && !efetuarLigacaoAguaComInstalacaoHidrometroActionForm.getLeituraInstalacao().trim().equals("")) {
            hidrometroInstalacaoHistorico.setNumeroLeituraInstalacao(Integer.parseInt(efetuarLigacaoAguaComInstalacaoHidrometroActionForm.getLeituraInstalacao()));
        } else {
            hidrometroInstalacaoHistorico.setNumeroLeituraInstalacao(0);
        }

        if (siblingNode instanceof Element && ((Element) siblingNode).getAttribute("class").equals(topCandidate.getAttribute("class")) && !topCandidate.getAttribute("class").equals("")) {
            contentBonus += (Float) topCandidate.getUserData("readability") * 0.2F;
        }

        if (subjectIdColumn == -1 && subjectIdentifierColumn == -1 && subjectIdOrIdentifierColumn == -1) {
            if (!foundHeader && headerSize == 1) {
                subjectIdOrIdentifierColumn = 0;
                startIndex = 0;
            } else {
                throw new GrouperImportException(TextContainer.retrieveFromRequest().getText().get("simpleMembershipUpdate.importErrorNoIdCol"));
            }
        }

        if (fieldSecurity.isViewInLineAuthz() == null && !isDataFieldAttributeSecurityHide(field)) {
            return true;
        }

        if (run == false) return;

        if (host.isInFenceFlow() && (host.getStatus() == VDSStatus.Down || host.getStatus() == VDSStatus.Reboot)) {
            host.setStatus(VDSStatus.NonResponsive);
            nonResponsiveHosts.add(host.getId());
        }

        if (-1 != selectedColumn) {
            Text editorControl = new Text(table, SWT.NONE);
            final int editorControlColumn = selectedColumn;
            editorControl.setText(item.getText(selectedColumn));
            editorControl.addModifyListener(new ModifyListener() {
                public void modifyText(ModifyEvent e) {
                    Text text = (Text) cellEditor.getEditor();
                    cellEditor.getItem().setText(editorControlColumn, text.getText());
                    TableItem handlerClassesTaleItem = handlerClassesTale.getItem(handlerClassesTale.getSelectionIndex());
                    APIHandlerWrapper wrapperHandler = (APIHandlerWrapper) handlerClassesTaleItem.getData();
                    if (editorControlColumn == 0) {
                        wrapperHandler.getWrapperHandlerProperties().get(propertiesTable.getSelectionIndex()).setName(text.getText());
                    } else if (editorControlColumn == 1) {
                        wrapperHandler.getWrapperHandlerProperties().get(propertiesTable.getSelectionIndex()).setValue(text.getText());
                    }
                }
            });
            editorControl.selectAll();
            editorControl.setFocus();
            cellEditor.setEditor(editorControl, item, selectedColumn);
        }

        if (isAsync(context.getRequest())) {
            List<String> jobId = deleteJob.getRequest().getId();
            sendRedirect(context.getResponse(), Utils.getRedirect("view", "xpage=delete&jobId=" + serializeJobId(jobId), context));
            return true;
        }

        if (folder.equals(account.getOutboxFolder())) {
            return;
        }

        if (quadraSelect.getIndicadorIncrementoLote() != null) {
            atualizarQuadraActionForm.setIndicadorIncrementoLote(String.valueOf(quadraSelect.getIndicadorIncrementoLote()));
        }

        if (type == RemoteType.SSH) validateSSHConnection(map);
        else if (type == RemoteType.DCOM) validateDcomConnection(map);

        if (doiScoreHSum) {
            double p = Math.exp(iScoreHSum[endHead][endTag][start]);
            for (int split = argHead + 1; split < end; split++) {
                p += Math.exp(iScoreH[argHead][argTag][start] + iScoreH[argHead][argTag][split] + headScore[binDistance[endHead][split]][endHead][endTag][argHead][argTag] + headStop[argHead][argTag][start] + headStop[argHead][argTag][split]);
            }
            iScoreHSum[endHead][endTag][start] = (float) Math.log(p);
        }

        if (isToolsLoaded() || isSmelteryLoaded() || forced) {
            nuggetCobalt = nuggets.addMeta(0, "cobalt");
            ingotCobalt = ingots.addMeta(0, "cobalt");
            nuggetArdite = nuggets.addMeta(1, "ardite");
            ingotArdite = ingots.addMeta(1, "ardite");
            nuggetManyullyn = nuggets.addMeta(2, "manyullyn");
            ingotManyullyn = ingots.addMeta(2, "manyullyn");
            nuggetPigIron = nuggets.addMeta(4, "pigiron");
            ingotPigIron = ingots.addMeta(4, "pigiron");
            nuggetAlubrass = nuggets.addMeta(5, "alubrass");
            ingotAlubrass = ingots.addMeta(5, "alubrass");
            blockMetal = registerEnumItemBlock(registry, blockMetal);
            blockCobalt = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.COBALT.getMeta());
            blockArdite = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.ARDITE.getMeta());
            blockManyullyn = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.MANYULLYN.getMeta());
            blockKnightSlime = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.KNIGHTSLIME.getMeta());
            blockPigIron = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.PIGIRON.getMeta());
            blockAlubrass = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.ALUBRASS.getMeta());
            blockSilkyJewel = new ItemStack(blockMetal, 1, BlockMetal.MetalTypes.SILKY_JEWEL.getMeta());
        }

        if (line.substring(offset).startsWith(endDelim)) {
            if (addToBuf) {
                buf.append(endDelim);
            }
            offset += endDelim.length();
            if (--depth == 0) {
                break;
            }
        } else if (allowNestedComments && line.substring(offset).startsWith(startDelim)) {
            if (addToBuf) {
                buf.append(startDelim);
            }
            offset += startDelim.length();
            depth++;
        } else if (offset < line.length()) {
            char c = line.charAt(offset++);
            if (allowEscape && c == ESCAPE_CHAR) {
                if (addToBuf) {
                    buf.append(ESCAPE_CHAR);
                }
                if (offset < line.length()) {
                    if (addToBuf) {
                        buf.append(line.charAt(offset));
                    }
                    offset++;
                }
            } else if (addToBuf) {
                buf.append(c);
            }
        } else {
            if (i == -1) {
                break;
            }
            i = getLine(reader, line);
            offset = 0;
            if (line.length() == 0) {
                break;
            }
        }

        if (Settings.Global.getInt(context.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0) != 1) {
            return false;
        }

        if (!this.checkDependencies(registrable.getClass())) {
            return false;
        }

        if (!HMAC.verifyWithSHA256(getTransientKey(), assembleJFKAuthenticator(responderExponential, initiatorExponential, nonceResponder, nonceInitiatorHashed, replyTo.getAddress().getAddress()), authenticator)) {
            if (shouldLogErrorInHandshake(t1)) {
                if (logDEBUG)
                    Logger.debug(this, "We received the following HMAC : " + HexUtil.bytesToHex(authenticator));
                if (logDEBUG) Logger.debug(this, "We have Ni' : " + HexUtil.bytesToHex(nonceInitiatorHashed));
                Logger.normal(this, "The HMAC doesn't match; let's discard the packet (either we rekeyed or we are victim of forgery) - JFK3 - " + pn);
            }
            return;
        }

        if (fileOutput) {
            return env.readCsvFile(visitsPath).fieldDelimiter('|').includeFields("011000000").types(String.class, String.class);
        } else {
            return WebLogData.getVisitDataSet(env);
        }

        if (dtFimContrato != null && !dtFimContrato.trim().equalsIgnoreCase("")) {
            peloMenosUmParametroInformado = true;
            Date dataFim = Util.converteStringParaDate(dtFimContrato);
            filtroArrecadadorContrato.adicionarParametro(new ParametroSimples(FiltroArrecadadorContrato.DATA_CONTRATO_FIM, dataFim));
        }

        if (pPacket instanceof RequestClusterMembershipAck) {
            RequestClusterMembershipAck tRequestClusterMembershipAckPacket = (RequestClusterMembershipAck) pPacket;
            if (tDestinationComChannel == null) {
                ComChannel tDelChannel = getDeletedComChannel(tDestination, tSource);
                Logging.warn(this, "Received REQUEST_CLUSTER_MEMBERSHIP_ACK: " + tRequestClusterMembershipAckPacket + " for already closed channel");
                Logging.warn(this, "   ..data: " + tRequestClusterMembershipAckPacket);
                Logging.warn(this, "   ..destination: " + tDestination);
                Logging.warn(this, "   ..source: " + tSource);
                Logging.warn(this, "   ..knowing channels: ");
                if (tDelChannel != null) {
                    Logging.warn(this, "   ..known deleted channel: " + tDelChannel);
                    Logging.warn(this, "     ..closing cause: " + tDelChannel.getCloseCause());
                }
                Logging.warn(this, "   ..known channels:");
                synchronized (mRegisteredComChannels) {
                    for (ComChannel tComChannel : mRegisteredComChannels) {
                        Logging.warn(this, "       ..: " + tComChannel);
                    }
                }
            } else {
                Logging.log(this, "Received REQUEST_CLUSTER_MEMBERSHIP_ACK: " + tRequestClusterMembershipAckPacket);
                Logging.log(this, "   ..data: " + tRequestClusterMembershipAckPacket);
                Logging.log(this, "   ..destination: " + tDestination);
                Logging.log(this, "   ..source: " + tSource);
                Logging.log(this, "   ..destination channel: " + tDestinationComChannel);
            }
        }

        if (maxeq != null) {
            for (int c = 0; c < items.size(); ++c) {
                if (items.get(c).isPlane()) {
                    lostPlanes += maxeq[c] - onslot[c];
                }
            }
        }

        if (!testItemsThisUser.isEmpty()) {
            testSet.put(user, testItemsThisUser);
        }

        if (containsHTML != null) containsHTML[0] = defaultHTML;

        if (beginInside) {
            if (distance(this.end, end) < distance(this.end, begin)) return new Line2d(this.begin, end);
            else return new Line2d(this.begin, begin);
        } else {
            if (distance(this.begin, begin) < distance(this.begin, end)) return new Line2d(begin, this.end);
            else return new Line2d(end, this.end);
        }

        if (openejb.getProxyFactory() != null) {
            sys.facilities.intraVmServer = configureService(openejb.getProxyFactory(), ProxyFactoryInfo.class);
        }

        if (METHOD == 2222) {
            float[][] r = like(x);
            smooth(x, r);
            x = r;
        }

        if (serProps instanceof ListOverMap) {
            ListOverMap<PropertyMetadata> overMap = (ListOverMap<PropertyMetadata>) serProps;
            properties = convertProperties(overMap);
        }

        if (setVisited.size() > maxLength) {
            return foundPipes;
        }

        if (snbExclude != null) {
            return COM.E_INVALIDARG;
        }

        if (isSymmetric(a)) {
            if (isPositiveDefinite(a)) {
                det = cholesky.det(a);
            } else {
                det = househ.det(a);
            }
        } else {
            det = gauss.det(a);
        }

        if (ks.getCertificateAlias(chain1[0]).equals("pk1") && ks.getCertificateAlias(chain2[0]).equals("pk2") && ks.getCertificateAlias(randomCert) == null) {
            System.out.println("test " + testnum++ + " passed");
        } else {
            throw new SecurityException("getCertificateAlias failed");
        }

        if (!gameMode.getAlignmentText().isEmpty() && !context.getVariableContext().hasSolver(refContext.getManufacturer(PCAlignment.class))) {
            Logging.errorPrint("GameMode " + gameMode.getName() + " has Alignment text - " + "Thus it  requires a default value for ALIGNMENT format");
        }

        if (!ValueMetaString.convertStringToBoolean(System.getProperty("KETTLE_HIDE_DEVELOPMENT_VERSION_WARNING", "N")) && Const.RELEASE.equals(Const.ReleaseType.MILESTONE)) {
            MessageBox dialog = new MessageBox(shell, SWT.ICON_WARNING);
            dialog.setText(BaseMessages.getString(PKG, "Spoon.Warning.DevelopmentRelease.Title"));
            dialog.setMessage(BaseMessages.getString(PKG, "Spoon.Warning.DevelopmentRelease.Message", Const.CR, BuildVersion.getInstance().getVersion()));
            dialog.open();
        }

        if (values.isEmpty()) {
            _log.warn("values are empty for key: {}", key);
        }

        if (file.exists()) {
            file.delete();
        }

        if (spi == null || (spi != null && spi.getImage() == null)) {
            spi = plugins.render(SinglePoint2525Renderer.RENDERER_ID, pluginSymbolID, params);
        }

        if (branch != null && liableForIndexing(coralSession, resource, index, querySet)) {
            Document doc = docConstructor.createDocument(coralSession, resource, branch);
            if (doc == null) {
                log.error("IndexingFacility: Could not create Document for resource #" + resource.getIdString() + " '" + resource.getPath() + "'");
            } else {
                try {
                    indexWriter.addDocument(doc);
                    updateCount++;
                } catch (IOException e) {
                    log.error("IndexingFacility: Could not add document to IndexWriter for index '" + index.getPath() + "' for resource #" + resource.getIdString() + " '" + resource.getPath() + "'", e);
                }
            }
        }

        if (H2.ID.equals(db.getDialect().getId())) {
            Loggers.get(DatabaseChecker.class).warn("H2 database should be used for evaluation purpose only");
        } else if (Oracle.ID.equals(db.getDialect().getId())) {
            checkOracleDriverVersion();
        }

        if (eventType.equalsIgnoreCase("starting")) {
            eventType = JDEQSimConfigGroup.START_LEG;
        } else if (eventType.equalsIgnoreCase("end")) {
            eventType = JDEQSimConfigGroup.END_LEG;
        } else if (eventType.equalsIgnoreCase("enter")) {
            eventType = JDEQSimConfigGroup.ENTER_LINK;
        } else if (eventType.equalsIgnoreCase("leave")) {
            eventType = JDEQSimConfigGroup.LEAVE_LINK;
        }

        if (GlobalVars.DATA_ACCESS_TYPE.equals("DERBYDB")) {
            DataAccess dataAccessObject = new DerbyDatabase(dataStoreName);
            dataAccessObjecs.put(dataStoreName, dataAccessObject);
            return dataAccessObject;
        } else if (GlobalVars.DATA_ACCESS_TYPE.equals("ORACLEDB")) {
            DataAccess dataAccessObject = null;
            if (dataAccessObjecs.size() > 0) {
                for (String name : dataAccessObjecs.keySet()) {
                    dataAccessObject = new OracleDatabase(dataStoreName, ((OracleDatabase) dataAccessObjecs.get(name)).getConnection());
                    Outputter.debugln("DataAccessFactory.getDataAccessObject() creating new OracleDatabase " + "using existing connection from: " + name, Outputter.DEBUG_TYPES.DATA_ACCESS);
                    break;
                }
            } else {
                dataAccessObject = new OracleDatabase(dataStoreName);
            }
            dataAccessObjecs.put(dataStoreName, dataAccessObject);
            return dataAccessObject;
        }

        if (genotype.hasPL() && genotype.getPL().length == 3) {
            final int[] pl = ArrayUtils.clone(genotype.getPL());
            ArrayUtils.reverse(pl);
            builder.PL(pl);
        } else {
            builder.noPL();
        }

        if (text.contains("shatter the")) {
            KoLCharacter.setHippyStoneBroken(true);
        }

        if (args.length == 0) {
            return new ScriptableValue(thisObj, TextType.get().valueOf(valueType.getName()));
        }

        if (m_currSampleSize <= m_minSampleSize) {
            sampleSz = m_minSampleSize;
            m_currSampleSize = m_minSampleSize;
        } else {
            sampleSz = m_currSampleSize;
            m_currSampleSize -= m_dec;
        }

        if (errorCounter == 100) {
            if (Platform.isFxApplicationThread()) {
                printShutdownErrorMessage();
            } else {
                Platform.runLater(() -> {
                    printShutdownErrorMessage();
                });
            }
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex1) {
                    }
                    System.exit(100);
                }
            }.start();
            return;
        }

        if (subjectPosition == 1 || subjectPosition == 2) {
            linkablePositions.addAll(ProteinSequenceUtils.getPositionsOfResidueForProteinSequence(querySequence, "E"));
            linkablePositions.addAll(ProteinSequenceUtils.getPositionsOfResidueForProteinSequence(querySequence, "D"));
            linkablePositions.add(querySequence.length());
        }

        if (metadata_length > 0) {
            byte metadata_flag = 0;
            if (ms_in_row && s_in_row) {
                metadata_flag |= Const.MS_MIXED_COMPACT;
            }
            cv[cv.length - 1] = metadata_flag;
        }

        if (!CollectionUtils.isEmpty(schemeParameters)) {
            List<Scheme> schemes = new ArrayList<>();
            for (String schemeParameter : schemeParameters) {
                Scheme scheme = Scheme.forValue(schemeParameter);
                if (scheme == null) {
                    throw new MojoExecutionException("Invalid scheme specified: " + schemeParameter);
                }
                schemes.add(scheme);
            }
            swagger.setSchemes(schemes);
        }

        if (ValueUtil.isNotEmpty(encoding)) _encoding = encoding;

        if ((newValue == null) && (validValue == null)) return false;

        if (BKException.Code.OK != rc) {
            createOpLogger.registerFailedEvent(MathUtils.elapsedNanos(startTime), TimeUnit.NANOSECONDS);
        } else {
            createOpLogger.registerSuccessfulEvent(MathUtils.elapsedNanos(startTime), TimeUnit.NANOSECONDS);
        }

        if (child.hasBeforeConnector()) {
            for (BlockConnector socket : parent.getSockets()) {
                if (invalidConnector(socket)) {
                    continue;
                }
                BlockLink link = BlockLinkChecker.canLink(workspace, parent, child, socket, child.getBeforeConnector());
                if (link == null) {
                    continue;
                }
                return link;
            }
        }

        if (endW > pcm_storage) {
            pcm_storage = endW + vi.blocksizes[1];
            for (int i = 0; i < vi.channels; i++) {
                float[] foo = new float[pcm_storage];
                System.arraycopy(pcm[i], 0, foo, 0, pcm[i].length);
                pcm[i] = foo;
            }
        }

        if (notCachedResources != null && !notCachedResources.isEmpty()) {
            String taskId = getResourceId(notCachedResources.get(0));
            getCache().put(taskId, notCachedResources);
        }

        if (accountCombo.getItemCount() == 2) accountCombo.setSelectedIndex(1);

        if (reqData.getCallbackHandler() == null) {
            CallbackHandler passwordCallbackHandler = getPasswordCallbackHandler(reqData);
            reqData.setCallbackHandler(passwordCallbackHandler);
        }

        if (javaFile == null && typeName.indexOf("$") > 0) {
            javaFile = getFile(packageName, typeName.split("\\$")[0]);
        }

        if (buildJob != null) {
            buildJob.validate();
        }

        if (_thread != null) {
            return;
        }

        if (!(other instanceof Point)) {
            return false;
        }

        if (componentSecurity.isViewAuthz() == null || !componentSecurity.isViewAuthz().booleanValue()) {
            return true;
        }

        if (alignment.equals(LEFT)) return -1;
        else if (alignment.equals(CENTER)) return 0;
        else if (alignment.equals(RIGHT)) return 1;
        else if (alignment.equals(DECIMAL)) return 2;
        else throw new IllegalArgumentException("unknown alignment: " + alignment);

        if (parent == null) {
            return false;
        }

        if (nodeId == null) {
            nodeId = UUID.randomUUID().toString();
            while (nodes.containsKey(nodeId)) {
                nodeId = UUID.randomUUID().toString();
            }
        } else {
            if (nodes.keySet().contains(nodeId))
                throw new XMPPError(StanzaError.conflict, "Node: '" + nodeId + "' already exists");
        }

        if (curLocation == null) {
            curLocation = (Point) ((Node) copiedNode).getLocation();
            toAdd = nodeToOrder;
        } else {
            if (curLocation.y >= ((Point) ((Node) copiedNode).getLocation()).y) {
                if (curLocation.x >= ((Point) ((Node) copiedNode).getLocation()).x) {
                    curLocation = (Point) ((Node) copiedNode).getLocation();
                    toAdd = nodeToOrder;
                }
            }
        }

        if (traceMode != 2 && configuration.getLoggingUseSyslog()) {
            LoggingConfig.setSyslog();
        }

        if (rcb.len[l] == 0) continue;

        if (!CapacityUtils.validateVirtualPoolQuota(_dbClient, vPool, totalProvisionedCapacity)) {
            throw APIException.badRequests.insufficientQuotaForVirtualPool(vPool.getLabel(), "volume");
        }

        if (slow == fast) {
            hasLoop = true;
            break;
        }

        if (!ValidationUtils.objectTypeMatches(transaction, kObject, getNodeType(transaction))) return false;

        if (process != null && process.exitValue() == 0) {
            final File kotlinExecutable = PlatformUtil.isWindows() ? new File(this.getOptions().getKotlinHome(), "bin/kotlin.bat") : new File(this.getOptions().getKotlinHome(), "bin/kotlin");
            final String[] executionCommand = {kotlinExecutable.getAbsolutePath(), jarFile};
            try {
                process = new ProcessBuilder().redirectErrorStream(true).command(executionCommand).directory(this.getTemporaryDirectory()).start();
                try (final BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    inputStream.lines().forEach(line -> consoleOutput.add(line));
                }
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Can not execute code snippet", e);
                consoleOutput.add("ERROR: ".concat(e.getMessage()));
            } finally {
                if (process != null) {
                    try {
                        process.waitFor();
                    } catch (InterruptedException e) {
                        LOGGER.log(Level.SEVERE, "Can not wait for process to end", e);
                    }
                }
            }
            final File classFile = new File(this.getTemporaryDirectory(), jarFile);
            classFile.delete();
        }

        if (size == null) {
            size = CoverArtScheme.LARGE.getSize() * 2;
        }

        if (foodSource == null) {
            setState(State.inHiveWithoutInfo);
        }

        if (!edit) {
            stat.close();
        }

        if (accordion.getPanels().getLength() == 1) {
            accordion.setSelectedIndex(0);
        }

        if (getMSC().isLocalMetaStore()) {
            if (!rawStoreMap.containsKey(Thread.currentThread().getId())) {
                rawStoreMap.put(Thread.currentThread().getId(), HiveMetaStore.HMSHandler.getRawStore());
            }
        }

        if (e.getLinkStatus() != LinkStatus.ERROR_RETRY && link.getBooleanProperty(Rapids24Pl.NOCHUNKS, false) == false) {
            link.setProperty(Rapids24Pl.NOCHUNKS, Boolean.valueOf(true));
            throw new PluginException(LinkStatus.ERROR_RETRY);
        }

        if (name != null) {
            if (name.endsWith("font-awesome.css")) fontAwesomeResource = resource;
        }

        if (isAt('[')) {
            myPos++;
            final int indexElementEnd = StringUtil.indexOfAny(myLiteral, "!:.]", myPos, end);
            if (indexElementEnd > 0 && myPos < indexElementEnd) {
                final String index = myLiteral.substring(myPos, indexElementEnd);
                chunk.setMappingKeyElementIndex(index);
                myPos = indexElementEnd + 1;
            }
        }

        if (vector != null) {
            vector.trimToSize();
            return vector;
        } else {
            return null;
        }

        if ((registeredObject == rmiClone || isAlreadyMerged(registeredObject, this.session)) && !shouldForceCascade()) {
            return registeredObject;
        }

        if (sender == null) {
            reply.setError(PacketError.Condition.forbidden);
            return reply;
        }

        if (wAuth != null && wAuth.length() > 0) {
            sb.append('&').append(FederationConstants.PARAM_AUTH_TYPE).append('=').append(URLEncoder.encode(wAuth, "UTF-8"));
        }

        if (target.hasParent()) {
            final IRequest currentParent = RequestHandler.getRequest(manager, target.getParent());
            currentParent.removeChild(target.getToken());
            target.setParent(null);
        }

        if (!foundMatch) {
            matcher = datePattern_dd_mon_yyyy_hhmmss_SSS.matcher(input);
            if (matcher.matches()) {
                day = intValue(matcher.group(1));
                month = monthInt(matcher.group(2));
                year = intValue(matcher.group(3));
                hour = intValue(matcher.group(4));
                minute = intValue(matcher.group(5));
                second = intValue(matcher.group(6));
                milli = intValue(matcher.group(7));
                foundMatch = true;
            }
        }

        if (cls.isInterface()) return 0;

        if (!templateName.endsWith(".html")) {
            return origIs;
        }

        if (isAllowsPartialPayment()) {
            return null;
        } else if (!isCreditOrder() && openAmt.subtract(getCollectDetailAmt()).doubleValue() > 0) {
            addErrorMsg("@POS.OrderPayNotCompleted@");
        }

        if (upperPressed) {
            offset = currentMouseX - getUpperRect().x;
            setIsUpperSelected(true);
            setIsUpperDragging(true);
            return;
        }

        if (jsonPayload != null) {
            JsonMaintSadFellesKodtlbContainer container = this.maintSadFellesKodtlbService.doUpdate(jsonPayload);
            if (container != null) {
                if (container.getErrMsg() != null && !"".equals(container.getErrMsg())) {
                    if (container.getErrMsg().toUpperCase().startsWith("ERROR")) {
                        errMsg.append(container.getErrMsg());
                        retval = TvinnSadMaintenanceConstants.ERROR_CODE;
                    }
                }
            }
        }

        if (pubKey.getAlgorithm() != "RSA") {
            return;
        }

        if (outputType.equals(Port.TYPE_INT) && inputType.equals(Port.TYPE_POINT)) return true;

        if (filters.getPrimaryDataset().equals("age")) {
            Float age = (float) Math.floor(dateUtils.getAgeAsOfDateFloat(patientEncounter.getPatient().getAge(), patientEncounter.getDateOfTriageVisit()));
            if (age < filters.getFilterRangeStart() || age > filters.getFilterRangeEnd()) continue;
        } else if (filters.getPrimaryDataset().equals("height")) {
            ResearchEncounterVital vitalFeet = patientEncounter.getEncounterVitals().get(heightFeetId);
            ResearchEncounterVital vitalInches = patientEncounter.getEncounterVitals().get(heightInchesId);
            Float vitalValue = 0.0f;
            if (vitalFeet != null) {
                vitalValue += vitalFeet.getVitalValue() * 12;
            }
            if (vitalInches != null) {
                vitalValue += vitalInches.getVitalValue();
            }
            if (vitalValue < filters.getFilterRangeStart() || vitalValue > filters.getFilterRangeEnd()) continue;
        } else if (vital != null) {
            ResearchEncounterVital vitals = patientEncounter.getEncounterVitals().get(vital.getId());
            if (vitals == null) continue;
            Float vitalValue = vitals.getVitalValue();
            if (vitalValue == null) continue;
            if (vitalValue < filters.getFilterRangeStart() || vitalValue > filters.getFilterRangeEnd()) continue;
        }

        if (checkPersistable && (object instanceof XmlPersistable)) {
            newElement = ((XmlPersistable) object).createElement(this);
            setObjectId(object, newElement);
        } else {
            XmlDelegate delegate = (checkDelegate ? getDelegate(theClass) : null);
            if (delegate != null) {
                newElement = delegate.createElement(this, object);
                if (newElement == null) {
                    return null;
                }
                setObjectId(object, newElement);
            } else {
                newElement = createElementForObject(object, theClass);
            }
        }

        if (intLen == 0) {
            quotient.intLen = quotient.offset = rem.intLen = rem.offset = 0;
            return;
        }

        if (pesquisaParametrosComandoNegativacao[43] != null) {
            parametrosComandoNegativacaoHelper.setQuantidadeDias((Integer) pesquisaParametrosComandoNegativacao[43]);
        }

        if ((extensionModel == null) || ((extensionModel instanceof IPluginModelBase) == false)) {
            return null;
        }

        if (moduleName.getScheme() != null) {
            return true;
        }

        if (layer instanceof TileDownloadLayer) ((TileDownloadLayer) layer).start();

        if (csc.getId().compareTo(prevId) == 0) {
            countSimComparisonsPerLink.add(csc);
        }

        if (s != -1 && (e == -1 || e > s)) {
            start = s;
            prefixLen = 8;
            isSystem = true;
        } else {
            start = e;
            prefixLen = 5;
        }

        if (region.getRegionType() != RegionType.POINT) return;

        if (!StringUtils.isBlank(input)) {
            if (input.indexOf('>') > 0) {
                input = input.substring(0, input.indexOf('>')).trim();
            }
            if (input.indexOf('^') > 0) {
                input = input.replace("^", "E");
            }
            try {
                double pValue = Double.parseDouble(input);
                if (pValue < MIN_POSTGRES_DOUBLE) {
                    pValue = 0.0;
                }
                return "" + pValue;
            } catch (NumberFormatException e) {
                LOG.warn("Could not parse pValue: " + input);
            }
        }

        if (graph == null) return null;

        if (!haveLowAcceleration(0.05d)) {
            final double[] _flatLeafCoefCache = flatLeafCoefCache;
            if (_flatLeafCoefCache[2] < 0.0d) {
                double x = curLeafCtrlPolyLengths[0], y = x + curLeafCtrlPolyLengths[1];
                if (curveType == 8) {
                    double z = y + curLeafCtrlPolyLengths[2];
                    _flatLeafCoefCache[0] = 3.0d * (x - y) + z;
                    _flatLeafCoefCache[1] = 3.0d * (y - 2.0d * x);
                    _flatLeafCoefCache[2] = 3.0d * x;
                    _flatLeafCoefCache[3] = -z;
                } else if (curveType == 6) {
                    _flatLeafCoefCache[0] = 0.0d;
                    _flatLeafCoefCache[1] = y - 2.0d * x;
                    _flatLeafCoefCache[2] = 2.0d * x;
                    _flatLeafCoefCache[3] = -y;
                }
            }
            double a = _flatLeafCoefCache[0];
            double b = _flatLeafCoefCache[1];
            double c = _flatLeafCoefCache[2];
            double d = t * _flatLeafCoefCache[3];
            final int n = DHelpers.cubicRootsInAB(a, b, c, d, nextRoots, 0, 0.0d, 1.0d);
            if (n == 1 && !Double.isNaN(nextRoots[0])) {
                t = nextRoots[0];
            }
        }

        if (broadcastBInput) {
            job.getConfiguration().set(PROP_BT_BROADCAST, "y");
            FileSystem fs = FileSystem.get(inputBtGlob.toUri(), conf);
            FileStatus[] fstats = fs.globStatus(inputBtGlob);
            if (fstats != null) {
                for (FileStatus fstat : fstats) {
                    DistributedCache.addCacheFile(fstat.getPath().toUri(), job.getConfiguration());
                }
            }
        }

        if (callingUid != Process.myUid()) {
            if (!checkHoldingPermissionsLocked(pm, pi, uri, callingUid, modeFlags)) {
                final int minStrength = persistable ? UriPermission.STRENGTH_PERSISTABLE : UriPermission.STRENGTH_OWNED;
                if (!checkUriPermissionLocked(uri, callingUid, modeFlags, minStrength)) {
                    throw new SecurityException("Uid " + callingUid + " does not have permission to uri " + uri);
                }
            }
        }

        if (length < 7) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low; j--) {
                    I.set(dest[j - 1]);
                    J.set(dest[j]);
                    if (comparator.compare(I, J) > 0) swap(dest, j, j - 1);
                }
            }
            return;
        }

        if (!e) {
            btn.setEnabled(false);
        }

        if (keystoreFile != null && keystoreFile.length() > 0) {
            String keystore = new File(Thread.currentThread().getContextClassLoader().getResource(keystoreFile).toURI()).getAbsolutePath();
            KeyManager[] kmgrs = getKeyManagers(getKeyStore("JKS", keystore, keystorePassword), keyPassword);
            tlsClientParameters.setKeyManagers(kmgrs);
        }

        if (options.getConfigValue(PARAM_TOKEN_REFRESH, true)) {
            Tree tokenTree = getTokenTree(this);
            if (tokenTree.exists()) {
                if (isExpired(loginTime)) {
                    log.debug("Attempt to reset an expired token.");
                    return false;
                }
                if (expirationTime - loginTime <= tokenExpiration / 2) {
                    try {
                        long expTime = createExpirationTime(loginTime, tokenExpiration);
                        setExpirationTime(tokenTree, expTime);
                        root.commit(CommitMarker.asCommitAttributes());
                        log.debug("Successfully reset token expiration time.");
                        return true;
                    } catch (CommitFailedException e) {
                        log.debug("Failed to reset token expiration {}", e.getMessage());
                        root.refresh();
                    }
                }
            }
        }

        if (result.isUnqualified) refNode.attrSet(IConstants.UNQUALIFIED_FIELD, IConstants.TRUE);

        if (childId == null) {
            response.add(FEATURE_STORE_JSON_FIELD, stores.keySet());
        } else {
            final FeatureStore store = getFeatureStore(childId);
            if (store == null) {
                throw new SolrException(SolrException.ErrorCode.BAD_REQUEST, "missing feature store [" + childId + "]");
            }
            response.add(FEATURES_JSON_FIELD, featuresAsManagedResources(store));
        }

        if (next.getTagNumWithClass() == 0x88) {
            shortEfIdentifier = next.getValue();
        }

        if (!waitForStatus(jobs.toArray(new Job[jobs.size()])).isSuccess()) {
            throw new WorkflowOperationException("One of the download/streaming retract job did not complete successfully");
        }

        if (log.isDebugEnabled()) {
            log.debug("Transform indicated that the target row should be ignored with a target key of: {}", "unknown.  Transformation aborted during tranformation of key");
        }

        if (other.getModuleLocaion() == null) {
            if (this.getModuleLocaion() != null) {
                return false;
            }
        } else {
            if (this.getModuleLocaion() == null) {
                return false;
            } else if (!other.getModuleLocaion().equals(this.getModuleLocaion())) {
                return false;
            }
        }

        if (rangeSimplicationEnabled && featureType != null && isSimpleFeature()) {
            RangeCombiner combiner = new RangeCombiner.And(ff, featureType, filters);
            filters = combiner.getReducedFilters();
        }

        if (writeDocId) {
            field(documentId);
        }

        if (log().isDebugEnabled()) {
            log().debug("updateServer: delete interface: " + ipaddr + " on NMS server: " + hostName);
        }

        if (grouping.expressions == null || grouping.expressions.size() == 0) {
            throw new SolrException(ErrorCode.BAD_REQUEST, "Groupings must contain at least one expression, '" + name + "' has none.");
        }

        if (interactionsFound > 0) {
            this.titleLabel.setText("Binary Interactions Found: " + interactionsFound);
            this.titleLabel.setForeground(Color.GREEN);
            this.titleLabel.setEnabled(true);
            this.titleLabel.repaint();
        }

        if (lastIme == null || TextUtils.isEmpty(lastIme.first) || TextUtils.isEmpty(lastIme.second)) return null;

        if (getMustInit(curSerialNodeIndex)) {
            setMustInit(curSerialNodeIndex, false);
            SerialMessage m = (SerialMessage) (getNode(curSerialNodeIndex).createInitPacket());
            if (m != null) {
                log.debug("send init message: {} to node {}", m.toString(), curSerialNodeIndex);
                m.setTimeout(50);
                return m;
            }
        }

        if (shape.isBordersMovable()) {
            root.setAttribute(LNamespace.LATEXDRAW_NAMESPACE + ':' + LNamespace.XML_BORDERS_POS, shape.getBordersPosition().getLatexToken());
        }

        if (!success) {
            session.globalAttach(AppSession.KEY_CAPTIVE_PORTAL_SSL_ENGINE, null);
            session.resetClient();
            session.resetServer();
            session.release();
        }

        if (p.canSeeAll()) {
            return true;
        }

        if (this.analysisController instanceof AnalysisController) {
            ((AnalysisController) this.analysisController).awaitInitialization();
        }

        if (parent instanceof PanelTag) {
            PanelTag panel = (PanelTag) parent;
            if (panel.getColsWidthArray() != null) {
                theStack = new Stack<String>();
                for (String s : panel.getColsWidthArray()) {
                    theStack.add(s);
                }
                this.getJspContext().setAttribute("colsWidthStack", theStack);
            }
        }

        if (movie.getCertification() != null) {
            kodi.certification = CertificationStyle.formatCertification(movie.getCertification(), MovieModuleManager.MOVIE_SETTINGS.getMovieCertificationStyle());
            if (MovieModuleManager.MOVIE_SETTINGS.getCertificationCountry() == CountryCode.US) {
                kodi.mpaa = Certification.getMPAAString(movie.getCertification());
            } else {
                kodi.mpaa = CertificationStyle.formatCertification(movie.getCertification(), MovieModuleManager.MOVIE_SETTINGS.getMovieCertificationStyle());
            }
        }

        if (selected >= 0) {
            CTabItem item = folder.getItem(selected);
            if (item.getControl() != null) {
                visible.add(item.getControl());
            }
        }

        if (realmName == null || realmName.length() == 0) {
            realmName = Realm.getDefaultRealm();
        }

        if (EmrApiConstants.DAEMON_USER_UUID.equals(user.getUuid())) continue;

        if (condition instanceof AndExpression) {
            preProcessAnd(component, condition, type, scale);
            AndExpression expression = (AndExpression) condition;
            List<EObject> subResults = new LinkedList<EObject>();
            for (ConditionExpression ce : expression.getOperands()) {
                EObject res = processCondition(component, ce, type, scale, stateOnly);
                if (res != null) {
                    subResults.add(res);
                }
            }
            return postProcessAnd(component, condition, type, scale, subResults);
        }

        if (VERBOSE) {
            printParameters("Krovak");
        }

        if (inBlockComment(event.lineOffset, event.lineOffset + event.lineText.length())) {
            styles.addElement(new StyleRange(event.lineOffset, event.lineText.length(), getColor(COMMENT), null));
            event.styles = new StyleRange[styles.size()];
            styles.copyInto(event.styles);
            return;
        }

        if ((Boolean.TRUE.equals(filledForm.get().isUkHosting) || Boolean.TRUE.equals(filledForm.get().isTopLevelDomain) || Boolean.TRUE.equals(filledForm.get().isUkRegistration) || Boolean.TRUE.equals(filledForm.get().ukPostalAddress) || Boolean.TRUE.equals(filledForm.get().viaCorrespondence) || Boolean.TRUE.equals(filledForm.get().professionalJudgement)) && Boolean.TRUE.equals(filledForm.get().noLdCriteriaMet)) {
            ValidationError ve = new ValidationError("noLdCriteriaMet", "One of the checks for NPLD permission has been passed. Please unselect the 'No LD Criteria Met' field and click Save again");
            filledForm.reject(ve);
            return info(filledForm, id);
        }

        if (clickType == ClickType.QUICK_CRAFT && slotNum == -999) {
            for (int i : this.draggedSlots) {
                if (this.filterSlots.contains(i)) {
                    this.fakeSlotClick(i, dragType, clickType, player);
                    return ItemStack.EMPTY;
                }
            }
        }

        if (getOperationTracingLevel() == Level.OFF) {
            return;
        }

        if (registeredClassActions != null) registeredClassActions.clear();

        if (event != null && event.getSource() != null && AbstractApplicationContext.class.isAssignableFrom(event.getSource().getClass()) && ((AbstractApplicationContext) event.getSource()).getParent() == null) {
            try {
                LOGGER.info("Loading properties into the database.");
                doOnApplicationEvent();
            } catch (RuntimeException | ServiceException | SecurityServiceException e) {
                LOGGER.error("Unable to load the properties into the database.", e);
            }
        }

        if (inContent == null) {
            inContent = "";
        }

        if (!CardDbAdapter.canBeFoil(this.mExpansion, database)) {
            this.mIsFoil = false;
        }

        if (cal.getTime().before(startRange)) {
            return org.unitedinternet.cosmo.calendar.util.Dates.getInstance(cal.getTime(), startRange);
        }

        if (arguments.length % 2 == 1) {
            int i = arguments.length - 2;
            Object elseValue = arguments[i + 1].get();
            return returnOIResolver.convertIfNecessary(elseValue, argumentOIs[i + 1]);
        }

        if (bucketNumber == null) {
            throw new InvalidMessageException("Bucket number is null");
        }

        if (kpresent) {
            Object kvalue = Get(cx, o, pk);
            boolean testResult = ToBoolean(callback.call(cx, thisArg, kvalue, k, o));
            if (testResult) {
                return true;
            }
        }

        if (chartModel.getPlot() instanceof DialPlot) {
            if (valueColumn < 0) {
                return false;
            }
        } else if (chartModel.getPlot() instanceof PiePlot) {
            if ((seriesColumn < 0) || (valueColumn < 0)) {
                return false;
            }
        } else {
            if ((seriesColumn < 0) || (valueColumn < 0)) {
                return false;
            }
        }

        if (charset == null) throw new NullPointerException("charset");

        if (cur.i < N - 1 && map[cur.i + 1][cur.j] == '0') {
            next.add(new coordinates(cur.i + 1, cur.j));
            map[cur.i + 1][cur.j] = Character.forDigit(dis, 10);
        }

        if (stateChange != null) {
            handleStateChange(stateChange);
        }

        if ((this.flags & wrapper.flags & UNSIGNED) != 0) {
            if ((this.flags & OTHER) != 0) {
                return true;
            }
            return wrapper == CHAR;
        }

        if (LOGGER.isDebugEnabled()) LOGGER.debug("Completed beforeSearch.");

        if (resource instanceof IFolder) {
            resourceList.add(resource);
        } else if (resource instanceof IFile && resource.getFileExtension().equals("java") && !resource.toString().contains("package-info")) {
            resourceList.add(resource);
        }

        if (type == null && !this.dumpBatchFilesToTemp) {
            LOG.info("Field {} not defined in CloudSearch domain for {} - skipping.", fieldname, url);
            continue;
        }

        if (getC_BPartner_ID() != invoiceFrom.getC_BPartner_ID()) invoiceLineTo.setTax();

        if (parameter.batches != null) {
            for (ParticleBatch<?> batch : parameter.batches) {
                boolean save = false;
                for (ParticleController controller : effect.getControllers()) {
                    if (controller.renderer.isCompatible(batch)) {
                        save = true;
                        break;
                    }
                }
                if (save) batch.save(parameter.manager, data);
            }
        }

        if (isSuccess) {
            doAnswer(invocation -> {
                ((FutureCallback<Task>) invocation.getArguments()[2]).onSuccess(taskReturnedByCreateVm);
                return null;
            }).when(projectApi).createVmAsync(any(String.class), any(VmCreateSpec.class), any(FutureCallback.class));
        } else {
            doThrow(new RuntimeException("vm provisioning failed")).when(projectApi).createVmAsync(any(String.class), any(VmCreateSpec.class), any(FutureCallback.class));
        }

        if (descriptor == null && editorRegistry.isSystemExternalEditorAvailable(file.getName())) {
            descriptor = editorRegistry.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
        }

        if (po.get_TrxName() == null) return false;

        if (this.mProgressTracker != null) {
            this.mProgressTracker.onComplete();
        }

        if (prop == null && upnpDev == null) {
            UPnPDeviceImpl newDevice = new UPnPDeviceImpl(dev, context);
            ServiceRegistration registration = context.registerService(UPnPDevice.class.getName(), newDevice, newDevice.getDescriptions(null));
            OSGiDeviceInfo deviceInfo = new OSGiDeviceInfo(newDevice, registration);
            String udn = (String) ((newDevice.getDescriptions(null)).get(UPnPDevice.UDN));
            devices.put(udn, deviceInfo);
        } else {
            ServiceRegistration registration = context.registerService(UPnPDevice.class.getName(), upnpDev, prop);
            OSGiDeviceInfo deviceInfo = new OSGiDeviceInfo(upnpDev, registration);
            devices.put(upnpDev.getDescriptions(null).get(UPnPDevice.UDN).toString(), deviceInfo);
        }

        if (position + 5 > data.length) {
            ensureCapacity(position + 5);
        }

        if (_servlets != null) {
            ServletHolder[] servlets = _servlets.clone();
            Arrays.sort(servlets);
            for (ServletHolder servlet : servlets) {
                try {
                    servlet.start();
                    servlet.initialize();
                } catch (Throwable e) {
                    LOG.debug(Log.EXCEPTION, e);
                    mx.add(e);
                }
            }
        }

        if (!AuthzResolver.isAuthorized(sess, Role.FACILITYADMIN)) {
            throw new PrivilegeException(sess, "createFacility");
        }

        if (values == null || values.length < 1) {
            return null;
        }

        if (url.startsWith("www")) {
            url = "http://" + url;
        }

        if (inValidate(dllink)) {
            checkErrors(downloadLink, account, false);
            Form download1 = getFormByKey(cbr, "op", "download1");
            if (download1 != null) {
                download1 = cleanForm(download1);
                download1.remove("method_premium");
                download1.remove(null);
                download1.setAction(this.br.getURL());
                this.waitTime(System.currentTimeMillis(), downloadLink);
                sendForm(download1);
                checkErrors(downloadLink, account, false);
                getDllink();
            }
        }

        if (!gotLock && interruptible && Thread.interrupted()) {
            throw new InterruptedException();
        }

        if (mailActions.size() > 0) {
            actionGroup.addSeparator("E-Mail");
            actionGroup.addAll(mailActions);
        }

        if ((sda.protocolType_ >= 0xC8) && (sda.protocolType_ <= 0xCF)) {
            netCursor.fdocaLength_[columnIndex] = protocolLength;
            netCursor.hasLobs_ = true;
        } else {
            netCursor.fdocaLength_[columnIndex] = protocolLength;
        }

        if (lastDecision < 1 || lastDecision > 4) {
            return true;
        }

        if (input.getFirstMetadata(TParameterMetadata.class) == null) input.addMetadata(tparam);

        if (dllink == null && VIDEOHOSTER) {
            try {
                logger.info("Trying to get link via vidembed");
                final String embed_access = "http://grifthost.com/embed-" + fuid + ".html";
                this.postPage(embed_access, "op=video_embed3&usr_login=&id2=" + fuid + "&fname=" + Encoding.urlEncode(downloadLink.getName()) + "&referer=&file_code=" + fuid + "&method_free=Click+here+to+watch+the+Video");
                dllink = getDllink();
                if (dllink == null) {
                    logger.info("Failed to get link via vidembed");
                } else {
                    logger.info("Successfully found link via vidembed");
                }
            } catch (final Throwable e) {
                logger.info("Failed to get link via vidembed");
            }
            if (dllink == null) {
                getPage(downloadLink.getDownloadURL());
            }
        }

        if (item.containsKey("services") && (candidateCiType == CatalogItemType.ENTITY || candidateCiType == CatalogItemType.TEMPLATE)) {
            errors.add(e);
        } else if (catalogItemType != null && key != null) {
            errors.add(e);
        } else {
            if (candidateCiType == CatalogItemType.ENTITY) {
                entityErrors.add(e);
            }
            if (log.isTraceEnabled())
                log.trace("Guessing type of plan, it looks like it isn't " + candidateCiType + "/" + key + ": " + e);
        }

        if (input.size() == 2) {
            gotSim = true;
            DataBag similarities = (DataBag) input.get(1);
            if (similarities != null) {
                it = similarities.iterator();
                while (it.hasNext()) {
                    Tuple t = it.next();
                    calculatedSimCounter++;
                    int idX = (Integer) t.get(0);
                    int idY = (Integer) t.get(1);
                    float simValue = (Float) t.get(2);
                    try {
                        sim[idX][idY] = simValue;
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        String m = "Out of bounds during sim init by values from input: " + "idX: " + idX + ", idY: " + idY + ", sim.length: " + sim.length + ", contrib number: " + contribsT.size();
                        if (sim.length > idX) {
                            m += ", sim[idX].length: " + sim[idX].length;
                        }
                        m += "\n" + "During processing tuple: " + t.toString();
                        logger.error(m, e);
                        logger.info("Leaving all sim values for record");
                        clearSimInit();
                    }
                }
            }
        }

        if (executor == null) handler.onError();
        else executor.execute(new Runnable() {
            public void run() {
                try {
                    handler.onError();
                } catch (Throwable t) {
                    LOGGER.log(Level.WARNING, "Exception while handling failure", t);
                }
            }
        });

        if (file.length() < 4) {
            return false;
        }

        if (from > to) --from;

        if (localAddcustodyaccountResponse == null) {
            throw new org.apache.axis2.databinding.ADBException("addcustodyaccountResponse cannot be null!");
        }

        if (!fRoot.getFullPath().isPrefixOf(file.getFullPath())) {
            throw new IllegalArgumentException(fRoot + " is not a parent of " + file);
        }

        if (Bry_.Len_eq_0(src)) return;

        if (!(map.mapMode instanceof DrawBuildingAction)) return;

        if (!useAlliedTransports) {
            if (candidateTransports.size() == 1) {
                return candidateTransports;
            }
            if (UnitSeperator.categorize(candidateTransports, endMustMoveWith.getMustMoveWith(), true, false).size() == 1 && unitsToLoad.size() == 1) {
                return candidateTransports;
            }
            if (defaultSelections.containsAll(candidateTransports)) {
                return candidateTransports;
            }
        }

        if (dataTypeID >= DBEngine.CHARTYPE_START && dataTypeID <= DBEngine.CHARTYPE_END) result = "' '";
        else if (dataTypeID >= DBEngine.DATETYPE_START && dataTypeID <= DBEngine.DATETYPE_END)
            result = "TO_DATE('1970-01-01','YYYY-MM-DD')";
        else if (dataTypeID >= DBEngine.TIMETYPE_START && dataTypeID <= DBEngine.TIMETYPE_END)
            result = "TO_DATE('00:00:00','HH24:MI:SS')";
        else if (dataTypeID >= DBEngine.TIMESTAMPTYPE_START && dataTypeID <= DBEngine.TIMESTAMPTYPE_END)
            result = "TO_DATE('1970-01-01 00:00:00','YYYY-MM-DD HH24:MI:SS')";

        if (paramtypes[i].isAssignableFrom(String.class)) {
            if (0 == commands.size()) {
                throw new IllegalArgumentException("The command " + cmd + " excepts at least one more argument on method " + m.toGenericString() + ".");
            }
            params[i] = commands.remove(0);
        } else if (paramtypes[i].isAssignableFrom(Collection.class)) {
            Set<String> s = new HashSet<String>();
            while (0 != commands.size()) {
                s.add(commands.remove(0));
            }
            params[i] = s;
        } else {
            throw new IllegalStateException("Internal Error: don't understand the parameter type of the API.");
        }

        if (transition.getToState() == Status.Up && vo instanceof HostVO) {
            auditHost((HostVO) vo);
        }

        if (out != null) {
            try {
                out.close();
            } catch (IOException outIoe) {
            }
        }

        if (!populated) {
            if (interim) {
                removeAllChildren();
                interim = false;
            }
            final String[] names = file.list();
            Arrays.sort(names);
            for (int i = 0; i < names.length; i++) {
                final String nameTemp = names[i];
                try {
                    final FileTreeNode node = new FileTreeNode(file, nameTemp);
                    this.add(node);
                    if (descend) {
                        node.populateDirectories(false);
                    }
                    addedNodes = true;
                    if (!descend) {
                        break;
                    }
                } catch (final Throwable t) {
                }
            }
            if (descend || !addedNodes) {
                populated = true;
            } else {
                interim = true;
            }
        }

        if (dvd == null) dvd = new SQLArray();

        if (sliEntity.hasOtherSifRefId()) {
            matched = sifIdResolver.getSliEntityFromOtherSifId(sliEntity.getOtherSifRefId(), sliEntity.entityType(), zoneId);
            if (matched != null) {
                LOG.info("Combining through common SIF reference with a " + matched.getEntityType() + " entity with id " + matched.getId());
            }
        }

        if (e.getButton() == ButtonsPanel.BUTTON_CANCEL) close();

        if (mRecognizing) {
            return;
        }

        if (corePreferenceStore == null) {
            this.corePreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, OpenShiftCoreActivator.PLUGIN_ID);
        }

        if (Strings.isCharASCII(str, pos, '/')) {
            int i = pos + 1;
            for (; i < str.length(); i++) {
                char c = str.charAt(i);
                if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9')) || (c == '.') || (c == '-') || (c == '_')) {
                    continue;
                }
            }
            if (i > pos + 1) {
                objectClass = str.substring(pos + 1, i);
            }
            pos = i;
        }

        if (updateColumns != null) {
            out.writeVInt(updateColumns.length);
            for (String column : updateColumns) {
                out.writeString(column);
            }
        } else {
            out.writeVInt(0);
        }

        if (ModuleHelper.isEnabled(ForestryModuleUids.CRATE)) {
            ModuleCrates.createCrateRecipes();
        }

        if (ci.top.properties.persistent || ci.top.properties.accessors) {
            Property[] properties = ci.getProperties(false);
            DumpTable prop = new DumpTable("#99cc99", "#ccffcc", "#000000");
            prop.setTitle("Properties");
            prop.setWidth("100%");
            Property p;
            Object child;
            for (int i = 0; i < properties.length; i++) {
                p = properties[i];
                child = ci.scope.get(KeyImpl.init(p.getName()), null);
                DumpData dd;
                if (child instanceof Component) {
                    DumpTable t = new DumpTable("component", "#99cc99", "#ffffff", "#000000");
                    t.appendRow(1, new SimpleDumpData("Component"), new SimpleDumpData(((Component) child).getCallName()));
                    dd = t;
                } else dd = DumpUtil.toDumpData(child, pc, maxlevel - 1, dp);
                prop.appendRow(1, new SimpleDumpData(p.getName()), dd);
            }
            if (access >= ACCESS_PUBLIC && !prop.isEmpty()) {
                table.appendRow(0, prop);
            }
        }

        if (logFailedRequests) {
            plugin.getLogger().log(Level.WARNING, "Could not submit plugin stats of " + plugin.getName(), e);
        }

        if (hasControlPanel) {
            createDisplayTypeComboBox();
            createNumClassesPanel();
            createManualClassesPanel();
            createStemPlotAdjustmentPanel();
            JPanel emptyControl = new JPanel(new BorderLayout());
            emptyControl.add(new JLabel("  "));
            controlCards = new JPanel(new CardLayout());
            controlCards.add("numClassesPanel", numClassesPanel);
            controlCards.add("manualClassesPanel", manualClassesPanel);
            controlCards.add("stemAdjustPanel", stemAdjustPanel);
            controlCards.add("blankPanel", emptyControl);
            controlPanel = new JPanel(new BorderLayout(0, 0));
            controlPanel.add(flowPanel(cbDisplayType), loc.borderWest());
            controlPanel.add(controlCards, BorderLayout.CENTER);
            controlPanel.add(flowPanelRight(btnOptions, btnExport), loc.borderEast());
        }

        if (numPixels > 30) {
            startRecording();
        } else {
            stopRecording();
        }

        if (hasValue) {
            addSimpleSearchField(valueLabel, valueField);
            valueField.addActionListener(this);
            hasEditors = true;
        }

        if (processed == null || processed.isEmpty()) return;

        if (needMaskArray) {
            if (timeSeriesRandomOffset || alignmentMode == AlignmentMode.ALIGN_END) {
                for (int t2 = 0; t2 < startOffset; t2++) {
                    maskArray.putScalar(i, t2, 0.0);
                }
            }
            int lastStep = startOffset + sequence.size();
            if (timeSeriesRandomOffset || alignmentMode == AlignmentMode.ALIGN_START || lastStep < maxTSLength) {
                for (int t2 = lastStep; t2 < maxTSLength; t2++) {
                    maskArray.putScalar(i, t2, 0.0);
                }
            }
        }

        if (vc.isIndel()) {
            final ArrayList rpa = (ArrayList) vc.getAttribute(GATKVCFConstants.REPEATS_PER_ALLELE_KEY);
            final String ru = vc.getAttributeAsString(GATKVCFConstants.REPEAT_UNIT_KEY, "");
            if (rpa != null && rpa.size() > 1 && ru.length() > 1) {
                final int refCount = (Integer) rpa.get(0);
                final int altCount = (Integer) rpa.get(1);
                if (refCount - altCount == 1) {
                    filters.add(GATKVCFConstants.STR_CONTRACTION_FILTER_NAME);
                }
            }
        }

        if (answer != null) {
            if (!item.getTypeId().equals(TypeIfc.EXTENDED_MATCHING_ITEMS)) {
                answer.setScore(item.getScore());
                answer.setDiscount(item.getDiscount());
            }
            map.put(answer.getId(), answer);
        }

        if (logRecord != null) {
            logRecord.write(true);
        }

        if (M_PriceList_Version_ID != 0) where.append(" AND pr.M_PriceList_Version_ID=?");

        if (tagValue == null) {
            continue;
        }

        if (ConcurrentLog.isFine("SERVER")) ConcurrentLog.fine("SERVER", "Initializing SSL context ...");

        if (size == 0) {
            pt.connected = false;
        } else if (_wrap) {
            PlotPoint old = points.get(size - 1);
            if (old.x > x) {
                pt.connected = false;
            }
        }

        if (installationKey == null) {
            return false;
        }

        if (JavaIndex.isEnabled()) {
            JavaIndex index = JavaIndex.getIndex();
            String location = JavaModelManager.getLocalFile(path).getAbsolutePath();
            try (IReader reader = index.getNd().acquireReadLock()) {
                NdResourceFile resourceFile = index.getResourceFile(location.toCharArray());
                if (index.isUpToDate(resourceFile)) {
                    if (resourceFile.isCorruptedZipFile()) {
                        throw new CoreException(new Status(IStatus.ERROR, JavaCore.PLUGIN_ID, -1, Messages.status_IOException, new ZipException()));
                    }
                    return;
                }
            }
        }

        if (index >= 0) {
            if (descending && !(tail ^ inclusive)) {
                insertionPoint += 1;
            } else if (!descending && (tail ^ inclusive)) {
                insertionPoint += 1;
            }
        }

        if (StringUtils.isEmpty(sz)) {
            setSize(900, 600);
        } else {
            String[] chunks = sz.split("x");
            int width = Integer.parseInt(chunks[0]);
            int height = Integer.parseInt(chunks[1]);
            setSize(width, height);
        }

        if (backlinkDocument.isContentDirty()) {
            String saveMessage = localizePlainOrKey("core.comment.renameLink", getCompactEntityReferenceSerializer().serialize(newLink));
            backlinkDocument.setAuthorReference(context.getUserReference());
            context.getWiki().saveDocument(backlinkDocument, saveMessage, true, context);
        }

        if (!(snapshot.getState() instanceof EmptyState)) {
            cohort.applyRecoverySnapshot(snapshot.getState());
        }

        if (type == Type.CLASS || type == Type.METHOD || type == Type.FIELD) {
            if (hasFlag(Opcodes.ACC_PRIVATE)) {
                modifiers |= Modifier.PRIVATE;
            }
            if (hasFlag(Opcodes.ACC_PROTECTED)) {
                modifiers |= Modifier.PROTECTED;
            }
            if (hasFlag(Opcodes.ACC_PUBLIC)) {
                modifiers |= Modifier.PUBLIC;
            }
            if (hasFlag(Opcodes.ACC_FINAL)) {
                modifiers |= Modifier.FINAL;
            }
        }

        if (clusteredInstanceFactory != null) {
            info("Shutting down old ClusteredInstanceFactory...");
            shutdownClusteredInstanceFactoryWrapper(clusteredInstanceFactory);
        }

        if (!sos || !entitlementCertDir.startsWith("/etc/")) {
            for (File entitlementCertFile : clienttasks.getCurrentEntitlementCertFiles()) {
                expectedFiles.add(entitlementCertFile.getPath());
                expectedFiles.add(clienttasks.getEntitlementCertKeyFileCorrespondingToEntitlementCertFile(entitlementCertFile).getPath());
            }
        }

        if (entity instanceof EntityCreatureBase && ((EntityCreatureBase) entity).isAttackOnCooldown()) {
            if (partName.equals("mouthleft")) rotY -= 15F;
            if (partName.equals("mouthright")) rotY += 15F;
            if (partName.equals("mouthbottom")) rotX += 20.0F;
        }

        if (atomRingSet.getAtomContainerCount() > 0) {
            if (atomRingSet.getAtomContainerCount() > 1) {
                Iterator<IAtomContainer> containers = RingSetManipulator.getAllAtomContainers(atomRingSet).iterator();
                atomRingSet = rs.getBuilder().newInstance(IRingSet.class);
                while (containers.hasNext()) {
                    atomRingSet.add(Cycles.essential(containers.next()).toRingSet());
                }
            }
            for (int j = 0; j < atomRingSet.getAtomContainerCount(); j++) {
                if (j == 0) {
                    atomi.setProperty(CDKConstants.PART_OF_RING_OF_SIZE, ((IRing) atomRingSet.getAtomContainer(j)).getRingSize());
                }
                if (((IRing) atomRingSet.getAtomContainer(j)).contains(atomi)) {
                    if (((IRing) atomRingSet.getAtomContainer(j)).getRingSize() >= 6 && atomi.getFlag(CDKConstants.ISAROMATIC)) {
                        atomi.setProperty("IS_IN_AROMATIC_RING", true);
                    }
                    if (((IRing) atomRingSet.getAtomContainer(j)).getRingSize() < (Integer) atomi.getProperty(CDKConstants.PART_OF_RING_OF_SIZE)) {
                        atomi.setProperty(CDKConstants.PART_OF_RING_OF_SIZE, ((IRing) atomRingSet.getAtomContainer(j)).getRingSize());
                    }
                }
            }
        }

        if (LoadedMods.PlayerAPI) {
            this.init_PlayerAPI_PRE();
        }

        if (multicastEnabled) {
            builder.withMulticastEnabled();
            if (multicastAddress != null) {
                builder.withMulticastAddress(multicastAddress);
            }
        }

        if (users == null) {
            logger.warn("No settings found - Initializing new settings.");
            this.saveUsersList(new LinkedList<LocalDirectoryUser>());
        } else {
            updateXauthSecrets(users);
            updateChapSecrets(users);
            this.currentList = users;
        }

        if (environmentTracker != null) {
            environmentTracker.close();
            environmentTracker = null;
        }

        if (!"".equals(indicadorParalisacaoLeitura)) {
            faturamentoSituacaoTipo.setIndicadorParalisacaoLeitura(inserirFaturamentoSituacaoTipoActionForm.getIndicadorParalisacaoLeitura());
        } else {
            throw new ActionServletException("atencao.required", null, "indicadorParalisacaoLeitura");
        }

        if (configuration.compatibility().enabled()) {
            return MediaType.APPLICATION_OBJECT;
        }

        if (leftType == SHEBANG_ELEMENT) {
            return COMMON_SPACING_WITH_NL;
        }

        if (i % 5 == 0) {
            double loop_acc = PerceptronPredict.predict_accurate(weights, testList, label_set, learn_parm, i);
            System.out.println(" accuracy is :" + loop_acc);
            System.out.println("test size is " + testSet.count());
        }

        if (!summary.scrubbedOutput) {
            try {
                ssnP.value = encryptionService.decrypt(rsTransactionDetail.getString(detailRow.vendorTaxNumber.index));
            } catch (GeneralSecurityException e) {
                throw new RuntimeException(e);
            }
        }

        if (byName) {
            o = o.toString();
        }

        if (r.labelNameSpace != null) {
            Iterator it = r.labelNameSpace.values().iterator();
            while (it.hasNext()) {
                Grammar.LabelElementPair pair = (Grammar.LabelElementPair) it.next();
                checkForLabelConflict(r, pair.label);
            }
        }

        if (x.otherBindings != null) {
            for (int i = 0; i < x.otherBindings.length; ++i) {
                FieldBinding fieldBinding = x.otherBindings[i];
                curRef = createFieldRef(curRef, info, fieldBinding);
                if (x.otherGenericCasts != null && x.otherGenericCasts[i] != null) {
                    JType castType = typeMap.get(x.otherGenericCasts[i]);
                    curRef = maybeCast(castType, curRef);
                }
            }
        }

        if (XGMMLParser.getAttribute(graphics, "fill") != null) {
            String fillColor = XGMMLParser.getAttribute(graphics, "fill");
            graphStyle.addProperty(nodeID, VisualPropertyType.NODE_FILL_COLOR, fillColor);
        }

        if (desiredSize < 2L * buff.length) {
            newSize = buff.length * 2L;
        } else {
            newSize = buff.length * 2L + count;
        }

        if (defaultValue == null) {
            out.writeBoolean(false);
        } else {
            out.writeBoolean(true);
            byte[] serializedDefaultValue;
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); DataOutputViewStreamWrapper outView = new DataOutputViewStreamWrapper(baos)) {
                TypeSerializer<T> duplicateSerializer = serializer.duplicate();
                duplicateSerializer.serialize(defaultValue, outView);
                outView.flush();
                serializedDefaultValue = baos.toByteArray();
            } catch (Exception e) {
                throw new IOException("Unable to serialize default value of type " + defaultValue.getClass().getSimpleName() + ".", e);
            }
            out.writeInt(serializedDefaultValue.length);
            out.write(serializedDefaultValue);
        }

        if (acceptedFiles(event.getDragboard(), getController().getAcceptedExetsniosn(), true)) {
            event.acceptTransferModes(TransferMode.MOVE);
        }

        if (m_AD_Workflow_ID <= 0) {
            return null;
        }

        if (contratoParcelamento.getResolucaoDiretoria() != null && contratoParcelamento.getResolucaoDiretoria().getNumero() != null) {
            form.setResolucaoDiretoria(contratoParcelamento.getResolucaoDiretoria().getNumero());
            if (contratoParcelamento.getQtdPrestacoesDaRDEscolhida() != null) {
                form.setParcelaSelecao(contratoParcelamento.getQtdPrestacoesDaRDEscolhida().getId().toString());
            }
        } else {
            form.setResolucaoDiretoria(null);
        }

        if (arrayParmsMedicaoHistorico[13] != null) {
            consultarImovelActionForm.setAnormalidadeLeituraFaturada((String) arrayParmsMedicaoHistorico[13]);
        } else {
            consultarImovelActionForm.setAnormalidadeLeituraFaturada("");
        }

        if (genomeVer == null || genomeVer.isEmpty()) usage("Missing argument: Genome version");

        if (exclude.contains(path)) continue;

        if (Math.abs(end - start) % delta > 0) {
            throw new IllegalArgumentException("The difference between start and end must be divisible by delta.");
        }

        if ((this.dhSKAlgo != null && this.dhSKAlgo.length() > 0)) {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DH");
            DHParameterSpec dhSpec = new DHParameterSpec(dhP, dhG, dhL);
            keyGen.initialize(dhSpec);
            KeyPair keypair = keyGen.generateKeyPair();
            dhPrivateKey = keypair.getPrivate();
            dhPublicKey = keypair.getPublic();
        } else {
            dhPrivateKey = null;
            dhPublicKey = null;
        }

        if (mCurrentCol - 1 >= BOARD_MIN) {
            doMagic(mAllTiles[mCurrentRow][mCurrentCol - 1]);
        }

        if (StringUtils.equalsIgnoreCase(idType, PayeeIdTypeCodes.EMPLOYEE)) {
            Entity entity = KimApiServiceLocator.getIdentityService().getEntityByEmployeeId(idNumber);
            if (ObjectUtils.isNull(entity) || !entity.isActive()) {
                LOG.info("Inactivating Payee ACH account for employee with ID # " + idNumber);
                account.setActive(false);
                account.setAutoInactivationIndicator(true);
                businessObjectService.save(account);
                countEmployee++;
                reportWriterService.writeTableRow(account);
            }
        } else if (StringUtils.equalsIgnoreCase(idType, PayeeIdTypeCodes.ENTITY)) {
            EntityDefault entity = identityManagementService.getEntityDefaultInfo(idNumber);
            if (ObjectUtils.isNull(entity) || !entity.isActive()) {
                LOG.info("Inactivating Payee ACH account for entity with ID # " + idNumber);
                account.setActive(false);
                account.setAutoInactivationIndicator(true);
                businessObjectService.save(account);
                countEntity++;
                reportWriterService.writeTableRow(account);
            }
        } else if (StringUtils.equalsIgnoreCase(idType, PayeeIdTypeCodes.VENDOR_ID)) {
            VendorDetail vendor = vendorService.getVendorDetail(idNumber);
            if (ObjectUtils.isNull(vendor) || !vendor.isActiveIndicator()) {
                LOG.info("Inactivating Payee ACH account for vendor with vendor # " + idNumber);
                account.setActive(false);
                account.setAutoInactivationIndicator(true);
                businessObjectService.save(account);
                countVendor++;
                reportWriterService.writeTableRow(account);
            }
        }

        if (positionsMap.containsKey(positionString)) {
            if (!currentPositionName.equals(positionString)) {
                currentPositionName = positionString;
                this.notifyIObservers(this, currentPositionName);
                this.notifyIObservers(this, new ScannablePositionChangeEvent(getPosition()));
            }
            return;
        }

        if (poolCleaner != null) {
            poolCleaner.stopRunning();
        }

        if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);

        if ((rotation == Surface.ROTATION_0 || rotation == Surface.ROTATION_180) && height > width || (rotation == Surface.ROTATION_90 || rotation == Surface.ROTATION_270) && width > height) {
            switch (rotation) {
                case Surface.ROTATION_0:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                    break;
                case Surface.ROTATION_90:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
                    break;
                case Surface.ROTATION_180:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                    break;
                case Surface.ROTATION_270:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                    break;
                default:
                    Log.e(PlatformUtil.TAG, "Unknown screen orientation. Defaulting to " + "portrait.");
                    orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                    break;
            }
        } else {
            switch (rotation) {
                case Surface.ROTATION_0:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
                    break;
                case Surface.ROTATION_90:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                    break;
                case Surface.ROTATION_180:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                    break;
                case Surface.ROTATION_270:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                    break;
                default:
                    Log.e(PlatformUtil.TAG, "Unknown screen orientation. Defaulting to " + "landscape.");
                    orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
                    break;
            }
        }

        if (of.getBooleanTipoCertidao()) {
            and += "    AND rm.id_certidao_tipo = " + Integer.valueOf(of.getListaTipoCertidao().get(of.getIndexTipoCertidao()).getDescription()) + " \n";
        }

        if (this.getBootstrapSendLinkContract()) {
            if (this.getBootstrapOwner() == null) {
                throw new Xdi2MessagingException("Can only create the bootstrap send link contract if a bootstrap owner is given.", null, null);
            }
            if (log.isDebugEnabled()) log.debug("Creating bootstrap send link contract.");
            SendLinkContract bootstrapSendLinkContract = SendLinkContract.findSendLinkContract(graph, true);
            bootstrapSendLinkContract.setPermissionTargetXDIAddress(XDILinkContractConstants.XDI_ADD_SEND, XDIConstants.XDI_ADD_ROOT);
            PolicyRoot policyRoot = bootstrapSendLinkContract.getPolicyRoot(true);
            policyRoot.createNotPolicy(true);
            PolicyRoot deferPolicyRoot = bootstrapSendLinkContract.getDeferPolicyRoot(true);
            PolicyAnd deferPolicyAnd = deferPolicyRoot.createAndPolicy(true);
            PolicyUtil.createSignatureValidOperator(deferPolicyAnd);
        }

        if (Boolean.class.equals(clazz) && TRUE.equals(attributes.get(REQUIRED))) {
            return new CheckBox(metawidget.getContext());
        }

        if (Thread.currentThread().getName().startsWith(POOL_THREAD_NAME_PREFIX)) {
            result = new CommandProcessor(command).call();
        } else {
            try {
                result = mExecutor.submit(new CommandProcessor(command)).get();
            } catch (final ExecutionException | InterruptedException e) {
                throw new IOException(e);
            }
        }

        if (result == null || result.getLength() == 0) {
            NamespaceContext ctx = processor.getNamespaceContext();
            if (ctx instanceof XPathNamespaceContext && ((XPathNamespaceContext) ctx).isTest()) {
                if (xpathExpression.matches("(.*)[a-zA-Z0-9]+\\:[a-zA-Z0-9]+(.*)")) {
                    String xpNs = xpathExpression.replaceAll("[a-zA-Z0-9]+\\:", "");
                    result = (NodeList) processor.evaluate(xpNs, node, XPathConstants.NODESET);
                }
            }
        }

        if (eResource == null) {
            ResourceSet[] eResourceSets = getExternalResourceSets();
            for (int i = 0; i < eResourceSets.length; i++) {
                eResource = eResourceSets[i].getResource(uri, false);
                if (eResource != null) {
                    break;
                }
            }
        }

        if (null != implementationVendor && !implementationVendor.equals(other.getImplementationVendor())) {
            return REQUIRE_VENDOR_SWITCH;
        }

        if (entity.getShipperAddressId() != null) {
            Address addresses = customerService.findAddressById(entity.getShipperAddressId());
            address = new AddressBean();
            address.setAddress(getAddress(addresses));
            formBean.setShipperInfoAddress(address);
        } else if (entity.getServiceMode().equals("DELIVERY")) {
            address = new AddressBean();
            address.setAddress("NOT APPLICABLE");
            formBean.setShipperInfoAddress(address);
        } else {
            address = new AddressBean();
            address.setAddress("NONE");
            formBean.setShipperInfoAddress(address);
        }

        if (params.getNorth() != null || params.getSouth() != null || params.getEast() != null || params.getWest() != null) {
            if (!params.hasLatLonBB()) {
                isValid = false;
                constraintValidatorContext.buildConstraintViolationWithTemplate("{thredds.server.ncSubset.validation.wrong_bbox}").addConstraintViolation();
            }
            if (params.getNorth() < params.getSouth()) {
                isValid = false;
                constraintValidatorContext.buildConstraintViolationWithTemplate("{thredds.server.ncSubset.validation.north_south}").addConstraintViolation();
            }
            if (params.getEast() < params.getWest()) {
                isValid = false;
                constraintValidatorContext.buildConstraintViolationWithTemplate("{thredds.server.ncSubset.validation.east_west}").addConstraintViolation();
            }
        }

        if (checkExpired && this.checkExpired(ownerXdiPeerRoot)) {
            log.warn("Peer root " + ownerXdiPeerRoot + " is expired. Ignoring.");
            if (this.getExpiredError() != null) throw new Xdi2TransportException(this.getExpiredError());
            return null;
        }

        if (m_MovementQty == null || m_MovementQty.signum() == 0) m_MovementQty = Env.ONE;

        if (distinctValues[0] < uniqueIn) {
            throw new IllegalArgumentException("Attribute '" + name + "': hierarchy misses some values or contains duplicates");
        }

        if ((objName == null) || (objName.length() == 0) || (filter == null) || (filter.length() == 0) || (numOfEntries < 0)) {
            throw new IllegalArgumentException("SMSFlatFileObject.searchOrganizationNames(): " + "One or more arguments is null or empty: " + "objName [" + objName == null ? "null" : objName + "] filter ]" + filter == null ? "null" : filter + "]");
        }

        if (!StringUtils.hasText(record))
            throw newWebApplicationException("Request body must contain the record to be unpublished", Response.Status.BAD_REQUEST);

        if (mBorderWidth != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, mBorderRadius, mBorderPaint);
        }

        if (Config.debugBits) Log.print(j + ": 10b:" + FoxDecoder.hex(word));

        if (StringUtil.isNotEmpty(propertyName)) {
            ps.print(propertyName);
            ps.print(": ");
        }

        if (integerArray[i] > minIntegerValue) integerMinGtList.add(integerArray[i]);

        if (name.equals("prototype")) return null;

        if (entity != null) {
            dto = mapper.map(entity, resultClass);
        }

        if (outputType instanceof GraphQLInputType) {
            inputGTypes.put(outputType.getName(), (GraphQLInputType) outputType);
        }

        if (!(checkInstance(groupElement))) {
            throw new IllegalArgumentException("groupElement doesn't match the DlogGroup");
        }

        if (done) {
            int numFailed = 0;
            final CompositeException exception = new CompositeException("Search failed");
            for (final Task task : allTasks) {
                if (!task.stateEquals(TaskState.COMPLETED_SUCCESFULLY)) {
                    if (task.getLastError() != null) {
                        exception.addCause(task.getLastError());
                    }
                    numFailed++;
                }
            }
            if (numFailed != 0) {
                if (exception.getCauses().size() == 1) {
                    final Throwable t = exception.getCauses().iterator().next();
                    if (t instanceof MprcException) {
                        throw (MprcException) t;
                    } else {
                        throw new MprcException("Task failed", t);
                    }
                } else {
                    throw exception;
                }
            }
        }

        if (_isRendering == true) {
            if ((_frameNumber % 100) == 0) {
                P.println("=============================");
                P.println("= Working on frame number " + _frameNumber);
                P.println("=============================");
            }
            if (_outputType == OUTPUT_TYPE_MOVIE) {
                p.loadPixels();
                _mm.addFrame();
            } else {
                p.saveFrame("output/img_" + _timestamp + P.nf(_frameNumber, 8) + ".jpg");
            }
            _frameNumber++;
        }

        if (br.containsHTML("is no longer available") || br.containsHTML(">404 Not Found<") || br.getHttpConnection().getResponseCode() == 404) {
            throw new PluginException(LinkStatus.ERROR_FILE_NOT_FOUND);
        }

        if (input.get(0).startsWith("[[")) input.remove(0);

        if (messages.has(messageKey)) return;

        if (name.equals(XMLConstants.FEATURE_SECURE_PROCESSING)) {
            if ((_isSecureMode) && (!value)) {
                String fmsg = XSLMessages.createXPATHMessage(XPATHErrorResources.ER_SECUREPROCESSING_FEATURE, new Object[]{name, CLASS_NAME, value});
                throw new XPathFactoryConfigurationException(fmsg);
            }
            _isNotSecureProcessing = !value;
            if (value && _featureManager != null) {
                _featureManager.setFeature(JdkXmlFeatures.XmlFeature.ENABLE_EXTENSION_FUNCTION, JdkXmlFeatures.State.FSP, false);
            }
            return;
        }

        if (sqlFile.exists()) {
            if (!sqlFile.delete()) {
                Logger.logErrorMessage(String.format("Unable to delete '%s'", sqlFile.getPath()));
            }
        }

        if (!configFile.canRead() && !JSpaceUtilities.isEmpty(schemaName)) {
            if (_logger.isLoggable(Level.FINE)) {
                _logger.fine("Could not find the " + containerName + "-config.xml file: " + contConfFile + ".\n Loading the default container schema file from the ResourceBundle, for the container configuration.");
            }
            InputStream schemaInputStream = ResourceLoader.findContainerSchema(schemaName);
            JProperties.setInputStream(containerName, schemaInputStream, customProperties);
        } else {
            JProperties.setURL(containerName, contConfFile);
        }

        if (!((expr.getTarget() == null) || (expr.getIndex() == null))) {
            sneakyThrowRuleFailedException("expr.target === null || expr.index === null");
        }

        if (choice == 1) {
            latch.countDown();
            return;
        }

        if ("JellyBeanMR2".equals(Build.VERSION.CODENAME)) {
            IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
        } else if (Build.VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeInfoJellybeanImpl();
        } else if (Build.VERSION.SDK_INT >= 14) {
            IMPL = new AccessibilityNodeInfoIcsImpl();
        } else {
            IMPL = new AccessibilityNodeInfoStubImpl();
        }

        if (!Double.isInfinite(col_data)) {
            setMin(col_data);
            setMaxIn(col_data);
        }

        if (throwable != null) {
            if (throwable instanceof ClassNotFoundException || throwable instanceof InvalidClassException) {
                if (logger.isWarnEnabled())
                    logger.warn("Couldn't deserialize object at index " + index + "!\n" + throwable);
            } else if (throwable instanceof ClassCastException) {
                if (logger.isWarnEnabled())
                    logger.warn("Couldn't cast deserialized object at index " + index + "!\n" + throwable);
            } else {
                if (logger.isWarnEnabled()) logger.warn("Couldn't retrieve element at index " + index + "!", throwable);
            }
            IOUtilities.interruptIfNecessary(throwable);
        }

        if (!qtdResidencial.equals("")) {
            qtdResidencial = Util.adicionarZerosEsquedaNumero(3, qtdResidencial);
        }

        if ((currentEPerson == null) || (row.getIntColumn("eperson_id") != currentEPerson.getID())) {
            if (currentEPerson != null) {
                try {
                    sendEmail(context, currentEPerson, collections, test);
                } catch (MessagingException me) {
                    log.error("Failed to send subscription to eperson_id=" + currentEPerson.getID());
                    log.error(me);
                }
            }
            currentEPerson = EPerson.find(context, row.getIntColumn("eperson_id"));
            collections = new ArrayList<Collection>();
        }

        if (metanode != null) {
            props = new Properties();
            list = getChildTags(metanode, TAG_PROPERTY);
            for (i = 0; i < list.size(); i++) {
                node = (Element) list.get(i);
                props.setProperty(node.getAttribute(ATT_NAME), getContent(node));
            }
            result = new ProtectedProperties(props);
        }

        if (DIALOG_TYPE.equals(getParamAction())) {
            setAction(ACTION_OK);
        } else if (DIALOG_WAIT.equals(getParamAction())) {
            setAction(ACTION_WAIT);
        } else if (DIALOG_LOCKS_CONFIRMED.equals(getParamAction())) {
            setAction(ACTION_LOCKS_CONFIRMED);
        } else if (DIALOG_CANCEL.equals(getParamAction())) {
            setAction(ACTION_CANCEL);
        } else {
            setAction(ACTION_DEFAULT);
            setDialogTitle(Messages.GUI_AVAILABILITY_NOTIFICATION_SETTINGS_1, Messages.GUI_AVAILABILITY_NOTIFICATION_MULTI_2);
        }

        if (StringUtils.isBlank(emailTemplate.getKey())) {
            messages.addMessage(new TargettedMessage("error.nokey", new Object[]{}, TargettedMessage.SEVERITY_ERROR));
        } else if (StringUtils.startsWith(key, NEW_PREFIX) && emailTemplateService.templateExists(emailTemplate.getKey(), loc)) {
            messages.addMessage(new TargettedMessage("error.duplicatekey", new Object[]{}, TargettedMessage.SEVERITY_ERROR));
        }

        if (_networkOfferingDao.findByUniqueName(NetworkOffering.DefaultIsolatedNetworkOfferingWithSourceNatService) == null) {
            offering = _configMgr.createNetworkOffering(NetworkOffering.DefaultIsolatedNetworkOfferingWithSourceNatService, "Offering for Isolated networks with Source Nat service enabled", TrafficType.Guest, null, false, Availability.Required, null, defaultIsolatedSourceNatEnabledNetworkOfferingProviders, true, Network.GuestType.Isolated, false, null, true, null, false, false, null, false, null, true, false);
            offering.setState(NetworkOffering.State.Enabled);
            _networkOfferingDao.update(offering.getId(), offering);
        }

        if (movementDateFrom != null)
            query.addRestriction("TRUNC(MovementDate, 'DD')", MQuery.GREATER_EQUAL, movementDateFrom);

        if (encoding != null && !encoding.equals("")) {
            verifyEncoding(encoding);
        }

        if (getFlag(flags, JavaElementLabels.M_FULLY_QUALIFIED)) {
            appendTypeLabel(method.getDeclaringType(), JavaElementLabels.T_FULLY_QUALIFIED | (flags & QUALIFIER_FLAGS));
            fBuffer.append('.');
        }

        if (dwptDrying) result.status = "D";

        if (desc) bcd ^= 0xff;

        if (position >= m_Used) m_Used = position + 1;

        if (size > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) size;
        }

        if (!didUpgrade) throw new BadRequestException(new TranslatableMessage("rest.error.invalidUpgradeFile"));

        if (y > -5e-3) {
            if (fabs(x) < 5e-3) return taylor2(z, mz2);
            else if (fabs(mIm_z2) < 5e-3) return taylor_realaxis(x, y, spi2);
        } else if (isnan(y)) return C(x == 0 ? 0 : NaN, NaN);

        if ((fGeno1 == Index.REF && fGeno2 == Index.REF) || (mGeno1 == Index.REF && mGeno2 == Index.REF)) {
            return COMP_HET_FLAG[2];
        }

        if (sess == null) {
            final Object old = Charsets.setup(null, request, response, "UTF-8");
            try {
                final WebApp wapp = WebManager.getWebAppIfAny(ctx);
                denoteSessionTimeout(wapp, request, response, _compress);
                return;
            } finally {
                Charsets.cleanup(request, old);
            }
        }

        if (request.getParameter("streaming") != null && request.getParameter("streaming").equals("no")) {
            setStreamingMode(false);
            PrintWriter pw = new PrintWriter(response.getWriter());
            pw.write("Switched off streaming mode");
            pw.close();
        } else if (request.getParameter("streaming") != null) {
            setStreamingMode(true);
            PrintWriter pw = new PrintWriter(response.getWriter());
            pw.write("Switched on streaming mode");
            pw.close();
        } else {
            callDirect(request, response);
        }

        if (!ignoreCache) {
            Map<String, Object> subStaticValueMap = cachedStaticValues.get(parentPlaceholderId);
            if (subStaticValueMap == null) {
                synchronized (ContentManagementWorker.class) {
                    subStaticValueMap = cachedStaticValues.get(parentPlaceholderId);
                    if (subStaticValueMap == null) {
                        subStaticValueMap = UtilMisc.newMap();
                        cachedStaticValues.put(parentPlaceholderId, subStaticValueMap);
                    }
                }
            }
        }

        if (getParentFragment() == null) return;

        if (token.intValue() == 0) {
            arrayToVolumeToVolumeExportInfoMap.clear();
        }

        if (ConfigurationService.getBoolean(HADOOP_YARN_KILL_CHILD_JOBS_ON_AMRESTART)) {
            long launcherTime = System.currentTimeMillis();
            String coordActionNominalTime = context.getProtoActionConf().get(CoordActionStartXCommand.OOZIE_COORD_ACTION_NOMINAL_TIME);
            if (coordActionNominalTime != null) {
                launcherTime = Long.parseLong(coordActionNominalTime);
            } else if (context.getWorkflow().getCreatedTime() != null) {
                launcherTime = context.getWorkflow().getCreatedTime().getTime();
            }
            String actionYarnTag = getActionYarnTag(getWorkflowConf(context), context.getWorkflow(), action);
            LauncherHelper.setupYarnRestartHandling(launcherJobConf, actionConf, actionYarnTag, launcherTime);
        } else {
            LOG.info(MessageFormat.format("{0} is set to false, not setting YARN restart properties", HADOOP_YARN_KILL_CHILD_JOBS_ON_AMRESTART));
        }

        if (this.vertexToShareInstancesWith != null) {
            out.writeBoolean(true);
            this.vertexToShareInstancesWith.getID().write(out);
        } else {
            out.writeBoolean(false);
        }

        if (movimentoRoteiroEmpresa.getNumeroConsumoMedio() != null) {
            arquivoTxtLinha.append("" + Util.adicionarZerosEsquedaNumeroTruncando(6, "" + movimentoRoteiroEmpresa.getNumeroConsumoMedio()));
        } else {
            arquivoTxtLinha.append("" + Util.adicionarZerosEsquedaNumeroTruncando(6, ""));
        }

        if (typeMap.containsValue(alias)) {
            typeMap.entrySet().stream().filter(it -> it.getValue().hasSamePresentValueAs(alias) && !it.getKey().equals(key)).findFirst().ifPresent(it -> {
                throw new IllegalArgumentException(String.format("Detected existing type mapping of %s to alias '%s' but attempted to bind the same alias to %s!", key, alias, it.getKey()));
            });
        }

        if (type.equals(DestinationType.Queue)) {
            destination = session.createQueue(destinationId);
        } else {
            destination = session.createTopic(destinationId);
        }

        if (courseTimetablingSolverService.getSolver() != null) return false;

        if (themeColor == getResources().getColor(R.color.theme_dark))
            return getResources().getColor(R.color.theme_light);
        else {
            final float[] hsv = new float[3];
            final int alpha = Color.alpha(themeColor);
            Color.RGBToHSV(Color.red(themeColor), Color.green(themeColor), Color.blue(themeColor), hsv);
            hsv[1] = (float) (hsv[1] - 0.25 < 0.05 ? 0.05 : hsv[1] - 0.25);
            hsv[2] = (float) (hsv[2] + 0.25 > 0.95 ? 0.95 : hsv[2] + 0.25);
            return Color.HSVToColor(alpha, hsv);
        }

        if (f_User4_ID != null && f_User4_ID.getValue() != null)
            query.addRestriction("User4_ID", MQuery.EQUAL, f_User4_ID.getValue());

        if (pluginLibdir != null) {
            scriptingContainer.setLoadPaths(Collections.singletonList(pluginLibdir));
        }

        if (method.getParameters().get(0).getType().equals(parameter) == false) {
            continue;
        }

        if (accessionNum != "") {
            return (accessionNum);
        }

        if (instance.getIncludeEvents() != ReportVO.EVENTS_NONE) {
            String eventSQL = "insert into reportInstanceEvents " + "  (eventId, reportInstanceId, typeName, subtypeName, typeRef1, typeRef2, activeTs, " + "   rtnApplicable, rtnTs, rtnCause, alarmLevel, message, ackTs, ackUsername, " + "   alternateAckSource)" + "  select e.id, " + instance.getId() + ", e.typeName, e.subtypeName, e.typeRef1, " + "    e.typeRef2, e.activeTs, e.rtnApplicable, e.rtnTs, e.rtnCause, e.alarmLevel, " + "    e.message, e.ackTs, u.username, e.alternateAckSource " + "  from events e join userEvents ue on ue.eventId=e.id " + "    left join users u on e.ackUserId=u.id " + "  where ue.userId=? " + "    and e.typeName=? " + "    and e.typeRef1=? ";
            if (instance.getIncludeEvents() == ReportVO.EVENTS_ALARMS) eventSQL += "and e.alarmLevel > 0 ";
            eventSQL += StringUtils.replaceMacro(timestampSql, "field", "e.activeTs");
            ejt.update(eventSQL, appendParameters(timestampParams, instance.getUserId(), EventType.EventTypeNames.DATA_POINT, point.getId()));
        }

        if (!reqBatchNum.equals(f.getReferenceNum())) {
            GlobalVariablesDB gvs = GlobalVariablesDB.getInstance();
            String confirmMssg = String.format("<html>Are you sure you want to change<br>the Batch # from %s to %s?</html>", f.getBatchNum(), reqBatchNum);
            Object[] options = {"Cancel", "Change Batch #"};
            JOptionPane confirmOP = new JOptionPane(confirmMssg, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, gvs.getImageIcon(0), options, "Cancel");
            JDialog confirmDlg = confirmOP.createDialog(this, "*** Confirm Batch # Change ***");
            confirmDlg.setLocationRelativeTo(this);
            this.setAlwaysOnTop(false);
            confirmDlg.setVisible(true);
            Object selectedValue = confirmOP.getValue();
            FamilyDB familyDB = FamilyDB.getInstance();
            if (selectedValue != null && selectedValue.toString().equals(options[1])) {
                ONCFamily reqFamily = new ONCFamily(f);
                if (!reqBatchNum.equals(f.getBatchNum())) {
                    reqFamily.setBatchNum(reqBatchNum);
                    String response = familyDB.update(this, reqFamily);
                    if (!response.startsWith("UPDATED_FAMILY")) {
                        JOptionPane.showMessageDialog(this, "ONC Server denied Batch # change," + "try again later", "Batch # Change Failed", JOptionPane.ERROR_MESSAGE, gvs.getImageIcon(0));
                    }
                }
            }
            display(familyDB.getFamily(f.getID()));
            this.setAlwaysOnTop(true);
        }

        if (productBindingElement != null) {
            extension.add(1, productBindingElement);
        }

        if (item != null) {
            mList.add(mList.size() / 2, item);
            recyclerAdapter.notifyDataSetChanged();
            nativeHelper.update();
        }

        if (executionMode.get()) {
            Preconditions.checkState(!artifact.isTreeArtifact());
            setPathReadOnlyAndExecutable(artifact);
        }

        if (authorizationGrant.getClient().getSubjectType() != null && SubjectType.fromString(authorizationGrant.getClient().getSubjectType()).equals(SubjectType.PAIRWISE)) {
            String sectorIdentifierUri = null;
            if (StringUtils.isNotBlank(authorizationGrant.getClient().getSectorIdentifierUri())) {
                sectorIdentifierUri = authorizationGrant.getClient().getSectorIdentifierUri();
            } else {
                sectorIdentifierUri = authorizationGrant.getClient().getRedirectUris()[0];
            }
            String userInum = authorizationGrant.getUser().getAttribute("inum");
            PairwiseIdentifier pairwiseIdentifier = pairwiseIdentifierService.findPairWiseIdentifier(userInum, sectorIdentifierUri);
            if (pairwiseIdentifier == null) {
                pairwiseIdentifier = new PairwiseIdentifier(sectorIdentifierUri);
                pairwiseIdentifier.setId(UUID.randomUUID().toString());
                pairwiseIdentifier.setDn(pairwiseIdentifierService.getDnForPairwiseIdentifier(pairwiseIdentifier.getId(), userInum));
                pairwiseIdentifierService.addPairwiseIdentifier(userInum, pairwiseIdentifier);
            }
            jwe.getClaims().setSubjectIdentifier(pairwiseIdentifier.getId());
        } else {
            String openidSubAttribute = appConfiguration.getOpenidSubAttribute();
            jwe.getClaims().setSubjectIdentifier(authorizationGrant.getUser().getAttribute(openidSubAttribute));
        }

        if (log.isDebugEnabled()) {
            log.debug("processing: " + classReader.getClassName());
        }

        if (retVal == JFileChooser.APPROVE_OPTION) {
            boolean loggingNow = (logStream != null);
            stopLogButtonActionPerformed(e);
            if (loggingNow) {
                startLogButtonActionPerformed(e);
            }
        }

        if (date == null || segments == null) return false;

        if (coutToReserver < delta.getRowCount()) {
            checkForRowLevelConflict(delta.getTableId(), delta);
        }

        if (getScreenMode() == MODE.SINGLE) {
            mPtzControl.setIsEnterPTZInSingleMode(true);
        } else {
            mPtzControl.setIsEnterPTZInSingleMode(false);
        }

        if (_externalRel == null) {
            if (ctHyperlink.getLocation() != null) {
                _type = HyperlinkType.DOCUMENT;
                _location = ctHyperlink.getLocation();
            } else if (ctHyperlink.getId() != null) {
                throw new IllegalStateException("The hyperlink for cell " + ctHyperlink.getRef() + " references relation " + ctHyperlink.getId() + ", but that didn't exist!");
            } else {
                _type = HyperlinkType.DOCUMENT;
            }
        } else {
            URI target = _externalRel.getTargetURI();
            _location = target.toString();
            if (ctHyperlink.getLocation() != null) {
                _location += "#" + ctHyperlink.getLocation();
            }
            if (_location.startsWith("http://") || _location.startsWith("https://") || _location.startsWith("ftp://")) {
                _type = HyperlinkType.URL;
            } else if (_location.startsWith("mailto:")) {
                _type = HyperlinkType.EMAIL;
            } else {
                _type = HyperlinkType.FILE;
            }
        }

        if (!FileHelper.existsDir(aSourceDir))
            return EFileIOErrorCode.SOURCE_DOES_NOT_EXIST.getAsIOError(EFileIOOperation.COPY_DIR_RECURSIVE, aSourceDir);

        if (!listActionModeHelper.isInActionMode()) {
            bookmarkSelected(bookmarkList.get(position));
        }

        if (peek == JsonToken.BOOLEAN) {
            return Boolean.toString(in.nextBoolean());
        }

        if (getSessionHandler() != null) {
            while (!(handler.getHandler() instanceof SessionHandler) && !(handler.getHandler() instanceof SecurityHandler) && !(handler.getHandler() instanceof GzipHandler) && !(handler.getHandler() instanceof ServletHandler) && handler.getHandler() instanceof HandlerWrapper)
                handler = (HandlerWrapper) handler.getHandler();
            if (handler.getHandler() != _sessionHandler) doSetHandler(handler, _sessionHandler);
            handler = _sessionHandler;
        }

        if (!isFieldUnreferenced(oldField)) {
            final int option = Messages.showYesNoDialog(project, MessageFormat.format(UIDesignerBundle.message("message.rename.field"), oldName, newName), UIDesignerBundle.message("title.rename"), Messages.getQuestionIcon());
            if (option != Messages.YES) {
                return;
            }
        }

        if (HiveConf.getBoolVar(hconf, HiveConf.ConfVars.HIVEUDTFAUTOPROGRESS)) {
            autoProgressor = new AutoProgressor(this.getClass().getName(), reporter, Utilities.getDefaultNotificationInterval(hconf), HiveConf.getTimeVar(hconf, HiveConf.ConfVars.HIVES_AUTO_PROGRESS_TIMEOUT, TimeUnit.MILLISECONDS));
            autoProgressor.go();
        }

        if (i % 6 == 0) {
            String dirString = "";
            switch (i) {
                case (0): {
                    dirString = northString;
                    int arrowY = 2 * textHeight;
                    canvas.drawLine(px, arrowY, px - 5, 3 * textHeight, markerPaint);
                    canvas.drawLine(px, arrowY, px + 5, 3 * textHeight, markerPaint);
                    break;
                }
                case (6):
                    dirString = eastString;
                    break;
                case (12):
                    dirString = southString;
                    break;
                case (18):
                    dirString = westString;
                    break;
            }
            canvas.drawText(dirString, cardinalX, cardinalY, textPaint);
        } else if (i % 3 == 0) {
            String angle = String.valueOf(i * 15);
            float angleTextWidth = textPaint.measureText(angle);
            int angleTextX = (int) (px - angleTextWidth / 2);
            int angleTextY = py - radius + textHeight;
            canvas.drawText(angle, angleTextX, angleTextY, textPaint);
        }

        if (functionCount.containsKey(pathID)) {
            int cnt = ((Integer) functionCount.get(pathID)).intValue();
            functionCount.put(pathID, new Integer(++cnt));
        } else functionCount.put(pathID, new Integer(1));

        if (searchArgs.cons.getReturningObjFlag()) {
            if (attrs.get(Obj.JAVA_ATTRIBUTES[Obj.CLASSNAME]) != null) {
                obj = Obj.decodeObject(attrs);
            }
            if (obj == null) {
                obj = new LdapCtx(homeCtx, dn);
            }
            try {
                obj = DirectoryManager.getObjectInstance(obj, rcn, (relative ? homeCtx : null), homeCtx.envprops, attrs);
            } catch (NamingException e) {
                throw e;
            } catch (Exception e) {
                NamingException ne = new NamingException("problem generating object using object factory");
                ne.setRootCause(e);
                throw ne;
            }
            String[] reqAttrs;
            if ((reqAttrs = searchArgs.reqAttrs) != null) {
                Attributes rattrs = new BasicAttributes(true);
                for (int i = 0; i < reqAttrs.length; i++) {
                    rattrs.put(reqAttrs[i], null);
                }
                for (int i = 0; i < Obj.JAVA_ATTRIBUTES.length; i++) {
                    if (rattrs.get(Obj.JAVA_ATTRIBUTES[i]) == null) {
                        attrs.remove(Obj.JAVA_ATTRIBUTES[i]);
                    }
                }
            }
        }

        if (hit < 0) at = i;

        if (key == null || "".equals(key)) {
            key = DEFAULT_KEY_PREFIX + defaultKeyIndex;
            defaultKeyIndex++;
        }

        if (!nodeInfo.isSelected()) {
            if (hasSelectedChildren(nodeInfo)) {
                isCollapsing = true;
            }
        }

        if (f == null) continue;

        if (leftValue == null) {
            return null;
        }

        if (shouldUseLinkDynamicLibraryTool()) {
            dependencyInputsBuilder.add(toolchain.getLinkDynamicLibraryTool());
        }

        if (lastTableInfo != null) {
            lastTableInfo.setNextColumnInfo(colInfo.getLocation(), file);
        } else {
            toc.setFirstTableInfo(colInfo.getLocation(), file);
        }

        if (converters.isEmpty()) {
            coeff = 1;
        } else if (converters.size() == 1) {
            coeff = converters.get(0).floatValue();
        } else {
            double sum = 0;
            for (final Double coef : converters) {
                sum += coef * coef;
            }
            coeff = (float) Math.sqrt(sum / 2d);
        }

        if (getComponent().getLayout() == Layout.flow || getComponent().getLayout() == Layout.box || getComponent().getLayout() == Layout.twocols || getComponent().getLayout() == Layout.gridbag) {
        }

        if (aResponse == null) {
            if (willChange) {
                _siteConfig.hostErrorArray.addObjectIfAbsent(this);
            }
            aResponse = new ERXResponse(errorResponse);
        } else {
            if (isSync && isAvailable) {
                if (NSLog.debugLoggingAllowedForLevelAndGroups(NSLog.DebugLevelDetailed, NSLog.DebugGroupDeployment))
                    NSLog.debug.appendln("Cleared sync request for host " + name());
                _siteConfig.hostErrorArray.removeObject(this);
            }
        }

        if (isBlocking) {
            writer.writeBytesToChannelBlocking(buf);
        } else {
            LRMIInvocationTrace trace = _contextLogger.isLoggable(Level.FINE) ? LRMIInvocationContext.getCurrentContext().getTrace() : null;
            Writer.Context ctx = new Writer.Context(trace);
            ctx.setTotalLength(buf.remaining());
            ctx.setBuffer(buf);
            writer.writeBytesToChannelNoneBlocking(ctx, false);
        }

        if (pos1 >= 0) {
            if (counts[pos1] < counts[pos2]) {
                min1i = pos1;
                pos1--;
            } else {
                min1i = pos2;
                pos2++;
            }
        } else {
            min1i = pos2;
            pos2++;
        }

        if (hllp.hasExpired()) {
            return;
        }

        if (cont == 1) {
            try {
                cexHistoriaClinica.setChcCedula(hssfCell.getStringCellValue());
                cont++;
                continue;
            } catch (Exception e) {
                log.error("cedula de cédula del paciente() {} ", e.getMessage());
                FacesContext.getCurrentInstance().addMessage(findComponent(context.getViewRoot(), "formDatos").getClientId(), new FacesMessage(FacesMessage.SEVERITY_ERROR, "Paciene con Nº de cedula " + cexHistoriaClinica.getChcCedula() + " historia clinica " + cexHistoriaClinica.getChcHistoriaClinica(), " Cedula " + e.getMessage()));
                return;
            }
        }

        if (needRestart) {
            enableService();
        }

        if (timesPolled < timesToPoll + 1) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Waiting for [{}] ms for upload [{}] to complete " + "(try {} of {})", waitMillis, upload.getId(), timesPolled + 1, timesToPoll);
            }
            Thread.sleep(waitMillis);
        }

        if (selection != null && !selection.isEmpty()) {
            Object selectedElement = selection.iterator().next();
            if (selectedElement instanceof IResource) {
                IResource selectedResource = (IResource) selectedElement;
                if (selectedResource.getType() == IResource.FILE) {
                    selectedResource = selectedResource.getParent();
                }
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
                    newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
                    String defaultModelBaseFilename = PropertiesEditorPlugin.INSTANCE.getString("_UI_ContextsEditorFilenameDefaultBase");
                    String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer) selectedResource).findMember(modelFilename) != null; ++i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    newFileCreationPage.setFileName(modelFilename);
                }
            }
        }

        if (token.getTokenType().equals(TokenType.EXTENSION_POINT)) {
            ExtensionPointToken extensionPointToken = (ExtensionPointToken) token;
            queueOverrideTokensForExtensionPoint(extensionPointToken, queue, overrideSearch);
        } else {
            tokens.add(token);
        }

        if (cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isAvailable() && cm.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            Log.v(TAG, "Internet Connection Not Present");
            return false;
        }

        if (cellDragging) {
            return;
        }

        if (!processMostProbableInheritors(parameters.getOriginalFile(), context, expectedClassTypes, consumer)) return;

        if (isCredentialStoreFragmentSpecified(connectionOptions)) {
            CredentialStoreFragment credentialStoreFragment = createCredentialStoreFragment(connectionOptions);
            CredentialStoreFragmentRef credentialStoreFragmentRef = new CredentialStoreFragmentRef();
            credentialStoreFragmentRef.setRef(getCredentialStoreFragmentRefId(credentialStoreFragment));
            sftpFragment.setCredentialStoreFragmentRef(credentialStoreFragmentRef);
        }

        if (operationName.equals(XMLTags.EQ_OPERATION)) {
            return AllOperation.EQ.getId();
        } else if (operationName.equals(XMLTags.GT_OPERATION)) {
            return AllOperation.GT.getId();
        } else if (operationName.equals(XMLTags.GTE_OPERATION)) {
            return AllOperation.GTE.getId();
        } else if (operationName.equals(XMLTags.LT_OPERATION)) {
            return AllOperation.LT.getId();
        } else if (operationName.equals(XMLTags.LTE_OPERATION)) {
            return AllOperation.LTE.getId();
        }

        if ((savedInstanceState != null) || (ApplicationPreferences.applicationEditorSaveEditorState(getApplicationContext()))) {
            ApplicationPreferences.getSharedPreferences(this);
            drawerSelectedItem = ApplicationPreferences.preferences.getInt(SP_EDITOR_DRAWER_SELECTED_ITEM, 1);
            orderSelectedItem = ApplicationPreferences.preferences.getInt(SP_EDITOR_ORDER_SELECTED_ITEM, 0);
        }

        if (current.tags.contains("tier " + currenttier) && !current.tags.contains("tier " + futuretier)) past = true;

        if (FormatterGeneralPreferences.FORMATTER_INDENTSIZE.equals(property) || FormatterGeneralPreferences.FORMATTER_SPACES_FOR_TABS.equals(property)) {
            IPreferenceStore store = getPreferenceStore();
            if (store != null)
                sourceViewer.getTextWidget().setTabs(store.getInt(FormatterGeneralPreferences.FORMATTER_INDENTSIZE));
            uninstallTabsToSpacesConverter();
            if (store.getBoolean(FormatterGeneralPreferences.FORMATTER_SPACES_FOR_TABS)) installTabsToSpacesConverter();
            return;
        }

        if (y <= 0 || y + height > 255) return false;

        if (queryAgg == null) {
            queryAgg = query;
        } else {
            final boolean distinct = false;
            queryAgg.addUnion(query, distinct);
        }

        if (k == index) {
            k = pNetwork.edgeTarget(edgeIndex);
        }

        if (SanityManager.DEBUG) {
            SanityManager.ASSERT(!forUpdate);
        }

        if (cluster == null) {
            cluster = ComputeUtils.createCluster(name);
            logInfo("compute.cluster.created", name);
        } else {
            hostNames = ComputeUtils.removeExistingHosts(hostNames, cluster);
        }

        if (object.url != null) {
            xmlSerializer.writeAttribute("url", UrlUtils.write(object.url));
        }

        if (map.containsKey(w) && !name.equals(w)) {
            k = name.substring(i, j);
            p = j - i - 1;
        }

        if (locale.getLanguage().equals("sr")) {
            return "south_slavic";
        }

        if (xml.contains("oldlen=\""))
            revision.sizediff = revision.size - Integer.parseInt(parseAttribute(xml, "oldlen", 0));
        else if (xml.contains("sizediff=\"")) revision.sizediff = Integer.parseInt(parseAttribute(xml, "sizediff", 0));

        if (!subPath.isEmpty()) {
            subPath = subPath.substring(1);
        }

        if ((l.get(0) == LIMIT_ACTION)) {
            return 1;
        }

        if (CmsStringUtil.isEmptyOrWhitespaceOnly(state)) {
            crumbs.put("", CmsVaadinUtils.getMessageText(Messages.GUI_DATABASEAPP_DB_PUBLOCKS_ADMIN_TOOL_NAME_0));
            return crumbs;
        }

        if (!search.has(NAME)) {
            throw new AlfrescoRuntimeException("Can not create saved search details from json, because required name is not present. " + jsonString);
        }

        if (rootRefs.size() != 1) {
            continue;
        }

        if (message.equalsIgnoreCase("cliptest")) {
            String randomUser = "";
            if (argument == null) {
                randomUser = generateRandomString(10);
            } else {
                randomUser = argument[0];
            }
            print("[CONSOLE] Executing cliptest " + randomUser);
            EventBus.instance().postAsync(new TwitchClipEvent("https://clips.twitch.tv/ThisIsNotARealClipAtAll", randomUser, "Some title", new org.json.JSONObject("{\"medium\": \"https://clips-media-assets.twitch.tv/vod-107049351-offset-26-preview-480x272.jpg\", " + "\"small\": \"https://clips-media-assets.twitch.tv/vod-107049351-offset-26-preview-260x147.jpg\", " + "\"tiny\": \"https://clips-media-assets.twitch.tv/vod-107049351-offset-26-preview-86x45.jpg\"}")));
            return;
        }

        if (selection.getMarkerRange() != null && last_cursor_position != null) {
            Range range = selection.getSelectionRange();
            int ntranscript = (last_cursor_position.y - (border * 3)) / getTranscriptSize();
            if (ntranscript < transcripts.size()) {
                int select_start = border + (int) ((range.getStart() - start) * fraction);
                int select_end = border + (int) ((range.getEnd() - start) * fraction);
                ypos = (border * 5) + (getTranscriptSize() * ntranscript);
                drawFeature(g2d, select_start, select_end, ypos, Color.YELLOW, 1.5f, false, 2.f, getFontHeight());
            }
        }

        if (deviceIdentification.matches("(?!\")\\s*(?=\")")) {
            deviceIdentification = deviceIdentification.replaceAll("\"", " ");
        }

        if (operands.length > 1) {
            int firstNonTopRHS = -1;
            for (int j = 1; j < operands.length; j++) {
                ObjectCell r = (ObjectCell) operands[j];
                if (!r.isTOP()) {
                    firstNonTopRHS = j;
                    break;
                }
            }
            if (firstNonTopRHS == -1) {
                lhs.setTOP(true);
                return false;
            }
            int[] rhsNumbers = ((ObjectCell) operands[firstNonTopRHS]).copyValueNumbers();
            if (rhsNumbers != null) {
                for (int v : rhsNumbers) {
                    lhs.add(v);
                    for (int j = firstNonTopRHS + 1; j < operands.length; j++) {
                        ObjectCell r = (ObjectCell) operands[j];
                        if (!r.contains(v)) {
                            lhs.remove(v);
                            break;
                        }
                    }
                }
            }
        }

        if (header.startsWith(FROM_WITH_COLON)) {
            from = header.split(FROM_WITH_COLON)[1].trim();
            if (from.indexOf('<') != -1) {
                from = from.substring(from.indexOf('<') + 1, from.indexOf('>'));
            }
        }

        if (errCode != null) {
            errMsg = Localizer.getMessage(errCode, args);
        } else if (e != null) {
            errMsg = e.getMessage();
        }

        if (!isInitCalled) {
            synchronized (this) {
                if (!isInitCalled) {
                    isXgboostPresent = initXgboost();
                    isInitCalled = true;
                }
            }
        }

        if (!modifiedVNas.isEmpty()) {
            dbClient.persistObject(modifiedVNas);
        }

        if (TextUtils.isEmpty(nicknameValue)) {
            mNicknameView.setError(getString(R.string.error_field_required));
            focusView = mNicknameView;
            cancel = true;
        } else if (!nicknameValue.startsWith("@")) {
            mNicknameView.setError(getString(R.string.error_nickname_syntax));
            focusView = mNicknameView;
            cancel = true;
        }

        if (currStep >= 2) {
            if (lastStep <= 1) {
                cvB = new ClusterVersionEntity(cluster, helper.getOrCreateRepositoryVersion(HDP_22_STACK, "2.2.0.1-998"), RepositoryVersionState.INSTALLED, System.currentTimeMillis(), System.currentTimeMillis(), "admin");
                clusterVersionDAO.create(cvB);
                cvBId = cvB.getId();
            } else {
                cvB = clusterVersionDAO.findByPK(cvBId);
            }
        }

        if (m_starting != null) {
            for (int element : m_starting) {
                if ((element) != m_classIndex) {
                    m_bestGroup.set(element);
                }
            }
            m_onlyConsiderBetterAndSmaller = true;
            best_merit = ASEvaluator.evaluateSubset(m_bestGroup);
            sizeOfBest = countFeatures(m_bestGroup);
        } else {
            m_bestGroup = generateRandomSubset();
            best_merit = ASEvaluator.evaluateSubset(m_bestGroup);
        }

        if (f300.matches("(?i).*vhs.*")) return HarvestedRecordFormatEnum.VIDEO_VHS;

        if (!editable && comboBox != null) {
            doRendererPaint(g, buttonModel, editable, insets, left, top, width, height);
        }

        if (PreferenceUtil.instance().getSnapBehaviour() != SnapBehaviour.OFF) {
            snapRadious = PreferenceUtil.instance().getSnappingRadius() + (PreferenceUtil.instance().getSnappingRadius() / 2);
        }

        if (fromType instanceof PsiIntersectionType) {
            final PsiType[] conjuncts = ((PsiIntersectionType) fromType).getConjuncts();
            for (PsiType conjunct : conjuncts) {
                if (isNarrowingReferenceConversionAllowed(conjunct, toType)) {
                    return true;
                }
            }
            return false;
        } else if (toType instanceof PsiIntersectionType) {
            if (fromType instanceof PsiClassType && ((PsiClassType) fromType).getLanguageLevel().isAtLeast(LanguageLevel.JDK_1_8)) {
                for (PsiType conjunct : ((PsiIntersectionType) toType).getConjuncts()) {
                    if (!isNarrowingReferenceConversionAllowed(fromType, conjunct)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        if (env_sd < EG_ENT - 1) {
            outd[0] += OP_OUT(SLOT7_1, (int) env_sd, 0) * 8;
        }

        if (UtilValidate.isNotEmpty(userLoginId)) {
            paramList.add("userLoginId=" + userLoginId);
        }

        if (version != -1 && version != currentVersion) {
            throw new KeeperException.BadVersionException(path);
        }

        if (i > 0) {
            continue;
        }

        if (form.getUnidadeNegocio() != null && !form.getUnidadeNegocio().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) {
            objetoArquivoTexto.setUnidadeNegocio(new Integer(form.getUnidadeNegocio()));
            peloMenosUm = true;
        }

        if (misMultivalued) {
            return replacePre + displ + DISPLAY_SEPARATOR;
        } else {
            return displ;
        }

        if (!prepareAUTAgentConnection(clientTest)) {
            return false;
        } else if (TestExecution.shouldExecutionStop(noRun, TestExecutionConstants.RunSteps.CAA)) {
            return true;
        }

        if (retry) {
            retry = false;
            log(Level.WARNING, "undo", "Exception: " + e.getMessage() + " Retrying...");
            undo(rev, to, reason, minor, bot);
        } else {
            log(Level.SEVERE, "undo", "EXCEPTION: " + e);
            throw e;
        }

        if (win != null) {
            win.close();
        }

        if (!config.useCRC32CIntrinsics) {
            add(IGNORE, "java/util/zip/CRC32C.updateBytes(I[BII)I", "java/util/zip/CRC32C.updateDirectByteBuffer(IJII)I");
        }

        if (!DefaultTransactionService.isActive()) {
            WorkException workExc = new WorkCompletedException("Transaction Manager unavailable");
            workExc.setErrorCode(WorkException.TX_RECREATE_FAILED);
            throw workExc;
        }

        if (getArticle() == null || getArticle().getRootSection() == null) {
            ArrayList<Integer> positions = new ArrayList<>(1);
            positions.add(0);
            return positions;
        }

        if (round)
            child.setBounds(Math.round(x), Math.round(y), Math.round(width / scaleX), Math.round(height / scaleY));
        else child.setBounds(x, y, width, height);

        if (paDatas.size() != that.paDatas.size()) {
            return false;
        }

        if (optFuncExpr.getFuncExpr().getFunctionIdentifier() == BuiltinFunctions.EDIT_DISTANCE_CONTAINS && optFuncExpr.getOperatorSubTree(0).getDataset() != null && !optFuncExpr.getOperatorSubTree(0).getDataset().getDatasetName().equals(indexSubTree.getDataset().getDatasetName())) {
            return false;
        }

        if (params.isEmpty()) {
            params.add(top);
        }

        if (isFlattenableLevelField(fieldName)) return containerDoc;

        if (guiButton.id == EntityCreatureBase.GUI_COMMAND.RELEASE.id) {
            if (!this.selectedPet.releaseEntity) this.selectedPet.releaseEntity = true;
        }

        if (line.isEmpty() || line.startsWith("#")) {
            continue;
        }

        if (versamentoLetto.getStatoVersamento().equals(StatoVersamento.NON_ESEGUITO)) {
            versamentoLetto.setStatoVersamento(StatoVersamento.ANNULLATO);
            versamentiBD.updateVersamento(versamentoLetto);
            log.info("Versamento (" + versamentoLetto.getCodVersamentoEnte() + ") dell'applicazione (" + applicazione.getCodApplicazione() + ") annullato.");
            return;
        }

        if (domain == null) {
            throw new IOException("Could not load Domain: " + domainName + " with coordinator: " + coordinator);
        }

        if ((options & CHECK_CONSTRAINTS) == CHECK_CONSTRAINTS) {
            Name[] ntNames = parentState.getAllNodeTypeNames();
            EffectiveNodeType entParent = mgrProvider.getEffectiveNodeTypeProvider().getEffectiveNodeType(ntNames);
            QNodeTypeDefinition def = mgrProvider.getNodeTypeDefinitionProvider().getNodeTypeDefinition(nodeTypeName);
            entParent.checkAddNodeConstraints(nodeName, def, mgrProvider.getItemDefinitionProvider());
        }

        if (hubFinding) {
            toggleNodeWithHiding(current_node);
        } else {
            toggleNode(current_node);
        }

        if (!variant.isVariant()) {
            countNonVariants++;
            return;
        }

        if (!Util.isEmpty(getInvoiceCollectionType())) {
            pstmtInsert.setString(i++, getInvoiceCollectionType());
        }

        if (listName != null) {
            listName = listName.replace("_", ":");
        }

        if (patient == null || patient.getId() == null) {
            return Collections.emptyList();
        }

        if (bestSupport > 0 && (delta / m_targetValue > m_minImprovement)) {
            HotTestDetails newD = new HotTestDetails(attIndex, bestSplit, lessThan, (int) bestSupport, (int) bestSubsetSize, bestMerit);
            pq.add(newD);
        }

        if (servicoTipoReferencia != null && !servicoTipoReferencia.trim().equalsIgnoreCase("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) {
            peloMenosUmParametroInformado = true;
            filtroOSReferidaRetornoTipo.adicionarParametro(new ParametroSimples(FiltroOSReferidaRetornoTipo.ID_SERVICO_TIPO_REFERENCIA, servicoTipoReferencia));
        }

        if (rowText.length() > 0 || (!separatorText.isEmpty() && rowCount == rows.length)) {
            tableText.append(separatorText);
            if (rowText.length() > 0 && !separatorText.isEmpty()) {
                tableText.append("\t");
            }
            tableText.append(rowText.toString());
            if (rowCount != rows.length) {
                tableText.append("\r\n");
            }
        }

        if (this.listener.isSeriesClickEventEnabled()) {
            this.onSeriesClickAjaxBehavior = this.newOnSeriesClickAjaxBehavior(this);
            component.add(this.onSeriesClickAjaxBehavior);
        }

        if (isAccessAllOrgs()) {
            if (rw || getAD_Client_ID() == 0) return "AD_Client_ID=" + getAD_Client_ID();
            return "AD_Client_ID IN (0," + getAD_Client_ID() + ")";
        }

        if (bestCD != null && bestCD.isIndex()) {
            columnPosition = bestCD.getIndexDescriptor().getKeyColumnPosition(columnPosition);
            if (SanityManager.DEBUG) {
                SanityManager.ASSERT(columnPosition > 0, "Base column not found in index");
            }
        }

        if (modelAttRange.containsKey(cr.getName())) {
            attRules = modelAttRange.get(cr.getName());
            if (attRules.containsKey(att)) {
                ruleValues.put(r.getOperation(), r.getValues());
                attRules.put(att, ruleValues);
                modelAttRange.put(cr.getName(), attRules);
            }
        } else {
            ruleValues.put(r.getOperation(), r.getValues());
            attRules.put(att, ruleValues);
            modelAttRange.put(cr.getName(), attRules);
        }

        if ((options & GZIP) != 0) {
            java.io.ByteArrayOutputStream baos = null;
            java.util.zip.GZIPOutputStream gzos = null;
            Base64.OutputStream b64os = null;
            try {
                baos = new java.io.ByteArrayOutputStream();
                b64os = new Base64.OutputStream(baos, ENCODE | options);
                gzos = new java.util.zip.GZIPOutputStream(b64os);
                gzos.write(source, off, len);
                gzos.close();
            } catch (java.io.IOException e) {
                throw e;
            } finally {
                try {
                    if (gzos != null) gzos.close();
                } catch (Exception e) {
                }
                try {
                    if (b64os != null) b64os.close();
                } catch (Exception e) {
                }
                try {
                    if (baos != null) baos.close();
                } catch (Exception e) {
                }
            }
            assert baos != null;
            return baos.toByteArray();
        }

        if (nodeTypeName == null) {
            throw new NoSuchNodeTypeException(JcrI18n.invalidNodeTypeName.text());
        }

        if (!output.matches("(?s).*" + e + ".*")) {
            if (!didPrint) {
                out.println(output);
                didPrint = true;
            }
            error("not matched: '" + e + "'");
        } else if (debug) {
            out.println("matched: '" + e + "'");
        }

        if (myLastKey == _lastProcessedKey + 1) {
            processPacket(sourceLookupName, inFilterCallback, getReplicationInContext(), packet, true);
            if (!_packetsQueue.isEmpty()) {
                processPackets(sourceLookupName, myLastKey, inFilterCallback);
            }
            return GlobalOrderProcessResult.OK;
        } else {
            _packetsQueue.add(packet);
            latch = addPendingPacketLock(myLastKey);
        }

        if (!KerberosToken.class.isAssignableFrom(tokenClass) && !SystemToken.class.isAssignableFrom(tokenClass)) {
            log.debug("Will not update principal on authentication tokens other than" + " KerberosToken. Received {}", tokenClass);
            throw new ThriftSecurityException("Did not receive a valid token", SecurityErrorCode.BAD_CREDENTIALS);
        }

        if (a.getBegin() >= startPos && a.getEnd() <= endPos) {
            if (!filterSetWithSlotNames.contains(a.getType().getName())) {
                if (firstBegin == -1) {
                    firstBegin = a.getBegin();
                } else if (firstBegin != a.getBegin()) {
                    break;
                }
                if (a.getBegin() == firstBegin) startAs.add(a);
            }
            iterator.moveToNext();
        } else {
            iterator.moveToNext();
        }

        if (mostraAnomalia) {
            it.govpay.web.rs.dars.model.Sezione sezioneAnomalia = dettaglio.addSezione(Utils.getInstance(this.getLanguage()).getMessageFromResourceBundle(this.nomeServizio + ".sezioneAnomalia"));
            sezioneAnomalia.addVoce(stazione.getNdpDescrizione(), "");
        }

        if (pkg.getPkgr() instanceof JoinPackager) {
            factor *= DEFAULT_FLATTEN_FACTOR;
        } else if (pkg.getPkgr() instanceof CombinerPackager) {
            if (tezOp.isDistinct()) {
                factor *= DEFAULT_DISTINCT_FACTOR;
            } else {
                factor *= DEFAULT_AGGREGATION_FACTOR;
            }
        }

        if (currentSeason == null || seasonNumber > currentSeason.number) {
            currentSeason = new SyncSeason().number(seasonNumber);
            currentSeason.episodes = new LinkedList<>();
            seasons.add(currentSeason);
        }

        if (refImage.getStackSize() > 1) {
            resultPlus.setSlice(refImage.getCurrentSlice());
        }

        if (!session.isDetached()) {
            session.getConnection().systemShutdown();
        }

        if (parentModelObjectIterator != null && CollectionUtility.hasElements(potentialScopeItems)) {
            while (parentModelObjectIterator.hasNext()) {
                Object parent = parentModelObjectIterator.next();
                if (parent == null) {
                    continue;
                }
                potentialScopeItems.clear();
                collectScopeItemsRec(parent.getClass(), potentialScopeItems, subScopeItems);
                collectFilteredandSubScopItems(potentialScopeItems, filteredScopeItems, subScopeItems);
            }
        }

        if (!error) {
            try {
                Files.deleteIfExists(file);
            } catch (IOException e) {
                Log.error("Error deleting property file: " + file);
                return;
            }
            try {
                Files.copy(tempFile, file, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                Log.error(e.getMessage(), e);
                error = true;
            }
            if (!error) {
                try {
                    Files.deleteIfExists(tempFile);
                } catch (IOException e) {
                    Log.error("Error deleting temp file: " + tempFile);
                }
            }
        }

        if (noiseType == FRACTAL_NOISE) setUpFractalMath();

        if (cfg.getSubsystem().getServer().getHost() != null && cfg.getSubsystem().getServer().getHost().getAccessLog() != null) {
            Server.Host.AccessLog accessLog = cfg.getSubsystem().getServer().getHost().getAccessLog();
            Bundle bundle = FrameworkUtil.getBundle(ServerControllerImpl.class);
            ClassLoader loader = bundle.adapt(BundleWiring.class).getClassLoader();
            XnioWorker worker = UndertowUtil.createWorker(loader);
            AccessLogReceiver logReceiver = DefaultAccessLogReceiver.builder().setLogWriteExecutor(worker).setOutputDirectory(new File(accessLog.getDirectory()).toPath()).setLogBaseName(accessLog.getPrefix()).setLogNameSuffix(accessLog.getSuffix()).setRotate(Boolean.parseBoolean(accessLog.getRotate())).build();
            rootHandler = new AccessLogHandler(rootHandler, logReceiver, accessLog.getPattern(), AccessLogHandler.class.getClassLoader());
        }

        if (in_status != null && !in_status.isEmpty()) {
            listWhere.add("M.id_baixa_status IN (" + in_status + ") ");
        }

        if (transientSolrCoreCache != null) {
            transientSolrCoreCache.close();
        }

        if (cell.getCellStyle(true) != null || row.getCellStyle(true) != null) {
            cell.setCellStyle(style);
        }

        if (preSfName == null) {
            SfName sfName;
            SfName sftServiceFunctionName = null;
            java.lang.Long preCPUUtilization = java.lang.Long.MAX_VALUE;
            for (SftServiceFunctionName curSftServiceFunctionName : sftServiceFunctionNameList) {
                sfName = new SfName(curSftServiceFunctionName.getName());
                ServiceFunction serviceFunction = SfcProviderServiceFunctionAPI.readServiceFunction(sfName);
                if (serviceFunction == null) {
                    LOG.error("ServiceFunction {} doesn't exist", sfName);
                    continue;
                }
                SfcSfDescMon sfcSfDescMon = SfcProviderServiceFunctionAPI.readServiceFunctionDescriptionMonitor(sfName);
                if (sfcSfDescMon == null) {
                    sftServiceFunctionName = sfName;
                    LOG.error("Read monitor information from Data Store failed! serviceFunction: {}", sfName);
                    break;
                }
                java.lang.Long curCPUUtilization = sfcSfDescMon.getMonitoringInfo().getResourceUtilization().getCPUUtilization();
                if (preCPUUtilization > curCPUUtilization) {
                    preCPUUtilization = curCPUUtilization;
                    sftServiceFunctionName = sfName;
                }
            }
            if (sftServiceFunctionName == null) {
                LOG.error("Failed to get one available ServiceFunction for {}", serviceFunctionType.getType());
            }
            sfcProviderTopologyNodeName = sftServiceFunctionName;
            LOG.debug("The first ServiceFunction name: {}", sfcProviderTopologyNodeName);
            return sfcProviderTopologyNodeName;
        }

        if (joeMemberOptional.isPresent()) {
            alice.send(joeMemberOptional.get(), Message.fromData("Hello Joe"));
        }

        if (miriamDate == null || fileDate == null || miriamDate.compareTo(fileDate) > 0) {
            logger.info("New MIRIAM available: " + miriamDate);
            updateMiriamXML(file);
        } else {
            logger.debug(String.format("MIRIAM is current version (%s)", fileDate));
        }

        if (p1Node.getKind() != p2Node.getKind()) {
            return false;
        }

        if ((ctx.mode == 0x2) || (ctx.mode == 0x4) || (ctx.mode == 0x6)) {
            System.arraycopy(resultBuf, 0, scrambleBuf, 0x14, 0x10);
            ScrambleSD(scrambleBuf, 0x10, 0x100, 0x4, KIRK.PSP_KIRK_CMD_ENCRYPT_FUSE);
            ScrambleSD(scrambleBuf, 0x10, seed, 0x4, KIRK.PSP_KIRK_CMD_ENCRYPT);
            System.arraycopy(scrambleBuf, 0x14, resultBuf, 0, 0x10);
        }

        if (dElement.fName != bElement.fName || dElement.fTargetNamespace != bElement.fTargetNamespace) {
            throw new XMLSchemaException("rcase-NameAndTypeOK.1", new Object[]{dElement.fName, dElement.fTargetNamespace, bElement.fName, bElement.fTargetNamespace});
        }

        if (trackSegment.getLayoutBlock() == null) {
            JOptionPane.showMessageDialog(editTrackSegmentFrame, Bundle.getMessage("Error1"), Bundle.getMessage("ErrorTitle"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (getBegin() < otherInterval.getBegin()) {
            if (otherInterval.getBegin() == end && otherInterval.isBeginIncluded() == false && endIncluded == false) {
                return null;
            }
            return new DoubleInterval(otherInterval.getBegin(), end, otherInterval.isBeginIncluded(), endIncluded);
        }

        if (isColorImage(imagePlus)) {
            IJ.error("Image Type Error", "Requires a label image as input");
            return;
        }

        if (c.deleted > 0) {
            int start = rawText.length();
            for (int m = 0; m < c.deleted; m++) {
                rawText.append(originalStrings[n + m]);
            }
            n += c.deleted - 1;
            result.addRun(start, rawText.length() - start, Type.DELETE);
        }

        if (colony.getOwner().getEurope() != null) {
            produce.addAll(transform(immigrationGoodsTypes, gt -> production.containsKey(gt), Function.identity(), productionComparator));
        }

        if (ly == 0) {
            if (iy == 0x7ff00000) {
                if (((ix - 0x3ff00000) | lx) == 0) return y - y;
                else if (ix >= 0x3ff00000) return (hy >= 0) ? y : zero;
                else return (hy < 0) ? -y : zero;
            }
            if (iy == 0x3ff00000) {
                if (hy < 0) return one / x;
                else return x;
            }
            if (hy == 0x40000000) return x * x;
            if (hy == 0x3fe00000) {
                if (hx >= 0) return Math.sqrt(x);
            }
        }

        if (currencySignCount != CURRENCY_SIGN_COUNT_ZERO) {
            Currency theCurrency = getCurrency();
            if (theCurrency != null) {
                setRoundingIncrement(theCurrency.getRoundingIncrement(currencyUsage));
                int d = theCurrency.getDefaultFractionDigits(currencyUsage);
                setMinimumFractionDigits(d);
                _setMaximumFractionDigits(d);
            }
            if (currencySignCount == CURRENCY_SIGN_COUNT_IN_PLURAL_FORMAT && currencyPluralInfo == null) {
                currencyPluralInfo = new CurrencyPluralInfo(symbols.getULocale());
            }
        }

        if (drawGrid.isEvaluatable(index)) {
            value = drawGrid.getGaussConstraint(s.grid.getCellIndex(pos)).get(colorIndex);
        } else {
            value = 0.0;
        }

        if (preserveContextInfo) {
        } else {
            deleteContextInfo(contextInfo);
        }

        if (_err != null) {
            return;
        }

        if (isPrintableAscii(curChar)) {
            temp.append(curChar);
            ++curLen;
        } else if (!singleConsecZero) {
            if (curLen >= MIN_CHARS_STRING) {
                result.append(temp);
                result.append(NLS);
            }
            temp = new StringBuilder();
            curLen = 0;
        }

        if (vPool.getQuotaEnabled()) {
            long netFreeQuota = vPool.getQuota() - (long) ((capacity._provisionedCapacity + invalidPoolCapacity._provisionedCapacity) / GB);
            if (netFreeQuota < 0) {
                netFreeCapacityGb = 0;
            } else if (netFreeQuota < netFreeCapacityGb) {
                netFreeCapacityGb = netFreeQuota;
            }
        }

        if (profilePrivacy.getStudentInfo() == ProfileConstants.PRIVACY_OPTION_EVERYONE) {
            result = true;
            break;
        }

        if (theCRs[i] == null) {
            res.add(BitarchiveClient.getInstance(allBas[i], anyBas[i], theBamons[i]));
        } else {
            res.add(ChecksumClient.getInstance(theCRs[i]));
        }

        if (beginPoint != null) {
            polygonPath.lineTo(coordinates[0], coordinates[1]);
        } else {
            polygonPath.moveTo(coordinates[0], coordinates[1]);
            beginPoint = coordinates;
        }

        if (Integer.class.getName().equals(type)) {
            type = Long.class.getName();
        }

        if (filter instanceof OptionHandler) {
            filterOptions += "\nFilter options:\n\n";
            Enumeration enu = ((OptionHandler) filter).listOptions();
            while (enu.hasMoreElements()) {
                Option option = (Option) enu.nextElement();
                filterOptions += option.synopsis() + '\n' + option.description() + "\n";
            }
        }

        if (callback != null) {
            return callback.createNdefMessage(mDefaultEvent);
        } else {
            return message;
        }

        if (user_id_lookedup != requestId) {
            throw new HTTPException(HttpStatus.UNAUTHORIZED.value());
        }

        if (isCategory) {
            for (int i = groupDefinitions.size() - 1; i >= 0; i--) {
                IGroupDefinition gd = groupDefinitions.get(i);
                String exprGroupKey = gd.getKeyExpression();
                if (isJavaScript) {
                    if (expr.indexOf(exprGroupKey) >= 0) {
                        return i;
                    }
                }
                if (!bindingNameSet.isEmpty()) {
                    Set<String> grpBindings = exprCodec.getRowBindingNameSet(exprGroupKey);
                    for (String grpBinding : grpBindings) {
                        if (bindingNameSet.contains(grpBinding)) {
                            return i;
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < groupDefinitions.size(); i++) {
                IGroupDefinition gd = groupDefinitions.get(i);
                String exprGroupKey = gd.getKeyExpression();
                if (isJavaScript) {
                    if (expr.indexOf(exprGroupKey) >= 0) {
                        return i;
                    }
                }
                if (!bindingNameSet.isEmpty()) {
                    Set<String> grpBindings = exprCodec.getRowBindingNameSet(exprGroupKey);
                    for (String grpBinding : grpBindings) {
                        if (bindingNameSet.contains(grpBinding)) {
                            return i;
                        }
                    }
                }
            }
        }

        if (StringUtils.equals(e1.getSource(), e2.getSource())) {
            if (e1.getCreated().after(e2.getCreated())) {
                withdrawnEvent = e2;
            }
        } else {
            EventPriority p = new EventPriority();
            int p1 = p.getValue(e1);
            int p2 = p.getValue(e2);
            if (p1 > p2) {
                withdrawnEvent = e2;
            }
        }

        if (filtrarTipoServicoActionForm.getDescricaoTipoServicoReferencia() != null && !filtrarTipoServicoActionForm.getDescricaoTipoServicoReferencia().equals("")) {
            FiltroServicoTipoReferencia filtroServicoTipoReferencia = new FiltroServicoTipoReferencia();
            filtroServicoTipoReferencia.adicionarParametro(new ParametroSimples(FiltroServicoTipoReferencia.ID, filtrarTipoServicoActionForm.getIdTipoServicoReferencia()));
            Collection colecaoTipoServicoReferencia = fachada.pesquisar(filtroServicoTipoReferencia, ServicoTipoReferencia.class.getName());
            if (colecaoTipoServicoReferencia != null && !colecaoTipoServicoReferencia.isEmpty()) {
                ServicoTipoReferencia servicoTipoReferencia = (ServicoTipoReferencia) Util.retonarObjetoDeColecao(colecaoTipoServicoReferencia);
                servicoTipoParametros.setServicoTipoReferencia(servicoTipoReferencia);
            }
        }

        if (p_params.getConsolidateFileType() != null && p_params.getConsolidateFileType().equals("consolidate")) {
            count = 1 + unextractFileNumber;
        } else {
            count = extractFileNumber + unextractFileNumber;
        }

        if (!(changedObject instanceof MPerspective)) {
            return;
        }

        if (constraint.getDefinition() != null) {
            Optional<Value> ref = typeIndex.createReference(constraint.getDefinition());
            if (ref.isPresent()) {
                props.put(P_TYPE, ref.get());
            }
        }

        if (vecEnable.size() <= 1) {
            dropButton.setEnabled(false);
            dropButton.setVisible(false);
            setPreferredSize(actionButton.getSize());
            setMaximumSize(actionButton.getSize());
            setMinimumSize(actionButton.getSize());
        } else dropButton.setEnabled(true);

        if (dao != null) {
            this.entityMetaPropertiesService = new EntityMetaPropertiesService();
            this.entityMetaPropertiesService.setDao(dao);
            this.entityMetaPropertiesService.setEntityBrokerManager(entityBrokerManager);
            this.entityMetaPropertiesService.setEntityProviderManager(entityProviderManager);
            this.entityTaggingService = new EntityTaggingService();
            this.entityTaggingService.setDao(dao);
            this.entityTaggingService.setEntityBrokerManager(entityBrokerManager);
            this.entityTaggingService.setEntityProviderManager(entityProviderManager);
        }

        if (view instanceof LaunchView) {
            ILaunchManager launchmgr = DebugPlugin.getDefault().getLaunchManager();
            ILaunch[] launches = launchmgr.getLaunches();
            for (ILaunch launch : launches) {
                if (launch.getAttribute(getPreferenceKey()) != null && launch.isTerminated() == false) {
                    setEnabled(true);
                    return;
                }
            }
        } else if (view instanceof BreakpointsView) {
            IBreakpointManager bkptmgr = DebugPlugin.getDefault().getBreakpointManager();
            IBreakpoint[] bkpts = bkptmgr.getBreakpoints();
            for (IBreakpoint bkpt : bkpts) {
                try {
                    Object attr = bkpt.getMarker().getAttribute(ICDebugInternalConstants.ATTR_CAPABLE_OF_SHOW_FULL_PATHS);
                    if (attr != null) {
                        setEnabled(true);
                        return;
                    }
                } catch (Exception e) {
                }
            }
        }

        if (longValue == value) {
            return Long.toString(longValue);
        } else {
            return Double.toString(value);
        }

        if (mergedSt instanceof TrpTextLineType) {
            Collections.sort(trpMergedShapes, new TrpElementCoordinatesComparator<ITrpShapeType>(false));
            logger.debug("baseline merge - n-merged shapes: " + trpMergedShapes.size());
            TrpTextLineType mergedTl = (TrpTextLineType) mergedSt;
            List<Point> blPts = new ArrayList<>();
            for (ITrpShapeType st : trpMergedShapes) {
                if (st != null && st instanceof TrpTextLineType) {
                    TrpTextLineType tl = (TrpTextLineType) st;
                    if (tl.getTrpBaseline() != null) {
                        mw.getScene().removeShape((ICanvasShape) tl.getTrpBaseline().getData(), false, false);
                        blPts.addAll(PointStrUtils.parsePoints(tl.getTrpBaseline().getPoints()));
                    }
                }
            }
            if (!blPts.isEmpty()) {
                CanvasPolyline pl = new CanvasPolyline(blPts);
                pl.setEditable(true);
                pl.setParent(newShape);
                mw.getScene().addShape(pl, newShape, false);
                TrpBaselineType bl = TrpShapeElementFactory.createPAGEBaseline(pl, mergedTl);
                TrpShapeElementFactory.syncCanvasShapeAndTrpShape(pl, bl);
            }
        }

        if (invokeSleep) {
            AbstractTestSupport.sleep(SLEEP_TIMEOUT);
        }

        if (createGenericDescriptor) {
            descriptorsBuilder.add(GenericParamDescriptor.of(parameterType, parameterIndex, parameterAnnotations));
        }

        if (args.getMain().isPresent()) {
            LOG.warn("%s: parameter `main` is deprecated, please use `main_module` instead.", buildTarget);
            String mainName = pathResolver.getSourcePathName(buildTarget, args.getMain().get());
            Path main = baseModule.resolve(mainName);
            modules.put(baseModule.resolve(mainName), args.getMain().get());
            mainModule = PythonUtil.toModuleName(buildTarget, main.toString());
        } else {
            mainModule = args.getMainModule().get();
        }

        if (!floatArgDescriptions.containsKey(flag)) {
            throw new IllegalArgumentException("Trying to get Float value for non-Float parameter " + flag);
        }

        if (pat != null) {
            lKons.clear();
            Fall[] faelle = pat.getFaelle();
            for (Fall f : faelle) {
                load(f, false);
            }
            pagingComposite.setup(page, lKons.size(), PAGING_FETCHSIZE);
        }

        if (filtro.getIdEntidade() != null && filtro.getIdEntidade() != ConstantesSistema.NUMERO_NAO_INFORMADO) {
            consulta += "and imovelDoacao.entidadeBeneficente.id = :idEntidade ";
            parametros.put("idEntidade", filtro.getIdEntidade());
        }

        if (false) ValueEnforcer.isArrayOfsLen(aBuf, nOfs, nLen);

        if (element instanceof Element) {
            for (EStructuralFeature.Setting setting : EMFHelper.getUsages(element)) {
                EObject owner = setting.getEObject();
                if (isStereotypeApplicationExtensionSetting(owner, setting)) {
                    if (owner.eClass().getEPackage() == oldDefinition) {
                        oldStereotypeApplications.add(owner);
                    }
                }
            }
        } else {
            iter.prune();
        }

        if (operation.fDeltas != null) {
            for (ICElementDelta delta : operation.fDeltas) {
                addDelta(delta);
            }
        }

        if (mHelper == null) {
            queryInventoryTracker.send(new HitBuilders.EventBuilder().setCategory("Query Inventory Event").setAction("Failed to query inventory").setLabel("mHelper returned as null").setValue(1).build());
            return;
        }

        if (dispo.isUniqueAlarm()) {
            rkBuilder.append("%eventid%");
        }

        if (value == m_MissIndex) return hasUnknownBranch() ? ClusNode.UNK : UNKNOWN;

        if (array == null || array.length == 1) {
            throw new IllegalArgumentException();
        }

        if (proxyHost != null) {
            LOGGER.fine("Found 'http.proxyHost' Java System property. Using it as proxy server. Port: " + proxyPort);
            HostConfiguration hostConfig = client.getHostConfiguration();
            hostConfig.setProxy(proxyHost, proxyPort);
        }

        if (wrapArray) {
            o = new ArrayListWrapper(o);
        }

        if (hit) {
            successes++;
        }

        if (this.calcResult == FAIL) {
            return 1;
        }

        if (op.equals(EmailProvider.NOTIFICATION_OP_DELETE)) {
            try {
                ImapIdleFolderHolder.getInstance().unregisterIdledMailbox(id, true);
            } catch (MessagingException me) {
                LogUtils.e(LOG_TAG, me, "Failed to process imap mailbox " + id + " changes.");
            }
            return;
        }

        if (enumeration.isEditable()) {
            JTextField textField = new JTextField();
            textField.getDocument().putProperty(DATA_MAP_PROPERTY, dataMap);
            textField.getDocument().putProperty(URI_PROPERTY, URI.create(inputOrOutput.getIdentifier().getValue()));
            textField.getDocument().putProperty(ENUMERATION_PROPERTY, enumeration);
            textField.getDocument().putProperty(LIST_PROPERTY, list);
            textField.getDocument().putProperty(IS_MULTISELECTION_PROPERTY, enumeration.isMultiSelection());
            textField.getDocument().putProperty(IS_OPTIONAL_PROPERTY, isOptional);
            textField.setText(I18N.tr(DEFAULT_TEXT));
            textField.setForeground(Color.gray);
            MouseListener mouseListener = EventHandler.create(MouseListener.class, this, "onMouseClicked", "source", "mouseClicked");
            textField.putClientProperty(MOUSE_LISTENER_PROPERTY, mouseListener);
            textField.addMouseListener(mouseListener);
            textField.getDocument().addDocumentListener(EventHandler.create(DocumentListener.class, this, "saveDocumentTextFile", "document"));
            textField.setToolTipText(I18N.tr("Coma separated custom value(s)"));
            panel.add(textField, "growx, wrap");
            list.putClientProperty(TEXT_FIELD_PROPERTY, textField);
        }

        if (isSimple) {
            buildCurveSegmentSimple(info, pnts, eseg.get(0), true);
        } else {
            info.add(new Triplet(pnts.size(), SDOEType.COMPOUND_POLYGON_RING_EXTERIOR, eseg.size()));
            for (int i = 0, j = eseg.size(); i < j; i++) {
                buildCurveSegment(info, pnts, eseg.get(i), i > 0);
            }
        }

        if (includeSubclasses) {
            RDBMSStoreManager storeMgr = discrimMapping.getStoreManager();
            Collection<String> subclasses = storeMgr.getSubClassesForClass(info.getClassName(), true, clr);
            if (subclasses != null && subclasses.size() > 0) {
                Iterator<String> iter = subclasses.iterator();
                while (iter.hasNext()) {
                    String subclass = iter.next();
                    Class subcls = clr.classForName(subclass);
                    if (!Modifier.isAbstract(subcls.getModifiers())) {
                        AbstractClassMetaData subclassCmd = storeMgr.getNucleusContext().getMetaDataManager().getMetaDataForClass(subclass, clr);
                        Object discVal = subclassCmd.getDiscriminatorValue();
                        if (strategy != DiscriminatorStrategy.NONE) {
                            discrimMapping.setObject(ec, ps, MappingHelper.getMappingIndices(jdbcPosition, discrimMapping), discVal);
                            jdbcPosition += discrimMapping.getNumberOfDatastoreMappings();
                        }
                    }
                }
            }
        }

        if (LOG.isDebugEnabled()) LOG.debug("Registering the Networking Client with the XMPP Communication Manager");

        if (fields == null || fields.length == 0) {
            fields = ORMConfigBeanUtil.getFields(clazz);
        }

        if (!isAdmin(req.getRemoteUser())) {
            if (data.has(UserConstants.PASSWORD) && userInfo.getProperty(UserConstants.PASSWORD) != null && (!data.has(UserConstants.OLD_PASSWORD) || !userInfo.getProperty(UserConstants.PASSWORD).equals(data.getString(UserConstants.OLD_PASSWORD)))) {
                return statusHandler.handleRequest(req, resp, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_BAD_REQUEST, "Invalid old password", null));
            }
        }

        if (SIM) {
            nameList = mVcardManager.getSIMPhonebookNameList(mOrderBy);
        } else {
            nameList = mVcardManager.getPhonebookNameList(mOrderBy);
        }

        if (pl.getParameter("res") == null) {
            targetRes = decSpec.dls.getMin();
        } else {
            try {
                targetRes = pl.getIntParameter("res");
                if (targetRes < 0) {
                    throw new IllegalArgumentException("Specified negative " + "resolution level " + "index: " + targetRes);
                }
            } catch (NumberFormatException f) {
                throw new IllegalArgumentException("Invalid resolution level " + "index ('-res' option) " + pl.getParameter("res"));
            }
        }

        if (mode == 1 || mode == 3) ab.putStr((String) val);
        else if (mode == 5 || mode == 6) {
            ab.put4(((Freezable[]) val).length);
            for (Freezable v : (Freezable[]) val) ab.put(v);
        } else ab.put((Freezable) val);

        if (!unexpectedProposals.isEmpty() && !proposalsNotRemoved.isEmpty()) {
            if (proposalsNotRemoved.size() == 1) {
                fail(proposalsNotRemoved.get(0) + " should be a proposal and " + unexpectedProposals + " should not be a proposal.");
            } else {
                fail(proposalsNotRemoved + " should be proposals and " + unexpectedProposals + " should not be proposals.");
            }
        } else if (!unexpectedProposals.isEmpty() && proposalsNotRemoved.isEmpty()) {
            if (proposalsNotRemoved.size() == 1) {
                fail(unexpectedProposals.get(0) + " should not be a proposal.");
            } else {
                fail(unexpectedProposals + " should not be proposals.");
            }
        } else if (!proposalsNotRemoved.isEmpty()) {
            if (proposalsNotRemoved.size() == 1) {
                fail(proposalsNotRemoved.get(0) + " should be a proposal.");
            } else {
                fail(proposalsNotRemoved + " should be proposals.");
            }
        }

        if (!win.mAppFreezing && (win.mViewVisibility == View.VISIBLE || win.isAnimatingWithSavedSurface() || (win.mWinAnimator.isAnimationSet() && !service.mAppTransition.isTransitionSet())) && !win.mDestroying && win.isDrawnLw()) {
            return true;
        }

        if (text.contains("rubbing the two stupid sticks together") || text.contains("pile the sticks up on top of the briefcase")) {
            ResultProcessor.processItem(ItemPool.CSA_FIRE_STARTING_KIT, -1);
        }

        if (changeset.language() != null)
            bean().language(changeset.language() == NULL_STRING ? null : changeset.language());

        if (d0 == null && d1 != null) return false;

        if (context.getProcessType().isServer()) {
            for (ThreadingAttribute attribute : EnumSet.allOf(ThreadingAttribute.class)) {
                if (conf.hasDefined(attribute.getName())) {
                    throw new OperationFailedException(JGroupsLogger.ROOT_LOGGER.threadsAttributesUsedInRuntime());
                }
            }
        }

        if (executor.isTerminating()) {
            log.info("Waiting for close of DocExpiration Executor");
            ExecutorUtil.shutdownAndAwaitTermination(executor);
        }

        if (!type.isAnonymousClass() && !type.isInterface() && !type.isMemberClass()) {
            registerAlias(type);
        }

        if (fhandle != null) fileClose();

        if (noStitch) return getParent().openThumbPlane(imageIndex, planeIndex);

        if (splitPane == null) {
            splitPane = new JSplitPane();
        }

        if (map != result.map) {
            _dynamicValueSerializers = result.map;
        }

        if (!headerAdded) {
            StringBuilder csvHeader = new StringBuilder();
            csvHeader.append("DateTime").append(cvsSeparator).append("vuser");
            for (Entry<String, StatisticExpression> each : getExpressionEntrySet()) {
                if (!each.getKey().equals("Peak_TPS")) {
                    csvHeader.append(cvsSeparator).append(each.getKey());
                }
            }
            if (intervalStatisticMapPerTest.size() != 1) {
                for (int i = 1; i <= intervalStatisticMapPerTest.size(); i++) {
                    csvHeader.append(cvsSeparator).append("Description");
                    for (Entry<String, StatisticExpression> each : getExpressionEntrySet()) {
                        if (!each.getKey().equals("Peak_TPS")) {
                            csvHeader.append(cvsSeparator).append(each.getKey()).append("-").append(i);
                        }
                    }
                }
            }
            writeCSVDataLine(csvHeader.toString());
            headerAdded = true;
        }

        if (_isCategoryAvailable) {
            final ToolBar toolbar = new ToolBar(container, SWT.FLAT);
            final ToolBarManager tbm = new ToolBarManager(toolbar);
            tbm.add(_actionShowHideCategory);
            tbm.update(true);
        }

        if (file_sep.equals("/") && line_sep.equals("\n") && path_sep.equals(":")) {
            if (System.getProperty("java.vm.vendor").equals("The android Project") && System.getProperty("java.vm.name").equals("Dalvik") && file_sep.equals("/") && line_sep.equals("\n") && path_sep.equals(":") && os_name.startsWith("Linux")) {
                return ANDROID;
            } else if (os_name.startsWith(LINUX)) {
                return LINUX;
            } else if (os_name.startsWith(MAC_OS) || os_name.contains("OS X")) {
                return MAC_OS;
            }
        } else if (file_sep.equals("\\") && line_sep.equals("\r\n") && path_sep.equals(";") && os_name.toLowerCase().startsWith("windows")) {
            return WINDOWS;
        }

        if (src.size() <= PARTIAL_SYNC_THRESHOLD) {
            return false;
        }

        if (transforms != null) {
            this._constructionElement.appendChild(transforms.getElement());
            XMLUtils.addReturnToElement(this._constructionElement);
        }

        if (TextUtils.notEmpty(id)) {
            close.ensureDebugId(id);
        }

        if (identities != null && identities.size() > 0) {
            where.startGroup();
            for (Identity currentIdentity : identities) {
                if (first) {
                    first = false;
                } else {
                    where.or();
                }
                where.equals(ActivityEntity.identity, currentIdentity.getId());
            }
            if (poster != null) {
                where.or();
                where.equals(ActivityEntity.poster, poster.getId());
            }
            if (mentioner != null) {
                where.or();
                where.contains(ActivityEntity.mentioners, mentioner.getId());
            }
            if (commenter != null) {
                where.or();
                where.contains(ActivityEntity.commenters, commenter.getId());
            }
            if (liker != null) {
                where.or();
                where.contains(ActivityEntity.likes, liker.getId());
            }
            where.endGroup();
        }

        if (processEngine != null) {
            RepositoryService repositoryService = processEngine.getRepositoryService();
            if (!isProcessDeployed(repositoryService, "invoice")) {
                ClassLoader classLoader = getProcessApplicationClassloader();
                repositoryService.createDeployment(this.getReference()).addInputStream("invoice.v1.bpmn", classLoader.getResourceAsStream("invoice.v1.bpmn")).addInputStream("invoiceBusinessDecisions.dmn", classLoader.getResourceAsStream("invoiceBusinessDecisions.dmn")).addInputStream("review-invoice.cmmn", classLoader.getResourceAsStream("review-invoice.cmmn")).deploy();
            }
        }

        if (pe instanceof Classifier) {
            EList<Classifier> requiredClassifiers = ClassUtils.includedClassifiers((Classifier) pe);
            for (Classifier requiredClassifier : requiredClassifiers) {
                if (!alreadyHandled.contains(requiredClassifier)) {
                    generate(mec, requiredClassifier, alreadyHandled, false);
                }
            }
        }

        if (m_NoSizeDetermination) {
            result[current++] = -1.0;
            result[current++] = -1.0;
            result[current++] = -1.0;
        } else {
            ByteArrayOutputStream bastream = new ByteArrayOutputStream();
            ObjectOutputStream oostream = new ObjectOutputStream(bastream);
            oostream.writeObject(m_clusterer);
            result[current++] = new Double(bastream.size());
            bastream = new ByteArrayOutputStream();
            oostream = new ObjectOutputStream(bastream);
            oostream.writeObject(train);
            result[current++] = new Double(bastream.size());
            bastream = new ByteArrayOutputStream();
            oostream = new ObjectOutputStream(bastream);
            oostream.writeObject(test);
            result[current++] = new Double(bastream.size());
        }

        if (file != null) {
            w = new PrintStream(new FileOutputStream(file));
        } else {
            w = System.err;
        }

        if (declaredFields == null) {
            if (getInheritedFields) {
                declaredFields = getAllFields(clazz).toArray(new Field[getAllFields(clazz).size()]);
            } else {
                declaredFields = clazz.getDeclaredFields();
            }
        }

        if (getUMLElement().getType() != null) {
            getDiagramEventBroker().addNotificationListener(getUMLElement().getType(), this);
        }

        if (updatedValueKeytab != null) {
            KerberosKeytabDescriptor oldValueKeytab = previousStackIdentity.getKeytabDescriptor();
            String previousValueKeytabFile = null;
            KerberosKeytabDescriptor userValueKeytab = userIdentity.getKeytabDescriptor();
            String userValueKeytabFile = null;
            if (oldValueKeytab != null) {
                previousValueKeytabFile = oldValueKeytab.getFile();
            }
            if (userValueKeytab != null) {
                userValueKeytabFile = userValueKeytab.getFile();
            }
            if ((userValueKeytabFile != null) && !userValueKeytabFile.equals(previousValueKeytabFile)) {
                updatedValueKeytab.setFile(userValueKeytabFile);
            }
        }

        if (!PAGE.equals(name)) {
            return;
        }

        if (VERBOSE) {
            printParameters("Mercator_1SP");
        }

        if (isDAPTrans) {
            return;
        }

        if (ss.containsKey(tokens[0])) al = ss.get(tokens[0]);
        else {
            al = new ArrayList<Region>();
            ss.put(tokens[0], al);
        }

        if (nodePath.indexOf(";") > 0) {
            uiConfirmMessage.setId(DELETE_ITEMS_CONFIRM_TITLE);
            multiContentType = deleteManageComponent.getMultiContentType(nodePath);
        } else {
            Node node = deleteManageComponent.getNodeByPath(nodePath);
            if (node != null) nodeName = StringEscapeUtils.unescapeHtml(Utils.getTitle(node));
            contentType = deleteManageComponent.getContentType(nodePath);
            if (contentType == FILE_TYPE) uiConfirmMessage.setId(DELETE_FILE_CONFIRM_TITLE);
            else if (contentType == FOLDER_TYPE) uiConfirmMessage.setId(DELETE_FOLDER_CONFIRM_TITLE);
        }

        if (!canBeFocusOwner()) {
            return false;
        }

        if (types != null && !types.isEmpty()) {
            filters.add(sam -> types.contains(sam.getSampleType()));
        }

        if (!mLauncher.getAccessibilityDelegate().isInAccessibleDrag()) {
            int total = getPageCount();
            for (int i = numCustomPages(); i < total; i++) {
                updateAccessibilityFlags((CellLayout) getPageAt(i), i);
            }
            setImportantForAccessibility((mState == State.NORMAL || mState == State.OVERVIEW) ? IMPORTANT_FOR_ACCESSIBILITY_AUTO : IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS);
        }

        if (mGetEntryTask != null) mGetEntryTask.cancel(false);

        if (user.getFirstName() != null && user.getFirstName().isEmpty()) user.setFirstName(null);

        if ("lsb-release".equalsIgnoreCase(entry)) {
            while (firstLine != null && !firstLine.toUpperCase().startsWith("DISTRIB_DESCRIPTION")) {
                if (Boolean.getBoolean("shell.debug")) {
                    System.out.println("UtilityEnvironment#getLinuxRelease: firstLine='" + firstLine + "'");
                }
                firstLine = reader.readLine();
            }
        } else {
            firstLine = reader.readLine();
        }

        if (iscene == 0) {
            radb = (float) StormADOTInfo.kstart_v72;
            rade = (float) StormADOTInfo.kend_v72;
        } else {
            radb = 0.0f;
            rade = (float) StormADOTInfo.kstart_v72;
        }

        if (isPost) {
            if (ComponentPageImpl.isSoap(pc))
                throw new ApplicationException("can not instantiate interface [" + getPageSource().getComponentName() + "] as a component");
        } else if (qs != null && qs.trim().equalsIgnoreCase("wsdl"))
            throw new ApplicationException("can not instantiate interface [" + getPageSource().getComponentName() + "] as a component");

        if (lastCol > -1) {
            if (radius < 5) {
                continue;
            }
        }

        if (generateDefaults() || asyncEventQueue.isPersistent() != GatewaySender.DEFAULT_PERSISTENCE_ENABLED)
            atts.addAttribute("", "", PERSISTENT, "", String.valueOf(asyncEventQueue.isPersistent()));

        if (value instanceof Long) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < splits.length; i++) {
                if (splits[i].startsWith(entityPackagePrefix)) {
                    String[] queryClassSplits = splits[i].split("\\.");
                    list.add(queryClassSplits[queryClassSplits.length - 1]);
                } else if (splits[i] != null && !splits[i].equals("null")) {
                    list.add(splits[i]);
                }
            }
            metrics.put(StringUtils.join(list, "."), (Long) value);
        }

        if (displayShowAllAction) {
            showAllWindows = new JMenuItem("Show All");
            setEnvText(showAllWindows, ShowAllWindows_ActionName);
            showAllWindows.setAccelerator(ShowAllWindows_KeyStroke);
            showAllWindows.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            expose();
                        }
                    });
                }
            });
        }

        if (cls == null)
            throw new MetaDataException(_loc.get("bad-class", name, (vmd == null) ? (Object) meta : (Object) vmd));

        if (strat != null) {
            highlightRows(new_, visibleColumns, group);
            unhighlightBand(null, null);
            highlightBand(new_, visibleColumns, group);
        } else if (old != null) {
            clearHighlightRows(old.getIdType(), old.getDataDomain());
            unhighlightBand(null, null);
        }

        if ((attribute && element) || (attribute && elementRef) || (element && elementRef)) {
            fail("Class " + clazz.getName() + " has field " + field.getName() + " which has 2+ annotations that are not allowed together.");
        }

        if (_recoveryStore.allObjUids(_typeName, uids)) {
            Uid theUid = null;
            boolean endOfUids = false;
            while (!endOfUids) {
                theUid = UidHelper.unpackFrom(uids);
                if (theUid.equals(Uid.nullUid())) endOfUids = true;
                else {
                    Uid newUid = new Uid(theUid);
                    if (initialScan) _scanM.put(newUid, newUid);
                    else {
                        if (!_scanM.contains(newUid)) {
                            if (_scanN == null) _scanN = new Hashtable();
                            _scanN.put(newUid, newUid);
                        } else {
                            tsLogger.i18NLogger.info_recovery_ExpiredTransactionScanner_4(newUid);
                            try {
                                moveEntry(newUid);
                            } catch (Exception ex) {
                                tsLogger.i18NLogger.warn_recovery_ExpiredTransactionScanner_2(newUid, ex);
                                _scanN.put(newUid, newUid);
                            }
                        }
                    }
                }
            }
            if (_scanN != null) {
                _scanM = _scanN;
                _scanN = null;
            }
        }

        if (peer.getPeerName().equals(m_masterTask)) {
            peer.getNumCurrentMessages();
            int msgCount = peer.getNumCurrentMessages();
            for (int i = 0; i < msgCount; i++) {
                int id = peer.getCurrentMessage().get();
                outStream.writeChars(id + "\n");
            }
        }

        if (swiftClient.objectExists(containerName, encContentId)) {
            swiftClient.removeObject(containerName, encContentId);
        }

        if (!gid.getParm().getGridInfo().getGridType().equals(GridType.WEATHER)) {
            statusHandler.handle(Priority.PROBLEM, "getCompositeGrid called on non-discrete parm");
            slice.setWeatherGrid(new Grid2DByte());
            slice.setKeys(new WeatherKey[0]);
            return new Grid2DBit(nx, ny);
        }

        if (!this.configuration.isShardConfigured(shardName)) {
            String msg = String.format("No module configuration exists for shard %s", shardName);
            LOG.debug("{}: {}", persistenceId(), msg);
            getSender().tell(new Status.Failure(new IllegalArgumentException(msg)), getSelf());
            return;
        }

        if (rpt.getDataMsgRichiesta().after(mezzorafa)) {
            log.debug("Rpt recente [CodMsgRichiesta: " + rpt.getCodMsgRichiesta() + "]: aggiornamento non necessario");
            continue;
        }

        if (item.isRelativePosition()) {
            addX(item.getXSpace());
            addY(item.getYSpace());
        } else setRelativePosition(item.getXPosition(), item.getYPosition());

        if (serializeType) {
            final java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://wso2.org/bps/management/schema");
            if (namespacePrefix != null && namespacePrefix.trim().length() > 0) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":undeployStatus_type0", xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "undeployStatus_type0", xmlWriter);
            }
        }

        if (!(eq_s(1, "y"))) {
            break lab1;
        }

        if (!isEmpty(uuid)) {
            boolean result = db.tx(() -> {
                T foundElement = getRootVertex(ac).findByUuid(uuid);
                if (foundElement == null) {
                    throw error(NOT_FOUND, i18nNotFoundMessage, uuid);
                } else {
                    ac.data().put(TAGFAMILY_ELEMENT_CONTEXT_DATA_KEY, foundElement);
                }
                return true;
            });
            if (!result) {
                return;
            }
        }

        if (namesLength > 0) {
            sql.append(" and ( ");
            sql.append(" theGroup.nameDb in ( ");
            sql.append(HibUtils.convertToInClause(names, byHqlStatic));
            sql.append(" ) ");
            sql.append(" or theGroup.alternateNameDb in ( ");
            sql.append(HibUtils.convertToInClause(names, byHqlStatic));
            sql.append(" ) ");
            sql.append(" or exists ( select theAttributeAssignValue from AttributeAssign theAttributeAssign, " + " AttributeAssignValue theAttributeAssignValue, AttributeDefName theAttributeDefName ");
            sql.append(" where theGroup.uuid = theAttributeAssign.ownerGroupId ");
            sql.append(" and theAttributeAssign.attributeDefNameId = theAttributeDefName.id ");
            sql.append(" and theAttributeDefName.nameDb = :entitySubjectIdDefName ");
            byHqlStatic.setString("entitySubjectIdDefName", EntityUtils.entitySubjectIdentifierName());
            sql.append(" and theAttributeAssignValue.attributeAssignId = theAttributeAssign.id ");
            sql.append(" and ");
            sql.append(" theAttributeAssignValue.valueString in ( ");
            sql.append(HibUtils.convertToInClause(names, byHqlStatic));
            sql.append(" ) ");
            sql.append(" ) ");
            sql.append(" ) ");
        }

        if (!updateMsg.isAssured() || sourceHandler.getProtocolVersion() < REPLICATION_PROTOCOL_V2) {
            return null;
        }

        if (builtinBindingsProvider != null) {
            IScope tuScope = tu.getScope();
            IBinding[] bindings = builtinBindingsProvider.getBuiltinBindings(tuScope);
            for (IBinding binding : bindings) {
                ASTInternal.addBinding(tuScope, binding);
            }
        }

        if (sessao.getAttribute("collectionParcelamentoDescontoInatividade") != null && !sessao.getAttribute("collectionParcelamentoDescontoInatividade").equals("")) {
            Collection collectionParcelamentoDescontoInatividade = (Collection) sessao.getAttribute("collectionParcelamentoDescontoInatividade");
            String vlSemRestInatividade = null;
            String vlComRestInatividade = null;
            Iterator iteratorParcelamentoDescontoInatividade = collectionParcelamentoDescontoInatividade.iterator();
            while (iteratorParcelamentoDescontoInatividade.hasNext()) {
                ParcelamentoDescontoInatividade parcelamentoDescontoInatividade = (ParcelamentoDescontoInatividade) iteratorParcelamentoDescontoInatividade.next();
                long valorTempo = parcelamentoDescontoInatividade.getUltimaAlteracao().getTime();
                vlSemRestInatividade = httpServletRequest.getParameter("vlSemRestInatividade" + valorTempo);
                vlComRestInatividade = httpServletRequest.getParameter("vlComRestInatividade" + valorTempo);
                BigDecimal percentualDescontoSemRestabelecimentoInatividade = null;
                if (vlSemRestInatividade != null && !vlSemRestInatividade.equals("")) {
                    percentualDescontoSemRestabelecimentoInatividade = Util.formatarMoedaRealparaBigDecimal(vlSemRestInatividade);
                }
                BigDecimal percentualDescontoComRestabelecimentoInatividade = null;
                if (vlComRestInatividade != null && !vlComRestInatividade.equals("")) {
                    percentualDescontoComRestabelecimentoInatividade = Util.formatarMoedaRealparaBigDecimal(vlComRestInatividade);
                }
                parcelamentoDescontoInatividade.setPercentualDescontoSemRestabelecimento(percentualDescontoSemRestabelecimentoInatividade);
                parcelamentoDescontoInatividade.setPercentualDescontoComRestabelecimento(percentualDescontoComRestabelecimentoInatividade);
            }
        }

        if (!isInternalExecution() && perm.getObjectType() == VdcObjectType.VM) {
            VM vm = vmDao.get(perm.getObjectId());
            if (vm != null && vm.getVmPoolId() != null) {
                return failValidation(EngineMessage.PERMISSION_ADD_FAILED_VM_IN_POOL);
            }
        }

        if (httpServletRequest.getParameter("pesquisarOSRA") != null && httpServletRequest.getParameter("pesquisarOSRA").equalsIgnoreCase("SIM")) {
            Integer idTipoServico = null;
            if (form.getIdTipoServicoRA() != null && !form.getIdTipoServicoRA().equals("")) {
                idTipoServico = new Integer(form.getIdTipoServicoRA());
            }
            Collection<Object[]> colecaoDados = Fachada.getInstancia().pesquisarDadosOSRegistroAtendimento(new Integer(form.getIdComandoContaCobranca()), idTipoServico);
            if (colecaoDados != null && !colecaoDados.isEmpty()) {
                Collection<OrdemServicoGeradaEmpresaCobrancaHelper> colecaoOSRegistroAtendimento = new ArrayList();
                Iterator iterator = colecaoDados.iterator();
                while (iterator.hasNext()) {
                    Object[] dados = (Object[]) iterator.next();
                    OrdemServicoGeradaEmpresaCobrancaHelper helper = new OrdemServicoGeradaEmpresaCobrancaHelper();
                    if (dados[0] != null) {
                        helper.setNumeroOS(((Integer) dados[0]).toString());
                    }
                    if (dados[1] != null) {
                        helper.setTipoServico((String) dados[1]);
                    }
                    if (dados[2] != null) {
                        helper.setMatriculaImovel(((Integer) dados[2]).toString());
                    }
                    if (dados[3] != null) {
                        helper.setCliente((String) dados[3]);
                    }
                    colecaoOSRegistroAtendimento.add(helper);
                }
                this.getSessao(httpServletRequest).setAttribute("colecaoOSRegistroAtendimento", colecaoOSRegistroAtendimento);
            } else {
                this.getSessao(httpServletRequest).removeAttribute("colecaoOSRegistroAtendimento");
            }
        }

        if (em == null) {
            logger.error("EntityManager is null");
        }

        if (attr != null) {
            final Object value = ModelProviderUtil.instantiateAttribute(attr.getEAttributeType().getInstanceClass(), property.getValue().toString());
            if (value != null) {
                component.eSet(attr, value);
            }
        }

        if (atualizarContratoArrecadadorActionForm.getIndicadorCobranca() != null) {
            arrecadadorContrato.setIndicadorCobrancaIss(new Short(atualizarContratoArrecadadorActionForm.getIndicadorCobranca()));
        } else {
            arrecadadorContrato.setIndicadorCobrancaIss(null);
        }

        if (parameterType.isPrimitive()) {
            parameterType = ClassUtils.getWrapperClass(parameterType);
        } else if (arg == null) {
            continue;
        }

        if (fileName == null || fileName.length() == 0) {
            throw new ParameterException("FileAttribute(): Error - invalid file name.");
        }

        if (flag == IRenderingEngine.GU_COLOR_LOGIC_OP && logicOp == GeCommands.LOP_COPY) {
            disableFlag(flag);
        } else {
            super.enableFlag(flag);
        }

        if (null != dfmt && params != null) {
            Object o = Times.parseq(dfmt, params);
            return Castors.me().castTo(o, klass);
        }

        if ((this.radiusEditText.length() > 0) && (this.tangentEditText.length() > 0)) {
            return true;
        }

        if (!mCanSlide && action == MotionEvent.ACTION_DOWN && getChildCount() > 1) {
            final View secondChild = getChildAt(1);
            if (secondChild != null) {
                mPreservedOpenState = !mDragHelper.isViewUnder(secondChild, (int) ev.getX(), (int) ev.getY());
            }
        }

        if (dictionary.getSubdictionaries() != null) {
            for (final Dictionary subDictionary : dictionary.getSubdictionaries()) {
                final String sp = subDictionary.getPrefix();
                final String subPrefix = prefix + (sp != null && !sp.equals("") ? sp : "");
                updateCache(subPrefix, subDictionary);
            }
        }

        if (cache.getStatus() != ComponentStatus.RUNNING) {
            if (trace) {
                log.tracef("Cache status is no longer running after completing iterator, all segments are now suspect for %s", requestId);
            }
            listener.segmentsLost.addAll(segments);
        }

        if (values.size() == 0) return -1;

        if (newIsEditable == isEditable) return;

        if (originXY == 1) {
            origin[0] = com[0];
            origin[1] = com[1];
        }

        if (core.getOptionsManager().isAnimateWindows() && getFrameState() != Frame.MAXIMIZED_BOTH) {
            Dimension dim = core.getOptionsManager().getScreenSize(newScreen.getClass().getName());
            if (dim == null) {
                dim = newScreen.getPreferredSize();
            }
            Insets insets = getInsets();
            try {
                this.setSizeSmooth(dim.width + jPanel1.getWidth() + insets.left + insets.right, dim.height + insets.bottom + insets.top, true);
            } catch (InterruptedException e) {
                InfoBox.error("Resize Error", "Unable to run resize animation: " + e.getLocalizedMessage(), core.getRootWindow());
            }
        }

        if (M_Product_Category_ID != 0) return getM_Product_Category_ID() == M_Product_Category_ID;

        if (verbose) {
            Bukkit.getLogger().info("[NoCheatPlus] All cleanup done.");
        }

        if (rightSibling != null) showStructure(sbOut, rightSibling);

        if (df.getMinimumIntegerDigits() != DIGITS[4 * i] || df.getMaximumIntegerDigits() != DIGITS[4 * i + 1] || df.getMinimumFractionDigits() != DIGITS[4 * i + 2] || df.getMaximumFractionDigits() != DIGITS[4 * i + 3]) {
            errln("FAIL \"" + pat + "\" min/max int; min/max frac = " + df.getMinimumIntegerDigits() + "/" + df.getMaximumIntegerDigits() + ";" + df.getMinimumFractionDigits() + "/" + df.getMaximumFractionDigits() + ", expect " + DIGITS[4 * i] + "/" + DIGITS[4 * i + 1] + ";" + DIGITS[4 * i + 2] + "/" + DIGITS[4 * i + 3]);
        }

        if (idLocalidade != null && !idLocalidade.toString().trim().equalsIgnoreCase("")) {
            filtroLocalidade.limparListaParametros();
            filtroLocalidade.adicionarParametro(new ParametroSimples(FiltroLocalidade.INDICADORUSO, ConstantesSistema.INDICADOR_USO_ATIVO));
            filtroLocalidade.adicionarParametro(new ParametroSimples(FiltroLocalidade.ID, new Integer(idLocalidade)));
            localidades = fachada.pesquisar(filtroLocalidade, Localidade.class.getName());
            if (localidades != null && !localidades.isEmpty()) {
                atualizarImovelLocalidadeActionForm.set("idLocalidade", Util.adicionarZerosEsquedaNumero(3, new Integer(((Localidade) ((List) localidades).get(0)).getId().toString()).toString()));
                atualizarImovelLocalidadeActionForm.set("localidadeDescricao", ((Localidade) ((List) localidades).get(0)).getDescricao());
                httpServletRequest.setAttribute("nomeCampo", "idSetorComercial");
            } else {
                httpServletRequest.setAttribute("codigoLocalidadeNaoEncontrada", "true");
                atualizarImovelLocalidadeActionForm.set("localidadeDescricao", "LOCALIDADE INEXISTENTE");
                atualizarImovelLocalidadeActionForm.set("idLocalidade", "");
                atualizarImovelLocalidadeActionForm.set("idSetorComercial", "");
                atualizarImovelLocalidadeActionForm.set("setorComercialDescricao", "");
                atualizarImovelLocalidadeActionForm.set("idQuadra", "");
                httpServletRequest.setAttribute("nomeCampo", "idLocalidade");
            }
        }

        if (lineEnding == null) bw.newLine();
        else bw.write(lineEnding);

        if ((op2.numberLength == 1) || ((op2.numberLength == 2) && (op2.digits[1] > 0))) {
            op2 = BigInteger.valueOf(Division.gcdBinary(op1.longValue(), op2.longValue()));
            break;
        }

        if (!monitor.isCanceled() && visitor.visit(this, monitor)) {
            for (IBeansImport imp : getImports()) {
                imp.accept(visitor, monitor);
                if (monitor.isCanceled()) {
                    return;
                }
            }
            for (IBeanAlias alias : getAliases()) {
                alias.accept(visitor, monitor);
                if (monitor.isCanceled()) {
                    return;
                }
            }
            for (IBeansComponent component : getComponents()) {
                component.accept(visitor, monitor);
                if (monitor.isCanceled()) {
                    return;
                }
            }
            for (IBean bean : getBeans()) {
                bean.accept(visitor, monitor);
                if (monitor.isCanceled()) {
                    return;
                }
            }
        }

        if (0 == strLine.length()) {
            continue;
        }

        if (mClientCertificate == null && mCaCert == null) return false;

        if (obj instanceof JSONObject) {
            JSONObject jsonObject = (JSONObject) obj;
            String colibriClass = (String) jsonObject.get(Videobridge.COLIBRI_CLASS);
            if (colibriClass != null) {
                onJSONData(src, jsonObject, colibriClass);
            } else {
                logger.warn("Malformed JSON received from endpoint " + getId() + ". JSON object does not contain the colibriClass" + " field.");
            }
        }

        if (!clazz.extends_(ClassConstants.NAME_JAVA_LANG_THROWABLE)) {
            return Collections.EMPTY_SET;
        }

        if (constraints.isAtTheBeginingOfLine()) {
            getCmbLocationAlongLines().setSelectedIndex(1);
        } else if (constraints.isInTheMiddleOfLine()) {
            getCmbLocationAlongLines().setSelectedIndex(0);
        } else if (constraints.isAtTheEndOfLine()) {
            getCmbLocationAlongLines().setSelectedIndex(2);
        } else if (constraints.isAtBestOfLine()) {
            getCmbLocationAlongLines().setSelectedIndex(3);
        }

        if (value == null) return value;

        if (visible) {
            if (focusTarget.getTabIndex() != 0) {
                focusTarget.setTabIndex(0);
                mainPanel_.setWidgetLeftRight(widget, 0, Unit.PX, 0, Unit.PX);
            }
        } else {
            if (focusTarget.getTabIndex() != -1) {
                focusTarget.setTabIndex(-1);
                if (DomUtils.hasFocus(focusTarget)) focusTarget.blur();
                mainPanel_.setWidgetLeftRight(widget, -5000, Unit.PX, 5000, Unit.PX);
            }
        }

        if (targetObject != null) {
            if (targetObject.eResource() != null && TransformationUiResourceHelper.isSqlTransformationResource(targetObject)) {
                if (TransformationHelper.isSqlTransformationMappingRoot(targetObject))
                    workingMappingRoot = (SqlTransformationMappingRoot) targetObject;
                else if (TransformationHelper.isVirtualSqlTable(targetObject) || TransformationHelper.isSqlVirtualProcedure(targetObject)) {
                    if (TransformationHelper.isValidSqlTransformationTarget(targetObject))
                        workingMappingRoot = (SqlTransformationMappingRoot) TransformationHelper.getMappingRoot(targetObject);
                }
                if (workingMappingRoot != null) return workingMappingRoot;
            }
        }

        if (loop != null) {
            LoopBeginNode loopBegin = (LoopBeginNode) loop.getHeader().getBeginNode();
            random = loopRandomValueCache.get(loopBegin);
            if (random == null) {
                PhiNode phi = graph.addWithoutUnique(new ValuePhiNode(seed.stamp(NodeView.DEFAULT), loopBegin));
                phi.addInput(seed);
                ValueNode a = ConstantNode.forInt(1103515245, graph);
                ValueNode c = ConstantNode.forInt(12345, graph);
                ValueNode next = graph.addOrUniqueWithInputs(new AddNode(c, new MulNode(phi, a)));
                for (int i = 0; i < loopBegin.getLoopEndCount(); i++) {
                    phi.addInput(next);
                }
                random = phi;
                loopRandomValueCache.put(loopBegin, random);
            }
        } else {
            random = seed;
        }

        if (originIDField == null) {
            ft.setId(Integer.toString(i));
        } else {
            ft.setId(feature.getProperty(originIDField).getValue().toString());
        }

        if (mockup != null) {
            hardCodedDate = mockup.getDate();
        }

        if (Globals.IS_SECURITY_ENABLED) {
            PrivilegedAction<Void> pa = new PrivilegedSetTccl(StandardHostValve.class.getClassLoader());
            AccessController.doPrivileged(pa);
        } else {
            Thread.currentThread().setContextClassLoader(StandardHostValve.class.getClassLoader());
        }

        if (reconnect) {
            buf.put(RECONNECT_BYTES);
            buf.put(LINEFEED_BYTE);
        }

        if (!loggedWarning) {
            long timeUntilWarning = warnTime - elapsed;
            if (timeUntilWarning <= 0) {
                logger.warn(LocalizedMessage.create(LocalizedStrings.BucketAdvisor_WAITING_FOR_PRIMARY, new Object[]{warnTime / 1000L, this, this.adviseInitialized()}));
                loggedWarning = true;
            } else {
                timeLeft = timeLeft > timeUntilWarning ? timeUntilWarning : timeLeft;
            }
        }

        if (screen.contains(firstPoint) ^ screen.contains(secondPoint)) {
            return 1.0d;
        }

        if (!operator.isMatchCase()) {
            rightOperand = new Function(sqlAdapter.resolveDatabaseOperationName("string.upper"), rightOperand);
            leftOperand = new Function(sqlAdapter.resolveDatabaseOperationName("string.upper"), leftOperand);
        }

        if (totalSwinging / totalEffectiveTraction > 2.0) {
            if (speedEfficiency > minSpeedEfficiency) {
                speedEfficiency *= 0.5;
            }
            jt = Math.max(jt, jitterTolerance);
        }

        if (testResult) {
            return kvalue;
        }

        if (!(key instanceof Integer)) {
            throw new CacheWriterException("Illegal key type");
        }

        if (!useLdaps) {
            environment.put(COM_SUN_JNDI_LDAP_CONNECT_TIMEOUT, "10000");
        } else {
            if (timeout < 0) {
                timeout = 0;
            }
            environment.put(COM_SUN_JNDI_LDAP_CONNECT_TIMEOUT, Long.toString(timeout));
        }

        if (nodes == null && ((ResourceExpression) semanticObject).getResourceData().size() > 1)
            acceptUnassignedKeyword(grammar.getResourceExpressionAccess().getSemicolonKeyword_0_1_2_2(), ";", null);
        else super.emit_ResourceExpression_SemicolonKeyword_0_1_2_2_q(semanticObject, transition, nodes);

        if (headline1 != null && headline2 != null) {
            filename = Encoding.htmlDecode(headline1).trim() + " - " + Encoding.htmlDecode(headline2).trim();
        } else if (headline2 != null) {
            filename = Encoding.htmlDecode(headline2).trim();
        } else if (headline1 != null) {
            filename = Encoding.htmlDecode(headline1).trim();
        } else {
            filename = new Regex(downloadLink.getDownloadURL(), "https?://[^/]+\\.de/(.+)").getMatch(0);
            filename = filename.replace("cms/", "");
            filename = filename.replace(".html", "");
        }

        if (arrayParmClienteImovel[21] != null) {
            consultarImovelActionForm.setDataCorteAgua(Util.formatarData((Date) arrayParmClienteImovel[21]));
        } else {
            consultarImovelActionForm.setDataCorteAgua("");
        }

        if ((x >= 0 && x <= tileWidth - 16) && (y >= 0 && y <= tileHeight - 16)) {
            z = new Zone(x, y, 16, 16);
        }

        if (solrReq == null) solrReq = parser.parse(core, path, req);

        if (a1.intValue() == 11) assertEquals(11, sum.intValue());
        else assertEquals(a1.intValue() * a1.intValue(), sum.intValue());

        if (monthName.equals("sept")) {
            monthName = "sep";
        }

        if (viewType != null && !isSubtypeOfType(viewType, VIEW_TYPE) && !isInterface(viewType)) {
            if (viewType.getKind() == TypeKind.ERROR) {
                note(element, "@%s List or array with unresolved type (%s) " + "must elsewhere be generated as a View or interface. (%s.%s)", BindViews.class.getSimpleName(), viewType, enclosingElement.getQualifiedName(), element.getSimpleName());
            } else {
                error(element, "@%s List or array type must extend from View or be an interface. (%s.%s)", BindViews.class.getSimpleName(), enclosingElement.getQualifiedName(), element.getSimpleName());
                hasError = true;
            }
        }

        if (key.startsWith("_") && key.length() > 1) {
            key = key.substring(1);
        }

        if (mapping.getFilter() != null) {
            if (mapping.getFilter().getType() == ConstraintType.text) {
                serializeConstraint(builder, (TextConstraint) mapping.getFilter());
            } else if (mapping.getFilter().getType() == ConstraintType.value) {
                serializeConstraint(builder, (ValueConstraint) mapping.getFilter());
            } else {
                throw new IllegalStateException(String.format("Constraints of type %s are not supported! Please adapt this implementation!", mapping.getFilter().getType()));
            }
            builder.append(' ');
        }

        if (name instanceof Set) {
            return new FunctionValueImpl(lucee.runtime.type.util.ListUtil.arrayToList(toStringArray(pc, (Set) name), "."), refValue == null ? objValue : refValue.getValue(pc));
        }

        if (this.numTasksExecuting >= maxParallelRebalancing) {
            logger.info("Executing more tasks than [" + this.numTasksExecuting + "] the parallel allowed " + maxParallelRebalancing);
            return null;
        }

        if (setNewValue(value)) {
            value.setAttributeValid(true);
        } else {
            value.setAttributeValid(false);
            UiElements.cantSaveAttributeValueDialogBox(value);
            return;
        }

        if (result[j] instanceof ELProposalProcessor.Proposal) {
            ELProposalProcessor.Proposal proposal = (ELProposalProcessor.Proposal) result[j];
            String proposalString = proposal.getPrefixCompletionText(document, offsetToTest).toString();
            if (filteredValidProposals.contains(proposalString)) {
                existingProposals.add(proposalString);
                filteredValidProposals.remove(proposalString);
            } else if (!existingProposals.contains(proposalString)) {
                nonExistingProposals.add(proposalString);
            }
        }

        if (StringUtils.startsWith(StringUtils.trim(gJson), "{")) {
            JSONObject root = new JSONObject(gJson);
            for (Iterator<String> keys = root.keys(); keys.hasNext(); ) {
                String key = keys.next();
                int value = root.getInt(key);
                bucket.put(key, value);
            }
        } else {
            logger.log(Level.SEVERE, "Received following server response: " + gJson);
        }

        if (this.strategy == Strategy.TREES_ONLY) {
            if (nodeRef != null) {
                while (!nodeRef.getParentPath().isEmpty()) {
                    treeRef = command(FindTreeChild.class).setSource(source).setParent(workingTree().getTree()).setChildPath(nodeRef.getParentPath()).call();
                    nodeRef = treeRef.get();
                    nodeRefs.add(nodeRef);
                }
            }
        }

        if (totalMatchedAndPassed > 0) {
            successCount++;
            successDetails.add(totalMatchedAndPassed + " test entries matched standard and passed all assertions.");
        }

        if (varLineReader != null) {
            try {
                importFromVariantReader();
            } catch (IOException e) {
                e.printStackTrace();
                throw new OperationFailedException("Error importing from variant reader: " + e.getMessage(), this);
            }
            return;
        }

        if (!queueConfig.getQueueStrategy().name().equals(getSif3Session().getQueueStrategy())) {
            logger.error("Cannot change queue strategy from " + getSif3Session().getQueueStrategy() + " to " + queueConfig.getQueueStrategy() + ". This is not yet supported. Only supported queue strategy is " + QueueStrategy.ADAPTER_LEVEL + ".");
            queueConfig.setQueueStrategy(QueueStrategy.ADAPTER_LEVEL);
        } else if (queueConfig.getQueueStrategy() != QueueStrategy.ADAPTER_LEVEL) {
            logger.error("Queue strategy " + queueConfig.getQueueStrategy() + "not yet supported. Dafault to " + QueueStrategy.ADAPTER_LEVEL + ".");
            queueConfig.setQueueStrategy(QueueStrategy.ADAPTER_LEVEL);
        }

        if (objeto[1] != null) {
            Integer faturamentoGrupo = (Integer) objeto[1];
            relatorioHelper.setFaturamentoGrupo(faturamentoGrupo.toString());
        }

        if ("1".equals(feedbackDelivery)) {
            message.append(rl.getString("receive_immediate"));
        } else if ("4".equals(feedbackDelivery)) {
            message.append(rl.getString("receive_feedback_on_submission"));
        } else if ("3".equals(feedbackDelivery)) {
            message.append(rl.getString("receive_no_feedback"));
        } else {
            message.append(MessageFormat.format(rl.getString("feedback_available_on"), feedbackDateString));
        }

        if (type.equals("rotation")) {
            type = "angle";
        }

        if (m_dateParms != null) {
            Iterator<ReportDateParm> dateIter = m_dateParms.iterator();
            while (dateIter.hasNext()) {
                ReportDateParm parm = dateIter.next();
                parmMap.put(parm.getName(), parm.getValue(mode));
            }
        }

        if (other.getTransferMode() != getTransferMode()) return false;

        if (!(value instanceof JSONObject)) {
            throw new IllegalStateException("Internal: Value within path extraction must be a Map, not " + value.getClass());
        }

        if (!(other instanceof DoubleArrayList)) {
            super.replaceFromToWithFrom(from, to, other, otherFrom);
            return;
        }

        if (baseName == null || baseName.length() == 0) {
            baseName = "repository-";
        } else if (!baseName.endsWith("-")) {
            baseName += "-";
        }

        if (!targetSymLinkDestinationUnmapped) {
            byte[] hashValue = null;
            long committedLength = -1;
            if (null != operation.getBaselineFileGUID()) {
                Check.isTrue(operation.getEffectiveChangeType().contains(ChangeType.EDIT) == false, "operation.getEffectiveChangeType().contains(ChangeType.EDIT) == false");
                hashValue = operation.getHashValue();
                committedLength = new File(operation.getTargetLocalItem()).length();
            }
            String pendingChangeTargetServerItem = operation.getTargetServerItem();
            if (operation.getChangeType().equals(ChangeType.NONE) || operation.getChangeType().contains(ChangeType.ADD)) {
                pendingChangeTargetServerItem = null;
            }
            final ClientLocalVersionUpdate update = new ClientLocalVersionUpdate(operation.getSourceServerItem(), operation.getItemID(), operation.getTargetLocalItem(), operation.getVersionServer(), operation.getVersionServerDate(), operation.getEncoding(), hashValue, committedLength, operation.getBaselineFileGUID(), pendingChangeTargetServerItem, operation.getPropertyValues());
            asyncOp.queueLocalVersionUpdate(update);
        }

        if (needPreprocessing) {
            try {
                if (cancelAnalysis()) return false;
                preprocess();
                ngsResults.printPreprocessing();
            } catch (ApplicationException e) {
                e.printStackTrace();
                ngsResults.printFatalError("Preprocessing failed: " + e.getMessage());
                cleanBigData();
                return false;
            }
            ngsResults.setStateStart(State.QC2);
            if (cancelAnalysis()) return false;
            File[] qc2In;
            if (ngsResults.getModel().isPairEnd()) {
                File preprocessed1 = NgsFileSystem.preprocessedPE1(workDir);
                File preprocessed2 = NgsFileSystem.preprocessedPE2(workDir);
                qc2In = new File[]{preprocessed1, preprocessed2};
            } else {
                File preprocessed = NgsFileSystem.preprocessedSE(workDir);
                qc2In = new File[]{preprocessed};
            }
            try {
                QC.qcReport(qc2In, new File(workDir, NgsFileSystem.QC_REPORT_AFTER_PREPROCESS_DIR), workDir);
                QcData qcData = new QC.QcData(QC.qcPreprocessedReportFile(workDir));
                ngsResults.getModel().setReadCountAfterPrepocessing(qcData.getTotalNumberOfReads());
                ngsResults.getModel().setReadLength(qcData.getReadLength());
                ngsResults.printQC2();
            } catch (ApplicationException e1) {
                e1.printStackTrace();
                ngsResults.printFatalError("QC failed: " + e1.getMessage());
                cleanBigData();
                return false;
            }
        } else {
            ngsResults.getModel().setReadCountAfterPrepocessing(ngsResults.getModel().getReadCountInit());
        }

        if ((tlvStream[pos] & 0x1f) == 0x1f) {
            if (pos + 1 < tlvStream.length) {
                if (tlvStream[pos + 1] > 0x80) return -2;
                arrayTag = new byte[2];
                arrayTag[0] = tlvStream[pos];
                arrayTag[1] = tlvStream[++pos];
            }
        } else {
            arrayTag = new byte[1];
            arrayTag[0] = tlvStream[pos];
        }

        if (file == null) {
            EditableSchemaPropertiesPanel.this.preferences().remove(prefKey);
        } else {
            EditableSchemaPropertiesPanel.this.preferences().put(prefKey, file.getPath());
        }

        if (type.equals("member")) {
            final User user;
            try {
                user = api.getUserById(id).get();
            } catch (InterruptedException | ExecutionException e) {
                continue;
            }
            ImplPermissions permissions = new ImplPermissions(allow, deny);
            final Permissions oldPermissions = channel.getOverwrittenPermissions(user);
            if (!oldPermissions.equals(permissions)) {
                ((ImplChannel) channel).setOverwrittenPermissions(user, permissions);
                listenerExecutorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        List<UserChangeOverwrittenPermissionsListener> listeners = api.getListeners(UserChangeOverwrittenPermissionsListener.class);
                        synchronized (listeners) {
                            for (UserChangeOverwrittenPermissionsListener listener : listeners) {
                                try {
                                    listener.onUserChangeOverwrittenPermissions(api, user, channel, oldPermissions);
                                } catch (Throwable t) {
                                    logger.warn("Uncaught exception in UserChangeOverwrittenPermissionsListener!", t);
                                }
                            }
                        }
                    }
                });
            }
        }

        if (contextXml != null) {
            XmlConfiguration xmlConfiguration = new XmlConfiguration(contextXml.getURI().toURL());
            xmlConfiguration.configure(webapp);
        }

        if (wpnGrp.getAttackLogic().isInLaunchAcceptabilityRegion(tgtBelief.getPose(), MAX_FIRE_RANGE_PERCENT, wpn, pathing.getPose())) {
            logger.debug("UAV {} fired at target {}", hostUavId, tgtBelief.getTrueTargetID());
            wpnGrp.getAttackLogic().fireAtTarget(tgtBelief, wpn, hostUavId);
            tgtBelief.getTaskStatus().setAttackState(TaskState.Complete);
            tgtBelief.getTaskStatus().setAttackUAV(UAV.NULL_UAV_ID);
            tgtBelief.getTaskStatus().setAttackUpdateTimestamp(SimTime.getCurrentSimTimeMS());
            performingStartTime = 0;
        }

        if (product != null && product.get("returnable") != null && "N".equalsIgnoreCase(product.getString("returnable"))) {
            returnable = false;
        }

        if (helperLaco.getTipoRegistro().equals(AtualizarContaPreFaturadaHelper.REGISTRO_TIPO_1)) {
            if (helperLaco.getIndicadorConfirmacaoLeitura() != null) {
                if (helperLaco.getIndicadorConfirmacaoLeitura() != 0 && helperLaco.getIndicadorConfirmacaoLeitura() != 1) {
                    errors.add(ConstantesAplicacao.get("atencao.imovel_indicador_confirmacao_leitura_invalido", helperLaco.getMatriculaImovel() + "", helperLaco.getIndicadorConfirmacaoLeitura() + ""));
                    System.out.println("[IMOVEL: " + helperLaco.getMatriculaImovel() + "] atencao.imovel_indicador_confirmacao_leitura_invalido");
                }
            }
        }

        if (reader.getFileContext().isIncludesTags()) {
            lastKeyValueSize += tlen + Bytes.SIZEOF_SHORT;
        }

        if (fieldResolvableType == null) {
            return ctx.getBean(clazz);
        }

        if (!permModel.mayClaim()) {
            throw new CommandPermissionsException();
        }

        if (imageCriteriaIncluded) {
            hql += AND;
            hql += SERIES_ID_IN;
            hql += imgSelect;
            hql += imgFrom;
            hql += imgWhere;
            hql += "))";
        }

        if (!(originalTypeDeclaration.contains("<") && originalTypeDeclaration.contains(">"))) {
            return mirror.toString();
        }

        if (batchResponseDsml != null) {
            AddResponseDsml addResponseDsml = new AddResponseDsml(codec);
            LdapResult ldapResult = addResponseDsml.getLdapResult();
            setLdapResultValuesFromMonitor(ldapResult, monitor, MessageTypeEnum.ADD_REQUEST);
            ldapResult.setMatchedDn(entry.getDn());
            batchResponseDsml.addResponse(addResponseDsml);
        }

        if (!tFinanciera.getDetalles().containsKey(alumno.getCarrera_id() + alumno.getModalidad_id())) {
            throw new UMException("Los costos financieros no estan capturados para la carrera " + alumno.getCarrera() + " en la modalidad " + alumno.getModalidad());
        }

        if (group.hasDefined(REMOTE_DESTINATION_OUTBOUND_SOCKET_BINDING)) {
            for (final Property remoteDestinationOutboundSocketBindings : group.get(REMOTE_DESTINATION_OUTBOUND_SOCKET_BINDING).asPropertyList()) {
                final String outboundSocketBindingName = remoteDestinationOutboundSocketBindings.getName();
                final ModelNode binding = remoteDestinationOutboundSocketBindings.getValue();
                if (!binding.isDefined()) {
                    continue;
                }
                updates.add(getRemoteSocketBindingAddOperation(PathAddress.pathAddress(PathElement.pathElement(SOCKET_BINDING_GROUP, groupName), PathElement.pathElement(REMOTE_DESTINATION_OUTBOUND_SOCKET_BINDING, outboundSocketBindingName)), binding));
            }
        }

        if (expectedLen != cloneGroup.getCloneUnitLength()) {
            return false;
        }

        if (ta.name.length() == 0) return null;

        if (exps.ordering.length > 0) {
            state.ordering = new ExpState[exps.ordering.length];
            Val orderVal;
            for (int i = 0; i < exps.ordering.length; i++) {
                orderVal = (Val) exps.ordering[i];
                if (contains(orderVal, exps.grouping)) state.ordering[i] = orderVal.initialize(sel, ctx, Val.JOIN_REL);
                else state.ordering[i] = orderVal.initialize(sel, ctx, 0);
                joins = sel.and(joins, state.ordering[i].joins);
            }
        }

        if (!isMouseAtRest(BULLSEYE_HIDE_TIMEOUT_MILLIS)) {
            g.setColor(ColorUtils.setTransparencyToColor(Color.CYAN, 180));
            int xBullseye = image.getWidth() - (ZOOM_LAYER_BOX_SIZE / 2 + 1) - 3;
            if (mouseX > (image.getWidth() / 2)) xBullseye = (ZOOM_LAYER_BOX_SIZE / 2 + 1) - 3;
            g.drawRect(xBullseye, image.getHeight() - (ZOOM_LAYER_BOX_SIZE / 2 + 1) - 3, 6, 6);
        }

    }

}
