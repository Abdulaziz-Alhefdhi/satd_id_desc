public class SATD {

    public void WrapperMethod() {

        if (uuid.version() == 2) return;

        if (myTotal < myDone + work || myDone + work < 0) {
            LOG.warn("advance(work): work is too big: total=" + myTotal + "; done=" + myDone + "; work=" + work);
            myDone = myTotal;
        } else {
            myDone += work;
        }

        if (vetoresInspecionados[i] != null) {
            vetoresInspecionados[i].reseta();
        }

        if (i < 0) {
            throw new EhcacheXAException("time out has to be > 0, but was " + i, XAException.XAER_INVAL);
        }

        if (file.isFile() && file.getPath().toLowerCase().endsWith(ChrisConstants.DEFAULT_FILE_EXTENSION)) {
            NetcdfFile ncFile = null;
            try {
                ncFile = NetcdfFileOpener.open(file.getAbsolutePath());
                if (ncFile == null) {
                    return DecodeQualification.UNABLE;
                }
                if (isSensorTypeAttributeCorrect(ncFile)) {
                    return DecodeQualification.INTENDED;
                }
            } catch (Throwable ignore) {
            } finally {
                if (ncFile != null) {
                    try {
                        ncFile.close();
                    } catch (Exception ignore) {
                    }
                }
            }
        }

        if (e.isSelected() != state) {
            executeScript("arguments[0].click();", e);
        }

        if (myProject != null && !myProject.isDisposed() && myIsViewer) {
            final PsiFile psiFile = PsiDocumentManager.getInstance(myProject).getPsiFile(editor.getDocument());
            if (psiFile != null) {
                DaemonCodeAnalyzer.getInstance(myProject).setHighlightingEnabled(psiFile, true);
            }
        }

        if ((renderableComplexText.getRawText().length() > textLayout.getCharacterCount()) && startPosIntValue >= 0) {
            text = renderableComplexText.getRawText().substring(startPosIntValue, textLayout.getCharacterCount() + startPosIntValue);
        } else {
            text = renderableComplexText.getRawText();
        }

        if (!section.toLowerCase().startsWith(PRIVILEGE_PREFIX)) {
            DBModelAuthorizable authorizable = DBModelAuthorizables.from(section);
            if (authorizable == null) {
                String msg = "No authorizable found for " + section;
                throw new ConfigurationException(msg);
            }
            result.add(authorizable);
        }

        if (!(geoCoding instanceof MapGeoCoding) && !(geoCoding instanceof CrsGeoCoding)) {
            final String message = String.format("The product %s is not reprojected to a map.\n" + "Un-projected raster data is not well supported by other GIS software.\n" + "\n" + "Do you want to export the product without a reprojection?", product.getName());
            final int answer = JOptionPane.showConfirmDialog(VisatApp.getApp().getMainFrame(), message, getText(), JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (answer != JOptionPane.YES_OPTION) {
                return null;
            }
        }

        if (e.prev.getBot().equals(e.prev.getTop())) {
            e = e.next;
        }

        if (GXT.isWebKit && type == Event.ONCLICK && focusable) {
            if (getElement().getTagName().equals("input") || eventTarget.getPropertyString("__eventBits") == null) {
                focus();
            }
        }

        if (compilerManager == null) {
            return;
        }

        if (parentCategoryId == null || parentCategoryId.equals("ROOT") || (currentDataCategoryId != null && currentDataCategoryId.equals(parentCategoryId)) || getAll) {
            categoryNode.put("kids", subCategoryIds);
        }

        if ("root".equals(cldrBundles[0])) {
            assert parentsMap.isEmpty();
            parentsMap.putAll(myMap);
        }

        if (enabled && action instanceof ActionGroup) {
            presentation.setEnabledAndVisible(true);
        } else if (!enabled) {
            presentation.setEnabledAndVisible(enabled);
        }

        if (parseIndex < messageLength) {
            if (inputdata[parseIndex] == OBJECT_AGAIN || inputdata[parseIndex] == OBJECT_BEGIN)
                return readObject(di, BonaPortable.class);
        }

        if (formats != null && formats.containsKey(qualityInfo)) {
            formatinfo = formats.get(qualityInfo);
            audioCodec = formatinfo[3];
            audioBitrate = formatinfo[4];
            videoCodec = formatinfo[0];
        }

        if (runner instanceof GeoWaveITRunner) {
            itRunner = (GeoWaveITRunner) runner;
        }

        if (retry == 5) {
            return false;
        }

        if (!this.listBoxMMLError.isHovering()) super.handleMouseInput();

        if (!(exprParent instanceof NewExpr) && !(exprParent instanceof IsExpr) && !(exprParent instanceof AsExpr)) {
            ClassDeclaration classDeclaration = getScope().getClassDeclaration();
            if (classDeclaration != null) {
                if (isQualified()) {
                    if (exprParent instanceof ApplyExpr) {
                        classDeclaration.addInitIfGlobalVar(getQualifier());
                    } else {
                        classDeclaration.addInitIfClassOrGlobalVar(getQualifier());
                    }
                }
                if (!isQualifier()) {
                    classDeclaration.addInitIfClassOrGlobalVar(this);
                }
            }
        }

        if (!line.startsWith("WARNING: linker: ")) {
            pmPath = line;
            break;
        }

        if (type == null) {
            System.err.println("Mounted.restore: could not restore equipment type \"" + typeName + "\"");
            return;
        }

        if (functionManager.containerLTCControl.isEmpty()) {
            functionManager.containerLTCControl = new XdaqApplicationContainer(functionManager.containerXdaqApplication.getApplicationsOfClass("LTCControl"));
        }

        if (StringUtil.compareVersionNumbers(sdkVersion, "4") < 0) {
            if (StringUtil.compareVersionNumbers(sdkVersion, "3.1") < 0) return "1.0";
            if (StringUtil.compareVersionNumbers(sdkVersion, "3.2") < 0) return "1.1";
            if (StringUtil.compareVersionNumbers(sdkVersion, "3.3") < 0) return "1.5";
            if (StringUtil.compareVersionNumbers(sdkVersion, "3.4") < 0) return "1.5";
            if (StringUtil.compareVersionNumbers(sdkVersion, "3.5") < 0) return "1.5.2";
            return "1.5.3";
        }

        if (assigneeUpdatedCount > 1) {
            return originalAssignee;
        } else {
            return assignee;
        }

        if (isPassableWorkaround(access, x, y + 1, z, minX - x, minY - (y + 1), minZ - z, nodeAbove, maxX - minX, maxY - minY, maxZ - minZ, 1.0)) {
            return AlmostBoolean.YES;
        }

        if (rexNode.getType().getFamily() == SqlTypeFamily.DATE || rexNode.getType().getFamily() == SqlTypeFamily.TIMESTAMP) {
            extractionFunction = TimeExtractionFunction.createDefault(druidQuery.getConnectionConfig().timeZone());
        } else {
            extractionFunction = null;
        }

        if (newStart != selectionStart || newEnd != selectionEnd || newBias != biasLeft) {
            int newStartLine = getLineOfOffset(newStart);
            int newEndLine = getLineOfOffset(newEnd);
            if (painter.isBracketHighlightEnabled()) {
                if (bracketLine != -1) painter.invalidateLine(bracketLine);
                updateBracketHighlight(end);
                if (bracketLine != -1) painter.invalidateLine(bracketLine);
            }
            painter.invalidateLineRange(selectionStartLine, selectionEndLine);
            painter.invalidateLineRange(newStartLine, newEndLine);
            document.addUndoableEdit(new CaretUndo(selectionStart, selectionEnd));
            selectionStart = newStart;
            selectionEnd = newEnd;
            selectionStartLine = newStartLine;
            selectionEndLine = newEndLine;
            biasLeft = newBias;
            fireCaretEvent();
        }

        if (jbossVersion.trim().startsWith("5")) {
            return JBOSS_AS5_PLUGIN_NAME;
        } else {
            return JBOSS_AS4_PLUGIN_NAME;
        }

        if (state instanceof DebuggerRunProfileState) {
            debugger = ((DebuggerRunProfileState) state).getDebuggerConfiguration().getDebugger();
        } else {
            throw new ExecutionException("Unknown Run Profile State");
        }

        if (!has_special && len <= 8) {
            String low = input.toLowerCase();
            if (low.equals("node") || low.equals("edge") || low.equals("graph") || low.equals("digraph") || low.equals("subgraph") || low.equals("strict")) {
                has_special = true;
            }
        }

        if (sakaiId.startsWith("/sam_pub/")) externalId = sakaiId.substring("/sam_pub/".length());
        else if (sakaiId.startsWith("/assignment/"))
            externalId = "/assignment/a/" + gradebookUid + "/" + sakaiId.substring("/assignment/".length());
        else if (sakaiId.startsWith("/")) continue;
        else if (sakaiId.indexOf("-") >= 0) externalId = "/assignment/a/" + gradebookUid + "/" + sakaiId;
        else externalId = sakaiId;

        if (parameters.isDefined("return_view")) {
            String returnView = parameters.get("return_view", null);
            httpContext.setSessionAttribute("document_edit_return_view", returnView);
        }

        if (clientid != null) {
            action.put("cid", clientid);
        }

        if (test.getTodir() == null) {
            test.setTodir(getProject().resolveFile("."));
        }

        if (accountType.getValue().equals(org.mifos.accounts.util.helpers.AccountTypes.LOAN_ACCOUNT)) {
            LoanScheduleEntity loanScheduleEntity = (LoanScheduleEntity) actionDates;
            for (AccountFeesActionDetailEntity actionFees : loanScheduleEntity.getAccountFeesActionDetails()) {
                session.delete(actionFees);
            }
        }

        if (incomingTs < lastIncomingTs) {
            System.out.println("Duplicate");
            continue;
        }

        if (v instanceof org.apache.geode.Delta && getRegion().isUsedForPartitionedRegionBucket()) {
            int vSize;
            Object ov = basicGetOldValue();
            if (ov instanceof CachedDeserializable && !GemFireCacheImpl.DELTAS_RECALCULATE_SIZE) {
                vSize = ((CachedDeserializable) ov).getValueSizeInBytes();
            } else {
                vSize = CachedDeserializableFactory.calcMemSize(v, getRegion().getObjectSizer(), false);
            }
            v = CachedDeserializableFactory.create(v, vSize, getRegion().getCache());
            basicSetNewValue(v, true);
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) students = _students;
        else students = CourseLocalServiceUtil.getStudentsFromCourse(companyId, courseGroupCreatedId);

        if (company == null ? that.company != null : !company.equals(that.company)) {
            return false;
        }

        if (!this.statusService.addUploadWhenNotExistent(item.getName(), request.getContentLength())) continue;

        if ("urn:ogc:def:crs:OGC:1.3:CRS84".equals(bbox.getCrs())) {
            bbox.setCrs("EPSG:4326");
        }

        if (sidemenuDialog.getClientProperty("cn1$firstShow") == null) {
            sidemenuDialog.setAnimateShow(false);
            sidemenuDialog.setVisible(false);
            sidemenuDialog.show(0, 0, 0, dw - v);
            sidemenuDialog.disposeToTheLeft();
            sidemenuDialog.setVisible(true);
            sidemenuDialog.putClientProperty("cn1$firstShow", Boolean.TRUE);
            sidemenuDialog.setAnimateShow(draggedX < 1);
        }

        if (response.type().equalTo(MOVEMENTTRANSPORT) && response.role().equalTo(PLACE)) {
            warnings.add("Response " + response + " contains a Movement.Transport-Place argument. It will be ignored during scoring");
        }

        if (!userMap.containsKey("id")) {
            return userMap;
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.GTK)) {
            final GtkSelectionAdapter selectionAdapter = new GtkSelectionAdapter();
            combo.addKeyListener(selectionAdapter);
            combo.addModifyListener(selectionAdapter);
        }

        if (field.getJavaType() == JavaType.BOOLEAN) {
            try {
                return Integer.parseInt(value) != 0;
            } catch (NumberFormatException e) {
                return super.convertToPropertyType(entityType, propertyPath, value);
            }
        } else if (field.getJavaType() == JavaType.ENUM) {
            EnumDescriptor enumType = field.getEnumType();
            EnumValueDescriptor enumValue;
            try {
                enumValue = enumType.findValueByNumber(Integer.parseInt(value));
            } catch (NumberFormatException e) {
                enumValue = enumType.findValueByName(value);
            }
            if (enumValue == null) {
                throw log.getInvalidEnumLiteralException(value, enumType.getFullName());
            }
            return enumValue.getNumber();
        }

        if (prebuiltQuestionnaire == null) {
            questionnaire.addIdentifier().setSystem("urn:ietf:rfc:3986").setValue(questionnaireId);
            questionnaire.setVersion(profile.getVersion());
            questionnaire.setStatus(convertStatus(profile.getStatus()));
            questionnaire.setDate(profile.getDate());
            questionnaire.setPublisher(profile.getPublisher());
            Questionnaire.QuestionnaireItemComponent item = new Questionnaire.QuestionnaireItemComponent();
            questionnaire.addItem(item);
            item.getConcept().addAll(profile.getCode());
            questionnaire.setId(nextId("qs"));
        }

        if (requestProperties != null) {
            if ((requestProperties.toString()).equals("{prop.requester=MultiSpectral}")) {
                return null;
            }
        }

        if (!metadataPackage.getFilenameBase().equals("Liberia_Concepts")) {
            Integer actualVersion = installedPackage == null ? null : installedPackage.getVersion();
            assertEquals("Failed to install " + metadataPackage.getFilenameBase() + ". Expected version: " + metadataPackage.getVersion() + " Actual version: " + actualVersion, metadataPackage.getVersion(), actualVersion);
        } else {
            assertNull(installedPackage);
        }

        if (subscription instanceof IdentitiesSubscription) to = "Identities";
        else if (subscription instanceof TrustsSubscription) to = "Trusts";
        else if (subscription instanceof ScoresSubscription) to = "Scores";
        else {
            throw new UnsupportedOperationException("BeginSynchronizationNotification for unknown Subscription type: " + subscription);
        }

        if ("sleep interrupted".equals(message)) {
            logger.info("Scan aborted on request." + message);
            throw new ScanInterruptedException(message, e.getStackTrace());
        }

        if (key.getName().equals("readMode")) {
            continue;
        }

        if (innerFragments != null) {
            for (DiffFragment innerFragment : innerFragments) {
                int innerStart = side.getStartOffset(innerFragment);
                int innerEnd = side.getEndOffset(innerFragment);
                TextDiffType innerType = DiffUtil.getDiffType(innerFragment);
                innerStart += start;
                innerEnd += start;
                DiffDrawUtil.createInlineHighlighter(editor, innerStart, innerEnd, innerType);
            }
        }

        if ((data.containsKey("operation")) && (data.get("operation").equals("__deleteoperation"))) {
            data.remove("operation");
            return delete(data);
        }

        if (orgProjCode.equals("25829")) {
            query = String.format("select st_x(a.geom), st_y(a.geom) from (select st_transform(st_setsrid(st_transform(st_geomfromtext('POINT( %s %s)',25829), 23029), 111222), 4326) as geom) a;", p.getX(), p.getY(), orgProjCode, projCode);
        }

        if (location == null || !location.getProtocol().equalsIgnoreCase("file")) {
            throw new RestException("Invalid url in request", HttpStatus.BAD_REQUEST);
        }

        if (point.x >= 0) {
            Point newPoint = layer.getGridLayout().getConstraintFor(point);
            if (!request.getExtendedData().containsKey("convertOperation")) {
                if (!layer.getGridLayout().canAddFigure(newPoint)) {
                    canAdd = false;
                }
            }
        }

        if (ksdata.isRhel2()) {
            return hasPackages(ksdata.getChannel(), KickstartFormatter.FRESH_PKG_NAMES_RHEL2);
        }

        if (CGAlgorithms.isCCW(c.getCoordinates())) {
            System.out.println("Anillo exterior de poligono en orden incorrecto");
            System.out.println(c.toText());
            System.exit(-2);
        }

        if (sessao.getAttribute("menu") != null && sessao.getAttribute("menu").equals("sim")) {
            sessao.setAttribute("menu", "nao");
            sessao.setAttribute("colecaoMunicipioSelecionado", null);
        }

        if (!forkData.waitingForAllBracketsOpen()) {
            forkData.setState(ForkState.OPEN_BRACKETS_PLACED);
            iContext.delay(0);
        }

        if (useDescription == true && option.getDescription() != null && !option.getDescription().equals("")) {
            label = option.getDescription();
        }

        if (hasOwnPostponedActions() && isRunningOwnPostponedActions()) postponedActions.call();

        if (resourceLocator.getPath().endsWith(".ewig") || resourceLocator.getPath().endsWith(".ewig.gz") || resourceLocator.getPath().endsWith("ewig.map")) {
            trackNames = new String[5];
            trackNames[4] = resourceLocator.getTrackName();
            trackNames[0] = "A";
            trackNames[1] = "C";
            trackNames[2] = "G";
            trackNames[3] = "T";
        }

        if (e.getSource() == panel.getContourLinesPanel().getDistance().getDataInputField()) {
            String valueStr = panel.getContourLinesPanel().getDistance().getValue();
            double value = 0;
            try {
                value = Double.parseDouble(valueStr);
                data.setDistance(value);
            } catch (NumberFormatException ex) {
                RasterToolsUtil.debug("Imposible convertir a entero", panel, ex);
            }
        }

        if (!pkg.equals("com.android.providers.downloads") || Log.isLoggable("DownloadManager", Log.VERBOSE)) {
            EventLog.writeEvent(EventLogTags.NOTIFICATION_ENQUEUE, pkg, id, tag, userId, notification.toString());
        }

        if (Job.getJobManager().isSuspended()) {
            Job.getJobManager().resume();
        }

        if (fields == null || fields.length < BASE_FIELD_COUNT || fields.length > MAX_FIELD_COUNT) {
            throw new IllegalStateException("Invalid fields[]");
        }

        if (element instanceof ICompilationUnit || element instanceof IPackageFragment) {
            IResource resource;
            if (element instanceof ICompilationUnit) resource = ReorgUtils.getResource((ICompilationUnit) element);
            else resource = ((IPackageFragment) element).getResource();
            if (resource != null && resource.isLinked()) return createDeleteChange(resource);
        }

        if (efficiency > 0 && !isValidTool) {
            if (!isValidTool && blockId == Material.MELON_BLOCK) {
                duration = Math.min(duration, 450 / (long) Math.pow(2, efficiency - 1));
            }
        }

        if (!startFlag || buf.length() > 0) buf.append(c);

        if (macLockRequest) {
            logger.trace("DoLock.execute() : do workaround for user agent '" + userAgent + "'");
            doMacLockRequestWorkaround(transaction, req, resp);
        } else {
            if (getLockInformation(req, resp)) {
                int depth = getDepth(req);
                int lockDuration = getTimeout(req);
                boolean lockSuccess = false;
                if (exclusive) {
                    lockSuccess = resourceLocks.exclusiveLock(transaction, path, lockOwner, depth, lockDuration);
                } else {
                    lockSuccess = resourceLocks.sharedLock(transaction, path, lockOwner, depth, lockDuration);
                }
                if (lockSuccess) {
                    LockedObject lo = resourceLocks.getLockedObjectByPath(transaction, path);
                    if (lo != null) {
                        generateXMLReport(resp, lo);
                    } else {
                        resp.sendError(WebdavStatus.SC_INTERNAL_SERVER_ERROR);
                    }
                } else {
                    sendLockFailError(req, resp);
                    throw new LockFailedException();
                }
            } else {
                resp.setContentType("text/xml; charset=UTF-8");
                resp.sendError(WebdavStatus.SC_BAD_REQUEST);
            }
        }

        if (RuntimeException.class.getName().equals(e.getClass().getName()) && e.getCause() instanceof RuntimeException) {
            throw (RuntimeException) e.getCause();
        }

        if (hostname.matches("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+")) {
            InetAddress addr = InetAddress.getByAddress(getAddress(hostname));
            return !(addr.isSiteLocalAddress() || addr.isLoopbackAddress() || addr.isLinkLocalAddress() || addr.isMulticastAddress());
        }

        if (imovelCurvaAbcDebitosActionForm.getClassificacao() != null && imovelCurvaAbcDebitosActionForm.getClassificacao().equalsIgnoreCase("ESTADO")) {
            imovelCurvaAbcDebitosActionForm.limparCamposPorEstado();
        } else if (imovelCurvaAbcDebitosActionForm.getClassificacao() != null && imovelCurvaAbcDebitosActionForm.getClassificacao().equalsIgnoreCase("REGIONAL")) {
            imovelCurvaAbcDebitosActionForm.limparCamposPorRegional();
        }

        if (driver instanceof ChromeDriver) {
            java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            org.openqa.selenium.Point position = new org.openqa.selenium.Point(0, 0);
            driver.manage().window().maximize();
            driver.manage().window().setPosition(position);
            org.openqa.selenium.Dimension maximizedScreenSize = new org.openqa.selenium.Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
            driver.manage().window().setSize(maximizedScreenSize);
        } else {
            driver.manage().window().maximize();
        }

        if (!Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i) != '_') {
            return s.substring(i + 1);
        }

        if (version > 50) {
            version = 50;
        }

        if (request.getResource().getResourceDefinition().getType() == getType()) {
            String nodeHref = resultNode.getStringProperty("href");
            resultNode.getObject().setProperty(PropertyHelper.getPropertyId("host", "href"), nodeHref.substring(0, nodeHref.indexOf("/host_components/")));
        }

        if (pContext.isPreserveZCoordinate()) {
            pVarTP.z += pAmount * pAffineTP.z;
        }

        if (StringUtils.isNotEmpty(version) && !version.equals("1.0")) {
            getEngineVersion().selectByVisibleText(version);
        }

        if (parent.getDocument() instanceof HWPFOldDocument) _props = new SectionProperties();
        else _props = sepx.getSectionProperties();

        if (!codeschema.startsWith(COMPARATOR_PACKAGE)) {
            codeschema = COMPARATOR_PACKAGE + codeschema;
        }

        if (shutdownInitiated.compareAndSet(false, true)) {
            if (client instanceof Client.SessionedClient) {
                final boolean forceClose = client.getSettings().getSession().get().isForceClosed();
                final RequestMessage closeMessage = client.buildMessage(RequestMessage.build(Tokens.OPS_CLOSE).addArg(Tokens.ARGS_FORCE, forceClose)).create();
                final CompletableFuture<ResultSet> closed = new CompletableFuture<>();
                write(closeMessage, closed);
                try {
                    closed.join().all().get(cluster.connectionPoolSettings().maxWaitForSessionClose, TimeUnit.MILLISECONDS);
                } catch (TimeoutException ex) {
                    final String msg = String.format("Timeout while trying to close connection on %s - force closing - server will close session on shutdown or expiration.", ((Client.SessionedClient) client).getSessionId());
                    logger.warn(msg, ex);
                } catch (Exception ex) {
                    final String msg = String.format("Encountered an error trying to close connection on %s - force closing - server will close session on shutdown or expiration.", ((Client.SessionedClient) client).getSessionId());
                    logger.warn(msg, ex);
                }
            }
            channelizer.close(channel);
            final ChannelPromise promise = channel.newPromise();
            promise.addListener(f -> {
                if (f.cause() != null) future.completeExceptionally(f.cause());
                else future.complete(null);
            });
            channel.close(promise);
        }

        if (k1 == 1) {
            k1 += 1E-10;
        }

        if (jumpingOutOfWater) {
            if (onGround) {
                jumpingOutOfWater = false;
                this.getNavigator().clearPath();
            }
        }

        if (f == null) {
            f = project.getFile("src/" + "org.tempuri.areaservice" + "/AreaServiceImpl.java");
        }

        if ("AUTO_ACKNOWLEDGE".equals(text)) {
            return "AUTO_ ACKNOWLEDGE";
        }

        if (t == s || t.qtype == s || s.hasTag(ERROR) || s.hasTag(UNKNOWN)) {
            return true;
        } else if (s.hasTag(BOT)) {
            return false;
        }

        if (yDistance >= -0.7 && yDistance <= Math.max(cc.sfStepHeight, LiftOffEnvelope.NORMAL.getMaxJumpGain(data.jumpAmplifier) + 0.174)) {
            if (yDistance >= 0.0) {
                if (lastMove.toIsValid && lostGroundAscend(player, from, to, hDistance, yDistance, sprinting, lastMove, data, cc, tags)) {
                    return true;
                }
            }
            if (yDistance <= 0.0) {
                if (lostGroundDescend(player, from, to, hDistance, yDistance, sprinting, lastMove, data, cc, tags)) {
                    return true;
                }
            }
        } else if (yDistance < -0.7) {
            if (lastMove.toIsValid && hDistance <= 0.5) {
                if (lostGroundFastDescend(player, from, to, hDistance, yDistance, sprinting, lastMove, data, cc, tags)) {
                    return true;
                }
            }
        }

        if (o.isSUPER()) {
            return;
        }

        if (entityResponse.isRedirected()) {
            String redirectURL = entityResponse.getRedirectedUrl();
            if (redirectURL == null || redirectURL.length() == 0) {
                throw new EntityException("Failed to find redirect URL when redirect was indicated by status (" + entityResponse.getStatus() + ") for reference (" + reference + ")", reference);
            }
            entityURL = redirectURL;
            if (entityURL.startsWith(getServletContext())) {
                entityRequest.setPathString(redirectURL);
                entityResponse.reset();
                redirected = true;
            } else {
                redirected = false;
            }
        }

        if (value > 0) {
            value += Math.ulp(value);
        } else if (value < 0) {
            value -= Math.ulp(value);
        }

        if (anc instanceof EmptyTypedElement) anc = null;

        if (selectedIndex < 0) {
            selectedIndex = 0;
        }

        if (!event.getLevel().equals(Level.ALL) && !event.getLevel().equals(Level.OFF)) {
            final IThrowableProxy throwableProxy = event.getThrowableProxy();
            final LogEntry entry = throwableProxy != null ? new LogEntry(serverId, event.getFormattedMessage(), Instant.ofEpochMilli(event.getTimeStamp()).toString(), event.getLevel().toString(), event.getLoggerName(), event.getMDCPropertyMap(), event.getThreadName() != null ? event.getThreadName() : null, new Exception(throwableProxy.getMessage(), toStringArray(throwableProxy.getStackTraceElementProxyArray()), throwableProxy.getClassName())) : new LogEntry(serverId, event.getFormattedMessage(), Instant.ofEpochMilli(event.getTimeStamp()).toString(), event.getLevel().toString(), event.getLoggerName(), event.getMDCPropertyMap(), event.getThreadName() != null ? event.getThreadName() : null);
            producer.send(new ProducerRecord<>(kafkaTopic, new Gson().toJson(entry)));
        }

        if (url == null) {
            JavaModuleFacet javaModuleFacet = module.getFacet(JavaModuleFacet.class);
            IFile classesGen = javaModuleFacet == null ? null : javaModuleFacet.getClassesGen();
            if (classesGen != null) {
                try {
                    url = classesGen.getDescendant(resourceName).getUrl();
                } catch (MalformedURLException ex) {
                    String msg = "Failed to look up trace.info location for module %s";
                    Logger.getLogger(getClass()).debug(String.format(msg, module.getModuleName()), ex);
                }
            }
        }

        if (entityName.equals("Facet_Location"))
            queryString = String.format("SELECT * FROM %s USE INDEX (apiKeyIdEnd) WHERE apiKeyId=? ORDER BY end %s", entityName, sortOrder);

        if (name.equals("mainInstance")) {
            DepUtils.setMainInstance(cdp, is);
        }

        if ((sl = this.context.getStructureLoader()) != null) {
            ignorable = ((ClassBeanInfoImpl) sl.getBeanInfo()).hasElementOnlyContentModel();
        }

        if (hasNetworkConfiguration(properties)) {
            final NetworkConfigGuiceRole role = new NetworkConfigGuiceRole();
            roles.add(role);
        }

        if (!(piResponse instanceof UpdateNavigationalStateResponse)) {
            if (piResponse instanceof ErrorResponse) {
                ErrorResponse errorResponse = (ErrorResponse) piResponse;
                throw (Exception) errorResponse.getCause();
            } else {
                throw new Exception("Unexpected response type [" + piResponse + "]. Expected a UpdateNavigationResponse or an ErrorResponse.");
            }
        }

        if (!contents.containsKey(sourceKey)) {
            throw new StorageException(404, "File not found: " + sourceKey);
        }

        if (this.polys.size() > 0) {
            Polyomino poly = this.polys.get(0);
            gridWidth += poly.getWidth();
            gridHeight += poly.getHeight();
        }

        if (!ApiHelper.isLOrHigher()) {
            Log.v(TAG, "calling onPreviewReadyToStart to set one shot callback");
            mAppController.onPreviewReadyToStart();
        } else {
            Log.v(TAG, "on L, no one shot callback necessary");
        }

        if (ret == null) {
            return astore.next;
        }

        if (table.isView() || !isAccessibleTable(table)) {
            continue;
        }

        if (isEmpty()) {
            return new RemotePath(device, segments, HAS_LEADING, targetSystemSeparator);
        }

        if (name != null && NO_DIGITS.matcher(name).find()) {
            return true;
        }

        if (getSource() != null && getTarget() != null) super.paintFigure(graphics);

        if (locator.getPath().contains("cosmic")) {
            track.setRendererClass(CosmicFeatureRenderer.class);
            track.setMinimumHeight(2);
            track.setHeight(20);
            track.setDisplayMode(Track.DisplayMode.EXPANDED);
        } else {
            track.setRendererClass(IGVFeatureRenderer.class);
            track.setMinimumHeight(35);
            track.setHeight(45);
        }

        if (functionManager.containerTTCciControl.isEmpty()) {
            functionManager.containerTTCciControl = new XdaqApplicationContainer(functionManager.containerXdaqApplication.getApplicationsOfClass("TTCciControl"));
        }

        if (listOfStaticFields.contains(staticSearchField)) {
            return error("static search field defined twice: " + staticSearchField);
        }

        if (_indexElement == null) {
            loadIndex();
        }

        if (m_elemContext.m_elementURI == null) {
            String prefix1 = getPrefixPart(m_elemContext.m_elementName);
            if (prefix1 == null && EMPTYSTRING.equals(prefix)) {
                m_elemContext.m_elementURI = uri;
            }
        }

        if (fInformation == null) {
            return false;
        }

        if (changeResource != null) {
            List<JobDraftSoftware> oldJds = jobDraft.getJobDraftSoftware();
            for (JobDraftSoftware jds : oldJds) {
                if (jds.getSoftware().getResourceType().getIName().equals(resourceTypeIName))
                    jobDraftSoftwareDao.remove(jds);
                jobDraftSoftwareDao.flush(jds);
            }
            if (changeResource.intValue() == -1)
                return "redirect:/jobsubmit/software/" + resourceTypeIName + "/" + jobDraftId + ".do";
            JobDraftSoftware newJdr = new JobDraftSoftware();
            newJdr.setJobDraftId(jobDraftId);
            newJdr.setSoftwareId(changeResource);
            jobDraftSoftwareDao.save(newJdr);
            return "redirect:/jobsubmit/software/" + resourceTypeIName + "/" + jobDraftId + ".do";
        }

        if (GeneManager.hasGeneDomainInput()) {
            n = 1;
        }

        if (TipoResolucionEnum.provisional.name().equals(resolucion.resolucion.tipo)) {
            cambiaEstadoProvisional(linea);
        } else {
            cambiaEstadoDefinitiva(linea);
        }

        if (digit) {
            sb.append("NUMBER");
        } else {
            if (distSim == null) {
                distSim = new DistSimClassifier(wordClassesFile, false, true);
            }
            String cluster = distSim.distSimClass(word);
            if (cluster == null) {
                cluster = "NULL";
            }
            sb.append(cluster);
        }

        if (this.getLine() < that.getLine()) {
            return -1;
        }

        if (type.equals("") || type.equals("crafting item")) {
            return KoLConstants.NO_CONSUME;
        }

        if (EmbeddedDocumentRelations.isSubDocParentEntityType(collectionName)) {
            results = new ArrayList<Entity>();
            for (Entity entity : records) {
                if (update(collectionName, entity, false)) {
                    results.add(entity);
                }
            }
            return results;
        }

        if ((temp = StringUtils.trimToNull(x.getEnrolledStartDate())) != null) ps.setString(parameterPosition++, temp);

        if (sourceField.getType() instanceof ReferenceType) {
        } else if (sourceField.getType() instanceof EnumType) {
        }

        if (!e.getMessage().equals("Atleast 1 bipartite source should exist")) {
            throw e;
        }

        if (iterator instanceof MergingSamRecordIterator)
            return ((MergingSamRecordIterator) iterator).getMergedHeader();
        else return null;

        if (result.isEmpty() && geometry.intersects(mask)) {
            try {
                result = EnhancedPrecisionOp.intersection(geometry, mask);
            } catch (Exception e2) {
                result = geometry;
            }
        }

        if ("0.5.0".equals(GeneralConfig.version)) {
            return super.getMetaFromState(state) * 3;
        }

        if (this.gamesRunning.size() == 1) {
            for (GameClientController controller : this.gamesRunning) {
                this.closeController(controller);
                this.openDeckBuilderWindow = null;
            }
        }

        if (visible) previewGrid.onResize();

        if (needsTrimPeersWorkaround) while (peers.size() >= maxConnectedPeers) peers.remove(peers.size() - 1);

        if (isPipeToOutput() && (getUpdateByRevision() != null || getUpdateByDate() != null)) {
            ListIterator it = requests.listIterator();
            while (it.hasNext()) {
                Object req = it.next();
                if (req instanceof EntryRequest) {
                    EntryRequest eReq = (EntryRequest) req;
                    Entry entry = eReq.getEntry();
                    if (entry.getRevision().startsWith("-")) {
                        entry.setRevision(entry.getRevision().substring(1));
                    }
                    it.set(new EntryRequest(entry));
                    it.add(new UnchangedRequest(entry.getName()));
                }
            }
        }

        if (Files.exists(tmp.resolve(path.relativize(file)))) {
            Files.copy(tmp.resolve(path.relativize(file)), file, StandardCopyOption.REPLACE_EXISTING);
        }

        if (tgtShapes.size() == srcShapes.size()) {
            for (int i = 0; i < tgtShapes.size(); i++) {
                XSLFShape s1 = srcShapes.get(i);
                XSLFShape s2 = tgtShapes.get(i);
                s2.copy(s1);
            }
        } else {
            clear();
            for (XSLFShape shape : srcShapes) {
                XSLFShape newShape;
                if (shape instanceof XSLFTextBox) {
                    newShape = createTextBox();
                } else if (shape instanceof XSLFFreeformShape) {
                    newShape = createFreeform();
                } else if (shape instanceof XSLFAutoShape) {
                    newShape = createAutoShape();
                } else if (shape instanceof XSLFConnectorShape) {
                    newShape = createConnector();
                } else if (shape instanceof XSLFPictureShape) {
                    XSLFPictureShape p = (XSLFPictureShape) shape;
                    XSLFPictureData pd = p.getPictureData();
                    XSLFPictureData pdNew = getSheet().getSlideShow().addPicture(pd.getData(), pd.getType());
                    newShape = createPicture(pdNew);
                } else if (shape instanceof XSLFGroupShape) {
                    newShape = createGroup();
                } else if (shape instanceof XSLFTable) {
                    newShape = createTable();
                } else {
                    _logger.log(POILogger.WARN, "copying of class " + shape.getClass() + " not supported.");
                    continue;
                }
                newShape.copy(shape);
            }
        }

        if (name.startsWith(EO_PREFIX)) {
            name = "eop" + name.substring(2);
        }

        if (extensionMetaInfoFile.exists()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Reading extension version metainfo from file " + extensionMetaInfoFile.getAbsolutePath());
            }
            try {
                metaInfoXml = unmarshaller.unmarshal(ExtensionMetainfoXml.class, extensionMetaInfoFile);
            } catch (Exception e) {
                metaInfoXml = new ExtensionMetainfoXml();
                metaInfoXml.setValid(false);
                metaInfoXml.addError("Unable to parse extension metainfo.xml file at location: " + extensionMetaInfoFile.getAbsolutePath());
            }
        }

        if (workload == null) {
            File workload_file = this.getWorkloadFile(ProjectType.TM1);
            workload = new Workload(catalogContext.catalog);
            ProcedureNameFilter filter = new ProcedureNameFilter(false);
            long total = 0;
            for (String proc_name : TARGET_PROCEDURES) {
                filter.include(proc_name, PROC_COUNT);
                total += PROC_COUNT;
            }
            ((Workload) workload).load(workload_file, catalogContext.database, filter);
            assertEquals(total, workload.getTransactionCount());
            assertEquals(TARGET_PROCEDURES.length, workload.getProcedureHistogram().getValueCount());
        }

        if (ExternalizableBusinessObjectUtils.isExternalizableBusinessObject(businessObjectClass)) {
            ModuleService moduleService = getKualiModuleService().getResponsibleModuleService(businessObjectClass);
            businessObjectClass = moduleService.getExternalizableBusinessObjectDictionaryEntry(businessObjectClass).getDataObjectClass();
        }

        if (dataWidth > useBitWidth) {
            long missingVal = BufrNumbers.missingValue(useBitWidth);
            if ((value & missingVal) != value) value = missingVal;
        }

        if ((pnt.x < robotHalfSize) || (pnt.x > (BattleField.x - robotHalfSize))) return true;

        if (handleEx) {
            DeviceId exDevice = getDeviceId(exId);
            if (!isMaster(exDevice)) {
                log.info("NetConfListener: not master, ignoring config for expath {}", exId);
                return;
            }
            initiateConnection(exDevice);
            Filter filt = Filter.builder().build();
            DataNode exnode = cfgService.readNode(exId, filt);
            configUpdate(exnode, exDevice, exId);
        }

        if (allowAdmin && AccountIdentifiers.SYSTEM_ACCOUNT.equals(requestUser.getAccountAlias())) {
            return iamPermissionsAllow(true, authContext, requiredActions, policyResourceInfo, Option.none(), resourceType, resourceId, resourceAllocationSize);
        }

        if (m_bBase64mode && s_bUseUglyHackToForceCallToFlushInJava5 && out.limit() != (int) (MAX_BYTES_PER_CHAR * in.limit()))
            return CoderResult.OVERFLOW;

        if (ex == cause || cause == null) break;
        else ex = cause;

        if (isFalse(condition)) {
            if (elseBranch != null) {
                replaceStatement(ifStatement, (GrStatement) elseBranch.copy());
            } else {
                ifStatement.delete();
            }
        } else {
            replaceStatement(ifStatement, (GrStatement) thenBranch.copy());
        }

        if (oldValue.isEmpty()) {
            oldValue = "null";
        }

        if (model instanceof IFilterColumnMixin && !(model instanceof DoubleRankColumnModel)) {
            final IFilterColumnMixin m = (IFilterColumnMixin) model;
            final GLButton b = new GLButton();
            b.setSelected(m.isFiltered());
            final ISelectionCallback callback = new ISelectionCallback() {
                @Override
                public void onSelectionChanged(GLButton button, boolean selected) {
                    m.editFilter(get(HIST), context);
                }
            };
            b.setCallback(callback);
            filterChangedListener = new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    b.setCallback(null);
                    b.setSelected(m.isFiltered());
                    b.setCallback(callback);
                    repaint();
                }
            };
            model.addPropertyChangeListener(IFilterColumnMixin.PROP_FILTER, filterChangedListener);
            buttons.addButton(b, "Edit the filter of this column", RenderStyle.ICON_FILTER_DISABLED, RenderStyle.ICON_FILTER);
        }

        if (ensureSameSize && !(device instanceof Printer)) {
            GC tmpGC = new GC(device);
            Font tmpFont = new Font(device, fontData);
            tmpGC.setFont(tmpFont);
            if (tmpGC.textExtent(Az).x > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                while (tmpGC.textExtent(Az).x > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                    tmpFont.dispose();
                    height--;
                    fontData.setHeight(height);
                    tmpFont = new Font(device, fontData);
                    tmpGC.setFont(tmpFont);
                }
            } else if (tmpGC.textExtent(Az).x < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                while (tmpGC.textExtent(Az).x < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                    tmpFont.dispose();
                    height++;
                    fontData.setHeight(height);
                    tmpFont = new Font(device, fontData);
                    tmpGC.setFont(tmpFont);
                }
            }
            tmpFont.dispose();
            tmpGC.dispose();
        }

        if (munition.getMunitionType() == AmmoType.M_DAVY_CROCKETT_M) {
            cost *= 50;
        }

        if (columns) {
            if (counter == 0) {
                leftPan.addView(tmpPan);
            } else if (counter == 1) {
                rightPan.addView(tmpPan);
            }
            counter++;
            if (counter == 2) counter = 0;
        } else ll.addView(tmpPan);

        if (hostname.contains("amazonaws.com")) return "amazonws";

        if (WebCheckBoxStyle.animated) {
            WebTimer.repeat("WebCheckBoxList.animator", WebCheckBoxUI.UPDATE_DELAY, new ActionListener() {
                private int left = WebCheckBoxUI.MAX_DARKNESS + 1;

                @Override
                public void actionPerformed(final ActionEvent e) {
                    if (left > 0) {
                        repaint(getCellBounds(index, index));
                        left--;
                    } else {
                        ((WebTimer) e.getSource()).stop();
                    }
                }
            });
        } else {
            repaint(getCellBounds(index, index));
        }

        if (!smartScrapeList.isEmpty() && !GraphicsEnvironment.isHeadless()) {
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
                        for (Movie movie : smartScrapeList) {
                            MovieChooserDialog dialogMovieChooser = new MovieChooserDialog(movie, smartScrapeList.size() > 1 ? true : false);
                            if (!dialogMovieChooser.showDialog()) {
                                break;
                            }
                        }
                    }
                });
            } catch (Exception e) {
                LOGGER.error("SmartScrape crashed " + e.getMessage());
            }
        }

        if (containsFilter(filterMap, "asdf")) {
            removeAgreed(missingItems);
        }

        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            List<CellInfo> cellInfos = mTelephonyManager.getAllCellInfo();
            if (cellInfos != null) {
                for (CellInfo cellInfo : cellInfos) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoLte) {
                            CellSignalStrengthLte signalStrengthLte = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            try {
                                Field fieldRsrq = CellSignalStrength.class.getDeclaredField("mRsrq");
                                fieldRsrq.setAccessible(true);
                                int rsrq = (Integer) fieldRsrq.get(signalStrengthLte);
                                Log.v(TAG, "getLteRsrq: found " + rsrq + " using CellInfoLte.mRsrq");
                                if (rsrq < 0) return rsrq;
                            } catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException e) {
                                Log.e(TAG, "getRsrq Could not get Rsrq", e);
                            }
                        }
                    }
                }
            }
        }

        if (val[j] == ugly[i]) val[j] = primes[j] * ugly[ps[j]++];

        if (result != notFound) {
            return result;
        } else {
            reader.sourcePos = originalPos;
            reader.sourceLen = originalLen;
            return result;
        }

        if (TransformationContext.getPort() != null) {
            return true;
        }

        if (profile.getKickstartDefaults() == null) {
            continue;
        }

        if (regExp.test(userMessage)) {
            Log.debug("Mesage valid for notification");
            final MatchResult m = regExp.exec(userMessage);
            final String user = m.getGroup(1);
            NotifyUser.avatar(downUtils.getUserAvatar(user), i18n.t("User [%s] says «[%s]»", user, m.getGroup(2)), new ClickHandler() {
                @Override
                public void onClick(final ClickEvent event) {
                    ShowChatDialogEvent.fire(eventBus, true);
                }
            });
        } else {
            NotifyUser.info(userMessage);
        }

        if (region instanceof LineWiseSelection) {
            selection = (LineWiseSelection) region;
        } else {
            selection = new LineWiseSelection(editorAdaptor, region.getStart(), region.getEnd());
        }

        if (JSSEImplementationClass.equals(className)) {
            return new org.apache.tomcat.util.net.jsse.JSSEImplementation();
        }

        if (onSourceTime.equals("1.0")) {
            return inst.getPolarimetry() == YesNoType.YES ? MICHELLE_POL_SPEC : MICHELLE_SPEC;
        }

        if (c.getUI() instanceof WebRootPaneUI) {
            final JComponent titleComponent = ((WebRootPaneUI) c.getUI()).getTitleComponent();
            if (titleComponent != null) {
                titleComponent.repaint();
            }
        }

        if (m_disableOutputEscapingStates.peekOrFalse() || (!m_escaping)) {
            charactersRaw(chars, start, length);
            if (m_tracer != null) super.fireCharEvent(chars, start, length);
            return;
        }

        if (!Strings.isNullOrEmpty(getProgramArguments(configuration))) {
            logger.warning("App Engine Local Server currently ignores program arguments");
        }

        if (OSUtils.isWindows() && lowerCaseFolderPath.contains(System.getenv("ProgramFiles").toLowerCase())) {
            return false;
        }

        if ("new".equals(subNameElement.getName())) {
            return methodElement.getPackageName();
        }

        if (is.stackTagCompound == null) return;

        if (!isRunning()) return 0;

        if ("ICD10".equalsIgnoreCase(OscarProperties.getInstance().getProperty("COMMUNITY_ISSUE_CODETYPE").toUpperCase())) {
            issue = issueDao.findIssueByCode(cachedDemographicIssue.getFacilityDemographicIssuePk().getIssueCode());
        }

        if (filterQuery != null && !filterQuery.isEmpty()) {
            SavedSearchFilterQuery ssfq = new SavedSearchFilterQuery(filterQuery, savedSearch);
            savedSearch.getSavedSearchFilterQueries().add(ssfq);
        }

        if (originalTree.hasTag(VARDEF)) {
            this.env.info.scope.remove(((JCVariableDecl) originalTree).sym);
        }

        if (first) {
            first = false;
            timeRangeList.deselectAll();
            return;
        }

        if (SystemConfig.RELEASE_TO_DAVID) {
            navigationView.set(FragmentPage.SETTING_LOGIN);
        } else {
            navigationView.set(FragmentPage.USER_HOME);
        }

        if (fields[i].getName().indexOf("$") == -1) {
            int modifiers = fields[i].getModifiers();
            if (Modifier.isStatic(modifiers)) {
                if (Modifier.isFinal(modifiers)) {
                    continue;
                } else {
                    if (!oneFailed) {
                        oneFailed = true;
                    }
                    badField = true;
                }
            }
        }

        if (fDOMSerializer == null) {
            fDOMSerializer = (DOM3Serializer) serializer.asDOM3Serializer();
        }

        if (resourceUri.endsWith(DS_STORE_SUFFIX)) {
            return;
        }

        if (prebuiltQuestionnaire == null) {
            questionnaire.addIdentifier().setSystem("urn:ietf:rfc:3986").setValue(questionnaireId);
            questionnaire.setVersion(profile.getVersion());
            questionnaire.setStatus(convertStatus(profile.getStatus()));
            questionnaire.setDate(profile.getDate());
            questionnaire.setPublisher(profile.getPublisher());
            questionnaire.setGroup(new Questionnaire.GroupComponent());
            questionnaire.getGroup().getConcept().addAll(profile.getCode());
            questionnaire.setId(nextId("qs"));
        }

        if (tag.name.equalsIgnoreCase("a") && tag.content.length() < 2048) {
            String href = tag.opts.getProperty("href", EMPTY_STRING);
            href = CharacterCoding.html2unicode(href);
            AnchorURL url;
            if ((href.length() > 0) && ((url = absolutePath(href)) != null)) {
                if (followDenied()) {
                    String rel = tag.opts.getProperty("rel", EMPTY_STRING);
                    if (rel.length() == 0) rel = "nofollow";
                    else if (rel.indexOf("nofollow") < 0) rel += ",nofollow";
                    tag.opts.put("rel", rel);
                }
                tag.opts.put("text", stripAllTags(tag.content.getChars()));
                tag.opts.put("href", url.toNormalform(true));
                url.setAll(tag.opts);
                this.addAnchor(url);
            }
            this.evaluationScores.match(Element.apath, href);
        }

        if (foldableFigure == null) break;

        if (!(SPropertyOperations.getString(SNodeOperations.getNodeAncestor(expr, MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).equals("getScope"))) {
            {
                MessageTarget errorTarget = new NodeMessageTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(expr, "Should be in getScope method", "r:c2d05fc3-fe25-4093-95ce-8e3356e61084(jetbrains.mps.lang.scopes.typesystem)", "8077936094962969214", null, errorTarget);
            }
        }

        if ((declaredType == Map.class || declaredType == ImmutableMap.class) && map.size() < 2) {
            return false;
        }

        if (renderable.getBlock().getGenusName().equalsIgnoreCase("sum")) {
            matchingBlocks.add(new TextualFactoryBlock((FactoryRenderableBlock) renderable, "+ [number]"));
        }

        if (fOperationCode == ITextOperationTarget.REDO) {
            return;
        }

        if (defaultValue instanceof Cloneable) {
            Object clone = ElkReflect.clone(defaultValue);
            if (clone == null) {
                throw new IllegalStateException("Couldn't clone property '" + id + "'. " + "Make sure it's type is registered with the " + ElkReflect.class.getSimpleName() + " utility class.");
            }
            return clone;
        } else {
            return defaultValue;
        }

        if (currentPage.getOwner() == null) createGroupList(form, null, "", "#{simplePageBean.selectedGroups}");

        if (request.transitModes == null || request.transitModes.isEmpty() || request.transitModes.contains(TransitModes.TRANSIT)) {
            request.transitModes = EnumSet.allOf(TransitModes.class);
        }

        if (params != null) {
            _guid = (String) params.get("guid");
            _zoneId = (String) params.get("zone");
            _podId = (String) params.get("pod");
            _clusterId = (String) params.get("cluster");
            _agentIp = (String) params.get("ipaddress");
            _name = name;
            _clusterGuid = (String) params.get("cluster.guid");
            _username = (String) params.get("url");
            _password = (String) params.get("password");
            _username = (String) params.get("username");
            _configureCalled = true;
        }

        if (isInsertUseStatement && nextIndex > 0 && this.list[nextIndex].getChangeKind() == RewriteEvent.INSERTED && this.list[nextIndex - 1].getChangeKind() == RewriteEvent.UNCHANGED && this.list[nextIndex].getNewValue() instanceof UseStatement && this.list[nextIndex - 1].getOriginalValue() instanceof UseStatement) {
            if (((UseStatement) this.list[nextIndex].getNewValue()).getStart() > 0) {
                return ((UseStatement) this.list[nextIndex].getNewValue()).getStart();
            }
        }

        if (Compatibility.fileExists(mozillaPath, "components/libwidget_gtk.so")) {
            browser.dispose();
            SWT.error(SWT.ERROR_NO_HANDLES, null, " [Mozilla GTK2 required (GTK1.2 detected)]");
        }

        if (modelAdaptor.getPdbInfo().isNcsOpsPresent() && modelAdaptor.getPdbInfo().getInterface(interf.getId()) == null) {
            LOGGER.info("Skipping generation of interface coordinate file for redundant NCS interface {}", interf.getId());
            continue;
        }

        if (resourcePath.contains("..")) {
            throw new IllegalArgumentException("path must not contain any '..'");
        }

        if (ga != null) {
            sendText(ga, "OK");
        } else {
            put(SOCJoinGame.toCmd(nickname, password, host, mes.getGame()));
        }

        if (keyCode == android.view.KeyEvent.KEYCODE_BACK && e.isAltPressed()) {
            keyCode = Keys.BUTTON_CIRCLE;
            event.keyCode = keyCode;
        }

        if (!event.isCanceled() && event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK && !event.world.isRemote) {
            if (event.entityPlayer.isSneaking() && (interactedBlock == Blockss.elevatorCaller || interactedBlock == Blockss.chargingStation)) {
                event.setCanceled(interactedBlock.onBlockActivated(event.world, event.x, event.y, event.z, event.entityPlayer, event.face, 0, 0, 0));
            } else if (event.entityPlayer.getCurrentEquippedItem() != null && ModInteractionUtilImplementation.getInstance().isModdedWrench(event.entityPlayer.getCurrentEquippedItem().getItem())) {
                if (interactedBlock instanceof IPneumaticWrenchable) {
                    ((IPneumaticWrenchable) interactedBlock).rotateBlock(event.world, event.entityPlayer, event.x, event.y, event.z, ForgeDirection.getOrientation(event.face));
                }
            }
        }

        if (metadata.settings().getAsBoolean("localize_location", false)) {
            Path location = PathUtils.get(metadata.settings().get("location"));
            location = location.resolve(Integer.toString(environment.hashCode()));
            return new RepositoryMetaData(metadata.name(), metadata.type(), Settings.builder().put(metadata.settings()).put("location", location.toAbsolutePath()).build());
        } else {
            return metadata;
        }

        if (locale == null) {
            locale = UIUtils.ROOT_LOCALE;
        }

        if (href != null && "file".equals(u.getProtocol()) && href.startsWith("#")) {
            String baseFile = base.getFile();
            String newFile = u.getFile();
            if (baseFile != null && newFile != null && !newFile.startsWith(baseFile)) {
                u = new URL(base, baseFile + href);
            }
        }

        if (resource.getURL().toString().contains("com/sun/jsf-impl/main")) {
            continue;
        }

        if (!isV3Poll()) {
            PollTally tally = poll.getVoteTally();
            tally.tallyVotes();
        }

        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            int r = chart.getBackground().getRed() - 13;
            int g = chart.getBackground().getGreen() - 13;
            int b = chart.getBackground().getBlue() - 13;
            r = r > 0 ? r : 0;
            r = g > 0 ? g : 0;
            r = b > 0 ? b : 0;
            final Color background = new Color(chart.getDisplay(), r, g, b);
            chart.setBackground(background);
            chart.addDisposeListener(new DisposeListener() {
                public void widgetDisposed(DisposeEvent arg0) {
                    if (background != null && !background.isDisposed()) {
                        background.dispose();
                    }
                }
            });
        }

        if (logger.isDebugEnabled()) {
            logger.debug("Got a cancel exception while creating a krf during shutown", e);
        }

        if (ts.getLineno() == lineno || (lastExprType == TokenStream.FUNCTION && ts.getLineno() == lastExprEndLine)) {
            wellTerminated(ts, lastExprType);
        }

        if (log.isDebugEnabled()) {
            log.debug("Trying to call: " + methodCalled + " in " + o.getClass());
        }

        if (File.class == p.type || URL.class == p.type) {
            if ("directory".equals(p.key)) {
                f = f.getParentFile();
            }
            Object converted = null;
            if (URI.class.equals(p.type)) {
                converted = f.toURI();
            } else if (URL.class.equals(p.type)) {
                converted = URLs.fileToUrl(f);
            }
            if (converted != null) {
                connectionParameters.put(p.key, converted);
            } else {
                connectionParameters.put(p.key, f);
            }
            continue;
        }

        if (!(selected.get(0) instanceof EditPart)) return null;

        if (myConfig.getPlugins() != null && SetSequence.fromSet(myConfig.getPlugins()).isNotEmpty()) {
            ListSequence.fromList(libContribs).addElement(helper.createLibContributorForPlugins());
        }

        if (target.equals(Result.PI_DISABLE_OUTPUT_ESCAPING)) {
            startNonEscaping();
        } else if (target.equals(Result.PI_ENABLE_OUTPUT_ESCAPING)) {
            endNonEscaping();
        } else {
            try {
                if (m_elemContext.m_startTagOpen) {
                    closeStartTag();
                    m_elemContext.m_startTagOpen = false;
                } else if (m_cdataTagOpen) {
                    closeCDATA();
                } else if (m_needToCallStartDocument) {
                    startDocumentInternal();
                }
                if (true == m_needToOutputDocTypeDecl) outputDocTypeDecl("html");
                if (shouldIndent()) indent();
                final java.io.Writer writer = m_writer;
                writer.write("<?");
                writer.write(target);
                if (data.length() > 0 && !Character.isSpaceChar(data.charAt(0))) writer.write(' ');
                writer.write(data);
                writer.write('>');
                if (m_elemContext.m_currentElemDepth <= 0) outputLineSep();
                m_startNewLine = true;
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        if (size >= VIEW_FILESIZELIMIT) {
            directlink = jd.plugins.hoster.ImgUrCom.getBigFileDownloadlink(dl);
        }

        if (fOperationCode == ITextOperationTarget.REDO) return;

        if (context instanceof PortalRequestContext) {
            PortalRequestContext portalRC = (PortalRequestContext) context;
            UserPortalConfig config = getUserPortalConfig(portalRC);
            if (config == null) {
                HttpServletResponse response = portalRC.getResponse();
                response.sendRedirect(portalRC.getRequest().getContextPath() + "/portal-unavailable.jsp");
                portalRC.setResponseComplete(true);
                return null;
            }
            portalRC.setAttribute(UserPortalConfig.class, config);
        }

        if ((etype == EncryptedData.ETYPE_DES_CBC_CRC || etype == EncryptedData.ETYPE_DES_CBC_MD5)) {
            for (int i = 0; i < keys.length; i++) {
                ktype = keys[i].getKeyType();
                if (ktype == EncryptedData.ETYPE_DES_CBC_CRC || ktype == EncryptedData.ETYPE_DES_CBC_MD5) {
                    etypeFound = true;
                    if (versionMatches(version, keys[i].getVersionNumber())) {
                        return new KerberosKey(keys[i].getPrincipal(), keys[i].getEncoded(), etype, keys[i].getVersionNumber());
                    }
                }
            }
        }

        if (header.getContentLengthHeader() > buffer.capacity()) {
            ByteBuffer src = buffer;
            if (Logging.SHOW_FINE && LOG.isLoggable(Level.FINE)) {
                LOG.fine(MessageFormat.format("{0} Reallocating a new buffer of size {1} to replace :{2}", Thread.currentThread(), header.getContentLengthHeader(), buffer.toString()));
            }
            buffer = ByteBuffer.allocate((int) header.getContentLengthHeader());
            buffer.put(src);
            buffer.flip();
        }

        if (mURL != null) {
            throw new IllegalStateException("Setting the URL more than once not allowed");
        }

        if (isFetchCsrfToken == null) {
            isFetchCsrfToken = request.getParameter("FETCH-CSRF-TOKEN-PARAM");
        }

        if (hotel == null) {
            StringBuilder text = new StringBuilder();
            try {
                Object object = ctx.lookup("ejb/HotelReservation");
                text.append("ctx.lookup(ejb/HotelReservation)=" + object);
                text.append(", class=" + object.getClass().getName());
                @SuppressWarnings("rawtypes") Class clazz = object.getClass();
                for (Object iface : clazz.getInterfaces()) {
                    text.append(", iface=" + iface);
                }
                hotel = (HotelRegistrationRemote) object;
            } catch (Exception ex) {
                text.append(", exception=" + ex);
                try {
                    Object object = new javax.naming.InitialContext().lookup("ejava/examples/txhotel/HotelRegistrationEJB/remote");
                    text.append(", jndi.lookup(HotelRegistrationEJB)=" + object);
                    text.append(", class=" + object.getClass().getName());
                    @SuppressWarnings("rawtypes") Class clazz = object.getClass();
                    for (Object iface : clazz.getInterfaces()) {
                        text.append(", iface=" + iface);
                    }
                    hotel = (HotelRegistrationRemote) object;
                } catch (Exception ex2) {
                    text.append(", exception=" + ex2);
                }
            } finally {
                log.debug(text);
            }
        }

        if (ext.equals("gz") || ext.equals("tgz")) {
            try {
                source = new GZIPInputStream(source);
            } catch (final IOException e) {
                throw new Parser.Failure("tar parser: " + e.getMessage(), location);
            }
        }

        if ((null == shooterState.getPosition()) || (null == targetState.getPosition())) {
            return new ToHitData(TH_NULL_POSITION);
        }

        if (!tasks.add(command)) {
            throw new OutOfMemoryError("Too many runnable tasks under a key. Only " + Integer.MAX_VALUE + " can be held.");
        }

        if (!adapter.getBounds().equals(bounds)) {
            adapter.setBounds(bounds);
        }

        if (request.hasBody() && internalRequest.containsHeader("Content-Type") == false) {
            XContentType xContentType = XContentFactory.xContentType(request.body());
            if (xContentType != null) {
                internalRequest.setHeader("Content-Type", xContentType.mediaType());
            }
        }

        if (clientModule.getFinder() == null && clientModule.getAltDDs().containsKey("application-client.xml")) {
            if (clientModule.getApplicationClient() != null && clientModule.getApplicationClient().isMetadataComplete()) {
                return clientModule;
            }
        }

        if (sourceTempDir != null) {
            for (File file : sourceTempDir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if (!name.endsWith(".java")) {
                        return true;
                    }
                    return false;
                }
            })) {
                try (InputStream input = new FileInputStream(file); OutputStream output = new FileOutputStream(new File(outputDir, file.getName()))) {
                    IOUtils.copy(input, output);
                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            FileUtils.removeDir(sourceTempDir);
        }

        if (url == null) {
            url = bundle.getResource(WEB_INF_CLASSES_PATH + pResourceName);
        }

        if (tableItem.getItem().getScope() != SDependencyScope.EXTENDS) {
            dependencies.add(tableItem.getItem().copy());
        }

        if (resource instanceof WSDLResourceImpl) {
            for (TreeIterator<EObject> treeIt = resource.getAllContents(); treeIt.hasNext(); ) {
                EObject object = treeIt.next();
                if (object instanceof PropertyAlias) {
                    PropertyAlias alias = (PropertyAlias) object;
                    if (messageType.equals(alias.getMessageType())) aliases.add(alias);
                }
            }
        }

        if (!isCollapsed()) {
            FontMetrics metrics = gc.getFontMetrics();
            if (metrics != null) {
                if ((rectangle.height / metrics.getHeight()) <= 1) {
                    visible = false;
                    return;
                }
            }
        }

        if (!operation.hasDefined(Attribute.DEFAULT_CHANNEL.getName()) && operation.hasDefined(Attribute.DEFAULT_STACK.getName())) {
            String defaultChannel = "auto";
            PathAddress channelAddress = context.getCurrentAddress().append(ChannelResourceDefinition.pathElement(defaultChannel));
            ModelNode channelOperation = Util.createAddOperation(channelAddress);
            channelOperation.get(ChannelResourceDefinition.Attribute.STACK.getName()).set(operation.get(Attribute.DEFAULT_STACK.getName()));
            context.addStep(channelOperation, context.getRootResourceRegistration().getOperationHandler(channelAddress, ModelDescriptionConstants.ADD), OperationContext.Stage.MODEL);
            operation.get(Attribute.DEFAULT_CHANNEL.getName()).set(new ModelNode(defaultChannel));
        }

        if (!dalUnitConfig.hasUnitHostId() || dalUnitConfig.getUnitHostId().isEmpty()) {
            throw new NotAvailableException("dalUnitConfig.unitHostId");
        }

        if (stripAnsi(line).contains("[ERROR]") && !isVelocityError(line)) {
            throw new VerificationException("Error in execution: " + line);
        }

        if (dataInicial == null) {
            dataInicial = new Date();
        }

        if (schemaFile instanceof HttpVirtualFile) {
            String url = schemaFile.getUrl();
            VirtualFile first1 = getLocalSchemaByUrl(url);
            return first1 != null ? first1 : schemaFile;
        }

        if (this.kategorie != null && this == this.kategorie.getGruppeB() && this.kategorie.getGruppeA() != null && this.kategorie.getGruppeA().getMannschaften() != null && this.kategorie.getGruppeA().getMannschaften().size() == 3) {
            return this.kategorie.getGruppeA().getMannschaften();
        }

        if (buildRequest) {
            addStep(request, NO_DESC);
        } else {
            SecurityCommand.execute(ctx, request, SecurityCommand.DEFAULT_FAILURE_CONSUMER);
        }

        if (PlatformDependent.isWindows()) {
            sleepTimeMs = sleepTimeMs / 10 * 10;
        }

        if (StringUtils.equalsIgnoreCase("dav", protocol) && url.startsWith("dav:")) {
            url = url.substring(4);
            if (url.startsWith("http")) {
                try {
                    URL urlSite = new URL(url);
                    protocol = urlSite.getProtocol();
                    getLog().debug("found dav protocol so transform to real transport protocol " + protocol);
                } catch (MalformedURLException e) {
                    getLog().warn("fail to build URL with " + url);
                }
            }
        } else {
            getLog().debug("getProxy 'protocol': " + protocol);
        }

        if (idUnidade != null) {
            Collection<Usuario> colecao = (Collection<Usuario>) repositorioUsuario.pesquisarUsuariosUnidadeOrganizacional(idUnidade);
            if (colecao != null && colecao.size() > 0) {
                idUsuarios = "";
                for (Usuario usuario : colecao) {
                    idUsuarios += usuario.getId() + ", ";
                }
                idUsuarios = Util.removerUltimosCaracteres(idUsuarios, 2);
                repositorioAtendimentoPublico.atualizarUsuarioRegistroAtendimentoUrgencia(idRegistroAtendimento, idUsuarios, idUsuario, indicadorTramite, indicadorVisualizacao);
            }
        } else {
            repositorioAtendimentoPublico.atualizarUsuarioRegistroAtendimentoUrgencia(idRegistroAtendimento, idUsuarios, idUsuario, indicadorTramite, indicadorVisualizacao);
        }

        if (!mixedAST && myNoStubs) {
            if (isToken) {
                return (type == REQUIRED ? "findNotNullChildByType" : "findChildByType") + "(" + getElementType(methodInfo.path) + ")";
            } else {
                String className = myShortener.fun(getAccessorType(methodInfo.rule));
                return many ? String.format("%s.getChildrenOfTypeAsList(this, %s.class)", myShortener.fun(myPsiTreeUtilClass), className) : (type == REQUIRED ? "findNotNullChildByClass" : "findChildByClass") + "(" + className + ".class)";
            }
        }

        if (b.getClass().getName().endsWith("LabelUIResource")) {
            b.setFont(UIManager.getFont("Slider.labelFont"));
        }

        if (jdbcDriver == null) {
            throw new JetelRuntimeException("JDBC driver could not be obtained");
        }

        if (elementLength == 13 && !oddLocations) elementLength = 10;

        if (lineTableStart < sectionSize - minHeaderSize && (lineTableStart & 0x3) != 0) {
            int savedPosition = data.position();
            data.position(lineTableStart);
            long ltLength = dwarf64Bit ? read_8_bytes(data) : read_4_bytes(data);
            int dwarfVer = read_2_bytes(data);
            int minInstLengh = data.get(data.position() + (dwarf64Bit ? 8 : 4));
            boolean dataValid = ltLength > minHeaderSize && ltLength < 16 * 64 * 1024 && dwarfVer > 0 && dwarfVer < 5 && minInstLengh > 0 && minInstLengh <= 8;
            if (!dataValid) lineTableStart = (lineTableStart + 3) & ~0x3;
            data.position(savedPosition);
        }

        if (returnVersion != null && returnVersion != ReturnVersion.THIS) {
            url.addParameter(Constants.PARAM_RETURN_VERSION, returnVersion);
        }

        if (checkMaxXsize_) {
            max_xsize_ = Math.max(max_xsize_, col + 1);
        }

        if (releaseIdUpdated(oldReleaseId, this.resource.getReleaseId()) || releaseIdUpdated(oldResolvedReleaseId, this.resource.getResolvedReleaseId())) {
            disposeMarshallers();
        }

        if (getLayoutParams().height == ViewGroup.LayoutParams.MATCH_PARENT && MeasureSpec.getMode(heightMeasureSpec) == MeasureSpec.AT_MOST) {
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(heightMeasureSpec), MeasureSpec.EXACTLY);
        }

        if (a instanceof List) {
            assertEquals(input.getClass() + "." + toCall[i] + "() sizes", ((List) a).size(), ((List) b).size());
        } else {
            assertRoundtripEquality(a, b);
        }

        if (ActionUtil.mustDisableJavaModelAction(BeansUIPlugin.getActiveWorkbenchShell(), element)) {
            return;
        }

        if (!System.getenv("PATH").contains("/usr/local/bin") && new File("/usr/local/bin/tsd").exists()) {
            ProcessUtil.EXTRA_PATH = "usr/bin" + File.pathSeparator + "/usr/local/bin";
            ProcessUtil.TSD_COMMAND = "/usr/local/bin/tsd";
            ProcessUtil.MVN_COMMAND = "/usr/local/bin/mvn";
            ProcessUtil.BOWER_COMMAND = "/usr/local/bin/bower";
        }

        if (url == null && Platform.isMac() && resourceName.endsWith(".dylib")) {
            resourceName = resourceName.substring(0, resourceName.lastIndexOf(".dylib")) + ".jnilib";
            url = Native.class.getResource(resourceName);
        }

        if (argumentos != null && argumentos.size() > 0) {
            for (Enumeration e = argumentos.keys(); e.hasMoreElements(); ) {
                String idArgumento = (String) e.nextElement();
                String valorArgumento = argumentos.get(idArgumento);
                if (idArgumento != null && !idArgumento.equals("")) {
                    condicoes += " operacaoEfetuada.operacao.argumentoPesquisa.id = " + idArgumento;
                } else {
                    condicoes += " operacaoEfetuada.operacao.argumentoPesquisa.coluna = 'imov_id' ";
                }
                condicoes += " and operacaoEfetuada.argumentoValor = " + valorArgumento + " and ";
            }
        } else {
            condicoes += " operacaoEfetuada.argumentoValor is not null and ";
        }

        if (startindex == 0 && endindex == s.length()) {
        } else {
            s = s.substring(startindex, endindex);
        }

        if (extendedOptions != null) {
            off += 4;
            int len = extendedOptions.length;
            if (len > 255) throw new IllegalArgumentException();
            data[off++] = (byte) len;
            System.arraycopy(extendedOptions, 0, data, off, len);
        }

        if (OSInfo.getOSName().equals("Mac")) {
            System.setProperty("org.xerial.snappy.lib.name", "libsnappyjava.jnilib");
        }

        if (powerup_counter == 0) {
            return interrupt.handler();
        } else {
            powerup_counter--;
            return ignore_interrupt.handler();
        }

        if (boundToTopics.size() == 1) {
            config.addConfiguration(boundToTopics.get(0));
        }

        if (GXT.isGecko()) {
            XElement e = getElement().selectNode("." + getStylePrimaryName() + "-bwrap");
            if (e != null) {
                e.getStyle().setProperty("overflow", "auto");
                e.getStyle().setProperty("position", "static");
            }
        }

        if (System.getProperty("jhv.os").equals("windows")) {
            eventTypeTree.setRowHeight(new JCheckBox("J").getPreferredSize().height);
        }

        if (item.getFormaMaterial() == null) {
            throw new AlgoritmoCalculoException("A forma do material do item deve ser preenchida");
        }

        if (idCodigo20 != null && !idCodigo20.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo20, informarNaoEntregaDocumentosActionForm.getQtTentativas20(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento20(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (!(l instanceof SContainmentLinkAdapterById)) {
            return MetaIdFactory.INVALID_LINK_ID;
        }

        if (name.equals("selected")) {
            Component c = ((JTabbedPane) getContainer()).getSelectedComponent();
            TipiComponent tc = getChildByContainer(c);
            return tc;
        }

        if (paramNames[0].equals(PHONENUMBER_UPLOAD_FIELD_NAME)) phoneNumber = (String) paramValues[0];
        else {
            logger.warn("Received field is not a phone number, data discarded.");
            return false;
        }

        if (outs.size() > 0) {
            if (DUtil.getBusinessObject(currentShape) instanceof HostCollocation) {
                width += childWidth + HOST_COLLOCATION_SHAPE_HORIZONTAL_PADDING;
            } else {
                width += childWidth + DIAGRAM_SHAPE_HORIZONTAL_PADDING;
            }
        }

        if (propDef.getPrimaryMember() != null) {
            final JsonProperty jsonPropertyAnn = propDef.getPrimaryMember().getAnnotation(JsonProperty.class);
            if (jsonPropertyAnn == null || !jsonPropertyAnn.value().equals(propName)) {
                if (member != null) {
                    java.lang.reflect.Member innerMember = member.getMember();
                    if (innerMember != null) {
                        String altName = innerMember.getName();
                        if (altName != null) {
                            final int length = altName.length();
                            for (String prefix : Arrays.asList("get", "is")) {
                                final int offset = prefix.length();
                                if (altName.startsWith(prefix) && length > offset && !Character.isUpperCase(altName.charAt(offset))) {
                                    propName = altName;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (swtWidget instanceof Composite) {
            for (Control control : ((Composite) swtWidget).getChildren()) {
                hookGEFToSWTWidget(control, menuDetectListener);
            }
        }

        if (op instanceof NewInstanceOp || op instanceof InvokeOp) {
            ExecutionNode node = pile.get(0);
            try {
                SideEffect.Level originalLevel = node.getOp().getSideEffectLevel();
                Class<? extends Op> klazz;
                if (op instanceof NewInstanceOp) {
                    klazz = NewInstanceOp.class;
                } else {
                    klazz = InvokeOp.class;
                }
                Field f = klazz.getDeclaredField("sideEffectLevel");
                f.setAccessible(true);
                f.set(op, originalLevel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (nodeType.equals(Types.ubuntu1404ServerVmNodeType) || nodeType.equals(Types.ubuntu1404ServerVmNodeType2)) {
            return "ubuntu-14.04-trusty-server-cloudimg";
        }

        if (qname.prefix == XMLSymbols.EMPTY_STRING && qname.uri == null && schemaDoc.fIsChameleonSchema)
            qname.uri = schemaDoc.fTargetNamespace;

        if (pUnidadeFerativa != null) {
            if (getCidade() != null) {
                if (getCidade().getUnidadeFederativa() != null) {
                    if (!getCidade().getUnidadeFederativa().equals(pUnidadeFerativa)) {
                        limparCidade();
                    }
                }
            }
            if (pUnidadeFerativa == null) {
                limparEstado();
            } else {
                unidadeFederativaTemporaria = pUnidadeFerativa;
                if (isInstanciaUnidadeFederativaCriada()) {
                    getCampoInstUnidadeFederativa().setValor(pUnidadeFerativa);
                }
            }
        }

        if (CommonsLanguageKit.URI.equals(ed.getLanguageKit().getURI())) {
            ed = child.wGetParent().wGetEntityDescriptor();
            languageURI = ed.getLanguageKit().getURI();
        }

        if (record.getRecordType().equals(HwmfRecordType.createFontIndirect)) {
            HwmfFont font = ((HwmfText.WmfCreateFontIndirect) record).getFont();
            charset = (font.getCharset() == null || font.getCharset().getCharset() == null) ? LocaleUtil.CHARSET_1252 : font.getCharset().getCharset();
        }

        if (!configuration.containsKey(PROPERTY_DATABASE) && !configuration.containsKey(PROPERTY_DRIVER_CLASS_NAME) && !configuration.containsKey(PROPERTY_HIBERNATE_DIALECT) && !configuration.containsKey(PROPERTY_EMBEDDED) && configuration.containsKey(PROPERTY_DATASOURCE)) {
            configuration.setProperty(PROPERTY_DATABASE, Database.H2.name());
        }

        if (policyConfiguration == null) {
            policyConfiguration = locatePolicyConfiguration(contextId);
        }

        if (!shutdown) {
            shutdown = true;
            executionService.shutdown();
            instanceDir.shutdownConfiglets();
            emf.close();
            neo.shutdown();
        }

        if (_defaultRGB == null) {
            return DEFAULT_DEFAULT_RGB;
        }

        if (classes.length == 2 && classes[0] == JarLoader.class && classes[1] == IReadResolve.class)
            return Channel.jarLoaderProxy;

        if (colecaoLogradouroBairro != null && !colecaoLogradouroBairro.isEmpty()) {
            retorno = (LogradouroBairro) Util.retonarObjetoDeColecao(colecaoLogradouroBairro);
        }

        if (localAddress == null) {
            wsProtocol = null;
            localAddress = getWsLocalAddress(session, WsnResourceAddressFactorySpi.SCHEME_NAME, null);
        }

        if (type.doFullImport) {
            if (SNodeOperations.isInstanceOf(myModule, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4c6db07d2e56a8b4L, "jetbrains.mps.build.mps.structure.BuildMps_Generator"))) {
                ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(myModule, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4c6db07d2e56a8b4L, "jetbrains.mps.build.mps.structure.BuildMps_Generator")), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x48e82d508331930cL, 0x48e82d5083341cb8L, "dependencies"))).addElement(createBuildMps_ModuleDependencyOnModule_yr5c5g_a0a0a0a31a13(BuildMps_Generator__BehaviorDescriptor.getSourceLanguage_id7YI57w6ZMdZ.invoke(SNodeOperations.cast(myModule, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4c6db07d2e56a8b4L, "jetbrains.mps.build.mps.structure.BuildMps_Generator")))));
            }
        }

        if (dtd != null && dtd.isNullable()) {
            throw StandardException.newException(SQLState.LANG_ADD_PRIMARY_KEY_ON_NULL_COLS, colName);
        }

        if (type != null && !(type instanceof Type)) throw new IllegalArgumentException();

        if (obj != null && obj.getClass() != DwgObject.class) {
            dwgFile.addDwgObject(obj);
        }

        if (!pd.config.hasSwitches) {
            runMain(pd, pd.config.args);
        } else {
            pd.init();
            pd.invoke();
            pd.shutdown();
        }

        if (myJdk != null) {
            rootModel.setSdk(myJdk);
        } else {
            rootModel.inheritSdk();
        }

        if (!isFwdLocked()) {
            final int filePermissions = FileUtils.S_IRUSR | FileUtils.S_IWUSR | FileUtils.S_IRGRP | FileUtils.S_IROTH;
            int retCode = FileUtils.setPermissions(getCodePath(), filePermissions, -1, -1);
            if (retCode != 0) {
                Slog.e(TAG, "Couldn't set new package file permissions for " + getCodePath() + ". The return code was: " + retCode);
                return false;
            }
            return true;
        }

        if (mUidDetailProvider == null || app == null) return;

        if (logger.isDebugEnabled()) logger.debug("/** @todo implement buddyCommentChanged() */");

        if (isEnforceIECompatibilityMode(renderContext)) {
            int idx = element.getBegin() + element.toString().indexOf(">");
            String str = ">\n<meta http-equiv=\"X-UA-Compatible\" content=\"" + WebUtils.getInternetExplorerCompatibility(renderContext.getRequest()) + "\"/>";
            outputDocument.replace(idx, idx + 1, str);
        }

        if (cause instanceof NullPointerException) {
            for (int i = 0; i < 2; i++) {
                StackTraceElement stacktrace = cause.getStackTrace()[i];
                if (stacktrace != null) {
                    String classCanonicalName = stacktrace.getClass().getCanonicalName();
                    String methodName = stacktrace.getMethodName();
                    int lineNumber = stacktrace.getLineNumber();
                    String error = "at " + stacktrace.getClassName() + "." + stacktrace.getMethodName() + "(" + stacktrace.getFileName() + ":" + lineNumber + ") ";
                    sb.append(error);
                }
            }
        }

        if (newTaskTestResult.getUserCode() == null) {
            return new Message("Compilation Error", MessageType.ERROR, newTaskTestResult.getStatus());
        }

        if (!isVisible()) return new Rectangle(-1000, -1000, 0, 0);

        if (!"resource".equals(prop)) {
            sb.append(prefix).append(".");
        }

        if (parseAs == Integer.class) {
            this.value = (T) (Integer) Integer.parseInt(value);
        } else if (parseAs == Float.class) {
            this.value = (T) (Float) Float.parseFloat(value);
        } else if (parseAs == Double.class) {
            this.value = (T) (Double) Double.parseDouble(value);
        } else if (parseAs == String.class) {
            this.value = (T) value;
        } else {
            this.value = null;
        }

        if (!StringUtil.isEmpty(ourTrace)) {
            myArgs.forEach(Object::toString);
        }

        if (facet != null && facet instanceof CssClassFacetMethod) {
            return null;
        }

        if (e.getOppositeComponent() instanceof Component) {
            if (jTextFieldUsarioDatNasc.getInputVerifier().shouldYieldFocus(jTextFieldUsarioDatNasc)) {
                String dataNasc = DateUtil.parseToYearMonthDay(((JTextField) e.getComponent()).getText());
                CadastroIndividualizado.this.procedimentoRealizado.setDataNascimentoPaciente(dataNasc);
            }
        }

        if (reuse != null && !reuse.special) {
            reuse.reset(bytes, pc, bc, w, length);
            return reuse;
        }

        if (className != null) WidgetElement.setCSSClass(styleControl, className);

        if ((Util.eVazio(this.getNumero()) && Util.eVazio(this.getOrgaoExpedidor()) && Util.eVazio(this.getUf()) && this.getDataExpedicao() == null) || (!Util.eVazio(this.getNumero()) && !Util.eVazio(this.getOrgaoExpedidor()) && !Util.eVazio(this.getUf()) && this.getDataExpedicao() != null)) {
        } else {
            throw new ValidationException("Todos os campos do RG são obrigatórios!");
        }

        if (!namesOfAddedVariables.contains(variableName) && variable.getDimensions().size() > 0) {
            checkWhetherVariableHasSameDimensionsAcrossFiles(i, variable, variableLists);
            addVariableToWritable(netcdfWriteable, variable);
            final NVariable nVariable = netcdfWriteable.findVariable(variableName);
            final int indexOfRowDimension = getIndexOfRowDimension(variable.getDimensions());
            if (indexOfRowDimension < 0) {
                variableToArray.put(variableName, getValidArrayFromVariable(variable));
            } else {
                Array nVariableArray = createStitchedArray(variable, targetImageSize, imageSizes, indexOfRowDimension, variableLists);
                variableToArray.put(variableName, nVariableArray);
            }
            addVariableAttributes(nVariable, variable, i, variableLists);
            namesOfAddedVariables.add(variableName);
        }

        if (!newLimit) {
            ResultLimitDAO resultLimitDAO = new ResultLimitDAOImpl();
            resultLimitDAO.getData(resultLimit);
            limitsLink.populateResultLimit(resultLimit);
        }

        if (TransparencyMode.TRANSPARENCY == Transparency.TRANSLUCENT) {
            panel.setLayout(new AnimatedLayout(new SBoxLayout(SBoxLayout.VERTICAL)));
        } else {
            panel.setLayout(new SBoxLayout(SBoxLayout.VERTICAL));
        }

        if (!src.hasRemaining()) {
            terminateWrites();
            return 0;
        }

        if (dividerLocation != -1) {
            setDividerLocation(dividerLocation);
        }

        if (download instanceof YouTubeDownload) {
            YouTubeDownload yt = (YouTubeDownload) download;
            if (yt.getState() == TransferState.DEMUXING) {
                status.setText(transferStateStrings.get(download.getState()) + " (" + yt.demuxingProgress() + "%)");
            }
        }

        if (C_BP_BankAccount_ID > 0) {
            payment.setTenderType(X_C_Payment.TENDERTYPE_DirectDeposit);
        } else {
            payment.setTenderType(X_C_Payment.TENDERTYPE_Cash);
        }

        if (vuln.getScanReopenVulnerabilityMaps() != null) {
            for (ScanReopenVulnerabilityMap map : vuln.getScanReopenVulnerabilityMaps()) {
                if (map != null && map.getScan() != null && map.getScan().getId().equals(scanToDelete.getId())) {
                    reopenMapsToRemove.add(map);
                    continue;
                }
                if (map != null && map.getScan() != null && map.getScan().getImportTime() != null && (newOpenTime == null || newOpenTime.before(map.getScan().getImportTime()))) {
                    newOpenTime = map.getScan().getImportTime();
                }
            }
        }

        if (undoEntityTypes != null && undoEntityTypes.contains(entity.getType())) {
            data.removed(entity);
            entity.remove();
        }

        if ("Boolean".equalsIgnoreCase(varFormatText)) {
            dv.setFormatCategory("Boolean");
        } else {
            dv.setFormatCategory(varFormatCategoryAtt);
        }

        if (d instanceof ClassDeclaration) decls.add(new Reference(d, env));

        if (modes.length == 0) {
            if (Files.exists(unwrap(file))) return;
            else throw new NoSuchFileException(file.toString());
        }

        if (isIsolationPoliciesPresent) {
            if (policies.isPrimaryBroker(namespace, brokerUrl.getHost())) {
                primariesCache.add(broker);
                if (log.isDebugEnabled()) {
                    log.debug("Added Primary Broker - [{}] as possible Candidates for" + " namespace - [{}] with policies", brokerUrl.getHost(), namespace.toString());
                }
            } else if (policies.isSecondaryBroker(namespace, brokerUrl.getHost())) {
                secondaryCache.add(broker);
                if (log.isDebugEnabled()) {
                    log.debug("Added Shared Broker - [{}] as possible " + "Candidates for namespace - [{}] with policies", brokerUrl.getHost(), namespace.toString());
                }
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("Skipping Broker - [{}] not primary broker and not shared" + " for namespace - [{}] ", brokerUrl.getHost(), namespace.toString());
                }
            }
        } else {
            if (isNonPersistentTopic && !brokerTopicLoadingPredicate.isEnableNonPersistentTopics(brokerUrlString)) {
                if (log.isDebugEnabled()) {
                    log.debug("Filter broker- [{}] because it doesn't support non-persistent namespace - [{}]", brokerUrl.getHost(), namespace.toString());
                }
            } else if (!isNonPersistentTopic && !brokerTopicLoadingPredicate.isEnablePersistentTopics(brokerUrlString)) {
                if (log.isDebugEnabled()) {
                    log.debug("Filter broker- [{}] because broker only supports non-persistent namespace - [{}]", brokerUrl.getHost(), namespace.toString());
                }
            } else if (policies.isSharedBroker(brokerUrl.getHost())) {
                secondaryCache.add(broker);
                if (log.isDebugEnabled()) {
                    log.debug("Added Shared Broker - [{}] as possible Candidates for namespace - [{}]", brokerUrl.getHost(), namespace.toString());
                }
            }
        }

        if (getHierarchy().getName().equals(getDimension().getName())) {
            this.uniqueName = Util.makeFqName(getDimension(), name);
        } else {
            this.uniqueName = Util.makeFqName(getHierarchy(), name);
        }

        if (type.isArray()) return cleanType(type.getComponentType()).makeArray();

        if (startx < 0) startx = 0;

        if (MouseEvent.BUTTON1 == mouseEvent.getButton() && this.wwd instanceof GLJPanel) {
            ((GLJPanel) this.wwd).requestFocusInWindow();
        }

        if (s.endsWith("if this is the case")) {
            return;
        }

        if (android.os.Build.MANUFACTURER.toLowerCase().contains("motorola") && (Math.abs(ev_step - 0.333) < 0.01))
            ev_step = 1.5f;

        if (millis <= PGStatement.DATE_NEGATIVE_INFINITY || millis >= PGStatement.DATE_POSITIVE_INFINITY) {
            return new Date(millis);
        }

        if (getAlt() != null && (getAlt().length() > 2 && !getAlt().substring(0, 2).equals("id"))) {
            sPrint.append(getAlt());
        }

        if (appPort != null) {
            Integer.parseInt(appPort);
            properties.put("app.ssl.port", appPort);
        }

        if (listaSimplificada.contains(irleh)) {
            int posicao = listaSimplificada.indexOf(irleh);
            ResumoAnormalidadeConsumoHelper jaCadastrado = listaSimplificada.get(posicao);
            jaCadastrado.setQuantidadeImovel(jaCadastrado.getQuantidadeImovel() + 1);
        } else {
            listaSimplificada.add(irleh);
        }

        if (HttpExchanges.abortImmediately.get() != null) {
            throw new IOException("Aborting request because server is under high load");
        }

        if (ac == null) return null;

        if (getBorderStyle() == SWT.BORDER) {
            combo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
        }

        if (vuln.getScanReopenVulnerabilityMaps() != null) {
            for (ScanReopenVulnerabilityMap map : vuln.getScanReopenVulnerabilityMaps()) {
                if (map != null && map.getScan() != null && map.getScan().getImportTime() != null && (newOpenTime == null || newOpenTime.before(map.getScan().getImportTime()))) {
                    newOpenTime = map.getScan().getImportTime();
                }
            }
        }

        if (courseId != null && !courseId.isEmpty()) {
            try {
                Course course = teacherService.findCourseById(new ObjectId(courseId));
                mav.addObject("courseTitle", course.getTitle());
            } catch (NoSuchCourseException e) {
                e.printStackTrace();
            }
        }

        if (ch == 0x30ff) ch = 0xf900;
        else if (ch == 0x115bc) ch = 0x1d15e;
        else if (ch == 0x1d1c1) ch = 0x2f800;

        if (what.equals(getString(R.string.finishing))) refreshSummaryFragment();

        if (m_aggregateTypes.size() != m_aggregateDistinct.size() || m_aggregateDistinct.size() != m_aggregateExpressions.size() || m_aggregateExpressions.size() != m_aggregateOutputColumns.size()) {
            throw new Exception("ERROR: Mismatched number of aggregate expression column attributes for PlanNode '" + this + "'");
        }

        if (logic[0] == AND) {
            result = new BitSet();
            ++i;
        } else {
            result = new BitSet(reader.maxDoc());
        }

        if (scannedRecords > MAX_RECORDS_TO_SCAN_DURING_SEARCH) {
            break;
        }

        if (cf == CassandraModel.CF_METRICS_FULL) {
            serializer = Serializers.simpleNumberSerializer;
        } else if (cf == CassandraModel.CF_METRICS_PREAGGREGATED_FULL) {
            if (type.equals(BluefloodTimerRollup.class)) {
                serializer = Serializers.timerRollupInstance;
            } else if (type.equals(BluefloodSetRollup.class)) {
                serializer = Serializers.setRollupInstance;
            } else if (type.equals(BluefloodGaugeRollup.class)) {
                serializer = Serializers.gaugeRollupInstance;
            } else if (type.equals(BluefloodCounterRollup.class)) {
                serializer = Serializers.counterRollupInstance;
            } else {
                serializer = Serializers.simpleNumberSerializer;
            }
        }

        if (editor != null) {
            editor.removePropertyChangeListener(propertyChangeListener);
        }

        if (comp instanceof DataField && ((DataField) comp).isEditable()) {
            DataField edit = (DataField) comp;
            boolean needEntireState = edit.needEntireState();
            try {
                edit.setNeedEntireState(false);
                int fb = edit.getFocusLostBehavior();
                if (fb == JFormattedTextField.COMMIT || fb == JFormattedTextField.COMMIT_OR_REVERT) {
                    try {
                        edit.commitEdit();
                        edit.setValueObject(edit.getValue());
                    } catch (ParseException pe) {
                        return null;
                    }
                } else if (fb == JFormattedTextField.REVERT) {
                    edit.setValueObject(edit.getValue());
                }
            } finally {
                edit.setNeedEntireState(needEntireState);
            }
        }

        if (bind != null && activeController != null) {
            if (activeController.getButton(keycode)) {
                return true;
            }
        }

        if (!mapTM.containsKey(Constants.URI_SOAP11_ENC)) {
            mapTM.put(Constants.URI_SOAP11_ENC, mapping);
        } else {
            TypeMappingDelegate del = (TypeMappingDelegate) mapTM.get(Constants.URI_SOAP11_ENC);
            while (del.getNext() != null && !(del.delegate instanceof DefaultTypeMappingImpl)) {
                del = del.getNext();
            }
            del.setNext(defaultDelTM);
        }

        if (graph instanceof InfGraph) syncGraph(((InfGraph) graph).getRawGraph());
        else if (graph instanceof Polyadic) syncGraph(((Polyadic) graph).getBaseGraph());
        else if (graph instanceof GraphWrapper) syncGraph(((GraphWrapper) graph).get());
        else if (graph instanceof WrappedGraph) syncGraph(((WrappedGraph) graph).getWrapped());
        else syncObject(graph);

        if ((portletResponse instanceof HttpServletResponseWrapper) || (portletResponse instanceof PortletResponseWrapper)) {
            portletResponse = unwrapPortletResponse(portletResponse);
        }

        if (factionReplacements.containsKey(newFaction)) {
            newFaction = factionReplacements.get(newFaction);
        }

        if (mh.isVarargsCollector() && !newHandle.isVarargsCollector()) {
            final MethodType type = mh.type();
            newHandle = newHandle.asVarargsCollector(type.parameterType(type.parameterCount() - 1));
        }

        if (ModelUtil.isIResourceReadOnly(this.modelResource.getResource())) {
            String message = UiConstants.Util.getString("ModelEditor.resourceReadonlySaveError", modelResource.getResource().getName());
            String title = UiConstants.Util.getString("ModelEditor.resourceSaveErrorTitle");
            MessageDialog.openError(getSite().getShell(), title, message);
            return;
        }

        if (smooth) {
            for (int i = 0; i < vertexCount; i++) {
                vertices[i][TX] *= SUBXRES;
                vertices[i][TY] *= SUBYRES;
            }
            firstModY = -1;
        }

        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")))) {
            throw new IllegalArgumentException();
        }

        if (!mShowArrivals) {
            setHeaderSize(HEADER_HEIGHT_EDIT_NAME_DP);
        }

        if (CodeGenerator.MAX_ACYCLIC_DFA_STATES_INLINE == CodeGenerator.MADSI_DEFAULT) {
            CodeGenerator.MAX_ACYCLIC_DFA_STATES_INLINE = 65535;
        }

        if (revisedAIplatform == null) {
            AIPlatform aiplatformLocal;
            aiplatformLocal = aiPlatformDAO.get(aiplatform.getId());
            removeFromQueue(aiplatformLocal);
            return null;
        }

        if (elimResult.contains("halt")) {
            return null;
        }

        if (innerType == null) {
            return false;
        }

        if (other.size() < 5) {
            boolean result = false;
            for (IntIterator it = other.intIterator(); it.hasNext(); ) {
                int i = it.next();
                if (filter.contains(i)) {
                    result |= add(i);
                }
            }
            return result;
        } else if (filter.size() < 5) {
            boolean result = false;
            for (IntIterator it = filter.intIterator(); it.hasNext(); ) {
                int i = it.next();
                if (other.contains(i)) {
                    result |= add(i);
                }
            }
            return result;
        } else {
            BitVectorIntSet o = new BitVectorIntSet(other);
            o.intersectWith(filter);
            return addAll(o);
        }

        if (!new File(this.dataPath + "nukkit.yml").exists()) {
            this.getLogger().info(TextFormat.GREEN + "Welcome! Please choose a language first!");
            try {
                String[] lines = Utils.readFile(this.getClass().getClassLoader().getResourceAsStream("lang/language.list")).split("\n");
                for (String line : lines) {
                    this.getLogger().info(line);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String fallback = BaseLang.FALLBACK_LANGUAGE;
            String language = null;
            while (language == null) {
                String lang = this.console.readLine();
                InputStream conf = this.getClass().getClassLoader().getResourceAsStream("lang/" + lang + "/lang.ini");
                if (conf != null) {
                    language = lang;
                }
            }
            InputStream advacedConf = this.getClass().getClassLoader().getResourceAsStream("lang/" + language + "/nukkit.yml");
            if (advacedConf == null) {
                advacedConf = this.getClass().getClassLoader().getResourceAsStream("lang/" + fallback + "/nukkit.yml");
            }
            try {
                Utils.writeFile(this.dataPath + "nukkit.yml", advacedConf);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (part.getPartName().toString().endsWith(".rels")) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int ch; (ch = dataStream.read()) != -1; ) {
                if (ch == 10 || ch == 13) continue;
                bos.write(ch);
            }
            dataStream = new ByteArrayInputStream(bos.toByteArray());
        }

        if (overflowPolicy == FAIL) {
            if (ringbuffer.remainingCapacity() < 1) {
                resultSequence = -1;
                return;
            }
        }

        if (cumulativeMetrics == null)
            cumulativeMetrics = readsDataSource == null ? new ReadMetrics() : readsDataSource.getCumulativeReadMetrics();

        if (terminationTime != null && new DateTime().compareTo(terminationTime) >= 1) {
            logger.debug("Task lifetime exceeded");
            throw new LifetimeExceededException();
        }

        if ((year == 0) && (calt == Calendar.gregorian)) {
            calt = Calendar.proleptic_gregorian;
        }

        if (erro instanceof EarlyExitException) {
            return tradutorEarlyExitException.traduzirErroParsing((EarlyExitException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof FailedPredicateException) {
            return tradutorFailedPredicateException.traduzirErroParsing((FailedPredicateException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MismatchedRangeException) {
            return tradutorMismatchedRangeException.traduzirErroParsing((MismatchedRangeException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MismatchedNotSetException) {
            return tradutorMismatchedNotSetException.traduzirErroParsing((MismatchedNotSetException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MissingTokenException) {
            return tradutorMissingTokenException.traduzirErroParsing((MissingTokenException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof UnwantedTokenException) {
            return tradutorUnwantedTokenException.traduzirErroParsing((UnwantedTokenException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MismatchedTreeNodeException) {
            return tradutorMismatchedTreeNodeException.traduzirErroParsing((MismatchedTreeNodeException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof NoViableAltException) {
            return tradutorNoViableAltException.traduzirErroParsing((NoViableAltException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MismatchedTokenException) {
            return tradutorMismatchedTokenException.traduzirErroParsing((MismatchedTokenException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else if (erro instanceof MismatchedSetException) {
            return tradutorMismatchedSetException.traduzirErroParsing((MismatchedSetException) erro, tokens, pilhaContexto, mensagemPadrao, codigoFonte);
        } else {
            return new ErroParsingNaoTratado(erro, mensagemPadrao, pilhaContexto.pop());
        }

        if (!CollectionUtils.isEmpty(criteria.getApplicationDocumentStatuses()) && CollectionUtils.isEmpty(builtCriteria.getApplicationDocumentStatuses())) {
            DocumentSearchCriteria.Builder patchedCriteria = DocumentSearchCriteria.Builder.create(builtCriteria);
            patchedCriteria.setApplicationDocumentStatuses(criteriaBuilder.getApplicationDocumentStatuses());
            builtCriteria = patchedCriteria.build();
        }

        if (rs.getMetaData().getColumnType(i + 1) == java.sql.Types.OTHER) {
            row[i] = rs.getString(i + 1);
        } else {
            row[i] = formatter.toString(rs.getObject(i + 1));
        }

        if (!st.hasMoreTokens()) {
            if (template.endsWith(":")) {
                metric.attributeName = "";
            } else {
                metric.attributeName = metric.objectPropString;
                metric.objectPropString = "DummyKey=DummyVal";
                metric.objectName = metric.domainName + ":" + metric.objectPropString;
            }
        } else {
            metric.objectName = template.substring(0, metric.domainName.length() + 1 + metric.objectPropString.length());
            metric.attributeName = st.nextToken();
        }

        if (!cancelled && data.attackPenalty.isPenalty(now)) {
            cancelled = true;
            if (debug) {
                debug(player, "~ attack penalty.");
            }
        }

        if (blockNestingLevel == RULE_BLOCK_NESTING_LEVEL && grammar.buildAST()) {
            Rule r = grammar.getRule(currentRuleName);
            currentAltHasASTRewrite = r.hasRewrite(outerAltNum);
        }

        if (nearCache != null) {
            Object fromNearCache = getFromNearCache(key);
            if (fromNearCache != null) {
                if (isCachedAsNullInNearCache(fromNearCache)) {
                    return null;
                }
                return fromNearCache;
            }
        }

        if (isUsingNetscape()) {
            h += dialog.getInsets().bottom;
        }

        if ((RAM.read(0x180b) == 0xbe && RAM.read(0x1ffd) == 0x00) || (RAM.read(0x180b) == 0x01 && RAM.read(0x1ffd) == 0xbd)) {
            speedcheat = 1;
        } else {
            speedcheat = 0;
        }

        if (ModelUtil.isXsdFile(targetModelResource.getResource())) return false;

        if (MARKER_POINT_SIZE % 2 == 1) {
            MARKER_POINT_SIZE++;
        }

        if (config.mOrientation == HORIZONTAL) {
            recyclerViewBounds.bottom -= recyclerViewBounds.height() % config.mSpanCount;
        } else {
            recyclerViewBounds.right -= recyclerViewBounds.width() % config.mSpanCount;
        }

        if (VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB) {
            ThemeManager.modify(ThemeManager.FULLSCREEN);
        }

        if (specification == null) {
            return false;
        }

        if (!isValidEjbAnnotationUsage(ManagedBean.class, beanClass, ejbName, ejbModule)) {
            continue;
        }

        if (request.getVersion().startsWith("2") && e.getCause() instanceof FeatureLockException && request.getLockId() == null) {
            exception = new WFSTransactionException(e.getMessage(), e, "MissingParameterValue");
        }

        if (Dispatcher.REQUEST.get() != null && Dispatcher.REQUEST.get().isSOAP()) {
            output.write(("<wfs:DescribeFeatureTypeResponse xmlns:wfs='" + getWFSNamespaceURI() + "'>").getBytes());
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            doWrite(featureTypeInfos, bout, describeFeatureType);
            output.write(Base64.encodeBase64(bout.toByteArray()));
            output.write("</wfs:DescribeFeatureTypeResponse>".getBytes());
        } else {
            doWrite(featureTypeInfos, output, describeFeatureType);
        }

        if (!containsLineComment) {
            interpolateimage = image + " ";
        } else {
            interpolateimage = image;
        }

        if (Platform.isWindows() && "kernel32".equals(this.libraryName.toLowerCase())) {
            synchronized (functions) {
                Function f = new Function(this, "GetLastError", Function.ALT_CONVENTION, encoding) {
                    @Override
                    Object invoke(Object[] args, Class<?> returnType, boolean b, int fixedArgs) {
                        return Integer.valueOf(Native.getLastError());
                    }

                    @Override
                    Object invoke(Method invokingMethod, Class<?>[] paramTypes, Class<?> returnType, Object[] inArgs, Map<String, ?> options) {
                        return Integer.valueOf(Native.getLastError());
                    }
                };
                functions.put(functionKey("GetLastError", callFlags, encoding), f);
            }
        }

        if (result.value().compareTo(BigDecimal.ZERO) != 0 || parameters.invoiceRunType().equals(InvoiceRunType.RETRO_RUN)) {
            final LocalDateInterval invoicingInterval = result.invoicingInterval().asLocalDateInterval();
            BigDecimal invoicedValue = invoiceItemForLeaseRepository.invoicedValue(leaseTerm, invoicingInterval);
            BigDecimal newValue = result.value().subtract(invoicedValue);
            LocalDateInterval calculationInterval = result.effectiveInterval();
            LocalDateInterval effectiveInterval = calculationInterval;
            Boolean adjustment = false;
            if (newValue.compareTo(BigDecimal.ZERO) != 0) {
                if (invoicedValue.compareTo(BigDecimal.ZERO) != 0) {
                    if (invoiceItemForLeaseRepository.findByLeaseTermAndEffectiveInterval(leaseTerm, calculationInterval).size() > 0) {
                        adjustment = true;
                    } else {
                        effectiveInterval = attemptToCalculateRightSideLeftover(invoicingInterval, calculationInterval);
                    }
                }
                InvoiceItemForLease invoiceItem = invoiceItemForLeaseRepository.createUnapprovedInvoiceItem(leaseTerm, invoicingInterval, calculationInterval, effectiveInterval, parameters.invoiceDueDate(), interactionId);
                invoiceItem.setNetAmount(newValue);
                invoiceItem.setQuantity(BigDecimal.ONE);
                LeaseItem leaseItem = leaseTerm.getLeaseItem();
                Charge charge = leaseItem.getCharge();
                invoiceItem.setCharge(charge);
                invoiceItem.setTax(leaseItem.getEffectiveTax());
                final InvoiceItemAttributesVM vm = new InvoiceItemAttributesVM(invoiceItem);
                final String description = fragmentRenderService.render(vm, "description");
                invoiceItem.setDescription(description);
                invoiceItem.verify();
                invoiceItem.setAdjustment(adjustment);
            }
        }

        if (selected.size() > 0 && !(selected.get(0) instanceof EditPart)) return null;

        if (OAuth2Constants.DISPLAY_CONSOLE.equalsIgnoreCase(display)) {
            context.getAuthenticationSession().removeAuthNote(OAuth2Constants.DISPLAY);
            throw new AuthenticationFlowException(AuthenticationFlowError.DISPLAY_NOT_SUPPORTED, ConsoleDisplayMode.browserContinue(context.getSession(), context.getUriInfo().getRequestUri().toString()));
        } else {
            return context.getFactory().create(context.getSession());
        }

        if (name.startsWith("screen-")) {
            return false;
        }

        if (m_disableOutputEscapingStates.peekOrFalse() || (!m_escaping)) {
            if (shouldNotFormat) {
                charactersRaw(chars, start, length);
                m_isprevtext = true;
            } else {
                m_charactersBuffer.addRawText(chars, start, length);
            }
            if (m_tracer != null) super.fireCharEvent(chars, start, length);
            return;
        }

        if (PlatformUtil.onMacOSX() && JF.getName().endsWith(File.separator + "classes.jar")) {
            return JF;
        }

        if (createInitFile) {
            createInitializeFile(tmpDir);
        }

        if (e instanceof ElementReferenceExpression) {
            EObject reference = ((ElementReferenceExpression) e).getReference();
            if (reference instanceof Event) {
                return (Event) reference;
            }
        }

        if ((targetValue <= value + c * stepLength * product && value < Double.POSITIVE_INFINITY) || stepLength == 0) {
            moveInfo.setStep(step);
            moveInfo.setStepLength(stepLength);
            moveInfo.setNewValue(targetValue);
            break;
        }

        if (entity == null || !EntityUtils.hasParent(entity)) {
            super.reset(null);
            return;
        }

        if (!new File(reportingOutputDir).isAbsolute()) {
            reportingOutputDir = new File(project.getBasedir(), reportingOutputDir).getAbsolutePath();
        }

        if (await == null) {
            return;
        }

        if (appender.getClass().getName().equals(LogStageAppender.class.getName())) {
            return;
        }

        if (!project.isOpen()) {
            return estimateLocation(project.getLocation()) == location;
        }

        if (javaHome != null) {
            actualJreVersion = resolveExternalJreVersion();
        } else {
            actualJreVersion = SelectorUtils.getJreVersion();
        }

        if (keycode > 200 && keycode < 230 && activeController != null) {
            int axis = (int) Math.floor((float) (keycode - 200) / 2.0f);
            float current = activeController.getAxis(axis);
            float zero = axisZeroValues.get(new ControllerAxis(activeController, axis));
            return Math.abs(current - zero) > CONTROLLER_DEAD_ZONE;
        }

        if (cf instanceof javax.resource.Referenceable) {
            ((javax.resource.Referenceable) cf).setReference(new Reference(jndi));
        }

        if (str instanceof String) {
            @NotNull char[] chars = ((String) str).toCharArray();
            ensureCapacity(position + length);
            @NotNull NativeBytesStore nbs = (NativeBytesStore) bytesStore;
            nbs.write8bit(position, chars, offset, length);
        } else {
            throw new UnsupportedOperationException();
        }

        if (updProp.getValue() != null && (updProp.getValue().equals("true") || updProp.getValue().equals("false"))) {
            if (incomingProp == null || !incomingProp.equals("on")) {
                incomingProp = "false";
            } else {
                incomingProp = "true";
            }
        }

        if (text.startsWith(PREFIX_HEX)) {
            return Integer.parseInt(text.substring(PREFIX_HEX.length()), 16);
        }

        if (end == 'e' && sym instanceof Sym && sym.sym() == "end") break;

        if (Util.isOnBackgroundThread()) {
            mainHandler.post(addSelfToLifecycle);
        } else {
            lifecycle.addListener(this);
        }

        if (patientChanged) {
            vaccinationComposite.update();
            vaccinationComposite.redraw();
        }

        if (node == null) {
            String[] tableNames = {NODE_TABLE, RANK_TABLE, COMPONENT_TABLE, NODE_ANNOTATION_TABLE, EDGE_ANNOTATION_TABLE};
            for (String table : tableNames) tables.add(table);
            return tables;
        }

        if ("terminal".equals(serverRef)) {
            return new TerminalHttpConnectionServerChecker(url, machineName, serverRef, 3, 180, serverPingSuccessThreshold, TimeUnit.SECONDS, timer);
        }

        if (datum == null) {
            if (withTypes && type != null && !type.immediateSupertypes().isEmpty())
                lo.print(type.name().toString()).print("@");
            lo.print("null");
        } else {
            if (withTypes && !datum.type().immediateSupertypes().isEmpty()) lo.print(datum.type().name().toString());
            if (datum instanceof PrimitiveDatum) print((PrimitiveDatum<?>) datum);
            else if (datum instanceof RecordDatum) print((RecordDatum) datum);
            else if (datum instanceof ListDatum) print((ListDatum) datum);
            else if (datum instanceof MapDatum) print((MapDatum) datum);
            else lo.print(datum.type().name().toString());
            Datum meta = datum._raw().meta();
            if (meta != null) {
                lo.print("@");
                print(meta.type(), meta);
            }
        }

        if (os != OS.WINDOWS) {
            return "/bin:/usr/bin";
        }

        if (compositeType != null && compositeType == CompositeType.UNION) {
            if (composite == null || composite.getType() != CompositeType.UNION) {
                compositeType = null;
            }
        }

        if (result.startsWith("/")) {
            result = result.substring(1);
        }

        if (KoLCharacter.getClassType() != KoLCharacter.PASTAMANCER) {
            return true;
        }

        if (value_compare != 0) {
            return value_compare;
        }

        if (bioRegion != null && bioregionExists(bioRegion)) {
            insertSiteAttribute(siteCode, bioRegion.toUpperCase(), "BOOLEAN", "TRUE", "sdfxml");
        } else {
            System.out.println(" Warning! BioRegion '" + bioRegion + "' doesn't exist!");
        }

        if (pendingRenderingOperations.size() > 20000 && impl.isMinimized()) {
            pendingRenderingOperations.clear();
        }

        if (!uri.equals(namespaceContext.getNamespaceURI(prefix))) {
            namespaceContext.pushNamespace(prefix, uri);
            nsDeclared = true;
        }

        if (enhetId.equals(VE_CENTRUM_VAST)) {
            ids.add(UE_AKUTEN);
            ids.add(UE_DIALYS);
        }

        if (Surrogate.is(ch)) return false;

        if (stringValue != null && stringValue.endsWith(DATA_BINDER)) {
            currentState = State.GET_NEXT_STRING;
        } else if (parenCount == 0 && type == OPEN_CURLY) {
            currentState = State.IN_CLASS_BODY;
        }

        if (false && RexUtil.containCommonExprs(exprs, fail)) {
            assert !fail;
            return false;
        }

        if ((tiledArea.width == Integer.MAX_VALUE) || (tiledArea.height == Integer.MAX_VALUE)) {
            tiledArea = new Rectangle(Integer.MIN_VALUE / 4, Integer.MIN_VALUE / 4, Integer.MAX_VALUE / 2, Integer.MAX_VALUE / 2);
        }

        if (!isChange && startPos > 0 && startPos == buf.length()) {
            moveCursor(-1);
        }

        if (dataverse != null) {
            for (DataverseFacet dataverseFacet : dataverse.getDataverseFacets()) {
                DatasetFieldType datasetField = dataverseFacet.getDatasetFieldType();
                solrQuery.addFacetField(datasetField.getSolrField().getNameFacetable());
            }
        }

        if (visible) super.markCollapsed();

        if ((!(user instanceof AuthenticatedUser) || !user.isSuperuser())) {
            throw new IllegalCommandException("Roles can only be created or edited by superusers.", this);
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.AQUA)) {
            for (int j = 0; j < itemNodeList.size(); j++) {
                title.append('\u0000');
            }
        }

        if (OTFClientControl.getInstance().getOTFVisConfig().isScaleQuadTreeRect()) {
            rect = rect.scale(5.0, 5.0);
        }

        if (appReport.getFinalApplicationStatus() == FinalApplicationStatus.FAILED || appReport.getFinalApplicationStatus() == FinalApplicationStatus.KILLED) {
            long startTime = System.currentTimeMillis();
            while ((appReport.getDiagnostics() == null || appReport.getDiagnostics().isEmpty()) && (System.currentTimeMillis() - startTime) < diagnoticsWaitTimeout) {
                try {
                    Thread.sleep(100);
                    appReport = frameworkClient.getApplicationReport(appId);
                } catch (YarnException e) {
                    throw new TezException(e);
                } catch (InterruptedException e) {
                    throw new TezException(e);
                }
            }
        }

        if (this.chat.urls == null) {
            this.chat.urls = new Chat.Urls();
        }

        if (orig.equals("\u0069") && (defaultLang.equals("az") || defaultLang.equals("tr"))) {
            expected = "\u0130";
        }

        if (e.getMessage().equals("Content is not allowed in prolog.")) {
            try {
                String xml = readFileAsString(Paths.get(uri));
                xml = xml.trim().replaceFirst("^([\\W]+)<", "<");
                InputSource src = new InputSource(new StringReader(xml));
                xr.parse(src);
                adapter.getDocument().setDocumentURI(new File(uri).getAbsoluteFile().toString());
                return (NodeImpl) adapter.getDocument();
            } catch (SAXException e1) {
                throw new IOException(e);
            }
        }

        if (dbActivityTypes.length == 0) {
            return null;
        }

        if (oldScrollX > 0) {
            String jsScrollX = "javascript:window:scrollTo(" + oldScrollX + " / window.devicePixelRatio,0);";
            view.loadUrl(jsScrollX);
        }

        if (comboField != null && Platform.OS_LINUX.equals(Platform.getOS())) {
            Point point = comboField.getSelection();
            comboField.setFocus();
            comboField.setSelection(point);
        }

        if (br.getRequest().getHtmlCode() == null) {
            br.followConnection();
        }

        if (e.getClickCount() == 2) {
            hideHint();
        }

        if (input instanceof StAXSource) {
            @Workaround(library = "JDK", version = "1.8") final XMLStreamReader reader = ((StAXSource) input).getXMLStreamReader();
            if (reader != null) {
                object = unmarshaller.unmarshal(reader);
            } else {
                object = unmarshaller.unmarshal(((StAXSource) input).getXMLEventReader());
            }
        } else {
            object = unmarshaller.unmarshal(input);
        }

        if (event instanceof JackrabbitEvent) {
            return ((JackrabbitEvent) event).isExternal();
        } else if (event instanceof EventWrapper) {
            return ((EventWrapper) event).isExternal();
        }

        if (path == null || glyphs == null || glyphs.getNumGlyphs() == 0 || pl.lengthOfPath() == 0f || glyphsLength == 0f) {
            return newPath;
        }

        if (lastCheck == 0) {
            lastCheck = System.currentTimeMillis();
            lastX = getX();
        } else if ((time = System.currentTimeMillis() - lastCheck) >= 3000) {
            synchronized (getInventory()) {
                numHPPots = 0;
                numManaPots = 0;
                for (ServerItem item : getInventory()) {
                    if (item.getType().equals(ServerWorld.HP_POTION_TYPE)) numHPPots = item.getAmount();
                    else if (item.getType().equals(ServerWorld.MANA_POTION_TYPE)) numManaPots = item.getAmount();
                }
            }
            double x = getX() + getWidth() / 2;
            double y = getY() + getHeight() / 2;
            if (getWorld().getCollisionGrid()[(int) (y / ServerWorld.TILE_SIZE)][(int) (x / ServerWorld.TILE_SIZE)] == ServerWorld.SOLID_TILE) {
                if (System.currentTimeMillis() - lastCollisionStrike > 10000) {
                    collisionStrikes = 0;
                }
                collisionStrikes++;
                lastCollisionStrike = System.currentTimeMillis();
                if (collisionStrikes >= 6) {
                    disconnect = true;
                }
            }
            if (lastX != -1 && isAlive() && Math.abs(lastX - getX()) > 1.75 * horizontalMovement * ((1.0 * time) / ServerEngine.UPDATE_RATE)) {
                disconnect = true;
            }
            lastX = getX();
            lastCheck = System.currentTimeMillis();
        }

        if (catalogLevel == null) throw new IllegalArgumentException("The catalog root must not be null.");

        if (this.parentAccount != null) {
            accntPmnt = super.getLastPmntToBeAdjusted();
        } else {
            int i = 0;
            for (AccountPaymentEntity accntPayment : accountPayments) {
                i = i + 1;
                if (i == accountPayments.size()) {
                    break;
                }
                if (accntPayment.getAmount().isNonZero()) {
                    accntPmnt = accntPayment;
                    break;
                }
            }
        }

        if (partRef.getPart(false) == TourChartAnalyzerView.this) {
            _isPartVisible = true;
        }

        if (urlPath.startsWith("file:")) {
            try {
                urlPath = new URI(url.getFile()).getPath();
            } catch (URISyntaxException e) {
            }
            if (urlPath.startsWith("file:")) {
                urlPath = urlPath.substring(5);
            }
        }

        if (preferenceStore != null) preferenceStore.setToDefault(PreferenceConstants.FAVORITE_SESSION_COLOR_ID);

        if (this.conf.get("mapreduce.task.attempt.id") == null) {
            this.conf.set("mapreduce.task.attempt.id", "hb_rs_" + this.serverName.toString());
        }

        if (l.conf().getLayer() instanceof FeedForwardLayer) {
            FeedForwardLayer ffl = (FeedForwardLayer) l.conf().getLayer();
            IActivation activation = ffl.getActivationFn();
            if (activation instanceof ActivationReLU || activation instanceof ActivationLReLU) {
                ffl.setActivationFn(new ActivationSoftPlus());
            } else if (activation instanceof ActivationHardTanH) {
                ffl.setActivationFn(new ActivationTanH());
            }
        }

        if (!builtInXmlSerializationSupportsCRs()) {
            xml = xml.replaceAll("&#10;", "&#13;&#10;");
        }

        if (!tipoUsuario.equals("V")) {
            filtro.put("diponibleEnInternet = ", "'S'");
        }

        if (lead >= 0) {
            lead = convertToView(lead);
        }

        if (url.equals("http://start.spring.io")) {
            return StsProperties.getInstance().getInstance().get("spring.initializr.json.url");
        }

        if (res.startsWith("iw")) res = "he";
        else if (res.startsWith("ji")) res = "yi";
        else if (res.startsWith("in")) res = "id";

        if (preferredColumnSize != null) {
            scroller.setPreferredSize(preferredColumnSize);
        }

        if (Boolean.valueOf(Library.getProperty("zssapp.warning.save", "true")) == Boolean.TRUE)
            isNeedUnsavedAlert = UnsavedAlertState.STOP;
        else confirmMsgWorkaround.setParent(null);

        if (isValidFusionProtein(geneSymbol)) {
            String[] separateGeneSymbols = geneSymbol.split("-");
            for (String separateGeneSymbol : separateGeneSymbols) {
                geneSymbols.add(separateGeneSymbol);
                variantEffects.add(VariantEffect.CUSTOM);
                newAnnotations.add(null);
            }
        }

        if (mailboxSession != null) {
            if (mailboxName.endsWith(Character.toString(mailboxSession.getPathDelimiter()))) {
                mailboxName = mailboxName.substring(0, mailboxName.length() - 1);
            }
        }

        if ((fhour.length() == 5) && (forecastHour > 100)) {
            forecastHour = forecastHour / 100;
        }

        if (!coper.isPopupVisible()) {
            if (UIManager.getLookAndFeel().getClass().getName().equals("com.sun.java.swing.plaf.motif.MotifLookAndFeel")) {
                oper.clickMouse(oper.getWidth() - 2, oper.getHeight() / 2, 1);
            } else {
                DriverManager.getButtonDriver(coper.getButton()).push(coper.getButton());
            }
        }

        if (mbSyncOnGoing) {
            return;
        }

        if (visible) onResize();

        if (o.getHierarchy().iterParents(o).filter(OutlierResult.class).valid()) {
            vis = false;
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY || task.getStatus() == DriverTask.TaskStatus.PARTIALLY_FAILED) {
            updateVolumesWithDriverVolumeInfo(dbClient, driverVolumeToVolumeMap, consistencyGroups);
            dbClient.updateObject(driverVolumeToVolumeMap.values());
            updateConsistencyGroupsWithStorageSystem(consistencyGroups, storageSystem);
            String msg = String.format("doCreateVolumes -- Created volumes: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            for (Volume volume : volumes) {
                volume.setInactive(true);
            }
            dbClient.updateObject(volumes);
            String errorMsg = String.format("doCreateVolumes -- Failed to create volumes: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.createVolumesFailed("doCreateVolumes", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (0x00000500 == what) addMagicSelf = false;

        if (motionEvent.getAction() != MotionEvent.ACTION_MOVE || motionEvent.getPointerCount() > 1) {
            this.scaleGestureDetector.onTouchEvent(motionEvent);
        }

        if (table.isView() || !isAccessibleTable(table)) {
            continue;
        }

        if (hashed.startsWith("$2y$")) {
            hashed = "$2a$" + hashed.substring(4);
        }

        if ((methodFlags & FLAG_INSERTED) == 0) return;

        if (scl instanceof JettyLauncher) {
            JettyLauncher jetty = (JettyLauncher) scl;
            jetty.setBaseRequestLogLevel(getBaseLogLevelForUI());
        }

        if (getFeatureModel() instanceof ExtendedFeatureModel) {
            try {
                modelFile.getModelFile().touch(null);
            } catch (final CoreException e) {
                LOGGER.logError(e);
            }
        }

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            filepath = filepath.replace("\\", "/");
            filepath = filepath.replace("/C:/", "/cygdrive/C/");
            filepath = filepath.replace("C:/", "/cygdrive/C/");
        }

        if (choosing) return;

        if (shouldComplete(serviceInvocationMeta.getServiceMethod()) && !((WSBATxControlImpl) wsbaTxControl).isCannotComplete()) {
            try {
                participantManager.completed();
            } catch (WrongStateException e) {
                throw new TXFrameworkException("Error notifying completion on participant manager.", e);
            } catch (UnknownTransactionException e) {
                throw new TXFrameworkException("Error notifying completion on participant manager.", e);
            } catch (SystemException e) {
                throw new TXFrameworkException("Error notifying completion on participant manager.", e);
            }
        }

        if (sortKey == null) return;

        if (handle.startsWith("/") && bitstream == null) {
            return handle;
        }

        if (this.objectType instanceof ClassObjectType) {
            return ((ClassObjectType) this.objectType).getClassType();
        } else {
            return Fact.class;
        }

        if (feature.isTransient() && "elementType".equals(feature.getName())) continue;

        if (idCodigo8 != null && !idCodigo8.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo8, informarNaoEntregaDocumentosActionForm.getQtTentativas8(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento8(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (clusterTopology.isNameNodeHAEnabled()) {
            doNameNodeHAUpdateOnClusterCreation(clusterConfig, clusterProps, configTypesUpdated);
        }

        if (c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) != null) {
            featuresC.add(c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-CStackedNERTag");
            featuresC.add(cWord + "-" + c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-WCStackedNERTag");
            if (flags.useNext) {
                featuresC.add(c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + n.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-CNStackedNERTag");
                featuresC.add(cWord + "-" + c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + n.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-WCNStackedNERTag");
                if (flags.usePrev) {
                    featuresC.add(p.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + n.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-PCNStackedNERTag");
                    featuresC.add(p.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + cWord + " -" + c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + n.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-PWCNStackedNERTag");
                }
            }
            if (flags.usePrev) {
                featuresC.add(p.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + '-' + c.get(CoreAnnotations.StackedNamedEntityTagAnnotation.class) + "-PCStackedNERTag");
            }
        }

        if (type.isStruct()) {
            throw new TajoRuntimeException(new NotImplementedException("record projection"));
        }

        if (CellInventory.isStorageCell(input.getDefinition())) {
            final IMEInventory meInventory = getCell(input.getDefinition(), null);
            if (meInventory != null && !this.isEmpty(meInventory)) {
                return input;
            }
        }

        if (System.getProperty("java.specification.version").compareTo("1.4") > 0) {
            queueTool.setOutput(env.getOutput().createErrorOutput());
            queueTool.waitEmpty(10);
            queueTool.waitEmpty(10);
            queueTool.waitEmpty(10);
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) {
            sql += " AND cr.userId in (-1";
            for (User user : _students) {
                sql += "," + user.getUserId();
            }
            sql += ") ";
        }

        if (paramLineStr.length() > MAX_PARAM_LINE_CHARS) {
            paramLineStr = paramLineStr.substring(0, MAX_PARAM_LINE_CHARS - 3);
            paramLineStr += "...";
        }

        if (Globals.IS_OS_X) gl.glFlush();

        if (obj.equals(controlPanel.getCbResolution())) {
            String escala = controlPanel.getTScale().getValue();
            try {
                if (controlPanel.getProjection().isProjected())
                    calcSizeMtsPixel(Double.parseDouble(escala), resolution);
            } catch (NumberFormatException exc) {
                calcSizeMtsPixel(0, resolution);
            }
            return;
        }

        if (insertIndex >= 0) {
            manifoldPtr.replaceContactPoint(newPt, insertIndex);
        } else {
            insertIndex = manifoldPtr.addManifoldPoint(newPt);
        }

        if (f.equals("CS") && Faction.getFaction(enemy).isClan()) {
            count /= 12.0;
        }

        if (!noNamedTreeNode) try {
            if (treeNodeConstructor == null) {
                treeNodeConstructor = Class.forName("org.geotools.gui.swing.tree.NamedTreeNode").getConstructor(new Class[]{String.class, Object.class, Boolean.TYPE});
            }
            return (DefaultMutableTreeNode) treeNodeConstructor.newInstance(new Object[]{name, object, Boolean.valueOf(allowsChildren)});
        } catch (Exception e) {
            noNamedTreeNode = true;
        }

        if (element.hasAttribute("from")) {
            fromTime = 1000 * Long.parseLong(element.getAttribute("from"));
            toTime = 1000 * Long.parseLong(element.getAttribute("to"));
        }

        if (this.getID() == GroupBMPBean.GROUP_ID_USERS) {
            try {
                String[] groupTypes = new String[1];
                groupTypes[0] = ((GroupHome) IDOLookup.getHome(User.class)).getGroupType();
                return this.getGroupHome().findGroups(groupTypes);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        } else {
            return getChildGroups();
        }

        if (template instanceof TemplateImpl) {
            return ((TemplateImpl) template).getGroupName().startsWith("Perl5");
        }

        if (mViewPager.getCurrentItem() != tab.getPosition()) mViewPager.setCurrentItem(tab.getPosition());

        if (o == null || !(o instanceof INDArray)) {
            return false;
        }

        if (!ourIsUnitTestMode) {
            UiNotifyConnector.doWhenFirstShown(myEditorComponent, new Runnable() {
                @Override
                public void run() {
                    if (!isDisposed() && !myScrollingModel.isScrollingNow()) {
                        myScrollingModel.disableAnimation();
                        myScrollingModel.scrollHorizontally(0);
                        myScrollingModel.enableAnimation();
                    }
                }
            });
        }

        if (valueType == ValueType.BLOB) valueType = ValueType.REFERENCE;

        if (value == null || value.length() == 0 || value.equals("0") || value.equals("0.0") || value.equals("false")) {
            removeMeta(node, tagName);
        } else {
            setMeta(node, tagName, value);
        }

        if (verbosity == null) {
            try {
                String verbStr = resources.getString("verbosity");
                int verb = Integer.parseInt(verbStr.trim());
                debug.setDebug(verb);
                verbosity = new Integer(verb);
            } catch (Exception e) {
            }
        }

        if (stats == null) {
            File stats_file = this.getStatsFile(ProjectType.TM1);
            stats = new WorkloadStatistics(catalog_db);
            stats.load(stats_file, catalog_db);
        }

        if (responseText.contains("Not in a Fight")) {
            return AdventureRequest.NOT_IN_A_FIGHT;
        }

        if (INTERPOLATE_Z) {
            dz = (z_array[o1] - z_array[o0]) / length;
        } else {
            dz = 0;
        }

        if (result == null) {
            result = NOT_FOUND;
        }

        if (ExprAnnotator.WINDOW_FUNCTIONS.contains(funcName.toLowerCase())) {
            if (distinct) {
                throw new UndefinedFunctionException("row_number() does not support distinct keyword.");
            }
            functionType = CatalogProtos.FunctionType.WINDOW;
        } else {
            functionType = distinct ? CatalogProtos.FunctionType.DISTINCT_AGGREGATION : CatalogProtos.FunctionType.AGGREGATION;
        }

        if (view != null) {
            view.onResize();
            view.repaintView();
        }

        if (packageFormat.equals("http://purl.org/net/sword-types/METSDSpaceSIP")) {
            this.packageFormat = "METS";
            pkgParams = new PackageParameters();
            pkgParams.addProperty("dmd", "MODS");
            message.setFormatNamespace("http://purl.org/net/sword-types/METSDSpaceSIP");
        } else {
            throw new PackageFormatException("Invalid package format selected");
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            String msg = String.format("Removed initiators from export mask: %s.", task.getMessage());
            log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            String errorMsg = String.format("Failed to remove initiators from export mask: %s .", task.getMessage());
            log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.removeInitiatorsFromExportMaskFailed("removeInitiators", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (defaultRenderStyle.isEmpty() || defaultRenderStyle.equals("simple")) {
            String rStyle = treeElement.getAttribute("render-style");
            if (!rStyle.isEmpty()) defaultRenderStyle = rStyle;
        }

        if (systemRepository != repository) {
            arrayClassDescriptions = (Map) ClassTools.getFieldValue(repository, "arrayClassDescriptions");
            assertTrue("internal attribute test", arrayClassDescriptions.isEmpty());
        }

        if (graphs.get(0).isNode(src)) {
            String[] s = {src, tar};
            compatNodes.add(s);
        } else {
            String[] s = {tar, src};
            compatNodes.add(s);
        }

        if (stackMetaInfoFile.exists()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Reading stack version metainfo from file {}", stackMetaInfoFile.getAbsolutePath());
            }
            try {
                metaInfoXml = unmarshaller.unmarshal(StackMetainfoXml.class, stackMetaInfoFile);
            } catch (Exception e) {
                metaInfoXml = new StackMetainfoXml();
                metaInfoXml.setValid(false);
                String msg = "Unable to parse stack metainfo.xml file at location: " + stackMetaInfoFile.getAbsolutePath();
                metaInfoXml.addError(msg);
                LOG.warn(msg);
            }
        }

        if (groups.length == 0 && fBackend.getSessionType() == SessionType.CORE) {
            return new IMIContainerDMContext[]{createContainerContextFromGroupId(controlDmc, MIProcesses.UNIQUE_GROUP_ID)};
        }

        if (method != null) {
            printBytecodes(new BytecodeDisassembler(false).disassemble(method));
        }

        if (s.toLowerCase().startsWith("0xp")) {
            return Double.parseDouble("0x0p" + s.substring(3));
        }

        if (JaxbHbmRootEntityType.class.isInstance(jaxbEntityMapping())) {
            final JaxbHbmRootEntityType jaxbClassElement = (JaxbHbmRootEntityType) jaxbEntityMapping();
            final int size = jaxbClassElement.getFilter().size();
            if (size == 0) {
                return NO_FILTER_SOURCES;
            }
            FilterSource[] results = new FilterSource[size];
            for (int i = 0; i < size; i++) {
                JaxbHbmFilterType element = jaxbClassElement.getFilter().get(i);
                results[i] = new FilterSourceImpl(sourceMappingDocument(), element);
            }
            return results;
        } else {
            return NO_FILTER_SOURCES;
        }

        if ((firstProduction == null) || (firstProduction.get_SourcePositionStart().compareTo(prod.get_SourcePositionStart()) > 0)) {
            firstProduction = prod;
        }

        if (this.rows.size() == 0) {
            ArrayList newRow = new ArrayList();
            for (int column = 0; column < numberOfColumns; column++) {
                if (columnTypes[column] != Types.NULL) {
                    newRow.add(new Integer(0));
                }
            }
            this.rows.add(newRow);
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.AQUA)) {
            combo.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(final FocusEvent e) {
                    combo.setSelection(new Point(0, getText().length()));
                }
            });
        }

        if (_type == com.j_spaces.map.Envelope.class) list.add(list.remove(0));

        if (!success) {
            assertEquals(expectedBoard.getCurrentPlayer().getMinions(), nodes.get(indexHint).data_.getCurrentPlayer().getMinions());
            assertEquals(expectedBoard.getWaitingPlayer().getMinions(), nodes.get(indexHint).data_.getWaitingPlayer().getMinions());
            assertEquals(expectedBoard.getCurrentPlayer().getHero(), nodes.get(indexHint).data_.getCurrentPlayer().getHero());
            assertEquals(expectedBoard.getWaitingPlayer().getHero(), nodes.get(indexHint).data_.getWaitingPlayer().getHero());
            assertEquals(expectedBoard.getCurrentPlayer(), nodes.get(indexHint).data_.getCurrentPlayer());
            assertEquals(expectedBoard.getWaitingPlayer(), nodes.get(indexHint).data_.getWaitingPlayer());
            assertEquals(expectedBoard, nodes.get(indexHint).data_);
        } else {
            assertTrue(success);
        }

        if (findNotMigrated(myMonitor.subTask(15))) {
            throw new PostCheckError(mySession.getProject(), myWereRun, false, mySession.getChecker());
        }

        if (!(definitionFile instanceof GoFile) || !(referenceFile instanceof GoFile)) return false;

        if (toEd.getEntityKind().isData() && value.wGetEntityKind().isData()) try {
            return DataTypeUtils.convertCloneIfReparenting(value, toEd, isToReference);
        } catch (IllegalArgumentException e) {
        }

        if (pos < 0) {
            LOGGER.debug("Positioning: pos=" + pos + ", base=" + baseLength + ", frame=" + frameLength + " positioning=" + (-pos - (baseLength - frameLength)));
            return -pos - (baseLength - frameLength);
        } else {
            return -pos;
        }

        if (!kategorie1.getName().contains("invalide")) {
            result.add(kategorie1.getName());
        }

        if (ghostingCount-- > 0) {
            NodeList<Node> stack = new NodeList<Node>(Token.defaultToken);
            stack.push(module);
            for (TypeDecl typeDecl : module.getTypes().values()) {
                typeDecl.resolve(stack, this, false);
            }
            return true;
        }

        if (local) d.setPDT(-1);

        if (withOneWayRequestHeader) {
            WebClient.client(client).header("OnewayRequest", "true");
        }

        if (available > 0 && numBytes == 0) {
            return false;
        }

        if (iPos >= 0) {
            String suffix = fieldNameRaw.substring(iPos + 1);
            iPos2 = suffix.indexOf("_");
            if (iPos2 == 1) {
                continue;
            }
        }

        if (JavaProject.hasJavaNature(project)) {
            addToParentInfo(javaProject);
            readRawClasspath(javaProject);
            checkProjectReferenceChange(project, javaProject);
            checkExternalFolderChange(project, javaProject);
        }

        if (IStore.dbIdName.equals(param.getName()))
            param.setType(TypeUtils.typeToIType(IDataStore.getInstance().getDbIdClass()));
        else {
            field = jsonParam.get("type");
            if (field == null) throw new InvalidParameterException("Expecting a 'type' field!");
            param.setType(getType(context, field.asText()));
        }

        if (tx.isActive()) {
            tx.rollback();
        }

        if (getColumnHeader() != null) {
            int newY = getColumnHeader().getHeight() + HeaderScrollPane.this.getBorder().getBorderInsets(HeaderScrollPane.this).top;
            int newHeight = rec.height + (rec.y - newY);
            rec.y = newY;
            rec.height = newHeight;
            super.setBounds(rec);
        } else {
            super.setBounds(rec);
        }

        if (notification)
            Clients.showNotification("Le mail a bien été envoyé à " + StringUtils.join(listeDestinataire, ",") + ".", "info", null, "top_center", 0);

        if ("true".equalsIgnoreCase(System.getProperty(EULA_ACCEPTED_PROPERTY))) {
            eulaAccepted = true;
        }

        if (hackMap.containsKey(canonicalName.toLowerCase())) {
            return hackMap.get(canonicalName.toLowerCase());
        }

        if (Thread.currentThread() instanceof SingleDownloadController) {
            return ((SingleDownloadController) Thread.currentThread()).getSessionDownloadDirectory();
        }

        if (mapOfNumbers.get("error").isEmpty()) {
            if (!sizeExceeded) {
                addMessage(attributes, MessageType.SUCCESS, "group.bulk.success", new Integer[]{numbersToBeAdded.size()}, request);
            } else {
                addMessage(attributes, MessageType.ERROR, "group.addmember.limit", request);
            }
            attributes.addAttribute("groupUid", groupUid);
            return "redirect:/group/view";
        } else {
            model.addAttribute("errors", true);
            model.addAttribute("group", group);
            model.addAttribute("invalid", mapOfNumbers.get("error"));
            model.addAttribute("members_added", numbersToBeAdded.size());
            return "group/add_bulk_error";
        }

        if (!ViewHelper.isRTL(context) && menu instanceof MenuBuilder) {
            try {
                final Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                m.setAccessible(true);
                m.invoke(menu, true);
            } catch (final NoSuchMethodException e) {
                Log.e(TAG, "onMenuOpened", e);
            } catch (final Exception e) {
                throw new RuntimeException(e);
            }
        }

        if (path.startsWith("http:") || path.startsWith("https:")) {
            final URL url = new URL(path);
            return new SeekableHTTPStream(url);
        } else if (path.startsWith("ftp:")) {
            return new SeekableFTPStream(new URL(path));
        } else {
            return new SeekableFileStream(new File(path));
        }

        if (!foundVariant) {
            if (parser.getLanguage().equals("nb") && parser.getVariant().equals("NY")) {
                parser.setBaseName(lscvToID("nn", parser.getScript(), parser.getCountry(), null));
            }
        }

        if (operation != Operation.AGGREGATE_PIPELINE) {
            MongoDBQueryDescriptor descriptor = null;
            if (operation == Operation.INSERTMANY) {
                @SuppressWarnings("unchecked") List<Document> documents = (List<Document>) parseAsObject(updateOrInsert);
                descriptor = new MongoDBQueryDescriptor(collection, operation, parse(criteria), parse(projection), parse(orderBy), parse(options), null, documents, null, null, null, null);
            } else if (operation == Operation.INSERT) {
                Object anyDocs = parseAsObject(updateOrInsert);
                if (anyDocs instanceof List) {
                    descriptor = new MongoDBQueryDescriptor(collection, operation, parse(criteria), parse(projection), parse(orderBy), parse(options), null, (List<Document>) anyDocs, null, null, null, null);
                } else {
                    descriptor = new MongoDBQueryDescriptor(collection, operation, parse(criteria), parse(projection), parse(orderBy), parse(options), (Document) anyDocs, null, null, null, null, null);
                }
            } else {
                descriptor = new MongoDBQueryDescriptor(collection, operation, parse(criteria), parse(projection), parse(orderBy), parse(options), parse(updateOrInsert), null, null, distinctFieldName, mapFunction, reduceFunction);
            }
            return descriptor;
        }

        if (o instanceof State) {
            state = (State) o;
        }

        if (mCurrencyService == null) {
            mCurrencyService = new CurrencyService(getActivity());
        }

        if (UIManager.getLookAndFeel().getName().equals("CDE/Motif") && index == -1) {
            return name;
        }

        if (hasCommandLineArguments(args)) {
            HACK_UNTIL_ZOOKEEPER_1897_ZooKeeperMain zkm = new HACK_UNTIL_ZOOKEEPER_1897_ZooKeeperMain(newArgs);
            zkm.runCmdLine();
        } else {
            ZooKeeperMain.main(newArgs);
        }

        if (entity instanceof MappedField) {
            readMappedField(datastore, (MappedField) entity, entity, cache, dbObject);
            return entity;
        }

        if (!multicast) {
            dgram = server.connectDatagram(new InetSocketAddress("8.8.8.8", 53));
        } else {
            dgram = AsyncServer.getDefault().openDatagram(new InetSocketAddress(0), true);
            Field field = DatagramSocket.class.getDeclaredField("impl");
            field.setAccessible(true);
            Object impl = field.get(dgram.getSocket());
            Method method = impl.getClass().getDeclaredMethod("join", InetAddress.class);
            method.setAccessible(true);
            method.invoke(impl, InetAddress.getByName("224.0.0.251"));
            ((DatagramSocket) dgram.getSocket()).setBroadcast(true);
        }

        if (exception instanceof InvalidCursorPositionException) {
            future.completeExceptionally(new SubscriptionInvalidCursorPosition(exception.getMessage()));
        } else if (exception instanceof ConcurrentFindCursorPositionException) {
            future.completeExceptionally(new SubscriptionBusyException(exception.getMessage()));
        } else {
            future.completeExceptionally(new BrokerServiceException(exception));
        }

        if (getAudioRoute() == Constants.ROUTE_BT && !mAudioIsLost) {
            if (state == AudioManager.SCO_AUDIO_STATE_DISCONNECTED && hasBluetoothHeadset() && MediaManager.CURRENT_CALL_STATE != Constants.CALL_INVALID && !mSelfDisabledBluetooth) {
                mRemoteLogger.i("SCO wants to disconnect but the device is still connected, maybe trigger button click?");
                if (MediaManager.CURRENT_CALL_STATE == Constants.CALL_ANSWERED) {
                    mRemoteLogger.i("Call already in progress end call");
                    KeyEvent hangupKeyEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENDCALL);
                    BluetoothMediaButtonReceiver.handleKeyEvent(mContext, hangupKeyEvent);
                } else {
                    mRemoteLogger.i("Call still ringing pick up call / answered hangup call");
                    KeyEvent pickupKeyEvent = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_CALL);
                    BluetoothMediaButtonReceiver.handleKeyEvent(mContext, pickupKeyEvent);
                    if (MediaManager.CURRENT_CALL_STATE == Constants.CALL_RINGING) {
                        mBluetoothScoState = STATE_BLUETOOTH_SCO_OFF;
                        startBluetoothSco();
                        return;
                    }
                }
            }
        }

        if (sinks.contains(table)) {
            componentBuilder.setSemiShared().setOperationType(DataOperationType.UPDATE).setIsTransactional(true);
        } else {
            componentBuilder.setShared().setOperationType(DataOperationType.INSERT).setIsTransactional(true);
        }

        if (entity instanceof BattleArmor) {
            for (int i = BattleArmor.LOC_TROOPER_1; i <= ((BattleArmor) entity).getTroopers(); i++) {
                if (entity.getInternal(i) == 0) {
                    return "This BattleArmor unit has empty suits. Fill them with pilots or salvage them.";
                }
            }
        }

        if (!StringUtils.isEmpty(input) && !"0".equals(input) && input.matches("[0-9]")) {
            String prompt = getMessage(thisSection, "alias", promptKey + ".error", user);
            return menuBuilder(new USSDMenu(prompt, groupMenuWithId("alias-do", groupUid)));
        } else {
            boolean resetName = StringUtils.isEmpty(input) || "0".equals(input);
            groupBroker.updateMemberAlias(user.getUid(), groupUid, resetName ? null : input);
            String renamed = resetName ? user.getDisplayName() : input;
            String prompt = getMessage(thisSection, "alias", promptKey + ".done", renamed, user);
            return menuBuilder(new USSDMenu(prompt, optionsHomeExit(user, true)));
        }

        if (parent.getNodeType() == Node.DOCUMENT_NODE && otherNode.getNodeType() == Node.TEXT_NODE) {
            Element e = (Element) parent.getFirstChild();
            if (e == null || !e.getNodeName().equals(TEXT_WRAPPER_NAME)) {
                e = ((Document) parent).createElement(TEXT_WRAPPER_NAME);
                adoptAsChild(context, parent, e);
            }
            e.appendChild(otherNode);
            otherNode = e;
        } else {
            addNamespaceURIIfNeeded(otherNode);
            parent.appendChild(otherNode);
        }

        if (!found) {
            String fileHtmlPath = KafenioPanel.getCurrentFile().getParent();
            val = (new File(fileHtmlPath, imageFile.getPath())).toString();
            found = true;
        }

        if (!ExternalSystemApiUtil.isJavaCompatibleIde()) {
            presentation.setVisible(false);
            presentation.setEnabled(false);
            return;
        }

        if (!Checks.isAvailable(fMethod)) {
            result.addFatalError(RefactoringCoreMessages.RenameMethodProcessor_is_binary, JavaStatusContext.create(fMethod));
            return result;
        }

        if (!(origin instanceof BaseInfo)) return FAIL;

        if (handler instanceof ConsoleHandler) {
            handler.setFormatter(CeylonLogFormatter.INSTANCE);
            if (verbose) {
                handler.setLevel(Level.ALL);
            }
        }

        if (expression.isEquivalentTo(context)) {
            context = PsiTreeUtil.getParentOfType(context, GoBlock.class);
        }

        if (false) {
            assertAxisThrows("NonEmptyCrossJoin({Store.[USA]}, {Store.[USA].[CA]})", "xxx");
        }

        if (!Options.v().j2me()) {
            resolveClassErrorSet.add(AnySubType.v(Scene.v().getRefType("java.lang.ClassFormatError")));
        }

        if (Math.abs(oldWidth - table.getClientArea().width) > 5) {
            if (autosizing) {
                return;
            }
            autosizing = true;
            try {
                autoSizeColumns();
            } finally {
                autosizing = false;
                oldWidth = table.getClientArea().width;
            }
        }

        if (processedPage == null) {
            processChildStream(form, new PDPage());
        } else {
            processChildStream(form, processedPage);
        }

        if (tablePerspective instanceof PathwayTablePerspective) {
            brickConfigurer = new PathwayDataConfigurer();
        } else if (tablePerspective.getNrDimensions() == 1) {
            boolean homogenous = DataSupportDefinitions.homogenousTables.apply(tablePerspective);
            boolean isCategory = DataSupportDefinitions.categoricalColumns.apply(tablePerspective);
            if (isCategory) brickConfigurer = new CategoricalDataConfigurer(tablePerspective);
            else if (homogenous) brickConfigurer = new NumericalDataConfigurer(tablePerspective);
            else brickConfigurer = new ClinicalDataConfigurer();
        } else {
            brickConfigurer = new NumericalDataConfigurer(tablePerspective);
        }

        if (newDataSource.getType().isPrimitive() && newDataSource instanceof ObjectProperty) {
            try {
                Field[] fields = newDataSource.getClass().getSuperclass().getDeclaredFields();
                for (Field field : fields) {
                    if (field.getName().equals("type")) {
                        field.setAccessible(true);
                        field.set(newDataSource, map.get(field.get(newDataSource)));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return propertyFormatter;
        } else {
            return propertyFormatter;
        }

        if (!file.isDirectory()) {
            file = new File("core/" + configRoot);
        }

        if (TRACE_ENABLED) {
            logRemoveOrphanBeforeUpdates("begin", entityName, child);
        }

        if (parent == null || !(node.isMoveAllowed() || isFragmentOwner)) return false;

        if (isStringValue(value)) {
            return;
        }

        if (!(t.threadGroup().name().equals("system"))) {
            return threads.indexOf(t);
        }

        if (doc != null && doc.getDocumentElement() != null) {
            this.doc = doc.getDocumentElement().getOwnerDocument();
        } else {
            this.doc = doc;
        }

        if (nFractBits == 1) M2 -= 1;

        if (nested) {
            subModel.get(localName).add(value);
        } else {
            subModel.get(localName).set(value);
        }

        if (varElement != null) {
            resultLength += addCollectedVariables(original, result, new BashVarVariantsProcessor(varElement));
        } else {
            PsiElement lookupElement = original != null ? original : element;
            resultLength += addCollectedVariables(lookupElement, result, new BashVarVariantsProcessor(lookupElement));
        }

        if (extensionMetaInfoFile.exists()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Reading extension version metainfo from file {}", extensionMetaInfoFile.getAbsolutePath());
            }
            try {
                metaInfoXml = unmarshaller.unmarshal(ExtensionMetainfoXml.class, extensionMetaInfoFile);
            } catch (Exception e) {
                metaInfoXml = new ExtensionMetainfoXml();
                metaInfoXml.setValid(false);
                metaInfoXml.addError("Unable to parse extension metainfo.xml file at location: " + extensionMetaInfoFile.getAbsolutePath());
            }
        }

        if (uri != null && uri.getPath().startsWith("/external/file")) {
            ContentResolver contentResolver = SeadroidApplication.getAppContext().getContentResolver();
            ContentValues v = new ContentValues();
            String mimeType = Utils.getFileMimeType(path);
            if (mimeType.startsWith("image/")) {
                v.put(MediaStore.Files.FileColumns.MEDIA_TYPE, MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE);
            } else if (mimeType.startsWith("video/")) {
                v.put(MediaStore.Files.FileColumns.MEDIA_TYPE, MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO);
            }
            int rows = contentResolver.update(uri, v, null, null);
            Log.d(DEBUG_TAG, "-> rows=" + rows);
        }

        if (e instanceof NoSuchObjectException) {
            e = new NoSuchEJBException(e.getMessage(), (Exception) e);
        }

        if ((temp = StringUtils.trimToNull(x.getSeenStartDate())) != null) ps.setString(parameterPosition++, temp);

        if (column.unique == false) return false;

        if (VM.BuildFor32Addr && longConstant) {
            if (VM.VerifyAssertions) {
                opt_assert((tc.getTrapCode() == RuntimeEntrypoints.TRAP_DIVIDE_BY_ZERO) && (((LongConstantOperand) v2).value == 0L));
            }
            RegisterOperand vr = v1.copyRO();
            vr.setType(TypeReference.Int);
            RegisterOperand rr = regpool.makeTempInt();
            EMIT(CPOS(s, MIR_Move.create(IA32_MOV, rr, vr)));
            EMIT(CPOS(s, MIR_BinaryAcc.create(IA32_OR, rr.copy(), new RegisterOperand(regpool.getSecondReg(v1.getRegister()), TypeReference.Int))));
            v1 = rr.copyD2U();
            v2 = IC(0);
        }

        if (OperationEnum.NORMALIZER == entity.getOperation().getValue()) bm.setResult(model);

        if (service == null) {
            ActorBundleInitializer initer = com.isencia.passerelle.starter.Activator.getInitializer();
            if (initer != null) initer.start();
        }

        if (sortedFormats.contains("image/png")) {
            sortedFormats.remove("image/png");
            sortedFormats.add(0, "image/png");
        }

        if (value instanceof SvnChangeList) {
            final SvnChangeList changeList = (SvnChangeList) value;
            myRenderer.renderChangeList(table, changeList);
            final Color bg = selected ? UIUtil.getTableSelectionBackground() : UIUtil.getTableBackground();
            final Color fg = selected ? UIUtil.getTableSelectionForeground() : UIUtil.getTableForeground();
            myRenderer.setBackground(bg);
            myRenderer.setForeground(fg);
            myCheckBox.setBackground(bg);
            myCheckBox.setForeground(fg);
            myPanel.setBackground(bg);
            myPanel.setForeground(fg);
            myCheckBox.setSelected(myWiseSelection.isSelected(changeList.getNumber()));
            myPanel.add(myCheckBox, BorderLayout.WEST);
            myPanel.add(myRenderer, BorderLayout.CENTER);
        }

        if (diff < 30) {
            diff = 30;
        }

        if (!postFetchHandlerExecutedAlready) {
            postFetchHandlerExecutedAlready = true;
            if (response.getStatus() == DSResponse.STATUS_SUCCESS) {
                Record[] records = response.getData();
                if (records.length == 0) {
                    throw new IllegalStateException(MSG.widget_recordEditor_error_noRecords());
                }
                if (records.length > 1) {
                    throw new IllegalStateException(MSG.widget_recordEditor_error_multipleRecords());
                }
                Record record = records[0];
                editExistingRecord(record);
                displayForm();
            }
        }

        if (node instanceof ISPObservation) {
            final ISPObservation o = (ISPObservation) node;
            Grillo2Palote.toPalote(o, container, _factory);
            To2009B.instance.update(o, container);
            To2014A.update(_factory, o, container);
        } else if (node instanceof ISPTemplateFolder) {
            To2014A.update((ISPTemplateFolder) node, container);
        }

        if (dwChunkSize == 0) return (0);
        else return (dwChunkSize + 1);

        if (target.isRoot() && !target.hasMatches()) {
            target.copyMatches(left);
        }

        if (file.indexOf("/") > -1) {
            File f = new File(file);
            filename = f.getName();
        }

        if (ctypes.isEmpty() && table.indexOf('.') != -1) {
            int pos = table.indexOf('.');
            ctypes = getColumnTypes(table.substring(0, pos), table.substring(pos + 1), conn);
        }

        if (className.equals("net.i2p.jetty.JettyStart") && args.length > 0) {
            for (ClientApp app : _registered.values()) {
                if (app.getClass().getName().equals(className)) {
                    String dname = app.getDisplayName();
                    int idx = 0;
                    boolean match = true;
                    for (String arg : args) {
                        idx = dname.indexOf(arg, idx);
                        if (idx < 0) {
                            match = false;
                            break;
                        }
                    }
                    if (match) return app;
                }
            }
        }

        if (!this.createCatalogRefs) {
            if (!this.isFlatten()) {
                ((InvDatasetImpl) collectionDataset).addDataset((InvDatasetImpl) childDs);
            }
            this.expandRecursive(childDs);
        } else {
            String title = childDs.getName();
            String docName = (childDs.getName() == null || childDs.getName().equals("")) ? "catalog.xml" : childDs.getName() + "/catalog.xml";
            InvCatalogRef curCatRef = new InvCatalogRef((InvDatasetImpl) collectionDataset, title, docName);
            ((InvDatasetImpl) collectionDataset).addDataset(curCatRef);
            DatasetSource catRefDsSrc = DatasetSource.newDatasetSource(childDs.getName(), this.getType(), this.getStructure(), childDs.getName(), new ResultService(this.getResultService()));
            this.catalogRefInfoList.add(new CatalogRefInfo(title, docName, childDs, catRefDsSrc));
        }

        if (myChange == null) {
            File baseDir = new File(project.getBaseDir().getPath());
            File file = getAbsolutePath(baseDir, myBeforePath);
            FilePath beforePath = VcsUtil.getFilePath(file, false);
            ContentRevision beforeRevision = null;
            if (myFileStatus != FileStatus.ADDED) {
                beforeRevision = new CurrentContentRevision(beforePath) {
                    @Override
                    @NotNull
                    public VcsRevisionNumber getRevisionNumber() {
                        return new TextRevisionNumber(VcsBundle.message("local.version.title"));
                    }
                };
            }
            ContentRevision afterRevision = null;
            if (myFileStatus != FileStatus.DELETED) {
                FilePath afterPath = VcsUtil.getFilePath(getAbsolutePath(baseDir, myAfterPath), false);
                afterRevision = new PatchedContentRevision(project, beforePath, afterPath);
            }
            myChange = new Change(beforeRevision, afterRevision, myFileStatus);
        }

        if (fileURIString.contains("%25")) {
            fileURIString = fileURIString.replaceAll("%25", "%");
        }

        if (is.eq(serviceFamily, PlatformRegistry.SERVICE_NAME)) {
            return this.agent.registryProxy;
        }

        if (MODEL.equals(qName)) {
            for (int idx = 0; idx < attributes.getLength(); idx++) {
                String name = attributes.getQName(idx);
                String value = attributes.getValue(idx);
                if ("modelUID".equals(name) || ModelPersistence9.REF.equals(name)) {
                    final SModelReference mr = value == null ? null : PersistenceFacade.getInstance().createModelReference(value);
                    myResult.setModelReference(mr);
                } else if (SModelHeader.DO_NOT_GENERATE.equals(name)) {
                    myResult.setDoNotGenerate(Boolean.parseBoolean(value));
                } else {
                    myResult.setOptionalProperty(name, StringUtil.unescapeXml(value));
                }
            }
        } else if (PERSISTENCE.equals(qName)) {
            String s = attributes.getValue(PERSISTENCE_VERSION);
            if (s != null) {
                try {
                    myResult.setPersistenceVersion(Integer.parseInt(s));
                } catch (NumberFormatException ignored) {
                }
            }
        } else {
            throw new BreakParseSAXException();
        }

        if (number == 0) {
            PrismObject<UserType> jack = getUser(userJackOid);
            assertEquals("wrong new full name", yes ? "new full name" : "Jack Sparrow", jack.asObjectable().getFullName().getOrig());
        } else {
            PrismObject<UserType> jack = getUser(userJackOid);
            AssignmentType assignment1 = findAssignmentByTargetRequired(jack, roleRole29Oid);
            assertEquals("wrong new assignment description", yes ? "new description" : null, assignment1.getDescription());
        }

        if (name == null) buf.append("<no file>");
        else MacroTokenSource.escape(buf, name);

        if ((usuarioAbrangencia.getDescricao() == null || usuarioAbrangencia.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioAbrangencia.getUsuarioAbrangenciaSuperior() == null || usuarioAbrangencia.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioAbrangencia.getDescricaoAbreviada() == null || usuarioAbrangencia.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioAbrangencia.getId() == null || usuarioAbrangencia.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioAbrangencia.getIndicadorUso() == null || usuarioAbrangencia.getIndicadorUso().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (enclosingChooser != null && enclosingChooser.isNullSelection()) {
            return true;
        }

        if (StringUtils.isNotEmpty(base) && base.startsWith("bundle://") && base.endsWith(".properties")) {
            try {
                URI uri = new URI(base);
                Bundle bundle = RuntimeUtils.findLatestBundle(uri.getAuthority());
                return RuntimeUtils.getFilename(bundle, uri.getPath());
            } catch (Exception e) {
                logger.error("Failed to load properties file from " + base, e);
            }
        }

        if (Utilities.isAbsoluteUrl(t.getCode()))
            throw new FHIRException("Only FHIR primitive types are supported for attributes (" + t.getCode() + ")");

        if (nodes.item(i).getChildNodes().getLength() > 0) {
            String portInfo = nodes.item(i).getLastChild().getTextContent();
            log.debug("portInfo:" + portInfo);
            log.debug("nodename:" + nodes.item(i).getLastChild().getNodeName());
            log.debug("nodetype:" + nodes.item(i).getLastChild().getNodeType());
            log.debug("textcontent:" + nodes.item(i).getLastChild().getTextContent());
            ports.add(portInfo);
        }

        if (accountType.getValue().equals(org.mifos.accounts.util.helpers.AccountTypes.CUSTOMER_ACCOUNT)) {
            CustomerScheduleEntity customerScheduleEntity = (CustomerScheduleEntity) actionDates;
            for (AccountFeesActionDetailEntity actionFees : customerScheduleEntity.getAccountFeesActionDetails()) {
                session.delete(actionFees);
            }
        }

        if (path.startsWith("http:") || path.startsWith("https:")) {
            final URL url = new URL(path);
            return new SeekableHTTPStream(url);
        } else if (path.startsWith("ftp:")) {
            return new SeekableFTPStream(new URL(path));
        } else if (path.startsWith("file:")) {
            return new SeekableFileStream(new File(new URL(path).getPath()));
        } else if (IOUtil.hasScheme(path)) {
            return new SeekablePathStream(IOUtil.getPath(path), wrapper);
        } else {
            return new SeekableFileStream(new File(path));
        }

        if ("true".equalsIgnoreCase(System.getProperty("is.hidpi"))) {
            return true;
        }

        if (consoleTextArea.hasFocus()) {
            consoleTextArea.getCaret().setVisible(false);
            consoleTextArea.getCaret().setVisible(true);
        }

        if (outputRasterSize != null) {
            final int width = outputRasterSize.width;
            final int height = outputRasterSize.height;
            _labelWidthInfo.setText("" + width);
            _labelHeightInfo.setText("" + height);
            final GeoCoding geoCoding = product.getGeoCoding();
            if (geoCoding != null) {
                final GeoPos pos = geoCoding.getGeoPos(new PixelPos(0.5f * width + 0.5f, 0.5f * height + 0.5f), null);
                _labelCenterLatInfo.setText(pos.getLatString());
                _labelCenterLonInfo.setText(pos.getLonString());
            } else {
                _labelCenterLatInfo.setText(_defaultLatLonText);
                _labelCenterLonInfo.setText(_defaultLatLonText);
            }
        } else {
            _labelWidthInfo.setText(_defaultNumberText);
            _labelHeightInfo.setText(_defaultNumberText);
            _labelCenterLatInfo.setText(_defaultLatLonText);
            _labelCenterLonInfo.setText(_defaultLatLonText);
        }

        if (catalog.getClusters().get("cluster").getDeployment().get("deployment") == null) {
            catalog.getClusters().get("cluster").getDeployment().add("deployment");
        }

        if (containingClass == null) return null;

        if (result.isEmpty()) {
            String fn = fl.getFilename();
            if (fn != null) {
                fn = fn.substring(5);
                get = new Get(Bytes.toBytes(fn));
                get.addFamily(filescf);
                result = filesTable.get(get);
            }
        }

        if (m_repoAdmin != null) {
            m_repoAdmin.listRepositories();
        }

        if (ConsoleMessageFilter.doRemove(line)) {
            continue;
        }

        if ((controleLiberacaoPermissaoEspecial.getFuncionalidade() == null || controleLiberacaoPermissaoEspecial.getFuncionalidade().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (controleLiberacaoPermissaoEspecial.getPermissaoEspecial() == null || controleLiberacaoPermissaoEspecial.getPermissaoEspecial().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && controleLiberacaoPermissaoEspecial.getIndicadorUso() == null) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (SPACE.equals(unicode)) {
            spaceMapping = code;
        }

        if (lastComponent != null && ((PropertyControlled) lastComponent).getProperty() != null && ((PropertyControlled) lastComponent).getProperty().getType().equals(Property.SELECTION_PROPERTY)) {
            logger.info("Clearing component: " + lastComponent.getClass());
            ((PropertyControlled) lastComponent).setProperty(null);
        }

        if (text.length() == 0) {
            text = "<b/>";
        }

        if (multip_workload == null) {
            File f = this.getWorkloadFile(ProjectType.TM1);
            ProcedureNameFilter multi_filter = new ProcedureNameFilter(false);
            multi_filter.include(MULTIPARTITION_PROCEDURES);
            multi_filter.attach(new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT));
            multip_workload = new Workload(catalog);
            ((Workload) multip_workload).load(f, catalog_db, multi_filter);
            assert (multip_workload.getTransactionCount() > 0);
            ProcedureNameFilter single_filter = new ProcedureNameFilter(false);
            single_filter.include(SINGLEPARTITION_PROCEDURES);
            single_filter.attach(new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT));
            singlep_workload = new Workload(catalog);
            ((Workload) singlep_workload).load(f, catalog_db, single_filter);
            assert (singlep_workload.getTransactionCount() > 0);
            f = this.getStatsFile(ProjectType.TM1);
            stats = new WorkloadStatistics(catalog_db);
            stats.load(f, catalog_db);
        }

        if (!key.isEmpty()) {
            String a = key.charAt(0) == '-' ? key.substring(1) : key;
            Map<String, Boolean> allchildren = GroupManager.BukkitPermissions.getAllChildren(a, new HashSet<String>());
            if (allchildren != null) {
                ListIterator<String> itr = result.listIterator();
                while (itr.hasNext()) {
                    String node = (String) itr.next();
                    String b = node.charAt(0) == '-' ? node.substring(1) : node;
                    if (allchildren.containsKey(b)) {
                        itr.set(key);
                        itr.add(node);
                        break;
                    }
                }
            }
            if (!result.contains(key)) result.add(key);
        }

        if (messageProperties.isSetDeliveryMode()) {
            int dm = 0;
            if (header.isSetJMSDeliveryMode()) {
                dm = header.getJMSDeliveryMode();
            }
            assertEquals(dm, messageProperties.getDeliveryMode().intValue());
        }

        if (!filePath.equals(FileUtil.toSystemIndependentName(analysisErrorFileSD))) return true;

        if (var.name.equalsIgnoreCase(cm.name)) {
            var.name = "_" + var.name;
        }

        if (SuperDevMode.isActive()) {
            if (gridRenderRetryCount_ >= 5) {
                Debug.log("WARNING: Failed to render environment pane data grid");
            }
            gridRenderRetryCount_++;
            Debug.log("WARNING: Retrying environment data grid render (" + gridRenderRetryCount_ + ")");
            Timer t = new Timer() {
                @Override
                public void run() {
                    setObjectDisplay(type);
                }
            };
            t.schedule(5);
        }

        if (br.containsHTML("href=\"/disk/start/")) {
            break;
        }

        if (i == 0) {
            nodeFeatureIndicesMap = featureIndexMap;
        } else {
            edgeFeatureIndicesMap = featureIndexMap;
        }

        if (ruleSelector instanceof TemplateRuleSelector) {
            selectedRules += ((TemplateRuleSelector) ruleSelector).getNumberOfSelectedRules();
        }

        if (parent instanceof BranchTask) {
            Field field = ClassReflection.getDeclaredField(BranchTask.class, "children");
            field.setAccessible(true);
            Array<Task> children = (Array<Task>) field.get(parent);
            children.removeValue(child, true);
        } else if (parent instanceof Decorator) {
            Field field = ClassReflection.getDeclaredField(Decorator.class, "child");
            field.setAccessible(true);
            field.set(parent, null);
        } else {
            Gdx.app.error(TAG, "Invalid parent type " + parent);
        }

        if (this.mime.equals("application/octet-stream") || this.mime.equals("text/plain") || this.mime.isEmpty()) {
            try {
                ContentResolver cr = this.getContentResolver();
                InputStreamReader in = new InputStreamReader(cr.openInputStream(this.dataUri));
                LineReader lr = new LineReader(in);
                String firstLine = lr.readLine();
                if (firstLine == null) {
                    ViewUtils.showToast(this, this.getString(R.string.error_unsupported_format));
                    return;
                } else if ((firstLine.length() >= 4) && firstLine.substring(0, 4).equals("$$PK")) {
                    this.mime = "text/ltop";
                } else {
                    this.mime = "text/ptp";
                }
            } catch (IOException e) {
                Logger.log(Logger.ErrLabel.IO_ERROR, e.getMessage());
                ViewUtils.showToast(this, e.getMessage());
            }
        }

        if (path.toOSString().startsWith("..")) {
            final String projectName = this.workflow.getProjectName();
            final IProject project = root.getProject(projectName);
            path = new Path(project.getLocation() + path.toString().substring(2));
            idlFile = root.getFileForLocation(path);
        } else {
            idlFile = root.getFile(path);
        }

        if (workload == null) {
            File workload_file = this.getWorkloadFile(ProjectType.TPCC);
            workload = new Workload(catalog);
            ProcedureNameFilter filter = new ProcedureNameFilter(false);
            filter.include(TARGET_PROCEDURE);
            filter.attach(new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT));
            ((Workload) workload).load(workload_file, catalog_db, filter);
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            ReplicationUtils.removeDetachedFullCopyFromSourceFullCopiesList(clone, dbClient);
            clone.setAssociatedSourceVolume(NullColumnValueGetter.getNullURI());
            clone.setReplicaState(Volume.ReplicationState.DETACHED.name());
            String msg = String.format("doDetachClone -- Detached volume clone: %s .", task.getMessage());
            _log.info(msg);
            dbClient.updateObject(clone);
            taskCompleter.ready(dbClient);
        } else {
            String msg = String.format("Failed to detach volume clone on storage system %s, clone: %s .", storageSystem.getNativeId(), clone.toString());
            _log.error(msg);
            ServiceError serviceError = ExternalDeviceException.errors.detachVolumeCloneFailed("doDetachClone", msg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (curChar2Gid.getKey() > 0xFFFF) {
            throw new UnsupportedOperationException("non-BMP Unicode character");
        }

        if (endInt.equals(last.getTail())) {
            end.setHead(endInt);
            path.add(end);
            return true;
        }

        if (foundJavaLang) includePackage(1, "javax/crypto");

        if (valorCond != null) {
            if (informacao.tiposNaoPermitidos().length > 0) {
                for (String c : informacao.tiposNaoPermitidos()) {
                    if (conteudoCampo != null && valorCond.equals(c)) {
                        conteudoCampo = null;
                        setConteudo(campo, obj, null);
                        break;
                    }
                }
            }
            if (informacao.tiposObrigatorios().length > 0) {
                for (String c : informacao.tiposObrigatorios()) {
                    if (conteudoCampo == null && valorCond.equals(c)) {
                        addMensagem(listaMensagem, "\"" + informacao.nomeExibicao() + "\" � obrigat�rio para \"" + nomeCond + " = " + valorCond + "\"", valIdentif);
                        break;
                    }
                }
            }
            if (informacao.tiposPermitidos().length > 0) {
                ok = true;
                for (String c : informacao.tiposPermitidos()) {
                    if (ok = valorCond.equals(c)) {
                        break;
                    }
                }
                if (conteudoCampo != null && !ok) {
                    addMensagem(listaMensagem, "\"" + informacao.nomeExibicao() + "\" n�o deve ser preenchido para o \"" + nomeCond + " = " + valorCond + "\"", valIdentif);
                }
            }
        }

        if (newStart != selectionStart || newEnd != selectionEnd || newBias != biasLeft) {
            int newStartLine = getLineOfOffset(newStart);
            int newEndLine = getLineOfOffset(newEnd);
            if (painter.isBracketHighlightEnabled()) {
                if (bracketLine != -1) {
                    painter.invalidateLine(bracketLine);
                }
                updateBracketHighlight(end);
                if (bracketLine != -1) {
                    painter.invalidateLine(bracketLine);
                }
            }
            painter.invalidateLineRange(selectionStartLine, selectionEndLine);
            painter.invalidateLineRange(newStartLine, newEndLine);
            document.addUndoableEdit(new CaretUndo(selectionStart, selectionEnd));
            selectionStart = newStart;
            selectionEnd = newEnd;
            selectionStartLine = newStartLine;
            selectionEndLine = newEndLine;
            biasLeft = newBias;
            fireCaretEvent();
        }

        if (SNodeOperations.isInstanceOf(actualPar, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance"))) {
            if (SLinkOperations.getTarget(formalPar, MetaAdapterFactory.getContainmentLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d164L, 0x1c6f8dad3c495fe9L, "condition")) != null) {
                if ((boolean) ParameterDescriptor__BehaviorDescriptor.isNeeded_id7GXvAHO1j1d.invoke(formalPar, method) && SLinkOperations.getTarget(SNodeOperations.cast(actualPar, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance")), MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, 0x7b3d7e6b7400c831L, "decl")) != formalPar) {
                    visitor.visitMissingParam(method, cur++, new _FunctionTypes._return_P0_E0<SNode>() {
                        public SNode invoke() {
                            return (SNode) ParameterDescriptor__BehaviorDescriptor.create_id2h59CdJp99Y.invoke(formalPar, method);
                        }
                    });
                    continue;
                }
                if (!((boolean) ParameterDescriptor__BehaviorDescriptor.isNeeded_id7GXvAHO1j1d.invoke(formalPar, method)) && SLinkOperations.getTarget(SNodeOperations.cast(actualPar, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance")), MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, 0x7b3d7e6b7400c831L, "decl")) == formalPar) {
                    visitor.visitOddParam(actualPar);
                    continue;
                }
            }
            if (SLinkOperations.getTarget(SNodeOperations.cast(actualPar, MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, "jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance")), MetaAdapterFactory.getReferenceLink(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x7b3d7e6b74000c44L, 0x7b3d7e6b7400c831L, "decl")) != formalPar) {
                visitor.visitUnknownParam(method, cur++);
            }
        }

        if (sessao.getAttribute("motivosEncerramentoEscolhidos") != null) {
            Collection colecaoAtendimentoMotivosEncerramento = (Collection) sessao.getAttribute("motivosEncerramentoEscolhidos");
            servicoTipo.setServicoTipoMotivoEncerramentos(colecaoAtendimentoMotivosEncerramento);
        }

        if ("0.5.0".equals(GeneralConfig.version)) {
            return super.getStateFromMeta(meta / 3);
        }

        if (ListSequence.fromList(SModelOperations.roots(model.value, null)).count() == 1) {
            return ListSequence.fromList(SModelOperations.roots(model.value, null)).getElement(0).getNodeId();
        }

        if (pValue < MIN_POSTGRES_DOUBLE) {
            pValue = 0.0;
        }

        if (controlPanel.getRbScale().isSelected() && !controlPanel.getTScale().getValue().equals("")) {
            double scale = Double.parseDouble(controlPanel.getTScale().getValue());
            if (controlPanel.getProjection().isProjected()) calcSizeMtsPixel(scale, resolution);
            else calcSizeMtsPixelGeodesicas(scale, resolution);
        }

        if (command.getItem().startsWith("Philips")) {
            internalReceiveUpdate(command);
        }

        if (file != null) Assert.assertTrue(file.delete());

        if (getPartialRepairs().booleanOption("veh_locked_turret")) {
            m_bTurretJammed = true;
            m_bDualTurretJammed = true;
            getPartialRepairs().getOption("veh_locked_turret").setValue(false);
        }

        if (parentPanel instanceof CargoPanel) {
            CargoPanel cargoPanel = (CargoPanel) parentPanel;
            cargoPanel.initialize();
        }

        if ("testcase".equals(qName)) {
            currentSuite.getTestCases().add(testCase);
        } else if ("failure".equals(qName) || "error".equals(qName)) {
            testCase.setFailureDetail(currentElement.toString()).setFailureErrorLine(parseErrorLine(currentElement, testCase.getFullClassName()));
        } else if ("time".equals(qName)) {
            try {
                defaultSuite.setTimeElapsed(numberFormat.parse(currentElement.toString()).floatValue());
            } catch (ParseException e) {
                throw new SAXException(e.getMessage(), e);
            }
        }

        if (getLocalApp() instanceof ApplicationImpl) {
            return ((ApplicationImpl) getLocalApp()).launch(null, compID, initConfiguration, spdURI, implID, mode, monitor);
        } else if (getLocalApp() != null) {
            throw new IllegalStateException("Unknown Application type " + getLocalApp());
        } else {
            throw new IllegalStateException("Null Application type");
        }

        if (strokeObject != null) {
            g2.setStroke(strokeObject);
        }

        if (_source instanceof JsonParser) {
            return ((JsonParser) _source).getCurrentLocation();
        }

        if (notice instanceof InvitationNotice) {
            InvitationNotice invitationNotice = (InvitationNotice) notice;
            handleInvitationNotice(invitationNotice);
        } else if (notice instanceof WarningNotice) {
            WarningNotice eventNotice = (WarningNotice) notice;
            SwingUtilities.invokeLater(eventNotice.getPayload(getController()));
        } else if (notice instanceof RunnableNotice) {
            RunnableNotice eventNotice = (RunnableNotice) notice;
            SwingUtilities.invokeLater(eventNotice.getPayload(getController()));
        } else if (notice instanceof FolderAutoCreateNotice) {
            FolderAutoCreateNotice eventNotice = (FolderAutoCreateNotice) notice;
            handleFolderAutoCreateNotice(eventNotice);
        } else if (notice instanceof OutOfMemoryNotice) {
            OutOfMemoryNotice eventNotice = (OutOfMemoryNotice) notice;
            handleOutOfMemoryNotice(eventNotice);
        } else {
            logWarning("Don't know what to do with notice: " + notice.getClass().getName() + " : " + notice.toString());
        }

        if (hasActivePersistenceContext() || getAbstractSession().hasTablePerTenantDescriptors()) {
            return (AbstractSession) getActiveSession();
        } else {
            return getAbstractSession();
        }

        if (event.getEventType() == AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED || event.getEventType() == AccessibilityEvent.TYPE_VIEW_FOCUSED) {
            super.onInitializeAccessibilityEvent(event);
        }

        if (myHistory.size() > 15) {
            myHistory.remove(0);
        }

        if (student != null && student.getPerson() != null && ActiveStudentOverride.isOverrideAvailablefor(student.getPerson())) {
            return true;
        }

        if (resourceName.startsWith("._")) {
            OSX_DOUBLE_DATA.put(resourceUri, null);
            return;
        }

        if (taskPropertiesController != null) taskPropertiesController.emailNotificationAddNew();

        if (update instanceof UpdateMessage) {
            UpdateMessage message = (UpdateMessage) update;
            typingProcessor.onMessage(message.getPeer(), message.getSenderUid());
        }

        if (Boolean.TRUE.equals(getConfig().isLipSyncEnabled())) {
            logger.info("Lip-sync enabled in " + getRoomName());
            jingle = new LipSyncHack(this, jingle);
        }

        if (!scrapers.isEmpty()) {
            tableScraper.getSelectionModel().setSelectionInterval(selectedIndex, selectedIndex);
        }

        if (clazz.getName().startsWith("java.")) {
            return false;
        }

        if (stripMillis(expected).equals(stripMillis(actual))) {
            return;
        }

        if (mImageUploadDoneAction == null) {
            saveAutomatically();
        } else {
            saveToMemory();
        }

        if (url == null || url.startsWith("name://")) {
            registry.put("/" + tmpPath, wsdlResource);
        } else {
            registry.importResource(tmpPath, url, wsdlResource);
        }

        if (!MiscUtil.unorderedCollectionEquals(value, other.value)) return false;

        if ((leiturista.getId() == null || leiturista.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leiturista.getFuncionario() == null || leiturista.getFuncionario().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leiturista.getEmpresa() == null || leiturista.getEmpresa().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leiturista.getCodigoDDD() == null || leiturista.getCodigoDDD().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leiturista.getNumeroFone() == null || leiturista.getNumeroFone().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leiturista.getNumeroImei() == null || leiturista.getNumeroImei().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (myException != null) {
            if (ApplicationManager.getApplication().isUnitTestMode()) {
                throw new RuntimeException(myException);
            }
            VcsBalloonProblemNotifier.showOverChangesView(myProject, myException.getMessage(), MessageType.ERROR);
        }

        if (token.endsWith("\\")) {
            preservedTokens.add("\\");
            css = css.replace(placeholder, "___YUICSSMIN_PRESERVED_TOKEN_" + (preservedTokens.size() - 1) + "___");
            i = i + 1;
            preservedTokens.add("");
            css = css.replace("___YUICSSMIN_PRESERVE_CANDIDATE_COMMENT_" + i + "___", "___YUICSSMIN_PRESERVED_TOKEN_" + (preservedTokens.size() - 1) + "___");
            continue;
        }

        if (replay) {
            endOfStream = true;
        }

        if ("POST".equals(req.getMethod())) {
            if (methodParam != null) {
                String qs = req.getQueryString();
                if (qs != null && qs.contains("_method=")) {
                    final NutMap map = Mvcs.toParamMap(new StringReader(qs), inputEnc == null ? Charset.defaultCharset().name() : inputEnc);
                    request = new HttpServletRequestWrapper(req) {
                        public String getMethod() {
                            return map.getString(methodParam);
                        }
                    };
                }
            } else if (allowHTTPMethodOverride && req.getHeader("X-HTTP-Method-Override") != null) {
                request = new HttpServletRequestWrapper(req) {
                    public String getMethod() {
                        return req.getHeader("X-HTTP-Method-Override");
                    }
                };
            }
            String contentType = req.getContentType();
            if (contentType != null) {
                if (uc != null && contentType.contains("multipart/form-data")) {
                    request = handleUpload(req);
                }
            }
        }

        if (raster.getRasterSize().equals(mask.getRasterSize())) {
            Layer layer = MaskLayerType.createLayer(raster, mask);
            maskCollectionLayer.getChildren().add(layer);
        }

        if (Float.compare(w, (int) w) == 0) {
            getCOSObject().setInt("W", (int) w);
        } else {
            getCOSObject().setFloat("W", w);
        }

        if (objAttributes != null) {
            int currentRowBase = 0;
            for (int graphObject = 0; graphObject < graphObjects.length; graphObject++) {
                int maxRowsUsedThisObject = 1;
                String canonicalName = objAttributes.getCanonicalName(graphObjects[graphObject]);
                String commonName = objAttributes.getStringValue("commonName", canonicalName);
                if (commonName == null || commonName.length() == 0) commonName = canonicalName;
                data[currentRowBase][0] = commonName;
                for (int i = 1; i < columnNames.length; i++) {
                    if (columnNames[i].equals("canonicalName")) data[currentRowBase][i] = canonicalName;
                    else {
                        Object[] attributeValuesThisObject = objAttributes.getArrayValues(columnNames[i], canonicalName);
                        int attributeCount = attributeValuesThisObject.length;
                        for (int a = 0; a < attributeCount; a++)
                            if (attributeValuesThisObject[a] != null) {
                                data[currentRowBase + a][i] = attributeValuesThisObject[a];
                            }
                        if (attributeCount > maxRowsUsedThisObject) maxRowsUsedThisObject = attributeCount;
                    }
                }
                currentRowBase += maxRowsUsedThisObject;
            }
        }

        if (!m.isBridge() && !m.getName().startsWith("$jacoco")) {
            methodList.add(new JavaReflectionMethod(this, m));
        }

        if (dtd != null && dtd.isNullable()) {
            return true;
        }

        if (toadlets.isEnabled()) {
            toadlets.finishStart();
            toadlets.createFproxy();
            toadlets.removeStartupToadlet();
        }

        if (pasteAction != null && pasteAction.getStructuredSelection() != null) {
            pasteAction.selectionChanged(pasteAction.getStructuredSelection());
        }

        if (string.contains(".")) {
            return Math.round(Float.parseFloat(string) * 1000);
        } else {
            return Long.parseLong(string);
        }

        if (value != null && value.getClass().getName().endsWith("ConsString")) value = "" + value;

        if (datos != null) {
            Method metodo = null;
            String nomSetMetodo = "get".concat(campoId.substring(0, 1).toUpperCase()).concat(campoId.substring(1));
            methods = clase.getDeclaredMethods();
            for (Method met : methods) {
                if (met.getName().equals(nomSetMetodo)) {
                    metodo = met;
                    break;
                }
            }
            for (Object obj : datos) {
                getIdName(clase);
                map.put(metodo.invoke(obj).toString(), obj);
            }
        }

        if (this.indirectTrust == null) this.indirectTrust = new IndirectTrust();

        if (x % 16 == 0 && z % 16 == 0) swampTree.generate(worldIn, x / 16, z / 16, chunkPrimerIn);

        if (path.equals("/")) {
            for (Iterator<DocumentImpl> it = handle.iterator(broker); it.hasNext(); ) {
                DocumentImpl dimpl = it.next();
                if (dimpl instanceof BinaryDocument) {
                    handle.removeBinaryResource(tx.tx, broker, dimpl);
                } else {
                    handle.removeXMLResource(tx.tx, broker, dimpl.getFileURI());
                }
            }
        }

        if (wAttributeValue != null) {
            String xValue = this.wAttributeValue.getValue(pContext);
            String xMethodName = this.wAttributeName.getValue(pContext);
            xMethodName = "set" + xMethodName.substring(0, 1).toUpperCase() + xMethodName.substring(1, xMethodName.length());
            Method xM = pParent.getClass().getMethod(xMethodName, new Class[]{String.class});
            xM.invoke(pParent, new Object[]{xValue});
        }

        if (WebPopup.this.isShowing() && !focused && !isChildFocused() && closeOnFocusLoss) {
            hidePopup();
        }

        if (mapScheme.getSizePalette() < numberOfLayers) {
            mapScheme.setSizePalette(numberOfLayers);
        }

        if (heightUnit.equals(GEOPOTENTIAL_UNIT)) {
            float[] newHeights = GeopotentialAltitude.toAltitude(heights, GeopotentialAltitude.getGeopotentialUnit(CommonUnit.meter), Gravity.newReal(), new float[heights.length], CommonUnit.meter, true);
            heights = newHeights;
        }

        if (importStatement.isForeignFileImport()) return null;

        if (((IGraphicalEditPart) getHost().getParent()).getFigure() instanceof Connection) {
            centerMain = new Rectangle(refPoint.x, refPoint.y, 0, 0);
            getHostFigure().translateToAbsolute(centerMain);
            p.translateToRelative(centerMain);
        } else {
            centerMain = ((IGraphicalEditPart) getHost().getParent()).getFigure().getBounds().getCopy();
            centerMain.translate(centerMain.width / 2, centerMain.height / 2);
            getHostFigure().translateToAbsolute(centerMain);
            p.translateToRelative(centerMain);
        }

        if (labelIndex >= 0 && (labelIndex == 0 || labelIndexTo == totalSize - 1)) {
            int inputFrom;
            int inputTo;
            if (labelIndex < 0) {
                inputFrom = 0;
                inputTo = totalSize - 1;
            } else if (labelIndex == 0) {
                inputFrom = labelIndexTo + 1;
                inputTo = totalSize - 1;
            } else {
                inputFrom = 0;
                inputTo = labelIndex - 1;
            }
            builder.addInput(READER_KEY, inputFrom, inputTo);
            underlyingIsDisjoint = false;
        } else if (labelIndex >= 0) {
            int firstFrom = 0;
            int firstTo = labelIndex - 1;
            int secondFrom = labelIndexTo + 1;
            int secondTo = totalSize - 1;
            builder.addInput(READER_KEY, firstFrom, firstTo);
            builder.addInput(READER_KEY, secondFrom, secondTo);
            underlyingIsDisjoint = true;
        } else {
            builder.addInput(READER_KEY);
            underlyingIsDisjoint = false;
        }

        if ((gerenciaRegional.getId() == null || gerenciaRegional.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (gerenciaRegional.getNome() == null || gerenciaRegional.getNome().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (gerenciaRegional.getNomeAbreviado() == null || gerenciaRegional.getNomeAbreviado().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (gerenciaRegional.getFone() == null || gerenciaRegional.getFone().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (constants.length > pos) {
            value = constants[pos];
        }

        if (last != null && !this.configuration.indentContent && last.type == Node.TEXT_NODE && content.tag != null && TidyUtils.toBoolean(content.tag.model & Dict.CM_BLOCK)) {
            flushLine(fout, indent);
            flushLine(fout, indent);
        }

        if (ignoredMethods.size() == 1) {
            notifier.fireTestIgnored(getDescription());
            return;
        }

        if (e.getMessage() != null && (e.getMessage().contains("could not perform sequential read of results (forward)") || e.getMessage().contains("could not doAfterTransactionCompletion sequential read of results (forward)"))) {
            log.debug("assuming empty ResultSet", e);
            close();
            return false;
        } else {
            throw e;
        }

        if (parameters.getNetworkContent() == null) {
            throw new ProcessRollbackException(this, String.format("Rollback of remove failed. No content to re-put. Parameters: '%s'.", parameters.toString()));
        }

        if (null == sParser) {
            synchronized (ViewTypeParser.class) {
                if (null == sParser) {
                    initializeAttributeSet(parent);
                }
            }
        }

        if (!cluster) {
            if (brokerType.equals(ActiveJmsResourceAdapter.LOCAL) || brokerType.equals(ActiveJmsResourceAdapter.EMBEDDED) || brokerType.equals(ActiveJmsResourceAdapter.DIRECT)) {
                for (Iterator iter = mergedProps.iterator(); iter.hasNext(); ) {
                    ConnectorConfigProperty element = (ConnectorConfigProperty) iter.next();
                    if (element.getName().equals(ActiveJmsResourceAdapter.CONNECTION_URL)) {
                        iter.remove();
                    }
                }
            }
        }

        if (delta <= 0 || data.lastNoDamageTicks <= player.getMaximumNoDamageTicks() / 2 || dTick > data.lastNoDamageTicks || damage > BridgeHealth.getLastDamage(player) || damage == 0.0) {
            legit = set = true;
        }

        if (dtd != null && dtd.isNullable()) {
            String errorState = (getLanguageConnectionContext().getDataDictionary().checkVersion(DataDictionary.DD_VERSION_DERBY_10_4, null)) ? SQLState.LANG_ADD_PRIMARY_KEY_ON_NULL_COLS : SQLState.LANG_DB2_ADD_UNIQUE_OR_PRIMARY_KEY_ON_NULL_COLS;
            throw StandardException.newException(errorState, rc.getName());
        }

        if (dataset.getName().equals("") || !dataset.hasAccess()) {
            logger.debug("nameDatasetTree(): naming dataset ({})...", dataset.getUrlPath());
            DatasetNamer dsN = null;
            for (int i = 0; i < this.datasetNamerList.size(); i++) {
                dsN = (DatasetNamer) this.datasetNamerList.get(i);
                if (dsN.nameDataset(dataset)) {
                    logger.debug("nameDatasetTree(): ... used namer ({})", dsN.getName());
                    break;
                }
            }
        }

        if (GROUP_CHECKER instanceof ScheduledThreadPoolExecutor) {
            ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) GROUP_CHECKER;
            executor.setKeepAliveTime(CHECK_DELAY * 2L, TimeUnit.MILLISECONDS);
            executor.allowCoreThreadTimeOut(true);
        }

        if (selectedIndex < 0) {
            selectedIndex = 0;
        }

        if (c1.getItemCount() > 1) {
            int right = c1.getSelectionIndex();
            int wrong = (right == 0) ? 1 : 0;
            setProjectType(wrong);
            setProjectType(right);
        }

        if (!player.world.isRemote && hitDamage == 0 && TeamsManager.getInstance().currentRound != null)
            TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP) player, damagesource);

        if (getDialog() != null && (getParentFragment() != null || getRetainInstance())) {
            getDialog().setDismissMessage(null);
        }

        if (session.isPerunAdmin()) {
            JsonUtils.addTableManagedButton(groups, table, moveButton);
            moveButton.setEnabled(false);
        }

        if (getToolTipText() != null || this instanceof javax.swing.table.JTableHeader) {
            ToolTipManager.sharedInstance().unregisterComponent(JComponent.this);
        }

        if (System.getProperty("javax.net.ssl.keyStore") == null) {
            _logger.log(Level.WARNING, noKeyStores);
            return null;
        }

        if (!notDas(whichTarget)) {
            fail(Strings.get("list.instances.serverTarget"));
            return false;
        }

        if (origHandler != null && origHandler.handleEvent(event)) {
            return true;
        }

        if (this.rows.isEmpty()) {
            ArrayList newRow = new ArrayList();
            for (int column = 0; column < numberOfColumns; column++) {
                if (columnTypes[column] != Types.NULL) {
                    newRow.add(new Integer(0));
                }
            }
            this.rows.add(newRow);
        }

        if (!children.getCast().isValid() && !bindingWasForceRevalidated) {
            children.getCast().forceRevalidate();
            bindingWasForceRevalidated = true;
        }

        if (TWO_PHASE_ANIMATION && firstStart) {
            final int halfWidth = (finalWidth + mOriginalWidth) / 2;
            final int halfHeight = (finalHeight + mOriginalHeight) / 2;
            if (DEBUG_STATE) Slog.v(TAG, "Initializing start and finish animations");
            mStartEnterAnimation.initialize(finalWidth, finalHeight, halfWidth, halfHeight);
            mStartExitAnimation.initialize(halfWidth, halfHeight, mOriginalWidth, mOriginalHeight);
            mFinishEnterAnimation.initialize(finalWidth, finalHeight, halfWidth, halfHeight);
            mFinishExitAnimation.initialize(halfWidth, halfHeight, mOriginalWidth, mOriginalHeight);
            if (USE_CUSTOM_BLACK_FRAME) {
                mStartFrameAnimation.initialize(finalWidth, finalHeight, mOriginalWidth, mOriginalHeight);
                mFinishFrameAnimation.initialize(finalWidth, finalHeight, mOriginalWidth, mOriginalHeight);
            }
        }

        if (s.toLowerCase().startsWith("0xp")) {
            return Float.parseFloat("0x0p" + s.substring(3));
        }

        if ((clienteTipo.getId() == null || clienteTipo.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (clienteTipo.getDescricao() == null || clienteTipo.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (clienteTipo.getEsferaPoder() == null || clienteTipo.getEsferaPoder().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (clienteTipo.getIndicadorPessoaFisicaJuridica() == null || clienteTipo.getIndicadorPessoaFisicaJuridica().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (product.isMultiSize()) {
            try {
                final GeoCoding sceneGeoCoding = product.getSceneGeoCoding();
                if (sceneGeoCoding != null) {
                    final MathTransform imageToMapTransform = sceneGeoCoding.getImageToMapTransform();
                    if (imageToMapTransform instanceof AffineTransform) {
                        final MathTransform modelToImage = imageToMapTransform.inverse();
                        final DirectPosition2D pos = new DirectPosition2D(sceneX, sceneY);
                        final DirectPosition position = modelToImage.transform(pos, pos);
                        levelZeroSceneX = floor(position.getCoordinate()[0]);
                        levelZeroSceneY = floor(position.getCoordinate()[1]);
                    } else {
                        levelZeroSceneX = floor(sceneX);
                        levelZeroSceneY = floor(sceneY);
                    }
                }
            } catch (TransformException e) {
                levelZeroSceneX = levelZeroRasterX;
                levelZeroSceneY = levelZeroRasterY;
            }
        }

        if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")))) {
            throw new IllegalArgumentException();
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.WINDOWS)) {
            super.setBackground(text.getBackground());
        }

        if (!(tokenEnd < bufferEnd && buffer.charAt(tokenEnd) == '=')) {
            yybegin(YYINITIAL);
        }

        if (workload == null) {
            this.applyParameterMappings(ProjectType.TPCC);
            File workload_file = this.getWorkloadFile(ProjectType.TPCC);
            workload = new Workload(catalog);
            ProcedureNameFilter filter = new ProcedureNameFilter(false);
            filter.attach(new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT));
            ((Workload) workload).load(workload_file, catalog_db, filter);
        }

        if (getFP().lessThanOrEqual(getSP())) {
            return false;
        }

        if (updProp.getValue() != null && (updProp.getValue().equals("true") || updProp.getValue().equals("false"))) {
            incomingProp = (incomingProp == null || !incomingProp.equals("on")) ? "false" : "true";
        }

        if (!Options.v().j2me()) {
            CLONEABLE = typeNode(RefType.v("java.lang.Cloneable"));
            SERIALIZABLE = typeNode(RefType.v("java.io.Serializable"));
        } else {
            CLONEABLE = null;
            SERIALIZABLE = null;
        }

        if (!FMLClientHandler.instance().hasOptifine() && ForgeModContainer.forgeLightPipelineEnabled) {
            ModelLoaderRegistry.registerLoader(UVLModelLoader.INSTANCE);
        }

        if (idCodigo19 != null && !idCodigo19.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo19, informarNaoEntregaDocumentosActionForm.getQtTentativas19(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento19(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (servletContext != null && StringUtils.contains(servletContext.getServerInfo(), "WebLogic")) {
            LOG.info("WebLogic server detected. Enabling Struts parameter access work-around.");
            paramsWorkaroundEnabled = true;
        } else {
            paramsWorkaroundEnabled = "true".equals(container.getInstance(String.class, StrutsConstants.STRUTS_DISPATCHER_PARAMETERSWORKAROUND));
        }

        if (LOG.isEnabledFor(Level.ERROR)) {
            LOG.error("Cannot create runtime / sandbox module", e);
        }

        if (codigoBarraLeituraOtica != null && !codigoBarraLeituraOtica.equalsIgnoreCase("")) {
            codigoBarraDigitadoCampo1 = codigoBarraLeituraOtica.substring(0, 11);
            codigoBarraDigitadoCampo2 = codigoBarraLeituraOtica.substring(11, 22);
            codigoBarraDigitadoCampo3 = codigoBarraLeituraOtica.substring(22, 33);
            codigoBarraDigitadoCampo4 = codigoBarraLeituraOtica.substring(33, 44);
        } else {
            codigoBarraDigitadoCampo1 = pagamentoActionForm.getCodigoBarraDigitadoCampo1();
            codigoBarraDigitadoDigitoVerificadorCampo1 = pagamentoActionForm.getCodigoBarraDigitadoDigitoVerificadorCampo1();
            codigoBarraDigitadoCampo2 = pagamentoActionForm.getCodigoBarraDigitadoCampo2();
            codigoBarraDigitadoDigitoVerificadorCampo2 = pagamentoActionForm.getCodigoBarraDigitadoDigitoVerificadorCampo2();
            codigoBarraDigitadoCampo3 = pagamentoActionForm.getCodigoBarraDigitadoCampo3();
            codigoBarraDigitadoDigitoVerificadorCampo3 = pagamentoActionForm.getCodigoBarraDigitadoDigitoVerificadorCampo3();
            codigoBarraDigitadoCampo4 = pagamentoActionForm.getCodigoBarraDigitadoCampo4();
            codigoBarraDigitadoDigitoVerificadorCampo4 = pagamentoActionForm.getCodigoBarraDigitadoDigitoVerificadorCampo4();
        }

        if (tree.isBifurcationDoublyLinked(tree.getRoot())) throw new RuntimeException("invalid slide");

        if (colecaoLogradouroCep != null && !colecaoLogradouroCep.isEmpty()) {
            retorno = (LogradouroCep) Util.retonarObjetoDeColecao(colecaoLogradouroCep);
        }

        if (isLocation(formClass, field.getModel())) {
            bindings.add(locationNameField());
            bindings.add(gpsField());
        } else if (!dateFields.contains(field.getModel().getId())) {
            Bind bind = new Bind();
            bind.setNodeSet(field.getAbsoluteFieldName());
            bind.setType(field.getBuilder().getModelBindType());
            bind.setConstraint(field.getBuilder().getConstraint().orNull());
            bind.setRelevant(xPathBuilder.build(field.getModel().getRelevanceConditionExpression()));
            if (field.getModel().isRequired()) {
                bind.setRequired(XPathBuilder.TRUE);
            }
            bindings.add(bind);
        }

        if (url.contains("mysql") && !url.contains("InnoDB")) {
            url = url + "&sessionVariables=default_storage_engine=InnoDB";
        }

        if (name.toLowerCase().endsWith(".xml")) {
            idx = name.substring(0, idx).lastIndexOf('.');
            if (idx == -1) {
                idx = name.lastIndexOf('.');
            }
        }

        if (e.getOppositeComponent() instanceof JTextField) {
            String dataAtend = ((JTextField) e.getComponent()).getText();
            if (!dataAtend.isEmpty()) {
                dataAtend = DateUtil.parseToYearMonthDay(dataAtend);
                if (!dataAtend.equals(CadastroIndividualizado.this.procedimentoRealizado.getDataAtendimento())) {
                    CadastroIndividualizado.this.procedimentoRealizado.setDataAtendimento(dataAtend);
                }
            }
        }

        if (getActivity() instanceof SearchActivity) {
            SearchActivity activity = (SearchActivity) getActivity();
            setShownHeader(activity.ShowAccountHeaders);
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            for (BlockSnapshot blockSnapshot : groupSnapshots) {
                blockSnapshot.setInactive(true);
            }
            dbClient.updateObject(groupSnapshots);
            String msg = String.format("deleteGroupSnapshots -- Deleted group snapshot: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            String errorMsg = String.format("doDeleteSnapshot -- Failed to delete group snapshot: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.deleteGroupSnapshotFailed("doDeleteSnapshot", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if ((state.getRobot() + state.getFirmwareName()).equals(robot)) {
            LOG.warn("checking robot+firmware");
            return true;
        }

        if (httpRequest.getParameter(FORM_SUBMITTED_MARKER) != null && (userName == null || userName.length() == 0)) {
            httpRequest.setAttribute(LOGIN_ERROR, ERROR_USERNAME_MISSING);
        }

        if (connector.resourceAdapter != null) {
            createResource(null, connector.resourceAdapter);
        }

        if (filePath.isEmpty()) {
            setFilePath(new Path());
            return;
        }

        if (context.getIndexer().isIndexed()) {
            context.getNode().refreshObject(this);
        }

        if (PuSize == 0) {
            if (QiSize == 0) {
                return new DoubleWritable(muValue);
            } else {
                double ret = muValue + BiValue;
                return new DoubleWritable(ret);
            }
        } else if (QiSize == 0) {
            double ret = muValue + BuValue;
            return new DoubleWritable(ret);
        }

        if (o instanceof Asteroid) {
            Asteroid<?> a = ((Asteroid) o);
            if (dist / 220 < a.size) {
                a.onHit(this);
            }
        }

        if (e.getMessage().contains("is already defined for entity")) {
            throw new ResourceAlreadyExistsException(String.format("Tag '%s' already associated with the entity", typeName));
        } else {
            throw e;
        }

        if (value instanceof Integer) {
            intent.putExtra(key, (Integer) value);
        } else if (value instanceof Long) {
            intent.putExtra(key, (Long) value);
        } else if (value instanceof Boolean) {
            intent.putExtra(key, (Boolean) value);
        } else if (value instanceof Double) {
            intent.putExtra(key, (Double) value);
        } else if (value instanceof Float) {
            intent.putExtra(key, (Float) value);
        } else if (value instanceof Bundle) {
            intent.putExtra(key, (Bundle) value);
        } else {
            intent.putExtra(key, value.toString());
        }

        if (connectionsLeft == 0) {
            ((ClientImpl) client).resetInstanceId();
        }

        if (type.equals("textMessageEvent")) {
            messages.add(new YouTubeMessage(authorDetails.get("displayName").asText(), snippet.get("textMessageDetails").get("messageText").asText(), Instant.parse(snippet.get("publishedAt").asText()).toEpochMilli()));
        }

        if (System.getProperty("os.name").startsWith("Windows")) update(true, true);

        if (idCodigo17 != null && !idCodigo17.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo17, informarNaoEntregaDocumentosActionForm.getQtTentativas17(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento17(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (widget instanceof RemotableQuickFinder) {
            field.setQuickFinderClassNameImpl(((RemotableQuickFinder) widget).getDataObjectClass());
            field.setBaseLookupUrl(((RemotableQuickFinder) widget).getBaseLookupUrl());
            field.setLookupParameters(((RemotableQuickFinder) widget).getLookupParameters());
            field.setFieldConversions(((RemotableQuickFinder) widget).getFieldConversions());
        } else if (widget instanceof RemotableTextExpand) {
            field.setExpandedTextArea(true);
        }

        if (info != null) {
            sb.append(' ').append(info.shortId);
        }

        if (note != null && note.length() > ARCHIVE_NOTE_MAX_LENGTH) {
            throw new IllegalArgumentException("Error setting archiveNote: String length is greater than maximum (" + ARCHIVE_NOTE_MAX_LENGTH + ")." + "  StudyVersion id=" + id + ", archiveNote=" + note);
        }

        if (dataKind.isString()) builderStrategy.wEntity(entityDesc, value);
        else {
            IDataTypeParser dataTypeParser = DataTypeUtils.getDataTypeParser(entityDesc, DataTypeParsers.PERSISTENCE);
            switch (dataKind) {
                case DATE:
                    builderStrategy.wEntity(entityDesc, dataTypeParser.parseDate(entityDesc, value));
                    break;
                case ENUM_VALUE:
                    builderStrategy.wEntity(entityDesc, dataTypeParser.parseEnumValue(entityDesc, value));
                    break;
                case OBJECT:
                    builderStrategy.wEntity(entityDesc, dataTypeParser.parseObject(entityDesc, value));
                    break;
            }
        }

        if (SWT.getPlatform().equals("carbon")) {
            getDisplay().readAndDispatch();
        }

        if (cyAttributes != null) {
            int currentRowBase = 0;
            for (int graphObject = 0; graphObject < graphObjects.length; graphObject++) {
                int maxRowsUsedThisObject = 1;
                String canonicalName = ((giny.model.GraphObject) graphObjects[graphObject]).getIdentifier();
                String commonName = cyAttributes.getStringAttribute(canonicalName, "commonName");
                if (commonName == null || commonName.length() == 0) commonName = canonicalName;
                data[currentRowBase][0] = commonName;
                for (int i = 1; i < columnNames.length; i++) {
                    if (columnNames[i].equals("canonicalName")) data[currentRowBase][i] = canonicalName;
                    else {
                        List l = cyAttributes.getAttributeList(canonicalName, columnNames[i]);
                        Object[] attributeValuesThisObject = l.toArray();
                        int attributeCount = attributeValuesThisObject.length;
                        for (int a = 0; a < attributeCount; a++)
                            if (attributeValuesThisObject[a] != null) {
                                data[currentRowBase + a][i] = attributeValuesThisObject[a];
                            }
                        if (attributeCount > maxRowsUsedThisObject) maxRowsUsedThisObject = attributeCount;
                    }
                }
                currentRowBase += maxRowsUsedThisObject;
            }
        }

        if (property.getName().matches("guarantee\\[.*?\\]")) {
            return renameKind2Prop(property);
        }

        if (version.equals("4.2.0.JON.3.0.1.GA")) {
            version = "4.2.0.JON301GA";
        }

        if (currStatus == OP_UNTESTED) {
            getStatus();
        }

        if (tableHasBooleanSelected) {
            boolean foundANonSelectedColumnName = false;
            for (final RowSet rowSet : rowSets) {
                if (!rowSet.getColumn().equals(CyNetwork.SELECTED)) {
                    foundANonSelectedColumnName = true;
                    break;
                }
            }
            if (!foundANonSelectedColumnName) {
                fireTableDataChanged();
                return;
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            try {
                mKeyStore = KeyStore.getInstance("AndroidKeyStore");
                mKeyStore.load(null);
                if (!mKeyStore.containsAlias(KEY_ALIAS)) {
                    generateKeyPair();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (word != null && !word.equals(originalWord) && containsKey(CoreAnnotations.LemmaAnnotation.class)) {
            remove(CoreAnnotations.LemmaAnnotation.class);
        }

        if (!variants[i].getVariantContext().isVariant())
            throw new UserException.BadInput("The clustered SNPs filter does not work in the presence of non-variant records; see the documentation for more details");

        if (tb.getPendingTableCharacters().size() > 0) {
            for (String character : tb.getPendingTableCharacters()) {
                if (!isWhitespace(character)) {
                    tb.error(this);
                    if (StringUtil.in(tb.currentElement().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
                        tb.setFosterInserts(true);
                        tb.process(new Token.Character().data(character), InBody);
                        tb.setFosterInserts(false);
                    } else {
                        tb.process(new Token.Character().data(character), InBody);
                    }
                } else tb.insert(new Token.Character().data(character));
            }
            tb.newPendingTableCharacters();
        }

        if (size == -1) {
            return -1;
        } else if (size < -1) {
            int fixedSize = size & 0x3FFF;
            fixedSize <<= 16;
            fixedSize += stream.readShort() & 0xFFFF;
            return fixedSize;
        } else {
            return size;
        }

        if (instertCompletion && toggleEating) {
            setReplacementLength(getReplacementLength() + 1);
        }

        if (folder.getType() == FolderType.PRIVATE) {
            folder.setType(FolderType.SHARED);
            folder.setModificationTime(new Date());
            dao.update(folder);
        }

        if (event instanceof FocusEvent) {
            Component opposite = ((FocusEvent) event).getOppositeComponent();
            if ((opposite != null) && (getComponentWindow(opposite) instanceof InputMethodWindow) && (opposite.getInputContext() == this)) {
                return;
            }
        }

        if (attribute.equals("BIOPAX_NODE_TYPE")) {
            net.setNodeAttributeValue(cn, "BIOPAX_NAME", nodeName);
        }

        if (i >= maxCount || !e.getMessage().contains("The requested operation cannot be performed on a file with a user-mapped section open")) {
            throw e;
        }

        if (mb != null) {
            mb.setOverrideVisibleItems(true);
        }

        if (event.getFile() instanceof StylesheetFile) {
            return true;
        }

        if (((OpResult.ErrorResult) e.getResults().get(0)).getErr() == KeeperException.Code.NONODE.intValue()) {
            throw new DeploymentGroupDoesNotExistException(deploymentGroupName);
        } else {
            throw new HeliosRuntimeException("stop deployment-group " + deploymentGroupName + " failed due to a race condition, please retry", e);
        }

        if (fileURIString.contains("%25")) {
            fileURIString = fileURIString.replaceAll("%25", "%");
        }

        if (no(c.getOperator())) {
            String[] a = cell.split("\\s");
            if (a.length > 1) {
                StringBuilder operator = new StringBuilder(a[0]);
                for (int i = 1; i < a.length - 1; i++) {
                    operator.append(a[i]);
                }
                sfc.setOperator(operator.toString());
                sfc.setValue(a[a.length - 1]);
            } else {
                sfc.setValue(cell);
            }
        } else {
            sfc.setOperator(c.getOperator());
            if (OperatorsOracle.operatorRequiresList(c.getOperator())) {
                sfc.setValue(makeInList(cell));
            } else {
                if (!c.getOperator().equals("== null") && !c.getOperator().equals("!= null")) {
                    sfc.setValue(cell);
                }
            }
        }

        if (!hasNotNullableColumns) {
            Arrays.fill(elementColumnIsInPrimaryKey, true);
        }

        if (globalOnly) {
            facesMessages = context.getMessages(null);
        } else {
            facesMessages = context.getMessages();
        }

        if (uri.getScheme().equals("https")) {
            final SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build(), new NoopHostnameVerifier());
            clientBuilder.setSSLSocketFactory(sslsf);
        } else {
        }

        if (frame == 20) {
            if (this.parent.frame.isAlwaysOnTopSupported()) {
                this.parent.frame.setAlwaysOnTop(false);
            }
        }

        if (south == 0) {
            piece = 4;
        } else if (south == 1) {
            piece = 8;
        } else {
            continue;
        }

        if (results.size() > 0) {
            modifySource(results.get(0).getSource());
        }

        if (winnerIndex == -1) return null;

        if (cookies.indexOf(cookie) == 0 && cookie.getVersion() > 0) {
            cookieHeader.add("$Version=\"1\"");
        }

        if (readLoc.getStop() == 0)
            readLoc = getToolkit().getGenomeLocParser().createGenomeLoc(readLoc.getContig(), readLoc.getStart(), readLoc.getStart());

        if (obj == null) {
            field.put("flashorvalue", value);
            body.setProperty("field", field);
            body.call();
            return;
        }

        if (listener.getClass().getName().startsWith(FXCanvas.class.getName() + "$")) {
            superKeyListener = listener;
        } else {
            super.addKeyListener(listener);
        }

        if (ns == XomwDefines.NS_MEDIA) {
        }

        if (row.getTable().getColumn(STRING_ATTR_NAME) != null) {
            final List<String> stringList = row.getList(STRING_ATTR_NAME, String.class);
            if (stringList != null) found = findHumanReadableName(row, stringList, ncbiPattern, true);
        }

        if (index % (beeLine.getOpts().getMaxHeight() - 1) == 0) {
            String ret = beeLine.getConsoleReader().readLine(beeLine.loc("enter-for-more"));
            if (ret != null && ret.startsWith("q")) {
                break;
            }
        }

        if (b != null && !(b.toString().contains(" ")) && (NullColumnValueGetter.isNullValue(b.toString()) || (b instanceof String && b.equals(NONE)) || (b instanceof Number && ((Number) b).equals(new Integer(0))))) {
            b = null;
        }

        if (grupo != null) {
            atualizarGrupoActionForm.set("descricao", grupo.getDescricao());
            atualizarGrupoActionForm.set("descricaoAbreviada", grupo.getDescricaoAbreviada());
            if (grupo.getIndicadorUso() != null) {
                atualizarGrupoActionForm.set("indicadorUso", grupo.getIndicadorUso().toString());
            } else {
                atualizarGrupoActionForm.set("indicadorUso", ConstantesSistema.SIM.toString());
            }
        }

        if (iToInsert.isInserted()) {
            continue;
        }

        if (!myAccumulatedFiles.isEmpty()) {
            showUpdateTree();
        }

        if (element instanceof ISourceModule || element instanceof IScriptFolder) {
            IResource resource;
            if (element instanceof ISourceModule) resource = ReorgUtils.getResource((ISourceModule) element);
            else resource = ((IScriptFolder) element).getResource();
            if (resource != null && resource.isLinked()) return createDeleteChange(resource);
        }

        if (StringUtils.containsIgnoreCase(ra.getDisplayInfo().getTitle(), query)) {
            returnList.add(ra);
        }

        if (name.startsWith(nonOverridableClass)) {
            return true;
        }

        if (brokerHomeDir == null) {
            String IMQ_INSTALL_SUBDIR = java.io.File.separator + ".." + java.io.File.separator + ".." + java.io.File.separator + "imq";
            brokerHomeDir = getServerEnvironment().getDomainRoot() + IMQ_INSTALL_SUBDIR;
        } else {
            brokerHomeDir = brokerHomeDir + java.io.File.separator + "..";
        }

        if (connectionStatus.getSeverity() < IStatus.ERROR) {
            OpenScrapbookEditorAction sbAction = new OpenScrapbookEditorAction();
            sbAction.run(profile, vdbName);
        } else {
            openError(getString("vdbConnectionError.title"), connectionStatus);
        }

        if (mer.getElementRef().size() != 3) continue loop1;

        if (!nameSpace[i].equals("type")) {
            fullName.append('.');
            fullName.append(nameSpace[i]);
        }

        if (edge instanceof AbstractSingleEdge) {
            return ((AbstractSingleEdge) edge).getReference();
        } else {
            return (GlobalId) getPropertyValue(property);
        }

        if (!ade.versionOnly) ade.de.getDiskId().setPendingAsync(false);

        if (mVideoSupportFragment != null && mVideoSupportFragment.getView() != null && mVideoSupportFragment.getView().hasFocus()) {
            if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE) {
                if (getVerticalGridView().getChildCount() > 0) {
                    getVerticalGridView().requestFocus();
                    return true;
                }
            }
        }

        if (currentState.documentEpoch == null) {
            currentState.documentEpoch = 0L;
        }

        if (nodes[ESCAPE] != null) {
            sb.append(' ').append(Tokens.T_ESCAPE).append(' ');
            sb.append(nodes[ESCAPE].getSQL());
            sb.append(' ');
        }

        if (taken <= 0) {
            prey.exitWorld();
            return false;
        }

        if (bean instanceof Collection) {
            Collection col = (Collection) bean;
            for (Object aCol : col) {
                serializeIt(aCol, "value", writer, stack);
            }
        } else if (bean instanceof Map) {
            Map<Object, Object> map = (Map) bean;
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                Object objValue = entry.getValue();
                serializeIt(objValue, entry.getKey().toString(), writer, stack);
            }
        } else if (bean.getClass().isArray()) {
            for (int i = 0; i < Array.getLength(bean); i++) {
                serializeIt(Array.get(bean, i), "arrayitem", writer, stack);
            }
        } else {
            if (clsName.startsWith("java.lang")) {
                writer.setValue(bean.toString());
            } else {
                try {
                    BeanInfo info = Introspector.getBeanInfo(bean.getClass());
                    PropertyDescriptor[] props = info.getPropertyDescriptors();
                    for (PropertyDescriptor prop : props) {
                        String n = prop.getName();
                        Method m = prop.getReadMethod();
                        if (m != null) {
                            serializeIt(m.invoke(bean), n, writer, stack);
                        }
                    }
                } catch (Exception e) {
                    LOG.error(e.toString(), e);
                }
            }
        }

        if (selRowInput != null && selRowInput.startsWith("@")) {
            try {
                String s = kernel.getGeoGebraCAS().evaluateRaw(selRowInput.substring(1));
                GeoText text = kernel.lookupLabel("casOutput") instanceof GeoText ? (GeoText) kernel.lookupLabel("casOutput") : new GeoText(kernel.getConstruction());
                if (!text.isLabelSet()) {
                    text.setLabel("casOutput");
                }
                text.setTextString(s);
                text.updateRepaint();
            } catch (Throwable e) {
                e.printStackTrace();
            }
            return;
        }

        if (ensureSameSize) {
            final GC tmpGC = new GC(device);
            final Font tmpFont = new Font(device, fontData);
            tmpGC.setFont(tmpFont);
            final JPanel DUMMY_PANEL = new JPanel();
            java.awt.Font tmpAwtFont = new java.awt.Font(fontData.getName(), style, height);
            if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                    height--;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), style, height);
                }
            } else if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                    height++;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), style, height);
                }
            }
            tmpFont.dispose();
            tmpGC.dispose();
        }

        if (pd.getName().equals("name") || pd.getName().equals("defaultMapArea")) {
            continue;
        }

        if ((range == 0) && autoDestroyInSameHex) {
            vDesc.addAll(destroyEntity(entity, "explosion proximity", false, false));
            vUnits.add(entity.getId());
            entity.getCrew().setDoomed(true);
            entitiesHit.add(entity);
            continue;
        }

        if (tibm instanceof FragmentTaskMessage && ((FragmentTaskMessage) tibm).isSysProcTask()) {
            if (!SysProcFragmentId.isDurableFragment(((FragmentTaskMessage) tibm).getPlanHash(0))) {
                return true;
            }
        } else if (tibm instanceof Iv2InitiateTaskMessage) {
            Iv2InitiateTaskMessage itm = (Iv2InitiateTaskMessage) tibm;
            final SystemProcedureCatalog.Config sysproc = SystemProcedureCatalog.listing.get(itm.getStoredProcedureName());
            return sysproc != null && !sysproc.isDurable();
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            String msg = String.format("Removed volumes from export: %s.", task.getMessage());
            log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            String errorMsg = String.format("Failed to remove volumes from export mask: %s .", task.getMessage());
            log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.deleteVolumesFromExportMaskFailed("removeVolumes", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (bmpSingleton == null) {
            throw new IllegalStateException("No " + BeanManagerProvider.class.getName() + " in place! " + "Please ensure that you configured the CDI implementation of your choice properly. " + "If your setup is correct, please clear all caches and compiled artifacts.");
        }

        if (!relinquishLoggingControl) {
            boolean reload = false;
            String loggingLevel = logging.getLevel();
            String loggingLocation = logging.getLocation();
            Boolean stdOutLogging = logging.isStdOutLogging();
            if (propertyNames.contains("level")) {
                loggingLevel = (String) newValues.get(propertyNames.indexOf("level"));
                reload = true;
            }
            if (propertyNames.contains("location")) {
                loggingLocation = (String) newValues.get(propertyNames.indexOf("location"));
                reload = true;
            }
            if (propertyNames.contains("stdOutLogging")) {
                stdOutLogging = (Boolean) newValues.get(propertyNames.indexOf("stdOutLogging"));
                reload = true;
            }
            loggingLocation = LoggingUtils.getLogFileLocation(loggingLocation);
            if (reload) {
                try {
                    LoggingUtils.initLogging(resourceLoader, loggingLevel, !stdOutLogging, loggingLocation);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if (dotIdea == null) return false;

        if (alreadyOnSvnCache.containsKey(resourceSet)) {
            return alreadyOnSvnCache.get(resourceSet);
        }

        if ("xsl:text".equalsIgnoreCase(element.element)) {
            return true;
        }

        if (this instanceof ActivatedManaAbilityImpl && !costs.pay(this, game, sourceId, controllerId, noMana, null)) {
            logger.debug("activate mana ability failed - non mana costs");
            return false;
        }

        if (isFF) {
            displayNameText = displayNameElem.getAttribute("innerHTML");
        }

        if (this.proxyContext.channelToken == this.receiverToken) {
            this.proxyContext.executeSequentialCoreTask(RX_FRAME_HANDLER_POOL.get().initialise(data, source, this));
        }

        if (caption2.indexOf("&nbsp") > -1) {
            caption2 = caption2.replaceAll("&nbsp;", Unicode.NBSP + "");
            caption2 = caption2.replaceAll("&nbsp", Unicode.NBSP + "");
        }

        if (causedByRDE) {
            return;
        }

        if (t < 0.0) {
            int year = EquivalentYear(YearFromTime(t));
            double day = MakeDay(year, MonthFromTime(t), DateFromTime(t));
            t = MakeDate(day, TimeWithinDay(t));
        }

        if (!pkg.equals("com.android.providers.downloads") || Log.isLoggable("DownloadManager", Log.VERBOSE)) {
            int enqueueStatus = EVENTLOG_ENQUEUE_STATUS_NEW;
            if (old != null) {
                enqueueStatus = EVENTLOG_ENQUEUE_STATUS_UPDATE;
            }
            EventLogTags.writeNotificationEnqueue(callingUid, callingPid, pkg, id, tag, userId, notification.toString(), enqueueStatus);
        }

        if ((controleLiberacaoPermissaoEspecial.getFuncionalidade() == null || controleLiberacaoPermissaoEspecial.getFuncionalidade().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (controleLiberacaoPermissaoEspecial.getPermissaoEspecial() == null || controleLiberacaoPermissaoEspecial.getPermissaoEspecial().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (userHandle.getIdentifier() == UserHandle.myUserId()) {
            startPreferencePanel(fragmentClass, args, titleRes, titleText, null, 0);
        } else {
            String title = null;
            if (titleRes < 0) {
                if (titleText != null) {
                    title = titleText.toString();
                } else {
                    title = "";
                }
            }
            Utils.startWithFragmentAsUser(this, fragmentClass, args, titleRes, title, mIsShortcut, userHandle);
        }

        if (((problem.getException() instanceof FileNotFoundException || problem.getException() instanceof NoSuchFileException) && e.getModelId() != null && !e.getModelId().equals(problem.getModelId()))) {
            LOGGER.warn("The artifact's parent POM file '{}' cannot be resolved. " + "Using defaults for project version metadata..", file);
            ProjectVersionMetadata metadata = new ProjectVersionMetadata();
            metadata.setId(readMetadataRequest.getProjectVersion());
            MavenProjectFacet facet = new MavenProjectFacet();
            facet.setGroupId(readMetadataRequest.getNamespace());
            facet.setArtifactId(readMetadataRequest.getProjectId());
            facet.setPackaging("jar");
            metadata.addFacet(facet);
            String errMsg = "Error in resolving artifact's parent POM file. " + (problem.getException() == null ? problem.getMessage() : problem.getException().getMessage());
            RepositoryProblemFacet repoProblemFacet = new RepositoryProblemFacet();
            repoProblemFacet.setRepositoryId(readMetadataRequest.getRepositoryId());
            repoProblemFacet.setId(readMetadataRequest.getRepositoryId());
            repoProblemFacet.setMessage(errMsg);
            repoProblemFacet.setProblem(errMsg);
            repoProblemFacet.setProject(readMetadataRequest.getProjectId());
            repoProblemFacet.setVersion(readMetadataRequest.getProjectVersion());
            repoProblemFacet.setNamespace(readMetadataRequest.getNamespace());
            metadata.addFacet(repoProblemFacet);
            return metadata;
        }

        if (a.matches("^Great Violin Concertos.*") || a.matches("^CBS Great Performances.*")) {
            score -= 50;
        }

        if (form.getTipoOrdem() != null) {
            if (form.getTipoOrdem().equalsIgnoreCase(ImovelEmissaoOrdensSeletivasActionForm.TIPO_ORDEM_INSTALACAO)) {
                form.limparCamposHidrometro();
            } else if (form.getTipoOrdem().equalsIgnoreCase(ImovelEmissaoOrdensSeletivasActionForm.TIPO_INSPECAO_ANORMALIDADE)) {
                if (form.getIdImovel() == null || form.getIdImovel().equals("")) {
                    String concluir = httpServletRequest.getParameter("concluir");
                    if (form.getAnormalidadeHidrometro() == null) {
                        if (concluir != null) {
                            throw new ActionServletException("atencao.campo.informado", null, "Anormalidade de Leitura");
                        } else if (sessao.getAttribute("collectionHidrometroAnormalidade") != null) {
                            throw new ActionServletException("atencao.campo.informado", null, "Anormalidade de Leitura");
                        }
                    } else if (form.getNumeroOcorrenciasConsecutivas() == null || form.getNumeroOcorrenciasConsecutivas().equals("")) {
                        throw new ActionServletException("atencao.campo.informado", null, "Num. Ocorr�ncias Consecutivas");
                    }
                }
            }
        }

        if (image != null) {
            NSImage current = imageView.image();
            if (current != null && current.id == image.handle.id) {
                imageView.setImage(null);
            }
        }

        if (type != null && !(type instanceof JdbcSqlType) && !(type instanceof Integer))
            throw new IllegalArgumentException();

        if (frag.stmtText == null) {
            frag.stmtText = stmtText;
        }

        if (RuntimeFlags.getTestMode().isInsideTestEnvironment()) {
            return;
        }

        if (args == null) {
            args = new ArrayList();
        }

        if (!cisMap.isEmpty()) {
            return;
        }

        if (!"en".equals(ibr.getCookie(Browser.getHost(page), "SLlng"))) {
            correctLanguageCookie(ibr, page);
        }

        if (StringUtils.hasLength(check.getFilterKeyword())) {
            githubPullRequests = githubPullRequests.stream().filter(githubPullRequest -> githubPullRequest.title.toLowerCase().contains(check.getFilterKeyword().toLowerCase())).collect(Collectors.toList());
        }

        if (Math.max(Math.abs(x), Math.abs(y)) > 0.1) {
            xy += x * y;
            xsquared += x * x;
            ysquared += y * y;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            list.setOnScrollListener(new ListView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(AbsListView absListView, int scrollState) {
                    switch (scrollState) {
                        case AbsListView.OnScrollListener.SCROLL_STATE_IDLE:
                            absListView.setFastScrollAlwaysVisible(false);
                            break;
                        case AbsListView.OnScrollListener.SCROLL_STATE_FLING:
                            absListView.setFastScrollAlwaysVisible(true);
                            break;
                        default:
                            break;
                    }
                }

                @Override
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }
            });
        }

        if (dataSource.getTimestamp() != -1) {
            rv.replace(new DefaultSModel(modelReference, header));
        }

        if (!isURLToExclusao(uri, httpRequest)) {
            HttpSession session = httpRequest.getSession();
            if (session.getAttribute("usuarioSessao") == null) {
                request.setAttribute("msgAviso", MensagemContantes.MSG_INF_DENY);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }

        if (idCodigo5 != null && !idCodigo5.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo5, informarNaoEntregaDocumentosActionForm.getQtTentativas5(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento5(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (method == null) {
            try {
                method = Evaluador.class.getDeclaredMethod("evalDefault", parent.getClass(), List.class, String.class);
            } catch (Exception e) {
            }
        }

        if (container instanceof RecentProjectsGroup) return false;

        if (Frame.getFrames().length == 0) {
            return;
        }

        if (Event.ONCLICK == DOM.eventGetType(event) && value && this != buttons.get(selectedValue)) {
            ValueChangeEvent.fire(this, value);
        }

        if (remoteControl.getIsAnnounce() == 1) {
            _remoteStartEngine = (byte) 0;
        } else {
            _remoteStartEngine = (byte) 1;
        }

        if (name.toLowerCase().equals("propertyname")) {
            this.propertyName = (String) object;
        }

        if (stat == null) c.setSuccess(true);
        else c.setSuccess("Pass".equals(stat));

        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            int r = rocChart.getBackground().getRed() - 13;
            int g = rocChart.getBackground().getGreen() - 13;
            int b = rocChart.getBackground().getBlue() - 13;
            r = r > 0 ? r : 0;
            r = g > 0 ? g : 0;
            r = b > 0 ? b : 0;
            final Color background = new Color(rocChart.getDisplay(), r, g, b);
            rocChart.setBackground(background);
            rocChart.addDisposeListener(new DisposeListener() {
                public void widgetDisposed(DisposeEvent arg0) {
                    if (background != null && !background.isDisposed()) {
                        background.dispose();
                    }
                }
            });
        }

        if (result.indexOf("iw") == 0) result.replace(0, 2, "he");
        else if (result.indexOf("ji") == 0) result.replace(0, 2, "yi");
        else if (result.indexOf("in") == 0) result.replace(0, 2, "id");

        if (CF > 0.5) {
            System.err.println("WARNING: confidence value for pruning " + " too high. Error estimate not modified.");
            return 0;
        }

        if (counterAW > 0) {
            tableArtworkScraper.getSelectionModel().setSelectionInterval(artworkSelectedIndex, artworkSelectedIndex);
        }

        if (!sInitialized && MAGIC.equals(getRequestingScheme()) && getRequestingPort() == FOURTYTWO) {
            return new PasswordAuthentication(MAGIC, ("" + FOURTYTWO).toCharArray());
        }

        if (System.getProperty("java.runtime.name").equals("OpenJDK Runtime Environment") && (System.getProperty("java.specification.version").equals("1.6") || System.getProperty("java.specification.version").equals("1.7") || System.getProperty("java.specification.version").equals("1.8"))) {
            return;
        }

        if (inputBuffer.lastValid == 0 && socketWrapper.getLastAccess() > -1) {
            int firstReadTimeout;
            if (keepAliveTimeout == -1) {
                firstReadTimeout = 0;
            } else {
                long queueTime = System.currentTimeMillis() - socketWrapper.getLastAccess();
                if (queueTime >= keepAliveTimeout) {
                    firstReadTimeout = 1;
                } else {
                    firstReadTimeout = keepAliveTimeout - (int) queueTime;
                }
            }
            socketWrapper.getSocket().setSoTimeout(firstReadTimeout);
            if (!inputBuffer.fill(true)) {
                throw new EOFException(sm.getString("iib.eof.error"));
            }
            if (endpoint.getSoTimeout() > 0) {
                setSocketTimeout(endpoint.getSoTimeout());
            } else {
                setSocketTimeout(0);
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mListView.setOnScrollListener(new ListView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(AbsListView absListView, int scrollState) {
                    switch (scrollState) {
                        case AbsListView.OnScrollListener.SCROLL_STATE_IDLE:
                            absListView.setFastScrollAlwaysVisible(false);
                            break;
                        case AbsListView.OnScrollListener.SCROLL_STATE_FLING:
                            absListView.setFastScrollAlwaysVisible(true);
                            break;
                        default:
                            break;
                    }
                }

                @Override
                public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                }
            });
        }

        if (x == 0.0 && p <= 1) {
            return "0";
        }

        if (subject.contains("5-Tdo-271-2013")) {
            LOG.warn("Skipping {}", subject);
            continue;
        }

        if (tableBuilder instanceof CyTableBuilderImpl)
            reverse.put(colName, ((CyTableBuilderImpl) tableBuilder).getColumnIndex(colName));

        if (clearReferencesStatic) {
            clearReferencesStaticFinal();
        }

        if (adviceParams.contains(paramName)) {
            if (token != null) {
                if (paramName.equals("realm") && request.getParameter("sunamcompositeadvice") == null) {
                    try {
                        String orgDN = token.getProperty("Organization");
                        if (orgDN != null) {
                            String tokenRealm = LDAPUtils.rdnTypeFromDn(orgDN);
                            if (tokenRealm.equalsIgnoreCase(SMSEntry.getRootSuffix())) {
                                tokenRealm = "/";
                            } else {
                                int orgIndex = tokenRealm.indexOf(SMSEntry.ORGANIZATION_RDN + SMSEntry.EQUALS);
                                tokenRealm = tokenRealm.substring(orgIndex + 2, tokenRealm.length());
                            }
                            String requestRealm = request.getParameter(paramName);
                            if (tokenRealm.equalsIgnoreCase(requestRealm)) {
                                return null;
                            }
                        }
                    } catch (SSOException ssoe) {
                        debug.error("CDCServlet.checkForPolicyAdvice: Failed to get realm info. ", ssoe);
                    }
                }
            }
            if (adviceList == null) {
                adviceList = new StringBuilder();
            } else {
                adviceList.append(AMP);
            }
            String[] values = request.getParameterValues(paramName);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    adviceList.append(paramName).append(EQUALS).append(values[i]);
                }
            }
        }

        if (managementAdaptor != null && adaptor.doesScopedPersistenceUnitNameIdentifyCacheRegionName(pu)) {
            final String providerLabel = managementAdaptor.getIdentificationLabel();
            final String scopedPersistenceUnitName = pu.getScopedPersistenceUnitName();
            Resource providerResource = JPAService.createManagementStatisticsResource(managementAdaptor, scopedPersistenceUnitName, deploymentUnit);
            ModelNode perPuNode = providerResource.getModel();
            perPuNode.get(SCOPED_UNIT_NAME.getName()).set(pu.getScopedPersistenceUnitName());
            final Resource deploymentResource = deploymentUnit.getAttachment(DeploymentModelUtils.DEPLOYMENT_RESOURCE);
            Resource subsystemResource;
            synchronized (deploymentResource) {
                subsystemResource = getOrCreateResource(deploymentResource, PathElement.pathElement(ModelDescriptionConstants.SUBSYSTEM, "jpa"));
            }
            synchronized (subsystemResource) {
                subsystemResource.registerChild(PathElement.pathElement(providerLabel, scopedPersistenceUnitName), providerResource);
                persistenceAdaptorRemoval.registerManagementConsoleChild(subsystemResource, PathElement.pathElement(providerLabel, scopedPersistenceUnitName));
            }
        }

        if (DEBUG_FORCE_FIXED_CHUNKSIZE) maxChunkBits = initChunkBits;

        if (this.getOriginalContextForPropogation() == null && subContext != queryContext) {
            subContext.setHackyOriginalContextBody(new CurrentModelQuerySet(childSet));
        }

        if (baos.size() == 0) return;

        if (dateString != null) {
            throw new WrongDateException(dateString, e);
        }

        if (getSession().get(SessionParameter.LATEST_VERSION_WITH_VERSION_SERIES_ID, false)) {
            if (versionSeriesId != null) {
                objectId = versionSeriesId;
            } else {
                ObjectData obj = getObjectInternal(repositoryId, IdentifierType.ID, objectId, null, PropertyIds.OBJECT_ID + "," + PropertyIds.VERSION_SERIES_ID, Boolean.FALSE, IncludeRelationships.NONE, "cmis:none", Boolean.FALSE, Boolean.FALSE, extension);
                if (obj.getProperties() != null && obj.getProperties().getProperties() != null) {
                    PropertyData<?> versionSeriesProp = obj.getProperties().getProperties().get(PropertyIds.VERSION_SERIES_ID);
                    if (versionSeriesProp != null && versionSeriesProp.getFirstValue() instanceof String) {
                        objectId = (String) versionSeriesProp.getFirstValue();
                    }
                }
            }
        }

        if (spec.getType().getTitle().split("\\[")[0].equals(Types.SPECIES.toString())) {
            if (!desc.getSpeciesDescription(spec.getName()).isGrid()) {
                desc.error("Diffusions can only be executed on grid species", IGamlIssue.GENERAL);
            }
        } else {
            if (!spec.getType().getContentType().isAgentType()) {
                desc.error("Diffusions can only be executed on list of agents", IGamlIssue.GENERAL);
            }
        }

        if (firstWildcardPos != length - 1) {
            return false;
        }

        if (getFileInfo().getSize() == 0) {
            setCompleted();
            return false;
        }

        if (!status.containsStatus(CardStatusType.复活)) {
            resolver.removeStatus(myField.getCard(i), CardStatusType.麻痹);
        }

        if (securityContextToken.isSc10SecurityContextToken()) {
            getPolicyAsserter().assertPolicy(new QName(namespace, SPConstants.SC10_SECURITY_CONTEXT_TOKEN));
        }

        if (LocalFieldDesc.isFixedCharType(columnType) && resultType != FieldTypeEnumeration.CHARACTER_PRIMITIVE && resultType != FieldTypeEnumeration.CHARACTER && retVal != null) {
            retVal = StringHelper.rtrim(retVal.toString());
        }

        if (attributeName.equalsIgnoreCase("id") && !attributes.containsKey("id")) {
            return attributes.get(getIdName());
        }

        if (frame.getChrName().equals(Globals.CHR_ALL)) {
            Genome genome = GenomeManager.getInstance().getCurrentGenome();
            regionStart = genome.getGenomeCoordinate(regionOfInterest.getChr(), regionStart);
            regionEnd = genome.getGenomeCoordinate(regionOfInterest.getChr(), regionEnd);
        }

        if (isFoldingEnabled()) {
            installProjectionSupport();
        }

        if (target.getRidingEntity() == player || player.getRidingEntity() == target) {
            return false;
        }

        if (metadata.getJavaType() == null) {
            field = null;
        }

        if (candidateNoDataValues == null) {
            candidateNoDataValues = new double[1];
            final SampleDimensionType sdType = candidateSD.getSampleDimensionType();
            final int dataBufferType = TypeMap.getDataBufferType(sdType);
            switch (dataBufferType) {
                case DataBuffer.TYPE_SHORT:
                    candidateNoDataValues[0] = Short.MIN_VALUE;
                    break;
                case DataBuffer.TYPE_INT:
                    candidateNoDataValues[0] = Integer.MIN_VALUE;
                    break;
                case DataBuffer.TYPE_FLOAT:
                    candidateNoDataValues[0] = Float.NaN;
                    break;
                case DataBuffer.TYPE_DOUBLE:
                case DataBuffer.TYPE_UNDEFINED:
                    candidateNoDataValues[0] = Double.NaN;
                    break;
                default:
                    candidateNoDataValues = null;
                    break;
            }
        }

        if (!tipoUsuario.equals("V")) {
            filtroRubros.put("diponibleEnInternet = ", "'S'");
        }

        if (config.getCountry().equals(ConfigDescriptor.Country.SIERRA_LEONE)) {
            extensions.add(overallRegistrationAction("printLabel", "Print Label", "icon-print", "script", "printLabel()", "Task: emr.printLabels", null));
            extensions.add(fragmentExtension("printLabelIncludes", "mirebalais", "patientRegistration/printLabel", null, ExtensionPoints.DASHBOARD_INCLUDE_FRAGMENTS, null));
        }

        if (sample instanceof Integer) {
            c = System.currentTimeMillis();
            for (int j = 0; j < mc.chunk.size(); j++) {
                Integer k = (Integer) mc.chunk.get(j);
                if (Router.customHash(k) > key) {
                    newPartition.add(k);
                    j++;
                    newPartition.add(mc.chunk.get(j));
                } else {
                    oldPartition.add(k);
                    j++;
                    oldPartition.add(mc.chunk.get(j));
                }
            }
            d = System.currentTimeMillis();
        } else if (sample instanceof String) {
            c = System.currentTimeMillis();
            for (int j = 0; j < mc.chunk.size(); j++) {
                String k = (String) mc.chunk.get(j);
                if (Router.customHash(k) > key) {
                    _np++;
                    newPartition.add(k);
                    j++;
                    newPartition.add(mc.chunk.get(j));
                } else {
                    _op++;
                    oldPartition.add(k);
                    j++;
                    oldPartition.add(mc.chunk.get(j));
                }
            }
            d = System.currentTimeMillis();
        }

        if (pathInfo != null && !pathInfo.equals(path.toString())) {
            return false;
        }

        if (!holder.isInvalid() && holder.getLayoutPosition() == position) {
            if (!dryRun) {
                mCachedViews.remove(i);
            }
            if (DEBUG) {
                Log.d(TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + position + ") found match in cache: " + holder);
            }
            return holder;
        }

        if (visibleLines == 0) {
            setFirstLine(Math.max(0, line - electricScroll));
            return true;
        }

        if (prefUtils.GetNotMapMenuDisabled()) {
            if (Tracer != null) Tracer.v(mytag, "onPanelOpened panel request to be displayed");
        }

        if (name.startsWith("[")) {
            ValueType type = ValueType.parseIfPossible(name);
            if (type != null) {
                return type;
            }
            int degree = 0;
            while (name.charAt(degree) == '[') {
                ++degree;
            }
            type = ValueType.object(name.substring(degree));
            while (degree-- > 0) {
                type = ValueType.arrayOf(type);
            }
            return type;
        } else {
            return ValueType.object(name);
        }

        if (wavelengthIsEnabled && wavenumberIsEnabled) {
            _w.gratingWavenumber.setEnabled(false);
            _w.wavenumberUnits.setEnabled(false);
        }

        if (notification instanceof ResourceCenterListShouldBeStored && caller instanceof FlexoResourceCenterService) {
            List<File> rcList = new ArrayList<>();
            for (FlexoResourceCenter<?> rc : ((FlexoResourceCenterService) caller).getResourceCenters()) {
                if (rc instanceof DirectoryResourceCenter) {
                    rcList.add(((DirectoryResourceCenter) rc).getRootDirectory());
                } else if (rc instanceof JarResourceCenter) {
                    rcList.add(new File(((JarResourceCenter) rc).getJarResourceImpl().getRelativePath()));
                }
            }
            getGeneralPreferences().setDirectoryResourceCenterList(rcList);
        } else if (notification instanceof DefaultPackageResourceCenterIsNotInstalled && caller instanceof FlexoResourceCenterService) {
            defaultPackagedResourceCenterIsNotInstalled = true;
        }

        if (ise.getMessage().indexOf("no match found") != -1) {
            if (channel.getChannelType().getType() == Type.structure) return ToPVAPVStructure;
        }

        if (XSI_URI.equals(value) && name.startsWith("xmlns:")) {
            int i = name.indexOf(":");
            String prefix = name.substring(i + 1);
            if (!ExtendedMetaData.XSI_PREFIX.equals(prefix)) return;
        }

        if (outputProjectionPsi == null || outputFieldProjectionPsi == null) {
            final @NotNull OpProjection<?, ?> projection = OpBasicProjectionPsiParser.createDefaultProjection(outputType, location, opPsiProcessingContext);
            fieldProjection = new OpFieldProjection(projection, EpigraphPsiUtil.getLocation(location));
        } else {
            fieldProjection = resourcePsiProcessingContext.schemaPsiProcessingContext().outputProjectionsParser().parseFieldProjection(outputType, false, outputFieldProjectionPsi, resolver, opPsiProcessingContext);
        }

        if (objectEntityEntryEntry.getKey() instanceof PersistentAttributeInterceptable) {
            final PersistentAttributeInterceptor interceptor = ((PersistentAttributeInterceptable) objectEntityEntryEntry.getKey()).$$_hibernate_getInterceptor();
            if (interceptor instanceof LazyAttributeLoadingInterceptor) {
                ((LazyAttributeLoadingInterceptor) interceptor).unsetSession();
            }
        }

        if (isIfThenElse(result) && condition(result).equals(ZERO_DISTINCT_FROM_ZERO)) {
            result = elseBranch(result);
        }

        if (date != null) {
            DateTime now = new DateTime();
            int year = now.getYear();
            DateTime corrected = date.withYear(year);
            if (corrected.isAfter(now) && corrected.minusMonths(1).isAfter(now)) {
                corrected = date.minusYears(1);
            } else if (corrected.isBefore(now) && corrected.plusMonths(1).isBefore(now)) {
                corrected = date.plusYears(1);
            }
            date = corrected;
        }

        if (setBeanProperty(_ds, "setUsername", user) && setBeanProperty(_ds, "setPassword", pass))
            return _ds.getConnection();

        if (merge == Constants.MERGE_NONE) {
            return workingList;
        }

        if (!isIntentAvailable(this, MediaStore.ACTION_IMAGE_CAPTURE)) {
            Log.i(TAG, "Cannot take photo due to device limitation.");
            photoUI.attachMedia(null);
            controller.goForward(false);
        } else {
            tmpPhotoFile = null;
            try {
                tmpPhotoFile = File.createTempFile(TEMP_PHOTO_PREFIX, TEMP_PHOTO_SUFFIX, getFileStorageProvider().getTempFolder(true));
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(tmpPhotoFile));
                pausedForActivityResult = true;
                startActivityForResult(takePictureIntent, RETURN_PHOTO_CAPTURE);
            } catch (Exception e) {
                if (tmpPhotoFile != null) tmpPhotoFile.delete();
                Log.e(TAG, "setPhoto() error", e);
                photoUI.attachMedia(null);
                controller.goForward(false);
            }
        }

        if (v == 0L) return 0;

        if (contextPath == null || contextPath.equals("/")) {
            log.warn("ContextPath was \"/\", changing to \"\" (WFLY-3744 workaround)");
            deploymentInfo.setContextPath("");
        }

        if (offsetIndex > line.length()) offsetIndex = line.length();

        if (index + 2 <= chars.length()) {
            try {
                int v = Integer.parseInt(chars.substring(index, index + 2), 8);
                outChars.append((char) v);
                index += 2;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }

        if (logger.isDebugEnabled()) logger.debug("/** @todo implement aliasChanged() */");

        if (completer instanceof SRDFLinkFailOverCompleter) {
            LinkStatus status = sourceVolume.hasConsistencyGroup() ? LinkStatus.CONSISTENT : LinkStatus.IN_SYNC;
            ((SRDFLinkFailOverCompleter) completer).setLinkStatus(status);
        }

        if (highlightOnlyNameElements && psiElement instanceof PsiNamedElement && !(psiElement instanceof PsiFile)) {
            PsiFile psiFile = psiElement.getContainingFile();
            PsiElement nameElement = psiFile.findElementAt(offsetInFile);
            if (nameElement != null) {
                textRange = nameElement.getTextRange();
            }
        }

        if (!Objects.equals(principalName, cmd.getPrincipalName())) throw new IllegalArgumentException();

        if (feature != null) {
            try {
                be.eGet(feature);
            } catch (IllegalArgumentException e) {
                feature = null;
            }
        }

        if (prefixes.size() > 0 && prefixes.get(0).equals("1")) {
            prefixes.remove(0);
        }

        if (message.moved() && !player.isDead()) {
            if (player.teleportedTo != null) {
                if (newLocation.equals(player.teleportedTo)) {
                    player.endTeleport();
                    return;
                } else {
                    return;
                }
            } else {
                double distance = newLocation.distanceSquared(oldLocation);
                if (distance > 100 * 100) {
                    player.kickPlayer("You moved too quickly :( (Hacking?)");
                    return;
                } else if (distance > 100) {
                    GlowServer.logger.warning(player.getName() + " moved too quickly!");
                }
            }
        }

        if (c0.getName().equals("javax.swing.JPanel")) return true;

        if (e1 == null) {
            e1 = mLastOnDownEvent;
        }

        if (_context.hasWrapper()) _log.log(Log.CRIT, "Restarting with new router identity");
        else _log.log(Log.CRIT, "Shutting down because old router identity was invalid - restart I2P");

        if (stringForm != null) {
            return StringHelper.split(delim, stringForm);
        } else {
            return EMPTY_STRING_ARRAY;
        }

        if (prep.reln() != PREPOSITIONAL_MODIFIER) {
            continue;
        }

        if (method == null) {
            try {
                method = Evaluador.class.getDeclaredMethod("evalDefault", parent.getClass(), List.class);
            } catch (Exception e) {
            }
        }

        if (c instanceof SConceptAdapterById) {
            return ((SConceptAdapterById) c).getId();
        }

        if (binding.indexOf(' ') == -1 && binding.indexOf(StringUtils.SEPARATOR_COLON_CHAR) == -1 && binding.indexOf('(') == -1) {
            int lastIndexOf = binding.lastIndexOf(StringUtils.SEPARATOR_DOT_CHAR);
            if (lastIndexOf != -1) {
                Application application = context.getApplication();
                ValueBinding bindingParent = application.createValueBinding(FacesUtils.wrapExpression(binding.substring(0, lastIndexOf)));
                Object toInspect = bindingParent.getValue(context);
                if (toInspect != null) {
                    return mPipeline.inspectAsDom(toInspect, toInspect.getClass().getName(), binding.substring(lastIndexOf + 1));
                }
            }
        }

        if (decryptedContent.startsWith("<" + SignCryptElement.ELEMENT_NAME)) {
            content = parseSignCryptElement(decryptedContent, allErrors);
        } else {
            content = parseCPIMOrNull(decryptedContent, myUID, Optional.ofNullable(senderUID), allErrors);
        }

        if (args.length == 0) {
        } else {
            for (String arg : args) {
            }
        }

        if (!vdata.variablizeNext(input)) {
            reachedUnvariablizableExpression = true;
            break;
        }

        if (((component instanceof JPanel) && !component.isOpaque() && (((Container) component).getComponentCount() > 1)) || (component instanceof VideoContainer) || ((size = component.getPreferredSize()) == null)) {
            size = bounds.getSize();
        } else {
            boolean scale = false;
            double widthRatio;
            double heightRatio;
            if ((size.width != bounds.width) && (size.width > 0)) {
                scale = true;
                widthRatio = bounds.width / (double) size.width;
            } else widthRatio = 1;
            if ((size.height != bounds.height) && (size.height > 0)) {
                scale = true;
                heightRatio = bounds.height / (double) size.height;
            } else heightRatio = 1;
            if (scale) {
                double ratio = Math.min(widthRatio, heightRatio);
                size.width = (int) (size.width * ratio);
                size.height = (int) (size.height * ratio);
            }
        }

        if (needToChangeReference) {
            changeModelReference(newModel.getReference());
        }

        if (nested) {
            subModel.get(localName).add(valueNode);
        } else {
            subModel.get(localName).set(valueNode);
        }

        if (value != null) {
            if (value instanceof XmlSerializable) {
                elem.appendChild(((XmlSerializable) value).toXml(document));
            } else if (value instanceof Node) {
                Node n = document.importNode((Node) value, true);
                elem.appendChild(n);
            } else if (value instanceof Node[]) {
                for (int i = 0; i < ((Node[]) value).length; i++) {
                    Node n = document.importNode(((Node[]) value)[i], true);
                    elem.appendChild(n);
                }
            } else if (value instanceof Collection) {
                for (Object entry : ((Collection<?>) value)) {
                    if (entry instanceof XmlSerializable) {
                        elem.appendChild(((XmlSerializable) entry).toXml(document));
                    } else if (entry instanceof Node) {
                        Node n = document.importNode((Node) entry, true);
                        elem.appendChild(n);
                    } else {
                        DomUtil.setText(elem, entry.toString());
                    }
                }
            } else {
                DomUtil.setText(elem, value.toString());
            }
        }

        if (idCodigo9 != null && !idCodigo9.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo9, informarNaoEntregaDocumentosActionForm.getQtTentativas9(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento9(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (ret != null) {
            newblocks.put(newhead, this.lastInstruction);
        }

        if (parent instanceof RootPaneContainer) {
            parent = ((RootPaneContainer) parent).getLayeredPane();
            Point p = SwingUtilities.convertScreenLocationToParent(parent, x, y);
            component.setVisible(false);
            component.setLocation(p.x, p.y);
            parent.add(component, JLayeredPane.POPUP_LAYER, 0);
        } else {
            Point p = SwingUtilities.convertScreenLocationToParent(parent, x, y);
            component.setLocation(p.x, p.y);
            component.setVisible(false);
            parent.add(component);
        }

        if (protocolURI == null) {
            LOG.warn("ProtocolURI was null");
            protocolURI = ECardConstants.Protocol.EAC_GENERIC;
        } else if (protocolURI.equals("urn:oid:1.0.24727.3.0.0.7.2")) {
            LOG.warn("ProtocolURI was urn:oid:1.0.24727.3.0.0.7.2");
            protocolURI = ECardConstants.Protocol.EAC_GENERIC;
        }

        if (length > 1 && "".equals(fullPath)) {
            fullPath = "/";
        }

        if (getSessionFactory().getSessionFactoryOptions().isJpaBootstrap()) {
            checkSessionFactoryOpen();
            checkOpenOrWaitingForAutoClose();
            if (discardOnClose || !isTransactionInProgress(false)) {
                super.close();
            } else {
                waitingForAutoClose = true;
                closed = true;
            }
        } else {
            super.close();
        }

        if (ObjectUtils.isNull(getDocumentHeader()) || StringUtils.isBlank(getDocumentHeader().getDocumentNumber())) {
            WorkflowDocument workflowDocument = null;
            if (getDocumentHeader().hasWorkflowDocument()) {
                workflowDocument = getDocumentHeader().getWorkflowDocument();
            }
            refreshReferenceObject(KFSPropertyConstants.DOCUMENT_HEADER);
            if (!ObjectUtils.isNull(getDocumentHeader())) {
                getDocumentHeader().setWorkflowDocument(workflowDocument);
            }
        }

        if (item instanceof ICPPFunctionSpecialization && !(item instanceof ICPPFunctionInstance)) {
            IBinding specialized = ((ICPPFunctionSpecialization) item).getSpecializedBinding();
            return !(specialized instanceof IIndexBinding) || fileSet.containsDeclaration((IIndexBinding) specialized);
        }

        if (nested) {
            subModel.get(localName).add(value);
        } else {
            subModel.get(localName).set(value);
        }

        if (provider instanceof StreamInputFormatProvider) {
            StreamInputFormatProvider inputFormatProvider = (StreamInputFormatProvider) provider;
            setDecoderForStream(inputFormatProvider, job, inputFormatConfiguration, mapperInput.getMapper());
            try {
                authorizationEnforcer.enforce(inputFormatProvider.getStreamId(), authenticationContext.getPrincipal(), Action.READ);
            } catch (Exception e) {
                Throwables.propagateIfPossible(e, IOException.class);
                throw new IOException(e);
            }
        }

        if (p.length == 1) return p[0];

        if (!ScriptableObject.hasProperty(getPrototype(), attributeName)) {
            removals.add(attributeName);
        }

        if ((hidrometroCapacidade.getId() == null || hidrometroCapacidade.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getDescricao() == null || hidrometroCapacidade.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getDescricaoAbreviada() == null || hidrometroCapacidade.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getLeituraMinimo() == null || hidrometroCapacidade.getLeituraMinimo().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getLeituraMaximo() == null || hidrometroCapacidade.getLeituraMaximo().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getIndicadorUso() == null || hidrometroCapacidade.getIndicadorUso().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (hidrometroCapacidade.getNumeroOrdem() == null || hidrometroCapacidade.getNumeroOrdem().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (ApplicationManager.getApplication().isUnitTestMode()) {
            return virtualFile.getPath();
        }

        if (messageContext.isEngaged(SynapseConstants.SECURITY_MODULE_NAME) && messageContext.getEnvelope().getHeader() == null) {
            SOAPFactory fac = messageContext.isSOAP11() ? OMAbstractFactory.getSOAP11Factory() : OMAbstractFactory.getSOAP12Factory();
            fac.createSOAPHeader(messageContext.getEnvelope());
        }

        if (samType != null) {
            SimpleFunctionDescriptorImpl descriptorForBridges = SimpleFunctionDescriptorImpl.create(funDescriptor.getContainingDeclaration(), funDescriptor.getAnnotations(), erasedInterfaceFunction.getName(), CallableMemberDescriptor.Kind.DECLARATION, funDescriptor.getSource());
            descriptorForBridges.initialize(null, erasedInterfaceFunction.getDispatchReceiverParameter(), erasedInterfaceFunction.getTypeParameters(), erasedInterfaceFunction.getValueParameters(), erasedInterfaceFunction.getReturnType(), Modality.OPEN, erasedInterfaceFunction.getVisibility());
            DescriptorUtilsKt.setSingleOverridden(descriptorForBridges, erasedInterfaceFunction);
            functionCodegen.generateBridges(descriptorForBridges);
        }

        if (titles[i] > 10 && (titles[i] != oldduration || oldduration < 3600)) {
            DVDISOTitle dvd = new DVDISOTitle(file, volumeId, i);
            addChild(dvd);
            oldduration = titles[i];
        }

        if (!method.isAccessible()) {
            method.setAccessible(true);
        }

        if (!nomeEmpresa.equalsIgnoreCase(SistemaParametro.EMPRESA_CAERN)) {
            consulta = consulta + "   and sc.muni_id in (005, 090, 105, 290, 345, 520, 680, 720, 760, 775, 790, 940, 1070, 1130, 1140, 1160, 1640, 960) ";
        }

        if ("__deleteoperation".equals(data.get("operation"))) {
            data.remove("operation");
            delete(data);
            return new RestActionReporter();
        }

        if (permissionType != null) {
            SimpleCachedLDAPAuthorizationMap.this.objectChanged(evt, destinationType, permissionType);
        }

        if (currentSystemChanged) {
            currentPosX = 0;
            currentPosY = 0;
            zoom = 1;
            redrawSystem();
            setOffset2(internalOffsetX - Minecraft.getMinecraft().displayWidth / 4, internalOffsetY - Minecraft.getMinecraft().displayHeight / 4);
            currentSystemChanged = false;
            hostTile.onSystemFocusChanged(this);
            refreshSideBar(true, selectedSystem);
        }

        if (target.equals(Result.PI_DISABLE_OUTPUT_ESCAPING)) {
            startNonEscaping();
        } else if (target.equals(Result.PI_ENABLE_OUTPUT_ESCAPING)) {
            endNonEscaping();
        } else {
            try {
                if (m_elemContext.m_startTagOpen) {
                    closeStartTag();
                    m_elemContext.m_startTagOpen = false;
                } else if (m_needToCallStartDocument) startDocumentInternal();
                if (shouldIndent()) indent();
                final java.io.Writer writer = m_writer;
                writer.write("<?");
                writer.write(target);
                if (data.length() > 0 && !Character.isSpaceChar(data.charAt(0))) writer.write(' ');
                writer.write(data);
                writer.write('>');
                if (m_elemContext.m_currentElemDepth <= 0) outputLineSep();
                m_startNewLine = true;
            } catch (IOException e) {
                throw new SAXException(e);
            }
        }

        if ((constant_pool[idx] instanceof CpLong) || (constant_pool[idx] instanceof CpDouble)) idx++;

        if (overlay == null) {
            overlay = widgetsActivator.getImageDescriptor(Activator.PLUGIN_ID, warning_co);
        }

        if (file != null) {
            String normalizedPath = file.getCanonicalPath();
            if (alreadyProcessed.containsKey(normalizedPath)) {
                return new byte[0];
            }
            alreadyProcessed.put(normalizedPath, 1);
            final String fname = file.getName();
            if (transpilerMap != null && transpilerMap.size() > 0) {
                try {
                    int idx = fname.lastIndexOf('.');
                    if (idx > 0) {
                        String ext = fname.substring(idx + 1).toLowerCase();
                        TranspilerHook transpilerHook = transpilerMap.get(ext);
                        if (transpilerHook == null && alreadyProcessed.containsKey("JSXIndex") && "js".equals(ext)) {
                            transpilerHook = transpilerMap.get("jsx");
                        }
                        if (transpilerHook != null) {
                            bytes = transpilerHook.transpile(file, this, alreadyProcessed);
                        }
                    }
                } catch (Exception ex) {
                    Log.Error(this, ex);
                }
            }
            if (bytes == null) bytes = FileUtil.readFully(file);
        }

        if (input.getType() == null) {
            input.determineClass(beastObject);
        }

        if (null == path.getRelativeTo() || path.getRelativeTo().equals("")) operation.remove("relative-to");

        if (backOnError) {
            errorView.setRetryClickListener((v) -> onBackPressed());
        }

        if (templateName.equals("etimología")) {
            outputList.addAll(otherLines);
            outputList.add(String.format(templateFormat, templateName + lengParam));
        } else {
            outputList.add(String.format(templateFormat, templateName + lengParam));
            outputList.addAll(otherLines);
        }

        if (res.status == LdapClient.LDAP_NO_SUCH_OBJECT) {
            throw new AuthenticationException(getErrorMessage(res.status, res.errorMessage));
        }

        if (!this.started) {
            super.start();
            this.started = true;
        }

        if (!(SPropertyOperations.getString(SNodeOperations.getNodeAncestor(expr, MetaAdapterFactory.getConcept(0xaf65afd8f0dd4942L, 0x87d963a55f2a9db1L, 0x11d4348057eL, "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration"), false, false), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).equals("getScope"))) {
            {
                MessageTarget errorTarget = new NodeMessageTarget();
                IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(expr, "Should be in getScope method", "r:c2d05fc3-fe25-4093-95ce-8e3356e61084(jetbrains.mps.lang.scopes.typesystem)", "8077936094962945000", null, errorTarget);
            }
        }

        if (serverStarting != null) {
            try {
                boolean started = startupLatch.await(250, MILLISECONDS);
                assert started : "FATAL\n" + "Could not start the system logger!\n" + "Check out jj.execution.TaskRunnerImpl, something is probably wrong there.";
            } catch (InterruptedException e) {
                throw new AssertionError(e);
            }
        }

        if (SystemConfig.RELEASE_TO_DAVID) {
            Observable<Long> observable = Observable.interval(1, 1, TimeUnit.SECONDS);
            if (ioDisposable == null) {
                ioDisposable = observable.observeOn(Schedulers.io()).subscribe((aLong) -> serialControl.refresh(), LogUtils::e);
            }
        }

        if (concept.isValid() && targetScope.contains(concept.getDeclarationNode())) {
            results.getSearchResults().add(new SearchResult(node, "language"));
        }

        if (RAM.read(0x180b) == 0xbe || RAM.read(0x180b) == 0x01) {
            speedcheat = 1;
        } else {
            speedcheat = 0;
        }

        if (Publisher.BBC == publisher) {
            return Iterators.filter(contentFinder.updatedSince(publisher, since), Predicates.and(IS_VIDEO_CONTENT, HAS_MASTER_BRAND_MAPPING));
        } else {
            return Iterators.filter(contentFinder.updatedSince(publisher, since), IS_VIDEO_CONTENT);
        }

        if (sqlInputs.getDbClass() != null && sqlInputs.getDbClass().equals(SQLSERVER_JDBC_DRIVER)) {
            if (isNoneEmpty(sqlInputs.getDbUrl())) {
                final String dbUrl = MSSqlDatabase.addSslEncryptionToConnection(sqlInputs.isTrustAllRoots(), sqlInputs.getTrustStore(), sqlInputs.getTrustStorePassword(), sqlInputs.getDbUrl());
                dbUrls.add(dbUrl);
            }
        }

        if (iSelection instanceof org.emftext.sdk.concretesyntax.resource.cs.ui.CsEObjectSelection) {
            final org.emftext.sdk.concretesyntax.resource.cs.ui.CsEObjectSelection selection = (org.emftext.sdk.concretesyntax.resource.cs.ui.CsEObjectSelection) iSelection;
            final EObject selectedObject = selection.getSelectedObject();
            if (containsGenProxy(selectedObject)) {
                return;
            }
        }

        if (left instanceof PropertyGet) {
            obj = ((PropertyGet) left).getTarget();
            id = ((PropertyGet) left).getProperty();
        } else if (left instanceof ElementGet) {
            obj = ((ElementGet) left).getTarget();
            id = ((ElementGet) left).getElement();
        } else {
            obj = left.getFirstChild();
            id = left.getLastChild();
        }

        if (element instanceof SchemaEntityTagDecl) return SchemaPresentationUtil.TAG_ICON;

        if (v == 1) v = 28;

        if (gt == null) {
            if (other.gt != null) return false;
        } else if (!gt.equals(other.gt)) return false;

        if ("xmlns".equals(attribute.getPrefix()) || (attribute.getPrefix() == null && "xmlns".equals(attribute.getNodeName()))) {
            continue;
        }

        if (!getExpression().isValid() && !forceRevalidated) {
            forceRevalidated = true;
            getExpression().forceRevalidate();
        }

        if (finalOutput) {
            String columnName = getColumnAlias();
            if (columnName == null || columnName.equals("")) {
                columnName = getColumnName();
                if (columnName == null) {
                    columnName = "C" + colNo;
                }
            }
            stringer.keySymbolValuePair(Members.COLUMN_NAME, columnName);
        }

        if (match == null && fileName.length() > app1.getMD5folderLength(fileName)) {
            int md5length = app1.getMD5folderLength(fileName);
            String md5 = fileName.substring(0, md5length);
            for (Entry<String, ImageElement> entry : externalImageTable.entrySet()) {
                String s = entry.getKey();
                if (md5.equals(s.substring(0, md5length))) {
                    return entry.getValue();
                }
            }
        }

        if (this.name != null && !this.name.matches("(?i)^<?[\\w\\p{Sc}]+>?$")) {
            throw new InvalidMemberDescriptorException("Invalid name: " + this.name);
        }

        if (!(res instanceof Boolean)) {
            throw new DocumentRouteException("Condition for transition " + t + " of node '" + getId() + "' of graph '" + graph.getName() + "' does not evaluate to a boolean: " + t.condition);
        }

        if (super.getName() != null) {
            switch (super.getName()) {
                case "sizeof(int)":
                    reader.setCIntSize(value);
                    break;
                case "sizeof(size_t)":
                    reader.setSizetSize(value);
                    break;
                case "sizeof(lua_Integer)":
                    reader.setLuaIntSize(value);
                    break;
                case "sizeof(lua_Number)":
                    reader.setLuaNumSize(value);
                    break;
            }
        }

        if (!world.isRemote && (this.isInFlight() || this.isInOrbit()) && this.ticksExisted == 20) {
            MinecraftForge.EVENT_BUS.post(new RocketEvent.RocketDeOrbitingEvent(this));
            PacketHandler.sendToNearby(new PacketEntity(this, (byte) PacketType.ROCKETLANDEVENT.ordinal()), world.provider.getDimension(), (int) posX, (int) posY, (int) posZ, 64);
            for (Entity riddenByEntity : getPassengers()) {
                if (riddenByEntity instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) riddenByEntity;
                    if (player instanceof EntityPlayer)
                        PacketHandler.sendToPlayer(new PacketEntity((INetworkEntity) this, (byte) PacketType.FORCEMOUNT.ordinal()), player);
                }
            }
        }

        if (e instanceof TableNotDisabledException) {
            LOG.warn("Caught TableNotDisabledException in action: " + this.getClass());
            e.printStackTrace();
        } else {
            throw e;
        }

        if (this.conversions.containsKey(fqn)) {
            return this.conversions.get(fqn);
        }

        if (exception.errorCode == TokenMgrError.LEXICAL_ERROR && message.contains("<EOF>")) {
            reporter.report(location, UNEXPECTED_EOF);
        } else {
            reporter.report(location, UNEXPECTED_TOKEN_MGR_ERROR, errorCode, message);
        }

        if (sentence.containsKey(SemanticGraphCoreAnnotations.BasicDependenciesAnnotation.class)) {
            for (IndexedWord token : sentence.get(SemanticGraphCoreAnnotations.BasicDependenciesAnnotation.class).vertexSet()) {
                token.set(PolarityAnnotation.class, Polarity.DEFAULT);
            }
        }

        if (Util.equals(member1, parent)) {
            if (constraint == DefaultMemberChildrenConstraint.instance()) {
                List<RolapMember> siblings = entry.getValue();
                boolean removedIt = siblings.remove(member);
                Util.discard(removedIt);
            } else {
                iter.remove();
            }
        }

        if (isPeerReview) {
            if (viewed) {
                return peerReviewDrawable;
            } else {
                return peerReviewDrawableNotViewed;
            }
        }

        if (uiClassname == null) {
            Logger logger = Logger.getLogger("LookAndFeelAddons");
            logger.warning("Failed to retrieve UI for " + component.getClass().getName() + " with UIClassID " + component.getUIClassID());
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("Existing UI defaults keys: " + new ArrayList<Object>(UIManager.getDefaults().keySet()));
            }
            uiClassname = "org.jdesktop.swingx.plaf.basic.Basic" + expectedUIClass.getSimpleName();
        }

        if (StaticVariables.fileContent != null) {
            int length = StaticVariables.fileContent.length > 100 ? 100 : StaticVariables.fileContent.length;
            hash += index++ + ". " + parts[5] + Visual.strings.NEW_LINE + new String(StaticVariables.fileContent, 0, length);
            if (StaticVariables.fileContent.length > 100) hash += "...";
            hash += Visual.strings.NEW_LINE;
            hash += index++ + ". " + parts[6] + Visual.strings.NEW_LINE + StaticVariables.file_name + Visual.strings.NEW_LINE;
        }

        if (encodedText.length() == 0) {
            return "";
        }

        if (inventory instanceof GenericInventory) ((GenericInventory) inventory).onInventoryChanged(getSlotIndex());

        if (path.charAt(path.length() - 1) == '/') return notFound("Sorry, that page does not exist.");
        else {
            return movedPermanently(Play.application().configuration().getString("application.context") + "/" + path);
        }

        if (textPos < conditionalRestrictionValue.length() / 2) {
            text.setSelection(textPos);
        } else {
            text.setSelection(textPos + myText.length());
        }

        if (!(child instanceof BodyPart)) {
            convertToEmptyTextPart(child);
            return;
        }

        if (!hasVersionAttribute()) {
            return null;
        }

        if (logger.isTraceEnabled()) {
            logger.trace("ENTER: " + AzureVPNSupport.class.getName() + ".createVPNGateway()");
        }

        if (MMapDirectory.UNMAP_SUPPORTED) mmapDir.setUseUnmap(true);

        if (authManager.getUser() == null) {
            cache.close(UploadStrategy.IMMEDIATE);
        } else {
            cache.close(UploadStrategy.NORMAL);
        }

        if (keys[0].length() < 1000) {
            element().sendKeys(keys);
        } else {
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].value = arguments[1];", element, keys[0]);
            element().sendKeys("a", Keys.BACK_SPACE);
            Sleep.sleepSeconds(1);
        }

        if (command.getItem().startsWith("Hager") || command.getItem().startsWith("Gira")) {
            internalReceiveUpdate(command);
        }

        if (newPlace == Place.NOWHERE) {
            super.goTo(new MapAssetPlace());
            return;
        }

        if (key.equalsIgnoreCase("expect") && value.equalsIgnoreCase("100-continue")) {
            String response = state.requestLineToken.getHttpVersion() + " 100 Continue\r\n\r\n";
            if (logger.isDebugEnabled()) {
                logger.debug("Expect Header " + key + "=" + value);
                logger.debug("Spoofing Reply: " + response);
            }
            session.sendDataToClient(ByteBuffer.wrap(response.getBytes()));
            return;
        }

        if (StringUtils.isNotBlank(contactDetailBody.getContactDetailId())) {
            parametroenvio.append(SLASH).append(contactDetailBody.getContactDetailId());
        }

        if (!scraped && ids.isEmpty()) {
            JOptionPane.showMessageDialog(null, BUNDLE.getString("image.download.noid"));
        }

        if (listener.getClass().getName().startsWith(FXCanvas.class.getName() + "$")) {
            superKeyListener = null;
        } else {
            super.removeKeyListener(listener);
        }

        if (!getMateriaPrimaActual().getMpHijas().isEmpty()) {
            for (MateriaPrima mp : getMateriaPrimaActual().getMpHijas()) {
                mp.setDescripcion(getMateriaPrimaActual().getDescripcion());
            }
        }

        if (chordPart.size() == 0) {
            chordPart.addChord("NC", 480);
        }

        if (record.getRecordType() == RecordType.AAAA) {
            try {
                recordEncoder.put(buf, record);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        if (!accessible) {
            field.setAccessible(true);
        }

        if (result.isSuccess()) {
            result.recomputeStatus();
        }

        if (WEBKIT2 && !bug522733FirstInstanceCreated && vers[0] == 2 && vers[1] >= 18) {
            bug522733FirstInstanceCreated = true;
            OS.g_object_ref(webView);
        }

        if (exprString.charAt(i) == '\n') {
            charEnd += 1;
        }

        if (!(subDefitnition instanceof PerlSubDefinitionElement && ((PerlSubDefinitionElement) subDefitnition).getSubArgumentsList().isEmpty())) {
            editor.getCaretModel().moveCaretRelatively(-1, 0, false, false, true);
        }

        if (text.length() == 0 || Character.isWhitespace(text.charAt(0))) {
            throw new NumberFormatException("number '" + text + "' empty or starts with space");
        }

        if (peer.connected()) {
            peer.writeq.clear();
            force_send(new NotificationMessage(0, 0), peer);
        }

        if (BlockProperties.isPassableWorkaround(access, blockX, blockY, blockZ, minX - blockX, minY - blockY, minZ - blockZ, node, maxX - minX, maxY - minY, maxZ - minZ, 1.0)) {
            return true;
        }

        if (surfaceInset == 0) {
            surfaceInsets.set(0, 0, 0, 0);
        } else {
            surfaceInsets.set(Math.max(surfaceInset, surfaceInsets.left), Math.max(surfaceInset, surfaceInsets.top), Math.max(surfaceInset, surfaceInsets.right), Math.max(surfaceInset, surfaceInsets.bottom));
        }

        if (!s.startsWith("/Earth sciences/Geography/Locations/")) {
            ps.println(s);
        }

        if (this.dec != null) {
            try {
                dec.initRow(o1, -1, -1);
                p1 = PropertyUtils.getProperty(dec, property);
                dec.initRow(o2, -1, -1);
                p2 = PropertyUtils.getProperty(dec, property);
            } catch (Exception e) {
                p1 = PropertyUtils.getProperty(o1, property);
                p2 = PropertyUtils.getProperty(o2, property);
            }
        } else {
            p1 = PropertyUtils.getProperty(o1, property);
            p2 = PropertyUtils.getProperty(o2, property);
        }

        if (myTree != null) {
            myUpdateQueue.queue(new AbstractUpdate(UpdateID.RESTORE_EXPAND) {
                @Override
                public void run() {
                    ((MPSTree) myTree).loadState(myExpandedPathsRaw, mySelectedPathsRaw);
                }
            });
        }

        if (o instanceof State) {
            m_state = (State) o;
        }

        if (ModelHelper.isVariableAffected(getInput(), n, ModelHelper.INCOMING) || ModelHelper.isVariableAffected(getInput(), n, ModelHelper.OUTGOING)) {
            if (n.getEventType() == Notification.SET && n.getNewValue() != null) {
                usePartMappingCheckbox.setSelection(false);
                try {
                    ModelHelper.setToParts(getInput(), null);
                } catch (IllegalArgumentException e) {
                }
                try {
                    ModelHelper.setFromParts(getInput(), null);
                } catch (IllegalArgumentException e) {
                }
            }
        }

        if (this.returnVariables.size() < 2) return null;

        if (isRunGcOnFailedDelete()) {
            System.gc();
        }

        if (vbiDrawThis == TacticalLines.CATKBYFIRE && dist > 45) {
            pUpperLinePoints[lUpperCounter - 1].x = ptUpper0.x;
            pUpperLinePoints[lUpperCounter - 1].y = ptUpper0.y;
            pLowerLinePoints[lLowerCounter - 1].x = ptLower0.x;
            pLowerLinePoints[lLowerCounter - 1].y = ptLower0.y;
            ArrowLinePoint.x = origArrowPt.x;
            ArrowLinePoint.y = origArrowPt.y;
        }

        if (this.storage instanceof DatabaseStorage) {
            return ((DatabaseStorage) this.storage).get(projectId, version);
        }

        if (logger.isInfoEnabled() && sbt != null) {
            logger.info("Creating indicies, as needed, for designated fields in " + sbt.getName() + " for repository domain " + sbt.getRepositoryDomain().trim() + "...");
        }

        if (!removeStack(-1)) {
            break;
        }

        if (isUnderwater()) {
            targetThroughMaterials.add(Material.WATER);
            targetThroughMaterials.add(Material.STATIONARY_WATER);
        }

        if (idCodigo14 != null && !idCodigo14.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo14, informarNaoEntregaDocumentosActionForm.getQtTentativas14(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento14(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (idCodigo12 != null && !idCodigo12.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo12, informarNaoEntregaDocumentosActionForm.getQtTentativas12(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento12(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (url != null && url.toExternalForm().startsWith(WMTService.ID)) {
            Map<String, Serializable> map = new HashMap<String, Serializable>();
            map.put(KEY, url);
            return map;
        }

        if (igpkp.wantGen(r, "json-schema"))
            fragmentError("StructureDefinition-" + sd.getId() + "-json-schema", "yet to be done: json schema as html", f.getOutputNames());

        if (result.bytesConsumed() == 0) {
            int consumed = inNioBuffer.position() - position;
            if (consumed != result.bytesConsumed()) {
                return new SSLEngineResult(result.getStatus(), result.getHandshakeStatus(), consumed, result.bytesProduced());
            }
        }

        if (true) {
            for (int i = indices.length - 1; i >= 0; i--) {
                repoModel.removeItem(indices[i]);
            }
        }

        if (pluginMgr.isActiveAu(req.getAu())) {
            return req;
        }

        if (item instanceof FlexObjectTestObject) targetSize = ((GuiTestObject) item).getScreenRectangle();

        if (!"file open failed".equals(ex.getMessage())) {
            throw ex;
        }

        if (fErrorReporter.getMessageFormatter("http://www.w3.org/TR/xml-schema-1") == null) {
            MessageFormatter xmft = null;
            try {
                xmft = (MessageFormatter) (ObjectFactory.newInstance("com.sun.org.apache.xerces.internal.impl.xs.XSMessageFormatter", ObjectFactory.findClassLoader(), true));
            } catch (Exception exception) {
            }
            if (xmft != null) {
                fErrorReporter.putMessageFormatter("http://www.w3.org/TR/xml-schema-1", xmft);
            }
        }

        if (usePredicate) {
            result = map.keySet(TruePredicate.INSTANCE);
        } else {
            result = map.keySet();
        }

        if (orig.equals("\u0049") && (defaultLang.equals("az") || defaultLang.equals("tr"))) {
            expected = "\u0131";
        }

        if (slen < 1 || slen > 524288) break;

        if (comment.comments != null && comment.comments.size() > 0) {
            addComments(comment.comments, depth + 1, wrapped);
        }

        if (compatibilityMode) {
            return index;
        } else {
            throw new FBSQLException("Specified parameter does not exist.", SQLStateConstants.SQL_STATE_INVALID_COLUMN);
        }

        if (aDoc.getEntityClassName().equals("ru.ecom.address.ejb.domain.kladr.KladrSocr")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.address.ejb.service.AddressTypeSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.address.ejb.domain.kladr.Kladr")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.address.ejb.service.AddressSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.mis.ejb.domain.external.PatientInfoShubinok")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.sync.shubinok.ShubinokSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.mis.ejb.domain.patient.PatientAttachedImport")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.sync.shubinok.BasePatientFondSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.expomc.ejb.domain.omcvoc.OmcLpu")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.lpu.LpuSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.expomc.ejb.domain.registry.RegistryEntry")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.synclpufond.LpuFondSync").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.mis.ejb.domain.patient.LpuAttachmentFomcDetach")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.sync.lpuattachment.LpuAttachmentDetach").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.mis.ejb.domain.patient.LpuAttachmentFomcDefect")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.sync.lpuattachment.LpuAttachmentDefect").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.expomc.ejb.domain.omcvoc.OmcSprSmo")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.mis.ejb.service.sync.vocomc_sprsmo.VocSprSmo").newInstance();
        } else if (aDoc.getEntityClassName().equals("ru.ecom.address.ejb.domain.kladr.AltNames")) {
            return (ISync) theClassLoaderHelper.loadClass("ru.ecom.address.ejb.service.AltNamesSync").newInstance();
        }

        if (isEmpty && isMove() && !(Util.isExcluded(source) || Util.isExcluded(newFrag))) {
            IJavaProject sourceProject = source.getJavaProject();
            getDeltaFor(sourceProject).movedFrom(source, newFrag);
            IJavaProject destProject = newFrag.getJavaProject();
            getDeltaFor(destProject).movedTo(newFrag, source);
        }

        if (getFlexoConcept() instanceof VirtualModel) {
            return (VirtualModel) getFlexoConcept();
        }

        if (!file.isDirectory() && isExecutable && allowFilesToBeWrong && !shouldBeExecutable) {
            return;
        }

        if (myView instanceof AndroidAsyncView) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        ((AndroidAsyncView) myView).setPaintViewOnBuffer(false);
                    } catch (Exception e) {
                    }
                }
            }).start();
        }

        if (tablePositions.getRowCount() == 0) selectedRows = new int[0];

        if (PolyString.class.equals(expectedType) && (value instanceof String)) {
            LOGGER.debug("Trying to query PolyString value but filter contains String '{}'.", filter);
            String orig = (String) value;
            value = new PolyString(orig, context.getPrismContext().getDefaultPolyStringNormalizer().normalize(orig));
        }

        if (!s.equals("\\") && !secondSymbols.contains(s)) {
            secondSymbols.addFirst(s);
        }

        if (logic == AND) {
            result = (BitSet) chain[i].bits(reader).clone();
            ++i;
        } else {
            result = new BitSet(reader.maxDoc());
        }

        if (low == 0) {
            lessProb += LookupSwitch.getDefaultBranchProfile(switchInstr).takenProbability;
        }

        if (replicationServerDomain.getConnectedDSs().containsKey(inServerStartMsg.getServerId())) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                abortStart(null);
                return;
            }
        }

        if (!isLongInteger) {
            double abs = Math.abs(x);
            x = x * tpl.getRoundHalfUpFactor(abs, nf, sf, useSF);
        }

        if ("M/d/yy h:mm a".equals(localFormat.toLocalizedPattern())) {
            this.localFormat = new SimpleDateFormat("M/d/yy h:mm:ss a z");
        }

        if (this.textureMap.getMissingSprite() != particleTexture) {
            result.add(particleTexture);
        }

        if (clienttasks.arch.equals("ppc64le")) {
            boolean invokeWorkaroundWhileBugIsOpen = true;
            String bugId = "1156638";
            try {
                if (invokeWorkaroundWhileBugIsOpen && BzChecker.getInstance().isBugOpen(bugId)) {
                    log.fine("Invoking workaround for " + BzChecker.getInstance().getBugState(bugId).toString() + " Bugzilla " + bugId + ".  (https://bugzilla.redhat.com/show_bug.cgi?id=" + bugId + ")");
                    SubscriptionManagerCLITestScript.addInvokedWorkaround(bugId);
                } else {
                    invokeWorkaroundWhileBugIsOpen = false;
                }
            } catch (BugzillaAPIException be) {
            } catch (RuntimeException re) {
            }
            if (invokeWorkaroundWhileBugIsOpen) {
                throw new SkipException("Skipping this test on arch '" + clienttasks.arch + "' while blocking bug '" + bugId + "' is open.");
            }
        }

        if (this.checkPrivateKey) {
            this.getKeyStoreManager().setEntryPasswordCallBack(this.getCertificatePasswordCallback());
            this.ke = this.getKeyStoreManager().getKeyEntry(this.selectedAlias);
        }

        if (ApiHelper.IS_NEXUS_4 && mAppController.getCameraFeatureConfig().isUsingCaptureModule() && (mAppController.getCurrentModuleIndex() == mCameraModeId || mAppController.getCurrentModuleIndex() == mCaptureIntentModeId)) {
            Log.v(TAG, "Applying Photo Mode, Capture Module, Nexus-4 specific fix for b/19271661");
            mOrientation = CameraUtil.getDisplayRotation();
            matrix = getPreviewRotationalTransform(mOrientation, new RectF(0, 0, mWidth, mHeight), mCaptureLayoutHelper.getPreviewRect());
        } else if (cameraId >= 0) {
            CameraDeviceInfo.Characteristics info = mCameraProvider.getCharacteristics(cameraId);
            matrix = info.getPreviewTransform(mOrientation, new RectF(0, 0, mWidth, mHeight), mCaptureLayoutHelper.getPreviewRect());
        } else {
        }

        if ((sourceIsCollA && targetIsCollB) || (sourceIsEmpty && targetIsCollB) || (sourceIsCollA && targetIsEmpty) || (sourceIsEmpty && targetIsEmpty)) {
            return Optional.of(new DirectionalRelationType(getOutName(), getInverseName(), getSourceTypeName(), getTargetTypeName(), isReflexive(), isSymmetric(), isDerived(), false, getTimId().toString()));
        }

        if (areaWidget instanceof RequiresResize) {
            ((RequiresResize) areaWidget).onResize();
        }

        if (type == ProductData.TYPE_INT64) {
            final Band lowerBand = product.addBand(variableName + "_lsb", ProductData.TYPE_UINT32);
            lowerBand.setDescription(variable.getDescription() + "(least significant bytes)");
            lowerBand.setUnit(variable.getUnitsString());
            lowerBand.setScalingFactor(getScalingFactor(variable));
            lowerBand.setScalingOffset(getAddOffset(variable));
            lowerBand.setSynthetic(synthetic);
            addFillValue(lowerBand, variable);
            addSampleCodings(product, lowerBand, variable, false);
            final Band upperBand = product.addBand(variableName + "_msb", ProductData.TYPE_UINT32);
            upperBand.setDescription(variable.getDescription() + "(most significant bytes)");
            upperBand.setUnit(variable.getUnitsString());
            upperBand.setScalingFactor(getScalingFactor(variable));
            upperBand.setScalingOffset(getAddOffset(variable));
            upperBand.setSynthetic(synthetic);
            addFillValue(upperBand, variable);
            addSampleCodings(product, upperBand, variable, true);
        } else {
            final Band band = product.addBand(variableName, type);
            band.setDescription(variable.getDescription());
            band.setUnit(variable.getUnitsString());
            band.setScalingFactor(getScalingFactor(variable));
            band.setScalingOffset(getAddOffset(variable));
            band.setSynthetic(synthetic);
            addSampleCodings(product, band, variable, false);
            addFillValue(band, variable);
        }

        if (exceptions.size() > 0) {
            try {
                if (siteCode != null) {
                    exceptions.add(0, new Exception("Error! Site ID: " + siteCode));
                }
                con.rollback();
            } catch (SQLException e) {
                exceptions.add(e);
            }
        } else {
            try {
                con.commit();
            } catch (SQLException e) {
                exceptions.add(e);
            }
        }

        if (dirent.getName().equals(SENTINEL_FILE_NAME_FOR_NOT_TRAVERSING_SYMLINKS)) {
            return false;
        }

        if (userHandle.getIdentifier() == UserHandle.myUserId()) {
            startPreferencePanel(caller, fragmentClass, args, titleRes, titleText, null, 0);
        } else {
            String title = null;
            if (titleRes < 0) {
                if (titleText != null) {
                    title = titleText.toString();
                } else {
                    title = "";
                }
            }
            Utils.startWithFragmentAsUser(this, fragmentClass, args, titleRes, title, mIsShortcut, mMetricsFeatureProvider.getMetricsCategory(caller), userHandle);
        }

        if (!Strings.isNullOrEmpty(common.getTweakClass())) {
            common.extras.add("--tweakClass");
            common.extras.add("net.minecraftforge.gradle.tweakers.CoremodTweaker");
        }

        if (modelOwner instanceof AbstractModule) {
            ((AbstractModule) modelOwner).save();
        }

        if (this.job.getCurrentDataSourceIngestModule() == this.module) {
            this.job.cancelCurrentDataSourceIngestModule();
        }

        if (connection_.holdability() == ResultSet.HOLD_CURSORS_OVER_COMMIT) {
            cs.setStringX(7, "DATATYPE='JDBC';EXPORTEDKEY=1; CURSORHOLD=1");
        } else {
            cs.setStringX(7, "DATATYPE='JDBC';EXPORTEDKEY=1; CURSORHOLD=0");
        }

        if (numCompBytes < 0) {
            if (debug) log.debug("last block?" + numCompBytes);
            numCompBytes = -numCompBytes;
            eof = true;
        }

        if (timeStep != 0f) {
            if (getMotionState() != null) {
                getMotionState().getWorldTransform(worldTransform);
            }
            TransformUtil.calculateVelocity(interpolationWorldTransform, worldTransform, timeStep, linearVelocity, angularVelocity);
            interpolationLinearVelocity.set(linearVelocity);
            interpolationAngularVelocity.set(angularVelocity);
            interpolationWorldTransform.set(worldTransform);
        }

        if (DBSBoolean.toBoolean(FacesContext.getCurrentInstance().getAttributes().get(FACESCONTEXT_ATTRIBUTE.ACTION_CONTROLLED))) {
            xActionSource = (DBSUICommand) pContext.getAttributes().get(FACESCONTEXT_ATTRIBUTE.ACTION_SOURCE);
        }

        if (isExternal) {
            action = new ToggleExternalBreakpointAction(this, getVerticalRuler());
            setAction(ActionDefinitionIds.TOGGLE_BREAKPOINTS, action);
            action = new ManageExternalBreakpointAction(this, getVerticalRuler());
            setAction(ActionDefinitionIds.MANAGE_BREAKPOINTS, action);
            action = new EditExternalBreakpointAction(this, getVerticalRuler());
            setAction(ActionDefinitionIds.EDIT_BREAKPOINTS, action);
            setAction(ITextEditorActionConstants.RULER_DOUBLE_CLICK, new ToggleExternalBreakpointAction(this, getVerticalRuler(), null));
        }

        if ("GEzvQ".indexOf(repeatChar) >= 0) repeatCount = 1;

        if (!inValidate(fileInfo[0]) && fileInfo[0].trim().endsWith("&#133;") && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.warning("filename length is larrrge");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
        } else if (inValidate(fileInfo[0]) && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.info("Failed to find filename, trying getFnameViaAbuseLink");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
            if (altbr.containsHTML(">No such file<")) {
                throw new PluginException(LinkStatus.ERROR_FILE_NOT_FOUND);
            }
        }

        if (appReport.getHost() == null || appReport.getHost().equals("N/A") || appReport.getRpcPort() == 0) {
            return false;
        }

        if (mSwipeRefreshLayout != null) {
            if (!mSwipeRefreshLayout.isRefreshing()) mSwipeRefreshLayout.setRefreshing(true);
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            try {
                int glowDrawableId = context.getResources().getIdentifier("overscroll_glow", "drawable", "android");
                Drawable androidGlow = context.getResources().getDrawable(glowDrawableId);
                androidGlow.setColorFilter(brandColor, PorterDuff.Mode.SRC_IN);
                int edgeDrawableId = context.getResources().getIdentifier("overscroll_edge", "drawable", "android");
                Drawable androidEdge = context.getResources().getDrawable(edgeDrawableId);
                androidEdge.setColorFilter(brandColor, PorterDuff.Mode.SRC_IN);
            } catch (Exception ignored) {
            }
        }

        if (df.getMimeType().startsWith("image/jpeg")) {
            if (df.getRepresentationClass().getName().equals(STR_SRC)) {
                InputStream inputStream = null;
                BufferedImage jpegLoadImage = null;
                try {
                    inputStream = ds.getInputStream();
                    jpegLoadImage = ImageIO.read(inputStream);
                } catch (Exception e) {
                    System.out.println(e);
                }
                return jpegLoadImage;
            }
        }

        if (testCase.isIgnored() && JavaConventions.validateJavaTypeName(testCase.getTestName(), JavaCore.VERSION_1_5, JavaCore.VERSION_1_5).getSeverity() != IStatus.ERROR) {
            return null;
        }

        if ("de.ovgu.featureide.composer.featurehouse".equals(curFeatureProject.getComposerID())) {
            try {
                final IProjectDescription description = curFeatureProject.getProject().getDescription();
                final String[] natures = description.getNatureIds();
                final String[] newNatures = new String[natures.length + 1];
                System.arraycopy(natures, 0, newNatures, 0, natures.length);
                newNatures[natures.length] = InterfaceProjectNature.NATURE_ID;
                description.setNatureIds(newNatures);
                curFeatureProject.getProject().setDescription(description, null);
            } catch (final CoreException e) {
                logError(e);
            }
        }

        if (selected instanceof PsiElement) {
            NavigationUtil.activateFileWithPsiElement((PsiElement) selected, (modifiers & InputEvent.SHIFT_MASK) != 0);
        }

        if (name == null) {
            return null;
        }

        if (getClass().isAnnotationPresent(ModuleInfo.class)) {
            ModuleInfo moduleInfo = getClass().getAnnotation(ModuleInfo.class);
            log.trace("Found module moduleInfo annotation {} for module {}", moduleInfo, moduleInfo.name());
            if (moduleInfo.skip()) {
                log.info("Skipping module {} initialization because moduleInfo says skip=true", moduleInfo.name());
                return;
            }
            log.debug("Initialization for module {} with moduleInfo: {}", moduleInfo.name(), moduleInfo.description());
        }

        if (StringUtils.isBlank(note)) {
            note = "Document created by batch process.";
        } else if (note.length() <= 10) {
            note = "Document created by batch process.  " + note;
        }

        if (restoring && tagFormFragment != null && tagEditorFragment != null) {
            tagsUpdated();
        }

        if (collection != null) {
            Community[] communities = collection.getCommunities();
            request.setAttribute("community", communities[0]);
            EditCommunitiesServlet.storeAuthorizeAttributeCollectionEdit(context, request, collection);
        }

        if (callee == Entrypoints.sysArrayCopy) {
            Operand src = Call.getParam(state.getCallInstruction(), 0);
            return src.getType() != TypeReference.JavaLangObject;
        }

        if ("true".equalsIgnoreCase(forceFullstandigtNamn)) {
            answer.getLakarutlatande().getPatient().setFullstandigtNamn("---");
        }

        if (match == null && pkgId != null && pkgId.endsWith("-" + UpdateManager.STUDIO_SNAPSHOT_VERSION)) {
            match = new Match<String>();
            match.object = pkgId.substring(0, pkgId.length() - ("-" + UpdateManager.STUDIO_SNAPSHOT_VERSION).length());
            match.version = UpdateManager.STUDIO_SNAPSHOT_VERSION;
        }

        if (resolve() != null && !incompleteCode) return ResolveResult.EMPTY_ARRAY;

        if (HiApplication.getMainActivityCount() > 1) {
            finish();
            return;
        }

        if (!formatted.equals(original)) {
            s.replace(0, s.length(), formatted);
        }

        if (tuplizerImpls == null) {
            return null;
        }

        if (mContext != null) {
            return mContext.getOpPackageName();
        }

        if (getIsApprovingOrReproving() || wFormStyle == FormStyle.TABLE) {
            if (getHasSelected()) {
                int xCount = 0;
                wDAO.setCurrentRowIndex(-1);
                for (Integer xRowIndex : wSelectedRowsIndexes) {
                    wDAO.setCurrentRowIndex(xRowIndex);
                    if (wFormStyle == FormStyle.TABLE) {
                        wDAO.setExecuteOnlyChangedValues(false);
                    }
                    pvBroadcastEvent(xE, false, false, false);
                    xCount += xE.getCommittedRowCount();
                    if (!xE.isOk()) {
                        break;
                    }
                }
                if (xCount < wSelectedRowsIndexes.size()) {
                    xE.setCommittedRowCount(0);
                    xE.setOk(false);
                    if (!wMessages.hasMessages()) {
                        addMessage("erroassinatura", MESSAGE_TYPE.ERROR, DBSFaces.getBundlePropertyValue("dbsfaces", "crudbean.msg.approvalAll"));
                    }
                } else {
                    xE.setCommittedRowCount(xCount);
                }
            }
        } else {
            pvBroadcastEvent(xE, false, false, false);
        }

        if (new File(directory, "CVS/Entries").isFile() && new File(directory, "CVS/Repository").isFile()) {
            final File adminDir = new File(directory, "CVS");
            for (Iterator i = clientServices.getEntries(directory); i.hasNext(); ) {
                Entry entry = (Entry) i.next();
                if (entry.getName() != null && entry.isUserFileToBeRemoved()) {
                    return false;
                }
            }
            deleteRecursively(adminDir);
            directory.delete();
            if (!client.exists(directory)) {
                client.removeEntry(directory);
            }
            return true;
        }

        if (this.hostnames == null) {
            final String[] hadoopHostnames = blockLocation.getHosts();
            this.hostnames = new String[hadoopHostnames.length];
            for (int i = 0; i < hadoopHostnames.length; ++i) {
                this.hostnames[i] = stripHostname(hadoopHostnames[i]);
            }
        }

        if (OAuthRealm.instance.getServiceBulderByPath(path).provider.equalsIgnoreCase("google")) {
            Google2Api api = new Google2Api();
            Service config = OAuthRealm.instance.getServiceBulderByPath(path);
            OAuthRequest req = new OAuthRequest(api.getAccessTokenVerb(), api.getAccessTokenEndpoint());
            req.addBodyParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
            req.addBodyParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
            req.addBodyParameter(OAuthConstants.CODE, verifier.getValue());
            req.addBodyParameter(OAuthConstants.REDIRECT_URI, config.getReturnURL());
            req.addBodyParameter("grant_type", "authorization_code");
            String responce = req.send().getBody();
            JSONTokener tokener = new JSONTokener(responce);
            try {
                JSONObject root = new JSONObject(tokener);
                String access_token = root.getString("access_token");
                String token = OAuthEncoder.decode(access_token);
                accessToken = new Token(token, "", responce);
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } else accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);

        if (UIManager.getLookAndFeel().getName().equals("CDE/Motif") && index == -1) {
            return l;
        }

        if (!TextUtils.isEmpty(mMdn)) {
            int phoneId = mParentApp.getUiccCard().getPhoneId();
            int[] subIds = SubscriptionController.getInstance().getSubId(phoneId);
            if (subIds != null) {
                log("Calling setDisplayNumber for subId and number " + subIds[0] + " and " + mMdn);
                SubscriptionManager.from(mContext).setDisplayNumber(mMdn, subIds[0]);
            } else {
                log("Cannot call setDisplayNumber: invalid subId");
            }
        }

        if (location == null || location.length() == 0) {
            String time_zone = map.has("time_zone") && map.get("time_zone") != JSONObject.NULL ? (String) map.get("time_zone") : null;
            if (time_zone != null && time_zone.length() > 0) {
                GeoMark loc = DAO.geoNames.analyse(time_zone, null, 5, "");
                if (loc != null && loc.getNames().contains(time_zone)) {
                    location = time_zone;
                    map.put("location", location);
                }
            }
        }

        if (genericTypes.length < constructor.getParameterTypes().length) {
            genericTypes = new Type[constructor.getParameterTypes().length];
            genericTypes[0] = constructor.getParameterTypes()[0];
            for (int i = 0; i < constructor.getGenericParameterTypes().length; ++i) {
                genericTypes[i + 1] = constructor.getGenericParameterTypes()[i];
            }
        }

        if (menuContainer == null) {
            menuContainer = findContainerById(pageChildren, SPACE_MENU);
        }

        if (shouldAdvance) {
            this.hasNext = advance();
            this.shouldAdvance = false;
        }

        if (concoction.getCount() > 1) {
            return 0;
        }

        if ((constraint.getRigidBodyA().getIslandTag() >= 0) && (constraint.getRigidBodyA().getCompanionId() >= 0)) {
            tmpSolverBodyPool.getQuick(constraint.getRigidBodyA().getCompanionId()).writebackVelocity();
        }

        if (!isValidStateTransition(requestStages, oldSchState, newState, sch)) {
            String error = "Invalid transition for" + " servicecomponenthost" + ", clusterName=" + cluster.getClusterName() + ", clusterId=" + cluster.getClusterId() + ", serviceName=" + sch.getServiceName() + ", componentName=" + sch.getServiceComponentName() + ", hostname=" + sch.getHostName() + ", currentState=" + oldSchState + ", newDesiredState=" + newState;
            StackId sid = service.getDesiredStackId();
            if (ambariMetaInfo.getComponent(sid.getStackName(), sid.getStackVersion(), sc.getServiceName(), sch.getServiceComponentName()).isMaster()) {
                throw new IllegalArgumentException(error);
            } else {
                LOG.warn("Ignoring: " + error);
                continue;
            }
        }

        if (typeName != null && NamePredicate.STRING.test(typeName)) {
            return false;
        }

        if (doc.getNamespaceURI() != null && doc.getPrefix() == null) {
            factory.setNamespaceAware(false);
            builder = factory.newDocumentBuilder();
            doc = builder.parse(IOUtils.toInputStream(contents, StandardCharsets.UTF_8));
        }

        if (parameters.getId().startsWith(ID_PLAYLIST_PREFIX)) {
            return response;
        }

        if (e.getMessage().contains("416") || (e instanceof EOFException)) {
            return n;
        } else {
            throw e;
        }

        if (expScore) {
            scores[i][j] = Math.exp(scores[i][j]);
        }

        if (getVm().getOrigin() == OriginType.KVM && getActionState() == CommandActionState.EXECUTE && getStorageDomain() != null && getStorageDomain().getStorageType().isBlockDomain()) {
            getVm().getImages().forEach(image -> image.setActualSizeInBytes(image.getSize()));
        }

        if (e.getMessage().contains("416") || (e instanceof EOFException)) {
            if (n == 0) {
                return -1;
            } else {
                position += n;
                contentLength = position;
                return n;
            }
        } else {
            throw e;
        }

        if (runner == null) {
            runner = runnerFactory.newPlatformNativeApplicationRunner(log);
            runner.setExecutablePath(configuration.getRequiredPropertyString(CONFIGURATION_PROPERTY_MUSIC_PLAYER_EXECUTABLE));
            runner.parseCommandArguments(MessageFormat.format(configuration.getRequiredPropertyString(CONFIGURATION_PROPERTY_MUSIC_PLAYER_EXECUTABLE_FLAGS), track.getFile().getAbsolutePath()));
            runner.startup();
        }

        if (!ignoreC3 && (game != null)) {
            xbv += getExtraC3BV((int) Math.round(finalBV));
        }

        if (form instanceof KualiForm && StringUtils.isNotEmpty(((KualiForm) form).getAnchor())) {
            parameters.put(BCConstants.RETURN_ANCHOR, ((KualiForm) form).getAnchor());
        }

        if (element instanceof PsiExpression) {
            processExpression((PsiExpression) element, occurence, variable);
        } else {
        }

        if (this.octets != null) {
            sb.append(" #");
            sb.append(Hex.toHexString(this.octets));
        } else {
            sb.append(" #null");
        }

        if (methodElement == getFirstChild()) {
            return PerlPackageUtil.getContextPackageName(this);
        }

        if (getById(typeId) != null) {
            return getById(typeId);
        }

        if (myLocSwitch != null) {
            myLocSwitch.setChecked(followMyLocation);
            if (followMyLocation) {
                myLocationInMiddle(Sensors.getInstance().currentGeo());
            }
        }

        if (tos.length == 0) {
            builder.addTextBody(String.format(PARAM_TO, 0), email.getFrom(), ContentType.create(TEXT_PLAIN, UTF_8));
        }

        if ((methodFlags & FLAG_INSERTED) > 0) super.inserted(entities);

        if (element.getClass().getName().equals(ConnectWizardPage.SDR_ROOT_CLASS)) {
            return false;
        } else if (element instanceof ScaProvidesPort) {
            return false;
        } else if (element instanceof ScaFileStore) {
            return false;
        } else if (element instanceof ScaWaveformFactory) {
            return false;
        } else if (element instanceof ScaWaveformFactoriesContainerItemProvider) {
            return false;
        } else if (element instanceof ScaEventChannelsContainerItemProvider) {
            return false;
        } else if (element instanceof ScaEventChannel) {
            return false;
        }

        if (this.initCount == -1) {
            this.initCount = -2;
            double dialogX = (Double) ReflectionLoader.call("getLayoutX", root);
            dialogX = dialogX == 0.0 ? w / 2.0 - dialogWidth / 2.0 : dialogX;
            double dialogY = (Double) ReflectionLoader.call("getLayoutY", root);
            dialogY = dialogY == 0.0 ? h / 2.0 - dialogHeight / 2.0 : dialogY;
            ReflectionLoader.call("relocate", root, double.class, (int) (dialogX), double.class, (int) (dialogY));
        }

        if (Matcher.matchImpl(GrammarsEntityDescriptorEnum.BySize, splitter)) {
            Appendable oldAppendable = appendable;
            StringBuilder sb;
            appendable = sb = new StringBuilder();
            entity.getRule().accept(this);
            appendable = oldAppendable;
            int size = ((BySize) splitter).getValue();
            for (int i = sb.length(); i < size; i++) sb.append(' ');
            append(sb.toString());
        } else super.visit(entity);

        if (!isExtension && (elem instanceof ElemLiteralResult)) {
            isExtension = ((ElemLiteralResult) elem).containsExtensionElementURI(uri);
            if (isExtension) {
                elem = new ElemExtensionCall();
                elem.setLocaterInfo(handler.getLocator());
                elem.setPrefixes(handler.getNamespaceSupport());
                ((ElemLiteralResult) elem).setNamespace(uri);
                ((ElemLiteralResult) elem).setLocalName(localName);
                ((ElemLiteralResult) elem).setRawName(rawName);
                setPropertiesFromAttributes(handler, rawName, attributes, elem);
            }
        }

        if (isVersion()) {
            ClassMapping cm = (ClassMapping) ((FieldMetaData) this).getDefiningMetaData();
            return cm.getVersion().getColumns();
        } else return _val.getColumns();

        if (indicadorRoteiroEmpresa.equals(ConstantesSistema.SIM)) {
            processarMovimentoRoteiroEmpresaPorRoteiroEmpresa(colecaoRoteirosEmpresa, anoMesFaturamento, faturamentoGrupo, sistemaParametro, idUnidadeIniciada, idFuncionalidadeIniciada);
        } else {
            processarMovimentoRoteiroEmpresaPorRota(colecaoRotas, anoMesFaturamento, faturamentoGrupo, sistemaParametro, idUnidadeIniciada, idFuncionalidadeIniciada);
        }

        if (isReadResumed() && next.getClass().getSimpleName().startsWith("Jsse")) {
            wakeupReads();
        }

        if ("carbon".equals(SWT.getPlatform())) {
            Rectangle trim = canvas.computeTrim(0, 0, 0, 0);
            trim.width = 0 - trim.x * 2;
            trim.height = 0 - trim.y * 2;
            return trim;
        }

        if (transport == BluetoothDevice.TRANSPORT_LE && !connected) {
            if (mHandler.hasMessages(MSG_PAUSE_POLLING)) {
                mHandler.removeMessages(MSG_PAUSE_POLLING);
            }
            mNfcAdapter.resumePolling();
        }

        if (w == (int) w) {
            getCOSObject().setInt("W", (int) w);
        } else {
            getCOSObject().setFloat("W", w);
        }

        if (ProxySelector.getDefault() == null) {
            ProxySelector.setDefault(new ProxySelector() {
                private final List<Proxy> DIRECT_CONNECTION = Collections.unmodifiableList(Collections.singletonList(Proxy.NO_PROXY));

                public void connectFailed(URI arg0, SocketAddress arg1, IOException arg2) {
                }

                public List<Proxy> select(URI uri) {
                    return DIRECT_CONNECTION;
                }
            });
        }

        if (var.isBleedingFunction() || var.isCatch()) {
            continue;
        }

        if (resources.isEmpty()) {
            return true;
        }

        if (request.baseQuery.contains("csv://")) {
            conf.set(MacroBaseConf.CSV_INPUT_FILE, request.baseQuery.replace("csv://", ""));
            conf.set(MacroBaseConf.DATA_LOADER_TYPE, MacroBaseConf.DataIngesterType.CSV_LOADER);
        }

        if (this instanceof HeadlessToolkit) {
            ((HeadlessToolkit) this).getUnderlyingToolkit().notifyAWTEventListeners(theEvent);
            return;
        }

        if (pageInfo.getExtends(false) == null || POOL_TAGS_WITH_EXTENDS) {
            isPoolingEnabled = ctxt.getOptions().isPoolingEnabled();
        } else {
            isPoolingEnabled = false;
        }

        if ((certificates == null) && (m_getCodeSigners != null)) {
            try {
                Object[] signers = (Object[]) m_getCodeSigners.invoke(entry, null);
                if (signers != null) {
                    List certChains = new ArrayList();
                    for (int i = 0; i < signers.length; i++) {
                        Object path = m_getSignerCertPath.invoke(signers[i], null);
                        certChains.addAll((List) m_getCertificates.invoke(path, null));
                    }
                    certificates = (Certificate[]) certChains.toArray(new Certificate[certChains.size()]);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (unclippedMotorImpulse > 0.0f) {
            clippedMotorImpulse = unclippedMotorImpulse > maxMotorForce ? maxMotorForce : unclippedMotorImpulse;
        } else {
            clippedMotorImpulse = unclippedMotorImpulse < -maxMotorForce ? -maxMotorForce : unclippedMotorImpulse;
        }

        if (results.get(CTX_ATTR_RESULTS).size() > 0) {
            modifySource(results.get(CTX_ATTR_RESULTS).get(0).getSource());
        } else if (results.get(CTX_ENTITY_RESULTS).size() > 0) {
            modifySource(results.get(CTX_ENTITY_RESULTS).get(0).getSource());
        } else if (results.get(CTX_ASSO_RESULTS).size() > 0) {
            modifySource(results.get(CTX_ASSO_RESULTS).get(0).getSource());
        }

        if (super.teleport(to.getY() == to.getFloorY() ? to.add(0, 0.00001, 0) : to, null)) {
            this.removeAllWindows();
            this.teleportPosition = new Vector3(this.x, this.y, this.z);
            this.forceMovement = this.teleportPosition;
            this.sendPosition(this, this.yaw, this.pitch, MovePlayerPacket.MODE_TELEPORT);
            this.checkTeleportPosition();
            this.resetFallDistance();
            this.nextChunkOrderRun = 0;
            this.newPosition = null;
            this.getDummyBossBars().values().forEach(DummyBossBar::reshow);
            this.getLevel().sendWeather(this);
            this.getLevel().sendTime(this);
            return true;
        }

        if (requestedHostname.equals("localhost")) {
            hostName = "localhost";
        }

        if (emulateCSV && cellValue == 0.0 && formatStr.contains("#") && !formatStr.contains("0")) {
            formatStr = formatStr.replaceAll("#", "");
        }

        if (getGlobalVisibleRect(GlobalRect)) {
            if (parent == null) {
                parent = (View) getParent();
            }
            if (parent != null) {
                return parent.isPressed();
            }
        }

        if (!input.exists()) {
            uri = LinkController.toRelativeURI(map.getFile(), input, LinkController.LINK_RELATIVE_TO_MINDMAP);
            if (uri == null || !"http".equals(uri.getScheme())) {
                UITools.errorMessage(TextUtils.format("file_not_found", input.toString()));
                return;
            }
        } else if (LinkController.getLinkType() != LinkController.LINK_ABSOLUTE) {
            uri = LinkController.toLinkTypeDependantURI(map.getFile(), input);
        }

        if (start == 0 || start < -1) {
            throw new InvalidArgumentException("start must be -1 or a location in the string to start");
        }

        if (UtilNBT.getItemStackNBT(stack).hasKey(NBT_SPELLCURRENT) == false) {
            if (SpellRegistry.getSpellbook(stack).size() == 0) {
                return 0;
            }
            return SpellRegistry.getSpellbook(stack).get(0).getID();
        }

        if (value == this) {
            field.rollback(null);
        } else {
            field.rollback(value);
        }

        if (v.derivedFrom().size() == 0) stream.print(" extends org.omg.CORBA.portable.ValueBase");
        else {
            SymtabEntry parent;
            for (int i = 0; i < v.derivedFrom().size(); i++) {
                if (i == 0) stream.print(" extends ");
                else stream.print(", ");
                parent = (SymtabEntry) v.derivedFrom().elementAt(i);
                stream.print(Util.javaName(parent));
            }
        }

        if (entry.getKey() != null && !entry.getKey().startsWith("/Earth sciences/Geography/Locations/")) {
            results.put(entry.getKey(), entry.getValue());
        }

        if (pyResult instanceof PyLong || pyResult instanceof PyInteger) return pyResult.__tojava__(Long.class);

        if (node == pointTo) {
            pointTo = lenInstruction;
        }

        if (request.getParameter("clinic.id") != null && request.getParameter("clinic.id").length() > 0 && clinic.getId() == null) {
            clinic.setId(Integer.parseInt(request.getParameter("clinic.id")));
        }

        if (recps.isEmpty()) {
            return;
        }

        if (addr.getAddress().length <= Ints.BYTES) {
            peers.add(new Peer(addr));
        }

        if (GXT.isGecko) {
            El e = el().selectNode(".x-window-bwrap");
            if (e != null) {
                e.dom.getStyle().setProperty("overflow", "auto");
                e.dom.getStyle().setProperty("position", "static");
            }
        }

        if (targetValue instanceof SAMReaderBuilder) {
            SAMReaderBuilder builder = (SAMReaderBuilder) targetValue;
            builder.setValidationStringency(strictnessLevel);
            targetValue = builder.build();
        }

        if (conf.getWriteType() == AcidUtils.Operation.NOT_ACID || conf.isMmTable()) {
            Path outPath = fsp.outPaths[filesIdx];
            if (conf.isMmTable() && !FileUtils.mkdir(fs, outPath.getParent(), hconf)) {
                LOG.warn("Unable to create directory with inheritPerms: " + outPath);
            }
            fsp.outWriters[filesIdx] = HiveFileFormatUtils.getHiveRecordWriter(jc, conf.getTableInfo(), outputClass, conf, outPath, reporter);
            statsFromRecordWriter[filesIdx] = fsp.outWriters[filesIdx] instanceof StatsProvidingRecordWriter;
        } else if (conf.getWriteType() == AcidUtils.Operation.INSERT) {
            ObjectInspector inspector = bDynParts ? subSetOI : outputObjInspector;
            int acidBucketNum = Integer.parseInt(Utilities.getTaskIdFromFilename(taskId));
            fsp.updaters[filesIdx] = HiveFileFormatUtils.getAcidRecordUpdater(jc, conf.getTableInfo(), acidBucketNum, conf, fsp.outPaths[filesIdx], inspector, reporter, -1);
        }

        if (!firstErrorRef.isNull()) {
            return new ValidationInfo(FlexBundle.message("can.not.package.bc", bc.getName(), firstErrorRef.get()));
        }

        if (mState.isPreLayout()) {
            holder = getChangedScrapViewForPosition(position);
            fromScrapOrHiddenOrCache = holder != null;
        }

        if (m_progressDialog == null) {
            m_progressDialog = new ProgressDialog(getActivity());
            m_progressDialog.setMessage(getString(R.string.message_computing));
            m_progressDialog.setIndeterminate(true);
            m_progressDialog.setCancelable(false);
            m_progressDialog.show();
        }

        if (ks != null) {
            if (ks.getKeyCode() == KeyEvent.VK_DELETE) {
                if (OSUtils.isOSX()) {
                    ks = KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, ks.getModifiers());
                }
            }
        }

        if (m_aLastModification != null) {
            final LocalDateTime aURLLastModified = aLastURL.getLastModificationDateTime();
            if (m_aLastModification.equals(aURLLastModified)) {
                m_aLastModification = m_aPrevLastModification;
            }
        }

        if (clockSeqAndNode == 0) throw new RuntimeException("singleton instantiation is misplaced.");

        if (res.first != null && res.first.getType() != TYPE_4BYTE_ABGR) {
            BufferedImage img = new BufferedImage(res.first.getWidth(), res.first.getHeight(), TYPE_4BYTE_ABGR);
            Graphics2D g = img.createGraphics();
            g.drawImage(res.first, 0, 0, null);
            g.dispose();
            res.first = img;
        }

        if (ver1 == null) {
            return (ver2 == null) ? 0 : -1;
        } else if (ver2 == null) {
            return 1;
        }

        if (deviceId == 0) {
            return "history_" + dashId + "_";
        }

        if (downloadLink.getStringProperty("refURL", null) != null) {
            br.getHeaders().put("Referer", downloadLink.getStringProperty("refURL", null));
        }

        if (key.equals(entry.getKey())) {
            stolenEntryData = (Data) ((LazyMapEntry) entry).getValueData();
        }

        if (!empty) mView.getControl().handleOwnChatStateEvent(chat, ChatState.composing);

        if (!inValidate(fileInfo[0]) && fileInfo[0].endsWith("&#133;") && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.warning("filename length is larrrge");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
        } else if (inValidate(fileInfo[0]) && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.info("Failed to find filename, trying getFnameViaAbuseLink");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
        }

        if (crs != null && bb.getCRSURI() != null && !crs.equals(bb.getCRSURI())) {
            String msg = "Cannot check for BoundingBox intersections since the " + "passed BoundingBox is expressed in a different CRS. " + "My CRS: " + crs.toASCIIString() + " " + "Passed CRS: " + bb.getCRSURI().toASCIIString();
            log.error(msg);
            throw new WcsException(msg, WcsException.INVALID_PARAMETER_VALUE, "ows:BoundingBox/@crs");
        }

        if (event.keyCode == SWT.INSERT) {
            toggleInsertMode();
            return true;
        } else if (event.character == ' ' && !Tools.TEXTUAL.isActive(getViewer())) {
            processSelect(event);
            return true;
        } else if (acceptConnection(event) && !Tools.TEXTUAL.isActive(getViewer())) {
            navigateConnections(event);
            return true;
        } else if (acceptLeaveConnection(event) && !Tools.TEXTUAL.isActive(getViewer())) {
            navigateOutOfConnection(event);
            return true;
        }

        if (lp != null && lp.viewType != ITEM_VIEW_TYPE_HEADER_OR_FOOTER) {
            activeViews[i] = child;
        }

        if (visible) dataGrid.onResize();

        if (behaviorFunction.info != null && behaviorFunction.info.getVisibility() == Visibility.PROTECTED) {
            info.overwriteVisibility(Visibility.PUBLIC);
        }

        if (checkCacheValid(box)) {
            return;
        }

        if (source.equals("GRANT_NUMBER")) return "grant_number";

        if (ri instanceof CollectionResult<?>) {
            final Collection<String> hdr = ((CollectionResult<?>) ri).getHeader();
            if (hdr != null) {
                for (String header : hdr) {
                    out.commentPrintLn(header);
                }
                out.flush();
            }
        }

        if (TypeUtil.getFieldInfo(c, ALTERNATIVE_IDENTIFIER) != null) {
            return ALTERNATIVE_IDENTIFIER;
        } else {
            return IDENTIFIER;
        }

        if (in == null || out == null) {
            return;
        }

        if ("eu.numberfour.n4js.runner.nodejs.NODEJS".equals(runnerDesc.getId())) {
            final boolean haveCustomNodeRuntimeEnvironment = hRuntimeEnvironments.findRuntimeEnvironmentProject(RuntimeEnvironment.NODEJS).isPresent();
            if (!haveCustomNodeRuntimeEnvironment) return true;
        }

        if (this instanceof HeadlessToolkit) {
            ((HeadlessToolkit) this).getUnderlyingToolkit().setDesktopProperty(name, newValue);
            return;
        }

        if (restrictionClass.isInstance(obj)) {
            instance = (C) obj;
        }

        if (hasMacTextFieldBorder(c)) {
            Insets borderInsets = layoutAndBorder.getRealBorderInsets();
            borderInsets.left -= MAC_MARGIN.left;
            int height = c.getHeight() - borderInsets.bottom - borderInsets.top + MAC_MARGIN.bottom + MAC_MARGIN.top;
            int width = c.getWidth() - borderInsets.left - borderInsets.right + MAC_MARGIN.right;
            g.clipRect(borderInsets.left, borderInsets.top, width, height);
        }

        if (speeds == null) {
            return -1;
        }

        if (PluginManagerCore.UNIT_TEST_PLUGIN.equals(getPluginId())) {
            final List<File> result = new ArrayList<>();
            String testClasspath = System.getProperty("consulo.test.classpath");
            if (!StringUtil.isEmpty(testClasspath)) {
                List<String> paths = StringUtil.split(testClasspath, ";");
                for (String path : paths) {
                    result.add(new File(path));
                }
            }
            return result;
        }

        if (rawKvp.containsKey("acceptVersions")) {
            OWS11AcceptVersionsKvpParser avp = new OWS11AcceptVersionsKvpParser();
            AcceptVersionsType avt = (AcceptVersionsType) avp.parse((String) rawKvp.get("acceptVersions"));
            kvp.put("acceptVersions", avt);
        }

        if (posteriori instanceof LazyBinaryArray) {
            posteriori = ((LazyBinaryArray) posteriori).getList();
        }

        if (!pkg.equals("com.android.providers.downloads") || Log.isLoggable("DownloadManager", Log.VERBOSE)) {
            EventLog.writeEvent(EventLogTags.NOTIFICATION_ENQUEUE, pkg, id, tag, notification.toString());
        }

        if (!(protocol instanceof PlayProtocol)) {
            assertThat("Did not test outbound classes: " + outboundSet, outboundSet.isEmpty(), is(true));
        }

        if (option == Option.IF_GENERATION_MATCH) {
            generationMatch = (Long) options.get(option);
        }

        if (visited) {
            return;
        }

        if (isInBadPackage(f.getType())) {
            return;
        }

        if (b || super.isAutoCommit()) {
            super.setAutoCommit(b);
        }

        if (permissionType != null) {
            SimpleCachedLDAPAuthorizationMap.this.objectRemoved(evt, destinationType, permissionType);
        }

        if (ensureSameSize) {
            GC tmpGC = new GC(device);
            Font tmpFont = new Font(device, fontData);
            tmpGC.setFont(tmpFont);
            if (tmpGC.textExtent(Az).x > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                while (tmpGC.textExtent(Az).x > DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                    tmpFont.dispose();
                    height--;
                    fontData.setHeight(height);
                    tmpFont = new Font(device, fontData);
                    tmpGC.setFont(tmpFont);
                }
            } else if (tmpGC.textExtent(Az).x < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                while (tmpGC.textExtent(Az).x < DUMMY_PANEL.getFontMetrics(font).stringWidth(Az)) {
                    tmpFont.dispose();
                    height++;
                    fontData.setHeight(height);
                    tmpFont = new Font(device, fontData);
                    tmpGC.setFont(tmpFont);
                }
            }
            tmpFont.dispose();
            tmpGC.dispose();
        }

        if (Util.isAwtAvailable() && EventQueue.isDispatchThread()) {
            if (isFiner()) {
                logFiner("Not trying to refresh account of " + node + ". Running in EDT thread");
            }
            return null;
        }

        if ((arg1 instanceof String) || (arg1 == null)) {
            this.name = (String) arg1;
            this.exposedName = this.name;
            setExpression((ValueNode) arg2);
        } else if (arg1 instanceof ColumnReference) {
            ColumnReference ref = (ColumnReference) arg1;
            this.name = ref.getColumnName();
            this.exposedName = ref.getColumnName();
            this.reference = ref;
            setExpression((ValueNode) arg2);
        } else if (arg1 instanceof ColumnDescriptor) {
            ColumnDescriptor coldes = (ColumnDescriptor) arg1;
            this.name = coldes.getColumnName();
            this.exposedName = name;
            setType(coldes.getType());
            this.columnDescriptor = coldes;
            setExpression((ValueNode) arg2);
            this.autoincrement = coldes.isAutoincrement();
        } else {
            setType((DataTypeDescriptor) arg1);
            setExpression((ValueNode) arg2);
            if (arg2 instanceof ColumnReference) {
                reference = (ColumnReference) arg2;
            }
        }

        if (EX_DB_ALL.contains(hiveOp)) {
            SimpleSemanticAnalyzer analyzer = new SimpleSemanticAnalyzer(hiveOp, command);
            currDatabase = analyzer.getCurrentDb();
            List<DBModelAuthorizable> externalAuthorizableHierarchy = new ArrayList<DBModelAuthorizable>();
            externalAuthorizableHierarchy.add(hiveAuthzBinding.getAuthServer());
            externalAuthorizableHierarchy.add(new Database(currDatabase));
            if (EX_DB_INPUT.contains(hiveOp)) {
                inputHierarchyList.add(externalAuthorizableHierarchy);
            } else {
                outputHierarchyList.add(externalAuthorizableHierarchy);
            }
        }

        if (generateUID) {
            generateUID();
        } else {
            setUID(sourceSplit.getUID());
        }

        if (urlValidator.isValid(url) || StringUtils.defaultString(url).startsWith("file://")) {
            try {
                licenseUrl = new URL(url);
            } catch (MalformedURLException e) {
                throw new MalformedURLException("The license url '" + url + "' seems to be invalid: " + e.getMessage());
            }
        } else {
            File licenseFile = new File(project.getBasedir(), url);
            if (!licenseFile.exists()) {
                licenseFile = new File(url);
            }
            if (!licenseFile.exists()) {
                throw new IOException("Maven can't find the file '" + licenseFile + "' on the system.");
            }
            try {
                licenseUrl = licenseFile.toURI().toURL();
            } catch (MalformedURLException e) {
                throw new MalformedURLException("The license url '" + url + "' seems to be invalid: " + e.getMessage());
            }
        }

        if (!CoordinateOperations.wrapAroundChanges(inputCoverageCRS2D, gg.getCoordinateReferenceSystem().getCoordinateSystem()).isEmpty()) {
            interpolation = InterpolationCase.NEIGHBOR;
        }

        if (e.getMessage() != null && e.getMessage().contains("Pool empty. Unable to fetch a connection")) {
            log.warn("No connections available in the connection pool.  " + e.getMessage());
        } else {
            handleFailure(e);
        }

        if (atrstrRevisadoPor == null) atrstrRevisadoPor = "";

        if (feature.getUserData().get("xlink:id") != null) {
            return Collections.EMPTY_LIST;
        }

        if (method != null) {
            try {
                method.invoke(null, parent, childs);
            } catch (Exception e) {
            }
        }

        if (project.getTreeItem().isDisposed()) {
            project = explorer.getOpenShift3Connection(connection).getProject();
        }

        if (!"Nuxeo".equals(context.getProperty(Constants.FRAMEWORK_VENDOR))) {
            httpServiceTracker = new ServiceTracker(context, HttpService.class.getName(), this);
            httpServiceTracker.open();
        }

        if (oldValue == null) {
            System.clearProperty("hadoop.home.dir");
        } else {
            System.setProperty("hadoop.home.dir", oldValue);
        }

        if (query instanceof QueryElement) {
            forceOrderBy((QueryElement<?>) query);
        }

        if (serviceId.equals("MasterObjectProvider")) {
            ObjectProvider contribution = new ObjectProvider() {
                @Override
                public <T> T provide(Class<T> objectType, AnnotationProvider annotationProvider, ObjectLocator locator) {
                    return findServiceByMarkerAndType(objectType, annotationProvider, null);
                }
            };
            orderer.add("ServiceByMarker", (T) contribution);
        }

        if (logger.isDebugEnabled())
            logger.debug("!!! TODO: implement handleItemCreated() !!!" + item + " DATA=" + item.getData().toString());

        if (pratilipi == null || UxModeFilter.isAndroidApp() || pratilipi.getContentType() == PratilipiContentType.IMAGE) {
            for (PratilipiContentDoc.Pagelet pageletDoc : pageDoc.getPageletList()) {
                if (pageletDoc.getType() == PageletType.HTML) {
                    pageletDoc.setType(PageletType.TEXT);
                    pageletDoc.setData(HtmlUtil.toPlainText(pageletDoc.getDataAsString()));
                } else if (pageletDoc.getType() == PageletType.BLOCK_QUOTE) {
                    pageletDoc.setData(HtmlUtil.toPlainText(pageletDoc.getDataAsString()));
                }
            }
        } else {
            String html = "";
            for (PratilipiContentDoc.Pagelet pageletDoc : pageDoc.getPageletList()) {
                if ((pageletDoc.getType() == PageletType.TEXT || pageletDoc.getType() == PageletType.HTML) && pageletDoc.getAlignment() == null)
                    html += "<p>" + pageletDoc.getDataAsString() + "</p>";
                else if ((pageletDoc.getType() == PageletType.TEXT || pageletDoc.getType() == PageletType.HTML) && pageletDoc.getAlignment() != null)
                    html += "<p style=\"text-align:" + pageletDoc.getAlignment() + "\">" + pageletDoc.getDataAsString() + "</p>";
                else if (pageletDoc.getType() == PageletType.BLOCK_QUOTE)
                    html += "<blockquote>" + pageletDoc.getDataAsString() + "</blockquote>";
                else if (pageletDoc.getType() == PageletType.IMAGE)
                    html += _processImagePagelet(pratilipi.getId(), pageletDoc.getData());
            }
            pageDoc.setHtml(html);
            pageDoc.deleteAllPagelets();
        }

        if (!leftType.isNoType() && !rightType.isSubtypeOf(leftType)) {
            JSType ownerType = getJSType(owner);
            if (ownerType.isFunctionPrototypeType()) {
                FunctionType ownerFn = ownerType.toObjectType().getOwnerFunction();
                if (ownerFn.isInterface() && rightType.isFunctionType() && leftType.isFunctionType()) {
                    return true;
                }
            }
            mismatch(t, n, "assignment to property " + propName + " of " + typeRegistry.getReadableTypeName(owner), rightType, leftType);
            return false;
        } else if (!leftType.isNoType() && !rightType.isSubtypeWithoutStructuralTyping(leftType)) {
            TypeMismatch.recordImplicitInterfaceUses(this.implicitInterfaceUses, n, rightType, leftType);
            TypeMismatch.recordImplicitUseOfNativeObject(this.mismatches, n, rightType, leftType);
        }

        if (imageMatrix.channels() == 3) {
            for (int k = 0; k < data.length; k += 3) {
                byte temp = data[k];
                data[k] = data[k + 2];
                data[k + 2] = temp;
            }
        }

        if (this.basicPlanAgentDelegate.getCurrentLinkIndex() >= routeLinkIdsSize && this.getCurrentLinkId().equals(this.getDestinationLinkId())) {
            return true;
        }

        if (tx.isActive()) {
            tx.rollback();
        }

        if (dataTypeName.equalsIgnoreCase("Spare")) {
            return ProductData.TYPE_INT8;
        }

        if (httpSessionId != null && httpSessionId.equals(callerHttpSessionId)) {
            final Map<String, BrowserPage> browserPages = httpSessionIdBrowserPages.get(httpSessionId);
            if (browserPages != null) {
                final BrowserPage removedBrowserPage = browserPages.remove(instanceId);
                if (removedBrowserPage != null) {
                    try {
                        removedBrowserPage.removedFromContext();
                    } catch (final Throwable e) {
                        if (LOGGER.isLoggable(Level.WARNING)) {
                            LOGGER.log(Level.WARNING, "The overridden method BrowserPage#removedFromContext threw an exception.", e);
                        }
                    }
                }
            }
            instanceIdBrowserPage.remove(instanceId);
        } else {
            if (LOGGER.isLoggable(Level.WARNING)) {
                LOGGER.warning("The callerInstanceId " + callerInstanceId + " tried to remove instanceId " + instanceId + " BrowserPageContext");
            }
        }

        if (element instanceof CompositePackagingElement) {
            final CompositePackagingElement<?> compositeElement = (CompositePackagingElement<?>) element;
            if (firstName.equals(compositeElement.getName())) {
                result.addAll(findSourceFilesByOutputPath(compositeElement, tail, context, artifactType));
            }
        } else if (element instanceof FileCopyPackagingElement) {
            final FileCopyPackagingElement fileCopyElement = (FileCopyPackagingElement) element;
            if (firstName.equals(fileCopyElement.getOutputFileName()) && tail.isEmpty()) {
                ContainerUtil.addIfNotNull(result, fileCopyElement.findFile());
            }
        } else if (element instanceof DirectoryCopyPackagingElement || element instanceof ExtractedDirectoryPackagingElement) {
            final VirtualFile sourceRoot = ((FileOrDirectoryCopyPackagingElement<?>) element).findFile();
            if (sourceRoot != null) {
                ContainerUtil.addIfNotNull(result, sourceRoot.findFileByRelativePath(path));
            }
        } else if (element instanceof ModuleOutputPackagingElement) {
            final CompilerConfiguration compilerConfiguration = CompilerConfiguration.getInstance(context.getProject());
            for (VirtualFile sourceRoot : ((ModuleOutputPackagingElement) element).getSourceRoots(context)) {
                final VirtualFile sourceFile = sourceRoot.findFileByRelativePath(path);
                if (sourceFile != null && compilerConfiguration.isResourceFile(sourceFile)) {
                    result.add(sourceFile);
                }
            }
        }

        if (idCodigo10 != null && !idCodigo10.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo10, informarNaoEntregaDocumentosActionForm.getQtTentativas10(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento10(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (url == null || url.startsWith("name://")) {
            registry.put("/" + tmpPath, schemaResource);
        } else {
            registry.importResource(tmpPath, url, schemaResource);
        }

        if (this.jtaManager != jtaManager) {
            this.jtaManager = jtaManager;
        }

        if ((painter != null) || isNimbus()) {
            if (isOpaque()) {
                fakeTransparency = true;
                paintComponentWithPainter((Graphics2D) g);
                fakeTransparency = false;
            } else {
                paintPainter(g);
                super.paintComponent(g);
            }
        } else {
            super.paintComponent(g);
        }

        if (parentQName != null) {
            if (owner instanceof DotNetMemberOwner) {
                for (DotNetNamedElement dotNetNamedElement : ((DotNetMemberOwner) owner).getMembers()) {
                    if (dotNetNamedElement instanceof CSharpMethodDeclaration && ((CSharpMethodDeclaration) dotNetNamedElement).getParameters().length == 0 && name.equals(dotNetNamedElement.getName())) {
                        DotNetTypeRef typeRefForImplement = ((CSharpMethodDeclaration) dotNetNamedElement).getTypeRefForImplement();
                        if (DotNetTypeRefUtil.isVmQNameEqual(typeRefForImplement, owner, parentQName)) {
                            return (DotNetMethodDeclaration) GenericUnwrapTool.extract(dotNetNamedElement, extractor);
                        }
                    }
                }
            }
        }

        if (!tree.validRoot()) throw new RuntimeException("Roots are invalid");

        if (objectIdOnMove) {
            return;
        }

        if (DDTeleporter.cooldown > 0) {
            DDTeleporter.cooldown--;
        }

        if (shortform.startsWith("CHEBI:")) {
            return URI.create("http://www.ebi.ac.uk/chebi/searchId.do;?chebiId=" + shortform);
        }

        if (file.getPath().contains("/.trash/")) {
            return true;
        } else {
            return false;
        }

        if (paramPoint_0.compareTo(paramPoint_1) == 0) {
            continue;
        }

        if ("mobile".equals(validator) && value instanceof String && ((String) value).isEmpty()) {
            return null;
        }

        if (previousNumber == 2) {
            parts.add(referencesText.substring(2, matcher.start()));
        }

        if ((leituraAnormalidade.getDescricao() == null || leituraAnormalidade.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getDescricaoAbreviada() == null || leituraAnormalidade.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getIndicadorRelativoHidrometro() == 0) && (leituraAnormalidade.getIndicadorImovelSemHidrometro() == null || leituraAnormalidade.getIndicadorImovelSemHidrometro().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getIndicadorSistema() == null || leituraAnormalidade.getIndicadorSistema().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getIndicadorEmissaoOrdemServico() == 0) && (leituraAnormalidade.getLeituraAnormalidadeConsumoSemleitura() == null || leituraAnormalidade.getLeituraAnormalidadeConsumoSemleitura().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getLeituraAnormalidadeConsumoComleitura() == null || leituraAnormalidade.getLeituraAnormalidadeConsumoComleitura().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getLeituraAnormalidadeLeituraSemleitura() == null || leituraAnormalidade.getLeituraAnormalidadeLeituraSemleitura().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (leituraAnormalidade.getLeituraAnormalidadeLeituraComleitura() == null || leituraAnormalidade.getLeituraAnormalidadeLeituraComleitura().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (methodName.startsWith("<init>")) {
            Iterator<AbstractInsnNode> j = mn.instructions.iterator();
            boolean constructorInvoked = false;
            while (j.hasNext()) {
                AbstractInsnNode in = j.next();
                startID++;
                if (!constructorInvoked) {
                    if (in.getOpcode() == Opcodes.INVOKESPECIAL) {
                        MethodInsnNode cn = (MethodInsnNode) in;
                        Collection<String> superClasses = DependencyAnalysis.getInheritanceTree().getSuperclasses(className);
                        superClasses.add(className);
                        String classNameWithDots = ResourceList.getClassNameFromResourcePath(cn.owner);
                        if (superClasses.contains(classNameWithDots)) {
                            constructorInvoked = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        if ("rss_1.0".equals(feedType)) {
            feed.setImage(null);
        }

        if (modelAccessor instanceof IPropertyAccessor) {
            if (listener != null) {
                listener.clearCleanlyReadAccessProperties();
            }
        }

        if ("true".equalsIgnoreCase(forceFullstandigtNamn)) {
            question.getLakarutlatande().getPatient().setFullstandigtNamn("---");
        }

        if (!(p instanceof SPropertyAdapterById)) {
            return MetaIdFactory.INVALID_PROP_ID;
        }

        if (getBaseFeatureType().getTypeName().equals(featureType.getTypeName())) {
            return DecodeQualification.INTENDED;
        }

        if (tryToUseSourceAsAWorkaround()) {
            ended = true;
            break;
        }

        if (PlatformRegistry.SERVICE_NAME.equals(family_member[0])) {
            return this.agent.registryProxy;
        }

        if (model.hasDefined(DEFAULT_MDB_INSTANCE_POOL)) {
            EJB3SubsystemDefaultPoolWriteHandler.MDB_POOL.updatePoolService(context, model);
        }

        if (snmpModuleCompatibleMode) {
            if (limitingPort == 80) {
                limitingPort = 0;
            }
            if (listenPort == 80) {
                listenPort = 0;
            }
        }

        if (events != null)
            events.add(new Happening(this.event_number, this.leap ? IGridCalc.HappeningKind.LEAP : IGridCalc.HappeningKind.EXACT, this.extent, current, current - this.wait_start, this.original_wait));

        if (i == 0 || i == group.getChildren().size() - 2) {
            angle -= dtheta / 2;
        } else if (i == 2 || i == 4) {
            angle += dtheta / 4;
        } else if (i == 3) {
            angle += dtheta / 2;
        }

        if (auri == "http://www.w3.org/2001/XMLSchema-instance" && alocal == "nil") {
            String v = avalue.trim();
            if (v.equals("false") || v.equals("0")) continue;
        }

        if (properties.containsKey(CONFIG_CREATE_NAME_GSS_INIT) && Boolean.parseBoolean((String) properties.get(CONFIG_CREATE_NAME_GSS_INIT))) {
            try {
                gssManager.createName("dummy", GSSName.NT_USER_NAME, SPNEGO);
                httpSpnego.trace("createName workaround for native GSS initialization applied");
            } catch (GSSException e) {
                httpSpnego.trace("Exception while applying createName workaround for native GSS initialization", e);
            }
        }

        if (dtd != null && dtd.isNullable()) {
            String errorState = (getLanguageConnectionContext().getDataDictionary().checkVersion(DataDictionary.DD_VERSION_DERBY_10_4, null)) ? SQLState.LANG_ADD_PRIMARY_KEY_ON_NULL_COLS : SQLState.LANG_DB2_ADD_UNIQUE_OR_PRIMARY_KEY_ON_NULL_COLS;
            throw StandardException.newException(errorState, colName);
        }

        if (titles[i] > 10 && (titles[i] != oldduration || oldduration < 3600)) {
            DVDISOTitle dvd = new DVDISOTitle(file, i);
            addChild(dvd);
            oldduration = titles[i];
        }

        if (message == null) {
            message = Messages.getInstance().getErrorString("SoapHelper.ERROR_0001_UNKNOWN_ERROR");
        }

        if (!this.left.isNil()) {
            XmlElementContent left = (XmlElementContent) this.left;
            if (type == Type.SEQ && occur == Occur.ONCE && left.type == Type.ELEMENT && right.isNil()) {
                this.name = left.name;
                this.type = left.type;
                this.occur = left.occur;
                this.left = this.right;
            }
        }

        if (action == ServiceAction.POST && ServiceParameter.lastParameterIsName(parameters) && "notifications".equals(parameters.get(parameters.size() - 1).getName())) {
            return new ServiceRequest(this, action, "notifications", parameters, payload, returnsTree);
        }

        if (doSpecialProcessViewMappingFilter && "CmsProcessViewMapping".equals(entityName) && this.seenCmsProcessMappingIds.size() > 0) {
            List<EntityCondition> viewCondList = new ArrayList<>(this.seenCmsProcessMappingIds.size());
            for (String id : this.seenCmsProcessMappingIds) {
                viewCondList.add(EntityCondition.makeCondition("processMappingId", id));
            }
            condList.add(EntityCondition.makeCondition(viewCondList, EntityOperator.OR));
        }

        if (!indexName.startsWith("PRIMARY_KEY_")) {
            indexColumns.put(castUntainted(indexName), castUntainted(columnName));
        }

        if (idGrupos != null) {
            for (int i = 0; i < idGrupos.length; i++) {
                Integer idGrupo = idGrupos[i];
                Grupo grupo = new Grupo();
                grupo.setId(idGrupo);
                UsuarioGrupoPK pk = new UsuarioGrupoPK();
                pk.setGrupoId(grupo.getId());
                pk.setUsuarioId(usuario.getId());
                UsuarioGrupo usuarioGrupo = new UsuarioGrupo();
                usuarioGrupo.setGrupo(grupo);
                usuarioGrupo.setUsuario(usuario);
                usuarioGrupo.setComp_id(pk);
                usuarioGrupo.setUltimaAlteracao(new Date());
                try {
                    repositorioUtil.inserir(usuarioGrupo);
                } catch (ErroRepositorioException ex) {
                    sessionContext.setRollbackOnly();
                    throw new ControladorException("erro.sistema", ex);
                }
            }
        }

        if (false) {
            throw new IOException("Bogus exception");
        }

        if (object instanceof FlexoModelObject) {
            setCurrentEditedObjectAsModuleView((FlexoModelObject) object);
        }

        if (!isValidStateTransition(requestStages, oldSchState, newState, sch)) {
            String error = "Invalid transition for" + " servicecomponenthost" + ", clusterName=" + cluster.getClusterName() + ", clusterId=" + cluster.getClusterId() + ", serviceName=" + sch.getServiceName() + ", componentName=" + sch.getServiceComponentName() + ", hostname=" + sch.getHostName() + ", currentState=" + oldSchState + ", newDesiredState=" + newState;
            StackId sid = cluster.getDesiredStackVersion();
            if (ambariMetaInfo.getComponent(sid.getStackName(), sid.getStackVersion(), sc.getServiceName(), sch.getServiceComponentName()).isMaster()) {
                throw new AmbariException(error);
            } else {
                LOG.warn("Ignoring: " + error);
                continue;
            }
        }

        if (cause != e) {
            String msg = cause.getMessage();
            String rhinoPrefix = CannotRunGeogigOperationException.class.getName() + ": ";
            if (msg.startsWith(rhinoPrefix)) {
                msg = msg.substring(rhinoPrefix.length());
                if (-1 != msg.lastIndexOf('(')) {
                    msg = msg.substring(0, msg.lastIndexOf('('));
                }
            }
            msg += " (command aborted by .geogig/hooks/" + scriptFile.getName() + ")";
            throw new CannotRunGeogigOperationException(msg);
        } else {
            throw new CannotRunGeogigOperationException(String.format("Script %s threw an exception: '%s'", scriptFile, e.getMessage()), e);
        }

        if ("XYZABCIJKSF".contains(word.getLetter())) {
            value = renderingFormat.format(new BigDecimal(value));
        }

        if (javaVersion.startsWith("HP")) {
            StringTokenizer st = new StringTokenizer(javaVersion, ".");
            String tmp = st.nextToken();
            majorVersion = st.nextToken();
            if (majorVersion.equals("01")) majorVersion = "1";
            else if (majorVersion.equals("02")) majorVersion = "2";
            minorVersion = st.nextToken();
            if (minorVersion.startsWith("1")) minorVersion = "1";
            else if (minorVersion.startsWith("2")) minorVersion = "2";
            try {
                Integer imajor = new Integer(majorVersion);
                major = imajor.intValue();
                Integer iminor = new Integer(minorVersion);
                minor = iminor.intValue();
            } catch (NumberFormatException nfe2) {
                System.out.println("Could not parse version: " + nfe2);
            }
        } else {
            System.out.println("NumberFormatException thrown trying to parse the version. " + javaVersion);
            System.out.println("The test harness only handles the HP special case.");
        }

        if (xml instanceof XmlStringBuilderDoc) {
            CharSequence seq = ((XmlStringBuilderDoc<N, E, T>) xml).builder;
            builder.append(seq);
        } else {
            builder.append(xml.toString());
        }

        if (currStatus == OP_UNTESTED) {
            return;
        }

        if (LLDPUtil.handleLLDPFromSwitch(this, fvClassifier)) return;

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.AQUA)) {
            FontHelper.getHeight(commentText.getFont());
        }

        if (false) {
            if (Integer.valueOf(redhatReleaseX) >= 7) {
                log.info("Invoking the following suggestion to enable this rhel7 system to use rhn-client-tools https://bugzilla.redhat.com/show_bug.cgi?id=906875#c2 ");
                sshCommandRunner.runCommandAndWait("cp -n /usr/share/rhn/RHNS-CA-CERT /usr/share/rhn/RHN-ORG-TRUSTED-SSL-CERT");
            }
        }

        if (JpaHelper.isJpaProviderOpenJpa(getEntityManager()) || JpaHelper.isJpaProviderDataNucleus(getEntityManager())) {
            library.removeAllMedia();
        }

        if (reqVideo.getFilename().length() == 0 && reqVideo.getSecureFilename().length() == 0) {
            reqVideo.setSecureFilename(Security.createSecureFileName() + ".xx");
            VideoLocalServiceUtil.updateVideo(reqVideo);
        }

        if (committed) {
            bringDown();
            return;
        }

        if (getDimension() != source.getDimension()) {
            throw new RuntimeException("The two parameters don't have the same number of dimensions");
        }

        if (type1 == EXPRESSION_BODY_DEF) {
            if (type2 == STRING_LITERAL_EXPRESSION) {
                return addSingleSpaceIf(true);
            }
            TextRange range = node2.getTextRange();
            return Spacing.createDependentLFSpacing(1, 1, range, mySettings.KEEP_LINE_BREAKS, mySettings.KEEP_BLANK_LINES_IN_CODE);
        }

        if (StringUtils.isEmpty(sessionId)) return super.respond(new ArrayList<>(results.getData()));

        if (iSelection instanceof org.emftext.sdk.generatorconfig.resource.generatorconfig.ui.GeneratorconfigEObjectSelection) {
            final org.emftext.sdk.generatorconfig.resource.generatorconfig.ui.GeneratorconfigEObjectSelection selection = (org.emftext.sdk.generatorconfig.resource.generatorconfig.ui.GeneratorconfigEObjectSelection) iSelection;
            final org.eclipse.emf.ecore.EObject selectedObject = selection.getSelectedObject();
            if (containsGenProxy(selectedObject)) {
                return;
            }
        }

        if (names == null || names.length == 0) {
            return Collections.emptyList();
        } else if (names.length == 1) {
            return Collections.singletonList(names[0]);
        } else {
            return Arrays.asList(names);
        }

        if (nodes == null) {
            nodes = new NodeList() {
                @Override
                public int getLength() {
                    return 1;
                }

                @Override
                public Node item(int i) {
                    return null;
                }
            };
        }

        if (lastIsSlash && b == '\\') {
            lastIsSlash = false;
            super.write(b);
            sb.append((char) b);
            return;
        }

        if (m_numeric) {
            setEndsToLinear();
        }

        if ((colType == Integer.class) || (colType == Short.class) || (colType == Byte.class)) {
            header.addColumn(colName, 'N', Math.min(fieldLen, 10), 0);
        } else if (colType == Long.class) {
            header.addColumn(colName, 'N', Math.min(fieldLen, 19), 0);
        } else if ((colType == Double.class) || (colType == Float.class) || (colType == Number.class)) {
            int l = Math.min(fieldLen, 33);
            int d = Math.max(l - 2, 0);
            header.addColumn(colName, 'N', l, d);
        } else if (java.util.Date.class.isAssignableFrom(colType)) {
            header.addColumn(colName, 'D', fieldLen, 0);
        } else if (colType == Boolean.class) {
            header.addColumn(colName, 'L', 1, 0);
        } else if (CharSequence.class.isAssignableFrom(colType)) {
            header.addColumn(colName, 'C', Math.min(254, fieldLen), 0);
        } else if (Geometry.class.isAssignableFrom(colType)) {
            continue;
        } else {
            throw new IOException("Unable to write : " + colType.getName());
        }

        if (_logger.isLoggable(Level.INFO)) {
            _logger.log(Level.INFO, JMSLoggerInfo.ADDRESSLIST_JMSPROVIDER, new Object[]{addressList});
        }

        if (cameraClickScroll) {
            tmpVec2[0].set(cameraPosition).sub(cameraClickStart).nor();
            tmpVec2[1].set(cameraClickTarget).sub(cameraPosition).nor();
            if (tmpVec2[0].len() < WORLD_UNIT_INV_SCALE || tmpVec2[0].dot(tmpVec2[1]) > 0.0f) {
                cameraDirection.set(tmpVec2[1]).nor();
            } else {
                cameraClickScroll = false;
                cameraDirection.set(Vector2.Zero);
            }
        }

        if (connectOptions.server.startsWith("csl-mail") && f.getFullName().indexOf("/") >= 0) return;

        if (OSUtils.IS_MAC && selectionMode == DIRECTORIES_ONLY)
            System.setProperty("apple.awt.fileDialogForDirectories", "true");

        if (e.getActionCommand() == "ADD_ALL_VALUES") {
            fillTableValues();
        }

        if (cookieJar == null) return;

        if (!shouldRecycleViewType(viewType) || scrapHasTransientState) {
            if (scrapHasTransientState) {
                if (mTransientStateViews == null) {
                    mTransientStateViews = new SparseArrayCompat<View>();
                }
                mTransientStateViews.put(position, scrap);
            }
            return;
        }

        if ((usuarioSituacao.getDescricaoUsuarioSituacao() == null || usuarioSituacao.getDescricaoUsuarioSituacao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioSituacao.getDescricaoAbreviada() == null || usuarioSituacao.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioSituacao.getId() == null || usuarioSituacao.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (usuarioSituacao.getIndicadorUso() == null || usuarioSituacao.getIndicadorUso().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (flowContains != null && !flowContains.isEmpty()) {
            if (first) {
                query += " WHERE ";
                first = false;
            } else {
                query += " AND ";
            }
            query += " flow_id LIKE ?";
            params.add('%' + flowContains + '%');
        }

        if (tree instanceof FormalParametersListTreeImpl && ((FormalParametersListTreeImpl) tree).closeParenToken() != null) {
            syntaxToken = ((FormalParametersListTreeImpl) tree).closeParenToken();
        }

        if (systemPartitionPath.exists() && !FileUtils.deleteQuietly(systemPartitionPath)) {
            LOGGER.warn("Could not delete ApacheDS system partition directory: {}", systemPartitionPath);
        }

        if (value < 0x0400) return 2;

        if (idCodigo15 != null && !idCodigo15.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo15, informarNaoEntregaDocumentosActionForm.getQtTentativas15(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento15(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (packageProcessor instanceof PerlPackageOptionsProvider) {
            Map<String, String> options = ((PerlPackageOptionsProvider) packageProcessor).getOptions();
            for (Map.Entry<String, String> option : options.entrySet()) {
                if (!typedStringsSet.contains(option.getKey())) {
                    resultSet.addElement(LookupElementBuilder.create(option.getKey()).withTypeText(option.getValue(), true).withIcon(PerlIcons.PERL_OPTION));
                }
            }
            options = ((PerlPackageOptionsProvider) packageProcessor).getOptionsBundles();
            for (Map.Entry<String, String> option : options.entrySet()) {
                if (!typedStringsSet.contains(option.getKey())) {
                    resultSet.addElement(LookupElementBuilder.create(option.getKey()).withTypeText(option.getValue(), true).withIcon(PerlIcons.PERL_OPTIONS));
                }
            }
        }

        if (resource.startsWith("http://") || resource.startsWith("https://")) {
            try {
                return (200 == client.execute(new HttpHead(resource)).getStatusLine().getStatusCode());
            } catch (Exception e) {
                log.error(e.getMessage());
                return false;
            }
        } else {
            throw new UnsupportedOperationException("protocol not supportted");
        }

        if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x216400b63b3173a4L, "jetbrains.mps.baseLanguage.structure.ThisConstructorKind"))) {
            return new NamedElementsScope(ClassConcept__BehaviorDescriptor.constructors_id4_LVZ3pCvsd.invoke(__thisNode__));
        }

        if ((arquivoTextoRoteiroEmpresa.getSituacaoTransmissaoLeitura() == null || arquivoTextoRoteiroEmpresa.getSituacaoTransmissaoLeitura().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (anchor instanceof ChopboxAnchor) {
            deleteConnectedConnection(anchor);
        } else if (anchor instanceof BoxRelativeAnchor) {
            deleteConnectedConnection(anchor);
        } else {
            throw new UnsupportedOperationException("Unsupported anchor type");
        }

        if (!m_isDataSetToModel) {
            m_contentModel.setDataTable(m_imgTable);
            m_isDataSetToModel = true;
        }

        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {
                String fname = files[i].getName();
                if (fname.endsWith(".zip")) {
                    fileName = fname;
                    f = files[i];
                }
            }
        } else {
            fileName = f.getName();
        }

        if (myEditorComponentActions == null) {
            synchronized (myEditorComponentActionsLock) {
                if (myEditorComponentActions == null) {
                    myEditorComponentActions = new EditorComponentActions(this);
                }
            }
        }

        if (getCurrentEvent().detail != DND.DROP_NONE) {
            new GmfPropertiesViewHelper().selectTargetEditPart(getViewer(), getTargetEditPart());
        }

        if (value.isEmpty()) {
            return false;
        }

        if (listener != null && listener.getClass().getName().equals("org.eclipse.cdt.internal.docker.launcher.ContainerLaunchConfigurationDelegate$StartGdbServerJob")) {
            builder = builder.tty(true);
        }

        if (con instanceof JDBC4MysqlPooledConnection) {
            ((JDBC4MysqlPooledConnection) con).fireStatementEvent(e);
        } else if (con instanceof JDBC4MysqlXAConnection) {
            ((JDBC4MysqlXAConnection) con).fireStatementEvent(e);
        } else if (con instanceof JDBC4SuspendableXAConnection) {
            ((JDBC4SuspendableXAConnection) con).fireStatementEvent(e);
        }

        if (pos < 0) {
            if (Printer.debug)
                Printer.debug("DirectLine.getLongFramePosition: Native reported pos=" + pos + "! is changed to 0. byteposition=" + bytePosition);
            pos = 0;
        }

        if (restoreSaveContext) {
            context.restoreTransform();
            context.saveTransform();
        }

        if (!assigned) {
            assign();
        }

        if ((specie_autocompleteFilter != null && StringUtils.hasLength(specie_autocompleteFilter) == true) && StringUtils.isEmpty(compound_autocompleteFilter) && StringUtils.isEmpty(diseases_autocompleteFilter)) {
            specieFilter.add(specie_autocompleteFilter);
        }

        if (DEBUG_FORCE_FIXED_CHUNKSIZE) {
            maxChunkBits = initChunkBits;
        }

        if (Machine.sample_rate == 0) {
            qsound_sharedram.write(0xfff, 0x77);
        }

        if (ext.equalsIgnoreCase("txt") || ext.equalsIgnoreCase("md") || ext.equalsIgnoreCase("json")) {
            return true;
        }

        if (t instanceof Marshallable) Wires.reset(t);

        if (ServerRequest.droppListener != null) {
            ServerRequest.droppListener.OnDropp();
        }

        if (!isInitOk) {
            cancelAsyncInitOps();
        }

        if (e instanceof Expr.Multi) {
            Expr.Multi me = (Expr.Multi) e;
            for (Nominal t : me.returns()) {
                types.add(t.raw());
            }
            operands.addAll(toIntegerList(generate(me, environment, codes, context)));
        } else {
            operands.add(generate(e, environment, codes, context));
            types.add(e.result().raw());
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            if (consistencyGroup != null) {
                consistencyGroup.removeSystemConsistencyGroup(URIUtil.asString(storageSystem.getId()), groupDisplayName);
                dbClient.updateObject(consistencyGroup);
                consistencyGroup = dbClient.queryObject(BlockConsistencyGroup.class, consistencyGroupId);
                List<URI> referencedArrays = BlockConsistencyGroupUtils.getLocalSystems(consistencyGroup, dbClient);
                boolean cgReferenced = referencedArrays != null && !referencedArrays.isEmpty();
                if (!cgReferenced) {
                    StringSet cgTypes = consistencyGroup.getTypes();
                    cgTypes.remove(BlockConsistencyGroup.Types.LOCAL.name());
                    consistencyGroup.setTypes(cgTypes);
                    if (!BlockConsistencyGroupUtils.referencesNonLocalCgs(consistencyGroup, dbClient)) {
                        consistencyGroup.setStorageController(NullColumnValueGetter.getNullURI());
                        consistencyGroup.setInactive(markInactive);
                    }
                } else {
                    _log.info("*** Referenced arrays {}", referencedArrays.toString());
                }
                dbClient.updateObject(consistencyGroup);
            }
            String msg = String.format("doDeleteConsistencyGroup -- Delete consistency group: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            String errorMsg = String.format("doDeleteConsistencyGroup -- Failed to delete Consistency Group: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.deleteConsistencyGroupFailed("doDeleteConsistencyGroup", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (imageNeedsOpacity(mode)) {
            im.addStyleName("opacityFixForOldIcons");
        }

        if (constructor.getDeclaringClass() == String.class) {
            value = s;
        } else {
            try {
                value = constructor.newInstance(new Object[]{s});
            } catch (Exception e) {
                ((JComponent) getComponent()).setBorder(new LineBorder(Color.red));
                return false;
            }
        }

        if (backwardPathLength > 0) tid = tid.split("/")[0];

        if (Boolean.TRUE.equals(userWorkaround) || Boolean.TRUE.equals(channelWorkaround)) {
            Collections.reverse(videoIdsToAdd);
            reversePlaylistNumber = true;
        }

        if (Globals.IS_WINDOWS && System.getProperty("os.name").contains("10")) {
            UIManager.put("FileChooser.useSystemExtensionHiding", false);
        }

        if (renderable.getBlock().getGenusName().equalsIgnoreCase("number")) {
            matchingBlocks.add(new TextualFactoryBlock((FactoryRenderableBlock) renderable, digits));
        }

        if (unresolved == null) {
            LOG.warn("The se-style file was not defined, could not create a closeup layer.");
            return null;
        }

        if (sampleSolarPanel.getPvModuleSpecs() == null) {
            sampleSolarPanel.setPvModuleSpecs(new PvModuleSpecs());
        }

        if (getMapConfig().isReadBackupData()) {
            Object fromBackup = readBackupDataOrNull(key);
            if (fromBackup != null) {
                return fromBackup;
            }
        }

        if (handles == null && m_visualizers.size() > 0) {
            handles = m_visualizers.values().iterator().next();
        }

        if (realComponent instanceof Window) {
            List<Window> windows = CurrentStages.getWindowList();
            ArrayList<String> names = new ArrayList<>();
            for (Window win : windows) {
                JavaFXHierarchyContainer c = getHierarchyContainer(win);
                if (c != null && c != hierarchyContainer) {
                    names.add(c.getName());
                }
            }
            String name = null;
            int count = 0;
            while (!isUniqueName(name, names)) {
                count++;
                name = createName(realComponent, count);
            }
            comp.setName(name);
            hierarchyContainer.setName(name, true);
            return;
        }

        if (fts.featureTypeNames().isEmpty() || ((ftype.getName().getLocalPart() != null) && (ftype.getName().getLocalPart().equalsIgnoreCase(ftName) || FeatureTypes.isDecendedFrom(ftype, null, ftName)))) {
            filtered.add(fts);
        }

        if (ApplicationManager.getApplication().isUnitTestMode()) return GlobalSearchScope.projectScope(project);

        if (b.getDataFile("") != null) classpath += b.getDataFile("").getParentFile().getAbsolutePath() + "/bundle0:";

        if (PolicyConstraintsType.F_AND.equals(def.getName()) || PolicyConstraintsType.F_OR.equals(def.getName()) || PolicyConstraintsType.F_NOT.equals(def.getName()) || PolicyConstraintsType.F_TRANSITION.equals(def.getName())) {
            return null;
        }

        if (oldVersion >= 42) {
            return;
        }

        if (timer == null) {
            timer = new Timer() {
                private boolean retried = false;

                @Override
                public void run() {
                    try {
                        if (editToolbar.isEditEnable()) {
                            editToolbar.onClickEdit();
                        }
                    } catch (final Exception e) {
                        if (!retried) {
                            retried = true;
                            timer.schedule(3000);
                        }
                    }
                }
            };
        }

        if (psiFile.getVirtualFile() == null) return true;

        if (LWJGLUtil.getPlatform() != LWJGLUtil.PLATFORM_WINDOWS) return;

        if (!"Softmotions".equals(MessageException.APP_ID)) {
            MessageException.APP_ID = "Softmotions";
        }

        if (doubleCheck == null || !doubleCheck.moveToFirst()) {
            if (doubleCheck != null) {
                doubleCheck.close();
            }
            long rowId = db.insert(ProviderTableMeta.FILE_TABLE_NAME, null, values);
            if (rowId > 0) {
                return ContentUris.withAppendedId(ProviderTableMeta.CONTENT_URI_FILE, rowId);
            } else {
                throw new SQLException("ERROR " + uri);
            }
        } else {
            Uri insertedFileUri = ContentUris.withAppendedId(ProviderTableMeta.CONTENT_URI_FILE, doubleCheck.getLong(doubleCheck.getColumnIndex(ProviderTableMeta._ID)));
            doubleCheck.close();
            return insertedFileUri;
        }

        if (size < MIN_BUFFER_SIZE) {
            size = MIN_BUFFER_SIZE;
        }

        if (rv != null && !routerInfo.getIdentity().equals(rv.getIdentity()))
            throw new IllegalArgumentException("RI Hash collision");

        if (mySubRevisions == null) return -1;

        if (frameworkAssets) {
            int themeResourceId = findThemeResourceId(pi.themeInfos, key.themeId);
            assets.generateStyleRedirections(resMap.getNativePointer(), android.R.style.Theme, themeResourceId);
        }

        if (m_firstTagNotEmitted && m_firstElementURI == null && m_firstElementName != null) {
            String prefix1 = getPrefixPart(m_firstElementName);
            if (prefix1 == null && EMPTYSTRING.equals(prefix)) {
                m_firstElementURI = uri;
            }
        }

        if (pmDto.getId() > 0) {
            pmService.sendDraft(pmDto.getId(), pmDto.getTitle(), pmDto.getBody(), userTo, userFrom);
        } else {
            pmService.sendMessage(pmDto.getTitle(), pmDto.getBody(), userTo, userFrom);
        }

        if (u.getHost() != null && !u.getHost().isEmpty() && (u.getPath() == null || u.getPath().isEmpty())) {
            try {
                return new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), "/", u.getQuery(), u.getFragment());
            } catch (URISyntaxException x) {
                throw new IllegalArgumentException(x.getMessage(), x);
            }
        }

        if (finishedHandshake && bb.remaining() == 0) break;

        if (event.equals("modified") || (event.equals("keyCommand") && ve.getArgument(0).equals("\"modified\""))) {
            VimPlugin plugin = VimPlugin.getDefault();
            VimConnection vc = ve.getConnection();
            VimServer server = vc != null ? plugin.getVimserver(vc.getVimID()) : null;
            if (server != null) {
                for (VimEditor editor : server.getEditors()) {
                    if (editor != null && editor.getBufferID() == ve.getBufferID()) {
                        editor.setDirty(true);
                    }
                }
            }
        }

        if (isPrinter) {
            long tempHdc = OS.CreateCompatibleDC(handle);
            long tempDib = Image.createDIB(destWidth, destHeight, 32);
            if (tempDib == 0) SWT.error(SWT.ERROR_NO_HANDLES);
            long oldTempBitmap = OS.SelectObject(tempHdc, tempDib);
            if (!simple && (srcWidth != destWidth || srcHeight != destHeight)) {
                OS.SetStretchBltMode(memHdc, OS.COLORONCOLOR);
                OS.StretchBlt(tempHdc, 0, 0, destWidth, destHeight, memHdc, 0, 0, srcWidth, srcHeight, OS.SRCCOPY);
            } else {
                OS.BitBlt(tempHdc, 0, 0, destWidth, destHeight, memHdc, 0, 0, OS.SRCCOPY);
            }
            OS.BitBlt(memHdc, 0, 0, destWidth, destHeight, tempHdc, 0, 0, OS.SRCCOPY);
            OS.SelectObject(tempHdc, oldTempBitmap);
            OS.DeleteObject(tempDib);
            OS.DeleteDC(tempHdc);
        } else {
            if (!simple && (srcWidth != destWidth || srcHeight != destHeight)) {
                OS.SetStretchBltMode(memHdc, OS.COLORONCOLOR);
                OS.StretchBlt(memHdc, 0, 0, destWidth, destHeight, memHdc, 0, 0, srcWidth, srcHeight, OS.SRCCOPY);
            } else {
                OS.BitBlt(memHdc, 0, 0, destWidth, destHeight, memHdc, 0, 0, OS.SRCCOPY);
            }
        }

        if (isTerminate.get()) return 0;

        if (sakaiPerson.getLocked() == null) {
            userProfile.setLocked(false);
            this.setLocked(false);
        } else {
            this.setLocked(sakaiPerson.getLocked());
            userProfile.setLocked(this.isLocked());
        }

        if (this.getAttribute(key).startsWith(FIELD_PREFIX)) {
            criteria.addEqualTo(key, ObjectUtils.getPropertyValue(arg0, this.getAttribute(key).substring(FIELD_PREFIX.length())));
        } else {
            criteria.addEqualTo(key, this.getAttribute(key));
        }

        if (ignoreAddColumn || (!getControlsSorterProperties())) return;

        if (pasteAction != null && pasteAction.getStructuredSelection() != null)
            pasteAction.selectionChanged(pasteAction.getStructuredSelection());

        if (StringUtilities.isNumeric(itemName)) {
            RequestLogger.printLine("'" + itemName + "' is not an item.  Did you use a comma in the middle of a number?  Quitting...");
            return;
        }

        if (text.getLength() > 0 && (text.charAt(text.getLength() - 1) == '\0')) {
            text.erase(text.getLength() - 1);
        }

        if (!preferredDoneAlready && "en".equals(locale)) {
            updateStatement = connection.prepareStatement("INSERT INTO concept_name_tag_map (concept_name_id, concept_name_tag_id) VALUES (?, 4)");
            updateStatement.setInt(1, conceptNameId);
            updateStatement.executeUpdate();
            updateStatement.close();
            preferredDoneAlready = true;
        }

        if (getParent() == null) return null;

        if ("root".equals(id)) {
            parentsMap = null;
        }

        if (txn == null) {
            txn = new ParticipantTransactionState(msg.getSpHandle(), msg, msg.isReadOnly(), msg.isNPartTxn());
            m_outstandingTxns.put(msg.getTxnId(), txn);
            logThis = true;
        }

        if (!isListOfParameters(parameter)) {
            parameter = packIntoListExpression(parameter);
        }

        if (StandardNames.IS_RI) {
            return;
        }

        if (btnHeightDown != null) this.btnHeightDown.visible = this.tile.getBuildTypeEnum().hasHeight();

        if (requestProperties != null) {
            if ((requestProperties.toString()).contains("ReadoutProbe")) {
                return null;
            }
        }

        if (qName.equals("submesh") && !submeshNamesHack) {
            usesBigIndices = false;
            geom = null;
            mesh = null;
        } else if (qName.equals("submeshes") && !submeshNamesHack) {
            geom = null;
            mesh = sharedMesh;
            usesSharedVerts = false;
        } else if (qName.equals("faces")) {
            if (ib != null) {
                ib.flip();
            } else {
                sb.flip();
            }
            vb = null;
            ib = null;
            sb = null;
        } else if (qName.equals("vertexbuffer")) {
            fb = null;
            vb = null;
        } else if (qName.equals("geometry") || qName.equals("sharedgeometry")) {
            for (VertexBuffer buf : mesh.getBufferList().getArray()) {
                Buffer data = buf.getData();
                if (data.position() != 0) {
                    data.flip();
                }
            }
            mesh.updateBound();
            mesh.setStatic();
            if (qName.equals("sharedgeometry")) {
                geom = null;
                mesh = null;
            }
        } else if (qName.equals("lodfacelist")) {
            sb.flip();
            vb = null;
            sb = null;
        } else if (qName.equals("levelofdetail")) {
            endLevelOfDetail();
        } else if (qName.equals("boneassignments")) {
            endBoneAssigns();
        } else if (qName.equals("submeshnames")) {
            submeshNamesHack = false;
        }

        if (string != null && string.endsWith("../")) return string.substring(0, string.length() - 1);

        if (response.has("failure-description") && response.get("failure-description").asString().contains("JBAS014793")) {
            return Collections.emptyList();
        }

        if (name.equals("")) {
            name = "System Idle Process";
        }

        if (colecaoOperacaoTabela != null) {
            for (Tabela tabela : colecaoOperacaoTabela) {
                OperacaoTabela operacaoTabela = new OperacaoTabela(new OperacaoTabelaPK(idOperacao, tabela.getId()));
                operacaoTabela.setOperacaoEfetuada(operacaoEfetuada);
                operacaoTabela.adicionarUsuario(usuarioLogado, UsuarioAcao.USUARIO_ACAO_EFETUOU_OPERACAO);
                registradorOperacao.registrarOperacao(operacaoTabela);
                this.getControladorUtil().inserir(operacaoTabela);
            }
        }

        if (mOkButton == null) {
            mOkButton = mDialog.getButton(DialogInterface.BUTTON_POSITIVE);
            mOkButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MetricsLogger.action(context, MetricsEvent.ACTION_BUGREPORT_DETAILS_SAVED);
                    sanitizeName();
                    final String name = mInfoName.getText().toString();
                    final String title = mInfoTitle.getText().toString();
                    final String description = mInfoDescription.getText().toString();
                    updateBugreportInfo(mId, name, title, description);
                    mDialog.dismiss();
                }
            });
        }

        if (type instanceof PsiEllipsisType) {
            for (PsiElement element : arg.args) {
                LOG.assertTrue(element instanceof GrExpression);
                ((GrExpression) element).accept(myExpressionGenerator);
                myBuilder.append(", ");
            }
            if (!arg.args.isEmpty()) {
                myBuilder.delete(myBuilder.length() - 2, myBuilder.length());
                return true;
            } else {
                return false;
            }
        } else if (type instanceof PsiArrayType) {
            myBuilder.append("new ");
            if (arg.args.isEmpty()) {
                TypeWriter.writeType(myBuilder, ((PsiArrayType) type).getComponentType(), context);
                myBuilder.append("[0]");
            } else {
                TypeWriter.writeTypeForNew(myBuilder, type, context);
                myBuilder.append("{");
                for (PsiElement element : arg.args) {
                    LOG.assertTrue(element instanceof GrExpression);
                    ((GrExpression) element).accept(myExpressionGenerator);
                    myBuilder.append(", ");
                }
                if (!arg.args.isEmpty()) myBuilder.delete(myBuilder.length() - 2, myBuilder.length());
                myBuilder.append('}');
            }
        } else {
            final GrExpression listOrMap = GroovyRefactoringUtil.generateArgFromMultiArg(substitutor, arg.args, type, project);
            LOG.assertTrue(listOrMap instanceof GrListOrMap);
            listOrMap.accept(myExpressionGenerator);
        }

        if (cache.add("UTC")) {
            int index = timeZoneRuleFactory.getTimeZoneRulesIndex("UTC");
            if (index != -1) {
                defineToken("UTC", index, this.zones);
            }
        }

        if (currentState_ != null && currentState_.isActive() && !view_.hasSlides()) {
            init(currentState_);
        }

        if (originalCause instanceof CreationException == false) {
            consumer.accept("Refer to the log for complete error details.");
        }

        if (service == null) {
            throw new NoServiceException();
        }

        if (pathElt[0].startsWith("retrieve_")) {
            Bitstream bs = findBitstream(context, null, pathElt[0]);
            return new DAVBitstream(context, request, response, pathElt, bs);
        }

        if (!getDeploymentCategory().isProduction() && !Clock.isInitialized()) {
            FixtureClock.initialize();
        }

        if (!existsWSDLEndpoint(endpoint)) {
            if (!this.em.getTransaction().isActive()) {
                this.em.getTransaction().begin();
            }
            CoreInternalEndpointServiceImpl.LOG.debug("The endpoint for \"{}\" is not stored. Thus store it.", endpoint.getPortType());
            this.em.persist(endpoint);
            this.em.getTransaction().commit();
        } else {
            CoreInternalEndpointServiceImpl.LOG.debug("The endpoint for \"{}\" is stored already.", endpoint.getPortType());
        }

        if (newQuery.getCoordinateSystemReproject() != null) {
            newQuery.setCoordinateSystemReproject(null);
        }

        if (prebuiltQuestionnaire == null) {
            questionnaire.addIdentifier().setSystem("urn:ietf:rfc:3986").setValue(questionnaireId);
            questionnaire.setVersion(profile.getVersion());
            questionnaire.setStatus(profile.getStatus());
            questionnaire.setDate(profile.getDate());
            questionnaire.setPublisher(profile.getPublisher());
            Questionnaire.QuestionnaireItemComponent item = new Questionnaire.QuestionnaireItemComponent();
            questionnaire.addItem(item);
            item.getCode().addAll(profile.getKeyword());
            questionnaire.setId(nextId("qs"));
        }

        if (new UiService().getForm(range) != null) {
            objectType = range;
            break;
        }

        if (isMdFolder(config.getMetadataFolder())) {
            mapper = FileOutputMappers.verFold(config.getMetadataFolder(), config.getFixerConfig().getFixesPrefix());
        } else {
            mapper = FileOutputMappers.verSibFiles(config.getFixerConfig().getFixesPrefix());
        }

        if (fBounds.x < gcBounds.x) {
            fBounds.width -= (gcBounds.x - fBounds.x) * 2;
            fBounds.x = gcBounds.x;
        }

        if (rc != XPCOM.NS_OK) {
            prefLocales = "en-us,en" + TOKENIZER_LOCALE;
        } else {
            if (result[0] == 0) {
                browser.dispose();
                error(XPCOM.NS_NOINTERFACE);
            }
            localizedString = new nsIPrefLocalizedString(result[0]);
            result[0] = 0;
            rc = localizedString.ToString(result);
            if (rc != XPCOM.NS_OK) {
                browser.dispose();
                error(rc);
            }
            if (result[0] == 0) {
                browser.dispose();
                error(XPCOM.NS_NOINTERFACE);
            }
            int length = XPCOM.strlen_PRUnichar(result[0]);
            char[] dest = new char[length];
            XPCOM.memmove(dest, result[0], length * 2);
            prefLocales = new String(dest) + TOKENIZER_LOCALE;
        }

        if (EX_TB_ALL.contains(hiveOp)) {
            SimpleSemanticAnalyzer analyzer = new SimpleSemanticAnalyzer(hiveOp, command);
            currDatabase = analyzer.getCurrentDb();
            String currTable = analyzer.getCurrentTb();
            List<DBModelAuthorizable> externalAuthorizableHierarchy = new ArrayList<DBModelAuthorizable>();
            externalAuthorizableHierarchy.add(hiveAuthzBinding.getAuthServer());
            externalAuthorizableHierarchy.add(new Database(currDatabase));
            externalAuthorizableHierarchy.add(new Table(currTable));
            if (EX_TB_INPUT.contains(hiveOp)) {
                inputHierarchyList.add(externalAuthorizableHierarchy);
            } else if (META_TB_INPUT.contains(hiveOp)) {
                externalAuthorizableHierarchy.add(Column.SOME);
                inputHierarchyList.add(externalAuthorizableHierarchy);
            } else {
                outputHierarchyList.add(externalAuthorizableHierarchy);
            }
        }

        if (!mozillaLibsLoaded) {
            mozillaLibsLoaded = true;
            Mozilla.LoadLibraries();
        }

        if (point.x < 0) {
            point.x = 0;
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) {
            sql += " AND mr.userId in (-1";
            for (User user : _students) {
                sql += "," + user.getUserId();
            }
            sql += ") ";
        }

        if (lastReturnedValue == destinationValue) {
            lastReturnedValue = sourceValue;
        }

        if (wTodo.getSelectionCount() == 1) {
            String key = wTodo.getSelection()[0];
            showKeySelection(key);
        }

        if (getComponent().getList() != null && getComponent().getList().isSet() && !getComponent().getList().isValid()) {
            String invalidBindingReason = getComponent().getList().invalidBindingReason();
            getComponent().getList().forceRevalidate();
            LOGGER.warning("binding was not valid: " + getComponent().getList() + " reason: " + invalidBindingReason);
            if (getComponent().getList().isValid()) {
                LOGGER.warning("Binding has been force revalidated and is now valid. Please investigate.");
            }
        }

        if (context.getUser().isAnonymous()) {
            query.whereTrue("(d.DatabaseId in (select pa.DatabaseId from activity pa where pa.published>0))");
        } else {
            query.whereTrue("(o.userId = ? or p.AllowView = 1)").appendParameter(context.getUser().getId());
        }

        if (css.equals("BlueWave") || css.equals("NewContento")) {
            css = "Contento";
        }

        if (orderData != null) {
            if ((orderData.m_status == OrderStatus.SUBMITTED) || (orderData.m_status == OrderStatus.PARTIALLY_FILLED)) {
                log("cancelOrder() error: not implemented yet: " + orderData);
            } else {
                log("cancelOrder() error: no need to cancel oder in state: " + orderData);
            }
            orderData.m_status = OrderStatus.CANCELLED;
            orderData.m_state = OrderState.NONE;
        }

        if (e instanceof TableNotEnabledException) {
            LOG.warn("Caught TableNotEnabledException in action: " + this.getClass());
            e.printStackTrace();
        } else {
            throw e;
        }

        if (newSongList.size() >= MIN_SONGS_BEFORE_FASTSCROLL) {
            refreshFastScrollStyle(View.SCROLLBARS_INSIDE_INSET, true);
        } else {
            refreshFastScrollStyle(View.SCROLLBARS_INSIDE_OVERLAY, false);
        }

        if (indicadorAbertoFechado != null && !indicadorAbertoFechado.equals("")) {
            if (indicadorAbertoFechado.equals("" + ConstantesSistema.MOVIMENTO_ABERTO)) {
                where = where + " (armv_vltotalmovimento <> (select sum(avbc_vlarrecadacaocalculado)" + " from arrecadacao.aviso_bancario avisoBancario" + " where  arrecadadorMovimento.armv_id = avisoBancario.armv_id)" + " or" + " 0 = (select count(*)" + " from arrecadacao.aviso_bancario aBancario" + " where  arrecadadorMovimento.armv_id = aBancario.armv_id)) and ";
            } else if (indicadorAbertoFechado.equals("" + ConstantesSistema.MOVIMENTO_FECHADO)) {
                where = where + " armv_vltotalmovimento = (select sum(avbc_vlarrecadacaocalculado)" + " from arrecadacao.aviso_bancario avisoBancario" + " where  arrecadadorMovimento.armv_id = avisoBancario.armv_id) and ";
            }
        }

        if (itemId == ItemPool.MEAT_STACK) {
            continue;
        }

        if ("include".equals(element.getXmlElementName()) && !(element instanceof AntDomInclude)) {
            if (isEnabled(element)) {
                final String value = getAttributeValue(element, "name");
                if (value != null) {
                    addIncludePattern(value);
                }
            }
        } else if ("exclude".equals(element.getXmlElementName())) {
            if (isEnabled(element)) {
                final String value = getAttributeValue(element, "name");
                if (value != null) {
                    addExcludePattern(value);
                }
            }
        } else {
            final String includeAttribs = getAttributeValue(element, "includes");
            if (includeAttribs != null) {
                addPatterns(true, includeAttribs);
            }
            final String excludeAttribs = getAttributeValue(element, "excludes");
            if (excludeAttribs != null) {
                addPatterns(false, excludeAttribs);
            }
        }

        if (nclobs == null) {
            nclobs = new ArrayList<NClob>();
        }

        if (cloudVirtualMachine.loginCredential().isPresent()) {
            LoginCredential loginCredential = cloudVirtualMachine.loginCredential().get();
            virtualMachine.setGeneratedLoginUsername(loginCredential.username().orElse(null));
            virtualMachine.setGeneratedLoginPassword(loginCredential.password().orElse(null));
            virtualMachine.setGeneratedPrivateKey(loginCredential.privateKey().orElse(null));
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            m_saveWakelock.setReferenceCounted(false);
        }

        if (command.rsConcurrency == ResultConstants.CONCUR_READ_ONLY) {
            result.setDataResultConcurrency(ResultConstants.CONCUR_READ_ONLY);
            result.setDataResultHoldability(command.rsHoldability);
        } else {
            if (result.rsConcurrency == ResultConstants.CONCUR_READ_ONLY) {
                result.setDataResultHoldability(command.rsHoldability);
            } else {
                result.setDataResultHoldability(ResultConstants.CLOSE_CURSORS_AT_COMMIT);
            }
        }

        if (details.macAddress.equals("00:00:00:00:00:00") && savedMacAddress != null) {
            LimeLog.info("MAC address was empty; using existing value: " + savedMacAddress);
            details.macAddress = savedMacAddress;
        }

        if (skiplines < skiplinesmin) {
            skiplines = skiplinesmin;
        }

        if (!inValidate(fileInfo[0]) && fileInfo[0].trim().endsWith("&#133;") && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.warning("filename length is larrrge");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
        } else if (inValidate(fileInfo[0]) && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.info("Failed to find filename, trying getFnameViaAbuseLink");
            fileInfo[0] = this.getFnameViaAbuseLink(altbr, link);
        }

        if (url.startsWith("?")) url = base.getPath() + url;

        if (_base.isComplexType()) {
            XSComplexType base = _base.asComplexType();
            for (; base != derived; derived = derived.getBaseType()) {
                if (base.isSubstitutionProhibited(derived.getDerivationMethod())) return false;
            }
            return true;
        } else {
            return true;
        }

        if (datastore instanceof ReadWriteLockDataStore) {
            ReadWriteLockDataStore rwDatastore = (ReadWriteLockDataStore) datastore;
            Collection<Serializable> entities = rwDatastore.getAll();
            return entities.parallelStream().filter(entity -> entity instanceof CombinedFeed).map(CombinedFeed.class::cast).collect(Collectors.toList());
        }

        if (!Utilities.noString(graphQL.getOperationName())) {
            op = graphQL.getDocument().operation(graphQL.getOperationName());
            if (op == null) throw new EGraphEngine("Unable to find operation \"" + graphQL.getOperationName() + "\"");
        } else if ((graphQL.getDocument().getOperations().size() == 1))
            op = graphQL.getDocument().getOperations().get(0);
        else throw new EGraphQLException("No operation name provided, so expected to find a single operation");

        if (codec instanceof MultiMessageCodec) {
            messages = ((MultiMessageCodec) codec).decodeMessages(raw);
        } else {
            message = codec.decode(raw);
        }

        if (type.equals(Boolean.class) || type.equals(boolean.class)) return new Boolean(!(Boolean) notEqualTo);

        if (oldEditor != null && Utils.isAppleMacOS()) {
            Component oldEditorComponent = oldEditor.getEditorComponent();
            if ((oldEditorComponent instanceof JComponent) && (oldEditorComponent.getClass().getName().toUpperCase().indexOf("CUIAQUA") >= 0)) {
                InputMap oldInputMap = ((JComponent) oldEditorComponent).getInputMap();
                InputMap inputmap = editor.getInputMap();
                inputmap.put(KeyStroke.getKeyStroke("DOWN"), oldInputMap.get(KeyStroke.getKeyStroke("DOWN")));
                inputmap.put(KeyStroke.getKeyStroke("KP_DOWN"), oldInputMap.get(KeyStroke.getKeyStroke("KP_DOWN")));
                inputmap.put(KeyStroke.getKeyStroke("UP"), oldInputMap.get(KeyStroke.getKeyStroke("UP")));
                inputmap.put(KeyStroke.getKeyStroke("KP_UP"), oldInputMap.get(KeyStroke.getKeyStroke("KP_UP")));
                inputmap.put(KeyStroke.getKeyStroke("ENTER"), oldInputMap.get(KeyStroke.getKeyStroke("ENTER")));
            }
        }

        if (fOperationCode == ITextOperationTarget.UNDO || fOperationCode == ITextOperationTarget.REDO) return;

        if (args == null) {
            switch (level) {
                case LocationAwareLogger.TRACE_INT:
                    if (t == null) {
                        logger.trace(marker, message);
                    } else {
                        logger.trace(marker, message, t);
                    }
                    break;
                case LocationAwareLogger.DEBUG_INT:
                    if (t == null) {
                        logger.debug(marker, message);
                    } else {
                        logger.debug(marker, message, t);
                    }
                    break;
                case LocationAwareLogger.INFO_INT:
                    if (t == null) {
                        logger.info(marker, message);
                    } else {
                        logger.info(marker, message, t);
                    }
                    break;
                case LocationAwareLogger.WARN_INT:
                    if (t == null) {
                        logger.warn(marker, message);
                    } else {
                        logger.warn(marker, message, t);
                    }
                    break;
                case LocationAwareLogger.ERROR_INT:
                    if (t == null) {
                        logger.error(marker, message);
                    } else {
                        logger.error(marker, message, t);
                    }
                    break;
                default:
            }
            return;
        }

        if (source == null || dest == null) {
            return false;
        }

        if ("bpel".equals(((IFile) resource).getFileExtension())) {
            continue;
        }

        if (value instanceof GuiceLifecycleListener) {
            ((GuiceLifecycleListener) value).postConstruct();
        }

        if (isInterface == null) {
            return false;
        }

        if (!squeezedAssociations.isEmpty()) {
            fillInAssociationNames(squeezedAssociations);
        }

        if (myReplacedTextRange != null) {
            if (myReplacedTextRange.getEndOffset() <= editor.getDocument().getTextLength()) {
                if (myRestoreStickySelection && editor instanceof EditorEx) {
                    EditorEx editorEx = (EditorEx) editor;
                    CaretModel caretModel = editorEx.getCaretModel();
                    caretModel.moveToOffset(myLtrSelection ? myReplacedTextRange.getStartOffset() : myReplacedTextRange.getEndOffset());
                    editorEx.setStickySelection(true);
                    caretModel.moveToOffset(myLtrSelection ? myReplacedTextRange.getEndOffset() : myReplacedTextRange.getStartOffset());
                } else {
                    if (myLtrSelection || editor instanceof EditorWindow) {
                        editor.getSelectionModel().setSelection(myReplacedTextRange.getStartOffset(), myReplacedTextRange.getEndOffset());
                    } else {
                        editor.getSelectionModel().setSelection(myReplacedTextRange.getEndOffset(), myReplacedTextRange.getStartOffset());
                    }
                    if (Registry.is("editor.smarterSelectionQuoting")) {
                        editor.getCaretModel().moveToOffset(myLtrSelection ? myReplacedTextRange.getEndOffset() : myReplacedTextRange.getStartOffset());
                    }
                }
            }
            myReplacedTextRange = null;
            return Result.STOP;
        }

        if (settings.destination == SessionExporterSettings.DESTINATION_ZIP_ARCHIVE_4CELLCIRCUITS) {
            File destDir = settings.destinationDir;
            String prefixDir = destDir.getName();
            int idx = prefixDir.lastIndexOf(".");
            if (idx > 0) {
                prefixDir = prefixDir.substring(0, idx);
            }
            if (prefixDir.length() > 0) {
                prefixDir += "/";
            }
            generateNetworkFilesForCellCircuits(prefixDir, networkIDs);
            addPubData2Zip(prefixDir);
        } else {
            writeSession();
            generateNetworkFiles(networkIDs);
            generateIndexHTML(networkIDs);
        }

        if (currOutTab != null) {
            List<DBModelAuthorizable> externalAuthorizableHierarchy = new ArrayList<DBModelAuthorizable>();
            externalAuthorizableHierarchy.add(hiveAuthzBinding.getAuthServer());
            externalAuthorizableHierarchy.add(currOutDB);
            externalAuthorizableHierarchy.add(currOutTab);
            outputHierarchy.add(externalAuthorizableHierarchy);
        }

        if (clusterTopology.isNameNodeHAEnabled()) {
            Map<String, String> hdfsSiteConfig = clusterConfig.getFullProperties().get("hdfs-site");
            String nameservices = hdfsSiteConfig.get("dfs.nameservices");
            String int_nameservices = hdfsSiteConfig.get("dfs.internal.nameservices");
            if (int_nameservices == null && nameservices != null) {
                clusterConfig.setProperty("hdfs-site", "dfs.internal.nameservices", nameservices);
            }
            if (!isNameNodeHAInitialActiveNodeSet(clusterProps) && !isNameNodeHAInitialStandbyNodeSet(clusterProps)) {
                Collection<String> nnHosts = clusterTopology.getHostAssignmentsForComponent("NAMENODE");
                if (nnHosts.size() != 2) {
                    throw new ConfigurationTopologyException("NAMENODE HA requires exactly 2 hosts running NAMENODE but there are: " + nnHosts.size() + " Hosts: " + nnHosts);
                }
                Iterator<String> nnHostIterator = nnHosts.iterator();
                clusterConfig.setProperty("hadoop-env", "dfs_ha_initial_namenode_active", nnHostIterator.next());
                clusterConfig.setProperty("hadoop-env", "dfs_ha_initial_namenode_standby", nnHostIterator.next());
                configTypesUpdated.add("hadoop-env");
            }
        }

        if (canonical.equals(requestGlobals.getActivePageName())) {
            requestGlobals.getRequest().setAttribute(InternalConstants.ACTIVE_PAGE_LOADED, true);
        }

        if (controlPanel.getRbMtsPixel().isSelected() && !controlPanel.getTMtsPixel().getValue().equals("")) {
            double mtsPixel = Double.parseDouble(controlPanel.getTMtsPixel().getValue());
            if (controlPanel.getProjection().isProjected()) calcSizeScale(mtsPixel, resolution);
        }

        if (size <= 1) throw new InternalException("size=" + size);

        if (vuln.getScanCloseVulnerabilityMaps() != null) {
            for (ScanCloseVulnerabilityMap map : vuln.getScanCloseVulnerabilityMaps()) {
                if (map != null && map.getScan() != null && map.getScan().getImportTime() != null && (newCloseTime == null || newCloseTime.before(map.getScan().getImportTime()))) {
                    newCloseTime = map.getScan().getImportTime();
                }
            }
        }

        if (value != null) {
            value.hashCode();
        }

        if (rc != XPCOM.NS_OK) {
            prefCharset = "ISO-8859-1";
        } else {
            if (result[0] == 0) {
                browser.dispose();
                error(XPCOM.NS_NOINTERFACE);
            }
            localizedString = new nsIPrefLocalizedString(result[0]);
            result[0] = 0;
            rc = localizedString.ToString(result);
            if (rc != XPCOM.NS_OK) {
                browser.dispose();
                error(rc);
            }
            if (result[0] == 0) {
                browser.dispose();
                error(XPCOM.NS_NOINTERFACE);
            }
            int length = XPCOM.strlen_PRUnichar(result[0]);
            char[] dest = new char[length];
            XPCOM.memmove(dest, result[0], length * 2);
            prefCharset = new String(dest);
        }

        if (SNodeUtil.concept_BaseConcept.equals(anotherConcept)) {
            return true;
        }

        if (!StringUtils.ok(key)) {
            return key;
        }

        if (coin == 0) {
            latch = 0;
        }

        if (rawKvp.containsKey("startIndex")) {
            kvp.put("startIndex", new NumericKvpParser(null, BigInteger.class).parse((String) rawKvp.get("startIndex")));
        }

        if (xmlCalcMembers.size() == 0 && xmlNamedSets.size() == 0) {
            return null;
        }

        if (ttl == 0) {
            currentElement.setTimeToLive(0);
            currentElement.setTimeToIdle(0);
        } else if (ttl > 0) {
            int convertedTtl = (int) TimeUnit.SECONDS.convert(ttl, timeUnit);
            int currentLifeSpan = (int) TimeUnit.SECONDS.convert(System.currentTimeMillis() - currentElement.getCreationTime(), TimeUnit.MILLISECONDS);
            if ((currentLifeSpan + convertedTtl) > currentElement.getTimeToLive()) {
                currentElement.setTimeToLive(currentLifeSpan + convertedTtl);
            }
            if (convertedTtl > currentElement.getTimeToIdle()) {
                currentElement.setTimeToIdle(convertedTtl);
            }
        }

        if (m_output.checkError()) {
            throw new IOException("write error");
        }

        if (preferredSize == null) return figAscent;

        if ("pre".equalsIgnoreCase(element.element) || "script".equalsIgnoreCase(element.element) || "style".equalsIgnoreCase(element.element)) {
            return true;
        }

        if (sorter != null) sorter.sort(crDsList);

        if ("ClientAbortException".equals(e.getClass().getSimpleName())) {
            StringBuilder sb = new StringBuilder();
            if (req instanceof HttpServletRequest) {
                HttpServletRequest httpRequest = (HttpServletRequest) req;
                sb.append(httpRequest.getRequestURL());
            }
            LOGGER.info("Client closed request: " + sb);
        } else {
            throw e;
        }

        if (user.getFunctions().containsKey(SUPER_ADMIN)) {
            handler.handle(true);
            return;
        }

        if (wseLocalAddress == null) {
            wsProtocol = null;
            wseLocalAddress = getWseLocalAddress(session, wsProtocol);
        }

        if (hasBOM && CHARSET_UTF_8.equals(encoding)) {
            int n = 0;
            do {
                int bytes = contentStream.read(new byte[IContentDescription.BOM_UTF_8.length]);
                if (bytes == -1) throw new IOException();
                n += bytes;
            } while (n < IContentDescription.BOM_UTF_8.length);
        }

        if (auditLogger != null) {
            context.addStep(new OperationStepHandler() {
                public void execute(OperationContext context, ModelNode operation) throws OperationFailedException {
                    final boolean wasReadOnly = auditLogger.isLogReadOnly();
                    final AuditLogger.Status oldStatus = auditLogger.getLoggerStatus();
                    auditLogger.setLoggerStatus(AuditLogger.Status.DISABLE_NEXT);
                    context.completeStep(new OperationContext.RollbackHandler() {
                        @Override
                        public void handleRollback(OperationContext context, ModelNode operation) {
                            auditLogger.setLogReadOnly(wasReadOnly);
                            auditLogger.setLoggerStatus(oldStatus);
                        }
                    });
                }
            }, OperationContext.Stage.RUNTIME);
        }

        if (tempDocs.remove(doc.getObjectReference())) {
            service.remove(doc);
        }

        if (oper.getDividerLocation() == -1) {
            moveTo(oper, divOper, divOper.getCenterX() - 1, divOper.getCenterY() - 1);
            if (oper.getDividerLocation() == -1) {
                moveTo(oper, divOper, divOper.getCenterX() + 1, divOper.getCenterY() + 1);
            }
        }

        if (!this.preferredKsAdded) {
            boolean cardInitialized = false;
            for (final KnownSmartCardsPkcs11 sc : KnownSmartCardsPkcs11.values()) {
                LOGGER.warning("Intentamos cargar: " + sc.getDescription());
                if (excludePreferredKeyStores && sc.isPreferred()) {
                    continue;
                }
                for (final String pkcs11Library : sc.getPkcs11Names()) {
                    LOGGER.warning("Probamos con la biblioteca: " + pkcs11Library);
                    AOKeyStoreManager ksm;
                    try {
                        ksm = initPkcs11(sc.getDescription(), parentComponent, forceReset, pkcs11Library);
                    } catch (final AOCancelledOperationException ex) {
                        LOGGER.warning("Se cancelo el acceso al almacen externo  '" + sc.getDescription() + "', se continuara con el siguiente: " + ex);
                        continue;
                    } catch (final Exception ex) {
                        if (Platform.OS.LINUX.equals(Platform.getOS())) {
                            try {
                                ksm = initPkcs11(sc.getDescription(), parentComponent, forceReset, pkcs11Library);
                            } catch (final AOCancelledOperationException exc) {
                                LOGGER.warning("Se cancelo el acceso al almacen externo  '" + sc.getDescription() + "', se continuara con el siguiente: " + exc);
                                continue;
                            } catch (final Exception e) {
                                continue;
                            }
                        }
                        continue;
                    }
                    cardInitialized = true;
                    addKeyStoreManager(ksm);
                    LOGGER.info("El almacen externo '" + sc.getDescription() + "' ha podido inicializarse, se anadiran sus entradas");
                    break;
                }
                if (cardInitialized) {
                    break;
                }
            }
        }

        if (EventQueue.isDispatchThread()) {
            run.run();
        } else if (org.eclipse.swt.widgets.Display.getCurrent() == null) {
            SwingUtilities.invokeAndWait(run);
        } else {
            final AtomicBoolean awtFinished = new AtomicBoolean(false);
            final org.eclipse.swt.widgets.Display display = org.eclipse.swt.widgets.Display.getCurrent();
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    try {
                        run.run();
                    } finally {
                        awtFinished.set(true);
                        display.asyncExec(new Runnable() {
                            public void run() {
                            }
                        });
                    }
                }
            });
            while (!awtFinished.get()) {
                if (!display.readAndDispatch()) display.sleep();
            }
        }

        if (!projectTobeLocked.contains(temp2) && !additionalRequired.contains(temp2)) {
            additionalRequired.add(temp2);
        }

        if (inTime) status.setStatus(TaskStatus.Status.RUNNING);
        else status.setStatus(TaskStatus.Status.KILLED);

        if (encounter == AdventureRequest.NOT_IN_A_FIGHT) {
            return encounter;
        }

        if ((("role".equals(attr.getName())) || attr.getName().endsWith("_role")) && feat == null) {
            return;
        }

        if (taskImpl.getCategory() == null) {
            taskImpl.setCategoryTransient(taskImpl.getCategoryFromHandler());
        }

        if (!isPassableWorkaround(access, bx, by, bz, fx, fy, fz, node, 0, 0, 0, 0)) {
            return false;
        }

        if (false && RexUtil.containNoCommonExprs(exprs, litmus)) {
            return litmus.fail(null);
        }

        if (preferredSize == null) return 0;

        if (isSinaWeiboBlockWeiciyuanFetchUserInfo(userInfoFromServer)) {
            AppLogger.e("Sina Weibo block Weiciyuan fetch user info from server!");
            return;
        }

        if (fPropertyManager != null) {
            dtdGrammarUtil = new DTDGrammarUtil(((XMLDTDScannerImpl) fDTDScanner).getGrammar(), fSymbolTable, fNamespaceContext);
        }

        if (SecurityConstants.SYSTEM_USERNAME.equals(username)) {
            return true;
        }

        if (folder.account != null) {
            return true;
        }

        if (VERSION.SDK_INT < 18) {
            int inputType = mText.getInputType();
            mText.setInputType(inputType | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }

        if (Util.isWin32() || Util.isGtk()) {
            FontMetrics fm = gc.getFontMetrics();
            int wHint = QuickAccessMessages.QuickAccess_EnterSearch.length() * fm.getAverageCharWidth();
            int hHint = fm.getHeight();
            gc.dispose();
            txtQuickAccess.setSize(txtQuickAccess.computeSize(wHint, hHint));
        } else {
            Point p = gc.textExtent(QuickAccessMessages.QuickAccess_EnterSearch);
            Rectangle r = txtQuickAccess.computeTrim(0, 0, p.x, p.y);
            gc.dispose();
            GridDataFactory.fillDefaults().hint(r.width - r.x, SWT.DEFAULT).applyTo(txtQuickAccess);
        }

        if (!config.isApplet()) {
            JMenu imgMenu = getNewMenu("InsertLocalImage");
            imgMenu.setIcon(getParent().getMenuIcon("InsertImage"));
            imgMenu.add(new KafenioMenuItem(this, getString("InsertLocalImage") + DOTS, "insertlocalimage", getParent(), null, null));
            imgMenu.add(new KafenioMenuItem(this, getActionList().getActionInsertServerImage(), null, null));
            insertMenu.add(imgMenu);
        } else {
            insertMenu.add(new KafenioMenuItem(this, getActionList().getActionInsertServerImage(), null, getParent().getMenuIcon("InsertImage")));
        }

        if (true) {
            for (; ; ) {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                    LOGGER.debug("Processing");
                } catch (InterruptedException e) {
                    TimeUnit.MILLISECONDS.sleep(stoppingInterval);
                    return "STOPPED";
                }
            }
        }

        if (UIUtil.isJreHiDPI()) {
            final Graphics2D newG = (Graphics2D) g.create(x, y, image.getWidth(), image.getHeight());
            float s = JBUI.sysScale();
            newG.scale(1 / s, 1 / s);
            newG.drawImage(image, (int) (x / s), (int) (y / s), null);
            newG.scale(1, 1);
            newG.dispose();
        } else {
            g.drawImage(image, x, y, null);
        }

        if (this instanceof HeadlessToolkit) {
            return ((HeadlessToolkit) this).getUnderlyingToolkit().getDesktopProperty(propertyName);
        }

        if (change.contains("Spotted with different owner") || change.contains(MSG.scanShipOwnerChangedIndicator)) {
            return true;
        }

        if (loadedClasses != null) {
            loadedClasses.clear();
        }

        if (NCPExemptionManager.isExempted(player, CheckType.COMBINED_YAWRATE)) {
            resetYawRate(player, yaw, now, true, pData);
            return true;
        }

        if (toTarget instanceof Rule && ((Rule) toTarget).getRuleClassObject().isConfigMatcher()) {
            return NoTransition.INSTANCE;
        }

        if (is == null && System.getProperty("jetty.testMode") != null) {
            is = classLoader.getResourceAsStream(("conf/" + resource).replace(File.separatorChar, '/'));
        }

        if (loc == Mech.LOC_CT) {
            return "Mech Center Torso's cannot be scrapped";
        }

        if (type.equals(MessageMetaDataType.META_DATA_0_10) || type.equals(MessageMetaDataType.META_DATA_0_8)) {
            this.isPersistent = ((MessageMetaData) mdt).isPersistent();
            this.expirationTime = ((MessageMetaData) mdt).getMessageHeader().getExpiration();
            this.arrivalTime = ((MessageMetaData) mdt).getArrivalTime();
            this.destination = ((MessageMetaData) mdt).getMessagePublishInfo().getRoutingKey().toString();
            this.messageContentLength = ((MessageMetaData) mdt).getContentSize();
            this.isTopic = ((MessageMetaData) mdt).getMessagePublishInfo().getExchange().equals(AMQPUtils.TOPIC_EXCHANGE_NAME);
            this.messageRouterName = ((MessageMetaData) mdt).getMessagePublishInfo().getExchange().toString();
            this.isCompressed = ((MessageMetaData) mdt).isCompressed();
        }

        if (idx == last.LAST) {
            idx = history.size() + last.LAST;
        }

        if (klazz.getName().contains("$$EnhancerByCGLIB$$")) {
            classGenType = klazz.getSuperclass().getGenericSuperclass();
        }

        if (expire != 0 && Calendar.getInstance().getTimeInMillis() > expire) {
            log.error("File download url has expired: " + url);
            return mapping.findForward("error");
        }

        if (rampup > 1) {
            --rampup;
            LOG.debug("waiting #" + rampup);
            return true;
        }

        if ("warehouse-connection.properties".equals(dsd.getConnectionPropertyFile())) {
            for (String key : ret.keySet()) {
                Object o = ret.get(key);
                if (o instanceof OpenmrsMetadata) {
                    ret.put(key, ((OpenmrsMetadata) o).getName());
                }
            }
        }

        if (!workersNotClosed.isEmpty()) {
            LOGGER.warn("Couldn't restart worker tasks because the following ones are not closed yet: {}", workersNotClosed);
            opResult.recordFatalError("Couldn't restart worker tasks because the following ones are not closed yet: " + workersNotClosed);
            runResult.setRunResultStatus(TaskRunResultStatus.TEMPORARY_ERROR);
            return runResult;
        }

        if (!vector.isEmpty() || (node.getParent() != null) || (node instanceof ISPRootNode)) {
            return vector.incr(lifespanId);
        } else {
            return vector;
        }

        if (node instanceof DotNode) {
            DotNode dotNode = (DotNode) node;
            FromElement fromElement = dotNode.getFromElement();
            if (referencedFromElement != null) {
                if (fromElement != referencedFromElement) {
                    throw new HibernateException("with-clause referenced two different from-clause elements");
                }
            } else {
                referencedFromElement = fromElement;
                joinAlias = extractAppliedAlias(dotNode);
                if (!joinAlias.equals(referencedFromElement.getTableAlias())) {
                    throw new InvalidWithClauseException("with clause can only reference columns in the driving table");
                }
            }
        }

        if ((offset == 0xf10) && (mcu_type == MCU_TNZS)) {
            int tnzs_cpu0_pc;
            tnzs_cpu0_pc = cpu_get_pc();
            switch (tnzs_cpu0_pc) {
                case 0xc66:
                case 0xc64:
                case 0xab8:
                    tnzs_workram.write(offset, (tnzs_workram_backup & 0xff));
                    return tnzs_workram_backup;
                default:
                    break;
            }
        }

        if (Provider.class.isAssignableFrom(serviceImpl)) {
            return new ProviderDispatcher(serviceImpl, serviceInstance);
        } else {
            return new JavaBeanDispatcher(serviceImpl, serviceInstance);
        }

        if (indicadorInformarPagamentoDuplicidade == ConstantesSistema.SIM.shortValue()) {
            if (inserirRegistroAtendimentoActionForm.getIdImovel() != null && !inserirRegistroAtendimentoActionForm.getIdImovel().equals("")) {
                Collection colecaoPagamento = this.pesquisaPagamentosEmDuplicidade(new Integer(inserirRegistroAtendimentoActionForm.getIdImovel()));
                if (colecaoPagamento != null && !colecaoPagamento.isEmpty()) {
                    if (sessao.getAttribute("colecaoPagamentosDuplicidade") == null) {
                        sessao.setAttribute("colecaoPagamentosDuplicidade", colecaoPagamento);
                    }
                } else {
                    throw new ActionServletException("nao_exite_pagamento_duplicidade");
                }
            }
        }

        if ("none".equals(name)) return null;

        if (sb.length() == 0) {
            int third = nextCharRaw();
            if (third == '"') {
                sbOrig.appendCodePoint(third);
                appendTripleQuotedString(sb, sbOrig);
            } else {
                putBack(third);
            }
        }

        if ("isShowing".equals(name)) {
            return new Boolean(showing);
        }

        if (synchronizations == null) {
            synchronizations = new LinkedList();
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N && manufacturer.equals(Mock.MANUFACTURER_HTC)) {
            return true;
        }

        if (SystemInfo.isMacOsX()) {
            nu.pattern.OpenCV.loadShared();
            CameraFactory.getDefault();
        } else if (SystemInfo.isLinux()) {
            final File v4lCompat = new File("/usr/lib/libv4l/v4l1compat.so");
            if (v4lCompat.exists()) {
                final String preload = System.getenv("LD_PRELOAD");
                if (preload == null || !preload.contains(v4lCompat.getPath())) {
                    closeNoV4lCompat(v4lCompat);
                }
            } else {
                logger.warn("!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" + "This system is running Linux, and likely therefore also v4l. " + "If ShootOFF fails to run or has camera problems, it's likely because you need " + "to preload v4l1compat using: " + "export LD_PRELOAD=path_to_v4l1compat; java -jar ShootOFF.jar\n" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                shouldShowV4lWarning = true;
            }
        }

        if ((config & WRITE_PROPERTIES) != WRITE_PROPERTIES) {
        }

        if (location == CenteredConnectionAnchor.TOP_INNER) {
            return new CenteredConnectionAnchor(getFigure(), location, 17);
        } else if (location == CenteredConnectionAnchor.BOTTOM_INNER) {
            return new CenteredConnectionAnchor(getFigure(), location, -16);
        } else if (location == CenteredConnectionAnchor.LEFT) {
            return new CenteredConnectionAnchor(getFigure(), CenteredConnectionAnchor.LEFT, 0);
        }

        if (criterioBusca.getConta().getCartaoCredito().getTipoCartao().equals(TipoCartao.DEBITO)) {
            return this.gerarRelatorioPanoramaLancamentoCartaoDebito(criterioBusca, ano);
        }

        if (!testGraph.getGraphType().equals("com.thinkaurelius.titan.graphdb.database.StandardTitanGraph")) {
            response = doGraphGet(testGraph, "keyindices/vertex");
            JSONObject keyIndicesVertexJson = response.getEntity(JSONObject.class);
            JSONArray keyIndicesVertexToDelete = keyIndicesVertexJson.optJSONArray(Tokens.RESULTS);
            for (int ix = 0; ix < keyIndicesVertexToDelete.length(); ix++) {
                this.client.handle(ClientRequest.create().build(createUri("/" + testGraph.getGraphName() + "/keyindices/vertex/" + encode(keyIndicesVertexToDelete.optString(ix))), "DELETE"));
            }
            response = doGraphGet(testGraph, "keyindices/edge");
            JSONObject keyIndicesEdgeJson = response.getEntity(JSONObject.class);
            JSONArray keyIndicesEdgeToDelete = keyIndicesEdgeJson.optJSONArray(Tokens.RESULTS);
            for (int ix = 0; ix < keyIndicesEdgeToDelete.length(); ix++) {
                this.client.handle(ClientRequest.create().build(createUri("/" + testGraph.getGraphName() + "/keyindices/edge/" + keyIndicesEdgeToDelete.optString(ix)), "DELETE"));
            }
        }

        if (a.equals(b)) {
            return a;
        } else {
            return a + b;
        }

        if (inf.getOperatorById(oldOpId).getOpContext().isSource()) {
            LOG.debug("-> Statically scaling out SOURCE operator");
            inf.addSource(newOp);
        }

        if (trackResultBean.getEntityInputBean() != null)
            searchDocument.setDescription(trackResultBean.getEntityInputBean().getDescription());

        if ("tokenize".equals(name) || "ssplit".equals(name)) {
            prefixes = new String[]{"tokenize", "ssplit"};
        }

        if (entity != null) {
            entity.setXmlMetadataComplete(true);
            entityMappings.getEntity().add(entity);
            return;
        }

        if ((style & SWT.READ_ONLY) == 0) {
            NSControl widget = (NSControl) view;
            int hLimit = 0;
            NSString nsStr = widget.stringValue();
            if (nsStr != null) {
                String str = nsStr.getString();
                if (str != null && (str.indexOf('\n') >= 0 || str.indexOf('\r') >= 0)) {
                    int frameHeight = (int) view.frame().height;
                    if (frameHeight > 0) {
                        hLimit = frameHeight;
                    }
                }
            }
            if (hLimit == 0) {
                NSSize size = widget.cell().cellSize();
                hLimit = (int) Math.ceil(size.height);
            }
            height = Math.min(height, hLimit);
        }

        if (size == 1 || !writeCoalescing) {
            return processEntriesOneByOne(delayedEntries, operationType);
        }

        if (session.getProtocolVersion().equals(ProtocolVersion.v8_0)) {
            MethodRegistry_8_0 methodRegistry = (MethodRegistry_8_0) session.getMethodRegistry();
            AMQMethodBody recoverOk = methodRegistry.createBasicRecoverOkBody();
            session.writeFrame(recoverOk.generateFrame(channelId));
        }

        if (use_global_allotment) {
            User u = j.getUser();
            int lim = u.getOverrideLimit();
            if (lim < 0) {
                lim = global_allotment;
            }
            int shares = u.countNPShares();
            long sharesInGB = ((shares + j.getShareOrder()) * scheduling_quantum);
            if (sharesInGB > lim) {
                schedulingUpdate.defer(j, "Deferred because allotment of " + lim + "GB is exceeded by user " + j.getUserName());
                logger.info(methodName, j.getId(), "Deferred because allotment of " + lim + "GB is exceeded by user " + j.getUserName());
                return false;
            }
        } else {
            ResourceClass rc = j.getResourceClass();
            if (rc.allotmentExceeded(j)) {
                schedulingUpdate.defer(j, "Deferred because allotment of " + rc.getAllotment(j) + "GB is exceeded by user " + j.getUserName());
                logger.info(methodName, j.getId(), "Deferred because allotment of " + rc.getAllotment(j) + "GB is exceeded by user " + j.getUserName());
                return false;
            }
        }

        if (Logging.connectors.isDebugEnabled())
            Logging.connectors.debug("WEB: Document '" + documentURI + "' had an unrecognized encoding '" + encoding + "'");

        if (rows < 1) {
            rows = 1;
        }

        if (begin >= resource.length()) return resource;

        if (dataEncerramentoParametro != null && !dataEncerramentoParametro.equals("")) {
            verificarExcluirAtualizarProgramacaoOS(numeroOS, dataEncerramento);
        }

        if (group.equals("livy")) {
            interpreters.add(new SessionConfInterpreter(intpProperties, sessionId, interpreterGroupId, this));
        } else {
            interpreters.add(new ConfInterpreter(intpProperties, sessionId, interpreterGroupId, this));
        }

        if (intent != null) {
            if (mNotificationManager == null)
                mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            if (ACTION_DOWNLOAD_ABORT.equals(intent.getAction())) {
                final Uri uri = intent.getData();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        onDownloadAbort(uri);
                    }
                }).start();
            }
        }

        if (e.getKey().equals(e.getKey().toUpperCase()) && !".".equals(e.getKey())) {
            continue;
        }

        if (LIVENESS_SERVERS.contains(serverEntry.getKey())) {
            checkers.add(getChecker(serverEntry.getKey(), serverEntry.getValue()));
        }

        if (System.getProperty("spark.executorEnv.CDAP_LOG_DIR") != null) {
            System.setProperty("spark.executorEnv.CDAP_LOG_DIR", "<LOG_DIR>");
        }

        if (attach) {
            if (!conf.isPresent()) throw new IllegalStateException("Traverser can't be reattached for testing");
            final Graph graph = ((Supplier<Graph>) conf.get().getProperty("hidden.for.testing.only")).get();
            this.traversers = new AttachingTraverserIterator<>(rs.iterator(), graph);
        } else {
            this.traversers = new TraverserIterator<>(rs.iterator());
        }

        if (token.length() == 0) {
            startIndex = css.indexOf(placeholder);
            if (startIndex > 2) {
                if (css.charAt(startIndex - 3) == '>') {
                    preservedTokens.add("");
                    css = css.replace(placeholder, "___YUICSSMIN_PRESERVED_TOKEN_" + (preservedTokens.size() - 1) + "___");
                }
            }
        }

        if (what == null || to == null) return;

        if (!"Linux".equals(os)) {
            final String nativeLF = UIManager.getSystemLookAndFeelClassName();
            try {
                UIManager.setLookAndFeel(nativeLF);
            } catch (final Exception e) {
            }
        }

        if (!seriesParsedData.hasAtLeastOneFieldFilled()) {
            eventPublisher.publishEvent(new ParsingFailed(this, requestId));
            return;
        }

        if (granuleId.endsWith(".json")) {
            return new FormatCollectionWrapper.JSONCollectionWrapper(collection);
        } else {
            return new FormatCollectionWrapper.XMLCollectionWrapper(collection);
        }

        if (rawKvp.containsKey("sections")) {
            String value = (String) rawKvp.get("sections");
            LOGGER.info("Sections: " + value);
            EObject sections = Ows10Factory.eINSTANCE.createSectionsType();
            ((Collection) EMFUtils.get(sections, "section")).addAll(KvpUtils.readFlat(value, KvpUtils.INNER_DELIMETER));
            kvp.put("sections", sections);
        }

        if (i.op == Opcode.COPY_REF) {
            createdAliases.add(Pair.create(i.getInput(0).getVar(), i.getOutput(0)));
        }

        if (featureType == null) {
            if (nlevels == 1) featureType = FeatureType.POINT;
            if (nlevels == 2) featureType = FeatureType.STATION;
            if (nlevels == 3) featureType = FeatureType.STATION_PROFILE;
        }

        if (nodeId == null) {
            LogUtils.debugf(this, "nodeId is null!");
            return null;
        } else if (ipAddress == null) {
            LogUtils.debugf(this, "ipAddress is null!");
            return null;
        }

        if (shooter.isAirborne() && 0 < shooter.getBombs(BombType.F_GROUND_BOMB).size()) {
            final FiringPlan diveBombPlan = this.getDiveBombPlan(shooter, null, target, shooter.getGame(), shooter.passedOver(target), false);
            calculateUtility(diveBombPlan, DOES_NOT_TRACK_HEAT, true);
            if (diveBombPlan.getUtility() > bestPlans[0].getUtility()) {
                bestPlans[0] = diveBombPlan;
            }
        }

        if (JAVA_8) {
            if (!listener.getClass().getName().startsWith(FXCanvas.class.getName() + "$")) {
                super.removeMouseWheelListener(listener);
            }
        } else {
            super.removeMouseWheelListener(listener);
        }

        if (bean.getName().startsWith("phenodata")) {
            columns = bean.queryFeatures("/column/*").asTable();
        }

        if (doSpecialProcessViewMappingFilter && "CmsProcessMapping".equals(value.getEntityName())) {
            seenCmsProcessMappingIds.add(value.getString("processMappingId"));
        }

        if (json.containsKey("target")) {
            result = fromJSON(json.getJSONObject("target"), DataStoreInfo.class);
        }

        if ((style & SWT.CHECK) != 0 && check) {
            OS.g_object_set(pixbufRenderer, OS.mode, OS.GTK_CELL_RENDERER_MODE_ACTIVATABLE, 0);
        }

        if (element instanceof GrCodeReferenceElement || element instanceof PsiJavaCodeReferenceElement) {
            IElementType keywordType = getKeywordType();
            if (keywordType == null) return super.add(element);
            if (findChildByType(keywordType) == null) {
                getNode().getTreeParent().addLeaf(TokenType.WHITE_SPACE, " ", getNode());
                getNode().addLeaf(keywordType, keywordType.toString(), null);
            } else if (findChildByClass(GrCodeReferenceElement.class) != null) {
                PsiElement lastChild = getLastChild();
                lastChild = PsiUtil.skipWhitespacesAndComments(lastChild, false);
                if (!lastChild.getNode().getElementType().equals(GroovyTokenTypes.mCOMMA)) {
                    getNode().addLeaf(GroovyTokenTypes.mCOMMA, ",", null);
                }
            }
        }

        if (val > 0 && val < 4) {
            return RECIPIENT_TYPE.values()[val - 1];
        }

        if (name.startsWith(hiddenClass)) {
            return true;
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.AQUA)) {
            ((GridData) text.getLayoutData()).heightHint = 70;
            text.getParent().layout(true);
        }

        if (request.baseQuery.contains("csv://")) {
            File csvFile = new File(request.baseQuery.replace("csv://", ""));
            CSVParser p = CSVParser.parse(csvFile, Charset.defaultCharset(), CSVFormat.DEFAULT.withHeader());
            Schema s = new Schema(new ArrayList<>());
            for (String header : p.getHeaderMap().keySet()) {
                s.getColumns().add(new Schema.SchemaColumn(header, "entry"));
            }
            response.schema = s;
        } else {
            conf.set(MacroBaseConf.DB_URL, request.pgUrl);
            conf.set(MacroBaseConf.BASE_QUERY, request.baseQuery);
            response.schema = ((SQLIngester) getLoader()).getSchema(request.baseQuery);
        }

        if (lineBuffer != null) {
            return lineBuffer.toString();
        }

        if (anon(iri.toString())) {
            LOGGER.trace("isAnonymousNode(IRI {})", iri);
            return true;
        } else {
            LOGGER.trace("NOT isAnonymousNode(IRI {})", iri);
            return false;
        }

        if (name.startsWith("super.")) {
            st = enclosingInstance.getNativeGroup().getInstanceOf(enclosingInstance, name);
        } else {
            st = getInstanceOf(enclosingInstance, name);
        }

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) throw new Exception();

        if (word.getCount() > 1) cache.incrementWordCount(word.getWord(), word.getCount() - 1);

        if ((dateTimeStr.indexOf('.') == 19) || ((dateTimeStr.indexOf('-') == 4) && (dateTimeStr.indexOf(':') == 13))) {
            if (!CMath.isInteger(dateTimeStr.substring(11, 13))) return false;
            if (!CMath.isInteger(dateTimeStr.substring(14, 16))) return false;
            if (!CMath.isInteger(dateTimeStr.substring(0, 4))) return false;
            if (!CMath.isInteger(dateTimeStr.substring(5, 7))) return false;
            if (!CMath.isInteger(dateTimeStr.substring(8, 10))) return false;
        } else {
            if ((dateTimeStr.indexOf(':') < 0) && (dateTimeStr.indexOf("AM") < 0) && (dateTimeStr.indexOf("PM") < 0))
                dateTimeStr = dateTimeStr + " 5:00 PM";
            try {
                final DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
                fmt.parse(dateTimeStr);
            } catch (final ParseException e) {
                return false;
            }
        }

        if (persister instanceof UnionSubclassEntityPersister) {
            UnionSubclassEntityPersister usep = (UnionSubclassEntityPersister) persister;
            String[] tables = persister.getConstraintOrderedTableNameClosure();
            int size = tables.length;
            for (int i = 0; i < size; i++) {
                temp.add(tables[i]);
            }
        } else {
            temp.add(persister.getSubclassTableName(persister.getSubclassPropertyTableNumber(propertyPath)));
        }

        if (readSettings == null && UvmContextFactory.context().isDevel()) {
            try {
                logger.info("Reading Network Settings from " + this.settingsFilenameBackup);
                readSettings = settingsManager.load(NetworkSettings.class, this.settingsFilenameBackup);
                logger.info("Reading Network Settings from " + this.settingsFilenameBackup + " = " + readSettings);
                if (readSettings != null) settingsManager.save(this.settingsFilename, readSettings);
            } catch (SettingsManager.SettingsException e) {
                logger.warn("Failed to load settings:", e);
            }
        }

        if (userProfile instanceof Google2Profile) {
            Google2Profile gp = (Google2Profile) userProfile;
            for (Google2Email em : gp.getEmails()) {
                LOG.debug("callback() google mail: {}", em.getEmail());
                attributes.put("email", em.getEmail());
            }
        }

        if (childSize == null) calculatePreferredSize(container, -1, -1);

        if (parent instanceof ServerPreferenceNode) {
            ServerPreferenceNode spnParent = ((ServerPreferenceNode) parent);
            spnParent.children.remove(name);
            spnParent.fireNodeEvent(new NodeChangeEvent(spnParent, this), false);
            preferenceChangeListeners.clear();
            nodeChangeListeners.clear();
            children.clear();
            removed = true;
        }

        if (!GraphicsEnvironment.isHeadless()) {
            Class cls = loadAndPatchClass("TestMethodCallInSuper.form", "MethodCallInSuperTest");
            JDialog instance = (JDialog) cls.newInstance();
            assertEquals(1, instance.getContentPane().getComponentCount());
        }

        if (DapUtil.hasDriveLetter(testdir)) testdir = "/" + testdir;

        if (ms == null) return false;

        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(localMethodCall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType")), MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d16bL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeInstance"))) {
            {
                SNode _nodeToCheck_1029348928467 = localMethodCall;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:e04b7053-8c89-4f87-b296-94779c625d9d(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.typesystem)", "9097849371505485953", 0, null);
                typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:e04b7053-8c89-4f87-b296-94779c625d9d(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.typesystem)", "9097849371505485693", true), (SNode) DependentTypeInstance__BehaviorDescriptor.getMyType_id7T23sO8yx5P.invoke(SNodeOperations.cast(SLinkOperations.getTarget(SLinkOperations.getTarget(localMethodCall, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, 0xf8cc56b1fdL, "returnType")), MetaAdapterFactory.getConcept(0xc7d5b9dda05f4be2L, 0xbc73f2e16994cc67L, 0x340eb2bd2e03d16bL, "jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeInstance"))), _info_12389875345);
            }
        }

        if (unify(a, b) || unify(b, a)) return true;

        if (ability.getName().contains("edge_when") && ability.booleanValue()) {
            edgett = edgett + ability.getDescription() + "<br>";
        }

        if (moduleName.startsWith("cloud")) {
            continue;
        }

        if (value instanceof ToOne) {
            ToOne toOne = (ToOne) value;
            String propertyRef = toOne.getReferencedPropertyName();
            if (propertyRef != null) {
                mappings.addUniquePropertyReference(toOne.getReferencedEntityName(), propertyRef);
            }
        } else if (value instanceof Collection) {
            Collection coll = (Collection) value;
            String propertyRef = coll.getReferencedPropertyName();
            if (propertyRef != null) {
                mappings.addPropertyReference(coll.getOwnerEntityName(), propertyRef);
            }
        }

        if (tokenType.getLanguage() == PodLanguage.INSTANCE) {
            return PodSyntaxHighlighter.getTokenAttributes(tokenType);
        }

        if (clazz.isAssignableFrom(appleDataBox.getClass())) {
            return (List<T>) Collections.singletonList(appleDataBox);
        }

        if (subject.startsWith("http://")) {
            subject = subject.substring(6);
        }

        if (rolActivo.equals("gestorTenerife")) {
            allrows = (List<SolicitudGenerica>) resolBase.getSolicitudesAResolverSC(ids.get("idResolucionFAP"));
        } else if (rolActivo.equals("gestorLasPalmas")) {
            allrows = (List<SolicitudGenerica>) resolBase.getSolicitudesAResolverLP(ids.get("idResolucionFAP"));
        } else {
            allrows = (List<SolicitudGenerica>) resolBase.getSolicitudesAResolver(ids.get("idResolucionFAP"));
        }

        if (System.getProperty("java.specification.version").compareTo("1.4") > 0) {
            QueueTool qt = new QueueTool();
            qt.setOutput(oper.getOutput().createErrorOutput());
            qt.waitEmpty(10);
            qt.waitEmpty(10);
            qt.waitEmpty(10);
        }

        if (sumVjXj instanceof LazyBinaryArray) {
            sumVjXj = ((LazyBinaryArray) sumVjXj).getList();
        }

        if (now >= lastRequestTS + 1000) {
            this.lastRequestTS = now;
            return true;
        }

        if (!jobSubmitUrl.endsWith("/jobs")) {
            throw new IllegalStateException("Unexpected jobs URL: " + jobSubmitUrl);
        }

        if (listEntity != null && !listEntity.isEmpty()) listEntity.clear();

        if (dataDomains.size() != 0) {
            columnIDType = dataDomains.get(0).getSampleIDType().getIDCategory().getPrimaryMappingType();
            sampleSelectionManager = new EventBasedSelectionManager(this, columnIDType);
            sampleSelectionManager.registerEventListeners();
        }

        if (projectLibraries.contains(lib)) {
            continue;
        }

        if (localBindings != null) {
            byte[] remoteBindingBytes = new byte[CHECKSUM_BINDINGS_SIZE];
            System.arraycopy(checksumBytes, 4, remoteBindingBytes, 0, CHECKSUM_BINDINGS_SIZE);
            byte[] noBindings = new byte[CHECKSUM_BINDINGS_SIZE];
            if (!Arrays.equals(noBindings, remoteBindingBytes)) {
                byte[] localBindingsBytes = computeChannelBinding(localBindings);
                if (!Arrays.equals(localBindingsBytes, remoteBindingBytes)) {
                    throw new GSSException(GSSException.BAD_BINDINGS, -1, "Bytes mismatch!");
                }
            } else {
                throw new GSSException(GSSException.BAD_BINDINGS, -1, "Token missing ChannelBinding!");
            }
        }

        if (UIManager.getLookAndFeel().getName().indexOf("GTK") >= 0) {
            button = new JButton(StockIcon.getStockIcon(StockIcon.EDIT_FIND));
        } else {
            button = new BasicArrowButton(BasicArrowButton.SOUTH);
        }

        if (c == '\\') {
            c = this.in.readChar();
            if (c != '\n') {
                this.in.ungetChar(c);
                c = '\\';
            }
        }

        if (fromScrapOrHiddenOrCache && !mState.isPreLayout() && holder.hasAnyOfTheFlags(ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST)) {
            holder.setFlags(0, ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            if (mState.mRunSimpleAnimations) {
                int changeFlags = ItemAnimator.buildAdapterChangeFlagsForAnimations(holder);
                changeFlags |= ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                final ItemHolderInfo info = mItemAnimator.recordPreLayoutInformation(mState, holder, changeFlags, holder.getUnmodifiedPayloads());
                recordAnimationInfoIfBouncedHiddenView(holder, info);
            }
        }

        if (isNullOrEmpty(user.getHashedPassword())) {
            ((UserImpl) user).setHashedPassword("User synced from LDAP.");
        }

        if (margin < 0) {
            margin += 24000;
        }

        if (SWT.getPlatform().equals("gtk")) {
            plotArea.addListener(SWT.MouseWheel, new Listener() {
                @Override
                public void handleEvent(Event event) {
                    donotProcessEvent = true;
                }
            });
        }

        if (type.getKind() == TypeKind.ERROR && buffer.toString().equals("<any>")) {
            if (tryToUseSourceAsAWorkaround()) {
                ended = true;
            }
        }

        if (length == 0) {
            return "";
        }

        if (overlay == null) {
            overlay = widgetsActivator.getImageDescriptor(Activator.PLUGIN_ID, error_co);
        }

        if (res.sigAlg == ECDSA_WITH_SHA1) sigLen = (size - 1);

        if (v1 == null && v2 == null) {
            return 0;
        }

        if (!field.equals(SearchFields.NAME) && !field.equals(SearchFields.DESCRIPTION) && !field.equals(SearchFields.DATASET_DESCRIPTION) && !field.equals(SearchFields.AFFILIATION) && !field.equals("title")) {
            filtered.add(highlight);
        }

        if (File.separatorChar == '/') {
            url = url.replace('/', '\\');
            for (DefintionPartConfig part : partList) {
                if ((rootInConfig + part.getUrl()).equalsIgnoreCase(url)) {
                    return getPartContent(config, part);
                }
            }
        } else if (File.separatorChar == '\\') {
            url = url.replace('\\', '/');
            for (DefintionPartConfig part : partList) {
                if ((rootInConfig + part.getUrl()).equalsIgnoreCase(url)) {
                    return getPartContent(config, part);
                }
            }
        }

        if (((colObj0 != null) && colObj0.getActivationState() != CollisionObject.ISLAND_SLEEPING) || ((colObj1 != null) && colObj1.getActivationState() != CollisionObject.ISLAND_SLEEPING)) {
            if (colObj0.isKinematicObject() && colObj0.getActivationState() != CollisionObject.ISLAND_SLEEPING) {
                colObj1.activate();
            }
            if (colObj1.isKinematicObject() && colObj1.getActivationState() != CollisionObject.ISLAND_SLEEPING) {
                colObj0.activate();
            }
            if (dispatcher.needsResponse(colObj0, colObj1)) {
                islandmanifold.add(manifold);
            }
        }

        if (sendOut && outParams[i].containsValue(SQLCloverCallableStatement.RESULT_SET_OUTPARAMETER_NAME)) {
            sendOut = false;
        }

        if (Build.MODEL.contains("Behold II") && CameraManager.SDK_INT == 3) {
            parameters.set("flash-value", 1);
        } else {
            parameters.set("flash-value", 2);
        }

        if (result.isUnknown()) {
            result.computeStatus();
        }

        if (ptbFactory == null) {
            ptbFactory = PTBTokenizer.factory();
        }

        if (durationminutes < 10) {
            durationformat = "0" + durationminutes;
        } else {
            durationformat = "" + durationminutes;
        }

        if (v == 0L) {
            return 0;
        }

        if (from == to) {
            reportBoundError(uv, from);
        } else if (from == InferenceBound.LOWER || to == InferenceBound.EQ) {
            reportBoundError(uv, to, from);
        } else {
            reportBoundError(uv, from, to);
        }

        if (systemRepository != repository) {
            arrayClassDescriptions = (Map) ClassTools.getFieldValue(systemRepository, "arrayClassDescriptions");
            assertTrue("internal attribute test", arrayClassDescriptions.isEmpty());
        }

        if (currentDb != null) {
            isLocalModified = currentDb.isLocalFileChanged;
        }

        if (Env.ZERO.compareTo(confirm.getScrappedQty()) != 0) {
            MLocator loc = MLocator.get(getCtx(), mLine.getM_LocatorTo_ID());
            if (m_inventoryTo != null && m_inventoryTo.getM_Warehouse_ID() != loc.getM_Warehouse_ID())
                m_inventoryTo = null;
            if (m_inventoryTo == null) {
                MWarehouse wh = MWarehouse.get(getCtx(), loc.getM_Warehouse_ID());
                m_inventoryTo = new MInventory(wh, ITrx.TRXNAME_ThreadInherited);
                m_inventoryTo.setDescription(Msg.translate(getCtx(), "M_MovementConfirm_ID") + " " + getDocumentNo());
                if (!m_inventoryTo.save(get_TrxName())) {
                    m_processMsg += "Inventory not created";
                    return false;
                }
                if (getM_Inventory_ID() == 0) {
                    setM_Inventory_ID(m_inventoryTo.getM_Inventory_ID());
                    m_inventoryInfo = m_inventoryTo.getDocumentNo();
                } else m_inventoryInfo += "," + m_inventoryTo.getDocumentNo();
            }
            log.info("createDifferenceDoc - Scrapped=" + confirm.getScrappedQty());
            MInventoryLine line = new MInventoryLine(m_inventoryTo, mLine.getM_LocatorTo_ID(), mLine.getM_Product_ID(), mLine.getM_AttributeSetInstance_ID(), confirm.getScrappedQty(), Env.ZERO);
            line.setDescription(Msg.translate(getCtx(), "ScrappedQty"));
            if (!line.save(get_TrxName())) {
                m_processMsg += "Inventory Line not created";
                return false;
            }
            confirm.setM_InventoryLine_ID(line.getM_InventoryLine_ID());
        }

        if (noRoot) {
            final int ll = linsAtLevel[nLevels - 1] + 2;
            linsAtLevel[nLevels - 1] = ll;
            v -= lc2[ll] + lg2;
        }

        if (POSTGRESQL.equals(databaseType(url))) {
            baseUrl.append("/postgres");
        }

        if ((weightFlags & TWO_PASSES) != 0) {
            for (int i = ncomponents - 1; i >= 0; i--) {
                runOneComponent(comps[i], null, g, clip, LIGHTWEIGHTS);
            }
            for (int i = ncomponents - 1; i >= 0; i--) {
                runOneComponent(comps[i], null, g, clip, HEAVYWEIGHTS);
            }
        } else {
            for (int i = ncomponents - 1; i >= 0; i--) {
                runOneComponent(comps[i], null, g, clip, weightFlags);
            }
        }

        if (!ExternalSystemApiUtil.isJavaCompatibleIde()) return null;

        if (new SystemEnvironment().get(SystemEnvironment.GO_SERVER_SCHEDULED_PIPELINE_LOADER_GLOBAL_MATERIAL_LOOKUP)) {
            configuredMaterial = currentConfig.materialConfigFor(fingerprint);
            if (configuredMaterial != null) {
                configuredMaterials.add((configuredMaterial));
            }
        }

        if (tvShow.isNewlyAdded() && !tvShow.isScraped()) {
            newTvShows.add(tvShow);
            continue;
        }

        if (isSelected) {
            super.setForeground(fg == null ? table.getSelectionForeground() : fg);
            super.setBackground(bg == null ? table.getSelectionBackground() : bg);
        } else {
            Color background = unselectedBackground != null ? unselectedBackground : table.getBackground();
            if (background == null || background instanceof javax.swing.plaf.UIResource) {
                final Color alternateColor = UIManager.getColor("Table.alternateRowColor");
                if (alternateColor != null && row % 2 == 0) {
                    background = alternateColor;
                }
            }
            super.setForeground(unselectedForeground != null ? unselectedForeground : table.getForeground());
            super.setBackground(background);
        }

        if (gear.shieldCharge() > gear.maxShields()) {
            ActionFX.applyShieldFX(gear.outfitType(), this, null, false);
        }

        if (block.getChild(0).getKind() == CAstNode.BLOCK_STMT && start == 0) {
            for (start_inner = 0; start_inner < block.getChild(0).getChildCount(); ++start_inner)
                if (NodePos.inSubtree(startNode.getChild(), block.getChild(0).getChild(start_inner)))
                    return Pair.make(block, new TwoLevelExtractionRegion(start, end, start_inner, end_inner, Collections.singletonList(parmName), locals));
        } else if (block.getChild(start).getKind() == CAstNode.LOCAL_SCOPE && end == start + 1) {
            return Pair.make(block, new TwoLevelExtractionRegion(start, end, 0, -1, Collections.singletonList(parmName), locals));
        }

        if (File.separatorChar != '/') {
            name = name.replace(File.separatorChar, '/');
            path = path.replace(File.separatorChar, '/');
        }

        if (item.isDeleted()) {
            return $e("header", $a("status", "deleted"), $eTxt("identifier", item.getId()), $eTxt("datestamp", repository.toSupportedGranularity.apply(item.getModificationDate())));
        } else {
            return $e("header", $eTxt("identifier", item.getId()), $eTxt("datestamp", repository.toSupportedGranularity(item.getModificationDate())));
        }

        if (m.getType() == VariableDemographicModel.Type.LINEAR) {
            for (int k = 0; k < tps.length; ++k) {
                final double dt = (tps[k] - (k > 0 ? tps[k - 1] : 0));
                popMean += dt * (vals[k + 1] + vals[k]);
            }
            popMean /= (2 * len);
        } else {
            for (int k = 0; k < tps.length; ++k) {
                final double dt = (tps[k] - (k > 0 ? tps[k - 1] : 0));
                popMean += dt * vals[k];
            }
            popMean /= len;
        }

        if (name.equals("selected")) {
            int ic = myTabbedPane.getActiveTabIndex();
            if (ic >= 0) {
                Component c = myTabbedPane.getComponent(ic);
                TipiComponent tc = getChildByContainer(c);
                return tc;
            } else {
                return null;
            }
        }

        if (arg instanceof Collection) {
            Collection<?> c = (Collection<?>) arg;
            List<Object> transformed = new ArrayList<>(c.size());
            boolean hasChanged = false;
            for (Object e : c) {
                Object next = doTransformExpression(e, traversal);
                if (!e.equals(next)) {
                    hasChanged = true;
                } else {
                    next = e;
                }
                transformed.add(next);
            }
            return hasChanged ? transformed : arg;
        }

        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) throw new IndexOutOfBoundsException();

        if (Float.isNaN(firstx) || Float.isNaN(lastx) || Float.isNaN(firsty) || Float.isNaN(lasty)) {
            if (!compatibleUnits) {
                CoordinateSystem cs = spatialSet.getCoordinateSystem();
                if (cs != null) {
                    if (cs instanceof EmpiricalCoordinateSystem) {
                        spatialSet = ((EmpiricalCoordinateSystem) cs).getReferenceSet();
                        spatialType = ((SetType) spatialSet.getType()).getDomain();
                        setUnits = spatialSet.getSetUnits();
                    } else {
                        try {
                            spatialSet = (GriddedSet) Util.convertDomain(spatialSet, spatialReferenceType, null);
                            spatialType = ((SetType) spatialSet.getType()).getDomain();
                            setUnits = spatialSet.getSetUnits();
                        } catch (RemoteException re) {
                            throw new VisADException("Couldn't convert domain");
                        }
                    }
                    isLatLonDomain = true;
                    domainCoords = spatialSet.getSamples(false);
                } else {
                    throw new VisADException("unable to make slice");
                }
            }
            savedEndpoints = Unit.convertTuple(savedEndpoints, new Unit[]{CommonUnit.degree, CommonUnit.degree, CommonUnit.meter}, refUnits, false);
            firstx = savedEndpoints[lonIndex][p];
            lastx = savedEndpoints[lonIndex][p + 1];
            firsty = savedEndpoints[latIndex][p];
            lasty = savedEndpoints[latIndex][p + 1];
        }

        if (e.detail == SWT.TRAVERSE_TAB_PREVIOUS && e.widget instanceof WebSite) {
            browser.traverse(SWT.TRAVERSE_TAB_PREVIOUS, e);
            e.doit = false;
        }

        if (rc instanceof RTIbasedResourceConfiguration) {
            resource.setRTI(((RTIbasedResourceConfiguration) rc).getRTI());
        }

        if (getServerSession().getServerPlatform().getClass().getName().contains("WebLogic")) {
            query.getResultList();
        }

        if (child instanceof AppCompatTextView || (i + 1 < childCount && parent.getChildAt(i + 1) instanceof AppCompatTextView))
            continue;

        if (undoEntities) {
            this.speed = 0;
        }

        if (someConstraints != null && aComponent.getConstraints() != null) {
            aComponent.getConstraints().ignoreNotif = true;
            aComponent.getConstraints().setsWith(someConstraints);
            aComponent.getConstraints().ignoreNotif = false;
        }

        if (Globals.prefs.fileDirForDatabase != null) dir = Globals.prefs.fileDirForDatabase;
        else dir = Globals.prefs.get(GUIGlobals.FILE_FIELD + "Directory");

        if (DeploymentTypeMarker.isType(DeploymentType.WAR, deploymentUnit) || deploymentUnit.getName().endsWith(".jar")) {
            final ServiceName moduleContextServiceName = ContextNames.contextServiceNameOfModule(moduleDescription.getApplicationName(), moduleDescription.getModuleName());
            bindBeanManager(serviceTarget, beanManagerServiceName, moduleContextServiceName, dependencies, phaseContext.getServiceRegistry());
        }

        if (getKey) {
            this.initGetKeyFunction();
        }

        if (connectorType.getConnectorHost() != null) {
            if (foundConnectorType.getConnectorHost() == null) {
                connectorType.setConnectorHostRef(ObjectTypeUtil.createObjectRef(connectorType.getConnectorHost().getOid(), ObjectTypes.CONNECTOR_HOST));
                connectorType.setConnectorHost(null);
            }
        }

        if (!lenient && GrouperClientUtils.trimToEmpty(je.getMessage()).contains("undefined variable")) {
            String message = je.getMessage();
            Pattern exceptionPattern = Pattern.compile("^.*undefined variable (.*)");
            Matcher exceptionMatcher = exceptionPattern.matcher(message);
            if (exceptionMatcher.matches()) {
                message = "variable '" + exceptionMatcher.group(1) + "' is not defined in script: '" + script + "'";
            }
            throw new GcExpressionLanguageMissingVariableException(message, je);
        }

        if (stockOpenHelper != null) {
            stockOpenHelper.close();
        }

        if (di != null) {
            final String diName = di.value() == Void.class ? di.name() : ReflectionUtilities.getFullName(di.value());
            final ClassNode<?> cn = (ClassNode<?>) ch.getNode(cmb);
            final String cnS = cn.getFullName();
            if (!usages.contains(diName, cnS)) {
                usages.put(diName, cnS);
                if (!knownClasses.contains(cn)) {
                    knownClasses.add(cn);
                }
            }
        }

        if (hasAnnotationType(invocationElement.getMethod(), ANNOTATION_ERASED) && !isAmbientDeclaration(invocationElement.getMethod())) {
            print("null");
            return true;
        }

        if (ctx.parent instanceof Alter_specificationContext)
            alterStatement().defaultCharset = unquote_literal(ctx.charset_name().getText());

        if (View.isInitialised()) {
            MENU_SEPARATOR = new JMenuItem();
            POPUP_MENU_SEPARATOR = new ExtensionPopupMenuItem();
        } else {
            MENU_SEPARATOR = null;
            POPUP_MENU_SEPARATOR = null;
        }

        if (dumpMsgOnError) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            inputSource.getByteStream().reset();
            while (true) {
                int i = inputSource.getByteStream().read();
                if (-1 == i) {
                    break;
                }
                baos.write(i);
            }
            logger.severe(baos.toString("UTF-8"));
        }

        if (fullExtent == null) {
            IFeatureIterator itGeom = getFeatureIterator("SELECT " + getGeometryField(getLyrDef().getFieldGeometry()) + ", " + getLyrDef().getFieldID() + " FROM " + getLyrDef().getComposedTableName() + " " + getCompleteWhere());
            IGeometry geom;
            int cont = 0;
            while (itGeom.hasNext()) {
                geom = itGeom.next().getGeometry();
                if (cont == 0) fullExtent = geom.getBounds2D();
                else fullExtent.add(geom.getBounds2D());
                cont++;
            }
        }

        if (!isFormSubmitted((DynaActionForm) form)) {
            return setupForm(mapping, dynaForm, request);
        } else {
            return handleFormSubmission(mapping, dynaForm, request);
        }

        if (name.startsWith(PREFIX_GRIDRELATIVE)) {
            name = name.substring(PREFIX_GRIDRELATIVE.length());
        }

        if (!isFormSubmitted((DynaActionForm) form)) {
            Long id = (Long) dynaForm.get(Ibd.ID_PARAM);
            if (id == null || id <= 0) {
                return mapping.findForward(ERROR);
            }
            request.getSession().setAttribute(Ibd.MY_MEDICATION_PARAM, getIbdManager().getMyMedication(id));
            return mapping.findForward(INPUT);
        } else {
            return handleFormSubmission(mapping, dynaForm, request);
        }

        if (tileQuery != null) {
            this.tileQuery = tileQuery;
        } else {
            this.tileQuery = "select " + name + " from " + dbPath + " where zoom_level = ? AND tile_column = ? AND tile_row = ?";
        }

        if (_elapsed == -1) _elapsed = 0;
        else _elapsed += clock.dt;

        if (dwgObject instanceof DwgLayer) {
            this.addDwgLayer((DwgLayer) dwgObject);
        }

        if (val == null) {
            Class<?> pt = pd.getPropertyType();
            if (double.class.equals(pt) || Double.class.equals(pt)) {
                val = 0.0;
            }
        }

        if (LWJGLUtil.getPlatform() == LWJGLUtil.PLATFORM_WINDOWS) {
            Display.processMessages();
        }

        if (a instanceof IOHeavyRoot) {
            return new NameCachingRoot(a);
        }

        if (encounter == AdventureRequest.NOT_IN_A_FIGHT) {
            FightRequest.clearInstanceData();
            FightRequest.inMultiFight = false;
            FightRequest.choiceFollowsFight = false;
            return;
        }

        if (stepExecution.getStatus().isUnsuccessful()) {
            throw new JobExecutionException("Partition handler returned an unsuccessful step");
        }

        if (sessao.getAttribute("colecaoImovelSubCategoriasCadastradas") != null) {
            colecaoImovelSubCategoriasCadastradas = (Collection) sessao.getAttribute("colecaoImovelSubCategoriasCadastradas");
        } else {
            colecaoImovelSubCategoriasCadastradas = new ArrayList();
        }

        if (APIQueryReply.class.isAssignableFrom(w.apiResponseClass)) {
            Object total = PropertyUtils.getProperty(replyOrEvent, "total");
            if (total != null) {
                response.put("total", total);
            }
        }

        if (!validateLoginToken(username, token)) {
            throw new RuntimeException("Attempt to set a password for user '" + username + "' without a valid security token");
        }

        if (now - then > maxage) {
            LOG.info("Deleting " + tracker.getJobID());
            state.delete();
            tracker.delete();
            return true;
        }

        if (columnName == null || origCol == null) {
            return null;
        }

        if (CF > 0.5) {
            return 0;
        }

        if (unresolvedText == null) {
            return null;
        }

        if (decimal < other.decimal) result.precision = precision;
        else if (other.decimal < decimal) result.precision = other.precision;
        else result.precision = Math.min(precision, other.precision);

        if (ksdata.isRhel5()) {
            retval.append("/etc/init.d/messagebus restart" + NEWLINE);
            retval.append("/etc/init.d/haldaemon restart" + NEWLINE);
        }

        if (focusEnergy) {
            critStage++;
        }

        if (pretty) {
            retval = prettyPostProcess(retval);
        }

        if (getFirstComponent() != null) {
            getFirstComponent().setVisible(proportion > 0.0001f);
        }

        if (object instanceof FlexoObject) {
            setCurrentEditedObjectAsModuleView((FlexoObject) object);
        }

        if (n.getNotifier() instanceof Extension) {
            return;
        }

        if (isLegacyDataFrameworkEnabled() && (ojbLoadedClass || isTransientBO(dataObjectClass)) && !isKradDataManaged(dataObjectClass)) {
            return true;
        }

        if (firstCreate) {
            firstCreate = false;
        } else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

        if (modelObject == BPELPackage.eINSTANCE.getVariable()) {
            return "variable";
        }

        if (family.equals("itc zapfdingbats") && registry.equals("sun") && encoding.equals("fontspecific")) {
            registry = "adobe";
        }

        if (resource instanceof WrappedContentResource || !(resource instanceof BaseResourceEdit)) {
            return null;
        }

        if (baseURI.isEmpty()) {
            baseURI = "/";
        } else if (baseURI.charAt(0) != '/') {
            baseURI = "/" + baseURI;
        }

        if (!Options.isExperimentalSliderShrinking()) mergedSlider = null;

        if (!isPre) {
            if (trace) log.tracef("Notify eviction listeners for key=%s", key);
            notifier.notifyCacheEntriesEvicted(Collections.singleton(factory.create(key, value, previousMetadata)), ctx, this);
        }

        if (c == '\\') {
            boolean ok = true;
            boolean term = false;
            int j = i;
            for (ok = true; ok && j < st.length(); j++) {
                final char cc = st.charAt(j);
                if (cc == '\\') {
                    continue;
                } else if (cc == '$') {
                    term = true;
                    ok = false;
                } else {
                    ok = false;
                }
            }
            if (term) {
                final String foo = st.substring(i, j);
                sb.append(foo);
                i = j;
            }
        }

        if (operation.equals("edit") && !entity.isContaConjunta()) {
            for (Iterator<ContaConjunta> i = entity.getContasConjunta().iterator(); i.hasNext(); ) {
                if (i.next() != null) i.remove();
            }
        }

        if (configuration.isUsingMySqlCompatible()) {
            config.addDataSourceProperty("cachePrepStmts", "true");
            config.addDataSourceProperty("prepStmtCacheSize", "250");
            config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        }

        if (processSomeFilesWhileUserIsInactive(queue, progressUpdater, processInReadAction, project, processor)) {
            break;
        }

        if ("NAME".equals(rule1) && "ID".equals(rule2)) {
            rule2 = "NAME";
        } else if ("ID".equals(rule1) && "NAME".equals(rule2)) {
            rule1 = "NAME";
        }

        if (!values.containsKey(BodyColumns.MESSAGE_KEY)) {
            throw new IllegalArgumentException("Cannot insert body without MESSAGE_KEY");
        }

        if (requiredHostGroups.isEmpty()) {
            requiredHostGroups.addAll(topology.getHostGroupsForComponent(component));
        }

        if (filledIndex >= 0) {
            scanner.close();
            scanner = null;
            scans++;
            if (scans > MAX_SCANS_DURING_SEARCH) {
                break;
            }
            startRow = codec.getNextRowKey(rowResult.getRow(), filledIndex);
            scanner = timeSeriesTable.scan(startRow, endRow, fuzzyRowFilter);
        }

        if (System.getSecurityManager() == null) {
            try {
                Field famRunningField = fam.getClass().getDeclaredField("running");
                famRunningField.setAccessible(true);
                Field threadField = fam.getClass().getDeclaredField("thread");
                threadField.setAccessible(true);
                Thread famThread = (Thread) threadField.get(fam);
                if (famThread != null) {
                    famRunningField.setBoolean(fam, false);
                    famThread.interrupt();
                    fam.stop();
                }
            } catch (Exception e) {
                infolog.error("Error stopping FilesystemAlterationMonitor", e);
            }
        } else {
            infolog.warn("Unable to stop the FilesystemAlterationMonitor using workaround since a security manager is installed.");
        }

        if (isHistorical()) {
            return mutableTime.plusMillis(1);
        }

        if (includeValue) {
            populateWithValues(queryCache, results);
        } else {
            populateWithoutValues(queryCache, results);
        }

        if (current == null) {
            noadd = true;
            break;
        }

        if (invoker.isShowing()) {
            final Rectangle bounds = boundsProvider.provide();
            final Point los = invoker.getLocationOnScreen();
            lastBounds = new Rectangle(los.x + bounds.x, los.y + bounds.y, bounds.width, bounds.height);
        }

        if (subsetDef != null || srcScene.getProduct() != destScene.getProduct()) {
            return false;
        }

        if (WindowSystem.isCurrentWindowSystem(WindowSystem.AQUA) && (style & SWT.BORDER) == SWT.BORDER) {
            final AbstractComboButton revealButton = new AbstractComboButton(this, SWT.DOWN);
            revealButton.addSelectionListener(revealControlListener);
            revealButton.setTextControl(text);
            revealButton.setSize(SWT.DEFAULT, text.getSize().y);
            revealControl = revealButton;
            spacing = -5;
            revealControl.moveAbove(text);
        } else {
            final Button revealButton = new Button(this, SWT.ARROW | SWT.DOWN | (style & SWT.FLAT));
            revealButton.addSelectionListener(revealControlListener);
            revealControl = revealButton;
        }

        if (assignments != null) {
            for (ASN1Assignment assignment : assignments) {
                if (assignment.getLikelyLocation().containsOffset(offset)) {
                    return assignment;
                }
            }
        }

        if (model.getSize() > 0) {
            comboBox.setSelectedIndex(model.getSize() - 1);
        }

        if (entityClass == Blood2DView.class) {
            boolean showBlood = Boolean.parseBoolean(WtWindowManager.getInstance().getProperty("gamescreen.blood", "true"));
            if (!showBlood) {
                return null;
            }
        }

        if (!readingFiles) {
            readingFiles = true;
            for (File filtersFile : filtersFiles) {
                readFiltersFromFile(filtersFile);
            }
            filtersFiles.clear();
            readingFiles = false;
        }

        if (facetFieldCount.getCount() > 0) {
            FacetLabel facetLabel = new FacetLabel(facetFieldCount.getName(), facetFieldCount.getCount());
            facetLabel.setFilterQuery(facetField.getName() + ":\"" + facetFieldCount.getName() + "\"");
            facetLabelList.add(facetLabel);
            if (facetField.getName().equals(SearchFields.PUBLICATION_STATUS)) {
                if (facetLabel.getName().equals(IndexServiceBean.getUNPUBLISHED_STRING())) {
                    unpublishedAvailable = true;
                } else if (facetLabel.getName().equals(IndexServiceBean.getDRAFT_STRING())) {
                    draftsAvailable = true;
                } else if (facetLabel.getName().equals(IndexServiceBean.getDEACCESSIONED_STRING())) {
                    deaccessionedAvailable = true;
                }
            }
            if (facetField.getName().equals(SearchFields.METADATA_SOURCE)) {
                numMetadataSources++;
            }
        }

        if (OAuth2Constants.DISPLAY_CONSOLE.equalsIgnoreCase(display)) {
            processor.getAuthenticationSession().removeAuthNote(OAuth2Constants.DISPLAY);
            throw new AuthenticationFlowException(AuthenticationFlowError.DISPLAY_NOT_SUPPORTED, ConsoleDisplayMode.browserContinue(processor.getSession(), processor.getRefreshUrl(true).toString()));
        } else {
            return factory.create(processor.getSession());
        }

        if (requestBuilder instanceof JoinRequestBuilder) {
            executeJoinRequestAndSendResponse();
        } else if (request instanceof SearchRequest) {
            client.search((SearchRequest) request, new RestStatusToXContentListener<SearchResponse>(channel));
        } else if (requestBuilder instanceof SqlElasticDeleteByQueryRequestBuilder) {
            throw new UnsupportedOperationException("currently not support delete on elastic 2.0.0");
        } else if (request instanceof GetIndexRequest) {
            this.requestBuilder.getBuilder().execute(new GetIndexRequestRestListener(channel, (GetIndexRequest) request));
        } else {
            throw new Exception(String.format("Unsupported ActionRequest provided: %s", request.getClass().getName()));
        }

        if (w10nRequest.variableWasRequested()) {
            Element dataset = besResponse.getRootElement();
            Iterator<String> reqVarIter = w10nRequest.getRequestedVariableNameVector().iterator();
            Element requestedVariableElement = childSearchWorker(dataset, reqVarIter);
            if (requestedVariableElement.getName().equalsIgnoreCase("Grid") || requestedVariableElement.getName().equalsIgnoreCase("Structure") || requestedVariableElement.getName().equalsIgnoreCase("Sequence")) {
                dataset.removeContent();
                @SuppressWarnings("unchecked") List<Element> varsAndAttrs = requestedVariableElement.getChildren();
                Vector<Element> containerContents = new Vector<>();
                containerContents.addAll(varsAndAttrs);
                for (Element e : containerContents) {
                    e.detach();
                    dataset.addContent(e);
                }
                isNode = true;
            } else {
                dataset.removeContent();
                requestedVariableElement.detach();
                dataset.addContent(requestedVariableElement);
                isNode = false;
            }
            XMLOutputter xmlo = new XMLOutputter(Format.getPrettyFormat());
            _log.debug("sendDap2MetadataAsW10nHtml() - Transforming modified dataset document: \n{}", xmlo.outputString(besResponse));
        }

        if (Validator.isNotNull(students) && students.size() > 0) {
            sql += " AND cr.userId in (-1";
            for (User user : students) {
                sql += "," + user.getUserId();
            }
            sql += ") ";
        } else {
            sql += " AND cr.userId not in ( SELECT userId FROM usergrouprole WHERE usergrouprole.groupId = " + course.getGroupCreatedId() + " AND usergrouprole.roleId in (" + teacherRoleId + "," + editorRoleId + "))";
        }

        if (nodehost.equals("localhost")) {
            return;
        }

        if (m_firstTuv) {
            m_firstTuv = false;
            if (p_tags.size() >= 6) {
                try {
                    HtmlObjects.Tag tag1 = (HtmlObjects.Tag) p_tags.get(0);
                    HtmlObjects.Tag tag2 = (HtmlObjects.Tag) p_tags.get(3);
                    String original1 = tag1.original;
                    String original2 = tag2.original;
                    if (original1.indexOf("span") >= 0 && original2.indexOf("span") >= 0 && original1.indexOf("mso-tab-count") >= 0 && original2.indexOf("mso-tab-count") >= 0) {
                        p_tags.remove(0);
                        p_tags.remove(0);
                        p_tags.remove(0);
                        p_tags.remove(0);
                        p_tags.remove(0);
                        p_tags.remove(0);
                    }
                } catch (Throwable ignore) {
                }
            }
        }

        if (movie.getTitle().isEmpty()) {
            LOGGER.error("won't rename movie '" + movie.getPathNIO() + "' / '" + movie.getTitle() + "' not even title is set?");
            return;
        }

        if (isSelect()) {
            mDistinct = true;
        }

        if (newPort < 0 && endpoint.isIPv4()) {
            newPort = endpoint.getListenPort();
        }

        if (selected) {
            super.setBounds(x - 2, y + 1, width + 2, height - 1);
        } else {
            super.setBounds(x - 2, y - 1, width + 2, height + 1);
        }

        if (model != null && vmInfoBuildUtils.isFirstMasterController(model)) {
            devices.add(0, struct);
        } else {
            devices.add(struct);
        }

        if ("clean".equals(name) || "cleanxml".equals(name)) {
            prefixes = new String[]{"clean", "cleanxml"};
        }

        if (event.isControlDown() || event.isAltDown()) {
            return keyCodes;
        }

        if (!getConfig().getPlacementConfig().hasPosition()) {
            throw new NotAvailableException("Position");
        }

        if (persistMgr instanceof CachingPersistenceManager) {
            ((CachingPersistenceManager) persistMgr).onExternalUpdate(external);
        }

        if (inputBuffer.lastValid == 0 && socketWrapper.getLastAccess() > -1) {
            int firstReadTimeout;
            if (keepAliveTimeout == -1) {
                firstReadTimeout = 0;
            } else {
                long queueTime = System.currentTimeMillis() - socketWrapper.getLastAccess();
                if (queueTime >= keepAliveTimeout) {
                    firstReadTimeout = 1;
                } else {
                    firstReadTimeout = keepAliveTimeout - (int) queueTime;
                }
            }
            socketWrapper.getSocket().setSoTimeout(firstReadTimeout);
            if (!inputBuffer.fill()) {
                throw new EOFException(sm.getString("iib.eof.error"));
            }
            if (endpoint.getSoTimeout() > 0) {
                setSocketTimeout(endpoint.getSoTimeout());
            } else {
                setSocketTimeout(0);
            }
        }

        if (src.hasModifier()) ce.setIsModifier(src.isModifier());

        if (relUrl.startsWith("?")) relUrl = base.getPath() + relUrl;

        if (values == null) {
            List<Element> elementList = loco.getChildren("CVvalue");
            if (elementList != null) {
                values = loco;
            }
        }

        if (!nomeMetodo.substring(0, 3).equals("get")) continue;

        if (!selfStatus.isValid() && count == 0) {
            lblText.setText(String.format("Alternative is not valid."));
            lblIcon.setImage(IconSetResources.getImage(IconSetResources.WARNING));
        } else {
            lblText.setText(msg);
            lblIcon.setImage(image);
        }

        if (objectMapper.isEnabled(SerializationFeature.INDENT_OUTPUT)) {
            jsonGenerator.useDefaultPrettyPrinter();
        }

        if (ssr == null && contig.equals("23")) {
            ssr = dict.getSequence("X");
        }

        if (cytoPanelState == cytoPanelState.FLOAT) {
            setDividerSize(0);
            dividerLocation = getDividerLocation();
        }

        if (this.channel == null) {
            return;
        }

        if (this.prefixToUriMap.containsKey(prefix)) {
            this.uriToPrefixMap.remove(this.prefixToUriMap.get(prefix));
            this.prefixToUriMap.remove(prefix);
        }

        if (!builder.hasOrganizationUuid()) {
            builder.setOrganizationUuid(defaultOrganizationUuid);
        }

        if (!simplePageBean.isStudentPage(currentPage)) {
            createGroupList(form, null, "", "#{simplePageBean.selectedGroups}");
        }

        if (Constants.Pref.Theme.DARK.equals(preferences.getTheme())) {
            return new ContextThemeWrapper(context, R.style.Theme_Keychain_Dark);
        } else {
            return new ContextThemeWrapper(context, R.style.Theme_Keychain_Light);
        }

        if (origin == null) {
            storage.putLong(0);
            return;
        }

        if (selectedRegistryActor.contains("Distributed")) {
            DistributedRemoteRegistryCache.registerWithRegistry(actor);
        } else {
            RemoteRegistryCache.registerWithRegistry(actor);
        }

        if (element.getAttribute("id").equals(JAVA_WIZARD_ID)) {
            image = StsUiImages.getImage(StsUiImages.NEW_JAVA_PROJECT);
        } else {
            if (iconLocation != null) {
                image = StsUiImages.getImage(ImageDescriptor.createFromURL(iconLocation));
            }
        }

        if (!attr.isShowAttributeInSearchCriteria()) {
            searchField.setFieldType(Field.HIDDEN);
        }

        if (ch == 0x30ff) ch = 0xf900;
        else if (ch == 0x10000) ch = 0x1d15e;
        else if (ch == 0x1d1c1) ch = 0x2f800;

        if (!state.willRunPredictiveAnimations() || getChildCount() == 0 || state.isPreLayout() || !supportsPredictiveItemAnimations()) {
            return;
        }

        if (invalidate) {
            this.address = null;
        }

        if (converter instanceof ParamNameConverter) {
            final Result result = DomUtil.getParentOfType(value, Result.class, false);
            if (result != null) {
                final ResultType resultType = result.getEffectiveResultType();
                if (resultType == null) {
                    return false;
                }
                final String resultTypeValue = resultType.getName().getStringValue();
                if (resultTypeValue != null && ResultTypeResolver.isChainOrRedirectType(resultTypeValue)) {
                    return false;
                }
            }
        }

        if (pathogenicitySources.isEmpty()) {
            return PathogenicityData.empty();
        }

        if (lrunning) {
            synchronized (app.getRunnables()) {
                app.getExecutedRunnables().clear();
                app.getExecutedRunnables().addAll(app.getRunnables());
                app.getRunnables().clear();
                for (int i = 0; i < app.getExecutedRunnables().size; i++) {
                    try {
                        app.getExecutedRunnables().get(i).run();
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                }
            }
            app.getInput().processEvents();
            frameId++;
            app.getApplicationListener().render();
        }

        if (selected != null && selected.size() > 0 && !(selected.get(0) instanceof EditPart)) return null;

        if (shouldIgnoreResource(resourceUri)) {
            return 0;
        }

        if ("".equals(uriValue)) {
            try {
                return getStreamData(doc);
            } catch (final IOException e1) {
                throw new URIReferenceException("Error obteniendo los octetos del XML: " + e1, e1);
            }
        }

        if (OS.VERSION_MMB >= OS.VERSION_MMB(10, 10, 0) && tray != null && tray.itemCount > 0) {
            NSString osxMode = NSUserDefaults.standardUserDefaults().stringForKey(NSString.stringWith("AppleInterfaceStyle"));
            if (osxMode != null && "Dark".equals(osxMode.getString())) {
                ignoreColorChange = true;
            }
        }

        if (base64mode && useUglyHackToForceCallToFlushInJava5 && out.limit() != MAX_BYTES_PER_CHAR * in.limit())
            return CoderResult.OVERFLOW;

        if (!layoutChunkResult.mIgnoreConsumed || mLayoutState.mScrapList != null || !state.isPreLayout()) {
            layoutState.mAvailable -= layoutChunkResult.mConsumed;
            remainingSpace -= layoutChunkResult.mConsumed;
        }

        if (false) {
            if (length < 0) {
                ByteStreamCache bs = new ByteStreamCache();
                bs.copyFrom(request.getInputStream());
                HttpEntity payloadEntity = new InputStreamEntity(bs.getInputStream(), bs.getLength());
                ((HttpEntityEnclosingRequest) method).setEntity(payloadEntity);
                return method;
            }
        }

        if (this.objectType instanceof ClassObjectType) {
            clazz = ((ClassObjectType) this.objectType).getClassType();
        } else {
            clazz = Fact.class;
        }

        if (FinderUtils.isAllResultsIsNodes(results)) {
            FinderUtils.sortNodeResultsByEditorPosition(results);
            monitor.advance(1);
        }

        if (strcmp(Machine.gamedrv.name, "gururin") == 0) {
            UBytePtr RAM = memory_region(REGION_CPU1);
            RAM.WRITE_WORD(0x1328, 0x4e71);
            RAM.WRITE_WORD(0x132a, 0x4e71);
            RAM.WRITE_WORD(0x132c, 0x4e71);
            RAM.WRITE_WORD(0x132e, 0x4e71);
        }

        if (templatesWithoutBlank.isEmpty()) {
            setCustomCompatibilityVersionChangeInProgress(false);
        }

        if (message.toString().startsWith("OUT OTH")) {
            getSession().setLoginStatus(TransportLoginStatus.DISCONNECTED);
            getSession().setFailureStatus(ConnectionFailureReason.LOCKED_OUT);
            getSession().sessionDisconnectedNoReconnect(LocaleUtils.getLocalizedString("gateway.msn.otherloggedin", "kraken"));
        } else if (message.toString().startsWith("OUT SDH")) {
            getSession().setLoginStatus(TransportLoginStatus.DISCONNECTED);
            getSession().setFailureStatus(ConnectionFailureReason.LOCKED_OUT);
            getSession().sessionDisconnectedNoReconnect(LocaleUtils.getLocalizedString("gateway.msn.disconnect", "kraken"));
        }

        if (log.isDebugEnabled()) {
            log.warn("Failed to shutdown the scheduler", t);
        } else {
            log.warn("Failed to shutdown the scheduler: " + t.getMessage());
        }

        if (Model.RUNTIME.isCollection(fpcf.getCollectionClass()) && (ff.cardinalityUPB <= 1)) {
            ff.cardinalityUPB = Integer.MAX_VALUE;
        }

        if (index == 0) {
            wait5seconds.until(visibilityOfElementLocated(By.className("address-hierarchy-shortcut")));
        }

        if (SNodeOperations.isInstanceOf(contextNode, MetaAdapterFactory.getInterfaceConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x2f89e470eed6258eL, "jetbrains.mps.baseLanguage.structure.IAnonymousClass"))) {
            contextNode = SNodeOperations.getParent(contextNode);
        }

        if (samlAssertionWrapper == null) {
            return;
        }

        if (kvpPair.toUpperCase().startsWith("FILTER")) {
            String filterVal = kvpPair.substring(7);
            if (LOGGER.isLoggable(Level.FINEST)) {
                LOGGER.finest("putting filter value " + filterVal);
            }
            kvps.put("FILTER", filterVal);
        } else if (kvpPair.toUpperCase().startsWith("SLD_BODY")) {
            String sldBodyVal = kvpPair.substring(9);
            kvps.put("SLD_BODY", sldBodyVal);
        } else {
            StringTokenizer requestValues = new StringTokenizer(kvpPair, VALUE_DELIMITER);
            if (requestValues.hasMoreTokens()) {
                key = requestValues.nextToken().toUpperCase();
                if (requestValues.hasMoreTokens()) {
                    value = requestValues.nextToken();
                    LOGGER.finest("putting kvp pair: " + key + ": " + value);
                    kvps.put(key, value);
                } else {
                    kvps.put(key, "");
                }
            }
        }

        if (rpcManager != null && !fromCluster) {
            TxCompletionNotificationCommand ftc = commandFactory.buildTxCompletionNotificationCommand(xid, gtx);
            rpcManager.invokeRemotely(lockOwners, ftc, rpcManager.getDefaultRpcOptions(sync, DeliverOrder.NONE));
        }

        if (workload == null) {
            this.applyParameterMappings(ProjectType.TPCC);
            File workload_file = this.getWorkloadFile(ProjectType.TPCC);
            workload = new Workload(catalog);
            ProcedureNameFilter filter = new ProcedureNameFilter(false);
            filter.include(TARGET_PROCEDURE);
            filter.attach(new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT));
            ((Workload) workload).load(workload_file, catalog_db, filter);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            if (!pref.getBoolean("freeform_hack_override", false)) {
                pref.edit().putBoolean("freeform_hack", hasFreeformSupport(context) && !hasPartialFreeformSupport()).putBoolean("save_window_sizes", false).putBoolean("freeform_hack_override", true).apply();
            } else if (!hasFreeformSupport(context)) {
                pref.edit().putBoolean("freeform_hack", false).apply();
                LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.farmerbb.taskbar.FINISH_FREEFORM_ACTIVITY"));
            }
        }

        if (cmd.getId().length() < ParserProperties.getInt(ParserProperties.COMMAND_MIN_LENGTH)) {
            return null;
        }

        if (getLevel() > 10) return 0;

        if (logger.isDebugEnabled()) logger.debug("/** @todo implement alertActionChanged() */=");

        if (sp instanceof com.sun.tools.javadoc.SourcePositionImpl) {
            FileObject fo = ((com.sun.tools.javadoc.SourcePositionImpl) sp).fileObject();
            if (fo == null) return;
            r = fo.openReader(true);
        } else {
            File file = sp.file();
            if (file == null) return;
            r = new FileReader(file);
        }

        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }

        if (m_progressDialog == null) {
            try {
                m_progressDialog = new ProgressDialog(NewGraphActivity.this);
                m_progressDialog.setMessage(getString(R.string.message_computing));
                m_progressDialog.setIndeterminate(true);
                m_progressDialog.setCancelable(false);
                m_progressDialog.show();
            } catch (Exception e) {
                m_progressDialog = null;
            }
        }

        if (key != null && !key.startsWith((LocaleVarContext.VAR_IDENTIFIER))) {
            EngineZildo.scriptManagement.putVarValue(key, value);
        }

        if (!Faces.hasContext()) {
            Faces.setContext(context);
        }

        if (!def.finished()) {
            def.setInput(EMPTYBYTEARRAY, 0, 0);
            def.setLevel(Deflater.NO_COMPRESSION);
            deflate();
            def.setLevel(Deflater.DEFAULT_COMPRESSION);
            deflate();
            out.flush();
        }

        if (databaseTablePrefix != null && databaseSchema == null && databaseTablePrefix.contains(".")) {
            databaseSchema = databaseTablePrefix.split("\\.")[0];
        }

        if (container instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) container;
            return new JvmKotlinType(typeMapper.mapType(classDescriptor), classDescriptor.getDefaultType());
        }

        if (space instanceof StepInterface) {
            log = ((StepInterface) space).getLogChannel();
        }

        if (this.isReflectionEnabled) {
            this.setMeasuredDimension((int) (this.getMeasuredWidth() * this.originalScaledownFactor), this.getMeasuredHeight());
        }

        if (existingBitstream != null) {
            bundleService.removeBitstream(context, targetBundle, existingBitstream);
        }

        if (list.size() == 1) {
            for (ECSAction action : list) {
                if (action.getName().equals("Scrap")) {
                    return null;
                }
            }
        }

        if (t instanceof RuntimeException) throw (RuntimeException) t;
        else if (t instanceof Error) throw (Error) t;
        else if (t instanceof IOException) throw (IOException) t;
        else if (t instanceof ServletException) throw (ServletException) t;
        else throw new RuntimeException(t);

        if (message == SslFilter.SESSION_SECURED) {
            ExtendedRequest req = LdapApiServiceFactory.getSingleton().newExtendedRequest("1.3.6.1.4.1.1466.20037", "SECURED".getBytes("ISO-8859-1"));
            message = req;
        } else if (message == SslFilter.SESSION_UNSECURED) {
            ExtendedRequest req = LdapApiServiceFactory.getSingleton().newExtendedRequest("1.3.6.1.4.1.1466.20037", "SECURED".getBytes("ISO-8859-1"));
            message = req;
        }

        if (!coll.wasInitialized() && coll.hasQueuedOperations()) {
            actionQueue.addAction(new QueuedOperationCollectionAction(coll, ce.getLoadedPersister(), ce.getLoadedKey(), session));
        }

        if (isValidAuthType(sqlInputs.getAuthenticationType())) {
            final StringBuilder dbUrlMSSQL = new StringBuilder(Constants.MSSQL_URL + host + COLON + sqlInputs.getDbPort() + SEMI_COLON + DATABASE_NAME_CAP + EQUALS + sqlInputs.getDbName());
            if (serverInstanceComponents != null) {
                dbUrlMSSQL.append(SEMI_COLON + INSTANCE + EQUALS).append(serverInstanceComponents[1]);
            } else if (isNoneEmpty(sqlInputs.getInstance())) {
                dbUrlMSSQL.append(SEMI_COLON + INSTANCE + EQUALS).append(sqlInputs.getInstance());
            }
            if (AUTH_WINDOWS.equalsIgnoreCase(sqlInputs.getAuthenticationType())) {
                dbUrlMSSQL.append(SEMI_COLON + INTEGRATED_SECURITY + EQUALS).append(TRUE);
            }
            final String connectionString = addSslEncryptionToConnection(sqlInputs.isTrustAllRoots(), sqlInputs.getTrustStore(), sqlInputs.getTrustStorePassword(), dbUrlMSSQL.toString());
            dbUrls.add(connectionString);
        } else {
            throw new SQLException(INVALID_AUTHENTICATION_TYPE_FOR_MS_SQL + sqlInputs.getAuthenticationType());
        }

        if (sourceLabelNodes != null && !sourceLabelNodes.isEmpty()) {
        }

        if ("yes".equalsIgnoreCase(response)) {
            final String message = messageService.createTodoVolunteerReceivedMessage(assignment.getTodo().getCreatedByUser(), assignment);
            notifications.add(new TodoInfoNotification(assignment.getTodo().getCreatedByUser(), message, todoLog));
        }

        if (dataset == null) throw new NullPointerException("Given dataset cannot be null.");

        if (record.getRecordType() == RecordType.AAAA) {
            try {
                recordEncoder.put(buf, record);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        if (keySpec.startsWith(PREFIX_HEX, labelEnd + 1)) {
            return true;
        }

        if (counter > 0) {
            tableScraper.getSelectionModel().setSelectionInterval(selectedIndex, selectedIndex);
        }

        if (TypeUtil.NUMBER_VECTOR_FIELD.isAssignableFromType(rel.getDataTypeInformation())) {
            @SuppressWarnings("unchecked") Relation<? extends NumberVector> vrel = (Relation<? extends NumberVector>) rel;
            ScalesResult.getScalesResult(vrel);
        }

        if (expr instanceof PsiPerlCommaSequenceExpr) {
            PsiElement currentElement = expr.getFirstChild();
            while (currentElement != null) {
                PsiElement keyElement = currentElement;
                if (isNullOrNotComma(currentElement = PerlPsiUtil.getNextSignificantSibling(currentElement))) {
                    break;
                }
                PsiElement valElement = PerlPsiUtil.getNextSignificantSibling(currentElement);
                if (valElement != null && StringUtil.equals("extends", ElementManipulators.getValueText(keyElement))) {
                    return ElementManipulators.getValueText(valElement);
                }
                if (isNullOrNotComma(currentElement = PerlPsiUtil.getNextSignificantSibling(currentElement))) {
                    break;
                }
                currentElement = PerlPsiUtil.getNextSignificantSibling(currentElement);
            }
        }

        if (oldTaskTestResult != null) {
            if (!oldTaskTestResult.getPassedAll()) {
                user.addSolvedTask(taskId, newTaskTestResult);
            } else if (newTaskTestResult.getPassedAll()) {
                user.addSolvedTask(taskId, newTaskTestResult);
            }
        } else {
            user.addSolvedTask(taskId, newTaskTestResult);
        }

        if ("dontshowagainselected".equals(key) && value == null) {
            value = data.get("dontshowagain");
        }

        if (!viewProj.getAbrev().endsWith(lyrProj.getAbrev())) {
            boolean showDialog = false;
            if (!RasterProjectionActionsPanel.selectAllFiles) showDialog = true;
            if (showDialog) {
                dialog = new RasterProjectionActionsDialog(lyr);
            } else {
                if (defaultActionLayer == FileOpenRaster.REPROJECT && !lyr.isReproyectable())
                    dialog = new RasterProjectionActionsDialog(lyr);
            }
            int select = defaultActionLayer;
            if (dialog != null) select = dialog.getRasterProjectionActionsPanel().getSelection();
            actionList.add(new Integer(select));
            return;
        }

        if (++offset < len) {
            num = (num * 10) + (digitChars[offset] - '0');
            if (++offset < len) {
                num = (num * 10) + (digitChars[offset] - '0');
                if (++offset < len) {
                    num = (num * 10) + (digitChars[offset] - '0');
                    if (++offset < len) {
                        num = (num * 10) + (digitChars[offset] - '0');
                        if (++offset < len) {
                            num = (num * 10) + (digitChars[offset] - '0');
                            if (++offset < len) {
                                num = (num * 10) + (digitChars[offset] - '0');
                                if (++offset < len) {
                                    num = (num * 10) + (digitChars[offset] - '0');
                                    if (++offset < len) {
                                        num = (num * 10) + (digitChars[offset] - '0');
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!builtInXmlSerializationSupportsCRs()) {
            xmiStr = xmiStr.replaceAll("&#10;", "&#13;&#10;");
        }

        if (!AuditUtil.getAuthZId(authZ.getReqDN()).equalsIgnoreCase("People")) {
            auditList.add(authZ);
        }

        if (aTarget.isBuiltIn() && aTarget.getName().equals(POS.class.getName())) {
            attachingLayers.add(aAnnotationService.getLayer(Dependency.class.getName(), aTarget.getProject()));
        }

        if (method != null) {
            try {
                method.invoke(null, parent, childs, tipo);
            } catch (Exception e) {
            }
        }

        if (styleDeclaration_ == null) {
            final String uri = getDomNodeOrDie().getPage().getWebResponse().getWebRequest().getUrl().toExternalForm();
            final String styleAttribute = jsElement_.getDomNodeOrDie().getAttribute("style");
            final InputSource source = new InputSource(new StringReader(styleAttribute));
            source.setURI(uri);
            final ErrorHandler errorHandler = getWindow().getWebWindow().getWebClient().getCssErrorHandler();
            final CSSOMParser parser = new CSSOMParser(new SACParserCSS3());
            parser.setErrorHandler(errorHandler);
            try {
                styleDeclaration_ = parser.parseStyleDeclaration(source);
            } catch (final IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (ContentType.APPLICATION_FORM_URLENCODED.getMimeType().equals(contentType)) {
            List<NameValuePair> entries = new ArrayList<>();
            Enumeration<String> names = servletRequest.getParameterNames();
            while (names.hasMoreElements()) {
                String name = names.nextElement();
                entries.add(new BasicNameValuePair(name, servletRequest.getParameter(name)));
            }
            return new UrlEncodedFormEntity(entries, servletRequest.getCharacterEncoding());
        }

        if (!config.getBoolean(GuiceProperties.UNIT_TEST, false)) {
            final ClassScanner scanner = scannerFactory.getInstance();
            if (scanner == null)
                throw new IllegalArgumentException("No classpath scanner available, missing scan.packages?");
            if (config.getBoolean(GuiceProperties.ROLE_JAXRS_SERVER_AUTO, true)) {
                modules.add(new JAXRSAutoRegisterServicesModule(config, scannerFactory));
            }
            {
                {
                    List<String> authProviderNames = config.getList(GuiceProperties.AUTH_PROVIDER_NAMES, null);
                    if (authProviderNames == null || authProviderNames.size() == 0) {
                        authProviderNames = new ArrayList<>();
                        if (config.containsKey(GuiceProperties.AUTH_JWT_SECRET))
                            authProviderNames.add(GuiceConstants.JAXRS_SERVER_WEBAUTH_JWT_PROVIDER);
                        if (config.containsKey(GuiceProperties.OAUTH2_CLIENT_ENDPOINT)) {
                            authProviderNames.add(GuiceConstants.JAXRS_SERVER_WEBAUTH_OAUTH2_PROVIDER);
                        } else {
                            authProviderNames.add(GuiceConstants.JAXRS_SERVER_WEBAUTH_SERVLET_PROVIDER);
                        }
                    }
                    if (authProviderNames.contains(GuiceConstants.JAXRS_SERVER_WEBAUTH_OAUTH2_PROVIDER))
                        modules.add(new OAuth2ClientModule());
                    modules.add(new WebappAuthenticationModule(metrics, authProviderNames, config));
                }
                if (config.getBoolean(GuiceProperties.AUTH_ENABLED, true))
                    modules.add(new AuthConstraintInterceptorModule(metrics, config));
            }
        }

        if (rotation1 == rotation2) {
            marker.setRotation(rotation1);
            marker.draw(g, affineTransform, startP, null);
        } else {
            rotation1 = (float) pl.angleAtLength(aLength + 1);
            rotation2 = (float) pl.angleAtLength((float) (aLength + size + 1));
            if (flipAll) {
                startP = new FPoint2D(pl.pointAtLength(aLength + 1));
            } else {
                startP = new FPoint2D(pl.pointAtLength(aLength + size + 1));
                rotation1 += Math.PI;
                rotation2 += Math.PI;
            }
            if (rotation1 == rotation2) {
                marker.setRotation(rotation1);
                marker.draw(g, affineTransform, startP, null);
            }
        }

        if (ex.getCause() instanceof java.io.IOException) {
            if (logger.isDebugEnabled()) logger.debug("Port " + preferredPort + " seems in use for either TCP or UDP.");
            int currentlyTriedPort = NetworkUtils.getRandomPortNumber();
            if (logger.isDebugEnabled()) logger.debug("Retrying bind on port " + currentlyTriedPort);
            this.createProvider(currentlyTriedPort, retries - 1, secure);
        } else throw ex;

        if (logger.isDebugEnabled()) logger.debug("!!! TODO: implement handleItemDeleted()!!!" + item);

        if (out instanceof TextWire) {
            out.addPadding((int) (PADDED_SIZE - 2 - out.bytes().position()));
        } else {
            out.addPadding((int) (PADDED_SIZE - out.bytes().position()));
        }

        if (urlStack == null) {
            urlStack = new LinkedList();
        }

        if (Logging.isDebug()) {
            Logging.logMessage(Logging.LEVEL_DEBUG, Category.misc, new Helper(), "Generated client UUID: %s", uuid);
        }

        if (rep.getRequiredCredentials() != null) {
            for (String requiredCred : rep.getRequiredCredentials()) {
                newRealm.addRequiredCredential(requiredCred);
            }
        } else {
            newRealm.addRequiredCredential(CredentialRepresentation.PASSWORD);
        }

        if (pieFile == null || this.file.isDirectory()) {
            PieLogger.info(this.getClass(), "Sciping new file: {}", this.file.getName());
            return;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setVisible(true);
        }

        if (!com.idega.core.accesscontrol.business.LoginBusinessBean.isLoggedOn(iwc)) {
            setSessionId(false);
        }

        if (applyExpr.isTypeCast()) {
            out.beginComment();
            applyExpr.getFun().visit(this);
            out.endComment();
        } else {
            applyExpr.getFun().visit(this);
        }

        if (File.separatorChar == '/') {
            url = url.replace('/', '\\');
            for (InterfaceDefinitionPart part : partList) {
                if ((rootInConfig + part.getUrl()).equalsIgnoreCase(url)) {
                    return getPartContent(part);
                }
            }
        } else if (File.separatorChar == '\\') {
            url = url.replace('\\', '/');
            for (InterfaceDefinitionPart part : partList) {
                if ((rootInConfig + part.getUrl()).equalsIgnoreCase(url)) {
                    return getPartContent(part);
                }
            }
        }

        if (state.getStatus() == ItemState.STATUS_EXISTING_REMOVED && state.getName().equals(NameConstants.JCR_UUID)) {
            NodeTypeRegistry ntReg = sessionContext.getNodeTypeRegistry();
            QPropertyDefinition def = ntReg.getEffectiveNodeType(NameConstants.MIX_REFERENCEABLE).getApplicablePropertyDef(state.getName(), state.getType());
            return sessionContext.getNodeTypeManager().getPropertyDefinition(def);
        }

        if (groupingInfos != null && groupingInfos.size() > 0) {
            ActiveMQServerLogger.LOGGER.groupBindingsOnRecovery();
        }

        if (number == 0) {
            PrismObject<UserType> jack = getUser(userJackOid);
            assertEquals("wrong new full name", yes ? "new full name 5" : "new full name 4", jack.asObjectable().getFullName().getOrig());
        } else {
            PrismObject<UserType> jack = getUser(userJackOid);
            if (yes) {
                assertNotAssignedRole(jack, roleRole28Oid);
            } else {
                assertAssignedRole(jack, roleRole28Oid);
            }
        }

        if (!((ns.getOwner() == null) && ns.getName().equals("root"))) {
            qName = ns.getName() + "::" + qName;
        }

        if (str.charAt(0) == '#') {
            int i = str.indexOf("spec=");
            if (i > 0) {
                if (str.indexOf("type=\"stepwise\"") > 0) {
                    m_type = Type.STEPWISE;
                } else if (str.indexOf("type=\"linear\"") > 0) {
                    m_type = Type.LINEAR;
                }
            }
        }

        if (pCidade != null) {
            if (bairroTemporario != null) {
                if (pCidade != getBairro().getCidade()) {
                    limparBairro();
                }
            }
            if (pCidade == null) {
                limparCidade();
            } else {
                cidadeTemporaria = pCidade;
                if (isInstanciaCidadeCriada()) {
                    getCampoInstCidade().setValor(pCidade);
                }
            }
        }

        if (b1 != b2 && !b1.hasTag(WILDCARD) && !b2.hasTag(WILDCARD)) {
            Pair<Type, Type> commonSupers = infer.getParameterizedSupers(b1, b2);
            if (commonSupers != null) {
                List<Type> allParamsSuperBound1 = commonSupers.fst.allparams();
                List<Type> allParamsSuperBound2 = commonSupers.snd.allparams();
                while (allParamsSuperBound1.nonEmpty() && allParamsSuperBound2.nonEmpty()) {
                    if (!allParamsSuperBound1.head.hasTag(WILDCARD) && !allParamsSuperBound2.head.hasTag(WILDCARD)) {
                        isSameType(inferenceContext.asUndetVar(allParamsSuperBound1.head), inferenceContext.asUndetVar(allParamsSuperBound2.head), infer);
                    }
                    allParamsSuperBound1 = allParamsSuperBound1.tail;
                    allParamsSuperBound2 = allParamsSuperBound2.tail;
                }
                Assert.check(allParamsSuperBound1.isEmpty() && allParamsSuperBound2.isEmpty());
            }
        }

        if (resultado != null) {
            copiaDados(resultado);
        }

        if (dir == direction) {
            return this;
        }

        if (log.isDebugEnabled()) {
            log.debug("Called sender to issue a passive broadcast");
        }

        if (idCodigo18 != null && !idCodigo18.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo18, informarNaoEntregaDocumentosActionForm.getQtTentativas18(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento18(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (secured && ActorProxyFactory.getInheritedAnnotation(Remoted.class, method) == null) {
            Log.Warn(null, "method not @Remoted " + actor.getClass().getSimpleName() + "#" + methodName);
            return false;
        }

        if (String.valueOf(termProperties.get("available_as_tag")).equals("false")) {
            throw new InvalidPayloadException("Attempted to tag an entity with a term which is not available to be tagged");
        }

        if (t.field != nt.field) {
            if (t.field != 0) {
                YType tmp = new YType(0);
                tmp.ref = nt;
                nt = tmp;
            }
            nt.field = t.field;
            nt.flags = t.flags;
        }

        if (tourData.isTourDeleted) {
            return;
        }

        if (existingBitstream != null) {
            targetBundle.removeBitstream(existingBitstream);
        }

        if (shipName.startsWith("bäähhhh")) {
            return KREUZER;
        } else if (shipName.contains("bäähhhh")) {
            return SCHLACHTKREUZER;
        } else if (shipName.startsWith("Zerst")) {
            return ZERRI;
        }

        if (dotp < -0.707106781186547) {
            dotp += 1.0;
        }

        if (number != null && !TextUtils.isEmpty(prohibitedPhoneNumberRegexp) && number.matches(prohibitedPhoneNumberRegexp)) {
            Log.d(TAG, "The phone number is prohibited explicitly by a rule.");
            if (getActivity() != null) {
                DialogFragment dialogFragment = ErrorDialogFragment.newInstance(R.string.dialog_phone_call_prohibited_message);
                dialogFragment.show(getFragmentManager(), "phone_prohibited_dialog");
            }
            return true;
        }

        if (value < 0) {
            return DatumFactory.createInt8((long) Math.ceil(value - 0.5d));
        } else {
            return DatumFactory.createInt8((long) Math.floor(value + 0.5d));
        }

        if (Build.VERSION.SDK_INT >= 26) {
            mImpl = new MediaBrowserImplApi26(context, serviceComponent, callback, rootHints);
        } else if (Build.VERSION.SDK_INT >= 23) {
            mImpl = new MediaBrowserImplApi23(context, serviceComponent, callback, rootHints);
        } else if (Build.VERSION.SDK_INT >= 21) {
            mImpl = new MediaBrowserImplApi21(context, serviceComponent, callback, rootHints);
        } else {
            mImpl = new MediaBrowserImplBase(context, serviceComponent, callback, rootHints);
        }

        if (targetNode instanceof Band) {
            final MetadataElement variableAttributes = sourceBand.getProduct().getMetadataRoot().getElement("Variable_Attributes");
            if (variableAttributes != null) {
                final MetadataElement element = variableAttributes.getElement(sourceBand.getName());
                if (element != null) {
                    final MetadataAttribute wavelengthAttribute = element.getAttribute("wavelength");
                    final MetadataAttribute bandwidthAttribute = element.getAttribute("bandwidth");
                    final Band targetBand = (Band) targetNode;
                    if (wavelengthAttribute != null) {
                        targetBand.setSpectralWavelength(wavelengthAttribute.getData().getElemFloat());
                    }
                    if (bandwidthAttribute != null) {
                        targetBand.setSpectralBandwidth(bandwidthAttribute.getData().getElemFloat());
                    }
                }
            }
        }

        if (data.strAddress.startsWith("1 ") || data.strAddress.startsWith("0 ")) {
            data.strAddress = data.strAddress.substring(2).trim();
            String cross = data.strCross;
            if (!cross.contains("/") && !cross.contains("&")) {
                data.strAddress = append(data.strAddress, " & ", cross);
                data.strCross = "";
            }
        }

        if ("content-disposition".equals(lKey) || "content-type".equals(lKey) || "content-transfer-encoding".equals(lKey) || !lKey.startsWith("content-")) {
            return key;
        } else {
            return key.substring("content-".length());
        }

        if (lookForCurrentCompactions(currentCompactions, ci)) {
            LOG.debug("Found currently initiated or working compaction for " + ci.getFullPartitionName() + " so we will not initiate another compaction");
            continue;
        }

        if (Env.ZERO.compareTo(confirm.getScrappedQty()) != 0) {
            MLocator locator = MLocator.get(getCtx(), movementLine.getM_LocatorTo_ID());
            if (inventoryTo != null && inventoryTo.getM_Warehouse_ID() != locator.getM_Warehouse_ID())
                inventoryTo = null;
            if (inventoryTo == null) {
                MWarehouse warehouse = MWarehouse.get(getCtx(), locator.getM_Warehouse_ID());
                inventoryTo = new MInventory(warehouse);
                inventoryTo.setDescription(Msg.translate(getCtx(), "M_MovementConfirm_ID") + " " + getDocumentNo());
                if (!inventoryTo.save(get_TrxName())) {
                    processMesssage += "Inventory not created";
                    return false;
                }
                if (getM_Inventory_ID() == 0) {
                    setM_Inventory_ID(inventoryTo.getM_Inventory_ID());
                    inventoryInfo = inventoryTo.getDocumentNo();
                } else inventoryInfo += "," + inventoryTo.getDocumentNo();
            }
            log.info("createDifferenceDoc - Scrapped=" + confirm.getScrappedQty());
            MInventoryLine inventoryLine = new MInventoryLine(inventoryTo, movementLine.getM_LocatorTo_ID(), movementLine.getM_Product_ID(), movementLine.getM_AttributeSetInstance_ID(), confirm.getScrappedQty(), Env.ZERO);
            inventoryLine.setDescription(Msg.translate(getCtx(), "ScrappedQty"));
            if (!inventoryLine.save(get_TrxName())) {
                processMesssage += "Inventory Line not created";
                return false;
            }
            confirm.setM_InventoryLine_ID(inventoryLine.getM_InventoryLine_ID());
        }

        if (returnType.contains("Event") && !returnType.contains("$") && !returnType.equals("class com.untangle.uvm.event.EventRule") && !methodName.equals("cause")) {
            printFields(returnTypeClazz, prefix + methodName + ".");
            continue;
        }

        if ("module-info.java".equals(sourceFile.getName())) {
            hasTestModuleDescriptor = true;
            break;
        }

        if ((Float.isNaN(val)) || (selector.getThing() != null && val == lastSelectedValue)) return;

        if (m_targetIndexName.startsWith(HSQLInterface.AUTO_GEN_PRIMARY_KEY_PREFIX) || m_targetIndexName.startsWith(HSQLInterface.AUTO_GEN_NAMED_CONSTRAINT_IDX) || m_targetIndexName.equals(HSQLInterface.AUTO_GEN_MATVIEW_IDX)) {
            indexDescription = " using its primary key index";
        }

        if (!isBlank(xmlString)) {
            xmlString = xmlString.replace(XMLNS, WORKAROUND);
            Map<String, String> result = xpathQueryAction.execute(xmlString, XML_DOCUMENT_SOURCE, xPathQuery, VALUE, DELIMITER, valueOf(true));
            if (result.containsKey(RETURN_CODE) && SUCCESS.equals(result.get(RETURN_CODE))) {
                queryMapResult.put(outputName, result.get(SELECTED_VALUE));
            } else {
                queryMapResult.put(RETURN_CODE, FAILURE);
                queryMapResult.put(EXCEPTION, result.get(ERROR_MESSAGE));
            }
        } else {
            queryMapResult.put(RETURN_RESULT, "Empty response.");
            queryMapResult.put(RETURN_CODE, FAILURE);
        }

        if (getGame() == null && isDoneSideboarding()) {
            checkIfMatchEnds();
        }

        if (item != null && getWorldConfig(player.getWorld()).blockUseAtFeet.test(item)) {
            if (Events.fireAndTestCancel(new UseBlockEvent(event, cause, player.getLocation().getBlock()))) {
                event.setCancelled(true);
            }
        }

        if (measureField.getDimensionName() != "") {
            retval.append("      <measure>").append(Const.CR);
            retval.append("        ").append(XMLHandler.addTagValue("measurename", measureField.getDimensionName()));
            if (measureField.getFieldName() == "") {
                retval.append("        ").append(XMLHandler.addTagValue("measurefieldname", "CHOOSE FIELD"));
            } else {
                retval.append("        ").append(XMLHandler.addTagValue("measurefieldname", measureField.getFieldName()));
            }
            retval.append("        ").append(XMLHandler.addTagValue("measurefieldtype", measureField.getFieldType()));
            retval.append("      </measure>").append(Const.CR);
        }

        if (state.blocks().disableStatePersistence()) {
            for (AllocatedIndex<? extends Shard> indexService : indicesService) {
                indicesService.removeIndex(indexService.index(), NO_LONGER_ASSIGNED, "cleaning index (disabled block persistence)");
            }
            return;
        }

        if (satellite_.isReactivatePending()) return;

        if (idCodigo7 != null && !idCodigo7.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo7, informarNaoEntregaDocumentosActionForm.getQtTentativas7(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento7(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (idsRegistrosRemocao == null || idsRegistrosRemocao.length < 1) {
            throw new ActionServletException("atencao.registros.nao_selecionados");
        } else {
            HttpSession sessao = httpServletRequest.getSession(false);
            Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioLogado");
            fachada.removerGrupo(idsRegistrosRemocao, usuarioLogado);
        }

        if (ce.getStatus() != 400 && ce.getStatus() != 404) {
            throw new RuntimeException(String.format("Status Code: <%s>", ce.getStatus()));
        } else {
        }

        if (key.length() > 255 || val.length() > 255) {
            if (_log.shouldLog(Log.WARN))
                _log.warn("Not passing on property [" + key + "] in the session config, key or value is too long (max = 255): " + val);
        } else {
            rv.setProperty(key, val);
        }

        if (workload == null) {
            File workload_file = this.getWorkloadFile(type);
            assertNotNull(workload_file);
            assert (workload_file.exists());
            workload = new Workload(catalog);
            Filter filter = new ProcedureLimitFilter(WORKLOAD_XACT_LIMIT);
            ((Workload) workload).load(workload_file, catalog_db, filter);
            File stats_file = this.getStatsFile(type);
            assertNotNull(stats_file);
            assert (stats_file.exists());
            stats = new WorkloadStatistics(catalog_db);
            try {
                stats.load(stats_file, catalog_db);
            } catch (AssertionError ex) {
                System.err.println("Failed to load " + stats_file.getAbsolutePath());
                throw ex;
            }
            this.applyParameterMappings(type);
            mappings_file = this.getParameterMappingsFile(type);
            assertNotNull(mappings_file);
            assert (mappings_file.exists());
            mappings = new ParameterMappingsSet();
            mappings.load(mappings_file, catalog_db);
        }

        if (version.equals("trunk")) {
            version = "latest";
        }

        if (affected < 0) {
            if (factory.getStatistics().isStatisticsEnabled()) {
                factory.getStatistics().optimisticFailure(lockable.getEntityName());
            }
            throw new StaleObjectStateException(lockable.getEntityName(), id);
        }

        if (RootClass.class.isInstance(metadata)) {
            if (metadata.hasSubclasses()) {
                metadata = (PersistentClass) metadata.getDirectSubclasses().next();
            } else {
                return singleTableEntityPersister();
            }
        }

        if (out > 1) {
            out = 1;
        }

        if (laneSection.isSetLeft()) {
            joinByLanes(roadNetwork, road, laneSection.getLeft().getLane(), Lanes.LaneSectionType.LEFT.isReverseDirection());
        }

        if (tourData.getDeviceName().equals("CM414AM")) {
            timeData.pulse = 0;
        }

        if (null == filterList || filterList.size() == 0) {
            logger.error("failed to initialize executor filter as the passed filter list is invalid or empty.");
            throw new IllegalArgumentException("filterList");
        }

        if (source.elementCount() == 0) {
            row = source.rowCount();
        }

        if (!"content-disposition".equals(lKey) && !"content-type".equals(lKey)) {
            if (!"content-transfer-encoding".equals(lKey)) {
                key = "Content-" + key;
            }
            multiWrite(writer, key, ": ", String.valueOf(entry.getValue()), EOL);
        }

        if (isUser) {
            if (!MacOSXPreferencesFile.syncUser()) {
                throw new BackingStoreException("Synchronization failed for node '" + path + "'");
            }
        } else {
            if (!MacOSXPreferencesFile.syncWorld()) {
                throw new BackingStoreException("Synchronization failed for node '" + path + "'");
            }
        }

        if (rawKvp.containsKey("sections")) {
            String value = (String) rawKvp.get("sections");
            LOGGER.info("Sections: " + value);
            EObject sections = Ows20Factory.eINSTANCE.createSectionsType();
            ((Collection) EMFUtils.get(sections, "section")).addAll(KvpUtils.readFlat(value, KvpUtils.INNER_DELIMETER));
            kvp.put("sections", sections);
        }

        if (!getText().equals(getDefaultText())) {
            return false;
        }

        if (pc == null) {
            pcCreated = true;
            ConfigWeb config = (ConfigWeb) ThreadLocalPageContext.getConfig();
            Pair[] parr = new Pair[0];
            pc = ThreadUtil.createPageContext(config, DevNullOutputStream.DEV_NULL_OUTPUT_STREAM, "localhost", "/", "", new Cookie[0], parr, parr, new StructImpl());
        }

        if (NodeUtil.isExpressionResultUsed(nameNode) && !NodeUtil.isGet(nameNode.getParent())) {
            expectSomeTypeInformation(nameNode);
        }

        if (ledbatConfig.slowStartEnabled && (cwnd <= ssThreshold * ledbatConfig.mss) && !thresholdIsSet) {
            thresholdIsSet = true;
            cwnd = cwnd * 0.5;
            lastTimeCwndHalved = now;
            ssThreshold = (long) (cwnd / ledbatConfig.mss);
            LOG.warn("First loss!   threshold set to  " + ssThreshold);
            reportLoss(now, cwnd);
            cwnd = Math.max(cwnd, getMinCwnd());
            return 1;
        } else if (now - lastTimeCwndHalved >= rtt) {
            cwnd = cwnd * 0.5;
            lastTimeCwndHalved = now;
            reportLoss(now, cwnd);
            cwnd = Math.max(cwnd, getMinCwnd());
            return -1;
        } else {
            return 0;
        }

        if (getSession().get(SessionParameter.ADD_NAME_ON_CHECK_IN, false)) {
            if (properties == null || properties.getPropertyList().isEmpty()) {
                properties = new PropertiesImpl();
                try {
                    String name = null;
                    ObjectData obj = getObjectInternal(repositoryId, IdentifierType.ID, objectId.getValue(), ReturnVersion.THIS, "cmis:objectId,cmis:name", Boolean.FALSE, IncludeRelationships.NONE, "cmis:none", Boolean.FALSE, Boolean.FALSE, null);
                    if (obj != null && obj.getProperties() != null && obj.getProperties().getProperties() != null && obj.getProperties().getProperties().get(PropertyIds.NAME) != null) {
                        PropertyData<?> nameProp = obj.getProperties().getProperties().get(PropertyIds.NAME);
                        if (nameProp.getFirstValue() instanceof String) {
                            name = (String) nameProp.getFirstValue();
                        }
                    }
                    if (name == null) {
                        throw new CmisRuntimeException("Could not determine the name of the PWC!");
                    }
                    ((PropertiesImpl) properties).addProperty(new PropertyStringImpl(PropertyIds.NAME, name));
                } catch (CmisBaseException e) {
                    throw new CmisRuntimeException("Could not determine the name of the PWC: " + e.toString(), e);
                }
            }
        }

        if (filePath.startsWith("file:/C")) {
            filePath = "file:///" + darFile.getAbsolutePath();
        } else if (filePath.startsWith("file:/")) {
            filePath = "file://" + darFile.getAbsolutePath();
        }

        if ((dsClassName != null && dsClassName.contains("Mysql")) || (jdbcUrl != null && jdbcUrl.contains("mysql")) || (dataSource != null && dataSource.getClass().getName().contains("Mysql"))) {
            netTimeoutExecutor = new SynchronousExecutor();
        } else {
            ThreadFactory threadFactory = config.getThreadFactory();
            threadFactory = threadFactory != null ? threadFactory : new DefaultThreadFactory(poolName + " network timeout executor", true);
            ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool(threadFactory);
            executor.setKeepAliveTime(15, SECONDS);
            executor.allowCoreThreadTimeOut(true);
            netTimeoutExecutor = executor;
        }

        if (flow.isEmbeddedFlow()) {
            continue;
        }

        if (MEETING.equals(type)) {
            LiveWireAlert alert = liveWireAlertBroker.load(alertUid);
            User mtgOrganizer = alert.getMeeting().getCreatedByUser();
            if (!mtgOrganizer.equals(user)) {
                menu.addMenuOption(menuUri("contact/name", alertUid) + "&contactUid=" + mtgOrganizer.getUid(), getMessage(LIVEWIRE, "contact", optionsKey + "mtg.org", user));
            }
        }

        if (bgn_tkn_len > new_tkn_len || new_tkn_len > 3) {
            bgn_tkn.Tkn_ini_pos(false, bgn_tkn.Src_end() - new_tkn_len, bgn_tkn.Src_end());
            keep_curly_bgn = 1;
        }

        if (ioe instanceof NotServingRegionException) {
            if (this.scanMetrics != null) {
                this.scanMetrics.countOfNSRE.incrementAndGet();
            }
            throw new DoNotRetryIOException("Resetting the scanner -- see exception cause", ioe);
        } else if (ioe instanceof RegionServerStoppedException) {
            throw new DoNotRetryIOException("Resetting the scanner -- see exception cause", ioe);
        } else {
            throw ioe;
        }

        if (item.task instanceof Queue.FlyweightTask) {
            return new FlyweightCauseOfBlockage();
        }

        if ("test401AssignTwoResouresBroken".equals(TEST_NAME)) {
            assertEquals("Expected partial error in result", OperationResultStatus.PARTIAL_ERROR, result.getStatus());
        }

        if (!performQueryEvaluation || predicate.evaluate(queryResource)) {
            Map<String, Object> updateRequestProperties = new HashMap<>();
            updateRequestProperties.putAll(PropertyHelper.getProperties(queryResource));
            if (request.getProperties() != null && request.getProperties().size() != 0) {
                updateRequestProperties.putAll(request.getProperties().iterator().next());
            }
            requests.add(changeRequest(updateRequestProperties));
        }

        if (!sc.hasNextInt()) {
            String input = sc.next();
            if (input.equals("sdddddd")) {
                System.out.println("ddddddddd");
            } else if (input.equals("dsfdsfdf")) {
                System.out.println("dsfdfd");
            }
            System.exit(1);
        }

        if (beforeRev != null) {
            final String beforeName = beforeRev.getFile().getName();
            final String beforeAbsolutePath = beforeRev.getFile().getIOFile().getAbsolutePath();
            for (Change oldChange : changes) {
                ContentRevision rev = oldChange.getAfterRevision();
                if (rev != null && (rev.getFile().getName().equals(beforeName)) && rev.getFile().getIOFile().getAbsolutePath().equals(beforeAbsolutePath)) {
                    changes.remove(oldChange);
                    if (oldChange.getBeforeRevision() != null || c.getAfterRevision() != null) {
                        changes.add(new Change(oldChange.getBeforeRevision(), c.getAfterRevision()));
                    }
                    return;
                }
            }
        }

        if (costToBuy > 0) {
            if (newPrice > costToBuy + diff) {
                amountPrice -= newPrice - (costToBuy + diff);
                amountInMarket = Math.round(goodsType.getInitialAmount() * (initialPrice / amountPrice));
                logger.info("Clamped price rise for " + getId() + " from " + newPrice + " to " + (costToBuy + diff));
                newPrice = costToBuy + diff;
            } else if (newPrice < costToBuy - diff) {
                amountPrice += (costToBuy - diff) - newPrice;
                amountInMarket = Math.round(goodsType.getInitialAmount() * (initialPrice / amountPrice));
                logger.info("Clamped price fall for " + getId() + " from " + newPrice + " to " + (costToBuy - diff));
                newPrice = costToBuy - diff;
            }
            newSalePrice = newPrice - diff;
        }

        if (currentTupleWindowSize == tupleWindowSize) {
            currentTupleWindowSize--;
            removeLastFromWindow();
        }

        if ((style & StatusManager.BLOCK) == StatusManager.BLOCK || (style & StatusManager.SHOW) == StatusManager.SHOW) {
            if (status.getSeverity() == IStatus.INFO) {
                MessageDialog.openInformation(ProvUI.getDefaultParentShell(), ProvUIMessages.ProvUI_InformationTitle, status.getMessage());
                style = style & ~StatusManager.BLOCK;
                style = style & ~StatusManager.SHOW;
            } else if (status.getSeverity() == IStatus.WARNING) {
                MessageDialog.openWarning(ProvUI.getDefaultParentShell(), ProvUIMessages.ProvUI_WarningTitle, status.getMessage());
                style = style & ~StatusManager.BLOCK;
                style = style & ~StatusManager.SHOW;
            }
        }

        if ("org.backmeup.filesplitting".equals(action.getId())) {
            ad = new FilesplittDescribable();
        } else if ("org.backmeup.indexer".equals(action.getId())) {
            ad = new IndexDescribable();
        } else if ("org.backmeup.encryption".equals(action.getId())) {
            ad = new EncryptionDescribable();
        } else {
            ad = plugins.getActionById(action.getId());
        }

        if (isAddressContainsTx(address.getAddress(), tx)) {
            return true;
        }

        if (number == 0) {
            PrismObject<UserType> jack = getUser(userJackOid);
            assertEquals("wrong new full name", yes ? "new full name 2" : "new full name", jack.asObjectable().getFullName().getOrig());
        } else {
            PrismObject<UserType> jack = getUser(userJackOid);
            AssignmentType assignment1 = findAssignmentByTargetRequired(jack, roleRole29Oid);
            assertEquals("wrong new assignment description", yes ? "new description 2" : "new description", assignment1.getDescription());
        }

        if (thread instanceof IMIProcessDMContext) {
            getDebuggingContext(thread, new ImmediateDataRequestMonitor<IDMContext>(rm) {
                @Override
                protected void handleSuccess() {
                    if (getData() instanceof IMIContainerDMContext) {
                        IMIContainerDMContext containerDmc = (IMIContainerDMContext) getData();
                        IMIRunControl runControl = getServicesTracker().getService(IMIRunControl.class);
                        if (runControl != null && !runControl.isSuspended(containerDmc)) {
                            runControl.suspend(containerDmc, new ImmediateRequestMonitor(rm) {
                                @Override
                                protected void handleCompleted() {
                                    GDBProcesses_7_12.super.terminate(thread, rm);
                                }
                            });
                        } else {
                            GDBProcesses_7_12.super.terminate(thread, rm);
                        }
                    } else {
                        rm.done(new Status(IStatus.ERROR, GdbPlugin.PLUGIN_ID, INTERNAL_ERROR, "Invalid process context.", null));
                    }
                }
            });
        } else {
            super.terminate(thread, rm);
        }

        if (intent != null) {
            if (mNotificationManager == null)
                mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            if (ACTION_UPLOAD_ABORT.equals(intent.getAction())) {
                String filename = intent.getData().toString();
                Long msgId = queue.get(filename);
                if (msgId != null) {
                    if (msgId == mMessageId) {
                        mConn.abort();
                        mCanceled = true;
                    } else queue.remove(filename);
                }
                return START_NOT_STICKY;
            }
        }

        if (offset >= 0 && offset < labels.length) {
            return super.readLabel(offset, labels);
        } else {
            return INVALID;
        }

        if (!callDetails.get("PEER_NUMBER").contains("sips")) {
            if (confId == null || confId.isEmpty()) {
                confId = callId;
            }
            ArrayList<String> calls = confs.get(confId);
            if (calls == null) {
                calls = new ArrayList<>();
                confs.put(confId, calls);
            }
            calls.add(callId);
        }

        if (appDeploymentRequest.getCommandlineArguments().size() == 1) {
            specMap.put("version", appDeploymentRequest.getCommandlineArguments().get(0));
        } else {
            specMap.put("version", version);
        }

        if (obj == null || obj instanceof RandomFactory) {
            seed = null;
        } else if (obj instanceof Long) {
            seed = (Long) obj;
            obj = RandomFactory.get(seed);
        } else if (obj instanceof Number) {
            seed = Long.valueOf(((Number) obj).longValue());
            obj = RandomFactory.get(seed);
        } else if (GLOBAL_RANDOM_STR.equals(obj) || "global".equals(obj)) {
            obj = RandomFactory.DEFAULT;
        } else {
            try {
                seed = Long.valueOf(obj.toString());
                obj = RandomFactory.get(seed);
            } catch (NumberFormatException e) {
                throw new WrongParameterValueException("Wrong parameter format! Parameter \"" + getOptionID().getName() + "\" requires a long seed value or a random generator factory, read: " + obj + "!\n");
            }
        }

        if (_productionMaterial_Scrap != null) {
            return _productionMaterial_Scrap;
        }

        if (notBefore == null || notAfter == null) {
            long now = System.currentTimeMillis();
            notBefore = new Date(now);
            notAfter = new Date(now + duration);
        }

        if (obj instanceof de.hsos.richwps.mb.entity.oldVersions.ProcessPort) {
            Element nodeEl = (Element) node;
            String id = nodeEl.getAttribute(ATTR_REFERENCE_ID);
            IObjectWithProperties decodedObject = getDecodedObject(id);
            if (null != decodedObject) {
                return decodedObject;
            }
            de.hsos.richwps.mb.entity.oldVersions.ProcessPort decodedOldPort = (de.hsos.richwps.mb.entity.oldVersions.ProcessPort) obj;
            ProcessPort port;
            boolean isInput = decodedOldPort.isFlowInput();
            boolean isGlobal = decodedOldPort.isGlobal();
            ProcessPortDatatype datatype = decodedOldPort.getDatatype();
            if (isGlobal && isInput) {
                port = ProcessPortFactory.createGlobalInputPort(datatype);
            } else if (isGlobal && !isInput) {
                port = ProcessPortFactory.createGlobalOutputPort(datatype);
            } else if (!isGlobal && isInput) {
                port = ProcessPortFactory.createLocalInputPort(datatype);
            } else {
                port = ProcessPortFactory.createLocalOutputPort(datatype);
            }
            port.copyValuesFrom(decodedOldPort);
            obj = port;
        }

        if (shape.intersects(x - 2, y - 2, 4, 4)) return 0;

        if (!testCase.config.isPrivacyModelSpecified(TCloseness.class)) {
            final Hierarchy hierarchy = Hierarchy.create(testCase.dataset.substring(0, testCase.dataset.length() - 4) + "_hierarchy_" + testCase.sensitiveAttribute + ".csv", StandardCharsets.UTF_8, ';');
            testCase.config.addPrivacyModel(new HierarchicalDistanceTCloseness(testCase.sensitiveAttribute, 0.2d, hierarchy));
        }

        if (fatalErrorOccurred(result) && !HgErrorUtil.isAncestorMergeError(result)) {
            throw new VcsException(result.getRawError());
        }

        if (solver != null) {
            solver.setListeners(this.trainingListeners);
        }

        if (myBinaryLabel == null) {
            myBinaryLabel = new BinaryEditor();
            myBinaryLabel.setMaxImgWidth(max_img_width);
            myBinaryLabel.setMaxImgHeight(max_img_height);
            addPropertyComponent(myBinaryLabel);
        }

        if (server != null) {
            applicationServer.set(server);
        }

        if (!propertyId.equals("tag") && !propertyId.equals("type") && !propertyId.equals("/tag") && !propertyId.equals("/type") && !propertyId.equals("properties") && !propertyId.equals("properties_attributes")) {
            String propertyCategory = PropertyHelper.getPropertyCategory(propertyId);
            if (propertyCategory == null || !(propertyCategory.equals("properties") || PROPERTIES_ATTRIBUTES_PATTERN.matcher(propertyCategory).matches())) {
                unsupportedProperties.add(propertyId);
            }
        }

        if (parser.getName() == null) justStarted = false;

        if (joinLocation < 0) {
            connectingAtom = endOfChain;
        } else {
            connectingAtom = currentMolecule.getAtom(joinLocation);
        }

        if (variable) {
            if (isSameShape(bounds, aboveBounds)) {
                return AlmostBoolean.MAYBE;
            } else {
                return AlmostBoolean.YES;
            }
        }

        if (JVM.current().isOneDotFive()) {
            assureRectsCreated(tabPane.getTabCount());
        }

        if (fuel.getItem() == GeologicaItems.EARTHY_CLUMP) {
            if (GeologicaItems.EARTHY_CLUMP.getIndustrialMaterial(fuel) == GeoMaterial.PEAT) {
                return 400;
            }
        }

        if (thickPixel && !thisStraight) {
            if (prevStraight) {
                x1 += 0.5;
                y1 += 0.5;
            }
            if (isStraightLine(xPoints, yPoints, p + 1, nPoints)) {
                x2 += 0.5;
                y2 += 0.5;
            }
        }

        if (Scope.parent(pastedNode) != null) {
            Scope surroundingScope = Scope.getScope(Scope.parent(pastedNode), pastedNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
            if (surroundingScope != null && surroundingScope.contains(IVariableReference__BehaviorDescriptor.getVariable_idSORzhOpB6t.invoke(pastedNode))) {
                SNode variableReference = SNodeFactoryOperations.replaceWithNewChild(pastedNode, SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")));
                SLinkOperations.setTarget(variableReference, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration"), SNodeOperations.cast(IVariableReference__BehaviorDescriptor.getVariable_idSORzhOpB6t.invoke(pastedNode), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")));
            }
        }

        if (nick.endsWith("----")) {
            LOG.error("Unable to set nick: " + nick + " disconnecting");
        } else {
            LOG.warn("Unable to set nick: " + nick + " Retrying with " + nick + "-");
            connection.doNick(nick);
            joinChannels();
        }

        if (versionResult.getStderr().trim().startsWith("docker: Error response from daemon: Cannot start container")) {
            log.warning("Despite the fixed status of bug 1343139, employing selinux workaround to avoid: " + bug1343139ErrorMsg);
            String selinuxMode = client.runCommandAndWait("getenforce").getStdout().trim();
            client.runCommandAndWait("setenforce Permissive");
            versionResult = client.runCommandAndWait("docker run --rm " + dockerImage + " rpm -q subscription-manager");
            client.runCommandAndWait("setenforce " + selinuxMode);
        }

        if (!result) {
            Log.info(dbgmsg + "(): " + "failed to use AutoIt for clicking.");
            Log.info(dbgmsg + "(): " + "try to use Java AWT Robot to click.");
            try {
                result = robotClick(winGetPosX(title, text) + controlGetPosX(title, text, controlID) + getBorderWidth(title, text), winGetPosY(title, text) + controlGetPosY(title, text, controlID) + getTitleBarHeight(title, text), button, nClicks, offset, specialKey);
            } catch (Exception e) {
                Log.error(dbgmsg + "(): " + "failed to click with exception: '" + e.getMessage() + "'.");
                result = false;
            }
        }

        if (origAuthorName == null) origAuthorName = termAtt.toString();

        if (region instanceof LoopRegion) {
            for (IRegion r : u.getAssigns()) {
                if (!RegionUtils.isRegionContainsRegion(region, r)) {
                    return false;
                }
            }
        }

        if (t == s || t.qtype == s || s.tag == ERROR || s.tag == UNKNOWN) return true;

        if (dict == null) {
            dict = in.getFileHeader().getSequenceDictionary();
        } else if (dict.equals(in.getFileHeader().getSequenceDictionary())) {
            in.getFileHeader().setSequenceDictionary(dict);
        }

        if (a.getRepetition() != null && a.getRepetition() == 2) {
            log4j.info(MessageFormat.format("Record(ID={0}, price={1}, AdDate={2}, license plate={3}, register date={4}) not valid", a.getId(), a.getPrice(), a.getDateScraped(), a.getLicensePlate(), a.getDateRegisted()));
            continue;
        }

        if (downstreamDataSocket != null) {
            bos = downstreamSocketD.getOutputStream();
            output = new Output(bos);
        }

        if (sugWord.string.equals(word)) {
            continue;
        }

        if (reqCRS != null) {
            throw new WcsException("Request contains a GridCRS. Since this " + "server does not currently support coordinate transforms the" + "request is denied. You may request the coverage data in " + "its native CRS by simply omitting a GridCRS component from" + "the request. See 'OGC 07-067r5' Table 24 footnote d.", WcsException.INVALID_PARAMETER_VALUE, "wcs:GridCRS");
        }

        if (validator instanceof Java10Validator) {
            setLanguageLevel(JAVA_10);
        } else if (validator instanceof Java9Validator) {
            setLanguageLevel(JAVA_9);
        } else if (validator instanceof Java8Validator) {
            setLanguageLevel(JAVA_8);
        } else if (validator instanceof Java7Validator) {
            setLanguageLevel(JAVA_7);
        } else if (validator instanceof Java6Validator) {
            setLanguageLevel(JAVA_6);
        } else if (validator instanceof Java5Validator) {
            setLanguageLevel(JAVA_5);
        } else if (validator instanceof Java1_4Validator) {
            setLanguageLevel(JAVA_1_4);
        } else if (validator instanceof Java1_3Validator) {
            setLanguageLevel(JAVA_1_3);
        } else if (validator instanceof Java1_2Validator) {
            setLanguageLevel(JAVA_1_2);
        } else if (validator instanceof Java1_1Validator) {
            setLanguageLevel(JAVA_1_1);
        } else if (validator instanceof Java1_0Validator) {
            setLanguageLevel(JAVA_1_0);
        } else if (validator instanceof NoProblemsValidator) {
            setLanguageLevel(RAW);
        }

        if ((painter != null) || isNimbus()) {
            if (isOpaque()) {
                paintComponentWithPainter((Graphics2D) g);
            } else {
                paintPainter(g);
                super.paintComponent(g);
            }
        } else {
            super.paintComponent(g);
        }

        if (dataChoice instanceof DirectDataChoice) {
            DataSource dataSource = ((DirectDataChoice) dataChoice).getDataSource();
            if (dataSource instanceof AddeImageParameterDataSource) {
                if (dataChoice.getId() != null) {
                    return dataChoice.getId().toString();
                }
            }
        }

        if ("osgb:BNG".equalsIgnoreCase(sourceCRS.trim())) sourceCRS = "EPSG:27700";

        if (serviceTemplateInstanceID == -1) {
            serviceTemplateInstanceID = 1000 + (int) (Math.random() * (Integer.MAX_VALUE - 1000));
            correlationID = ServiceProxy.correlationHandler.getNewCorrelationID(csarID, serviceTemplateId, (int) serviceTemplateInstanceID, planEvent, true);
        } else {
            correlationID = ServiceProxy.correlationHandler.getNewCorrelationID(csarID, serviceTemplateId, (int) serviceTemplateInstanceID, planEvent, false);
        }

        if (!this.layoutConfigurado) {
            this.addCss(new File(arquivo.getParentFile(), "/css/relatorio.css"));
            this.addCabecalho(new File(arquivo.getParentFile(), "/cabecalho.html"));
            layoutConfigurado = true;
        }

        if (messageWaiting && !eventFired) {
            fireVoicemailNotificationEvent(MessageType.VOICE.toString(), messageAccount, 1, 0, 0, 0);
        }

        if (!method.isAccessible()) {
            method.setAccessible(true);
        }

        if (seriesSalesParsedData.hasAtLeastOneFieldFilled()) {
            seriesSalesImportService.saveParsedData(requestId, seriesSalesParsedData);
        }

        if (renderRequest.format.toString().equals("image/geotiff")) {
            GridCoverage2D gc = tile.getGridCoverage2D(image);
            return generateStreamingGeotiffResponse(gc);
        } else {
            return generateStreamingImageResponse(image, renderRequest.format);
        }

        if (!actionReport.hasFailures() || !actionReport.hasWarnings()) {
            actionReport.getSubActionsReport().clear();
        }

        if (strTokenText.countTokens() <= 1) {
            writer.println(sInputLine);
        } else {
            sMicroarrayExpressionDimensionIndex = sInputLine.substring(sInputLine.indexOf(delimiter) + 1, sInputLine.length());
            while (strTokenText.hasMoreTokens()) {
                writer.println(strTokenText.nextToken() + delimiter + sMicroarrayExpressionDimensionIndex);
            }
        }

        if (decimalPlaces == 0) decimalPlaces = -1;

        if (Build.VERSION.SDK_INT >= 27) {
            final ScanFilter sf = new ScanFilter.Builder().build();
            final List<ScanFilter> list = new ArrayList<>(1);
            list.add(sf);
            return list;
        }

        if (shard == null) {
            shard = (String) srsp.getSolrResponse().getResponse().get("shard");
        }

        if (Long.MAX_VALUE - payLoadSize < startPosition || Long.MAX_VALUE - payLoadSize > raf.length()) {
            throw new IOException("requesting read past end of stream");
        }

        if (completed && (binding.getScope() == Singleton.class || binding instanceof InstanceBinding)) {
            Hk2Helper.bind(getServiceLocator(), binding);
        } else {
            bindings.bind(binding);
        }

        if (resName == null) {
            if (a0 instanceof PDBAtom) {
                resName = ((PDBAtom) a0).getResName();
            } else {
                resName = idA.split("\\.")[0];
            }
        }

        if (referencePoint != null) {
            Long time = timeSupplier.get();
            if (time == null) {
                time = CURRENT_TIME_SUPPLIER.get();
            }
            return Duration.millis(time - referencePoint);
        } else {
            throw new IllegalStateException("Cannot calculate duration since sensor: " + entity + " missing required value for " + epochSensor);
        }

        if (attackerAbility.equals("Parental Bond")) {
            modifiers.add(1.5);
        }

        if (userId != null) {
            instance.schema = userId;
        }

        if (clusterCenter_ == null) {
            clusterCenter_ = new PositionPoint(p);
        }

        if (pos < text.length()) {
            char extra = text.charAt(pos);
            if (extra == '.' && getBooleanAttribute(DateFormat.BooleanAttribute.PARSE_ALLOW_WHITESPACE) && items.length != 0) {
                Object lastItem = items[items.length - 1];
                if (lastItem instanceof PatternItem && !((PatternItem) lastItem).isNumeric) {
                    pos++;
                }
            }
        }

        if (PuSize == 0) {
            if (QiSize == 0) {
                return new FloatWritable(0.f);
            } else {
                return new FloatWritable((float) Bi);
            }
        } else if (QiSize == 0) {
            return new FloatWritable(0.f);
        }

        if (newLeader.getName().equals(replica.getName())) continue;

        if (name.length() > 5) {
            setId(name.substring(0, 5));
        } else {
            setId(name);
        }

        if (template.getNodeTemplate() != null && template.getNodeTemplate().getId().equals(id)) {
            return template;
        }

        if (!pairCache.hasDeferredRemoval()) {
            pairCache.removeOverlappingPairsContainingProxy(pHandle, dispatcher);
        }

        if (oa.getLats() != null) {
            for (FeatureStructure lat : oa.getLats().toArray()) {
                boolean alreadyHave = false;
                if (bestAnswer.getLats() != null) {
                    for (FeatureStructure lat0 : bestAnswer.getLats().toArray()) {
                        if (((LAT) lat0).getTypeIndexID() == ((LAT) lat).getTypeIndexID() && ((LAT) lat0).getText().equals(((LAT) lat).getText())) {
                            alreadyHave = true;
                            break;
                        }
                    }
                }
                if (!alreadyHave && !(lat instanceof WordnetLAT))
                    logger.warn(".. losing {} <<{}>>", ((LAT) lat).getClass().getSimpleName(), ((LAT) lat).getText());
                ((LAT) lat).removeFromIndexes();
            }
        }

        if (acaovinculoMetodo != null) {
            ACOES_NOME_UNICO_BY_HASH_METODO.put(UtilSBController.gerarIDMetodoAcaoDoSistema(metodo), acaovinculoMetodo.getNomeUnico());
            METODO_BY_ACAO.put(acaovinculoMetodo.getNomeUnico(), metodo);
            METODOS_BY_HASH_METODO.put(UtilSBController.gerarIDMetodoAcaoDoSistema(metodo), metodo);
        }

        if (m_myHostId == 0 && determination.startAction.doesJoin()) {
            VoltDB.crashLocalVoltDB("Unable to rejoin a node to itself.  " + "Please check your command line and start action and try again.", false, null);
        }

        if (!urls.contains(url)) {
            super.addURL(url);
            urls.add(url);
        }

        if (VersionUtil.compare(getServiceVersion(), "2.0.1") == -1) {
            excludedActions.add("Close page");
        }

        if (!StringUtil.isNullOrEmpty(aId)) {
            if (appendIs) sql.append(" and ");
            else sql.append(" where ");
            sql.append(theNameId).append(">='").append(aId).append("' ");
            appendIs = true;
        }

        if ((current.getNodeType() == Node.ELEMENT_NODE) && current.getNamespaceURI().equals(Constants.SignatureSpecNS)) {
            res++;
        }

        if (isTypeTokenAssignableMethod == null) {
            try {
                isTypeTokenAssignableMethod = TypeToken.class.getDeclaredMethod("isSupertypeOf", TypeToken.class);
            } catch (NoSuchMethodException e) {
            } catch (SecurityException e) {
                e.printStackTrace();
            }
            if (isTypeTokenAssignableMethod == null) {
                try {
                    isTypeTokenAssignableMethod = TypeToken.class.getDeclaredMethod("isAssignableFrom", TypeToken.class);
                } catch (NoSuchMethodException e) {
                    throw new IllegalArgumentException("Neither TypeToken.isAssignableFrom(TypeToken), nor TypeToken.isSuperTypeOf(TypeToken) seems to be supported by the given Guava version.");
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        }

        if (timeAlive == 0) {
            if (!world.isRemote) {
                if (isComplete()) canRender = completeStructure = completeStructure(world.getBlockState(pos));
            } else {
                SoundEvent str;
                if (world.isRemote && (str = getSound()) != null) {
                    playMachineSound(str);
                }
            }
            timeAlive = 0x1;
        }

        if (justStarted) {
            justStarted = false;
            return START_NODE;
        }

        if (parameterTypes.length == 0) {
            return theClass.getConstructor();
        } else {
            for (final Constructor constructor : theClass.getDeclaredConstructors()) {
                final Class[] types = constructor.getParameterTypes();
                if (types.length != parameterTypes.length) {
                    continue;
                }
                if (types.length == parameterTypes.length && types.length == 0) {
                    return constructor;
                }
                boolean fits = true;
                for (int i = 0; i < types.length; i++) {
                    if (!isAssignable(types[i], parameterTypes[i])) {
                        fits = false;
                        break;
                    }
                }
                if (fits) {
                    return constructor;
                }
            }
            throw new NoSuchMethodException(theClass.getCanonicalName() + argumentTypesToString(parameterTypes));
        }

        if (dh.getName() != null) return getEncoding(dh.getDataSource());

        if (b < 0) b += 256;

        if (skipMigrationCheck) {
            args = removeMigrationCheckArg(args);
        }

        if (name.startsWith("\"") || name.startsWith("token(") || cnamePattern.matcher(name).matches()) sb.append(name);
        else sb.append('"').append(name).append('"');

        if (ret instanceof JobResultSchedulerListener)
            ((JobResultSchedulerListener) ret).setResultFetcher((SchedulerUser<JobId>) PAActiveObject.getStubOnThis());

        if ("org.eclipse.jface.text.source.projection.ProjectionAnnotationHover".equals(annotationHover.getClass().getName()))
            controlCreator = new IInformationControlCreator() {
                public IInformationControl createInformationControl(final Shell shell) {
                    final int shellStyle = SWT.RESIZE | SWT.TOOL | getOrientation();
                    final int style = SWT.V_SCROLL | SWT.H_SCROLL;
                    return new PHPSourceViewerInformationControl(shell, shellStyle, style);
                }
            };
        else if (annotationHover instanceof IInformationProviderExtension2)
            controlCreator = ((IInformationProviderExtension2) annotationHover).getInformationPresenterControlCreator();
        else if (annotationHover instanceof IAnnotationHoverExtension)
            controlCreator = ((IAnnotationHoverExtension) annotationHover).getHoverControlCreator();

        if (JiveGlobals.getBooleanProperty("plugin.subscription.sparkCheck", false)) {
            String resource = fromJID.getResource();
            if (resource != null && resource.equalsIgnoreCase("Spark")) {
                presence.setType(Presence.Type.unsubscribed);
            }
        }

        if (todomsgremindbiztype != null) {
            MenuNodeUtil util = MenuNodeUtil.getInstance();
            util.registerToDoMsgMenuNodeMap(todomsgremindbiztype, menuNodeInfo);
        }

        if (e.getCause() instanceof FileNotFoundException) {
            message = "File not found: " + e.getCause().getMessage();
        } else {
            message = e.getMessage();
        }

        if (!CompatibleBrowser.isNativeBrowserAvailable()) {
            html.append("TABLE.revision { margin: 0 0 10px 0; }");
        } else {
            html.append("TABLE.revision { margin: 1.4em 0 0 0; }").append(NEWLINE);
            html.append("TABLE.revision:first-child { margin: 0; }").append(NEWLINE);
        }

        if (defaultImagesDir == null) {
            defaultImagesDir = application().resourceManager().urlForResourceNamed("calendar_prev.png", "Ajax", null, context().request()).toString();
            int lastSeperator = defaultImagesDir.lastIndexOf("%2F");
            if (lastSeperator == -1) {
                lastSeperator = defaultImagesDir.lastIndexOf('/');
            }
            defaultImagesDir = defaultImagesDir.substring(0, lastSeperator);
            application().resourceManager().urlForResourceNamed("calendar_next.png", "Ajax", null, context().request()).toString();
        }

        if ("urn:ogc:def:crs:OGC:1.3:CRS84".equals(bbox.getCrs())) {
            bbox.setCrs("EPSG:4326");
        }

        if (value instanceof ERXConstant.NumberConstant) {
            value = Long.valueOf(((Number) value).longValue());
        } else {
            value = formatValueForAttribute(e, value, attribute, key);
        }

        if ((address.equals(NetFlags.LOOPBACK_ADDRESS) || address.equals(NetFlags.ANY_ADDR)) && i.hasNext()) {
            continue;
        }

        if (reference.isLocalType()) {
            return false;
        }

        if (name.startsWith("/")) {
            name = name.substring(1);
        }

        if (StringUtils.isEmpty(appName) || appName.startsWith("- ")) {
            appName = "PowerFolder";
        }

        if (tx.isActive()) {
            tx.rollback();
        }

        if (type == null || (!type.equals("TodoDetail") && !type.equals("ProcessInstance"))) {
            return listProcessHandler.getDestination(function, session, request);
        }

        if (r != null) {
            lexer = new WhitespaceLexer(r, factory);
        }

        if (editableObject instanceof Sdk) {
            removeJdk((Sdk) editableObject);
        } else if (editableObject instanceof Module) {
            if (!removeModule((Module) editableObject)) return false;
        } else if (editableObject instanceof Library) {
            if (!removeLibrary((Library) editableObject)) return false;
        } else if (editableObject instanceof Artifact) {
            removeArtifact((Artifact) editableObject);
        }

        if (dataBuffer.dataType() == DataBuffer.Type.HALF) {
            if (bytes % 4 != 0) {
                bytes += 2;
            }
        } else if (Nd4j.dataType() == DataBuffer.Type.DOUBLE || dataBuffer.dataType() == DataBuffer.Type.LONG) {
            long div = bytes / 4;
            if (div % 2 != 0) bytes += 4;
            div = currentOffset / 4;
            while (div % 2 != 0) {
                currentOffset = constantOffsets.get(deviceId).addAndGet(4);
                div = currentOffset / 4;
                if (currentOffset > MAX_CONSTANT_LENGTH) break;
            }
        }

        if (!uri.equals(namespaceContext.getNamespaceURI(prefix))) {
            namespaceContext.pushNamespace(prefix, uri);
        }

        if (element instanceof SchemaTypeDef) {
            return "{...}";
        } else if (element instanceof PsiFile) {
            return "/.../";
        } else if (element instanceof PsiComment) {
            if (((PsiComment) element).getTokenType() == S_BLOCK_COMMENT) return "/*..*/";
            else return "//...";
        }

        if ("Ljava/lang/Throwable;".equals(handler.getExceptionType())) {
            allCaughtForRange = true;
        }

        if (log.isDebugEnabled()) {
            log.warn("Could not update this server's OperationMode to DOWN in the database", t);
        } else {
            log.warn("Could not update this server's OperationMode to DOWN in the database: " + t.getMessage());
        }

        if (canEditPage) simplePageBean.maybeUpdateLinks();

        if (rawTransaction.allowsWrites()) return;

        if (checkConnection()) {
            Permission perm = _connection.getPermission();
            if (perm instanceof java.io.FilePermission) return new File(perm.getName());
        }

        if (oldWorkflowSampleSubtypes != null) {
            for (WorkflowSampleSubtype WorkflowSampleSubtype : oldWorkflowSampleSubtypes) {
                String subtypeIName = WorkflowSampleSubtype.getSampleSubtype().getIName();
                if (sampleSubtypeInames.contains(subtypeIName)) {
                    sampleSubtypeInames.remove(subtypeIName);
                    continue;
                }
                workflowsamplesubtypeDao.remove(WorkflowSampleSubtype);
                workflowsamplesubtypeDao.flush(WorkflowSampleSubtype);
            }
        }

        if (idImovel != null && !idImovel.equals("")) {
            Imovel imovelSoId = this.getControladorImovel().pesquisarImovelRegistroAtendimento(new Integer(idImovel));
            if (idRAAtualizacao == null) {
                this.verificarSituacaoImovelEspecificacao(imovelSoId, idEspecificacao);
                this.verificarImovelComDebitos(idEspecificacao, imovelSoId.getId());
                this.verificarAlteracaoVencimentoRecente(idEspecificacao, usuarioLogado, imovelSoId.getId());
            } else {
                if (idEspecificacao != null) {
                    Object[] parametrosRA = this.pesquisarParmsRegistroAtendimento(idRAAtualizacao);
                    if (parametrosRA != null && parametrosRA[10] != null && parametrosRA[10] != imovelSoId.getId()) {
                        this.verificarImovelComDebitos(idEspecificacao, imovelSoId.getId());
                    }
                }
            }
        }

        if (htmlName == null || (!htmlName.equalsIgnoreCase("A") && !htmlName.equalsIgnoreCase("TD")))
            state.afterElement = true;

        if (nFractBits == 1) {
            M2 -= 1;
        }

        if ("enableCORS".equalsIgnoreCase(name)) {
            name = "enableCors";
        }

        if (status != Status.RUNNING) {
            loadStatus = null;
        }

        if (mCategories.size() == 0) return convertView;

        if (alwaysWrite) {
            tag.setAttribute(attribute, value == null ? "" : value);
        } else if (value != null && !value.isEmpty()) {
            tag.setAttribute(attribute, value);
        }

        if (srcDir.exists() && srcDir.isDirectory()) {
            if (ensureDirectoryExists(dstDir)) {
                boolean success = true;
                for (final File file : srcDir.listFiles()) {
                    final String copied = dstDir.getAbsolutePath() + File.separator + file.getName();
                    if (file.isDirectory()) {
                        success = copyDirectory(file.getAbsolutePath(), copied) && success;
                        if (!success && stopOnFail) {
                            return false;
                        }
                    } else {
                        success = copyFile(file.getAbsolutePath(), copied) && success;
                        if (!success && stopOnFail) {
                            return false;
                        }
                    }
                }
                return success;
            } else {
                return false;
            }
        } else {
            return false;
        }

        if (tileUrl.contains(TileLayerServer.EPSG_3857)) {
            proj = TileLayerServer.EPSG_3857;
            tileSize = TileLayerServer.WMS_TILE_SIZE;
        } else if (tileUrl.contains(TileLayerServer.EPSG_900913)) {
            proj = TileLayerServer.EPSG_900913;
            tileSize = TileLayerServer.WMS_TILE_SIZE;
        } else if (tileUrl.contains(TileLayerServer.EPSG_4326)) {
            proj = TileLayerServer.EPSG_4326;
            tileSize = TileLayerServer.DEFAULT_TILE_SIZE;
        }

        if (m_aggregateTypes.size() != m_aggregateColumnNames.size() || m_aggregateColumnNames.size() != m_aggregateOutputColumns.size()) {
            throw new Exception("ERROR: Mismatched number of aggregate expression column attributes for PlanNode '" + this + "'");
        } else if (m_aggregateTypes.isEmpty() || m_aggregateTypes.contains(ExpressionType.INVALID)) {
            throw new Exception("ERROR: Invalid Aggregate ExpressionType or No Aggregate Expression types for PlanNode '" + this + "'");
        } else if (m_aggregateColumnNames.isEmpty()) {
            throw new Exception("ERROR: No Aggregate Columns for PlanNode '" + this + "'");
        }

        if (offsetIndex > line.length()) offsetIndex = line.length();

        if (("language".equalsIgnoreCase(attr.attribute) && "javascript".equalsIgnoreCase(attr.value)) || ("type".equalsIgnoreCase(attr.attribute)) && "text/javascript".equalsIgnoreCase(attr.value)) {
            result = true;
        }

        if (aLayer.getType().equals(CHAIN_TYPE)) {
            bratTypeName += ChainAdapter.CHAIN;
        }

        if (builder.getTokenType() != CASE_END && builder.getTokenType() != ESAC_KEYWORD) {
            boolean parsed = Parsing.list.parseCompoundList(builder, true, true);
            if (!parsed) {
                casePattern.drop();
                return CaseParseResult.Faulty;
            }
        }

        if (isClosed() && message.getType() != CreateSessionMessage.MESSAGE_TYPE && message.getType() != CreateLeaseSetMessage.MESSAGE_TYPE)
            throw new I2PSessionException("Already closed");

        if (account == null) throw new IllegalArgumentException("Cannot retrieve account for \"" + userId + "\"");

        if (changed && root != null) {
            root.postDelayed(() -> {
                if (!root.isSync()) {
                    root.requestLayout();
                }
            }, 30);
        }

        if (outputFile.endsWith(JPEG_CONVERSATION_FORMAT)) {
            commandName = "jpegResizer";
        }

        if (m_vo.getColumnName().endsWith("_ID")) {
            log.debug("[ID=null] " + m_vo.getColumnName());
            return null;
        }

        if (path != null && !path.isEmpty()) {
            sb.append("/terms/");
            sb.append(path);
        }

        if (this.internalName.equals(ImageMime.png.internalName) || this.internalName.equals(ImageMime.png8.internalName)) {
            int bitDepth = image.getSampleModel().getSampleSize(0);
            if (bitDepth > 1 && bitDepth < 8 && writer.getClass().getName().equals(NATIVE_PNG_WRITER_CLASS_NAME)) {
                writer = it.next();
            }
        }

        if (instancePublisher.isInstanceExposedInCrest(normalizedServiceComponent)) {
            String realm = DNMapper.orgNameToRealmName(orgName);
            boolean removeOnlyFromRouter = true;
            try {
                instancePublisher.removeInstance(normalizedServiceComponent, realm, removeOnlyFromRouter);
                logger.info(logIdentifier + ": Removed rest-sts instance " + normalizedServiceComponent + " from CREST router in site deployment following the deletion of this rest-sts instance on " + "another site server.");
            } catch (STSPublishException e) {
                logger.error(logIdentifier + ": Could not remove rest-sts instance " + normalizedServiceComponent + " from CREST router in site deployment following the deletion of this rest-sts instance on " + "another site server. Exception: " + e, e);
            }
        }

        if (!inValidate(fileInfo[0]) && fileInfo[0].trim().endsWith("&#133;") && SUPPORTS_AVAILABLECHECK_ABUSE) {
            logger.warning("filename length is larrrge");
            fileInfo[0] = getFnameViaAbuseLink(br.cloneBrowser(), link);
        }

        if (state.contains("Target")) {
            Assert.assertEquals(state, getText(statusId));
        } else {
            if ("on".equals(state) || "off".equals(state)) {
                Assert.assertEquals("on".equals(state), isChecked(statusId));
            } else {
                Assert.assertEquals(state, getFieldValue(statusId));
            }
        }

        if (args.length != 0) {
            log.warn("Insert WAR onto root: " + args[0]);
            File rootWar = new File(args[0]);
            server.wars.put("/", rootWar);
        }

        if (aCanEquipECM == 1) {
            ans.add(new HardPoint(HardPointType.ECM));
        }

        if (val instanceof BigDecimal) {
            BigDecimal bigDec = (BigDecimal) val;
            return bigDec.doubleValue();
        }

        if (pReturnListDataModel) {
            xListDataModel.clear();
        } else {
            xListRow.clear();
        }

        if (isEmpty()) {
            throw new EmptyListUpdateException("Attempt to add() to the empty list (rdf:nil)");
        }

        if (targetLateralSpeedSignNoZero < 0 && !true) {
            for (int i = 0; i <= numGuessFactorBins / 2; i++) {
                double tmp = gfDanger[i];
                gfDanger[i] = gfDanger[numGuessFactorBins - 1 - i];
                gfDanger[numGuessFactorBins - 1 - i] = tmp;
            }
        }

        if (!madeDecompTasks) {
            throw new RuntimeException("THE DECOMP TASKS HAVENT BEEN MADE!! STUPID FORGEGRADLE DEVELOPER!!!! :(");
        }

        if (PathResolver.CURRENT.equals(relativePath)) {
            path = actionOwner.getProperty().getPath();
        } else {
            path = PathResolver.resolve(actionOwner, relativePath);
        }

        if (joinRel instanceof SemiJoin) {
            return null;
        }

        if (n.getNotifier() instanceof ExtensionImpl) {
            if (DEBUG) System.out.println("ignore ExtensionImpl change: " + BPELUtil.debug(n));
            return;
        }

        if (!xcodeVersionRule.getAliases().contains(xcodeVersionRule.getVersion().toString())) {
            if (aliasesToXcodeRules.put(xcodeVersionRule.getVersion().toString(), xcodeVersionRule) != null) {
                configErrorDuplicateAlias(xcodeVersionRule.getVersion().toString(), xcodeVersionRules);
            }
        }

        if ((startLocation != null) && getWindbarbs()) {
            if (startLocation.getLatitude().getValue() >= 0) {
                ((FlowDisplayable) getVerticalCSDisplay()).setBarbOrientation(FlowDisplayable.NH_ORIENTATION);
            } else {
                ((FlowDisplayable) getVerticalCSDisplay()).setBarbOrientation(FlowDisplayable.SH_ORIENTATION);
            }
        }

        if ((flashOrValue == null) && (Validation.errors().size() == 0)) {
            flashOrValue = field.get("value");
        }

        if (parent.getComponentCount() > 1) {
            for (Component component : parent.getComponents()) {
                if (component instanceof Box.Filler) {
                    hasFiller = true;
                }
            }
            Rectangle bounds1 = parent.getComponent(0).getBounds();
            Rectangle bounds2 = parent.getComponent(1).getBounds();
            if (bounds2.x >= bounds1.x + bounds1.width) {
                colCount = parent.getComponentCount();
                if (!hasFiller) colCount++;
                myHorizontal = true;
            } else {
                rowCount = parent.getComponentCount();
                if (!hasFiller) rowCount++;
            }
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            cg.setNativeId(driverCG.getNativeId());
            cg.addSystemConsistencyGroup(storageSystem.getId().toString(), cg.getLabel());
            cg.addConsistencyGroupTypes(BlockConsistencyGroup.Types.LOCAL.name());
            if (NullColumnValueGetter.isNullURI(cg.getStorageController())) {
                cg.setStorageController(storageSystem.getId());
            }
            dbClient.updateObject(cg);
            String msg = String.format("doCreateConsistencyGroup -- Created consistency group: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            cg.setInactive(true);
            dbClient.updateObject(cg);
            String errorMsg = String.format("doCreateConsistencyGroup -- Failed to create Consistency Group: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.createConsistencyGroupFailed("doCreateConsistencyGroup", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (executionCommandWrapper != null) {
            executionCommandWrapper.getExecutionCommand().setTaskId(taskId);
            executionCommandWrapper.invalidateJson();
        }

        if (copyMoveIntent != null) {
            String dstRepoId, dstDir;
            dstRepoId = copyMoveIntent.getStringExtra(SeafilePathChooserActivity.DATA_REPO_ID);
            dstDir = copyMoveIntent.getStringExtra(SeafilePathChooserActivity.DATA_DIR);
            copyMoveContext.setDest(dstRepoId, dstDir);
            doCopyMove();
            copyMoveIntent = null;
        }

        if (K054000_ram.read(0x04) == 0xff) {
            Acx += 3;
        }

        if (stmt instanceof GrReturnStatement) {
            GrMethod method = PsiTreeUtil.getParentOfType(stmt, GrMethod.class);
            if (method != null) {
                Collection<GrStatement> returnStatements = ControlFlowUtils.collectReturns(method.getBlock());
                return returnStatements.contains(stmt) && !hasBadReturns(method);
            }
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            for (VolumeSnapshot driverSnapshot : driverSnapshotToSnapshotMap.keySet()) {
                BlockSnapshot snapshot = driverSnapshotToSnapshotMap.get(driverSnapshot);
                snapshot.setNativeId(driverSnapshot.getNativeId());
                snapshot.setDeviceLabel(driverSnapshot.getDeviceLabel());
                snapshot.setNativeGuid(NativeGUIDGenerator.generateNativeGuid(storageSystem, snapshot));
                snapshot.setIsSyncActive(true);
                snapshot.setReplicationGroupInstance(driverSnapshot.getConsistencyGroup());
                if (driverSnapshot.getProvisionedCapacity() > 0) {
                    snapshot.setProvisionedCapacity(driverSnapshot.getProvisionedCapacity());
                }
                if (driverSnapshot.getAllocatedCapacity() > 0) {
                    snapshot.setAllocatedCapacity(driverSnapshot.getAllocatedCapacity());
                }
            }
            dbClient.updateObject(driverSnapshotToSnapshotMap.values());
            String msg = String.format("createVolumeSnapshots -- Created snapshots: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            for (BlockSnapshot snapshot : snapshots) {
                snapshot.setInactive(true);
            }
            dbClient.updateObject(snapshots);
            String errorMsg = String.format("doCreateSnapshot -- Failed to create snapshots: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.createSnapshotsFailed("doCreateSnapshot", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (vis.tDiagram == Diagram.network && vis.fY.size() > 1) {
            String command = "#values=#values";
            for (String s : vis.aestheticFields()) if (!s.equals("#values")) command += ";" + s + "=" + s;
            writeTransform("summarize", command);
        }

        if (MIR_Load.getAddress(inst).getRegister() == ir.regpool.getPhysicalRegisterSet().getFP()) {
            Operand one = MIR_Load.getOffset(inst);
            if (one instanceof IntConstantOperand) {
                int offset = ((IntConstantOperand) one).value;
                if (offset <= -256) {
                    if (frameIsRequired()) {
                        MIR_Load.setOffset(inst, IC(frameSize - offset - 256));
                    } else {
                        MIR_Load.setOffset(inst, IC(-offset - 256));
                    }
                }
            }
        }

        if (idComment != null) {
            String c = idComment.toLowerCase();
            if (c.contains(DO_NOT_TRANSLATE) || c.contains(DONT_TRANSLATE)) {
                return entry;
            }
        }

        if (schema == null) {
            schema = new CouchDBFeatureStore(entry, null).buildFeatureType();
            entry.getState(Transaction.AUTO_COMMIT).setFeatureType(schema);
        }

        if (path.startsWith("../")) {
            Message m = getParentMessage().getMessage(path.substring(3));
            return m;
        }

        if (key instanceof BundleClassLoader) {
            BundleClassLoader bcl = (BundleClassLoader) key;
            if (bcl.getParent() instanceof BundleReference) {
                return BundleReference.class.cast(bcl.getParent()).getBundle();
            }
        }

        if (object.isAnnotationPresent(Index.class)) {
            definition.setIndexed(true);
        }

        if (kategorie.getGruppeA() == null) {
            continue;
        }

        if (Thread.currentThread().getContextClassLoader() == null) {
            Thread.currentThread().setContextClassLoader(ClassLoader.getSystemClassLoader());
        }

        if (type == TestModelType.STANDALONE) {
            ServerEnvironmentService.addService(((ServerInitializer) initializer).environment, context.getChildTarget());
        }

        if (debug && ex.original() != null) {
            Rewriter rw = ex.rewriter();
            PrettyAutomataWriter writer = new PrettyAutomataWriter(System.out, SCHEMA, "Or", "And");
            writer.write(ex.original());
            writer.flush();
            System.err.println("\n\n=>\n");
            writer.write(ex.reduction());
            writer.flush();
        }

        if (umlMetaClasses.isEmpty()) {
            for (EClassifier eClassifier : UMLPackage.eINSTANCE.getEClassifiers()) {
                if (eClassifier instanceof EClass) {
                    umlMetaClasses.add(eClassifier);
                }
            }
        }

        if (isDynamic) {
            log.debugf("Binding dynamic-component [%s]", role);
            componentBinding.setDynamic(true);
        } else if (isVirtual) {
            if (componentBinding.getOwner().hasPojoRepresentation()) {
                log.debugf("Binding virtual component [%s] to owner class [%s]", role, componentBinding.getOwner().getClassName());
                componentBinding.setComponentClassName(componentBinding.getOwner().getClassName());
            } else {
                log.debugf("Binding virtual component [%s] as dynamic", role);
                componentBinding.setDynamic(true);
            }
        } else {
            log.debugf("Binding component [%s]", role);
            if (StringHelper.isNotEmpty(explicitComponentClassName)) {
                log.debugf("Binding component [%s] to explicitly specified class", role, explicitComponentClassName);
                componentBinding.setComponentClassName(explicitComponentClassName);
            } else if (componentBinding.getOwner().hasPojoRepresentation()) {
                log.tracef("Attempting to determine component class by reflection %s", role);
                final Class reflectedComponentClass;
                if (StringHelper.isNotEmpty(containingClassName) && StringHelper.isNotEmpty(propertyName)) {
                    reflectedComponentClass = Helper.reflectedPropertyClass(sourceDocument, containingClassName, propertyName);
                } else {
                    reflectedComponentClass = null;
                }
                if (reflectedComponentClass == null) {
                    log.debugf("Unable to determine component class name via reflection, and explicit " + "class name not given; role=[%s]", role);
                } else {
                    componentBinding.setComponentClassName(reflectedComponentClass.getName());
                }
            } else {
                componentBinding.setDynamic(true);
            }
        }

        if (node.isSynthetic() == false) Throw();

        if (https) {
            List[] temp2 = wiki.linksearch("*." + domain, "https", ns);
            temp[0].addAll(temp2[0]);
            temp[1].addAll(temp2[1]);
        }

        if (j2dShapes == null) {
            return false;
        }

        if (isWindows()) {
            FontMetrics fm = headerLabel.getFontMetrics(headerLabel.getFont());
            floatDockPanel.setMinimumSize(new Dimension((int) ((fm.stringWidth(title) + floatIcon.getIconWidth()) * 1.5), floatIcon.getIconHeight()));
        }

        if (dnsRecord.getTtl() <= 0) {
            errors.add(new ConstraintViolationBean("err.dnsRecord.ttl.invalid"));
        }

        if (paramTypes.isEmpty()) {
            res.append("emptyParam :: \"@bool\"");
        } else {
            Iterator<String> titr = paramTypes.iterator();
            for (Iterator<APatternListTypePair> itr1 = pattern.listIterator(); itr1.hasNext(); ) {
                APatternListTypePair p = itr1.next();
                LinkedList<PPattern> pats = p.getPatterns();
                for (Iterator<PPattern> itr2 = pats.listIterator(); itr2.hasNext(); ) {
                    PPattern pat = itr2.next();
                    String ty = titr.next();
                    res.append(((AIdentifierPattern) pat).getName().toString());
                    res.append(" :: \"" + ty + "\"");
                    if (itr2.hasNext()) res.append(" and ");
                }
                if (itr1.hasNext()) res.append(" and ");
            }
        }

        if (c == ':') {
            if (identifierChar(lex.peekNextChar())) {
                return true;
            } else {
                return false;
            }
        } else {
            return identifierChar(c);
        }

        if (wsAcceptCloseTimeout != null) {
            try {
                Thread.sleep(750);
            } catch (Exception e) {
            }
            clientSession.close(true);
        }

        if (getReferenceSetType() == SnomedRefSetType.MODULE_DEPENDENCY) {
            return null;
        } else {
            return getReferencedComponentId();
        }

        if (invokeWorkaroundWhileBugIsOpen) {
            String subString = "Any local-only certificates have been deleted.";
            if (stdoutMsg.contains(subString)) {
                log.info("Stripping substring '" + subString + "' from stdout while bug '" + bugId + "' is open.");
                stdoutMsg = stdoutMsg.replace(subString, "").trim();
            }
            String subStringRegex = "(\\d+ local (certificate has|certificates have) been deleted\\.)";
            Pattern pattern = Pattern.compile(subStringRegex);
            Matcher matcher = pattern.matcher(stdoutMsg);
            while (matcher.find()) {
                log.info("Stripping substring '" + matcher.group() + "' from stdout while bug '" + bugId + "' is open.");
                stdoutMsg = stdoutMsg.replace(matcher.group(), "").trim();
            }
            subStringRegex = "(\\d+ subscriptions removed at the server\\.)";
            pattern = Pattern.compile(subStringRegex);
            matcher = pattern.matcher(stdoutMsg);
            while (matcher.find()) {
                log.info("Stripping substring '" + matcher.group() + "' from stdout while bug '" + bugId + "' is open.");
            }
        }

        if (_keyChar == 0) {
            switch (_keyCode) {
                case Keyboard.KEY_NUMPAD1:
                    return '1';
                case Keyboard.KEY_NUMPAD2:
                    return '2';
                case Keyboard.KEY_NUMPAD3:
                    return '3';
                case Keyboard.KEY_NUMPAD4:
                    return '4';
                case Keyboard.KEY_NUMPAD5:
                    return '5';
                case Keyboard.KEY_NUMPAD6:
                    return '6';
                case Keyboard.KEY_NUMPAD7:
                    return '7';
                case Keyboard.KEY_NUMPAD8:
                    return '8';
                case Keyboard.KEY_NUMPAD9:
                    return '9';
                case Keyboard.KEY_NUMPAD0:
                    return '0';
                default:
                    return _keyChar;
            }
        }

        if (EndpointMeterBuildSettings.ENDPOINT_METERING) {
            endpointServiceMonitor = (EndpointServiceMonitor) MonitorManager.getServiceMonitor(group, MonitorResources.endpointServiceMonitorClassID);
            if (endpointServiceMonitor != null) {
                endpointMeter = endpointServiceMonitor.getEndpointMeter();
            }
        }

        if (strTokenText.countTokens() <= 1) {
            writer_GENE_ID_2_ENZYME_CODE.println(sInputLine);
        } else {
            sConvertedInputLine = sInputLine.substring(0, iStartIndex + 1);
            while (strTokenText.hasMoreTokens()) {
                writer_GENE_ID_2_ENZYME_CODE.println(sConvertedInputLine + strTokenText.nextToken());
            }
        }

        if ((K007420_ram.read(offs + 4) == 0x40) && (K007420_ram.read(offs + 1) == 0xff) && (K007420_ram.read(offs + 2) == 0x00) && (K007420_ram.read(offs + 5) == 0xf0)) {
            continue;
        }

        if (!del) {
            for (int i = 0; i < 1000 && file.exists(); i++) {
                System.gc();
                del = file.delete();
            }
        }

        if (filename.endsWith("package.html") || filename.endsWith("package-info.java") || filename.endsWith("package-info.groovy")) {
            if (packageDoc == null) {
                packageDoc = new SimpleGroovyPackageDoc(relPackage);
                packagePath = relPackage;
            }
            processPackageInfo(src, filename, packageDoc);
            rootDoc.put(packagePath, packageDoc);
            return;
        }

        if ((values != null) && (values.length == 1)) {
            if (values[0] instanceof String) {
                String val = (String) values[0];
                if ((val == null) || val.equals(NON_BREAK_SPACE)) {
                    values[0] = "";
                }
            }
        }

        if (dialogFlag) return;

        if ("iw".equals(locale.getLanguage())) translations.put("he", tr);

        if (responseText.contains("read a useful bit of information off your shirt")) {
            Matcher garbageShirtMatcher = FightRequest.GARBAGE_SHIRT_PATTERN.matcher(responseText);
            if (garbageShirtMatcher.find()) {
                Preferences.setInteger("_garbageShirtCharge", StringUtilities.parseInt(garbageShirtMatcher.group(1)));
            }
        } else if (responseText.contains("last bit of usefully informative garbage off your shirt")) {
            Preferences.setInteger("_garbageShirtCharge", 0);
            EquipmentManager.breakEquipment(ItemPool.MAKESHIFT_GARBAGE_SHIRT, "Your makeshirt garbage shirt falls apart.");
        }

        if (i.getTotalArea() < StructureInterfaceList.DEFAULT_MINIMUM_INTERFACE_AREA) continue;

        if (ensureSameSize) {
            GC tmpGC = new GC(device);
            Font tmpFont = new Font(device, fontData);
            tmpGC.setFont(tmpFont);
            JPanel DUMMY_PANEL = new JPanel();
            java.awt.Font tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
            if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                    height--;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
                }
            } else if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                    height++;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
                }
            }
            tmpFont.dispose();
            tmpGC.dispose();
        }

        if (isForumUrl) {
            requestBuilder.removeHeader("User-Agent");
            requestBuilder.header("User-Agent", HiUtils.getUserAgent());
        }

        if (in.peek() == JsonToken.STRING) {
            return new WikiSite(Uri.parse(in.nextString()));
        }

        if (focusPoint.focus instanceof ITextualEntityPart) {
            ITextualEntityPart part = (ITextualEntityPart) focusPoint.focus;
            int start = part.getSelectionStart();
            int end = part.getSelectionEnd();
            if (start != -1 && end != -1) {
                CaretUpdater.sheduleSyncUpdate(part.getViewer(), part.getModelTextEntity(), direction == PositionConstants.WEST ? start : end, true);
                return true;
            } else {
                CaretUpdater.sheduleSyncUpdate(part.getViewer(), part.getModelTextEntity(), part.getCaretPosition(), true);
            }
        }

        if (category.getCategoryName().equals(EGeneIDTypes.GENE.name())) {
            table.add(new PartOfPathwayRankTableModel());
        }

        if (!TextUtils.isEmpty(number) && !TextUtils.equals(number, mContext.getString(R.string.private_num)) && !TextUtils.equals(number, mContext.getString(R.string.unknown))) {
            if (DBG) log("Add actions with the number " + number);
            builder.addAction(R.drawable.stat_sys_phone_call, mContext.getString(R.string.notification_missedCall_call_back), PhoneGlobals.getCallBackPendingIntent(mContext, number));
            builder.addAction(R.drawable.ic_text_holo_dark, mContext.getString(R.string.notification_missedCall_message), PhoneGlobals.getSendSmsFromNotificationPendingIntent(mContext, number));
            if (photoIcon != null) {
                builder.setLargeIcon(photoIcon);
            } else if (photo instanceof BitmapDrawable) {
                builder.setLargeIcon(((BitmapDrawable) photo).getBitmap());
            }
        } else {
            if (DBG) {
                log("Suppress actions. number: " + number + ", missedCalls: " + mMissedCalls.size());
            }
        }

        if (name.startsWith("\"deleted: ")) {
            m_name = "\"" + name.split(" ")[1];
        } else {
            m_name = name;
        }

        if (urlPath.startsWith("file:")) {
            urlPath = urlPath.substring(5);
        }

        if (partitionURI != null) {
            inputHierarchy.add(ImmutableList.of(hiveAuthzBinding.getAuthServer(), partitionURI));
        }

        if (currentView == null) return;

        if (attackingType == Type.GROUND && defending.isLevitatingWithoutTypeCheck(b, attacking)) {
            return 0;
        }

        if (startCoord.x == x && startCoord.y == y) {
            return true;
        }

        if (path.getJavaType() != String.class) {
            throw new QueryConfigException("Path is not of type string.");
        }

        if (nestingLevel == 0) completeBinaryEnterTodo();

        if (font == null) {
            LOG.warn("Could not find font: /" + fontName.getName() + ", will use Helvetica instead");
            font = PDType1Font.HELVETICA;
        }

        if (listaSimplificadaReFaturamento.size() > 0) {
            System.out.println("inicio inserindo dados");
        }

        if (this.alwaysTickPlayers) {
            p.onUpdate(currentTick);
        }

        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"))) {
            return SNodeOperations.cast(SLinkOperations.getTarget(__thisNode__, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"));
        } else {
            return null;
        }

        if (!getManager().hasDevice(getMacAddress())) {
            getManager().onDiscovered_fromRogueAutoConnect(this, true, m_scanInfo.getServiceUUIDS(), getScanRecord(), getRssi());
        }

        if (heading.startsWith("Experimental Factor")) {
            continue;
        }

        if (credentials == null) {
            credentials = "";
        }

        if (aLayer.getType().equals(CHAIN_TYPE)) {
            attachingLayerBratTypeName += ChainAdapter.CHAIN;
        }

        if (plot_region.intersects(event.x, event.y, event.width - 1, event.height)) {
            if (debug) System.out.println("paint the plot_region");
            Rectangle clip = gc.getClipping();
            gc.setClipping(plot_region);
            paintGrid(gc);
            boolean used_advanced_graphics = false;
            for (Trace t : traces) used_advanced_graphics |= painter.paint(gc, t, xaxis);
            gc.setLineWidth(0);
            gc.setForeground(foreground);
            if (used_advanced_graphics) gc.setAdvanced(false);
            for (YAxis yaxis : yaxes) yaxis.paintMarkers(gc, xaxis);
            gc.setClipping(clip);
        }

        if (layer != null) {
            int index = 0;
            if (useLayerIndex) {
                index = layerIndex;
            } else {
                for (; index < req.getLayers().size(); index++) {
                    if (req.getLayers().get(index).getName().equals(layer)) {
                        break;
                    }
                }
            }
            if (req.getRawKvp().get("filter") != null) {
                List filters = KvpUtils.readFlat((String) req.getRawKvp().get("filter"), KvpUtils.OUTER_DELIMETER);
                params.put("filter", (String) filters.get(index));
            } else if (req.getRawKvp().get("cql_filter") != null) {
                List filters = KvpUtils.readFlat((String) req.getRawKvp().get("cql_filter"), KvpUtils.CQL_DELIMITER);
                params.put("cql_filter", (String) filters.get(index));
            } else if (req.getRawKvp().get("featureid") != null) {
                params.put("featureid", req.getRawKvp().get("featureid"));
            }
        } else {
            if (req.getRawKvp().get("filter") != null) {
                params.put("filter", req.getRawKvp().get("filter"));
            } else if (req.getRawKvp().get("cql_filter") != null) {
                params.put("cql_filter", req.getRawKvp().get("cql_filter"));
            } else if (req.getRawKvp().get("featureid") != null) {
                params.put("featureid", req.getRawKvp().get("featureid"));
            }
        }

        if ("POST".equals(req.getMethod())) {
            req.setAttribute(MULTIPART_CONFIG, MULTIPART_CONFIG_ELEMENT);
        }

        if (!coreAnnotationsFound.get()) {
            fallbackToManualAnnotatedClasses(getClass(), f, handler);
        }

        if (plot instanceof PiePlot) {
            applyToPiePlot((PiePlot) plot);
        } else if (plot instanceof MultiplePiePlot) {
            applyToMultiplePiePlot((MultiplePiePlot) plot);
        } else if (plot instanceof CategoryPlot) {
            applyToCategoryPlot((CategoryPlot) plot);
        } else if (plot instanceof XYPlot) {
            applyToXYPlot((XYPlot) plot);
        } else if (plot instanceof FastScatterPlot) {
            applyToFastScatterPlot((FastScatterPlot) plot);
        } else if (plot instanceof MeterPlot) {
            applyToMeterPlot((MeterPlot) plot);
        } else if (plot instanceof ThermometerPlot) {
            applyToThermometerPlot((ThermometerPlot) plot);
        } else if (plot instanceof SpiderWebPlot) {
            applyToSpiderWebPlot((SpiderWebPlot) plot);
        } else if (plot instanceof PolarPlot) {
            applyToPolarPlot((PolarPlot) plot);
        }

        if (ignoredIssues.contains(issue.getCode())) {
            return;
        }

        if (isPresent(mapConfig.getPrivateKeyContent())) {
            setMantaKeyPath(null);
        }

        if (getRoutingKey() == null || getRoutingKey().toString().equals("")) {
            if (sb.toString().indexOf("?") == -1) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            for (AMQShortString key : _bindingKeys) {
                sb.append(BindingURL.OPTION_BINDING_KEY).append("='").append(key.toString()).append("'&");
            }
            return sb.toString().substring(0, sb.toString().length() - 1);
        } else {
            return sb.toString();
        }

        if (mapping.containsValue(new SoftReference(value))) {
            return true;
        }

        if (stack.peekLast().nodeName().equals("td") && !state.name().equals("InCell"))
            Validate.isFalse(true, "pop td not in cell");

        if ((nLoc == Aero.LOC_NOSE) && dataFile.exists("transporters")) {
            String[] transporters = dataFile.getDataAsString("transporters");
            for (String transporter : transporters) {
                if (transporter.equals("LongTomIIICannon")) {
                    saEquip2[0] = "ISLongTom";
                    saEquip2[1] = "ISLongTomAmmo:125";
                }
            }
        }

        if (_log.isDebugEnabled()) {
            _log.debug(nsce, nsce);
        }

        if (!ssl.usingSystemProperties) {
            useDefaultKeyMaterial();
        }

        if (extensioSortida != null)
            existeixElementAssert("//*[@id='convertirExtensio0' and @value='" + extensioSortida + "']", "L'extensió de sortida no s'ha gravat correctament");

        if (!(url.toLowerCase(Locale.US).contains("http"))) {
            if (!(url.startsWith("/"))) {
                url = "/" + url;
            }
            url = ((WebDavFolder) mFolder).getUrl() + url;
        }

        if (context instanceof AbstractToolDescription) {
            for (AbstractVariable var : Iterables.filter(AllContents.of(context, false), AbstractVariable.class)) {
                addDefinition(definitions, var.getName(), getVariableTypeName(var));
            }
        }

        if (singletonService == null) {
            singletonService = initializeOWB();
        } else {
            logger.info("Existing thread singleton service in SystemInstance(): " + singletonService);
        }

        if (__meta == null) __meta = new Meta(getSchemaVersion(), getSchemaName(), getSchemaType());

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            String msg = String.format("Deleted export mask: %s.", task.getMessage());
            log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            String errorMsg = String.format("Failed to delete export mask: %s .", task.getMessage());
            log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.deleteExportMaskFailed("deleteExportMask", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (!scriptResolver.getId().contains("-metadata") && !scriptResolver.getId().equals("echonest") && !scriptResolver.getId().equals("itunes") && !scriptResolver.getScriptAccount().isManuallyInstalled()) {
            resolvers.add(scriptResolver);
        }

        if (threadSet.contains(pair)) {
            node.setProperty(property, propertyValue);
            return;
        }

        if (anc instanceof EmptyTypedElement) {
            anc = null;
        }

        if (notActive && !isMacro && System.currentTimeMillis() < time) return true;

        if (dataFileLocator.getPath().contains("?") && dataFileLocator.getPath().contains("dataformat/gct")) {
            fn = ".gct";
        }

        if (OS.getJavaVersion() < 1.9) {
            focusChangeListener = (observable, oldValue, isFocused) -> {
                if (!isFocused) {
                    if (getEditor().getText() != null) {
                        setValue(getConverter().fromString(getEditor().getText()));
                    }
                }
            };
            getEditor().focusedProperty().addListener(new WeakChangeListener<>(focusChangeListener));
        }

        if (o instanceof Dictionary && !(o instanceof Map)) {
            Dictionary<?, ?> dict = (Dictionary<?, ?>) o;
            Map<Object, Object> map = new HashMap<>();
            Enumeration<?> e = dict.keys();
            while (e.hasMoreElements()) {
                Object k = e.nextElement();
                Object v = dict.get(k);
                map.put(k, v);
            }
            o = map;
        }

        if (req.getCharacterEncoding() == null) req.setCharacterEncoding(IBirtConstants.DEFAULT_ENCODE);

        if (fChangeManager == null) {
            fChangeManager = createChangeManager(new SubProgressMonitor(pm, 1), new RefactoringStatus());
            RefactoringStatus status = Checks.validateModifiesFiles(getAllModifiedFiles(), null);
            if (status.hasFatalError()) fChangeManager = new TextChangeManager();
        }

        if (!isMultiMovieDir()) {
            filesToCache.addAll(listActorFiles());
        }

        if ((servicoTipoPrioridade.getDescricao() == null || servicoTipoPrioridade.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (servicoTipoPrioridade.getDescricaoAbreviada() == null || servicoTipoPrioridade.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (servicoTipoPrioridade.getId() == null || servicoTipoPrioridade.getId().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (servicoTipoPrioridade.getPrazoExecucaoInicio() == null || servicoTipoPrioridade.getPrazoExecucaoInicio().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (servicoTipoPrioridade.getPrazoExecucaoFim() == null || servicoTipoPrioridade.getPrazoExecucaoFim().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (Intent.ACTION_VIEW.equals(intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains(Intent.CATEGORY_BROWSABLE)) {
            searchTags = intent.getDataString().replace(UrlCompleter.HASHTAG_SCHEME, "");
            goBackOnToggleSearchLabel = true;
        }

        if ((variable.getFullName().contains("row_corresp") || (variable.getFullName().contains("col_corresp"))) && rasterDataNode.getDataType() == ProductData.TYPE_UINT32) {
            return new S3VariableOpImage(variable, DataBuffer.TYPE_FLOAT, sceneRasterWidth, sceneRasterHeight, imageTileSize, resolutionLevel, dimensionNames, dimensionIndexes, xIndex, yIndex, S3VariableOpImage.ArrayConverter.UINTCONVERTER);
        } else {
            return new S3VariableOpImage(variable, dataBufferType, sceneRasterWidth, sceneRasterHeight, imageTileSize, resolutionLevel, dimensionNames, dimensionIndexes, xIndex, yIndex);
        }

        if (info.getAttributes() != null && !info.getAttributes().isEmpty() && info.getAttributes().get(0).getBinding() != null) {
            return info.getAttributes();
        }

        if (val instanceof Blob) {
            val = (T) ((Blob) val).getBytes(1, MAX_BYTE_LEN);
        }

        if (c instanceof LikeExpression) {
            LikeExpression le = (LikeExpression) c;
            String queryParamName = le.getPropertyName();
            Object value = le.getValue();
            String sValue = String.valueOf(value);
            String queryParamValue = le.getMatchLocation().toMatchString(sValue);
            qs.put(queryParamName, queryParamValue);
        } else if (c instanceof SimpleExpression) {
            SimpleExpression se = (SimpleExpression) c;
            String queryParamName = se.getPropertyName();
            Object value = se.getValue();
            String queryParamValue = String.valueOf(value);
            qs.put(queryParamName, queryParamValue);
        } else {
            throw new IllegalArgumentException("Unexpected Criterion type: " + c);
        }

        if (offset < 1024) {
            palette_change_color(((offset & 0x1f) / 2) | (offset & 0xffe0) | 2048, r, g, b);
            palette_change_color(((offset & 0x1f) / 2) | (offset & 0xffe0) | 2048 | 16, r, g, b);
        }

        if (font == null) {
            throw new IOException("Could not find font: /" + fontName.getName());
        }

        if (WebComponentUtil.isAuthorized(AuthorizationConstants.AUTZ_UI_DASHBOARD_URL, AuthorizationConstants.AUTZ_UI_HOME_ALL_URL, AuthorizationConstants.AUTZ_GUI_ALL_URL, AuthorizationConstants.AUTZ_GUI_ALL_DEPRECATED_URL)) {
            items.add(createHomeItems());
        }

        if (stackMetaInfoFile.exists()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Reading stack version metainfo from file " + stackMetaInfoFile.getAbsolutePath());
            }
            try {
                metaInfoXml = unmarshaller.unmarshal(StackMetainfoXml.class, stackMetaInfoFile);
            } catch (Exception e) {
                metaInfoXml = new StackMetainfoXml();
                metaInfoXml.setValid(false);
                String msg = "Unable to parse stack metainfo.xml file at location: " + stackMetaInfoFile.getAbsolutePath();
                metaInfoXml.addError(msg);
                LOG.warn(msg);
            }
        }

        if (declaredType.isArray() && arrayMethod != null) {
            return new GuardedInvocationComponentAndCollectionType(createInternalFilteredGuardedInvocationComponent(arrayMethod.apply(declaredType), linkerServices), CollectionType.ARRAY);
        } else if (List.class.isAssignableFrom(declaredType)) {
            return new GuardedInvocationComponentAndCollectionType(createInternalFilteredGuardedInvocationComponent(listMethod, linkerServices), CollectionType.LIST);
        } else if (Map.class.isAssignableFrom(declaredType)) {
            return new GuardedInvocationComponentAndCollectionType(createInternalFilteredGuardedInvocationComponent(mapMethod, linkerServices), CollectionType.MAP);
        } else if (clazz.isArray() && arrayMethod != null) {
            return new GuardedInvocationComponentAndCollectionType(getClassGuardedInvocationComponent(linkerServices.filterInternalObjects(arrayMethod.apply(clazz)), callSiteType), CollectionType.ARRAY);
        } else if (List.class.isAssignableFrom(clazz)) {
            return new GuardedInvocationComponentAndCollectionType(createInternalFilteredGuardedInvocationComponent(listMethod, Guards.asType(LIST_GUARD, callSiteType), List.class, ValidationType.INSTANCE_OF, linkerServices), CollectionType.LIST);
        } else if (Map.class.isAssignableFrom(clazz)) {
            return new GuardedInvocationComponentAndCollectionType(createInternalFilteredGuardedInvocationComponent(mapMethod, Guards.asType(MAP_GUARD, callSiteType), Map.class, ValidationType.INSTANCE_OF, linkerServices), CollectionType.MAP);
        }

        if (new File(EXPLICIT_ONEIRIC).isFile()) {
            return Native.loadLibrary(EXPLICIT_ONEIRIC, GnomeKeyringLibrary.class, options);
        } else {
            throw x;
        }

        if (pathInfo != null && !pathInfo.equals(path.toString())) {
            handleException(resp, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_FORBIDDEN, NLS.bind("Forbidden: {0}", pathInfo), null));
            return;
        }

        if (!hasUpdatingRequestors && mySplitter.getSecondComponent() == null) {
            final int count = myTree.getRoot().getChildCount();
            if (count != 0) {
                if (myTree.getSelectionCount() == 0) {
                    TreeUtil.selectFirstNode(myTree);
                }
                syncRightPanel();
            }
        }

        if (warningWindow != null) {
            AWTAccessor.ComponentAccessor compAccessor = AWTAccessor.getComponentAccessor();
            int x = compAccessor.getX(target);
            int y = compAccessor.getY(target);
            int width = compAccessor.getWidth(target);
            int height = compAccessor.getHeight(target);
            warningWindow.reposition(x, y, width, height);
        }

        if (seq instanceof CoordinateArraySequence) {
            if (seq.size() > 0) {
                if (Double.isNaN(seq.getOrdinate(0, CoordinateSequence.Y))) return 1;
                if (Double.isNaN(seq.getOrdinate(0, CoordinateSequence.Z))) return 2;
            }
        }

        if (!getName().equals("testBackupServerNotRemoved")) {
            backupServer.start();
        }

        if (stream != null) {
            stream.close();
        } else {
            InputStream is = getInputStream();
            if (is != null) {
                is.close();
            }
        }

        if (command instanceof ExecCommand && command.getLargeIcon() != null) {
            String rootParent = findRootParent(command);
            if ((rootParent == null && toolBarGroup == null) || (rootParent != null && rootParent.equalsIgnoreCase(toolBarGroup))) {
                AbstractButton button = command.createToolBarButton();
                if (button != null) {
                    toolbar.add(button);
                }
                toolAdded = true;
            }
        }

        if (!sessionContext.isAdmin() && !sessionContext.getUserName().toLowerCase().equals("wclayf")) {
            throw ExUtil.newEx("admin only function.");
        }

        if ((this instanceof SmallCraft) && !(this instanceof Dropship) && !hasActiveECM() && isMilitary()) {
            try {
                String prefix = isClan() ? "CL" : "IS";
                this.addEquipment(EquipmentType.get(prefix + BattleArmor.SINGLE_HEX_ECM), Aero.LOC_NOSE, false);
            } catch (LocationFullException ex) {
            }
        }

        if (SelectorUtil.EPOLL_BUG_WORKAROUND && selected == 0 && !wakenupFromLoop && !wakenUp.get()) {
            long timeBlocked = System.nanoTime() - beforeSelect;
            if (timeBlocked < minSelectTimeout) {
                boolean notConnected = false;
                for (SelectionKey key : selector.keys()) {
                    SelectableChannel ch = key.channel();
                    try {
                        if (ch instanceof DatagramChannel && !ch.isOpen() || ch instanceof SocketChannel && !((SocketChannel) ch).isConnected() && !((SocketChannel) ch).isConnectionPending()) {
                            notConnected = true;
                            key.cancel();
                        }
                    } catch (CancelledKeyException e) {
                    }
                }
                if (notConnected) {
                    selectReturnsImmediately = 0;
                } else {
                    if (Thread.interrupted() && !shutdown) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("Selector.select() returned prematurely because the I/O thread " + "has been interrupted. Use shutdown() to shut the NioSelector down.");
                        }
                        selectReturnsImmediately = 0;
                    } else {
                        selectReturnsImmediately++;
                    }
                }
            } else {
                selectReturnsImmediately = 0;
            }
            if (selectReturnsImmediately == 1024) {
                rebuildSelector();
                selector = this.selector;
                selectReturnsImmediately = 0;
                wakenupFromLoop = false;
                continue;
            }
        } else {
            selectReturnsImmediately = 0;
        }

        if (builder instanceof FlexoDMBuilder) {
            ((FlexoDMBuilder) builder).getProject().getFlexoDMResource()._setDeserializingDataModel(this);
        }

        if (subjects.size() > 0) {
            log.debug("Checking if Subject: " + subject.getName() + " can list subjects.");
            permissionManager.check(subject.getId(), resourceTypeDAO.findTypeResourceType(), AuthzConstants.rootResourceId, AuthzConstants.subjectOpViewSubject);
        }

        if (!component.equals("AMBARI_SERVER")) {
            requests.add(new ServiceComponentHostRequest(clusterName, service, component, hostName, null));
        }

        if (migrateHierarchy) {
            result.push(ResultNode.PARENTS);
            migrateParents(content, result);
            result.pop();
        }

        if (first == null && second == null) return null;
        else if (first == null) return new Diff(first, second, DiffStatus.AlignmentPresentOnlyInSecond);
        else if (second == null) return new Diff(first, second, DiffStatus.AlignmentPresentOnlyInFirst);
        else if (first.getMinReadId() < second.getMinReadId())
            return new Diff(first, second, DiffStatus.AlignmentPresentOnlyInFirst);
        else if (first.getMinReadId() > second.getMinReadId())
            return new Diff(first, second, DiffStatus.AlignmentPresentOnlyInSecond);
        else {
            boolean diffGeneFeature = true;
            if (featureToCompare != null)
                diffGeneFeature = !Objects.equals(first.getFeature(featureToCompare), second.getFeature(featureToCompare));
            EnumMap<GeneType, Boolean> diffHits = new EnumMap<>(GeneType.class);
            boolean same = !diffGeneFeature;
            for (GeneType geneType : GeneType.VDJC_REFERENCE) {
                boolean b = sameHits(first.getHits(geneType), second.getHits(geneType), hitsCompareLevel);
                diffHits.put(geneType, !b);
                if (!b) same = false;
            }
            if (same) return new Diff(first, second, DiffStatus.AlignmentsAreSame);
            else
                return new Diff(first, second, DiffStatus.AlignmentsAreDifferent, new DiffReason(diffGeneFeature, diffHits));
        }

        if (intentSender != null || taskId != -1) {
            outIntent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            outIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        }

        if (getSource() != null && getTarget() != null) super.paintClientArea(graphics);

        if (currentDataDomain.getLabel().toLowerCase().contains("copy") || currentDataDomain.getLabel().toLowerCase().contains("mutation")) {
            tablePerspectivePreviewRenderer = new CategoricalContentPreviewRenderer(davidId, tablePerspective, pathwayPathRenderer.getGeneSelectionManager(), pathwayPathRenderer.getSampleSelectionManager());
        } else {
            tablePerspectivePreviewRenderer = new ContinuousContentPreviewRenderer(davidId, tablePerspective, pathwayPathRenderer.getGeneSelectionManager(), pathwayPathRenderer.getSampleSelectionManager());
        }

        if (validatesFilter(g, filter)) {
            objects.add(g);
        }

        if (!(srcData instanceof XRSurfaceData)) {
            srcData = dstData.getSourceSurfaceData(paint.getImage(), SunGraphics2D.TRANSFORM_ISIDENT, CompositeType.SrcOver, null);
            if (!(srcData instanceof XRSurfaceData)) {
                throw new InternalError("Surface not cachable");
            }
        }

        if (columnType.toUpperCase().equals("ENUM")) {
            inEnum = true;
            next();
            while (!token.getStr().equals(")")) {
                next();
            }
            while (!token.getStr().equals(",")) {
                if (token.getStr().toUpperCase().equals("DEFAULT")) {
                    next();
                    if (token.getStr().equals("'")) {
                        next();
                    }
                    columnDefault = token.getStr();
                    next();
                    if (token.getStr().equals("'")) {
                        next();
                    }
                }
                next();
            }
            next();
            columnType = "VARCHAR";
        } else if (token.getStr().toUpperCase().equals("(")) {
            next();
            columnSize = token.getStr();
            next();
            if (token.getStr().equals(",")) {
                next();
                columnPrecision = token.getStr();
                next();
            }
            if (!token.getStr().equals(")")) {
                err(") expected");
            }
            next();
        }

        if (solicitudFirmaPortafirma.mecanismoFirma == null)
            solicitudFirmaPropiedadesType.setMecanismoFirma(MecanismoFirmaEnumType.SERIE);
        else
            solicitudFirmaPropiedadesType.setMecanismoFirma(MecanismoFirmaEnumType.fromValue(solicitudFirmaPortafirma.mecanismoFirma));

        if (!(this.storage instanceof DatabaseStorage)) {
            this.projectLoader.addProjectVersion(project.getId(), version, localFile, uploader.getUserId(), requireNonNull(md5), requireNonNull(resourceId));
            log.info(String.format("Added project metadata to DB. Meta:%s File: %s[%d bytes] URI: %s", metadata, localFile.getName(), localFile.length(), resourceId));
        }

        if (theStrategy instanceof PartialBufferStrategy2) {
            if (partialBufferSize == 0) {
                String size = getServletContext().getInitParameter("PARTIAL_BUFFER_STRATEGY_SIZE");
                if (size != null) {
                    try {
                        partialBufferSize = Integer.valueOf(size).intValue();
                        if (partialBufferSize <= 0) {
                            LOGGER.warning("Invalid partial buffer size, defaulting to " + PartialBufferedOutputStream2.DEFAULT_BUFFER_SIZE + " (was " + partialBufferSize + ")");
                            partialBufferSize = 0;
                        }
                    } catch (NumberFormatException nfe) {
                        LOGGER.warning("Invalid partial buffer size, defaulting to " + PartialBufferedOutputStream2.DEFAULT_BUFFER_SIZE + " (was " + partialBufferSize + ")");
                        partialBufferSize = 0;
                    }
                }
            }
            ((PartialBufferStrategy2) theStrategy).setBufferSize(partialBufferSize);
        }

        if (ensureSameSize && !(device instanceof Printer)) {
            GC tmpGC = new GC(device);
            Font tmpFont = new Font(device, fontData);
            tmpGC.setFont(tmpFont);
            JPanel DUMMY_PANEL = new JPanel();
            java.awt.Font tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
            if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) > tmpGC.textExtent(Az).x) {
                    height--;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
                }
            } else if (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                while (DUMMY_PANEL.getFontMetrics(tmpAwtFont).stringWidth(Az) < tmpGC.textExtent(Az).x) {
                    height++;
                    tmpAwtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), height);
                }
            }
            tmpFont.dispose();
            tmpGC.dispose();
        }

        if (AUTO_REDRAW_HACK && (keyCode == KeyEvent.KEYCODE_CALL)) {
            mAutoRedraw = !mAutoRedraw;
            if (mAutoRedraw) {
                invalidate();
            }
            return true;
        }

        if (target != getBaseLanguage()) {
            return null;
        }

        if (url != null) IMAGE_FALSE = tk.getImage(url);

        if (implementation != existingObject) {
            return builder.wrapObject(registeredObject, this);
        } else {
            return registeredObject;
        }

        if (source == null) {
            try {
                source = container.lookup(ArtifactMetadataSource.class);
            } catch (ComponentLookupException e) {
            }
        }

        if (value == Double.NEGATIVE_INFINITY) {
            return "-1E0/0";
        }

        if (getContainer() instanceof Tab) {
            Tab myTab = (Tab) getContainer();
            ImageRef imgIndicator = null;
            if (stateIndicator != null) {
                switch (stateIndicator) {
                    case ERROR:
                        imgIndicator = ImageLibrary.ICON_ERROR;
                        break;
                    case WARN:
                        imgIndicator = ImageLibrary.ICON_WARNING;
                        break;
                }
            }
            String newTitle;
            if (imgIndicator != null) {
                newTitle = title + " " + imgIndicator.toImgTag();
            } else {
                newTitle = title;
            }
            if (!newTitle.equals(myTab.getTitle())) {
                myTab.setTitle(newTitle);
                ((ControlContainer) myTab.getContainer()).requireRedraw();
            }
        }

        if (glHandle == 0) return;

        if (UtilValidate.isEmpty(menuItemName) && UtilValidate.isNotEmpty(firstMenuItemName)) {
            menuItemName = firstMenuItemName;
        }

        if (rootArea.hasExtensionPoint(JpsPluginBean.EP_NAME.getName())) {
            rootArea.getExtensionPoint(JpsPluginBean.EP_NAME).addExtensionPointListener(new ExtensionPointListener<JpsPluginBean>() {
                @Override
                public void extensionAdded(@NotNull JpsPluginBean extension, @Nullable PluginDescriptor pluginDescriptor) {
                    ContainerUtil.addIfNotNull(myExternalBuildPlugins, pluginDescriptor);
                }

                @Override
                public void extensionRemoved(@NotNull JpsPluginBean extension, @Nullable PluginDescriptor pluginDescriptor) {
                }
            });
        }

        if (isSystemTable()) {
            enableTable = true;
        } else {
            LOG.debug("Table '{}' was not enabled before update and will not be enabled after update.", tableId);
        }

        if ((methodFlags & FLAG_REMOVED) == 0) return;

        if (FVLog.logger instanceof DevNullLogger) {
            threshold = LogLevel.FATAL;
            return;
        }

        if (!leftType.isNoType() && !rightType.canAssignTo(leftType)) {
            if (bothIntrinsics(rightType, leftType)) {
                registerMismatch(rightType, leftType);
            } else {
                mismatch(t, n, "assignment to property " + propName + " of " + getReadableJSTypeName(owner, true), rightType, leftType);
            }
            return false;
        }

        if (getSessionFactoryHelper().isStrictJPAQLComplianceEnabled() && namedParameters != null) {
            throw new SemanticException("Cannot mix positional and named parameters: " + queryTranslatorImpl.getQueryString());
        }

        if ("listener".equals(key)) {
            val = convertListeners(entry.getValue());
        } else if ("objectfactory".equals(key)) {
            val = AbstractDirectConfigurator.loadClass(entry.getValue());
        } else if ("testrunfactory".equals(key)) {
            val = AbstractDirectConfigurator.loadClass(entry.getValue());
        } else if ("reporter".equals(key)) {
            val = convertReporterConfig(val);
            key = "reporterslist";
        } else if ("junit".equals(key)) {
            val = convert(val, Boolean.class);
        } else if ("skipfailedinvocationcounts".equals(key)) {
            val = convert(val, Boolean.class);
        } else if ("mixed".equals(key)) {
            val = convert(val, Boolean.class);
        } else if ("configfailurepolicy".equals(key)) {
            val = convert(val, String.class);
        } else if ("group-by-instances".equals(key)) {
            val = convert(val, Boolean.class);
        } else if (THREADCOUNT_PROP.equals(key)) {
            val = convert(val, String.class);
        } else if ("suitethreadpoolsize".equals(key)) {
            val = convert(val, Integer.class);
        } else if ("dataproviderthreadcount".equals(key)) {
            val = convert(val, Integer.class);
        }

        if (wsnConnectSession != null) {
            IoFilterChain parentFilterChain = wsnConnectSession.getParent().getFilterChain();
            if (parentFilterChain.contains(TEXT_FILTER_NAME)) {
                parentFilterChain.remove(TEXT_FILTER_NAME);
            }
        }

        if (TodoType.INFORMATION_REQUIRED.equals(type)) {
            helper.setResponseTag(responseTag);
        }

        if (config.getCountry() == ConfigDescriptor.Country.LIBERIA || config.getCountry() == ConfigDescriptor.Country.SIERRA_LEONE) {
            extensions.add(extension(Extensions.REGISTRATION_SUMMARY_BY_AGE_REPORT, "mirebalaisreports.registrationoverview.title", null, "link", "mirebalaisreports/registrationsByAge.page", "App: reportingui.reports", null, ExtensionPoints.REPORTING_OVERVIEW_REPORTS, 1, map("linkId", "mirebalaisreports-registrationoverview-link")));
            extensions.add(extension(Extensions.CHECK_IN_SUMMARY_BY_AGE_REPORT, "mirebalaisreports.checkinoverview.title", null, "link", "mirebalaisreports/checkInsByAge.page", "App: reportingui.reports", null, ExtensionPoints.REPORTING_OVERVIEW_REPORTS, 1, map("linkId", "mirebalaisreports-checkinoverview-link")));
        } else if (config.getCountry() == ConfigDescriptor.Country.HAITI) {
            extensions.add(extension(Extensions.NON_CODED_DIAGNOSES_DATA_QUALITY_REPORT, "mirebalaisreports.noncodeddiagnoses.name", null, "link", "mirebalaisreports/nonCodedDiagnoses.page", "App: reportingui.reports", null, ExtensionPoints.REPORTING_DATA_QUALITY, 0, map("linkId", "mirebalaisreports-nonCodedDiagnosesReport-link")));
            if (config.getSite() == ConfigDescriptor.Site.MIREBALAIS) {
                extensions.add(extension(Extensions.DAILY_INPATIENTS_OVERVIEW_REPORT, "mirebalaisreports.inpatientStatsDailyReport.name", null, "link", "mirebalaisreports/inpatientStatsDailyReport.page", "App: reportingui.reports", null, ExtensionPoints.REPORTING_OVERVIEW_REPORTS, 3, map("linkId", "mirebalaisreports-inpatientDailyReport-link")));
            }
        }

        if (!path.exists()) {
            path.mkdirs();
        }

        if (Shell.WINDOWS) {
            {
                Field field = Shell.class.getDeclaredField("WINDOWS");
                field.setAccessible(true);
                Field modifiersField = Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                field.set(null, false);
            }
            {
                Field field = java.io.File.class.getDeclaredField("pathSeparator");
                field.setAccessible(true);
                Field modifiersField = Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                field.set(null, ":");
            }
        }

        if (keyCode == KeyEvent.KEYCODE_BACK && !event.hasNoModifiers() && (event.getFlags() & KeyEvent.FLAG_SOFT_KEYBOARD) != 0) {
            keyCode = KeyEvent.KEYCODE_BUTTON_B;
        }

        if (m_progressDialog == null) {
            m_progressDialog = new ProgressDialog(HistActivity.this);
            m_progressDialog.setMessage(getString(R.string.message_computing));
            m_progressDialog.setIndeterminate(true);
            m_progressDialog.setCancelable(false);
            m_progressDialog.show();
        }

        if (importMenuIndex != -1) {
            sketchMenu.insert(getImportMenu(), importMenuIndex);
        }

        if (str.startsWith(prefix)) {
            return prefix.length();
        }

        if (!isAccessibleTable(table)) {
            continue;
        }

        if (getIsApprovingOrReproving() || wFormStyle == FormStyle.TABLE) {
            if (getHasSelected()) {
                wDAO.setCurrentRowIndex(-1);
                for (Integer xRowIndex : wSelectedRowsIndexes) {
                    wDAO.setCurrentRowIndex(xRowIndex);
                    pvBroadcastEvent(xE, false, false, false);
                    if (!xE.isOk()) {
                        if (getIsApprovingOrReproving()) {
                            if (!wMessages.hasMessages()) {
                                addMessage("erroassinatura", MESSAGE_TYPE.ERROR, DBSFaces.getBundlePropertyValue("dbsfaces", "crudbean.msg.approvalAll"));
                            }
                            break;
                        } else {
                            addMessage("erroselecao", MESSAGE_TYPE.ERROR, DBSFaces.getBundlePropertyValue("dbsfaces", "crudbean.msg.editAll"));
                            break;
                        }
                    }
                }
            } else {
                xE.setOk(false);
                addMessage("erroselecao", MESSAGE_TYPE.ERROR, DBSFaces.getBundlePropertyValue("dbsfaces", "crudbean.msg.notSelected"));
            }
        } else {
            pvBroadcastEvent(xE, false, false, false);
        }

        if (!_initiallized) return;

        if (!surfaceData.isValid()) {
            throw new InvalidPipeException("attempt to validate Pipe with invalid SurfaceData");
        }

        if (fields != null) {
            builder.field(CommonFields.FIELDS.getPreferredName(), fields);
        }

        if (Schema.equals(context) || Documentation.equals(context)) {
            QualifiedName name = Matcher.find(XmlEntityFactory.instance.createQualifiedName(CommonsEntityAdapterFactory.createVariable(XmlEntityDescriptorEnum.NameSpace, "prefix"), XmlEntityFactory.instance.createName("lang")), attributes, false);
            if (name != null) attributes.wRemove(name.wGetParent());
        }

        if (permissionType != null) {
            SimpleCachedLDAPAuthorizationMap.this.objectAdded(evt, destinationType, permissionType);
        }

        if (vs.getName().endsWith(" Codes")) {
            myValueSets.put(vs.getName().substring(0, vs.getName().length() - 6).replace(" ", ""), vs);
        }

        if (!(typeCheckingContext.isSingleTypeComputation())) {
            {
                SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(so, MetaAdapterFactory.getContainmentLink(0x8388864671ce4f1cL, 0x9c53c54016f6ad4fL, 0x118b81cc8f6L, 0x118b81e3c02L, "ascending"));
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680788992", 0, null);
                typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.typesystem)", "1205680791173", true), (SNode) _quotation_createNode_6zmwfs_a1a2a0a4a1(), true, true, _info_12389875345);
            }
        }

        if (component instanceof EditableValueHolder && context.getPartialViewContext().isAjaxRequest()) {
            Object reset = component.getAttributes().get("resetOnAjax");
            if ((reset instanceof Boolean && Boolean.TRUE.equals(reset)) || (reset instanceof String && Boolean.parseBoolean((String) reset))) {
                EditableValueHolder c = (EditableValueHolder) component;
                c.resetValue();
                val = getCurrentValue(context, component);
            }
        }

        if (lastParent != null && lastParent.getParent().isEquivalentTo(thisElement) && BashPsiUtils.findNextVarDefFunctionDefScope(place) != null) {
            for (PsiElement sibling = lastParent.getNextSibling(); sibling != null; sibling = sibling.getNextSibling()) {
                if (!sibling.processDeclarations(processor, state, null, place)) {
                    return false;
                }
            }
        }

        if (LLDPUtil.handleLLDPFromController(this, fvClassifier, fvSlicer)) return;

        if (stop == -1) {
            LOG.warn("Failed to find MarkovVertex " + est_v + " in path!");
            continue;
        }

        if (incompatibleModules.isEmpty()) {
            if (modules.isEmpty()) {
                Messages.showInfoMessage(project, EclipseBundle.message("eclipse.export.nothing.to.do"), EclipseBundle.message("eclipse.export.dialog.title"));
                return;
            }
        } else if (Messages.showOkCancelDialog(project, "<html><body>Eclipse incompatible modules found:<ul><br><li>" + StringUtil.join(incompatibleModules, module -> module.getName(), "<br><li>") + "</ul><br>Would you like to proceed and possibly lose your configurations?</body></html>", EclipseBundle.message("eclipse.export.dialog.title"), Messages.getWarningIcon()) != Messages.OK) {
            return;
        }

        if (flag == null) {
            ApplicationManager.getApplication().invokeLater(() -> {
                if (file.getUserData(XML_FILE_WITH_XPATH_INJECTTION) == null) {
                    file.putUserData(XML_FILE_WITH_XPATH_INJECTTION, Boolean.TRUE);
                    if (!ApplicationManager.getApplication().isHeadlessEnvironment()) {
                        DaemonCodeAnalyzer.getInstance(file.getProject()).restart(file);
                    }
                }
            });
        }

        if (Message.class.isAssignableFrom(wsdlClass)) {
            messageWriters.addGenerator(generator);
        } else if (PortType.class.isAssignableFrom(wsdlClass)) {
            portTypeWriters.addGenerator(generator);
        } else if (Binding.class.isAssignableFrom(wsdlClass)) {
            bindingWriters.addGenerator(generator);
        } else if (Service.class.isAssignableFrom(wsdlClass)) {
            serviceWriters.addGenerator(generator);
        } else if (TypeEntry.class.isAssignableFrom(wsdlClass)) {
            typeWriters.addGenerator(generator);
        } else if (Definition.class.isAssignableFrom(wsdlClass)) {
            defWriters.addGenerator(generator);
        }

        if (assignment.getTodo().getAncestorGroup().isPaidFor() && "yes".equalsIgnoreCase(response)) {
            final String message = messageService.createTodoValidatedMessage(assignment);
            notifications.add(new TodoInfoNotification(assignment.getTodo().getCreatedByUser(), message, todoLog));
        }

        if (!oldStack.hasTagCompound() && !newStack.hasTagCompound()) {
            return false;
        }

        if (pathLength == 0) {
            return deprecatedMapper;
        } else {
            return defaultMapper;
        }

        if (((OverviewIndUIElement) element).getNode() instanceof DBSchemaRepNode && columnIndex == 0) {
            return CWMImageEnum.Schema.getImg();
        } else if (((OverviewIndUIElement) element).getNode() instanceof DBCatalogRepNode && columnIndex == 0) {
            return CWMImageEnum.Catalog.getImg();
        } else {
            return null;
        }

        if (this instanceof Request2) ((Request2) this).fillResponseInfo(response);

        if (i < len && value.charAt(i) == '#') {
            ++i;
        }

        if (!(bodyElement instanceof PerlSubExpr)) {
            return Collections.emptyList();
        }

        if (Thread.currentThread() instanceof SingleDownloadController) {
            return ((SingleDownloadController) Thread.currentThread()).getSessionDownloadFilename();
        }

        if (method.outgoingEdgesOf(current).isEmpty()) {
            final ProverExpr postAtom = postcondition.instPredicate(varMap);
            final ProverExpr exitAtom = exitPred.instPredicate(varMap);
            ProverHornClause clause = p.mkHornClause(postAtom, new ProverExpr[]{exitAtom}, p.mkLiteral(true));
            tsClauses.add(clause);
            S2H.sh().addClause((Statement) null, tsClauses);
            clauses.add(clause);
        } else {
            final ProverExpr exitAtom = exitPred.instPredicate(varMap);
            for (CfgEdge edge : method.outgoingEdgesOf(current)) {
                CfgBlock succ = method.getEdgeTarget(edge);
                if (!todo.contains(succ) && !done.contains(succ)) {
                    todo.add(succ);
                }
                final ProverExpr exitCondExpr;
                if (edge.getLabel().isPresent()) {
                    exitCondExpr = expEnc.exprToProverExpr(edge.getLabel().get(), varMap);
                } else {
                    exitCondExpr = p.mkLiteral(true);
                }
                final ProverExpr succAtom = blockPredicates.get(succ).instPredicate(varMap);
                ProverHornClause clause = p.mkHornClause(succAtom, new ProverExpr[]{exitAtom}, exitCondExpr);
                tsClauses.add(clause);
                S2H.sh().addClause((Statement) null, tsClauses);
                clauses.add(clause);
            }
        }

        if (subscriptions.isEmpty()) {
            activationFailedForSM(msisdn, pack, deactivationDate, reason, operator, mode);
            return;
        } else {
            boolean canBeDeactivated = false;
            for (Subscription subscription : subscriptions) {
                if (subscription.getStatus().canTransitionTo(SubscriptionStatus.DEACTIVATED)) canBeDeactivated = true;
            }
            if (!canBeDeactivated) {
                activationFailedForSM(msisdn, pack, deactivationDate, reason, operator, mode);
                return;
            }
        }

        if (o instanceof CatchEvent) {
            CatchEvent event = (CatchEvent) o;
            String featureName = f.getName();
            if (featureName.equals("outputSet") || featureName.equals("dataOutputs") || featureName.equals("dataOutputAssociation")) {
                if (event.getOutputSet() == null || event.getOutputSet().getDataOutputRefs().size() == 0 || event.getDataOutputAssociation().size() == 0 || event.getDataOutputs().size() == 0) {
                    return false;
                }
                DataOutputAssociation association = event.getDataOutputAssociation().get(0);
                if (association.getTargetRef() == null) return false;
            }
        }

        if (o1 == name || o1 == nameSelect) return -1;
        else if (o2 == name || o2 == nameSelect) return 1;
        else if (o1 == password) return -1;
        else if (o2 == password) return 1;
        else if (o1 == rememberAccount) return -1;
        else if (o2 == rememberAccount) return 1;
        else if (o1 instanceof AbstractButton) return -1;
        else if (o2 instanceof AbstractButton) return 1;
        else return 0;

        if (form instanceof KualiForm && StringUtils.isNotEmpty(((KualiForm) form).getAnchor())) {
            budgetConstructionForm.setBalanceInquiryReturnAnchor(((KualiForm) form).getAnchor());
        }

        if (url.endsWith(".xml")) {
            int[] rgdispid = auto.getIDsOfNames(new String[]{"Stop"});
            auto.invoke(rgdispid[0]);
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) {
            sql += " AND r.userId in (-1";
            for (User user : _students) {
                sql += "," + user.getUserId();
            }
            sql += ") ";
        }

        if (getViewID() == App.VIEW_TEXT_PREVIEW || getViewID() < 0) {
            doRepaint();
            return;
        }

        if (rawPercent > 0.33) {
            return 98;
        }

        if (upcomingIndex >= upcomingEvents.size()) {
            List<ToDo> subset = todos.subList(todoIndex, todos.size());
            for (ToDo td : subset) {
                merged.add(td);
            }
            return merged;
        }

        if (additionalParams != null) {
            for (int i = 0; i < additionalParams.length; i++) {
                url.append(AMPERSAND).append(additionalParams[i][0]).append(EQUALS).append(WS.encode(additionalParams[i][1]));
            }
        }

        if (controller.isNewUser(userCode)) {
            askUserToIdentify(userCode);
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    waitForUserToIdentify(userCode);
                    messageResponder.messageArrived(userCode, msg, color);
                }
            });
        } else {
            messageResponder.messageArrived(userCode, msg, color);
        }

        if (info.submaps > 1) {
            opb.write(1, 1);
            opb.write(info.submaps - 1, 4);
        } else {
            opb.write(0, 1);
        }

        if (knowledgeBoxModel == null) {
            getParams().set("knowledge", dataWrapper.getKnowledge());
        } else {
            getParams().set("knowledge", knowledgeBoxModel.getKnowledge());
        }

        if (!(Double.isNaN(centroid.getX()) || Double.isNaN(centroid.getY()))) {
            double centroidX = centroid.getX() + markerFillProperties.getXOffset();
            double centroidY = centroid.getY() + markerFillProperties.getYOffset();
            FPoint2D p = new FPoint2D(new Point2D.Double(centroidX, centroidY));
            markerSymbol.draw(g, affineTransform, p, null);
        } else {
            double centroidX = shp.getBounds().getCenterX();
            double centroidY = shp.getBounds().getCenterY();
            FPoint2D p = new FPoint2D(new Point2D.Double(centroidX, centroidY));
            markerSymbol.draw(g, affineTransform, p, null);
        }

        if (System.getProperty("java.specification.version").compareTo("1.4") > 0) {
            if (!QueueTool.isDispatchThread()) {
                queueTool.setOutput(oper.getOutput().createErrorOutput());
                queueTool.waitEmpty(10);
                queueTool.waitEmpty(10);
                queueTool.waitEmpty(10);
            }
        }

        if (source_.isSelfContained() && source_.isStatic() && !source_.isWebsiteRmd()) {
            ArrayList<String> files = new ArrayList<String>();
            FileSystemItem selfContained = FileSystemItem.createFile(source_.getDeployFile());
            files.add(selfContained.getName());
            setFileList(files, null, null);
            setPrimaryFile(selfContained.getName());
            return;
        }

        if (languageCode == null) {
            return new WikiSite(domain);
        }

        if (verbosity == null) {
            debug.setDebug(verb);
            verbosity = new Integer(verb);
        }

        if (this instanceof Period && that instanceof Period) {
            if (pos == RelativePosition.MEETS) return -1;
            if (pos == RelativePosition.BEGINS) return -1;
            if (pos == RelativePosition.BEGUN_BY) return +1;
            if (pos == RelativePosition.ENDS) return +1;
            if (pos == RelativePosition.ENDED_BY) return -1;
            if (pos == RelativePosition.OVERLAPS) return -1;
            if (pos == RelativePosition.OVERLAPPED_BY) return +1;
            if (pos == RelativePosition.DURING || pos == RelativePosition.CONTAINS || pos == RelativePosition.EQUALS)
                return 0;
        }

        if (config.getCountry().equals(ConfigDescriptor.Country.LIBERIA)) {
            addObsColumn(dsd, "diagnosis_code", "PIH:DIAGNOSIS", converters.getObsValueCodedConceptCode("Liberia MoH"));
        }

        if (!(object.asObjectable() instanceof TaskType)) {
            return;
        }

        if (reply.equals("ack")) {
            success = true;
        } else if (reply.equals("nack")) {
        } else {
            LOG.error("ERROR: MSG Received: {}", reply);
        }

        if ("mvn:com.thoughtworks.paranamer:paranamer:2.8".equals(unwrappedRepo)) {
            LOG.info("Working around broken hibernate-validator-osgi-karaf-features...");
            unwrappedRepo = "mvn:com.thoughtworks.paranamer/paranamer/2.8";
        }

        if (vals.length == 8) {
            String[] ss = box.split(",");
            vals = new double[]{parseDouble(ss[0] + "." + ss[1]), parseDouble(ss[2] + "." + ss[3]), parseDouble(ss[4] + "." + ss[5]), parseDouble(ss[6] + "." + ss[7])};
        }

        if (Group.findByName(context, "MIT Users") != null) {
            request.setAttribute("mitgroup", Boolean.TRUE);
        }

        if (replaySemaphore.get() == 0) {
            LOG.warn("-> Dispatcher. replaySemaphore was 0, stays equals ");
            replaySemaphore.set(0);
            return;
        }

        if (relUrl.indexOf('.') == 0 && base.getFile().indexOf('/') != 0) {
            base = new URL(base.getProtocol(), base.getHost(), base.getPort(), "/" + base.getFile());
        }

        if (dumpMsgOnError) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            inputSource.getByteStream().reset();
            while (true) {
                int i = inputSource.getByteStream().read();
                if (-1 == i) {
                    break;
                }
                baos.write(i);
            }
            logger.log(Level.SEVERE, baos.toString("UTF-8"), ex);
        } else {
            logger.log(Level.WARNING, "Parse error", ex);
        }

        if (questionToUse instanceof InternalQuestionWithoutValues) isValidCode = true;

        if (BUG_106024_TEXT_SELECTION) {
            fLastSelection = getSelection();
            fCaretPosition = fLastSelection.y;
            fText.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    selectionChanged();
                }
            });
            fText.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseUp(MouseEvent e) {
                    selectionChanged();
                }
            });
        }

        if ("kt".equals(psiFile.getFileType().getDefaultExtension())) {
            return false;
        }

        if (contentLen > buf.length - headerSize) {
            byte[] newbuf = new byte[contentLen + headerSize];
            System.arraycopy(buf, 0, newbuf, 0, headerSize);
            buf = newbuf;
        }

        if (!lp.isItemRemoved()) {
            if (TRACE) TraceCompat.beginSection("addView");
            if (disappearingItem) {
                if (append) {
                    addDisappearingView(v);
                } else {
                    addDisappearingView(v, 0);
                }
            } else {
                if (append) {
                    addView(v);
                } else {
                    addView(v, 0);
                }
            }
            if (TRACE) TraceCompat.endSection();
            if (mChildVisibility != -1) {
                v.setVisibility(mChildVisibility);
            }
            if (mPendingMoveSmoothScroller != null) {
                mPendingMoveSmoothScroller.consumePendingMovesBeforeLayout();
            }
            int subindex = getSubPositionByView(v, v.findFocus());
            if (!mInLayout) {
                if (index == mFocusPosition && subindex == mSubFocusPosition && mPendingMoveSmoothScroller == null) {
                    dispatchChildSelected();
                }
            } else if (!mInFastRelayout) {
                if (!mInLayoutSearchFocus && index == mFocusPosition && subindex == mSubFocusPosition) {
                    dispatchChildSelected();
                } else if (mInLayoutSearchFocus && index >= mFocusPosition && v.hasFocusable()) {
                    mFocusPosition = index;
                    mSubFocusPosition = subindex;
                    mInLayoutSearchFocus = false;
                    dispatchChildSelected();
                }
            }
            measureChild(v);
        }

        if (currExp instanceof AggregateExpression) {
            boolean found = false;
            int offset = 0;
            for (Integer colguid : sourceColumns) {
                PlanColumn plancol = m_context.get(colguid);
                if (outputCol.alias.equals(plancol.getDisplayName())) {
                    found = true;
                    expression = (AbstractExpression) plancol.m_expression.clone();
                    assert (expression instanceof TupleValueExpression);
                    TupleValueExpression tve = (TupleValueExpression) expression;
                    tve.setColumnIndex(offset);
                    break;
                }
                ++offset;
            }
            if (!found) {
                LOG.error("PLANNER ERROR: could not match aggregate column alias");
                LOG.error(getSQLText());
                throw new RuntimeException("Could not match aggregate column alias.");
            }
            break;
        } else if (currExp instanceof TupleValueExpression) {
            TupleValueExpression tve = (TupleValueExpression) currExp;
            boolean found = false;
            int offset = 0;
            for (Integer colguid : sourceColumns) {
                PlanColumn plancol = m_context.get(colguid);
                if (tve.getColumnName().equals(plancol.originColumnName()) && tve.getTableName().equals(plancol.originTableName())) {
                    tve.setColumnIndex(offset);
                    found = true;
                    break;
                }
                ++offset;
            }
            if (!found) {
                LOG.error("PLANNER ERROR: could not match tve column alias");
                LOG.error(getSQLText());
                throw new RuntimeException("Could not match TVE column alias.");
            }
        }

        if (path.endsWith(File.separator)) {
            url = Script.class.getClassLoader().getResource(path + script);
        } else {
            url = Script.class.getClassLoader().getResource(path + File.separator + script);
        }

        if (!onIsMultiPane() && !getIntent().hasExtra(EXTRA_SHOW_FRAGMENT)) {
            setPreferenceScreen(getPreferenceScreenFromHeader(R.xml.preference_header));
        }

        if (Platform.isCurrentPlatform(Platform.HPUX) && "PA_RISC2.0".equals(System.getProperty("os.arch")) && System.getProperty("eclipse.product") != null) {
            return false;
        }

        if (!isCollapsed()) {
            FontMetrics metrics = gc.getFontMetrics();
            if (metrics != null) {
                if ((rectangle.height / metrics.getHeight()) <= 1) {
                    fIsVisible = false;
                    return;
                }
            }
        }

        if (!forceRegenerate && !needsGeneration()) {
            return;
        }

        if (InternalFlag.isInternalMode()) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("FileProcessor: " + name + " -> " + (System.currentTimeMillis() - beginTime) / 1000.0 + "s");
            }
        }

        if (rv != null && !leaseSet.getDestination().equals(rv.getDestination()))
            throw new IllegalArgumentException("LS Hash collision");

        if (idList.size() == 0) where.append("0");

        if (genericEnumType == AlertPriority.class) {
            return (S[]) new AlertPriority[size];
        } else if (genericEnumType == EventSeverity.class) {
            return (S[]) new EventSeverity[size];
        } else if (genericEnumType == OperationRequestStatus.class) {
            return (S[]) new OperationRequestStatus[size];
        } else if (genericEnumType == ResourceCategory.class) {
            return (S[]) new ResourceCategory[size];
        } else if (genericEnumType == DriftCategory.class) {
            return (S[]) new DriftCategory[size];
        } else if (genericEnumType == ExecutionStatus.class) {
            return (S[]) new ExecutionStatus[size];
        } else if (genericEnumType == PartitionEventType.class) {
            return (S[]) new PartitionEventType[size];
        } else if (genericEnumType == Server.OperationMode.class) {
            return (S[]) new Server.OperationMode[size];
        } else if (genericEnumType == StorageNode.OperationMode.class) {
            return (S[]) new StorageNode.OperationMode[size];
        } else if (genericEnumType == AlertFilter.class) {
            return (S[]) new AlertFilter[size];
        } else {
            throw new IllegalArgumentException(MSG.dataSource_rpc_error_unsupportedEnumType(genericEnumType.getName()));
        }

        if (geoCoding == null && hasHdfMetadataOrigin(ctx.getNetcdfFile().getGlobalAttributes())) {
            hdfDecode(ctx, p);
        }

        if (safeMin >= Character.MIN_HIGH_SURROGATE) {
            this.safeMinChar = Character.MAX_VALUE;
            this.safeMaxChar = 0;
        } else {
            this.safeMinChar = (char) safeMin;
            this.safeMaxChar = (char) Math.min(safeMax, Character.MIN_HIGH_SURROGATE - 1);
        }

        if (tx.isActive()) {
            tx.rollback();
        }

        if (codigoBarraLeituraOtica != null && !codigoBarraLeituraOtica.equalsIgnoreCase("")) {
            codigoBarraDigitadoCampo1 = codigoBarraLeituraOtica.substring(0, 11);
            codigoBarraDigitadoCampo2 = codigoBarraLeituraOtica.substring(11, 22);
            codigoBarraDigitadoCampo3 = codigoBarraLeituraOtica.substring(22, 33);
            codigoBarraDigitadoCampo4 = codigoBarraLeituraOtica.substring(33, 44);
        } else {
            codigoBarraDigitadoCampo1 = (String) pagamentoActionForm.get("codigoBarraDigitadoCampo1");
            codigoBarraDigitadoDigitoVerificadorCampo1 = (String) pagamentoActionForm.get("codigoBarraDigitadoDigitoVerificadorCampo1");
            codigoBarraDigitadoCampo2 = (String) pagamentoActionForm.get("codigoBarraDigitadoCampo2");
            codigoBarraDigitadoDigitoVerificadorCampo2 = (String) pagamentoActionForm.get("codigoBarraDigitadoDigitoVerificadorCampo2");
            codigoBarraDigitadoCampo3 = (String) pagamentoActionForm.get("codigoBarraDigitadoCampo3");
            codigoBarraDigitadoDigitoVerificadorCampo3 = (String) pagamentoActionForm.get("codigoBarraDigitadoDigitoVerificadorCampo3");
            codigoBarraDigitadoCampo4 = (String) pagamentoActionForm.get("codigoBarraDigitadoCampo4");
            codigoBarraDigitadoDigitoVerificadorCampo4 = (String) pagamentoActionForm.get("codigoBarraDigitadoDigitoVerificadorCampo4");
        }

        if (holder == null) {
            holder = getScrapOrHiddenOrCachedHolderForPosition(position, dryRun);
            if (holder != null) {
                if (!validateViewHolderForOffsetPosition(holder)) {
                    if (!dryRun) {
                        holder.addFlags(ViewHolder.FLAG_INVALID);
                        if (holder.isScrap()) {
                            removeDetachedView(holder.itemView, false);
                            holder.unScrap();
                        } else if (holder.wasReturnedFromScrap()) {
                            holder.clearReturnedFromScrapFlag();
                        }
                        recycleViewHolderInternal(holder);
                    }
                    holder = null;
                } else {
                    fromScrapOrHiddenOrCache = true;
                }
            }
        }

        if (byteRunStream == null) {
            byteRunStream = new DataInputStream(new DecoderStream(IIOUtil.createStreamAdapter(pInput, body.chunkLength), new PackBitsDecoder(true), pPlaneWidth * header.bitplanes));
        }

        if (str.length() == 0) {
            return null;
        }

        if (exception instanceof ConcurrentFindCursorPositionException) {
            future.completeExceptionally(new SubscriptionBusyException(exception.getMessage()));
        } else {
            future.completeExceptionally(new BrokerServiceException(exception));
        }

        if (!scrapers.isEmpty()) {
            tableScraper.getSelectionModel().setSelectionInterval(selectedIndex, selectedIndex);
        }

        if (userAgent.indexOf("MSIE") > -1) {
            Debug.logInfo("Found MSIE changing mime type from - " + mimeType, module);
            mimeType = "application/octet-stream";
        }

        if (element.getClass().getName().equals(ConnectWizardPage.SDR_ROOT_CLASS)) {
            return false;
        } else if (element instanceof ScaUsesPort) {
            return false;
        } else if (element instanceof ScaWaveformFactoriesContainerItemProvider) {
            return false;
        } else if (element instanceof ScaFileSystem<?>) {
            return true;
        } else if (element instanceof ScaFileStore) {
            return false;
        }

        if (getGameState() != GameState.IN_PROGRESS) {
            this.numberOfFramesForGameEnd++;
        } else {
            this.numberOfFramesForGameEnd = 0;
        }

        if (!isSupposedToGenerateHeader()) {
            return null;
        }

        if (pageInfo.getExtends(false) == null) {
            isPoolingEnabled = ctxt.getOptions().isPoolingEnabled();
        } else {
            isPoolingEnabled = false;
        }

        if (this instanceof SynthUI || (c instanceof JTextArea)) {
            return;
        }

        if (renderable.getBlock().getGenusName().equalsIgnoreCase("sum")) {
            matchingBlocks.add(new TextualFactoryBlock((FactoryRenderableBlock) renderable, "+ [number]"));
        }

        if (value instanceof String) {
            String valueString = (String) value;
            if ("".equals(valueString)) {
                value = null;
            }
        }

        if (input_regex == null) {
            throw new ParseException("Regular expression cannot be null.");
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) students = _students;
        else students = CourseLocalServiceUtil.getStudentsFromCourse(course.getCompanyId(), course.getGroupCreatedId());

        if (!(displayDevice instanceof LwjglDisplayDevice)) {
            return;
        }

        if (path.startsWith(WEB_INF_CLASSES_PATH)) {
            path = path.substring(WEB_INF_CLASSES_PATH.length());
        }

        if (anon(iri)) {
            LOGGER.trace("isAnonymousNode(String {})", iri);
            return true;
        } else {
            LOGGER.trace("NOT isAnonymousNode(String {})", iri);
            return false;
        }

        if (changeResource != null) {
            List<JobDraftresourcecategory> oldJdrs = jobDraft.getJobDraftresourcecategory();
            for (JobDraftresourcecategory jdr : oldJdrs) {
                if (jdr.getResourceCategory().getResourceType().getIName().equals(resourceTypeIName)) {
                    jobDraftresourcecategoryDao.remove(jdr);
                    jobDraftresourcecategoryDao.flush(jdr);
                }
            }
            if (changeResource.intValue() == -1)
                return "redirect:/jobsubmit/resource/" + resourceTypeIName + "/" + jobDraftId + ".do";
            JobDraftresourcecategory newJdr = new JobDraftresourcecategory();
            newJdr.setJobDraftId(jobDraftId);
            newJdr.setResourcecategoryId(changeResource);
            jobDraftresourcecategoryDao.save(newJdr);
            return "redirect:/jobsubmit/resource/" + resourceTypeIName + "/" + jobDraftId + ".do";
        }

        if (!createdCtx) {
            super.WillMoveToWindow(window);
            createdCtx = true;
        }

        if (baseURI == null) {
            baseURI = "/";
        } else if (baseURI.charAt(0) != '/') {
            baseURI = "/" + baseURI;
        }

        if (igpkp.wantGen(r, "shex"))
            fragmentError("StructureDefinition-" + sd.getId() + "-shex", "yet to be done: shex as html", f.getOutputNames());

        if (System.getenv("test.third") != null) {
            assertEquals("value-first", strategy.getOrNull("test", first));
            assertEquals(Boolean.TRUE, strategy.getOrNull("test", second));
            assertEquals(300, ((Integer) strategy.getOrNull("test", third)).intValue());
            assertNull(strategy.getOrNull("test", fourth));
        }

        if (Platform.isMac()) NativeLibrary.getInstance("environhack");

        if (httpContext.getSessionAttribute("document_edit_return_view") != null) {
            viewName = (String) httpContext.getSessionAttribute("document_edit_return_view");
        }

        if (dataEncerramento != null && !dataEncerramento.equals("")) {
            verificarExcluirAtualizarProgramacaoOS(numeroOS, dataEncerramento);
        }

        if ((vorrunde != null && vorrunde) && mannschaft.getSpiele().size() > 0) {
            tempSpiele.add(mannschaft.getSpiele().get(0));
            tempSpiele.add(mannschaft.getSpiele().get(1));
        } else if ((vorrunde != null && !vorrunde) && mannschaft.getSpiele().size() > 2) {
            tempSpiele.add(mannschaft.getSpiele().get(2));
            tempSpiele.add(mannschaft.getSpiele().get(3));
        } else {
            tempSpiele.addAll(mannschaft.getSpiele());
        }

        if (!lenient && trimToEmpty(je.getMessage()).contains("undefined variable")) {
            String message = je.getMessage();
            Pattern exceptionPattern = Pattern.compile("^.*undefined variable (.*)");
            Matcher exceptionMatcher = exceptionPattern.matcher(message);
            if (exceptionMatcher.matches()) {
                message = "variable '" + exceptionMatcher.group(1) + "' is not defined in script: '" + script + "'";
            }
            throw new GcExpressionLanguageMissingVariableException(message, je);
        }

        if (s0.getNonTransitMode() == TraverseMode.CAR) {
            if (req.kissAndRide && !s0.isCarParked()) {
                s1.setCarParked(true);
            } else {
                return null;
            }
        }

        if (Patches.JDK_BUG_WITH_TRACE_SEND && (ourTraceMask & VirtualMachine.TRACE_SENDS) != 0) {
            StreamEx.of(myArgs).findAny(ThreadReference.class::isInstance).ifPresent(t -> {
                System.err.println("[JDI: workaround for invocation of " + myMethod + "]");
                myMethod.virtualMachine().setDebugTraceMode(ourTraceMask & ~VirtualMachine.TRACE_SENDS);
            });
        }

        if (questionFeedback != null && !questionFeedback.isEmpty()) {
            return questionFeedback;
        }

        if (getComponent().getList() != null && getComponent().getList().isSet() && !getComponent().getList().isValid()) {
            String invalidBindingReason = getComponent().getList().invalidBindingReason();
            getComponent().getList().forceRevalidate();
            logger.warning("binding was not valid: " + getComponent().getList() + " reason: " + invalidBindingReason);
            if (getComponent().getList().isValid()) {
                logger.warning("Binding has been force revalidated and is now valid. Please investigate.");
            }
        }

        if (nclobs == null) {
            log.debug("Request to release NClob, but appears no NClobs have ever been registered");
            return;
        }

        if (ASTNodes.isParent(anonymous, initializer)) return false;

        if (header.equalsIgnoreCase(UpgradeRequest.CONNECTION)) {
            if (value == null || !value.toLowerCase().contains(validValue.toLowerCase())) {
                throw new HandshakeException(LocalizationMessages.INVALID_HEADER(header, value));
            }
        } else {
            if (!validValue.equalsIgnoreCase(value)) {
                throw new HandshakeException(LocalizationMessages.INVALID_HEADER(header, value));
            }
        }

        if (isBPELFile(resource)) {
            continue;
        }

        if (list.size() > 20) {
            list.removeLast();
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            for (Map.Entry<VolumeClone, Volume> entry : driverCloneToCloneMap.entrySet()) {
                VolumeClone driverClone = entry.getKey();
                Volume clone = entry.getValue();
                ReplicationUtils.removeDetachedFullCopyFromSourceFullCopiesList(clone, dbClient);
                clone.setAssociatedSourceVolume(NullColumnValueGetter.getNullURI());
                clone.setReplicaState(Volume.ReplicationState.DETACHED.name());
            }
            String msg = String.format("doDetachGroupClone -- Detached group clone: %s .", task.getMessage());
            _log.info(msg);
            dbClient.updateObject(clones);
            taskCompleter.ready(dbClient);
        } else {
            String msg = String.format("Failed to detach group clone on storage system %s, clones: %s .", storageSystem.getNativeId(), clones.toString());
            _log.error(msg);
            ServiceError serviceError = ExternalDeviceException.errors.detachVolumeCloneFailed("doDetachGroupClone", msg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (ao instanceof javax.resource.Referenceable) {
            ((javax.resource.Referenceable) ao).setReference(new Reference(jndi));
        }

        if (spf.getClass().getName().indexOf("xerces") != -1) {
            spf.setFeature("http://apache.org/xml/features/allow-java-encodings", true);
        } else {
            DOLUtils.getDefaultLogger().log(Level.WARNING, "modify your java command line to include the -Djava.endorsed.dirs option");
        }

        if (props.containsKey(GSSAPI_CREATE_NAME_GSS_INIT) && Boolean.parseBoolean((String) props.get(GSSAPI_CREATE_NAME_GSS_INIT))) {
            try {
                manager.createName("dummy", GSSName.NT_USER_NAME, KERBEROS_V5);
                saslGssapi.trace("createName workaround for native GSS initialization applied");
            } catch (GSSException e1) {
                saslGssapi.trace("Exception while applying createName workaround for native GSS initialization", e1);
            }
        }

        if (encoding.equals("ISO-2022-KR") && TestUtil.getJavaVendor() == JavaVendor.IBM && TestUtil.getJavaVersion() == 8) {
            logln("Skipping roundtrip check on IBM Java 8: " + id + ", " + encoding);
            return;
        }

        if (e.getMessage().contains("DEFUALT")) {
            timerJobFactoryType = TimerJobFactoryType.DEFAULT;
        } else {
            throw e;
        }

        if (bwConf.getMethodAppearanceFineTuner() == null) {
            Class thisClass = this.getClass();
            boolean overridden = false;
            boolean testFailed = false;
            try {
                while (!overridden && thisClass != DefaultObjectWrapper.class && thisClass != BeansWrapper.class && thisClass != SimpleObjectWrapper.class) {
                    try {
                        thisClass.getDeclaredMethod("finetuneMethodAppearance", new Class[]{Class.class, Method.class, MethodAppearanceDecision.class});
                        overridden = true;
                    } catch (NoSuchMethodException e) {
                        thisClass = thisClass.getSuperclass();
                    }
                }
            } catch (Throwable e) {
                LOG.info("Failed to check if finetuneMethodAppearance is overidden in " + thisClass.getName() + "; acting like if it was, but this way it won't utilize the shared class introspection " + "cache.", e);
                overridden = true;
                testFailed = true;
            }
            if (overridden) {
                if (!testFailed && !ftmaDeprecationWarnLogged) {
                    LOG.warn("Overriding " + BeansWrapper.class.getName() + ".finetuneMethodAppearance is deprecated " + "and will be banned sometimes in the future. Use setMethodAppearanceFineTuner instead.");
                    ftmaDeprecationWarnLogged = true;
                }
                bwConf = (BeansWrapperConfiguration) bwConf.clone(false);
                bwConf.setMethodAppearanceFineTuner(new MethodAppearanceFineTuner() {
                    public void process(MethodAppearanceDecisionInput in, MethodAppearanceDecision out) {
                        BeansWrapper.this.finetuneMethodAppearance(in.getContainingClass(), in.getMethod(), out);
                    }
                });
            }
        }

        if (number == 0) {
            PrismObject<UserType> jack = getUser(userJackOid);
            assertEquals("wrong new full name", yes ? "new full name 3" : "new full name 2", jack.asObjectable().getFullName().getOrig());
        } else {
            PrismObject<UserType> jack = getUser(userJackOid);
            if (yes) {
                assertAssignedRole(jack, roleRole28Oid);
            } else {
                assertNotAssignedRole(jack, roleRole28Oid);
            }
        }

        if (myUI == null) {
            myUI = new MyUI();
        }

        if (edgeIds.length > 0 && edgeIds[0] instanceof Edge)
            return idExists(edge.id(), Stream.of(edgeIds).map(e -> ((Edge) e).id()).toArray());
        else return idExists(edge.id(), edgeIds);

        if (DownloadUtils.staticFileExists(file)) {
            try {
                URL url_ = new URL(DownloadUtils.getStaticCreeperhostLink(file));
                BufferedImage tempImg = ImageIO.read(url_);
                ImageIO.write(tempImg, type, new File(location, file));
                tempImg.flush();
            } catch (IOException e) {
                Logger.logWarn("image download/save failed", e);
                new File(location, file).delete();
            }
        }

        if (Locale.getDefault() == Locale.JAPAN) formatter.setTimeZone(java.util.TimeZone.getTimeZone("JST"));
        else formatter.setTimeZone(java.util.TimeZone.getDefault());

        if (str1.startsWith("*")) {
            str1 = "/" + str1;
        }

        if (existingServer != null && (existingServer.getStartcode() < serverName.getStartcode())) {
            LOG.info("Triggering server recovery; existingServer " + existingServer + " looks stale, new server:" + serverName);
            expireServer(existingServer);
        }

        if (oldObject == null) {
            organizationStrategy.insert(newObject, beginDate);
        } else {
            organizationStrategy.update(oldObject, newObject, beginDate);
        }

        if (defaultValue instanceof Cloneable) {
            Object clone = ElkReflect.clone(defaultValue);
            if (clone == null) {
                throw new IllegalStateException("Couldn't clone property '" + id + "'. " + "Make sure it's type is registered with the " + ElkReflect.class.getSimpleName() + " utility class.");
            }
            return (T) clone;
        } else {
            return defaultValue;
        }

        if (idx >= 0) {
            System.out.println("* " + number);
        }

        if (theClass != Class.class && object instanceof Class) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    MetaClass mc = registry.getMetaClass(Class.class);
                    return mc.getProperty(Class.class, object, name, useSuper, false);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else if (object instanceof Collection) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    return DefaultGroovyMethods.getAt((Collection) object, name);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else if (object instanceof Object[]) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    return DefaultGroovyMethods.getAt(Arrays.asList((Object[]) object), name);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            MetaMethod addListenerMethod = (MetaMethod) listeners.get(name);
            if (addListenerMethod != null) {
                return new MetaProperty(name, Object.class) {
                    public Object getProperty(Object object) {
                        return null;
                    }

                    public void setProperty(Object object, Object newValue) {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        }

        if (name.trim().startsWith("<?")) {
            map.put(" ", new String[]{query});
            return map;
        }

        if (nmod.getRelation() != NOMINAL_MODIFIER && nmod.getRelation() != RELATIVE) {
            continue;
        }

        if (key instanceof UnknownOrderEntryType) {
            return new UnknownOrderEntryTypeEditor();
        }

        if (rows == null) {
            throw new IllegalStateException("rows not definied");
        }

        if (faultHandler == null) {
            return super.getWSDLContents();
        } else {
            EList result = new BasicEList();
            result.addAll(super.getWSDLContents());
            result.addAll(((FaultHandlerImpl) faultHandler).getWSDLContents());
            return result;
        }

        if (profile != null) {
            analytic.setUserId(profile.getId() + "");
        }

        if (transactionData != null && !transactionData.mutationsOccurred()) {
            return false;
        }

        if (separator == 160) {
            strValue = strValue.replaceAll(" ", String.valueOf(separator));
        }

        if (readQual < 1) readQual = 1;

        if ((cout.size() % 1024) == 0) {
            cout.write('\r');
            cout.write('\n');
        }

        if ((readyOps & (SelectionKey.OP_READ | SelectionKey.OP_ACCEPT)) != 0 || readyOps == 0) {
            unsafe.read();
        }

        if (count.length < 3) {
            if (totalLength > (count[0] * count[1])) {
                totalLength = count[0] * count[1];
            }
        }

        if (importStatement.isForeignFileImport()) {
            return null;
        }

        if (!(r instanceof SReferenceLinkAdapterById)) {
            return MetaIdFactory.INVALID_REF_ID;
        }

        if (subNameElement == null || namespaceElement != null && namespaceElement.isBuiltin() || subNameElement.isBuiltIn()) {
            return;
        }

        if (!Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i) != '_') {
            return s.substring(0, i + 1);
        }

        if (!directoriesLoaded.get(directoryIndex)) {
            String directoryName = rootDirectories.get(directoryIndex);
            log.trace("Start loading directory: {}", directoryName);
            XmlPullParserFactory parserFactory;
            try {
                parserFactory = XmlPullParserFactory.newInstance();
            } catch (XmlPullParserException e) {
                log.error("Failed to create parser factory.", e);
                return null;
            }
            parserFactory.setNamespaceAware(false);
            parserFactory.setValidating(false);
            TextureAtlasListXmlLoadingTask<T> task = new TextureAtlasListXmlLoadingTask<>(parserFactory, directoryName, this, directoryMonitors.get(directoryIndex), null);
            if (loadingTasks == null) {
                loadingTasks = new ConcurrentLinkedDeque<>();
                updateTasks = new ConcurrentLinkedQueue<>();
            }
            loadingTasks.add(task);
            task.run();
            directoriesLoaded.set(directoryIndex, Boolean.TRUE);
            loadingStarted = true;
            while (!isLoadingDone()) {
                update();
            }
            loadingStarted = false;
            log.trace("Loading of directory {} is done.", directoryName);
            Texture result = textures.get(cleanName);
            if (result == null) {
                log.error("Failed to load texture: {} from directory: {}", cleanName, directoryName);
            }
            return result;
        }

        if (CFICode().startsWith("F") && (symbol().startsWith("J6") || symbol().startsWith("J7") || symbol().startsWith("WM") || symbol().startsWith("DF"))) {
            return VALUES.newPrice(1, 2);
        }

        if (destCurs.currentTokenType().isStartdoc()) {
            destCurs.toNextToken();
        }

        if (warningWindow != null) {
            ComponentAccessor compAccessor = AWTAccessor.getComponentAccessor();
            int x = compAccessor.getX(target);
            int y = compAccessor.getY(target);
            int width = compAccessor.getWidth(target);
            int height = compAccessor.getHeight(target);
            warningWindow.reposition(x, y, width, height);
        }

        if (vdsExp != null) {
            if (vdsExp.getVdsError() != null) {
                getVDSReturnValue().setVdsError(((VDSExceptionBase) ex).getVdsError());
            } else if (vdsExp.getCause() instanceof VDSExceptionBase) {
                getVDSReturnValue().setVdsError(((VDSExceptionBase) vdsExp.getCause()).getVdsError());
            }
        }

        if (urlPath.startsWith("file:")) {
            try {
                URI uri = new URI(url.getFile());
                host = uri.getHost();
                urlPath = uri.getPath();
            } catch (URISyntaxException e) {
            }
            if (urlPath.startsWith("file:")) {
                urlPath = urlPath.substring(5);
            }
        }

        if ((osReferidaRetornoTipo.getDescricao() == null || osReferidaRetornoTipo.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getDescricaoAbreviada() == null || osReferidaRetornoTipo.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getServicoTipoReferencia() == null || osReferidaRetornoTipo.getServicoTipoReferencia().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getIndicadorTrocaServico() == null || osReferidaRetornoTipo.getIndicadorTrocaServico().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getSituacaoOsReferencia() == null || osReferidaRetornoTipo.getSituacaoOsReferencia().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getAtendimentoMotivoEncerramento() == null || osReferidaRetornoTipo.getAtendimentoMotivoEncerramento().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (osReferidaRetornoTipo.getIndicadorTrocaServico() == null || osReferidaRetornoTipo.getIndicadorTrocaServico().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (attributes == null || (mLabel = (String) attributes.get("name")) == null) {
            mLabel = "test";
        }

        if (fErrorReporter.getMessageFormatter("http://www.w3.org/TR/xml-schema-1") == null) {
            MessageFormatter xmft = null;
            try {
                xmft = (MessageFormatter) (ObjectFactory.newInstance("com.sun.org.apache.xerces.internal.impl.xs.XSMessageFormatter", true));
            } catch (Exception exception) {
            }
            if (xmft != null) {
                fErrorReporter.putMessageFormatter("http://www.w3.org/TR/xml-schema-1", xmft);
            }
        }

        if (e instanceof Expr.Multi) {
            int[] results = generate((Expr.Multi) e, environment, codes, context);
            for (int r : results) {
                operands[index++] = r;
            }
        } else {
            operands[index++] = generate(e, environment, codes, context);
        }

        if (NativeLibrary.osType == NativeLibrary.OSType.MAC) {
            switch (e.getMessage()) {
                case "Unknown error: 316":
                case "No such file or directory":
                    return;
            }
        }

        if (getClips().indexOf("idea") != -1) getClips().remove("idle");

        if (cornerHeight <= 0 || cornerWidth <= 0) {
            path.addRectangle(x, y, width, height);
        } else {
            path.moveTo(x, y);
            path.addArc(x, y, cornerWidth, cornerHeight, 90, 90);
            path.addArc(x, bottom - cornerHeight, cornerWidth, cornerHeight, 180, 90);
            path.addArc(right - cornerWidth, bottom - cornerHeight, cornerWidth, cornerHeight, 270, 90);
            path.addArc(right - cornerWidth, y, cornerWidth, cornerHeight, 0, 90);
            path.close();
        }

        if (timeAlive == 0) {
            attemptCompleteStructure(world.getBlockState(pos));
            timeAlive = 0x1;
        }

        if (wasVisible && url.startsWith("http")) {
            wv.js(JS_INIT_KBD);
            if (SettingsActivity.getExternalFramePlacer(WebReviewActivity.this)) {
                dict = SettingsActivity.getExternalFramePlacerDictionary(WebReviewActivity.this);
                ExternalFramePlacer.run(wv, dict);
            }
            if (SettingsActivity.getPartOfSpeech(WebReviewActivity.this))
                PartOfSpeech.enter(WebReviewActivity.this, wv, url);
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("xaResource.end called for Txn with flag: " + prettyPrintFlags(flags) + " and id: " + xid);
        }

        if (name.length() > 2 && name.charAt(0) == PropertyExpansion.PROPERTY_SEPARATOR && name.charAt(1) == PropertyExpansion.PROPERTY_SEPARATOR) {
            return PropertyExpansionUtils.getGlobalProperty(name.substring(2));
        } else {
            return PropertyExpansionUtils.getGlobalProperty(name);
        }

        if (type.isArray() && type.getArraySize() != null && !(type.getArraySize().isConstant()) && (cgen.params.compiler == null || !cgen.params.compiler.supportsVLAs())) {
            cgen.current.app("*");
        }

        if (Thread.interrupted()) throw new InterruptedException();

        if (layerCompleted) {
            return false;
        }

        if (this.textGUI != null && textGUI != null) {
            throw new UnsupportedOperationException("Are you calling setTextGUI yourself? Please read the documentation" + " in that case (this could also be a bug in Lanterna, please report it if you are sure you are " + "not calling Window.setTextGUI(..) from your code)");
        }

        if (handle.indexOf(' ') >= 0 && bitstream == null) {
            String h[] = handle.split("\\s+");
            handle = h[0];
            bitstream = h[1];
        }

        if (request.getCharacterEncoding() == null || !request.getCharacterEncoding().equals("UTF-8")) {
            try {
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new ArgumentNotValid("Should never happen! UTF-8 not supported", e);
            }
        }

        if (rawKvp.containsKey("VERSION") && rawKvp.containsKey("WMTVER")) {
            String ver = (String) rawKvp.get("VERSION");
            String wmtver = (String) rawKvp.get("WMTVER");
            if (WMS.version(ver, true) != null && WMS.version(wmtver, true) == null) {
                version = ver;
            } else if (WMS.version(ver, true) == null && WMS.version(wmtver, true) != null) {
                version = wmtver;
            }
        }

        if (contextWatchable == null || !(contextWatchable instanceof JavaThisObject)) {
            return null;
        }

        if (name.equalsIgnoreCase(ParameterNamesIms.CGI_3GPP) || name.equalsIgnoreCase(ParameterNamesIms.UTRAN_CELL_ID_3GPP) || name.equalsIgnoreCase(ParameterNamesIms.DSL_LOCATION) || name.equalsIgnoreCase(ParameterNamesIms.CI_3GPP2)) {
            try {
                super.setQuotedParameter(name, value.toString());
            } catch (ParseException e) {
            }
        } else {
            super.setParameter(name, value);
        }

        if (plotsState.getFilename().startsWith("empty.")) {
            view_.showEmptyPlot();
        } else {
            String url = server_.getGraphicsUrl(plotsState.getFilename());
            view_.showPlot(url);
        }

        if (!Options.v().j2me())
            resolveClassErrorSet.add(AnySubType.v(Scene.v().getRefType("java.lang.ClassFormatError")));

        if (!myConsole.isSuppressed(text)) {
            super.notifyTextAvailable(text, outputType);
        }

        if (System.getProperty("java.runtime.name").equals("OpenJDK Runtime Environment") && System.getProperty("java.specification.version").equals("1.6")) {
            cores = 1;
        }

        if (genome.getHomeChromosome().equals(Globals.CHR_ALL)) {
            if (dataset instanceof IGVDataset) {
                genomeSummaryData = ((IGVDataset) dataset).getGenomeSummary();
            } else {
                genomeSummaryData = new GenomeSummaryData(genome, new String[]{trackId});
                for (Chromosome chr : genome.getChromosomes()) {
                    int[] startLocations = dataset.getStartLocations(chr.getName());
                    if (!chr.getName().equals(Globals.CHR_ALL) && (startLocations != null) && (startLocations.length > 0)) {
                        Map<String, float[]> dMap = new HashMap<String, float[]>();
                        dMap.put(trackId, dataset.getData(trackId, chr.getName()));
                        genomeSummaryData.addData(chr.getName(), startLocations, dMap);
                    }
                }
            }
        }

        if (configuredTarget instanceof InputFileConfiguredTarget) {
            continue;
        }

        if (event.isBackgroundEvent()) {
            Schedule.BackgroundEvent be = (Schedule.BackgroundEvent) event;
            BackgroundTask bt = be.getTask();
            if (event.isTaskFinished() || (be.getType() == Schedule.EventType.START && backgroundTasks.contains(bt))) {
                continue;
            }
        }

        if (dsr.getKey().contains("::00:00:00:00:00:01::")) {
            assertEquals(3, dsr.getEntities().size());
            assertEntityEquals(e1c, dsr.getEntities().get(0));
            assertEntityEquals(e1d, dsr.getEntities().get(1));
            assertEntityEquals(e1e, dsr.getEntities().get(2));
        } else if (dsr.getKey().contains("::00:00:00:00:00:02::")) {
            assertEquals(1, dsr.getEntities().size());
            assertEntityEquals(e2, dsr.getEntities().get(0));
        } else {
            fail("Unknown entry in store: " + dsr);
        }

        if (i == ConsoleReader.CR.toCharArray()[0]) {
            super.write(ConsoleReader.RESET_LINE);
        }

        if (!player.capabilities.isCreativeMode) {
            harvestedBlocks.put(new BlockPosition(world, pos.getX(), pos.getY(), pos.getZ()), getBlockInstance(world, VectorConverter.instance().toNova(pos)));
        }

        if (filteringStrategy instanceof DefaultEntryEventFilteringStrategy) {
            eventType = getCQCEventTypeOrNull(eventType, eventFilter, dataKey, dataNewValue, dataOldValue);
        } else {
            int producedEventTypeId = filteringStrategy.doFilter(eventFilter, dataKey, dataOldValue, dataNewValue, eventType, null);
            if (producedEventTypeId == FilteringStrategy.FILTER_DOES_NOT_MATCH) {
                eventType = null;
            } else {
                eventType = EntryEventType.getByType(producedEventTypeId);
            }
        }

        if (uploadAction == UploadAction.delete) {
            toBeRemovedConcepts = toBeUpdatedConcepts;
            toBeUpdatedConcepts = Collections.EMPTY_LIST;
            missingConcepts = Collections.EMPTY_LIST;
        }

        if (!leftType.isNoType() && !rightType.isSubtype(leftType)) {
            JSType ownerType = getJSType(owner);
            if (ownerType.isFunctionPrototypeType()) {
                FunctionType ownerFn = ownerType.toObjectType().getOwnerFunction();
                if (ownerFn.isInterface() && rightType.isFunctionType() && leftType.isFunctionType()) {
                    return true;
                }
            }
            mismatch(t, n, "assignment to property " + propName + " of " + getReadableJSTypeName(owner, true), rightType, leftType);
            return false;
        }

        if (b == AMPERSAND_INT) {
            in.mark(READ_AHEAD);
            int nextb = in.read();
            in.reset();
            if (nextb < 0 || nextb == WS_INT || legal_lowspace_char(nextb)) {
                return QUEST_INT;
            }
        }

        if (runTripEntries.size() > 0) {
            model.put("agencyId", runTripEntries.toArray(new RunTripEntry[runTripEntries.size()])[0].getTripEntry().getId().getAgencyId());
        }

        if (timeout < 0) {
            throw new EhcacheXAException("time out has to be > 0, but was " + timeout, XAException.XAER_INVAL);
        }

        if (SystemInfo.isJavaVersionAtLeast(7, 0, 0)) {
            if (hasOpenEditorFiles()) {
                activateEditorComponentImpl(commandList, false);
            } else {
                focusToolWinowByDefault(id);
            }
        }

        if (qualifierExpression != null) return false;

        if (mockIsCurrentlyBeingReplaced()) {
            return mockitoMock;
        }

        if (mapContext.getLayerModel().getLayerCount() != 0) {
            component.repaint();
        }

        if (!success) {
            if (reason instanceof FileSecurityException) {
                throw (FileSecurityException) reason;
            } else if (reason instanceof LockHeldExternallyException) {
                throw (LockHeldExternallyException) reason;
            } else if (reason instanceof UnexpectedFileNotFoundException) {
                throw (UnexpectedFileNotFoundException) reason;
            } else if (reason instanceof UnexpectedEndOfFileException) {
                throw (UnexpectedEndOfFileException) reason;
            } else if (reason instanceof UnexpectedFileIOException) {
                throw (UnexpectedFileIOException) reason;
            } else if (reason instanceof WrongLengthException) {
                throw (WrongLengthException) reason;
            } else if (reason instanceof WrongMagicException) {
                throw (WrongMagicException) reason;
            }
        }

        if (seeder) {
            for (List<URI> list : torrent.getAnnounceList()) {
                for (URI uri : list) {
                    if (uri.getHost().equals(this.networkService.getLocalHost().getHostAddress())) {
                        this.networkService.freeReservedPort(uri.getPort());
                        this.tracker = new Tracker(new InetSocketAddress(this.networkService.getLocalHost(), uri.getPort()));
                        this.tracker.announce(new TrackedTorrent(this.torrent));
                        this.tracker.start();
                    }
                }
            }
        }

        if (admin.getPeersCount() <= peerCount) {
            LOG.info("Waiting on peercount to go up from " + peerCount);
            Threads.sleep(100);
        }

        if (sw == 1) {
            int[] temp = new int[2 * sh];
            for (int i = 0; i < sw * sh; i++) {
                temp[(i * 2) + 0] = pixels[offset + i];
                temp[(i * 2) + 1] = pixels[offset + i];
            }
            scansize = 2;
            pixels = temp;
            offset = 0;
            sw = 2;
        } else if (sh == 1) {
            int[] temp = new int[sw * 2];
            System.arraycopy(pixels, offset, temp, 0, sw);
            System.arraycopy(pixels, offset, temp, sw, sw);
            scansize = sw;
            pixels = temp;
            offset = 0;
            sh = 2;
        }

        if (!serviceUrl.endsWith("wfs") && !serviceUrl.endsWith("wfs/")) {
            log.warn("altering ServiceURL:" + serviceUrl);
            if (serviceUrl.endsWith("/")) {
                serviceUrl += "wfs";
            } else {
                serviceUrl += "/wfs";
            }
            log.warn("altered ServiceURL:" + serviceUrl);
        }

        if (guiFrame != null) {
            guiFrame.setAlwaysOnTop(false);
        }

        if (idCodigo11 != null && !idCodigo11.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo11, informarNaoEntregaDocumentosActionForm.getQtTentativas11(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento11(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if ("DataInputAssociation".equals(name) || "DataOutputAssociation".equals(name)) return "DataAssociation";

        if (!section.toLowerCase().startsWith(PRIVILEGE_PREFIX)) {
            IndexerModelAuthorizable authorizable = IndexerModelAuthorizables.from(section);
            if (authorizable == null) {
                String msg = "No authorizable found for " + section;
                throw new ConfigurationException(msg);
            }
            result.add(authorizable);
        }

        if (connection_.holdability() == ResultSet.HOLD_CURSORS_OVER_COMMIT) {
            cs.setStringX(7, "DATATYPE='JDBC';IMPORTEDKEY=1; CURSORHOLD=1");
        } else {
            cs.setStringX(7, "DATATYPE='JDBC';IMPORTEDKEY=1; CURSORHOLD=0");
        }

        if (!reUseTextblocks) {
            result = myFactory.createBlock();
            return new TextBlockTraversationContext(result, true);
        }

        if (!redditService.isUserAuthorized()) {
            identityManager.clearSavedUserIdentity();
        }

        if (_getUrl().length() == 0) return;

        if (theClass != Class.class && object instanceof Class) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    MetaClass mc = registry.getMetaClass(Class.class);
                    return mc.getProperty(Class.class, object, name, useSuper, false);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else if (object instanceof Collection) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    return DefaultGroovyMethods.getAt((Collection) object, name);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else if (object instanceof Object[]) {
            return new MetaProperty(name, Object.class) {
                public Object getProperty(Object object) {
                    return DefaultGroovyMethods.getAt(Arrays.asList((Object[]) object), name);
                }

                public void setProperty(Object object, Object newValue) {
                    throw new UnsupportedOperationException();
                }
            };
        } else {
            MetaMethod addListenerMethod = listeners.get(name);
            if (addListenerMethod != null) {
                return new MetaProperty(name, Object.class) {
                    public Object getProperty(Object object) {
                        return null;
                    }

                    public void setProperty(Object object, Object newValue) {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        }

        if (interpolation instanceof InterpolationNearest) {
            return Interpolation.INTERP_NEAREST;
        }

        if (updatedResources.isEmpty() && !getFile().exists()) {
            if (!getDependentResources().isEmpty()) {
                if (logger.isLoggable(Level.WARNING)) {
                    logger.warning("This is not normal, the generated file (" + getFileName() + ") does not exist but RM has not computed that it must be generated");
                }
            }
            generate();
        }

        if (pgs == null) {
            pgs = matchForStarProperties(vds);
            if (pgs == null) {
                System.err.println("Unable to associate VDS property " + vds);
                continue;
            }
        } else {
            if (pgs.length() == 0) {
                continue;
            }
        }

        if (credentials.getPort() == 443) {
            protocol = "https://";
        }

        if (!isPartOfSubQuery(filter)) {
            scopeBindings.retainAll(scopeBindingNames);
        }

        if (!vcsRoot.getVcs().isVcsBackgroundOperationsAllowed(vcsRoot.getPath())) continue;

        if (PuSize == 0) {
            return new DoubleWritable(muValue);
        } else if (QiSize == 0) {
            return new DoubleWritable(muValue);
        }

        if (isWindowsBasedPlatform()) return false;

        if (idCodigo4 != null && !idCodigo4.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo4, informarNaoEntregaDocumentosActionForm.getQtTentativas4(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento4(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (this.prismContext == null) {
            this.prismContext = prismContext;
        }

        if (changed && uidState.pkgOps.isEmpty() && getPackagesForUid(uid).length <= 0) {
            mUidStates.remove(uid);
        }

        if (this.activeObject instanceof List<?>) {
            @SuppressWarnings("unchecked") List<Object> list = (List<Object>) this.activeObject;
            list.add(obj);
        }

        if (suspended instanceof RuleKeyCalculationEvent.Finished) {
            return;
        }

        if (leituraAnteriorPesquisada == null) {
            leituraAnterior = new BigDecimal(obterLeituraAnterior(medicaoHistorico));
        } else {
            leituraAnterior = new BigDecimal(leituraAnteriorPesquisada);
        }

        if (getSession().get(SessionParameter.INCLUDE_OBJECTID_URL_PARAM_ON_CHECKOUT, false)) {
            url.addParameter("objectId", objectId.getValue());
        }

        if (element instanceof CompositePackagingElement) {
            final CompositePackagingElement<?> compositeElement = (CompositePackagingElement<?>) element;
            if (firstName.equals(compositeElement.getName())) {
                result.addAll(findSourceFilesByOutputPath(compositeElement, tail, context, artifactType));
            }
        } else if (element instanceof FileCopyPackagingElement) {
            final FileCopyPackagingElement fileCopyElement = (FileCopyPackagingElement) element;
            if (firstName.equals(fileCopyElement.getOutputFileName()) && tail.length() == 0) {
                ContainerUtil.addIfNotNull(fileCopyElement.findFile(), result);
            }
        } else if (element instanceof DirectoryCopyPackagingElement || element instanceof ExtractedDirectoryPackagingElement) {
            final VirtualFile sourceRoot = ((FileOrDirectoryCopyPackagingElement<?>) element).findFile();
            if (sourceRoot != null) {
                ContainerUtil.addIfNotNull(sourceRoot.findFileByRelativePath(path), result);
            }
        } else if (element instanceof ModuleOutputPackagingElement) {
            for (VirtualFile sourceRoot : ((ModuleOutputPackagingElement) element).getSourceRoots(context)) {
                final VirtualFile sourceFile = sourceRoot.findFileByRelativePath(path);
                if (sourceFile != null && ResourceCompilerConfiguration.getInstance(context.getProject()).isResourceFile(sourceFile)) {
                    result.add(sourceFile);
                }
            }
        }

        if (dataBean.getDob() != null || dobDF.isParseable()) {
            dobDF.setDate(dataBean.getDob());
        }

        if (mStats == null || iStats == null || pStats == null || ioStats == null || tStats == null || indStats == null || sStats == null || qStats == null || cStats == null) {
            return null;
        }

        if (_logger.isLoggable(Level.FINE))
            _logger.log(Level.FINE, "retrying connection due to closed selector exception: connecting to " + host + ":" + port + ", connect timeout=" + _config.getSocketConnectTimeout() + " keepalive=" + LRMIUtilities.KEEP_ALIVE_MODE, e);

        if (TWO_PHASE_ANIMATION && firstStart) {
            if (DEBUG_STATE) Slog.v(TAG, "Initializing start and finish animations");
            mStartEnterAnimation.initialize(finalWidth, finalHeight, halfWidth, halfHeight);
            mStartExitAnimation.initialize(halfWidth, halfHeight, mOriginalWidth, mOriginalHeight);
            mFinishEnterAnimation.initialize(finalWidth, finalHeight, halfWidth, halfHeight);
            mFinishExitAnimation.initialize(halfWidth, halfHeight, mOriginalWidth, mOriginalHeight);
            if (USE_CUSTOM_BLACK_FRAME) {
                mStartFrameAnimation.initialize(finalWidth, finalHeight, mOriginalWidth, mOriginalHeight);
                mFinishFrameAnimation.initialize(finalWidth, finalHeight, mOriginalWidth, mOriginalHeight);
            }
        }

        if (okToProcess(msg.getOptions())) {
            super.sendMessage(destination, msg, null);
            ChannelMessage confirmation = null;
            if (deepclone) confirmation = (ChannelMessage) msg.deepclone();
            else confirmation = (ChannelMessage) msg.clone();
            confirmation.getMessage().reset();
            UUIDGenerator.randomUUID(false, confirmation.getUniqueId(), 0);
            confirmation.getMessage().append(START_DATA, 0, START_DATA.length);
            confirmation.getMessage().append(msg.getUniqueId(), 0, msg.getUniqueId().length);
            confirmation.getMessage().append(END_DATA, 0, END_DATA.length);
            super.sendMessage(destination, confirmation, payload);
        } else {
            super.sendMessage(destination, msg, payload);
        }

        if (user.region == null || user.region.isEmpty()) {
            user.region = holder.region;
        }

        if (i == 0 && count == 0) continue;

        if (name.equals(ComponentInfo.ID) || name.equals(ComponentInfo.TYPE)) {
            continue;
        }

        if (key == null) {
            throw new IllegalArgumentException("Cannot request a reference to null identifier");
        }

        if ("geometry".equals(arg.getName())) {
            return new NameImpl(org.geotools.gml3.v3_2.GML.AbstractGeometryType);
        }

        if ((methodFlags & FLAG_REMOVED) > 0) super.removed(entities);

        if (tag.equals(INIT_TAG)) {
            responseWaiter.put(new DbgpResponsePacket(element, -1));
        } else if (tag.equals(RESPONSE_TAG)) {
            DbgpResponsePacket packet = DbgpXmlPacketParser.parseResponsePacket(element);
            responseWaiter.put(packet);
        } else if (tag.equals(STREAM_TAG)) {
            streamWaiter.put(DbgpXmlPacketParser.parseStreamPacket(element));
        } else if (tag.equals(NOTIFY_TAG)) {
            notifyWaiter.put(DbgpXmlPacketParser.parseNotifyPacket(element));
        }

        if (ce.isReached()) {
            throw new HibernateException("Found shared references to a collection: " + type.getRole());
        }

        if (attr.contains("NaN")) {
            attr = "translate(0,0)";
        }

        if (serviceProperties == null || "false".equals(serviceProperties.getProperty(IGNORE_DEFAULT_VALUES_PROP, "false"))) {
            props.putAll(provider.getProperties());
        }

        if (aDescriptor.hasDerivedId() && !mapping.derivesId()) {
            if (mapping.isAggregateMapping() && allMappings.size() > 1) {
                continue;
            }
        } else if (mapping.isForeignReferenceMapping() && !mapping.isOneToOneMapping()) {
            continue;
        }

        if (report instanceof XMLContentActionReporter) {
            getMetadata(command, model, report);
        } else {
            report.setMessage(model.getCommandName() + " - " + model.getLocalizedDescription());
            report.getTopMessagePart().addProperty("SYNOPSIS", encodeManPage(new BufferedReader(new StringReader(getUsageText(model)))));
            for (CommandModel.ParamModel param : model.getParameters()) {
                addParamUsage(report, param);
            }
            report.setActionExitCode(ActionReport.ExitCode.SUCCESS);
        }

        if (manager instanceof DataCacheManagerImpl) {
            List<String> invalidConfigured = new ArrayList<String>();
            if (_includedTypes != null) {
                for (String s : _includedTypes) {
                    if (_excludedTypes.contains(s)) {
                        invalidConfigured.add(s);
                    }
                }
                if (invalidConfigured.size() > 0) {
                    throw new GeneralException(s_loc.get("invalid-types-excluded-types", invalidConfigured.toString()));
                }
            }
            ((DataCacheManagerImpl) manager).setTypes(_includedTypes, _excludedTypes);
        }

        if (1 == values.length) {
            f.setValue(values[0]);
        } else {
            f.setValue(values);
        }

        if (STYX_WORKFLOW_SA_SECRET_MOUNT_PATH.equals(specSecret.mountPath())) {
            LOG.warn("[AUDIT] Workflow {} tries to mount secret {} to the reserved path", workflowInstance.workflowId(), specSecret.name());
            throw new InvalidExecutionException("Referenced secret '" + specSecret.name() + "' has the mount path " + STYX_WORKFLOW_SA_SECRET_MOUNT_PATH + " defined that is reserved");
        }

        if (!checkPath.startsWith(appProp.getAdminDataFolder())) throw ExUtil.newEx("bad request.");

        if (getOperation() == null && EntityUtils.isResolver(entity)) return false;

        if (addAccountingLine) {
            item.getSourceAccountingLines().add(accountingLineFixture.createRequisitionAccount(item.getItemIdentifier()));
            item.refreshNonUpdateableReferences();
        }

        if (fsId == null) {
            options.add(new AssetOption(policyRestRep.getId(), policyRestRep.getName()));
        } else if (policyRestRep.getAssignedResources() != null && !policyRestRep.getAssignedResources().isEmpty()) {
            for (NamedRelatedResourceRep resource : policyRestRep.getAssignedResources()) {
                if (resource.getId().equals(fsId)) {
                    options.add(new AssetOption(policyRestRep.getId(), policyRestRep.getName()));
                }
            }
        }

        if (logic[0] == AND) {
            result = (BitSet) chain[i].bits(reader).clone();
            ++i;
        } else {
            result = new BitSet(reader.maxDoc());
        }

        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            mailProps.setProperty("mail.smtp.starttls.enable", "true");
            mailProps.setProperty("mail.smtp.ssl.trust", "smtpserver");
        }

        if (cell.isHandoverInProgress()) {
            Logging.logMessage(Logging.LEVEL_INFO, Category.flease, this, "handover in progress for cell %s, renew canceled", cell.getCellId());
            return;
        }

        if (log.isDebugEnabled()) log.debug("Geo info lookup for " + address + " failed: " + e);

        if (list.size() == id + 1) {
            list.clear();
        }

        if (tccl instanceof URLClassLoader) {
            URL[] urls = ((URLClassLoader) tccl).getURLs();
            for (URL url : urls) {
                containerRealm.addURL(url);
            }
        }

        if (SynopticMain.getInstanceWithExistenceCheck().options.stateProcessing) {
            mergeStatesWithEventNodes(results);
        }

        if (moveRoutes.size() == 2) {
            moveRoutes.remove(1);
            moveUnits.remove(1);
        }

        if (jarfile.exists()) {
            jarfile.delete();
        }

        if (needsLayoutTransitionFix && viewCreated) {
            ViewGroup parent = (ViewGroup) getView().getParent();
            if (!(parent instanceof LinearLayout)) parent = (ViewGroup) parent.getParent();
            if (parent.getLayoutTransition() == null) {
                parent.setLayoutTransition(new LayoutTransition());
                needsLayoutTransitionFix = false;
            }
        }

        if (null == url) {
            pw.println("line: (No systemId; cannot read file)");
            pw.println();
            return;
        }

        if (diagnoses.get(0).getDiagnosis().getCodedAnswer() != null) {
            assertThat(diagnoses.get(0).getDiagnosis().getCodedAnswer(), is(firstCodedDiagnosisConcept));
            assertThat(diagnoses.get(1).getDiagnosis().getNonCodedAnswer(), is("some diagnosis"));
        } else {
            assertThat(diagnoses.get(1).getDiagnosis().getCodedAnswer(), is(firstCodedDiagnosisConcept));
            assertThat(diagnoses.get(0).getDiagnosis().getNonCodedAnswer(), is("some diagnosis"));
        }

        if (chartPresenter != null) {
            chartPresenter.reset();
        }

        if (!text.equals(editor.getText())) {
            editor.setText(text);
        }

        if (_templatePath.matches(".*" + "volumes" + ".*")) {
            _file = _storage.getFile(_templatePath + "volume.properties");
            _resourceType = ResourceType.VOLUME;
        } else {
            _file = _storage.getFile(_templatePath + Filename);
        }

        if (idCodigo3 != null && !idCodigo3.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo3, informarNaoEntregaDocumentosActionForm.getQtTentativas3(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento3(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (this.expression.getGroupSymbol() == null || !(this.expression.getGroupSymbol().getMetadataID() instanceof TempMetadataID)) {
            return true;
        }

        if (ClusterTopologyImpl.isNameNodeHAEnabled(configProperties) && (component.equals("SECONDARY_NAMENODE"))) {
            cardinality = new Cardinality("0");
        }

        if (null == getHtmlPageOrNull()) {
            super.setAttributeNS(namespaceURI, qualifiedName, attributeValue);
            return;
        }

        if (sqlExpr instanceof MySqlSelectGroupByExpr) {
            MySqlSelectGroupByExpr sqlSelectGroupByExpr = (MySqlSelectGroupByExpr) sqlExpr;
            sqlExpr = sqlSelectGroupByExpr.getExpr();
        }

        if (selectionAction == SELECTION_INTERSECT) {
            previousSelection = new HashSet<Integer>(selectedFaces);
            unselectAll();
        }

        if (browser != browser.getDisplay().getFocusControl()) Deactivate();

        if (ActionUtil.mustDisableJavaModelAction(getShell(), element)) return;

        if (!hasField(AUTHENTICATION_SCHEME)) {
            if (hasField(USERNAME)) {
                return AuthenticationScheme.BASIC;
            }
        }

        if (catalog.getText().equalsIgnoreCase(existingCatalogName)) {
            return true;
        }

        if (genericTypes.length + 1 == constructor.getParameterTypes().length) {
            genericTypes = new Type[constructor.getGenericParameterTypes().length + 1];
            genericTypes[0] = constructor.getParameterTypes()[0];
            for (int i = 0; i < constructor.getGenericParameterTypes().length; ++i) {
                genericTypes[i + 1] = constructor.getGenericParameterTypes()[i];
            }
        }

        if (content == null) {
            return;
        }

        if (Objects.equals(StorageManager.UUID_PRIMARY_PHYSICAL, mPrimaryStorageUuid) || Objects.equals(StorageManager.UUID_PRIMARY_PHYSICAL, volumeUuid)) {
            Slog.d(TAG, "Skipping move to/from primary physical");
            onMoveStatusLocked(MOVE_STATUS_COPY_FINISHED);
            onMoveStatusLocked(PackageManager.MOVE_SUCCEEDED);
            mHandler.obtainMessage(H_RESET).sendToTarget();
            return;
        } else {
            from = findStorageForUuid(mPrimaryStorageUuid);
            to = findStorageForUuid(volumeUuid);
            if (from == null) {
                Slog.w(TAG, "Failing move due to missing from volume " + mPrimaryStorageUuid);
                onMoveStatusLocked(PackageManager.MOVE_FAILED_INTERNAL_ERROR);
                return;
            } else if (to == null) {
                Slog.w(TAG, "Failing move due to missing to volume " + volumeUuid);
                onMoveStatusLocked(PackageManager.MOVE_FAILED_INTERNAL_ERROR);
                return;
            }
        }

        if (idCodigo13 != null && !idCodigo13.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo13, informarNaoEntregaDocumentosActionForm.getQtTentativas13(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento13(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if ((funcionalidade.getDescricao() == null || funcionalidade.getDescricao().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (funcionalidade.getDescricaoAbreviada() == null || funcionalidade.getDescricaoAbreviada().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (funcionalidade.getCaminhoMenu() == null || funcionalidade.getCaminhoMenu().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO)) && (funcionalidade.getCaminhoMenu() == null || funcionalidade.getCaminhoMenu().equals("" + ConstantesSistema.NUMERO_NAO_INFORMADO))) {
            throw new ControladorException("atencao.filtro.nenhum_parametro_informado");
        }

        if (relTypes != null && relTypedefs != null) {
            if (relTypes.length != relTypedefs.length) {
                throw new IllegalArgumentException();
            }
            String[] nonDups = renameDuplicates(relTypedefs);
            for (int i = 0; i < relTypes.length; i++) {
                try {
                    if (relTypes[i] == null) {
                        throw new IllegalArgumentException(id + " " + Arrays.asList(relTypes));
                    }
                    Class arrayType = relTypes[i].isArray() ? relTypes[i] : getArrayType(relTypes[i]);
                    String typeName = arrayType.getCanonicalName();
                    String methodName = findNonConflictingName(ccClassName, arrayType, nonDups[i], null, is_a);
                    CtClass relTypeClass = cp.get(typeName);
                    CtMethod relMethod = new CtMethod(relTypeClass, methodName, new CtClass[]{}, cc);
                    relMethod.setModifiers(Modifier.PUBLIC | Modifier.ABSTRACT);
                    Annotation relAnnotation = new Annotation("org.sc.obo.annotations.Relates", constpool);
                    relAnnotation.addMemberValue("value", new StringMemberValue(relTypedefs[i], ccFile.getConstPool()));
                    AnnotationsAttribute annotations = new AnnotationsAttribute(constpool, AnnotationsAttribute.visibleTag);
                    annotations.addAnnotation(relAnnotation);
                    relMethod.getMethodInfo().addAttribute(annotations);
                    cc.addMethod(relMethod);
                } catch (NotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }

        if (this.normalizedPKColumnNames == null) {
            this.normalizedPKColumnNames = new ArrayList<>(this.pkColumnNames.size());
            for (String name : pkColumnNames) {
                ColumnDef cd = findColumn(name);
                if (cd == null) throw new RuntimeException("Couldn't find column for primary-key: " + name);
                this.normalizedPKColumnNames.add(cd.getName());
            }
        }

        if (eqi.isSponsonMounted) {
            location += "po";
        }

        if (ref.length() > "/content".length() && contentHostingService.isInDropbox(ref.substring("/content".length()))) {
            return false;
        }

        if (existing != null) {
            SSymbol hackedName = new SSymbol("\0!" + name.getString());
            assert !factoryMethods.containsKey(hackedName);
            factoryMethods.put(hackedName, meth);
        } else {
            factoryMethods.put(name, meth);
        }

        if (timeStampDB.compareTo(servicoCobrancaValor.getUltimaAlteracao()) != 0) {
            throw new ActionServletException("atencao.atualizacao.timestamp");
        }

        if (key.endsWith(DefinableArchivalUnit.SUFFIX_HASH_FILTER_FACTORY) && !key.endsWith(DefinableArchivalUnit.SUFFIX_CRAWL_FILTER_FACTORY)) {
            toRemove.add(key);
        }

        if (!permissionsWrapper.canIssueCommand(dataset, UpdateDatasetCommand.class)) {
            return permissionsWrapper.notAuthorized();
        }

        if (JAVA_8) {
            if (!listener.getClass().getName().startsWith(FXCanvas.class.getName() + "$")) {
                super.addMouseWheelListener(listener);
            }
        } else {
            super.addMouseWheelListener(listener);
        }

        if (!(obj instanceof GenericEntityReference)) {
            return false;
        }

        if (critName.equals("Heat Sink") && dblSinks) {
            critName = "Double Heat Sink";
        }

        if (isAbsoluteURL(path)) {
            return this;
        }

        if (rowData.length > 0 && (data.isContentTypeCompatitible("text/mothur-oligos") || data.isContentTypeCompatitible("text/mothur-count"))) {
            for (int i = 0; i < rowData[0].length; i++) {
                columnTitles[i] = String.valueOf(rowData[0][i]);
            }
            Object[][] rowDataWithoutTitleRow = new Object[rowData.length - 1][];
            System.arraycopy(rowData, 1, rowDataWithoutTitleRow, 0, rowData.length - 1);
            rowData = rowDataWithoutTitleRow;
            rowCount--;
        }

        if (event instanceof MessageEvent) {
            synchronized (countMonitor) {
                this.messagesInFlight--;
            }
        }

        if (status != null && myStatusOnLastUpdate == status && !(force)) {
            return;
        }

        if (devTop + 0.5 == Math.floor(devTop + 0.5)) {
            g2d = (Graphics2D) g2d.create();
            double devPix = 1 / scale;
            g2d.translate(0, -devPix);
        }

        if (superType == null) {
            superType = getFactory().Type().objectType();
            superType.setImplicit(true);
            superType.setParent(this);
        }

        if (lhs.getByteSize() != null && key.length != lhs.getByteSize()) {
            key = Arrays.copyOf(key, lhs.getByteSize());
        }

        if (CrsTransformer.getCurrentSrid() == 4326) {
            return false;
        } else {
            return currentCrs.isMetric();
        }

        if (rgb == -16777216) {
            pixels++;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            drawLineCount = wasDrawCalled ? drawLineCount + 1 : 0;
            wasDrawCalled = false;
            isFirstMargin = drawLineCount <= lines;
        }

        if ((raster.getRasterSize().equals(mask.getRasterSize()))) {
            maskNameList.add(mask.getName());
        }

        if (!event.getPath().equals(watchedNode)) {
            LOG.log(Level.INFO, "Ignoring call for node:" + watchedNode);
            return;
        }

        if (overrides() && isAbstract()) {
            throw Jooc.error(this, "overriding methods are not allowed to be declared abstract");
        }

        if (depth++ > 0) {
            super.startElement(uri, localName, qName, attributePointer, attributeCount);
        }

        if (alwaysFixed) {
            return false;
        }

        if (context != null) {
            log.info("Using context file:" + context.getApplicationContextFile());
            thread.setContextClassLoader(context.getClass().getClassLoader());
        }

        if (selectedFile != null && currentDir != null && Platform.OS.WINDOWS.equals(Platform.getOS())) {
            fd.setFile(new File(currentDir, selectedFile).getAbsolutePath());
        } else {
            if (selectedFile != null) {
                fd.setFile(selectedFile);
            }
            if (currentDir == null) {
                fd.setDirectory(get(PREFERENCE_DIRECTORY, currentDir));
            }
        }

        if (display instanceof DisplayImpl) {
            renderer.setWaitMessageVisible(false);
            image = ((DisplayImpl) display).getImage(doSync);
            renderer.setWaitMessageVisible(true);
        } else {
            image = display.getImage();
        }

        if (AppD.MAC_OS) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    f.setSelectionStart(1);
                    f.setSelectionEnd(1);
                }
            });
        }

        if (isFeatureMember(localName)) {
            attributes = new Vector();
            attributeNames = new Vector();
            insideFeature = true;
            tempValue = null;
        } else if (insideFeature) {
            for (int i = 0; i < atts.getLength(); i++) {
                String name = atts.getLocalName(i);
                if (name.equalsIgnoreCase("fid")) {
                    typeName = new String(localName);
                    fid = atts.getValue(i);
                } else {
                    attributes.add(atts.getValue(i));
                    attributeNames.add(name);
                }
            }
            if (!typeName.equalsIgnoreCase(localName)) {
                if (attName.equals("")) {
                    attName = localName;
                } else {
                    attName = attName + "/" + localName;
                }
            }
            insideAttribute = true;
            return;
        } else if (insideAttribute) {
        } else {
            parent.startElement(namespaceURI, localName, qName, atts);
        }

        if (uri.toString().endsWith("_")) {
            List<Resource> resources = getDataProvider().getResources('/' + uri.lastSegment());
            for (Resource res : resources) {
                return this.getDescription(uri, res);
            }
        } else {
            Resource resource = null;
            try {
                resource = getDataProvider().getResource(uri);
                IResourceDescription description = getDescription(uri, resource);
                cache.put(uri, description);
                return description;
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }

        if (len < 2) {
            if (e instanceof SimpleNode) {
                Expression parent = (Expression) ((SimpleNode) e).jjtGetParent();
                if (parent != null) {
                    return paramsDbType(parent);
                }
            }
            return null;
        }

        if (operation instanceof PStart) {
            this.visibleVariables = new HashSet<PVariable>(((PStart) operation).getAPrioriVariables());
            this.allVariables.addAll(visibleVariables);
        } else if (operation instanceof PProject) {
            this.visibleVariables = new HashSet<PVariable>(((PProject) operation).getToVariables());
        } else {
            this.visibleVariables = new HashSet<PVariable>();
            for (SubPlan parentPlan : parentPlans) this.visibleVariables.addAll(parentPlan.getVisibleVariables());
            for (PConstraint constraint : deltaConstraints)
                this.visibleVariables.addAll(constraint.getDeducedVariables());
        }

        if (numBytes == 8) {
            utils.checkAlignment(address, 4);
        } else {
            utils.checkAlignment(address, numBytes);
        }

        if (notifier instanceof InternalEObject) {
            InternalEObject internalEObject = (InternalEObject) notifier;
            if (additionalResourceContainerPossible) {
                Resource eDirectResource = internalEObject.eDirectResource();
                if (eDirectResource != null && eDirectResource.eAdapters().contains(this)) {
                    return;
                }
            }
            if (additionalObjectContainerPossible) {
                InternalEObject eInternalContainer = internalEObject.eInternalContainer();
                if (eInternalContainer != null && eInternalContainer.eAdapters().contains(this)) {
                    return;
                }
            }
        }

        if (!pkg.equals("com.android.providers.downloads") || Log.isLoggable("DownloadManager", Log.VERBOSE)) {
            int enqueueStatus = EVENTLOG_ENQUEUE_STATUS_NEW;
            if (ignoreNotification) {
                enqueueStatus = EVENTLOG_ENQUEUE_STATUS_IGNORED;
            } else if (old != null) {
                enqueueStatus = EVENTLOG_ENQUEUE_STATUS_UPDATE;
            }
            EventLogTags.writeNotificationEnqueue(callingUid, callingPid, pkg, id, tag, userId, notification.toString(), enqueueStatus);
        }

        if (parseIndex < messageLength) {
            char c = work.charAt(parseIndex);
            if (c == OBJECT_AGAIN || c == OBJECT_BEGIN) return readObject(di, BonaPortable.class);
        }

        if (this.objectMapper.getSerializationConfig().isEnabled(SerializationConfig.Feature.INDENT_OUTPUT)) {
            jsonGenerator.useDefaultPrettyPrinter();
        }

        if (!section.toLowerCase().startsWith(PRIVILEGE_PREFIX)) {
            SearchModelAuthorizable authorizable = SearchModelAuthorizables.from(section);
            if (authorizable == null) {
                String msg = "No authorizable found for " + section;
                throw new ConfigurationException(msg);
            }
            result.add(authorizable);
        }

        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        }

        if ((target instanceof AxisFault) && (target.getClass() != AxisFault.class)) {
            addFaultDetail(Constants.QNAME_FAULTDETAIL_EXCEPTIONNAME, target.getClass().getName());
        }

        if (!isRemote) {
            @NotNull final RequestContext requestContext = requestContext(uri);
            if (requestContext.bootstrap() != null)
                throw new UnsupportedOperationException("Its not possible to set the bootstrap when " + "acquiring a queue");
            assetTree.acquireView(requestContext.view("queue").type(String.class).type2(String.class).cluster(""));
        }

        if (this.metadata.getField(i).getType() == DataFieldMetadata.STRING_FIELD) {
            transMap[i] = new Jetel2LdapString(this.multiSeparator);
        } else if (this.metadata.getField(i).getType() == DataFieldMetadata.BYTE_FIELD || this.metadata.getField(i).getType() == DataFieldMetadata.BYTE_FIELD_COMPRESSED) {
            transMap[i] = new Jetel2LdapByte();
        } else {
            throw new BadDataFormatException("LDAP intialialisation : Field " + dfm.getName() + " has type " + dfm.getType() + " which is not supported." + "Only String and Byte array types are supported.");
        }

        if (fragments.length == 3 && applicationName.length() == 0) {
            applicationName = "/" + fragments[2];
        }

        if (!adminService.unregister(Resources.continuous(cp.deviceId(), cp.port(), Bandwidth.class).id())) {
            log.warn("unregisterResources for {} failed", cp);
        }

        if (!onlyAvailableServices) {
            return super.getUnitTemplate();
        }

        if (stringForm != null) {
            return StringHelper.split(delim, stringForm);
        } else {
            return ArrayHelper.EMPTY_STRING_ARRAY;
        }

        if (featureConfig == null) {
            return metaInfos;
        }

        if (attr.isNumerical()) {
            attr.registerStatistics(new NumericalStats(attr));
        }

        if (ApplicationManager.getApplication().isUnitTestMode()) {
            runnable.run();
        } else {
            myInitActionsAlarm.addRequest(runnable, 300);
        }

        if (obj.getGroupSymbol().getMetadataID() instanceof TempMetadataID) {
            TempMetadataID tid = (TempMetadataID) obj.getGroupSymbol().getMetadataID();
            if (tid.isScalarGroup()) {
                evaluationNotPossible(EvaluationLevel.PROCESSING);
                return;
            }
        }

        if ((name == null) && (getDelegate() != null)) {
            name = getDelegate().getName();
        }

        if (K9.FOLDER_NONE.equals(localFolderServerId)) {
            localFolder.delete(false);
        }

        if (renderable.getBlock().getGenusName().equalsIgnoreCase("number")) {
            matchingBlocks.add(new TextualFactoryBlock((FactoryRenderableBlock) renderable, digits));
        }

        if (kickstartAction instanceof KickstartAction) {
            ((KickstartAction) kickstartAction).getKickstartActionDetails().setCobblerSystemName(rec.getName());
        }

        if (excludeWCB) {
            criteriaQry += " and b.billingType != 'WCB' ";
        }

        if (myElement instanceof PsiLanguageInjectionHost && !StringUtil.startsWith(myElement.getText(), startInElement, str)) {
            escaper = ((PsiLanguageInjectionHost) myElement).createLiteralTextEscaper();
            valueRange = ElementManipulators.getValueTextRange(myElement);
            StringBuilder sb = new StringBuilder();
            escaper.decode(valueRange, sb);
            decoded = sb;
            wsHead += Math.max(0, startInElement - valueRange.getStartOffset());
        } else {
            escaper = null;
            decoded = str;
            valueRange = TextRange.from(startInElement, decoded.length());
        }

        if (form instanceof KualiForm && StringUtils.isNotEmpty(((KualiForm) form).getAnchor())) {
            tForm.setBalanceInquiryReturnAnchor(((KualiForm) form).getAnchor());
        }

        if (this.selector == Equal || this.selector == NotEqual) {
            if ((left == null) && (right == null)) {
                return this.selector == Equal;
            } else if ((left == null) || (right == null)) {
                return this.selector == NotEqual;
            }
            if (left instanceof Number && left instanceof Comparable && right instanceof Comparable && left.getClass().equals(right.getClass())) {
                return (((Comparable) left).compareTo((Comparable) right) == 0) == (this.selector == Equal);
            }
            if (((left instanceof Number) && (right instanceof Number)) && (left.getClass() != right.getClass())) {
                double leftDouble = ((Number) left).doubleValue();
                double rightDouble = ((Number) right).doubleValue();
                if (Double.isNaN(leftDouble) && Double.isNaN(rightDouble)) {
                    return this.selector == Equal;
                }
                return (leftDouble == rightDouble) == (this.selector == Equal);
            }
            return left.equals(right) == (this.selector == Equal);
        } else if (this.selector == IsNull) {
            return (left == null);
        }

        if (inWorld()) {
            I.say("Already in world...");
            return false;
        }

        if (context.getProcessType().isServer() && context.getCurrentAddress().size() > 0 && SUBSYSTEM.equals(context.getCurrentAddress().getElement(0).getKey())) {
            return true;
        }

        if (lc && ((lcAttr = (String) jsr77LowerCase.get(attrName)) != null)) {
            attrName = lcAttr;
        }

        if (!listaAg.isEmpty() || listaAg.size() > 0) {
            BigDecimal total = divisionControlada(new BigDecimal(cexHd.getChdNumConsultas() * object.getChoPorcentajeAgenda()), new BigDecimal(100)).setScale(0, RoundingMode.UP);
            for (int i = 0; i < total.intValue() - 1; i++) {
                listaAg.get(i).setCagTipo(1);
            }
            concurrentAdmin.grabarListas(CexHorariosDia.class, listaAg, (UsuarioAdmin) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user"));
        }

        if (!isKeyboardBidi()) return false;

        if (key == null) return true;

        if ((renderer instanceof DefaultTreeCellRenderer) && (getCellEditor() instanceof DefaultXTreeCellEditor)) {
            ((DefaultXTreeCellEditor) getCellEditor()).setRenderer((DefaultTreeCellRenderer) renderer);
        }

        if (this.childTypeFilter == null) {
            this.childTypeFilter = FacesContextUtility.getOptionalRequestParameter(CHILD_TYPE_FILTER_INPUT_CLIENT_ID);
        }

        if (resource.getType() == IResource.FILE) {
            recursionType = RecursionType.NONE;
        }

        if ((style & SWT.SAVE) == 0) {
            int index = fileType.lastIndexOf(".");
            if (index != -1 && ((index + 1) < fileType.length())) {
                fileType = fileType.substring(index + 1);
            }
        }

        if (stringValue != null) {
            EvaluationContext evaluationContext = new EvaluationContext(formDef.getEvaluationContext(), reference);
            AbstractTreeElement node = evaluationContext.resolveReference(reference);
            int dataType = node.getDataType();
            setValueInFormDef(formDef, reference, stringValue, dataType);
        } else {
            formDef.setValue(null, reference);
        }

        if (Validator.isNotNull(_students) && _students.size() > 0) students = _students;
        else students = CourseLocalServiceUtil.getStudentsFromCourse(companyId, courseGropupCreatedId);

        if (JavaVersion.current().isJava9Compatible()) {
            jvmArgs.add("--add-modules=ALL-SYSTEM");
        }

        if (columnName.equals("entrezgene/locuslink")) return "entrez gene/locuslink";

        if (Position.hasMoved(oldLocation, newLocation) && !player.isDead() && !vehicle.isDead()) {
            double distance = newLocation.distanceSquared(oldLocation);
            if (distance > 100 * 100) {
                session.getPlayer().kickPlayer("You moved too quickly :( (Hacking?)");
                return;
            } else if (distance > 100) {
                GlowServer.logger.warning(session.getPlayer().getName() + " moved too quickly!");
            }
        }

        if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"))) {
            return _quotation_createNode_crriw5_a0a4a02();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d5b617L, "jetbrains.mps.baseLanguage.structure.ByteType"))) {
            return _quotation_createNode_crriw5_a0a0e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940cc380dL, "jetbrains.mps.baseLanguage.structure.ShortType"))) {
            return _quotation_createNode_crriw5_a0a1e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7f3L, "jetbrains.mps.baseLanguage.structure.LongType"))) {
            return _quotation_createNode_crriw5_a0a2e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d327fdL, "jetbrains.mps.baseLanguage.structure.FloatType"))) {
            return _quotation_createNode_crriw5_a0a3e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d451a6L, "jetbrains.mps.baseLanguage.structure.DoubleType"))) {
            return _quotation_createNode_crriw5_a0a4e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d6513eL, "jetbrains.mps.baseLanguage.structure.BooleanType"))) {
            return _quotation_createNode_crriw5_a0a5e0u();
        } else if (SNodeOperations.isInstanceOf(rawType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d4f826L, "jetbrains.mps.baseLanguage.structure.CharType"))) {
            return _quotation_createNode_crriw5_a0a6e0u();
        } else {
            return rawType;
        }

        if (t != null && t.equals(Paragraph.LIST_TYPE)) {
            builder.append("<li class=\"bullet-type-").append(ident % 3).append("\" style=\"margin-left: ").append((ident + 1) * 22).append("px;\">");
            identing = true;
        } else if (ident > 0) {
            builder.append("<li style=\"margin-left: ").append(ident * 22).append("px;\">");
            identing = true;
        } else {
            closeIndentIfNecessary(builder);
        }

        if (result.contains(module)) {
            return;
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("xaResource.start called for Txn with flag: " + prettyPrintFlags(flags) + " and id: " + xid);
        }

        if (m_hostName == null) {
            String s = "Invalid request. Must provide host information when requesting a host_resource instance resource.";
            return Response.status(400).entity(s).build();
        }

        if (!(newIP.equals(oldIP) && newPort == oldPort)) {
            System.out.println("MANAGER: Remapping communications, new IP");
            inf.reMap(oldIP, newIP);
        }

        if ((key != null) && key.matches(".* *url") && value instanceof String) {
            String path = (String) value;
            if (path.startsWith("file:")) {
                File fixedPath = GeoserverDataDirectory.findDataFile(path);
                entry.setValue(DataUtilities.fileToURL(fixedPath).toExternalForm());
            }
        } else if (value instanceof URL && ((URL) value).getProtocol().equals("file")) {
            File fixedPath = GeoserverDataDirectory.findDataFile(((URL) value).toString());
            entry.setValue(DataUtilities.fileToURL(fixedPath));
        }

        if (pathPart.equals("/" + NodeName.ROOT)) continue;

        if (!"tenant_id".equals(entry.getKey()) && !"alias".equals(entry.getKey())) {
            sb.append(indent + entry.getKey() + "\t" + entry.getValue() + ";\n");
        }

        if (File.class == p.type || URL.class == p.type) {
            File f = uploadedFile;
            if ("directory".equals(p.key)) {
                f = f.getParentFile();
            }
            Object converted = null;
            if (URI.class.equals(p.type)) {
                converted = f.toURI();
            } else if (URL.class.equals(p.type)) {
                try {
                    converted = f.toURL();
                } catch (MalformedURLException e) {
                }
            }
            if (converted != null) {
                connectionParameters.put(p.key, converted);
            } else {
                connectionParameters.put(p.key, f);
            }
            continue;
        }

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            BitmapDrawable bg = (BitmapDrawable) getResources().getDrawable(R.drawable.bg_striped);
            bg.setTileModeXY(TileMode.REPEAT, TileMode.REPEAT);
            getSupportActionBar().setBackgroundDrawable(bg);
            BitmapDrawable bgSplit = (BitmapDrawable) getResources().getDrawable(R.drawable.bg_striped_split_img);
            bgSplit.setTileModeXY(TileMode.REPEAT, TileMode.REPEAT);
            getSupportActionBar().setSplitBackgroundDrawable(bgSplit);
        }

        if (command == null || command.length() == 0) {
            throw new IllegalArgumentException(LocalizedStrings.ManagedEntityController_EXECUTION_COMMAND_IS_EMPTY.toLocalizedString());
        }

        if (!(value instanceof Data)) {
            return 0;
        }

        if (image == null) frameCount = -1;

        if (official_name.equalsIgnoreCase("P0")) {
            for (int x = 0; x < num_children; x++) {
                if (daughters[x].official_name.equalsIgnoreCase("AB")) daughters[x].setVolume(vol * .6f);
                else daughters[x].setVolume(vol * .4f);
            }
        } else {
            for (int x = 0; x < num_children; x++) {
                daughters[x].setVolume(vol / (float) num_children);
            }
        }

        if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"))) {
            Iterable<SNode> staticImportedFields = null;
            if ((AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x53f7c33f069862f2L, "jetbrains.mps.baseLanguage.structure.JavaImports"))) != null)) {
                staticImportedFields = ClassifierResolveUtils.staticImportedFields(AttributeOperations.getAttribute(__thisNode__, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x53f7c33f069862f2L, "jetbrains.mps.baseLanguage.structure.JavaImports"))));
            }
            Iterable<SNode> variables = SNodeOperations.ofConcept(Sequence.fromIterable(IClassifierType__BehaviorDescriptor.getMembers_id6r77ob2V1Fr.invoke(IClassifier__BehaviorDescriptor.getThisType_id6r77ob2UWbY.invoke(__thisNode__))).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                    return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93c84351fL, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) || (SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && !(isStaticContext));
                }
            }).concat(Sequence.fromIterable(staticImportedFields)), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, "jetbrains.mps.baseLanguage.structure.VariableDeclaration"));
            return Scopes.forVariables(kind, variables, ScopeUtils.lazyParentScope(__thisNode__, kind));
        }

        if (!GraphicsEnvironment.isHeadless()) {
            int screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
            int canvasWidth = canvas.getPreferredSize().width;
            if (canvasWidth < screenWidth) {
                Page p = pages.get(pages.size() - 1);
                p.addPixelWidth(screenWidth - canvasWidth);
                PageChangeEventManager.notifyListeners();
            }
        }

        if (myElementToRename != null && myElementToRename.isValid()) {
            if (Comparing.strEqual(myOldName, myElementToRename.getName())) return myElementToRename;
            if (myRenameOffset != null)
                return PsiTreeUtil.findElementOfClassAtRange(myElementToRename.getContainingFile(), myRenameOffset.getStartOffset(), myRenameOffset.getEndOffset(), PsiNameIdentifierOwner.class);
        }

        if (dataType == null) {
            dataType = createDataType(type);
            typeInstances.put(type, dataType);
        }

        if (IDOCopier.isDatasourceOracle(fromConn)) {
            return EntityControl.getCheckedRelatedTableName(entityRelationship.getTableName());
        } else {
            return entityRelationship.getSetTableName();
        }

        if ((portAlignment == PortAlignment.DISTRIBUTED || portAlignment == PortAlignment.JUSTIFIED) && nodeContext.portContexts.get(portSide).size() == 1) {
            calculatedPortPlacementHeight = modifiedPortPlacementSize(nodeContext, portAlignment, calculatedPortPlacementHeight);
            portAlignment = PortAlignment.CENTER;
        }

        if ("getString".equals(methodName) && args != null && args.length == 1 && args[0] instanceof String) {
            return getString((String) args[0]);
        } else if ("getType".equals(methodName)) {
            return ResultSet.TYPE_FORWARD_ONLY;
        } else {
            Object o = method.invoke(rs, args);
            if (o instanceof ResultSetMetaData) {
                return (ResultSetMetaData) Proxy.newProxyInstance(o.getClass().getClassLoader(), new Class[]{ResultSetMetaData.class}, new ResultSetMetaDataInvocationHandler((ResultSetMetaData) o));
            } else {
                return o;
            }
        }

        if (e.getCause() instanceof UnderlyingStorageException && e.getCause().getMessage().equals("Id capacity exceeded")) {
            throw new TooManyLabelsException(e);
        }

        if (tableReport instanceof ReportHTML) {
            ReportHTML htmlReportModule = (ReportHTML) tableReport;
            htmlReportModule.addRowWithTaggedContentHyperlink(rowData, tag);
        } else {
            tableReport.addRow(rowData);
        }

        if (g.canReadField(f)) {
            boolean isComposite = false;
            Set membersSet = null;
            if (f.getName().equals("members") && g.hasComposite()) {
                isComposite = true;
                membersSet = new HashSet();
            } else {
                membersSet = g.getImmediateMemberships(f);
            }
            Collection members = new ArrayList();
            members.addAll(membersSet);
            members.addAll(g.getEffectiveMemberships(f));
            if (f.getName().equals("members") && g.hasComposite()) {
                members.addAll(g.getCompositeMemberships());
            }
            if (members.isEmpty() && !isComposite) {
                return;
            }
            this.xml.internal_indent();
            this.xml.internal_puts("<list field=" + Quote.single(XML.escape(f.getName())) + " groupType=" + Quote.single(XML.escape(f.getUuid().equals(Group.getDefaultList().getUuid()) ? "" : f.getGroupType().getName())) + ">");
            if (isComposite) {
                this._writeComposite(CompositeFinder.findAsOwner(g, true));
            }
            this._writeMembers(members, g);
            this.xml.internal_puts("</list> " + this.xml.internal_comment(Quote.single(XML.escape(f.getName()))));
            this.xml.internal_undent();
            this.xml.internal_puts();
        }

        if (breakpoint != null && column == 4 && supportsMoreConfig(breakpoint)) {
            BreakpointsDialogFactory.getInstance(process.getXDebugSession().getProject()).showDialog(process.getBreakpointHandler().getXBreakpoint(breakpoint));
        } else if (event.getClickCount() == 1 && breakpoint != null && table.getSelectedRows().length == 1) {
            selectSnapshot(breakpoint, false);
        }

        if (dn.equals(ServerDNConstants.CN_SCHEMA_DN)) {
            return SchemaService.getSubschemaEntryCloned(directoryService);
        } else {
            CoreSession session = opContext.getSession();
            LookupOperationContext lookupContext = new LookupOperationContext(session, dn, SchemaConstants.ALL_ATTRIBUTES_ARRAY);
            lookupContext.setPartition(opContext.getPartition());
            lookupContext.setTransaction(opContext.getTransaction());
            serverEntry = directoryService.getPartitionNexus().lookup(lookupContext);
        }

        if (Lists.newArrayList(file.list()).contains("reflections")) {
            file = new File(file, "reflections");
        }

        if (max > 1) {
            if (!Options.v().j2me()) {
                typeVariable(ArrayType.v(RefType.v("java.lang.Cloneable"), max - 1));
                typeVariable(ArrayType.v(RefType.v("java.io.Serializable"), max - 1));
            }
        }

        if (!leaseSet.verifySignature()) {
            processStoreFailure(key, leaseSet);
            if (_log.shouldLog(Log.WARN)) _log.warn("Invalid leaseSet signature! " + leaseSet);
            return "Invalid leaseSet signature on " + key;
        }

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB && android.os.Build.VERSION.SDK_INT <= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
            formattedMessage.append("\u200b");

        if (System.getProperty("os.name").toLowerCase().contains("linux"))
            return Executors.newSingleThreadExecutor(new ContextPropagatingThreadFactory("DNS seed lookups"));
        else return Executors.newFixedThreadPool(seeds.size(), new DaemonThreadFactory("DNS seed lookups"));

        if (group == null) {
            logger.error("The grooup name was not being set from the request!");
            group = connection.getEndPoint1().substring(connection.getEndPoint1().indexOf("#") + 1);
            group = group.substring(0, group.indexOf("/"));
            cluster.setGroup(group);
            device.setGroup(group);
        } else {
            cluster.setGroup(group);
        }

        if (logger.isDebugEnabled())
            logger.debug("!!! TODO: implement handleItemModified() !!!" + item + " DATA=" + item.getData().toString());

        if (result.e < -1024) {
            result.zero = true;
            return result;
        } else if (result.e > 1024) {
            result.infinity = true;
            return result;
        }

        if (pigContext.getExecType() == ExecType.MAPREDUCE) {
            String newfiles = conf.get("alternative.mapreduce.job.cache.files");
            if (newfiles != null) {
                String files = conf.get(MRConfiguration.JOB_CACHE_FILES);
                conf.set(MRConfiguration.JOB_CACHE_FILES, files == null ? newfiles.toString() : files + "," + newfiles);
            }
        }

        if (!getBattlePanel().getBattleFrame().isVisible()) {
            requestWindowFocus();
        }

        if (logger.isDebugEnabled()) logger.debug("/** @todo implement alertSoundChanged() */");

        if (!section.getLangSectionParent().isPresent()) {
            try {
                section.setLevel(section.getLevel() + 1);
            } catch (IllegalArgumentException e) {
            }
        }

        if (s != null && !(s instanceof Stream.PushedStream)) {
            windowController.removeStream(streamid);
        }

        if (x.getTarget().isSynthetic() || (x.getTarget().isConstructor() && ((JConstructor) x.getTarget()).isDefaultConstructor())) {
            return;
        }

        if (msg.contains("Use a class customization to resolve") && msg.contains("with the same name")) {
            int idx = msg.lastIndexOf("class customization") + 19;
            msg = msg.substring(0, idx) + " or the -autoNameResolution option" + msg.substring(idx);
        }

        if (r) {
            m.collapse(PARSABLE_STRING_USE_VARS);
        } else {
            m.drop();
        }

        if (selectedIndex < 0) {
            selectedIndex = 0;
        }

        if (RectangleMapObject.class.isAssignableFrom(object.getClass())) {
            RectangleMapObject rect = (RectangleMapObject) object;
            object.getProperties().put(PROPERTY_WIDTH, rect.getRectangle().width / parent.getTileWidth());
            object.getProperties().put(PROPERTY_HEIGHT, rect.getRectangle().height / parent.getTileHeight());
        }

        if (iterations > 3) {
            trailEffect.render(canvas, camera, alpha);
        }

        if (idCodigo6 != null && !idCodigo6.equals("-1")) {
            montarDocumentoNaoEntregue(idCodigo6, informarNaoEntregaDocumentosActionForm.getQtTentativas6(), documentoTipo, informarNaoEntregaDocumentosActionForm.getMatriculaOuNumeroDocumento6(), mesAnoConta, dataDevolucaoFormatada, cliente, colecaoDocumentosNaoEntregues);
            contador = contador + 1;
        }

        if (key == null) return null;

        if (displayDevice == null) {
            GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            displayDevice = environment.getDefaultScreenDevice();
        }

        if ((out.size() % 1024) == 0) {
            out.write('\r');
            out.write('\n');
        }

        if (StringUtils.countChar(url.toExternalForm(), ' ') > 0) {
            String newPath = url.toExternalForm().replaceAll(" ", "%20");
            url = new URL(newPath);
        }

        if (vuln.getScanCloseVulnerabilityMaps() != null) {
            for (ScanCloseVulnerabilityMap map : vuln.getScanCloseVulnerabilityMaps()) {
                if (map != null && map.getScan() != null && map.getScan().getId().equals(scanToDelete.getId())) {
                    closeMapsToRemove.add(map);
                    continue;
                }
                if (map != null && map.getScan() != null && map.getScan().getImportTime() != null && (newCloseTime == null || newCloseTime.before(map.getScan().getImportTime()))) {
                    newCloseTime = map.getScan().getImportTime();
                }
            }
        }

        if (scope.getLanguage() != GroovyLanguage.INSTANCE && processor.getHint(NameHint.KEY) != null) {
            return new JavaResolverProcessor(processor);
        }

        if (dataDomain.getDataDomainType().equals("org.caleydo.datadomain.genetic"))
            DataDomainManager.get().initalizeDataDomain("org.caleydo.datadomain.genetic");

        if (!payAppDoc.getDocumentHeader().getWorkflowDocument().isCanceled()) {
            documentService.cancelDocument(payAppDoc, ArKeyConstants.DOCUMENT_DELETED_FROM_CASH_CTRL_DOC);
        }

        if (readable == 0) {
            return ROOT;
        }

        if ("http://www.opengis.net/gml/3.2".equals(namespace)) {
            return new Prefix(false, "gml");
        }

        if ("application/zip".equalsIgnoreCase(accept)) {
            return ZipBulkBuilder.buildTag(tag, keys, channelService, headerBuilder);
        } else {
            return MultiPartBulkBuilder.buildTag(tag, keys, channelService, uriInfo, headerBuilder);
        }

        if (!Options.v().j2me()) {
            typeVariable(hierarchy.CLONEABLE);
            typeVariable(hierarchy.SERIALIZABLE);
        }

        if (dvObject.getId() != null) {
            dvObject = dvObjectService.findDvObject(dvObject.getId());
        }

        if (Double.isNaN(sigma) || Double.isNaN(prevSigma)) {
            throw new RuntimeException("Point values may be the same; approximation convereged to NaN");
        }

        if (this.validacionCorreo) {
            System.out.println("el correo " + proveedor.getCorreo() + " ya existe.");
            this.lblMsgCorreo.setVisible(true);
        } else {
            System.out.println("el correo es valido. No existe en la BD.");
            this.lblMsgCorreo.setVisible(false);
            this.validacionCorreo = false;
        }

        if (EntityUtils.isResolver(toLookahead))
            toEd = toLookahead.wGetParent().wGetEntityDescriptor(toLookahead).getEntityDescriptor(0);
        else toEd = toLookahead.wGetEntityDescriptor(0);

        if ((AttributeOperations.getAttribute(_context.getOutputNode(), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xedf22a442bc4e5dL, 0x954f06aaaf51df00L, 0x10f9f9812b8fca93L, "jetbrains.mps.lang.makeup.structure.CopyOutcome"))) != null)) {
            String loc = SPropertyOperations.getString(AttributeOperations.getAttribute(_context.getOutputNode(), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xedf22a442bc4e5dL, 0x954f06aaaf51df00L, 0x10f9f9812b8fca93L, "jetbrains.mps.lang.makeup.structure.CopyOutcome"))), MetaAdapterFactory.getProperty(0xedf22a442bc4e5dL, 0x954f06aaaf51df00L, 0x10f9f9812b8fca93L, 0x10f9f9812b8fca94L, "location"));
            if ((loc != null && loc.length() > 0)) {
                File parent = new File(loc).getParentFile();
                if (parent != null) {
                    SPropertyOperations.assign(AttributeOperations.getAttribute(_context.getOutputNode(), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xedf22a442bc4e5dL, 0x954f06aaaf51df00L, 0x10f9f9812b8fca93L, "jetbrains.mps.lang.makeup.structure.CopyOutcome"))), MetaAdapterFactory.getProperty(0xedf22a442bc4e5dL, 0x954f06aaaf51df00L, 0x10f9f9812b8fca93L, 0x10f9f9812b8fca94L, "location"), new File(parent, SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + ".properties").getPath());
                }
            }
        }

        if (speeds.length < 0) {
            return -1f;
        }

        if (isFailBackRequest && replicatedPolicy.isAllowAutoFailBack()) {
            BackupTopologyListener listener1 = new BackupTopologyListener(activeMQServer.getNodeID().toString(), clusterConnection.getConnector());
            clusterConnection.addClusterTopologyListener(listener1);
            if (listener1.waitForBackup()) {
                activeMQServer.fail(true);
                ActiveMQServerLogger.LOGGER.restartingReplicatedBackupAfterFailback();
                activeMQServer.setHAPolicy(replicatedPolicy.getReplicaPolicy());
                activeMQServer.start();
            } else {
                ActiveMQServerLogger.LOGGER.failbackMissedBackupAnnouncement();
            }
        }

        if (className == null) {
            return getClassname();
        }

        if (aModel instanceof DRFModel) if (aModel._output.isBinomialClassifier()) return DistributionFamily.bernoulli;
        else if (aModel._output.isClassifier()) return DistributionFamily.multinomial;
        else return DistributionFamily.gaussian;

        if (Boolean.getBoolean(USE_ENV_VARS)) {
            try {
                nssLibDir = System.getenv(AFIRMA_NSS_HOME);
            } catch (final Exception e) {
                LOGGER.warning("No se tiene acceso a la variable de entorno '" + AFIRMA_NSS_HOME + "': " + e);
            }
            if (nssLibDir != null) {
                final File nssDir = new File(nssLibDir);
                if (nssDir.isDirectory() && nssDir.canRead()) {
                    LOGGER.info("Directorio de NSS determinado a partir de la variable de entorno '" + AFIRMA_NSS_HOME + "'");
                } else {
                    LOGGER.warning("La variable de entorno '" + AFIRMA_NSS_HOME + "' apunta a un directorio que no existe o sobre el que no se tienen permisos de lectura, se ignorara");
                    nssLibDir = null;
                }
            }
        }

        if (p.getType() == Poll.V3_POLL) {
            NodeStateImpl ns = (NodeStateImpl) nm.getNodeState(p.getCachedUrlSet());
            if (ns != null) ns.closeV3Poll(p.getKey());
        }

        if (VERSION.SDK_INT < 18) {
            int inputType = text.getInputType();
            text.setInputType(inputType | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        }

        if (menu.getComponents().length == 0) return;

        if (page.filterType != FilterType.status) page.selectPage(children);

        if (templateNodeId == null) {
            return;
        }

        if (!file.getName().toLowerCase().endsWith(format.toLowerCase())) {
            file = new File(file.getAbsolutePath() + '.' + format.toLowerCase());
        }

        if (param.dataType.equals("string") && param.defaultValue != null && !param.defaultValue.isEmpty()) {
            param.defaultValue = "'" + param.defaultValue + "'";
        }

        if (aggregatedDfs != null && needsScores) {
            return super.createNormalizedWeight(query, needsScores);
        } else if (profiler != null) {
            return super.createNormalizedWeight(query, needsScores);
        } else {
            return in.createNormalizedWeight(query, needsScores);
        }

        if (anon(iri)) {
            LOGGER.trace("isAnonymousSharedNode(String {})", iri);
            return true;
        } else {
            LOGGER.trace("NOT isAnonymousSharedNode(String {})", iri);
            return false;
        }

        if (rawKvp.containsKey("sections")) {
            SectionsKvpParser parser = new SectionsKvpParser();
            String value = (String) rawKvp.get("sections");
            EObject sections = (EObject) parser.parse(value);
            kvp.put("sections", sections);
        }

        if (newName.contains("/")) {
            throw ExUtil.newEx("Invalid node name characters.");
        }

        if (e.getStatus() == 500 && (IMAGE_NOT_FOUND_BY_SWARM_ERROR_MESSAGE.matcher(e.getOriginError()).matches() || REPOSITORY_NOT_FOUND_BY_SWARM_ERROR_MESSAGE.matcher(e.getOriginError()).matches())) {
            try {
                Thread.sleep(5000);
                return super.createContainer(params);
            } catch (DockerException de) {
                throw decorateMessage(de);
            } catch (InterruptedException ie) {
                throw decorateMessage(e);
            }
        }

        if (isWebPFile || isPurgeable) {
            byte[] bytes = bufferedSource.readByteArray();
            if (calculateSize) {
                BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, options, request);
            }
            bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
        } else {
            if (calculateSize) {
                InputStream stream = new SourceBufferingInputStream(bufferedSource);
                BitmapFactory.decodeStream(stream, null, options);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, options, request);
            }
            bitmap = BitmapFactory.decodeStream(bufferedSource.inputStream(), null, options);
        }

        if (c instanceof JTextComponent) {
            if (m_savedMnemonic > 0) {
                ((JTextComponent) c).setFocusAccelerator(m_savedMnemonic);
            }
        }

        if (hasRole && ((CmsRole.CATEGORY_EDITOR.equals(role)) || (CmsRole.GALLERY_EDITOR.equals(role)))) {
            String info = CmsRole.CONFIRM_ROLE_PREFIX + role.getRoleName();
            Object prop = OpenCms.getRuntimeProperty(info);
            if ((prop != null) && Boolean.valueOf(prop.toString()).booleanValue()) {
                Object val = user.getAdditionalInfo(info);
                if ((val == null) || !Boolean.valueOf(val.toString()).booleanValue()) {
                    if (hasRole(CmsRole.WORKPLACE_USER, roles) && !hasRole(CmsRole.DEVELOPER, roles) && !hasRole(CmsRole.PROJECT_MANAGER, roles) && !hasRole(CmsRole.ACCOUNT_MANAGER, roles)) {
                        hasRole = false;
                    }
                }
            }
        }

        if (level > 1000) {
            continue;
        }

        if (session.getProtocolVersion().equals(ProtocolVersion.v0_9)) {
            MethodRegistry_0_9 methodRegistry = (MethodRegistry_0_9) session.getMethodRegistry();
            AMQMethodBody recoverOk = methodRegistry.createBasicRecoverSyncOkBody();
            session.writeFrame(recoverOk.generateFrame(channelId));
        } else if (session.getProtocolVersion().equals(ProtocolVersion.v0_91)) {
            MethodRegistry_0_91 methodRegistry = (MethodRegistry_0_91) session.getMethodRegistry();
            AMQMethodBody recoverOk = methodRegistry.createBasicRecoverSyncOkBody();
            session.writeFrame(recoverOk.generateFrame(channelId));
        }

        if (prefs.getFileDirForDatabase() == null) {
            dirs = prefs.getGeneratedDirForDatabase();
        } else {
            dirs = prefs.getFileDirForDatabase();
        }

        if (!imageUuid.matches(IMAGE_KIND_PATTERN)) {
            imageUuid = IMAGE_PREFIX + imageUuid;
        }

        if (helpSetPath == null) {
            helpSetPath = helpSetElement.getAttribute("path");
        }

        if (system.equals("http://hl7.org/fhir/data-types") || system.equals("http://hl7.org/fhir/restful-interaction") || system.equals("http://dicom.nema.org/resources/ontology/DCM") || system.equals("http://unstats.un.org/unsd/methods/m49/m49.htm") || system.equals("http://www.cms.gov/Medicare/Coding/ICD9ProviderDiagnosticCodes/codes.html") || system.equals("http://www.cms.gov/Medicare/Coding/ICD10/index.html") || system.equals("http://www.iana.org/assignments/language-subtag-registry") || system.equals("http://www.nucc.org") || system.equals("https://www.census.gov/geo/reference/") || system.equals("https://www.usps.com/") || system.startsWith("http://cimi.org") || system.startsWith("http://hl7.org/fhir/ValueSet/v3") || system.startsWith("http://ihc.org") || system.startsWith("urn:oid:"))
            return true;

        if (i == 0) {
            signConfig.put(PROPERTY_NAME_SCHEMA_BASE, Base64.encode(XAdESTriPhaseSignerUtil.removeCommonParts(preSignature.getXmlSign(), preSignature.getEncoding(), extraParams)));
            if (preSignature.getEncoding() != null) {
                signConfig.put(PROPERTY_NAME_XML_ENCODING, preSignature.getEncoding());
            }
        }

        if (collection != null) {
            if (Hibernate.isInitialized(collection)) {
                collection.clearDirty();
            }
            if (collection instanceof AbstractPersistentCollection && ((AbstractPersistentCollection) collection).getSession() != null && targetSession != ((AbstractPersistentCollection) collection).getSession()) {
                collection.unsetSession(((AbstractPersistentCollection) collection).getSession());
            }
        }

        if (outputs.size() == 0) {
            outputs.put("result", new Output("-"));
        }

        if (colecaoGrupoFuncionalidadeOperacao != null && !colecaoGrupoFuncionalidadeOperacao.isEmpty()) {
            Iterator iterator = colecaoGrupoFuncionalidadeOperacao.iterator();
            while (iterator.hasNext()) {
                GrupoFuncionalidadeOperacao grupoFuncionalidadeOperacao = (GrupoFuncionalidadeOperacao) iterator.next();
                grupoFuncionalidadeOperacao.setGrupo(grupo);
                GrupoFuncionalidadeOperacaoPK grupoFuncionalidadeOperacaoPK = new GrupoFuncionalidadeOperacaoPK();
                grupoFuncionalidadeOperacaoPK.setFuncionalidadeId(grupoFuncionalidadeOperacao.getFuncionalidade().getId());
                grupoFuncionalidadeOperacaoPK.setOperacaoId(grupoFuncionalidadeOperacao.getOperacao().getId());
                grupoFuncionalidadeOperacaoPK.setGrupoId(grupoFuncionalidadeOperacao.getGrupo().getId());
                grupoFuncionalidadeOperacao.setComp_id(grupoFuncionalidadeOperacaoPK);
                if (!colecaoGrupoFuncionalidadeOperacaoCadastradas.contains(grupoFuncionalidadeOperacao)) {
                    getControladorUtil().inserir(grupoFuncionalidadeOperacao);
                }
            }
        }

        if (suit < aArrayList.size()) {
            final Equipment eq = aArrayList.get(suit);
            return _writeArmorProperty(eq, property, aPC);
        }

        if ((distance * (numberInterferenceItems + 1) < minLength)) {
            closestNeighbour = neighbourItem;
            minLength = distance * (numberInterferenceItems + 1);
        }

        if (mProxy.getContext().checkCallingOrSelfPermission(permission.WAKE_LOCK) == PackageManager.PERMISSION_GRANTED) {
            mPlayer.setWakeMode(mProxy.getContext(), PowerManager.FULL_WAKE_LOCK);
        }

        if (name.equals("uint8_t")) return false;

        if (number == 0) {
            PrismObject<UserType> jack = getUser(userJackOid);
            assertEquals("wrong new full name", yes ? "new full name 4" : "new full name 3", jack.asObjectable().getFullName().getOrig());
        } else {
            PrismObject<UserType> jack = getUser(userJackOid);
            AssignmentType assignment1 = findAssignmentByTargetRequired(jack, roleRole28Oid);
            assertEquals("wrong new assignment description", yes ? "new description" : "description", assignment1.getDescription());
        }

        if (getLabelFor() != null && getLabelFor() instanceof JTextComponent) {
            if (m_savedMnemonic > 0) ((JTextComponent) getLabelFor()).setFocusAccelerator(m_savedMnemonic);
            else ((JTextComponent) getLabelFor()).setFocusAccelerator('\0');
        }

        if (Platform.isWindows() && "kernel32".equals(this.libraryName.toLowerCase())) {
            synchronized (functions) {
                Function f = new Function(this, "GetLastError", Function.ALT_CONVENTION) {
                    Object invoke(Object[] args, Class returnType, boolean b) {
                        return new Integer(Native.getLastError());
                    }
                };
                functions.put(functionKey("GetLastError", callFlags), f);
            }
        }

        if ((handler != null) && "org.eclipse.ui.internal.MakeHandlersGo".equals(handler.getClass().getName())) {
            return handler.execute(event);
        }

        if (ids.contains(":")) {
            String resolvedId = ((QNameURIHandler) uriHandler).convertQNameToUri(ids);
            URI resolvedURI = URI.createURI(resolvedId);
            URI resourceURI = xmlResource.getURI();
            if (resolvedURI.trimFragment().equals(resourceURI)) ids = resolvedURI.fragment();
        }

        if ((current.getNodeType() == Node.ELEMENT_NODE) && current.getNamespaceURI().equals(Constants.SignatureSpecNS)) {
            res++;
            if (res == i) {
                return (Element) current;
            }
        }

        if (!routerInfo.isValid()) {
            processStoreFailure(key, routerInfo);
            if (_log.shouldLog(Log.WARN))
                _log.warn("Invalid routerInfo signature!  forged router structure!  router = " + routerInfo);
            return "Invalid routerInfo signature";
        }

        if (children.contains(null)) {
            List<String> possibleColumnNames = getReferenceableColumnAliases(ctx);
            String reason = String.format("(possible column names are: %s)", StringUtils.join(possibleColumnNames, ", "));
            ctx.setError(ErrorMsg.INVALID_COLUMN.getMsg(expr.getChild(0), reason), expr);
            return null;
        }

        if (dependant != null) {
            getRegistry(broker).deregister(new URI(dependant));
            recordMissingDependency(xqueryLocation.toString(), XmldbURI.create(dependant));
        }

        if (track.getTrackType() == TrackType.RNAI) {
            if (rendererClass == BarChartRenderer.class) {
                rendererClass = RNAiBarChartRenderer.class;
            }
        }

        if (returnValue instanceof BigDecimal) {
            BigDecimal retVal = (BigDecimal) returnValue;
            Outputter.debug("Database.getValue() found a BigDecimal " + retVal.toString() + " (probably using an Oracle database)", Outputter.DEBUG_TYPES.DATA_ACCESS);
            if (resultColumnClass.equals(Double.class)) {
                Outputter.debugln("Returning double: " + retVal.doubleValue(), Outputter.DEBUG_TYPES.DATA_ACCESS);
                return (T) ((Double) (retVal).doubleValue());
            } else if (resultColumnClass.equals(Integer.class)) {
                Integer i = Integer.parseInt(retVal.toString());
                Outputter.debugln("Returning integer: " + i, Outputter.DEBUG_TYPES.DATA_ACCESS);
                return (T) i;
            } else {
                Outputter.debugln("Haven't hacked what to do if I get a BigDecimal from the database " + "but looking for a: " + resultObject.getTheClass(), Outputter.DEBUG_TYPES.DATA_ACCESS);
            }
        }

        if (EntityUtils.isTuple(entity)) bm.wDef("syntheticRoot", entity);

        if (a instanceof byte[] && b instanceof byte[]) return Arrays.equals((byte[]) a, (byte[]) b);

        if (page != null) {
            ISelection context = DebugUITools.getDebugContextManager().getContextService(page.getWorkbenchWindow()).getActiveContext();
            if (context instanceof IStructuredSelection) {
                IStructuredSelection selection = (IStructuredSelection) context;
                model_element = selection.isEmpty() ? null : selection.getFirstElement();
            }
        }

        if (!"Android-x86".equalsIgnoreCase(Build.BRAND)) {
            int orientation;
            int rotation = ((WindowManager) getActivity().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getRotation();
            switch (rotation) {
                case Surface.ROTATION_0:
                    orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
                    this.deviceOrientation = 0;
                    screen_orientation = "ROTATION_0 SCREEN_ORIENTATION_PORTRAIT";
                    break;
                case Surface.ROTATION_90:
                    this.deviceOrientation = 90;
                    orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
                    screen_orientation = "ROTATION_90 SCREEN_ORIENTATION_LANDSCAPE";
                    break;
                case Surface.ROTATION_180:
                    this.deviceOrientation = 180;
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT;
                    screen_orientation = "ROTATION_180 SCREEN_ORIENTATION_REVERSE_PORTRAIT";
                    break;
                default:
                    this.deviceOrientation = 270;
                    orientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE;
                    screen_orientation = "ROTATION_270 SCREEN_ORIENTATION_REVERSE_LANDSCAPE";
                    break;
            }
            getActivity().setRequestedOrientation(orientation);
        }

        if (controlWidth != SWT.DEFAULT) {
            result.x = controlWidth;
        } else if (controlHeight != SWT.DEFAULT) {
            result.y = controlHeight;
        }

        if (fullTextRangeExpr.getLower() == null && fullTextRangeExpr.getUpper() == null) {
            return new TermRangeQuery(propertyValueExpr.getPropertyPath().asStringPath(), null, null, fullTextRangeExpr.isIncludeLower(), fullTextRangeExpr.isIncludeUpper());
        }

        if (Build.VERSION.SDK_INT == 21) {
            Preferences p = Preferences.get();
            p.setExpertMode(true);
            p.setForceOldIndex(true);
        }

        if (remainingItemPath.startsWith(ParentPathSegment.class) && hqlDataInstance.getParentItem() != null) {
            return new ItemPathResolutionState(remainingItemPath.tail(), hqlDataInstance.getParentItem(), itemPathResolver);
        }

        if (bond.getOrder() == null) break;

        if (sugWord.string == null || word.equals(sugWord.string)) {
            continue;
        }

        if (ctx != null && outfile != null) {
            try {
                triggerMediaScanner(ctx, outfile);
            } catch (Exception ignored) {
                Log.e(DEBUG_TAG, "Toast in asyncExport failed with " + ignored.getMessage());
            } catch (Error ignored) {
                Log.e(DEBUG_TAG, "Toast in asyncExport failed with " + ignored.getMessage());
            }
        }

        if (APPLY_WORKAROUND) {
            initialModel = buildModelWithPhyInfrastructureWorkaround(initialModel);
        }

        if (iter.size() == 0) {
            PlayerObject noneOwned = new PlayerObject();
            noneOwned.info = new BasicInfo("None", "", pos);
            noneOwned.values = new Values();
            noneOwned.values.rosRank = 300;
            noneOwned.values.ecr = 300.0;
            iter.add(noneOwned);
        }

        if (Util.getPortalRequestContext().getPortalOwner().equals(wikiId)) {
            wikiUrlPattern.append("/" + PortalContainer.getCurrentPortalContainerName() + "/").append(wikiId);
        } else {
            wikiUrlPattern.append(wikiId);
        }

        if (config.noCertCheck()) {
            cc.setTrustManagers(new NoVerificationTrustManager());
        }

        if (logic == AND) {
            result = new BitSet();
            ++i;
        } else {
            result = new BitSet(reader.maxDoc());
        }

        if (BehaviorDispenseScrapbox.dispenseScrapboxes) {
            BlockDispenser.DISPENSE_BEHAVIOR_REGISTRY.putObject(ModItems.SCRAP_BOX, new BehaviorDispenseScrapbox());
        }

        if (name.equals("selected")) {
        }

        if (ToolType.HOE.equals(toolType)) {
            if (stack.getItem() instanceof ItemHoe) {
                final ItemHoe itemHoe = (ItemHoe) stack.getItem();
                return getToolLevel(itemHoe.getMaterialName());
            }
        } else if (ToolType.SWORD.equals(toolType)) {
            if (stack.getItem() instanceof ItemSword) {
                final ItemSword itemSword = (ItemSword) stack.getItem();
                return getToolLevel(itemSword.getToolMaterialName());
            }
        } else if (!toolType.hasVariableMaterials()) {
            return 1;
        } else {
            return stack.getItem().getHarvestLevel(stack, toolType.getName(), null, null);
        }

        if (formatArray != null) {
            return new DirectDLI(isSource ? SourceDataLine.class : TargetDataLine.class, formatArray, hardwareFormatArray, 32, AudioSystem.NOT_SPECIFIED);
        }

        if (ts.getLineno() == lineno || (lastExprType == ts.FUNCTION && ts.getLineno() == lastExprEndLine)) {
            wellTerminated(ts, lastExprType);
        }

        if (date1 < date0 || (date1 == date0 && time1 <= time0)) {
            int inc = 1;
            if (i > 1) {
                int j = (v5dHHMMSStoSeconds(TimeStamp[i - 1]) - v5dHHMMSStoSeconds(TimeStamp[i - 2])) + 86400 * (v5dYYDDDtoDays(DateStamp[i - 1]) - v5dYYDDDtoDays(DateStamp[i - 2]));
                if (j > 0) inc = j;
            }
            time1 = time0 + inc;
            date1 = date0;
            if (time1 >= 86400) {
                time1 = 0;
                date1++;
            }
            DateStamp[i] = v5dDaysToYYDDD(date1);
            TimeStamp[i] = v5dSecondsToHHMMSS(time1);
        }

        if (object.isEnabled()) {
            return "Enabled";
        } else {
            return "Disabled";
        }

        if (INITIAL_CLIENT_AREA_WORKAROUND && initialClientArea != null) {
            initialClientArea.width = cachedPrefSize.width;
            initialClientArea.height = cachedPrefSize.height;
        }

        if (isOracleDataStore(dataStore)) {
            name = name.toUpperCase();
        }

        if (!hasSheetOverlays()) {
            SpreadsheetFactory.loadSheetOverlays(this);
        }

        if (loc == Protomech.LOC_TORSO) {
            return "Protomech's Torso cannot be scrapped";
        }

        if (entityId == null || entityId.getNamespaceId().equals(NamespaceId.SYSTEM)) {
            return callable.call();
        }

        if (dirtyFile.getVirtualFile() == null || !changeListManager.isIgnoredFile(dirtyFile.getVirtualFile())) {
            roots.add(dirtyFile);
        }

        if (content != null && content.length() > 1 && content.charAt(0) == 65279) {
            return content.substring(1);
        }

        if ((portAlignment == PortAlignment.DISTRIBUTED || portAlignment == PortAlignment.JUSTIFIED) && nodeContext.portContexts.get(portSide).size() == 1) {
            calculatedPortPlacementWidth = modifiedPortPlacementSize(nodeContext, portAlignment, calculatedPortPlacementWidth);
            portAlignment = PortAlignment.CENTER;
        }

        if (scrappingLimbMode) {
            configuredOptions.setAllowCarryover(false);
        }

        if (current.readAndDispatch()) {
            continue;
        }

        if (wave == Waves.FOURWAVES) {
            if ((me.roadSegmentId() <= 7 && counter < 1500) || (me.roadSegmentId() <= 5 && counter < 3000) || (me.roadSegmentId() <= 2 && counter < 9000)) {
                counter++;
                me.setSpeed(0);
                return 0;
            }
        } else if (wave == Waves.TENWAVES) {
            if ((me.roadSegmentId() <= 8 && counter < 1500) || (me.roadSegmentId() <= 7 && counter < 3000) || (me.roadSegmentId() <= 6 && counter < 4500) || (me.roadSegmentId() <= 5 && counter < 6000) || (me.roadSegmentId() <= 4 && counter < 7500) || (me.roadSegmentId() <= 3 && counter < 9000) || (me.roadSegmentId() <= 2 && counter < 10500)) {
                counter++;
                me.setSpeed(0);
                return 0;
            }
        }

        if (context != null) {
            if (isContextAtWhitespace(viewer, context)) {
                context = getPreviousContext(context);
            }
        }

        if (propDef.getPrimaryMember() != null) {
            java.lang.reflect.Member member = propDef.getPrimaryMember().getMember();
            if (member != null) {
                String altName = member.getName();
                if (altName != null) {
                    final int length = altName.length();
                    for (String prefix : Arrays.asList("get", "is")) {
                        final int offset = prefix.length();
                        if (altName.startsWith(prefix) && length > offset && !Character.isUpperCase(altName.charAt(offset))) {
                            propName = altName;
                            break;
                        }
                    }
                }
            }
        }

        if (treeState.isExpanded(element.getId())) {
            tree.expandPath(path);
            for (int i = 0; i < element.getChildCount(); i++) {
                elements.add((UniqueNode) tree.getModel().getChild(element, i));
            }
        } else {
            tree.collapsePath(path);
        }

        if (repository.getWorkspace().getLocation() == WorkspaceLocation.SERVER && resource instanceof IFile) {
            final TFSFileModificationValidator validator = repositoryProvider.getTFSFileModificationValidator();
            try {
                new ExtensionPointAsyncObjectWaiter().waitUntilTrue(new IAsyncObjectWaiter.Predicate() {
                    @Override
                    public boolean isTrue() {
                        return !validator.isCheckingOutFileInBackground((IFile) resource);
                    }
                });
            } catch (final InterruptedException e) {
                throw new VersionControlException(MessageFormat.format(Messages.getString("TFSMoveDeleteHook.InterruptedWaitingForBackgroundCheckoutFormat"), resource.getName()));
            }
        }

        if (g != null) {
            file = g.getFileName();
        }

        if (firstElement.indexOf("xmlns:xsi") >= 0) {
            return originalXml;
        }

        if (timeAlive == 0 && !world.isRemote) {
            if (isComplete()) canRender = completeStructure = completeStructure(world.getBlockState(pos));
            timeAlive = 0x1;
            checkCanRun();
        }

        if (reader != null) {
            try {
                reader.close();
            } catch (IOException ex) {
                throw new DataStoreException(ex);
            }
        }

        if ((s1 == null) || (s2 == null)) {
            return 0;
        }

        if (size == null) {
            Dimension defaultSize = NeomediaServiceUtils.getMediaServiceImpl().getDeviceConfiguration().getVideoSize();
            width = defaultSize.width;
            height = defaultSize.height;
        } else {
            width = size.width;
            height = size.height;
        }

        if (getMode().contains("auto")) {
            statusMap.put("actualduty", calculatedDuty);
        }

        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            filepath = filepath.replace("/cygdrive/C", "C:");
            filepath = filepath.replace("/C:", "C:");
            filepath = filepath.replace("/", "\\");
        }

        if (special) in_special_map = false;

        if (xDataValue < sliderValue) {
            valueIndex++;
        }

        if ((etype == EncryptedData.ETYPE_DES_CBC_CRC || etype == EncryptedData.ETYPE_DES_CBC_MD5)) {
            for (int i = 0; i < keys.length; i++) {
                ktype = keys[i].getKeyType();
                if (ktype == EncryptedData.ETYPE_DES_CBC_CRC || ktype == EncryptedData.ETYPE_DES_CBC_MD5) {
                    int kv = keys[i].getVersionNumber();
                    etypeFound = true;
                    if (versionMatches(version, kv)) {
                        return new KerberosKey(keys[i].getPrincipal(), keys[i].getEncoded(), etype, kv);
                    } else if (kv > kvno_found) {
                        key_found = new KerberosKey(keys[i].getPrincipal(), keys[i].getEncoded(), etype, kv);
                        kvno_found = kv;
                    }
                }
            }
        }

        if (v instanceof EObjectEList) {
            EObjectEList list = (EObjectEList) v;
            if (list.size() > 0) v = list.get(0);
        }

        if (coverage instanceof MultiResolutionRaster) {
            getTileProviders((MultiResolutionRaster) coverage, tileProviders);
        } else if (coverage instanceof TiledRaster || coverage instanceof SimpleRaster) {
            addTileProvider((AbstractRaster) coverage, tileProviders);
        }

        if (p.isBodyParam) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", "jsonBody[" + p.dataType + "]");
            p.vendorExtensions.put("x-codegen-normalized-input-type", p.dataType);
        } else if (p.isContainer || p.isListContainer) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", toPathParameter(p, "params", false));
            p.vendorExtensions.put("x-codegen-normalized-input-type", p.dataType.replaceAll("^[^\\[]+", "Seq"));
        } else if (p.isQueryParam) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", toPathParameter(p, "param", true));
            p.vendorExtensions.put("x-codegen-normalized-input-type", toInputParameter(p));
        } else if (p.isHeaderParam) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", toPathParameter(p, "header", true));
            p.vendorExtensions.put("x-codegen-normalized-input-type", toInputParameter(p));
        } else if (p.isFile) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", "fileUpload(\"" + p.paramName + "\")");
            p.vendorExtensions.put("x-codegen-normalized-input-type", "FileUpload");
        } else if (p.isPrimitiveType && !p.isPathParam) {
            p.vendorExtensions.put("x-codegen-normalized-path-type", p.dataType.toLowerCase());
            p.vendorExtensions.put("x-codegen-normalized-input-type", toInputParameter(p));
        } else {
            p.vendorExtensions.put("x-codegen-normalized-input-type", p.dataType);
        }

        if (message != null) {
            message = message.replaceAll("<.*?>", "");
        }

        if (mVideoFragment != null && mVideoFragment.getView() != null && mVideoFragment.getView().hasFocus()) {
            if (keyCode == KeyEvent.KEYCODE_BACK || keyCode == KeyEvent.KEYCODE_ESCAPE) {
                if (getVerticalGridView().getChildCount() > 0) {
                    getVerticalGridView().requestFocus();
                    return true;
                }
            }
        }

        if (addSelectionSpinner.getSelectedItemPosition() < numStdModels) {
            mModelNameInput.setText(randomizeName(mNewModelNames.get(addSelectionSpinner.getSelectedItemPosition())));
        } else {
            mModelNameInput.setText(mNewModelNames.get(addSelectionSpinner.getSelectedItemPosition()) + " " + getResources().getString(R.string.model_clone_suffix));
        }

        if (homedir.startsWith("\"") && homedir.endsWith("\"")) {
            homedir = homedir.substring(1, homedir.length() - 2);
        }

        if (row.getBytes(DATA_KEY) == null) {
            long contentId = row.getLong(CONTENT_ID_KEY);
            log.warn("'{}' column empty for row  set_id = {}, content_id = {}, in '{}' column family", DATA_KEY, setId, contentId, EQUIVALENT_CONTENT_TABLE);
            Content content = resolvedContentFromNonEquivalentContentStore(Id.valueOf(contentId));
            updateDataColumn(setId, content);
            return content;
        }

        if (!currentDataChoices.containsKey(dataChoice.getName())) {
            checkboxes.add(null);
            continue;
        }

        if (extras != null && extras.get(SettingsActivity.EXTRA_SHOW_FRAGMENT_ARGUMENTS) != null && extras.get(SettingsActivity.EXTRA_SHOW_FRAGMENT_AS_SHORTCUT) == null) {
            mFilterType = TYPE_EXTERNAL_RESOLUTION;
        }

        if (instanceScope instanceof DeclarationScope) {
            ((DeclarationScope) instanceScope).setIsInstanceScope(true);
        }

        if (task.getStatus() == DriverTask.TaskStatus.READY) {
            for (VolumeSnapshot driverSnapshot : driverSnapshotToSnapshotMap.keySet()) {
                BlockSnapshot snapshot = driverSnapshotToSnapshotMap.get(driverSnapshot);
                snapshot.setNativeId(driverSnapshot.getNativeId());
                snapshot.setDeviceLabel(driverSnapshot.getDeviceLabel());
                snapshot.setNativeGuid(NativeGUIDGenerator.generateNativeGuid(storageSystem, snapshot));
                snapshot.setIsSyncActive(true);
                snapshot.setReplicationGroupInstance(driverSnapshot.getConsistencyGroup());
                if (driverSnapshot.getProvisionedCapacity() > 0) {
                    snapshot.setProvisionedCapacity(driverSnapshot.getProvisionedCapacity());
                }
                if (driverSnapshot.getAllocatedCapacity() > 0) {
                    snapshot.setAllocatedCapacity(driverSnapshot.getAllocatedCapacity());
                }
            }
            dbClient.updateObject(driverSnapshotToSnapshotMap.values());
            String msg = String.format("createGroupSnapshots -- Created snapshots: %s .", task.getMessage());
            _log.info(msg);
            taskCompleter.ready(dbClient);
        } else {
            for (BlockSnapshot snapshot : snapshots) {
                snapshot.setInactive(true);
            }
            dbClient.updateObject(snapshots);
            String errorMsg = String.format("doCreateSnapshot -- Failed to create snapshots: %s .", task.getMessage());
            _log.error(errorMsg);
            ServiceError serviceError = ExternalDeviceException.errors.createSnapshotsFailed("doCreateSnapshot", errorMsg);
            taskCompleter.error(dbClient, serviceError);
        }

        if (decrypt && dict != null && !jv.isNull()) {
            decrypted = decrypt(jv);
        }

        if (NestedPathUtil.isPath(column.getQualifiedName())) {
            return (getColumn(column.getQualifiedName()) != null);
        }

        if (scriptMode != null) {
            throw unsupportedFeature("SCRIPT");
        }

        if (executionResult.isSuccess() && !this.skipProguard) {
            return StepExecutionResult.of(ensureAllOutputsExist(context));
        }

        if (dataValue > 0 && dataValue < 6) {
            skullStanding = dataValue;
            if (tileData.containsKey("Rot")) {
                int skullRotId = (int) ((ByteTag) tileData.get("Rot")).getValue();
                if (skullRotationList.containsKey(skullStanding)) {
                    skullRotation = skullRotationList.get(skullRotId);
                } else {
                    skullRotation = skullRotationList.get(0);
                }
            } else {
                skullRotation = skullRotationList.get(0);
            }
        } else {
            skullStanding = 2;
            if (tileData.containsKey("Rot")) {
                int skullRotId = ((IntTag) tileData.get("Rot")).getValue();
                if (skullRotationList.containsKey(skullStanding)) {
                    skullRotation = skullRotationList.get(skullRotId);
                } else {
                    skullRotation = skullRotationList.get(0);
                }
            } else {
                skullRotation = skullRotationList.get(0);
            }
        }

        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.text_view_name_in_list);
            viewHolder.address = (TextView) convertView.findViewById(R.id.text_view_address_in_list);
            viewHolder.snippet = (TextView) convertView.findViewById(R.id.text_view_description_snippet_in_list);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.image_view_in_list);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        if (date.length() == 5) date = "0" + date;

        if (elem == -1 && def instanceof PsiParameter) {
            elem = 0;
        }

        if (searchField == null) return;

        if (logger.isDebugEnabled()) {
            logger.debug("merged account=" + JaxbUtils.toString(to, AccountsCommon.class));
        }

        if (entries == null || entries.isEmpty()) {
            errors.add(name);
            continue;
        }

        if (controlPanel.getRbSize().isSelected()) {
            double rel = (widthMts / heightMts);
            if (obj != null && obj.equals(controlPanel.getTWidth().getDataInputField()) && !controlPanel.getTWidth().getValue().equals("")) {
                this.widthInPixels = this.getCorrectMeasure(controlPanel.getTWidth().getValue());
                this.heightInPixels = (int) Math.floor(this.widthInPixels / rel);
                if (controlPanel.getProjection().isProjected())
                    calcScaleMtsPixel(this.widthInPixels, this.heightInPixels, resolution);
            }
            if (obj != null && obj.equals(controlPanel.getTHeight().getDataInputField()) && !controlPanel.getTHeight().getValue().equals("")) {
                this.heightInPixels = this.getCorrectMeasure(controlPanel.getTHeight().getValue());
                this.widthInPixels = (int) Math.ceil(this.heightInPixels * rel);
                if (controlPanel.getProjection().isProjected())
                    calcScaleMtsPixel(this.widthInPixels, this.heightInPixels, resolution);
            }
            if (obj != null && obj.equals(controlPanel.getCbMeasureType())) {
                if (controlPanel.getProjection().isProjected())
                    calcScaleMtsPixel(this.widthInPixels, this.heightInPixels, resolution);
            }
        }

        if (serviceName == null) {
            for (ComponentReferenceModel reference : config.getReferences()) {
                for (ClientProxyBean proxyBean : _beanDeploymentMetaData.getClientProxies()) {
                    if (reference.getQName().getLocalPart().equals(proxyBean.getServiceName())) {
                        QName refName = ComponentNames.qualify(config.getQName(), reference.getQName());
                        proxyBean.setService(getServiceDomain().getServiceReference(refName));
                    }
                }
                for (ReferenceInvokerBean invokerBean : _beanDeploymentMetaData.getReferenceInvokers()) {
                    if (reference.getQName().getLocalPart().equals(invokerBean.getServiceName())) {
                        QName refName = ComponentNames.qualify(config.getQName(), reference.getQName());
                        invokerBean.setReference(getServiceDomain().getServiceReference(refName));
                    }
                }
            }
            return null;
        }

        if (showLibrariesSelectorGroup) {
            appEngineLibrariesSelectorGroup = new LibrarySelectorGroup(container, CloudLibraries.APP_ENGINE_GROUP, Messages.getString("app.engine.libraries.group"));
        }

        if (filesize >= VIEW_FILESIZELIMIT) {
            directlink = "http://imgur.com/download/" + imgUID;
            directlink = jd.plugins.hoster.ImgUrCom.getBigFileDownloadlink(dl);
        } else {
            directlink = "http://i.imgur.com/" + imgUID + ext;
        }

        if (searchResult[1] != null) {
            solrSearchResult.setDataverseAlias((String) searchResult[1]);
        }

        if (IS_WINDOWS && deploymentKey.charAt(0) == '/') {
            deploymentKey = deploymentKey.substring(1);
        }

        if (!(saplingBlock.getBlock() instanceof BlockSapling)) {
            Logger.debug("Could not get sapling meta from non-sapling BlockState (%s).", saplingBlock.getBlock().getLocalizedName());
            return;
        }

        if (!entityLoc.getWorld().equals(world)) {
            Log.debug("Found an entity which reports to be in a different world than the chunk we got it from:");
            Log.debug("Location=" + location + ", Chunk=" + chunk + ", ChunkWorld=" + chunk.getWorld() + ", entityType=" + entity.getType() + ", entityLocation=" + entityLoc);
            continue;
        }

        if (object instanceof CaptureTheFlagFlag) {
            if (droppables == null) {
                droppables = new ArrayList<Item>();
            }
            droppables.add((Item) object);
        }

        if (p.getCompartment() != Organelle.CYTOPLASM)
            sb.append(" [").append(p.getCompartment().getAbbreviation()).append("]");

        if (!EntityUtils.isNull(parentEntity)) return parentEntity;

        if (adapter == Integer.class) {
            return fExpressionContext;
        }

        if (System.getProperty("os.name").contains("Windows")) {
            environment.put("CLOUDSDK_APP_NUM_FILE_UPLOAD_PROCESSES", "1");
        }

        if (request.getRenderingMode() != null) {
            List<ReportDesign> rdList = rs.getReportDesigns(rd, request.getRenderingMode().getRenderer().getClass(), false);
            if (rdList != null) {
                for (ReportDesign d : rdList) {
                    for (ReportProcessorConfiguration rpc : d.getReportProcessors()) {
                        for (int i = 0; i < modes.length; i++) {
                            ReportProcessorConfiguration.ProcessorMode mode = modes[i];
                            if (mode.equals(rpc.getProcessorMode())) {
                                log.debug("runReport matched request renderingMode to reportDesign.rendererType on " + request.getRenderingMode().getRenderer().getClass());
                                processors.add(rpc);
                                break;
                            }
                        }
                    }
                }
            }
        }

        if (getURI().equals("http://www.w3.org/2004/02/skos/core#altLabel") || getURI().equals("http://www.w3.org/2004/02/skos/core#prefLabel") || getURI().equals("http://www.w3.org/2004/02/skos/core#hiddenLabel")) {
            OWLProperty label = getOntology().getProperty("http://www.w3.org/2000/01/rdf-schema#label");
            if (!superProperties.contains(label)) {
                superProperties.add(label);
            }
        }

        if (isAjaxRequest(request)) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }

        if (!other.mind.wouldSwitchTo(copy)) return;

        if (workList.isEmpty()) {
            if (log.isTraceEnabled()) {
                StringWriter stackTraceStringWriter = new StringWriter();
                PrintWriter stackTracePrintWriter = new PrintWriter(stackTraceStringWriter);
                new Throwable().printStackTrace(stackTracePrintWriter);
                log.workListShouldNeverBeEmpty(stackTraceStringWriter.toString());
            }
            return;
        }

        if ("1.0.0".equals(describeFeatureType.getVersion())) describeFeatureType.setOutputFormat("XMLSCHEMA");

        if (Utility.containsAny(request.getRequestURI(), cacheURLs)) {
            try {
                super.doFilter(request, response, chain);
            } catch (Exception e) {
                throw new ServletException(e);
            }
        } else {
            chain.doFilter(request, response);
        }

        if (hHint != SWT.DEFAULT) {
            if ((style & SWT.READ_ONLY) != 0 || hHint < height) height = hHint;
        }

        if (steps.size() == 0 && libraries.size() > 0) {
            try {
                Input library = libraries.get(0);
                if (library.getKind() == INPUT_STREAM) {
                    InputStream libraryInputStream = library.getInputStream();
                    FileOutputStream fileOutputStream = null;
                    try {
                        File tempLibrary = createTempFile("calabashLibrary", null);
                        tempLibrary.deleteOnExit();
                        fileOutputStream = new FileOutputStream(tempLibrary);
                        fileOutputStream.getChannel().transferFrom(newChannel(libraryInputStream), 0, MAX_VALUE);
                        libraries.set(0, new Input(tempLibrary.toURI().toASCIIString()));
                    } finally {
                        Closer.close(fileOutputStream);
                        libraryInputStream.close();
                    }
                }
                XLibrary xLibrary = runtime.loadLibrary(libraries.get(0));
                curStep.setName(xLibrary.getFirstPipelineType().getClarkName());
                curStep.checkArgs();
                steps.add(curStep);
            } catch (SaxonApiException sae) {
                throw new XProcException(sae);
            }
        }

        if (isPassableWorkaround(access, x, y, z, minX - x, minY - y, minZ - z, node, maxX - minX, maxY - minY, maxZ - minZ, 1.0)) {
            if ((flags & F_GROUND_HEIGHT) == 0 || getGroundMinHeight(access, x, y, z, node, flags) > maxY - y) {
                return AlmostBoolean.MAYBE;
            }
        }

        if (order == null) {
            Context ctx = getActivity().getApplicationContext();
            if (ctx == null) {
                Log.e(DEBUG_TAG, "Context is NULL");
            }
            order = BookSortOrder.valueOf(getSettingsHelper().getBookSortOrderString());
        }

        if (event.equals("unmodified") || (event.equals("keyCommand") && ve.getArgument(0).equals("\"unmodified\""))) {
            VimPlugin plugin = VimPlugin.getDefault();
            VimConnection vc = ve.getConnection();
            VimServer server = vc != null ? plugin.getVimserver(vc.getVimID()) : null;
            if (server != null) {
                for (VimEditor editor : server.getEditors()) {
                    if (editor != null && editor.getBufferID() == ve.getBufferID()) {
                        editor.setDirty(false);
                    }
                }
            }
        }

        if (ibr.getRequest().getURL().getFile().matches("(?i)/\\?op=captcha&id=[a-z0-9]{12}")) {
            try {
                final Form captcha = br.getForm(0);
                final String recaptchaV2Response = new CaptchaHelperHostPluginRecaptchaV2(this, br).getToken();
                captcha.put("g-recaptcha-response", Encoding.urlEncode(recaptchaV2Response));
                submitForm(captcha);
                return;
            } catch (final Exception e) {
                boolean isCaptcha;
                if (e instanceof PluginException && ((PluginException) e).getLinkStatus() == LinkStatus.ERROR_CAPTCHA) {
                    isCaptcha = true;
                } else if (e instanceof SkipException || e instanceof CaptchaException) {
                    isCaptcha = true;
                } else {
                    isCaptcha = false;
                }
                if (isCaptcha && accountType != null) {
                    throw new AccountInvalidException(e, "'imNotARobot' captcha was not answered");
                } else {
                    throw e;
                }
            }
        }

        if ((style & SWT.CHECK) != 0 && check) {
            OS.g_object_set(pixbufRenderer, OS.mode, GTK.GTK_CELL_RENDERER_MODE_ACTIVATABLE, 0);
        }

        if (type instanceof VirtualBaseType) {
            if (type.getName().equals("ArgumentsType") && existingMember.getName().equals("callee")) {
                if (!jsVariantHelper.isUnrestrictedMode(context)) {
                    return new RestrictedUsageDescription(description, jsVariantHelper.variantMode(context));
                }
            }
        }

        if (OS.VERSION_MMB < OS.VERSION_MMB(10, 9, 0)) {
            NSCell cell = ((NSControl) this.view).cell();
            if (cell != null && cell.controlSize() == OS.NSRegularControlSize) {
                if ((style & (SWT.PUSH | SWT.TOGGLE)) != 0 && (style & (SWT.FLAT | SWT.WRAP)) == 0) {
                    rect.y += EXTRA_HEIGHT / 2;
                    rect.height += EXTRA_HEIGHT;
                }
            }
        }

    }

}
